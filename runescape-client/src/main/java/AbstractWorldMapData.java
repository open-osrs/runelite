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
		intValue = 1285877760
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 447666752
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
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field190 = false;
		this.field191 = false;
	}

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
		return this.field190 && this.field191;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V",
		garbageValue = "-1133283231"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field190 = true;
				this.field191 = true;
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field178 = null;
		this.field177 = null;
		this.decorations = null;
		this.field190 = false;
		this.field191 = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IILkj;I)V",
		garbageValue = "-734499768"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method306(var1, var2, var3, var4);
			} else {
				this.method314(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILkj;II)V",
		garbageValue = "732495103"
	)
	void method306(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILkj;II)V",
		garbageValue = "-550064835"
	)
	void method314(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field178[var9][var1][var2] = (byte)(var11 >> 2);
					this.field177[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5559();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1451993074"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "11679"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-970565394"
	)
	static int method328(int var0, Script var1, boolean var2) {
		Widget var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ServerPacket.Widget_unpackTargetMask(FaceNormal.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
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

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIILlm;Lho;I)V",
		garbageValue = "-942051498"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, Sprite var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			ViewportMouse.redHintArrowSprite.method6189(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class25.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
