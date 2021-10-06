import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class29 {
	@ObfuscatedName("l")
	static Applet field168;
	@ObfuscatedName("q")
	static String field165;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static GameBuild field171;

	static {
		field168 = null;
		field165 = "";
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1657881975"
	)
	static final void method430(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != WorldMapDecorationType.clientPreferences.musicVolume) {
			if (WorldMapDecorationType.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				class67.method1886(Tiles.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field663 = false;
			} else if (var0 == 0) {
				class247.midiPcmStream.clear();
				class247.musicPlayerStatus = 1;
				class113.musicTrackArchive = null;
				Client.field663 = false;
			} else {
				class4.method19(var0);
			}

			WorldMapDecorationType.clientPreferences.musicVolume = var0;
			ScriptFrame.savePreferences();
		}

	}
}
