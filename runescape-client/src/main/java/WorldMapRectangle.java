import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("as")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 841729037
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 618067361
	)
	@Export("height")
	int height;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1268324115
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 235337233
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "470419605"
	)
	static int method331(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PlayerComposition.field2561 : VarcInt.field3264; // L: 1124
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1125
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var3)); // L: 1126
			return 1; // L: 1127
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1129
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1136
				if (var3.dataText == null) { // L: 1137
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1138
				}

				return 1; // L: 1139
			} else {
				return 2; // L: 1141
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1130
			--var4; // L: 1131
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1132
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1133
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1134
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-738122321"
	)
	static int method334(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 45

		for (int var4 = var1; var4 < var2; ++var4) { // L: 46
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 47
		}

		var3 = ~var3; // L: 49
		return var3; // L: 50
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1843949362"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2860
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2863
		MusicPatchPcmStream.method3953(); // L: 2865
		UserComparator2.method5959(); // L: 2866
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2868
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2869
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2870
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2871
		WorldMapIcon_1.method339(); // L: 2873
		TileItem.method2187(); // L: 2874
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2876
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2877
		WallDecoration.method3379(); // L: 2879
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2881
		WorldMapID.method601(); // L: 2883
		HealthBarDefinition.method4509(); // L: 2884
		VarcInt.method4426(); // L: 2885
		StructDefinition.StructDefinition_cached.clear(); // L: 2887
		StudioGame.method4185(); // L: 2889
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2891
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2894
		Widget.Widget_cachedSprites.clear(); // L: 2897
		Widget.Widget_cachedModels.clear(); // L: 2898
		Widget.Widget_cachedFonts.clear(); // L: 2899
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2900
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2902
		Script.Script_cached.clear(); // L: 2903
		SceneTilePaint.archive0.clearFiles(); // L: 2904
		WorldMapSprite.archive1.clearFiles(); // L: 2905
		class330.archive3.clearFiles(); // L: 2906
		class227.archive4.clearFiles(); // L: 2907
		GameShell.archive5.clearFiles(); // L: 2908
		class217.archive6.clearFiles(); // L: 2909
		BuddyRankComparator.archive7.clearFiles(); // L: 2910
		Messages.archive8.clearFiles(); // L: 2911
		GrandExchangeOfferUnitPriceComparator.archive9.clearFiles(); // L: 2912
		class92.archive10.clearFiles(); // L: 2913
		ItemContainer.archive11.clearFiles(); // L: 2914
		PacketBufferNode.archive12.clearFiles(); // L: 2915
		ArchiveLoader.scene.clear(); // L: 2917

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2918
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2919
		SecureRandomCallable.method1220(2); // L: 2920
		Client.currentTrackGroupId = -1; // L: 2921
		Client.field883 = false; // L: 2922

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 2924
			if (var1.stream1 != null) { // L: 2925
				WorldMapManager.pcmStreamMixer.removeSubStream(var1.stream1); // L: 2926
				var1.stream1 = null; // L: 2927
			}

			if (var1.stream2 != null) { // L: 2929
				WorldMapManager.pcmStreamMixer.removeSubStream(var1.stream2); // L: 2930
				var1.stream2 = null; // L: 2931
			}
		}

		ObjectSound.objectSounds.clear(); // L: 2934
		WorldMapCacheName.updateGameState(10); // L: 2936
	} // L: 2937

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1899321298"
	)
	static void method332() {
		int var0 = Players.Players_count; // L: 4714
		int[] var1 = Players.Players_indices; // L: 4715

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4716
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4717
				ClientPreferences.addPlayerToScene(Client.players[var1[var2]], true); // L: 4718
			}
		}

	} // L: 4720

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-159412455"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class41.loadInterface(var0)) { // L: 10371
			class51.runComponentCloseListeners(class9.Widget_interfaceComponents[var0], var1); // L: 10372
		}
	} // L: 10373
}
