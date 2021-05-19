import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cf")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -605907223
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -235619829
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -898110991
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 853925999
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -665305113
	)
	@Export("x")
	int x;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1158524887
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -782720615
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 6537399
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLge;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = Player.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field1900 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 39
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 40
			}
		}

	} // L: 43

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) { // L: 46
			int var1 = Client.cycle - this.cycleStart; // L: 47
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 48
				var1 = 100;
			}

			label54: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 49
							break label54;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame; // L: 51
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 52

					this.frame -= this.sequenceDefinition.frameCount; // L: 53
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null; // L: 55
			}

			this.cycleStart = Client.cycle - var1; // L: 60
		}

		ObjectComposition var12 = AttackOption.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 67
				var2 = var12.sizeX; // L: 72
				var3 = var12.sizeY; // L: 73
			} else {
				var2 = var12.sizeY; // L: 68
				var3 = var12.sizeX; // L: 69
			}

			int var4 = (var2 >> 1) + this.x; // L: 75
			int var5 = (var2 + 1 >> 1) + this.x; // L: 76
			int var6 = (var3 >> 1) + this.y; // L: 77
			int var7 = (var3 + 1 >> 1) + this.y; // L: 78
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 79
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-7"
	)
	public static byte[] method2030() {
		byte[] var0 = new byte[24]; // L: 282

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 284
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 285

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 286 287 288
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 290
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 293
				var0[var2] = -1;
			}
		}

		return var0; // L: 295
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1496767083"
	)
	static int method2027(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1007
			var0 -= 1000; // L: 1008
			var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1009
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1011
		}

		String var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 1012
		int[] var5 = null; // L: 1013
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1014
			int var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1015
			if (var6 > 0) { // L: 1016
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]) { // L: 1017 1018
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1020
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1022

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1023
			if (var4.charAt(var7 - 1) == 's') { // L: 1024
				var8[var7] = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1025
			}
		}

		var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1027
		if (var7 != -1) { // L: 1028
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1029
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1030
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1031
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1032
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1033
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1034
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1035
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1036
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1037
			var3.onVarTransmit = var8; // L: 1038
			var3.varTransmitTriggers = var5; // L: 1039
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1041
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1042
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1043
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1044
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1045
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1046
			var3.onInvTransmit = var8; // L: 1047
			var3.invTransmitTriggers = var5; // L: 1048
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1050
			var3.onStatTransmit = var8; // L: 1051
			var3.statTransmitTriggers = var5; // L: 1052
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8; // L: 1054
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1055
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1056
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1057
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1058
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1059
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1060
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1061
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1062
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1063
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1064
			var3.field3004 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1065
			var3.onResize = var8;
		} else if (var0 == 1428) { // L: 1066
			var3.field3076 = var8;
		} else {
			if (var0 != 1429) { // L: 1067
				return 2; // L: 1068
			}

			var3.field2974 = var8;
		}

		var3.hasListener = true; // L: 1069
		return 1; // L: 1070
	}
}
