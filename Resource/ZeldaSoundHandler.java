package texasjake95.ZeldaOoT.Resource;

import net.minecraft.src.SoundManager;
import net.minecraft.src.forge.*;
import net.minecraft.src.forge.adaptors.*;


public class ZeldaSoundHandler extends SoundHandlerAdaptor implements ISoundHandler
{
	
	public void onSetupAudio(SoundManager soundManager){
		
	}

	public void onLoadSoundSettings(SoundManager soundManager) {
		String [] soundFiles = {
				"Ocarina/Suns_Song.wav",
				"Ocarina/Song_of_Storms.wav",
				"Ocarina/Song_of_Healing.wav",
				"Ocarina/Epona_Song.wav",
				"entity/horseWhinny.wav",
				"entity/horseWhinny2.wav",
				"entity/horseWhinny3.wav"};
		for (int i = 0; i < soundFiles.length; i++){
			soundManager.getSoundsPool().addSound(soundFiles[i], this.getClass().getResource("/ZeldaOoT/Resources/sound/" + soundFiles[i]));
		}
	}

}