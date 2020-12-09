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
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "470419605"
	)
	static int method331(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-738122321"
	)
	static int method334(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1843949362"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		MusicPatchPcmStream.method3953();
		UserComparator2.method5959();
		ObjectDefinition.ObjectDefinition_cached.clear();
		ObjectDefinition.ObjectDefinition_cachedModelData.clear();
		ObjectDefinition.ObjectDefinition_cachedEntities.clear();
		ObjectDefinition.ObjectDefinition_cachedModels.clear();
		WorldMapIcon_1.method339();
		TileItem.method2187();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		WallDecoration.method3379();
		VarbitDefinition.VarbitDefinition_cached.clear();
		WorldMapID.method601();
		HealthBarDefinition.method4509();
		VarcInt.method4426();
		StructDefinition.StructDefinition_cached.clear();
		StudioGame.method4185();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerAppearance.PlayerAppearance_cachedModels.clear();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		TilePaint.archive0.clearFiles();
		WorldMapSprite.archive1.clearFiles();
		class330.archive3.clearFiles();
		class227.archive4.clearFiles();
		GameShell.archive5.clearFiles();
		class217.archive6.clearFiles();
		BuddyRankComparator.archive7.clearFiles();
		Messages.archive8.clearFiles();
		GrandExchangeOfferUnitPriceComparator.archive9.clearFiles();
		class92.archive10.clearFiles();
		ItemContainer.archive11.clearFiles();
		PacketBufferNode.archive12.clearFiles();
		ArchiveLoader.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		SecureRandomCallable.method1220(2);
		Client.currentTrackGroupId = -1;
		Client.field883 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				WorldMapManager.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				WorldMapManager.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		WorldMapCacheName.updateGameState(10);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1899321298"
	)
	static void method332() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				ClientPreferences.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-159412455"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class41.loadInterface(var0)) {
			class51.runComponentCloseListeners(class9.Widget_interfaceComponents[var0], var1);
		}
	}
}
