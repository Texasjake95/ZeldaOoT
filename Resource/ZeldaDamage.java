package texasjake95.ZeldaOoT.Resource;

import net.minecraft.src.*;
import texasjake95.ZeldaOoT.EntityZeldaArrow;


public class ZeldaDamage
{
    public static ZeldaDamage inFire = (new ZeldaDamage("inFire")).setFireDamage();
    public static ZeldaDamage onFire = (new ZeldaDamage("onFire")).setDamageBypassesArmor().setFireDamage();
    public static ZeldaDamage lava = (new ZeldaDamage("lava")).setFireDamage();
    public static ZeldaDamage inWall = (new ZeldaDamage("inWall")).setDamageBypassesArmor();
    public static ZeldaDamage drown = (new ZeldaDamage("drown")).setDamageBypassesArmor();
    public static ZeldaDamage starve = (new ZeldaDamage("starve")).setDamageBypassesArmor();
    public static ZeldaDamage cactus = new ZeldaDamage("cactus");
    public static ZeldaDamage fall = (new ZeldaDamage("fall")).setDamageBypassesArmor();
    public static ZeldaDamage outOfWorld = (new ZeldaDamage("outOfWorld")).setDamageBypassesArmor().setDamageAllowedInCreativeMode();
    public static ZeldaDamage generic = (new ZeldaDamage("generic")).setDamageBypassesArmor();
    public static ZeldaDamage explosion = new ZeldaDamage("explosion");
    public static ZeldaDamage magic = (new ZeldaDamage("magic")).setDamageBypassesArmor();

    /** This kind of damage can be blocked or not. */
    private boolean isUnblockable = false;
    private boolean isDamageAllowedInCreativeMode = false;
    private float hungerDamage = 0.3F;

    /** This kind of damage is based on fire or not. */
    private boolean fireDamage;

    /** This kind of damage is based on a projectile or not. */
    private boolean projectile;
    public String damageType;

    public static DamageSource causeMobDamage(EntityLiving par0EntityLiving)
    {
        return new EntityDamageSource("mob", par0EntityLiving);
    }

    /**
     * returns an EntityDamageSource of type player
     */
    public static DamageSource causePlayerDamage(EntityPlayer par0EntityPlayer)
    {
        return new EntityDamageSource("player", par0EntityPlayer);
    }

    /**
     * returns EntityDamageSourceIndirect of an arrow
     */
    public static DamageSource ArrowDamage(EntityZeldaArrow zeldaArrow, Entity par1Entity)
    {
        return (new EntityDamageSourceIndirect("arrow", zeldaArrow, par1Entity)).setProjectile();
    }

    /**
     * returns EntityDamageSourceIndirect of a fireball
     */
   
    public static DamageSource causeThrownDamage(Entity par0Entity, Entity par1Entity)
    {
        return (new EntityDamageSourceIndirect("thrown", par0Entity, par1Entity)).setProjectile();
    }

 

    /**
     * Returns true if the damage is projectile based.
     */
    public boolean isProjectile()
    {
        return this.projectile;
    }

    /**
     * Define the damage type as projectile based.
     */
    public ZeldaDamage setProjectile()
    {
        this.projectile = true;
        return this;
    }

    public boolean isUnblockable()
    {
        return this.isUnblockable;
    }

    /**
     * How much satiate(food) is consumed by this DamageSource
     */
    public float getHungerDamage()
    {
        return this.hungerDamage;
    }

    public boolean canHarmInCreative()
    {
        return this.isDamageAllowedInCreativeMode;
    }

    protected ZeldaDamage(String par1Str)
    {
        this.damageType = par1Str;
    }

    public Entity getSourceOfDamage()
    {
        return this.getEntity();
    }

    public Entity getEntity()
    {
        return null;
    }

    protected ZeldaDamage setDamageBypassesArmor()
    {
        this.isUnblockable = true;
        this.hungerDamage = 0.0F;
        return this;
    }

    protected ZeldaDamage setDamageAllowedInCreativeMode()
    {
        this.isDamageAllowedInCreativeMode = true;
        return this;
    }

    /**
     * Define the damage type as fire based.
     */
    protected ZeldaDamage setFireDamage()
    {
        this.fireDamage = true;
        return this;
    }

    /**
     * Returns true if the damage is fire based.
     */
    public boolean fireDamage()
    {
        return this.fireDamage;
    }

    /**
     * Return the name of damage type.
     */
    public String getDamageType()
    {
        return this.damageType;
    }
}
