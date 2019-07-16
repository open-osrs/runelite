import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("z")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		longValue = 3423502126894795079L
	)
	static long field1113;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lap;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		signature = "Liy;"
	)
	@Export("serverBuild")
	static ServerBuild serverBuild;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		signature = "[Lln;"
	)
	@Export("headIconPkSprites")
	static Sprite[] headIconPkSprites;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lgr;I)V",
		garbageValue = "962518033"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.WorldMapID_0.value) {
			throw new IllegalStateException("");
		}
		super.minPlane = var1.readUnsignedByte();
		super.planes = var1.readUnsignedByte();
		super.regionXLow = var1.readUnsignedShort();
		super.regionYLow = var1.readUnsignedShort();
		super.regionX = var1.readUnsignedShort();
		super.regionY = var1.readUnsignedShort();
		super.groupId = var1.method51();
		super.fileId = var1.method51();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lgr;I)V",
		garbageValue = "1937224298"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field154 = new byte[super.planes][64][64];
		super.field155 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class30.class30_something0.value) {
			throw new IllegalStateException("");
		}
		int var3 = var1.readUnsignedByte();
		int var4 = var1.readUnsignedByte();
		if (var3 == super.regionX && var4 == super.regionY) {
			for (int var5 = 0; var5 < 64; ++var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					this.readTile(var5, var6, var1);
				}
			}

		} else {
			throw new IllegalStateException("");
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		}
		WorldMapData_0 var2 = (WorldMapData_0)var1;
		return super.regionX == var2.regionX && super.regionY == var2.regionY;
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "3"
	)
	static final int method183(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		}
		var1 = (var0 & 127) * var1 / 128;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILcg;ZI)I",
		garbageValue = "2139921057"
	)
	static int method182(int var0, Script var1, boolean var2) {
		Widget var3 = Huffman.getWidget(Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++RouteStrategy.Interpreter_intStackSize - 1] = Calendar.method4107(class1.getWidgetClickMask(var3));
			return 1;
		}
		if (var0 == ScriptOpcodes.IF_GETOP) {
			int var4 = Interpreter.Interpreter_intStack[--RouteStrategy.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
		if (var0 == ScriptOpcodes.IF_GETOPBASE) {
			if (var3.dataText == null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
			}

			return 1;
		}
		return 2;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1757982583"
	)
	static final void method184(boolean var0) {
		if (var0) {
			Client.field658 = Login.field470 ? class159.field1980 : class159.field1983;
		} else {
			Client.field658 = ReflectionCheck.clientPreferences.parameters.containsKey(class279.method5357(Login.Login_username)) ? class159.field1982 : class159.field1985;
		}

	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		signature = "(Lho;I)V",
		garbageValue = "1585987978"
	)
	static final void method186(Widget component) {
		int var1 = component.contentType;
		if (var1 == 324) {
			if (Client.field118 == -1) {
				Client.field118 = component.spriteId2;
				Client.field120 = component.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				component.spriteId2 = Client.field118;
			} else {
				component.spriteId2 = Client.field120;
			}
		} else if (var1 == 325) {
			if (Client.field118 == -1) {
				Client.field118 = component.spriteId2;
				Client.field120 = component.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				component.spriteId2 = Client.field120;
			} else {
				component.spriteId2 = Client.field118;
			}
		} else if (var1 == 327) {
			component.modelAngleX = 150;
			component.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			component.modelType = 5;
			component.modelId = 0;
		} else if (var1 == 328) {
			component.modelAngleX = 150;
			component.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			component.modelType = 5;
			component.modelId = 1;
		}

	}
}
