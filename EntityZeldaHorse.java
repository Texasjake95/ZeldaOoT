package net.minecraft.src.ZeldaOoT;

import net.minecraft.client.Minecraft;
import net.minecraft.src.Block;
import net.minecraft.src.EntityAIFollowParent;
import net.minecraft.src.EntityAILookIdle;
import net.minecraft.src.EntityAIMate;
import net.minecraft.src.EntityAIPanic;
import net.minecraft.src.EntityAISwimming;
import net.minecraft.src.EntityAITempt;
import net.minecraft.src.EntityAIWander;
import net.minecraft.src.EntityAIWatchClosest;
import net.minecraft.src.EntityAnimal;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.Item;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModLoader;
import net.minecraft.src.MovementInput;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityZeldaHorse extends EntityAnimal
{MovementInput movementInput; //how we will receive input from the player to initialize sprinting.
int sprintToggleTimer; //also part of the sprinting code
int jumpTicks; // part of jumping code
double speedBonus; //multiplies the player movement input to make the mount move faster
public float var2 = 0.25F;
    public EntityZeldaHorse(World par1World)
    {
        super(par1World);
        this.texture = "/ZeldaOoT/Resources/Entities/Horse.png";
        this.setSize(0.9F, 1.5F);
        this.getNavigator().setAvoidsWater(true);
        this.preventEntitySpawning = true;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(2, new EntityAIMate(this, var2));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));
        this.tasks.addTask(5, new EntityAIWander(this, var2));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        
        sprintToggleTimer = 0;
        speedBonus = 10;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 10;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setBoolean("Saddle", this.getSaddled());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.setSaddled(par1NBTTagCompound.getBoolean("Saddle"));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "entity.horseWhinny";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "entity.horseWhinny";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "entity.horseWhinny";
    }
    public double getMountedYOffset()
    {
        return (double)this.height - .5D;
    }
    public void updateRiderPosition()
    {
        if (this.riddenByEntity != null)
        {
            double var1 = Math.cos((double)this.rotationYaw * Math.PI / 180.0D) * 0.4D;
            double var3 = Math.sin((double)this.rotationYaw * Math.PI / 180.0D) * 0.4D;
            this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ);
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        if (super.interact(par1EntityPlayer))
        {
            return true;
        }
        else if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == par1EntityPlayer))
        {
            par1EntityPlayer.mountEntity(this);
            
            return true;
        }
        else
        {
            return false;
        }
    }


    /**
     * Returns true if the pig is saddled.
     */
    public boolean getSaddled()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }
    
    public void onLivingUpdate(){
        super.onLivingUpdate();
        if (sprintToggleTimer > 0){ //used to determine if sprinting should be activated.
         sprintToggleTimer--;
        }
        if (jumpTicks > 0) //used to limit how long the mount will rise while jumping
               {
                       jumpTicks--;
               }

        if (riddenByEntity != null){
         //stops up-and-down head movement
         rotationPitch = 0;
       
         //Control where the horse is facing (doesn't work while standing still)
         EntityPlayer entityRider = (EntityPlayer)riddenByEntity;
  rotationYaw = prevRotationYaw = entityRider.rotationYaw;
        }
       }

public void moveEntity(double d, double d1, double d2)
       {
               if(riddenByEntity != null)
               {this.tasks.addTask(5, new EntityAIWander(this, 0));
                 /**initiate sprinting while ridden via keybind.
                  * Basically, if the player has tapped once, it begins the timer which counts down
                  * from seven, slightly less than a quarter second in realtime. If the player taps
                  * forward before the countdown, sprinting is initiated*/
                 boolean flag = ((EntityPlayerSP)riddenByEntity).movementInput.moveForward >= 0.8F;
                 
                 boolean flag1 = ((EntityPlayerSP)riddenByEntity).movementInput.moveForward >= 0.8F;
               
                 if (onGround && flag1 && !isSprinting() && !isInWeb) //if forward is tapped...
                        {
                                if (sprintToggleTimer == 1) //... if it is tapped after the countdown reach zero...
                                {
                                        sprintToggleTimer = 7; //... reset...
                                }
                                else //... But if forward is hit before the end of the countdown...
                                {
                                        this.setSprinting(true); //... sprint!
                                        sprintToggleTimer = 0;
                                }
                        }
               
                 //Adjust for ice. Ice caused a rapid acceleration so I had to slow the mount while on it.
                 int j = worldObj.getBlockId(MathHelper.floor_double(posX), MathHelper.floor_double(boundingBox.minY) - 1, MathHelper.floor_double(posZ));
                 float f = 1;
                 if (j == Block.ice.blockID){
                  f = Block.blocksList[j].slipperiness * 0.3F;
                 }
               
                 //Initiate jumping while ridden via keybind
                 if(((EntityPlayerSP)riddenByEntity).movementInput.jump){ //hijacking the preset 'jump' input.
                  jump(true); //this method is seen overridden in here
                 }
               
                 //Determine movement and speed
                 if (this.isSprinting() && onGround){ //if sprinting on the ground
                                motionX += riddenByEntity.motionX * speedBonus * f;
                                motionZ += riddenByEntity.motionZ * speedBonus * f;
                 }
                 else if(this.isSprinting()){ //if jumping while sprinting
                  motionX += riddenByEntity.motionX * 3D;
                                motionZ += riddenByEntity.motionZ * 3D;
                 }
                 else if(onGround && !onIce() || isInWeb) {
                	 			isInWeb = false;
                                motionX += riddenByEntity.motionX * 7D * f;
                                motionZ += riddenByEntity.motionZ * 7D * f;
                 } else { //jumping while walking normally
                                motionX += riddenByEntity.motionX;
                                motionZ += riddenByEntity.motionZ;
                 }
               
                 //Cancel sprinting I don't -think- the check for being in water or web is necessary, but its logical.
                        if (this.isSprinting() && (((EntityPlayerSP)riddenByEntity).movementInput.moveForward < 0.8F) || inWater || isInWeb){
                         setSprinting(false);
                        }
               
                        //Autojump
                 if(isCollidedHorizontally)
                        {
                         jump(false);
                        }
               
                 //Submit!
                        super.moveEntity(motionX, motionY, motionZ);
               }
               else super.moveEntity(d, d1, d2);
       }
 
       public void updateRidden()
       {
          if (ridingEntity.isDead)
          {
                  ridingEntity = null;
                  return;
          }
          motionX = 0.0D;
          motionY = 0.0D;
          motionZ = 0.0D;
          onUpdate();
          if (ridingEntity == null)
          {
                  return;
          }
       }
public void jump(Boolean flag){ //boolean. true = 2.5-high jump. false = normal jump.
        if (onGround && jumpTicks == 0){
         super.jump();
         if (flag){
          motionY += 0.2; //makes mount jump higher. Do not use big values!
         }
         jumpTicks = 10;
        }
       }

protected boolean onIce(){ //just a check.
 int i = MathHelper.floor_double(posX);
               int j = MathHelper.floor_double(posY);
               int k = MathHelper.floor_double(posZ);
         
               if (worldObj.getBlockId(i, j, k) == Block.ice.blockID){
                return true;
               }
               return false;
}


    /**
     * Set or remove the saddle of the pig.
     */
    public void setSaddled(boolean par1)
    {
        if (par1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
        }
    }

	@Override
	public EntityAnimal spawnBabyAnimal(EntityAnimal var1) {
		
		return null;
	}

}
