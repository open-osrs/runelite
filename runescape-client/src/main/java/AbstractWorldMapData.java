import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1489291855
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -731202711
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2091565261
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 756401157
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1229904609
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1992018845
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1735670735
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 789122507
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("l")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("z")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("u")
	byte[][][] field178;
	@ObfuscatedName("e")
	byte[][][] field177;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[[[[Lak;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("c")
	boolean field190;
	@ObfuscatedName("i")
	boolean field191;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field190 = false; // L: 26
		this.field191 = false; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1878970684"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1422551454"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field190 && this.field191; // L: 32
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V",
		garbageValue = "-1133283231"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field190 = true; // L: 40
				this.field191 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field178 = null; // L: 48
		this.field177 = null; // L: 49
		this.decorations = null; // L: 50
		this.field190 = false; // L: 51
		this.field191 = false; // L: 52
	} // L: 53

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILkj;I)V",
		garbageValue = "-734499768"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method306(var1, var2, var3, var4); // L: 61
			} else {
				this.method314(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILkj;II)V",
		garbageValue = "732495103"
	)
	void method306(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILkj;II)V",
		garbageValue = "-550064835"
	)
	void method314(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field178[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field177[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method5559(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1451993074"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "11679"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-970565394"
	)
	static int method328(int var0, Script var1, boolean var2) {
		Widget var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1306
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1307
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var3)); // L: 1308
			return 1; // L: 1309
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1311
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1318
				if (var3.dataText == null) { // L: 1319
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1320
				}

				return 1; // L: 1321
			} else {
				return 2; // L: 1323
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1312
			--var4; // L: 1313
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1314
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1315
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1316
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIILlm;Lho;I)V",
		garbageValue = "-942051498"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 10964
		if (var6 > 4225 && var6 < 90000) { // L: 10965
			int var7 = Client.camAngleY & 2047; // L: 10966
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 10967
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 10968
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 10969
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 10970
			double var12 = Math.atan2((double)var10, (double)var11); // L: 10971
			int var14 = var5.width / 2 - 25; // L: 10972
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 10973
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 10974
			byte var17 = 20; // L: 10975
			ViewportMouse.redHintArrowSprite.method6189(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 10976
		} else {
			class25.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 10978
		}

	} // L: 10979
}
