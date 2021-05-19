import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("h")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("c")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("o")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		longValue = -9193432977542192121L
	)
	static long field1486;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1134946214"
	)
	static final void method2542(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 63
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 64
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 65
					Tiles.field1090[0][var5][var4] = 127; // L: 66
					if (var0 == var5 && var5 > 0) { // L: 67
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 68
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 69
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 70
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 74

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1955007405"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 3006
		PrivateChatMode.method5815(); // L: 3008
		class44.method494(); // L: 3009
		KitDefinition.KitDefinition_cached.clear(); // L: 3011
		class32.method365(); // L: 3013
		JagexCache.method2538(); // L: 3014
		ItemComposition.ItemDefinition_cached.clear(); // L: 3016
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 3017
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 3018
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3021
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3022
		UserComparator8.method2447(); // L: 3024
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 3026
		class169.method3493(); // L: 3028
		class7.field60.method6309(); // L: 3029
		ModeWhere.HitSplatDefinition_cachedSprites.method6309(); // L: 3030
		ScriptFrame.method1162(); // L: 3031
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 3033
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 3034
		StructComposition.StructDefinition_cached.clear(); // L: 3037
		UrlRequester.method2422(); // L: 3039
		class12.method202(); // L: 3040
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 3042
		HealthBarUpdate.method2200(); // L: 3044
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3045
		Script.Script_cached.clear(); // L: 3046
		MilliClock.archive0.clearFiles(); // L: 3047
		class0.archive1.clearFiles(); // L: 3048
		EnumComposition.archive3.clearFiles(); // L: 3049
		class14.archive4.clearFiles(); // L: 3050
		WorldMapSection0.archive5.clearFiles(); // L: 3051
		class29.archive6.clearFiles(); // L: 3052
		class260.archive7.clearFiles(); // L: 3053
		class43.archive8.clearFiles(); // L: 3054
		GameBuild.archive9.clearFiles(); // L: 3055
		PendingSpawn.archive10.clearFiles(); // L: 3056
		KeyHandler.archive11.clearFiles(); // L: 3057
		class22.archive12.clearFiles(); // L: 3058
		class5.scene.clear(); // L: 3060

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3061
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 3062
		class390.method6744(2); // L: 3063
		Client.currentTrackGroupId = -1; // L: 3064
		Client.field866 = false; // L: 3065

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 3067
			if (var1.stream1 != null) { // L: 3068
				FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var1.stream1); // L: 3069
				var1.stream1 = null; // L: 3070
			}

			if (var1.stream2 != null) { // L: 3072
				FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var1.stream2); // L: 3073
				var1.stream2 = null; // L: 3074
			}
		}

		ObjectSound.objectSounds.clear(); // L: 3077
		Client.updateGameState(10); // L: 3079
	} // L: 3080
}
