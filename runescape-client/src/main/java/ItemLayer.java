import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1955718833
	)
	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 616317407
	)
	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1784777855
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -3789512817442359409L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1666880433
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "13756"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class145.method3085(var0, 10, var1) : Integer.toString(var0); // L: 105 106
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "17826065"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2854
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2857
		MouseRecorder.method2098(); // L: 2859
		class193.method3884(); // L: 2860
		HealthBarDefinition.method3466(); // L: 2861
		NPCComposition.NpcDefinition_cached.clear(); // L: 2863
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 2864
		ItemComposition.ItemDefinition_cached.clear(); // L: 2867
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 2868
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 2869
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2872
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2873
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2874
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2877
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2878
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2881
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2884
		ReflectionCheck.HitSplatDefinition_cachedSprites.method7541(); // L: 2886
		DirectByteArrayCopier.HitSplatDefinition_cached.method7541(); // L: 2887
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2889
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2890
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 2891
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2894
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2895
		StructComposition.StructDefinition_cached.clear(); // L: 2898
		ParamComposition.ParamDefinition_cached.clear(); // L: 2901
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2904
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2907
		Widget.Widget_cachedSprites.clear(); // L: 2910
		Widget.Widget_cachedModels.clear(); // L: 2911
		Widget.Widget_cachedFonts.clear(); // L: 2912
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2913
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2915
		Script.Script_cached.clear(); // L: 2916
		KeyHandler.archive0.clearFiles(); // L: 2917
		UserComparator8.archive1.clearFiles(); // L: 2918
		BufferedNetSocket.archive3.clearFiles(); // L: 2919
		class182.archive4.clearFiles(); // L: 2920
		Players.archive5.clearFiles(); // L: 2921
		class16.archive6.clearFiles(); // L: 2922
		LoginScreenAnimation.archive7.clearFiles(); // L: 2923
		class145.archive8.clearFiles(); // L: 2924
		WorldMapDecorationType.archive9.clearFiles(); // L: 2925
		JagexCache.archive10.clearFiles(); // L: 2926
		Message.archive11.clearFiles(); // L: 2927
		class152.archive12.clearFiles(); // L: 2928
		ArchiveLoader.scene.clear(); // L: 2930

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2931
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2932
		Actor.method2183(2); // L: 2933
		Client.currentTrackGroupId = -1; // L: 2934
		Client.field746 = false; // L: 2935
		ClientPreferences.method2259(); // L: 2936
		Decimator.updateGameState(10); // L: 2937
	} // L: 2938
}
