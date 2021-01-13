import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ge")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2402("", 0, new class200[]{class200.field2389}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2392("", 1, new class200[]{class200.field2388, class200.field2389}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2391("", 2, new class200[]{class200.field2388, class200.field2387, class200.field2389}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2397("", 3, new class200[]{class200.field2388}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2395("", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2396("", 5, new class200[]{class200.field2388, class200.field2389}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2406("", 6, new class200[]{class200.field2389}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2398("", 8, new class200[]{class200.field2388, class200.field2389}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2399("", 9, new class200[]{class200.field2388, class200.field2387}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2400("", 10, new class200[]{class200.field2388}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2401("", 11, new class200[]{class200.field2388}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2393("", 12, new class200[]{class200.field2388, class200.field2389}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	field2403("", 13, new class200[]{class200.field2388});

	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -1945883965
	)
	static int field2405;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -594815881
	)
	@Export("id")
	final int id;
	@ObfuscatedName("i")
	final Set field2404;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lgp;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2404 = new HashSet();
		this.id = var4; // L: 39
		class200[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class200 var8 = var6[var7]; // L: 43
			this.field2404.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field2404 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 50
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1236741986"
	)
	static int method3717(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 947
			var0 -= 1000; // L: 948
			var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 949
		} else {
			var3 = var2 ? PlayerComposition.scriptDotWidget : VarcInt.scriptActiveWidget; // L: 951
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 952
		int[] var5 = null; // L: 953
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 954
			int var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 955
			if (var6 > 0) { // L: 956
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]) { // L: 957 958
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 960
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 962

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 963
			if (var4.charAt(var7 - 1) == 's') { // L: 964
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 965
			}
		}

		var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 967
		if (var7 != -1) { // L: 968
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 969
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 970
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 971
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 972
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 973
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 974
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 975
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 976
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 977
			var3.onVarTransmit = var8; // L: 978
			var3.varTransmitTriggers = var5; // L: 979
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 981
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 982
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 983
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 984
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 985
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 986
			var3.onInvTransmit = var8; // L: 987
			var3.invTransmitTriggers = var5; // L: 988
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 990
			var3.onStatTransmit = var8; // L: 991
			var3.statTransmitTriggers = var5; // L: 992
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 994
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 995
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 996
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 997
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 998
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 999
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1000
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1001
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1002
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1003
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1004
			var3.field2703 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) { // L: 1005
				return 2; // L: 1006
			}

			var3.onResize = var8;
		}

		var3.hasListener = true; // L: 1007
		return 1; // L: 1008
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(ZLky;B)V",
		garbageValue = "57"
	)
	static final void method3714(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7261
				int var2 = var1.readBits(15); // L: 7262
				if (var2 != 32767) { // L: 7263
					boolean var3 = false; // L: 7264
					if (Client.npcs[var2] == null) { // L: 7265
						Client.npcs[var2] = new NPC(); // L: 7266
						var3 = true; // L: 7267
					}

					NPC var4 = Client.npcs[var2]; // L: 7269
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7270
					var4.npcCycle = Client.cycle; // L: 7271
					var4.definition = WorldMapIcon_0.getNpcDefinition(var1.readBits(14)); // L: 7272
					int var5 = var1.readBits(1); // L: 7273
					if (var5 == 1) { // L: 7274
						Client.field654[++Client.field826 - 1] = var2;
					}

					int var6;
					if (var0) { // L: 7276
						var6 = var1.readBits(8); // L: 7277
						if (var6 > 127) { // L: 7278
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 7281
						if (var6 > 15) { // L: 7282
							var6 -= 32;
						}
					}

					int var7 = Client.defaultRotations[var1.readBits(3)]; // L: 7284
					if (var3) { // L: 7285
						var4.orientation = var4.rotation = var7;
					}

					int var8 = var1.readBits(1); // L: 7286
					int var9;
					if (var0) { // L: 7288
						var9 = var1.readBits(8); // L: 7289
						if (var9 > 127) { // L: 7290
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 7293
						if (var9 > 15) { // L: 7294
							var9 -= 32;
						}
					}

					var4.field941 = var4.definition.size; // L: 7296
					var4.field940 = var4.definition.rotation; // L: 7297
					if (var4.field940 == 0) { // L: 7298
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7299
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7300
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7301
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7302
					var4.idleSequence = var4.definition.idleSequence; // L: 7303
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7304
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7305
					var4.method2106(PlayerComposition.localPlayer.pathX[0] + var6, PlayerComposition.localPlayer.pathY[0] + var9, var8 == 1); // L: 7306
					continue; // L: 7307
				}
			}

			var1.exportIndex(); // L: 7308
			return; // L: 7309
		}
	}
}
