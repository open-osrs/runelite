import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("x")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -1451292815
	)
	@Export("baseX")
	static int baseX;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1836628976"
	)
	public static byte[] method2035(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "342853228"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2950
		EnumComposition.method3400(); // L: 2952
		VarcInt.method3321(); // L: 2953
		PcmPlayer.method757(); // L: 2954
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2956
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2957
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2958
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2959
		NPCComposition.NpcDefinition_cached.clear(); // L: 2962
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2963
		class92.method2370(); // L: 2965
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2967
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2968
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2969
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2972
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2973
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2976
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2979
		Login.HitSplatDefinition_cachedSprites.method7382(); // L: 2981
		class221.HitSplatDefinition_cached.method7382(); // L: 2982
		SoundSystem.method780(); // L: 2983
		class175.method3379(); // L: 2984
		class250.method4933(); // L: 2985
		ParamComposition.ParamDefinition_cached.clear(); // L: 2987
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2990
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2993
		Widget.Widget_cachedSprites.clear(); // L: 2996
		Widget.Widget_cachedModels.clear(); // L: 2997
		Widget.Widget_cachedFonts.clear(); // L: 2998
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2999
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3001
		Script.Script_cached.clear(); // L: 3002
		NetSocket.archive0.clearFiles(); // L: 3003
		Clock.archive1.clearFiles(); // L: 3004
		class194.archive3.clearFiles(); // L: 3005
		MouseHandler.archive4.clearFiles(); // L: 3006
		Message.archive5.clearFiles(); // L: 3007
		AbstractUserComparator.archive6.clearFiles(); // L: 3008
		InterfaceParent.archive7.clearFiles(); // L: 3009
		class305.archive8.clearFiles(); // L: 3010
		TileItem.archive9.clearFiles(); // L: 3011
		ObjectSound.archive10.clearFiles(); // L: 3012
		UrlRequest.archive11.clearFiles(); // L: 3013
		class115.archive12.clearFiles(); // L: 3014
		class175.scene.clear(); // L: 3016

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3017
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 3018
		UrlRequester.method2538(2); // L: 3019
		Client.currentTrackGroupId = -1; // L: 3020
		Client.playingJingle = false; // L: 3021
		Varcs.method2466(); // L: 3022
		PendingSpawn.updateGameState(10); // L: 3023
	} // L: 3024
}
