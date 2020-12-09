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
		this.id = var4;
		class200[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class200 var8 = var6[var7];
			this.field2404.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field2404 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1236741986"
	)
	static int method3717(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field2703 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) {
				return 2;
			}

			var3.onResize = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(ZLky;B)V",
		garbageValue = "57"
	)
	static final void method3714(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					var4.definition = WorldMapIcon_0.getNpcDefinition(var1.readBits(14));
					int var5 = var1.readBits(1);
					if (var5 == 1) {
						Client.field654[++Client.field826 - 1] = var2;
					}

					int var6;
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					int var7 = Client.defaultRotations[var1.readBits(3)];
					if (var3) {
						var4.orientation = var4.rotation = var7;
					}

					int var8 = var1.readBits(1);
					int var9;
					if (var0) {
						var9 = var1.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var4.field941 = var4.definition.size * 64;
					var4.field940 = var4.definition.rotation;
					if (var4.field940 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.idleSequence = var4.definition.idleSequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2106(PlayerAppearance.localPlayer.pathX[0] + var6, PlayerAppearance.localPlayer.pathY[0] + var9, var8 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
