import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
public class class143 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1200015243
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -313153463126813519L
	)
	long field1626;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1337134792886760215L
	)
	long field1625;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	IterableNodeDeque field1618;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public class143(Buffer var1) {
		this.field1625 = -1L;
		this.field1618 = new IterableNodeDeque();
		this.method2961(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "178883097"
	)
	void method2961(Buffer var1) {
		this.field1626 = var1.readLong();
		this.field1625 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class138(this);
			} else if (var2 == 4) {
				var3 = new class149(this);
			} else if (var2 == 3) {
				var3 = new class134(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class139(this);
			}

			((class142)var3).vmethod3022(var1);
			this.field1618.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "5"
	)
	public void method2960(ClanChannel var1) {
		if (var1.key == this.field1626 && this.field1625 == var1.field1640) {
			for (class142 var2 = (class142)this.field1618.last(); var2 != null; var2 = (class142)this.field1618.previous()) {
				var2.vmethod3021(var1);
			}

			++var1.field1640;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "100"
	)
	static int method2959(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			var3 = ChatChannel.getWidget(var4);
		} else {
			var3 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			IsaacCipher.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 5];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					SecureRandomCallable.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					SecureRandomCallable.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				IsaacCipher.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				SecureRandomCallable.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class288.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				FillMode var6 = (FillMode)class130.findEnumerated(class253.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					SecureRandomCallable.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
					var3.field3359 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-317869339"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (PacketBufferNode.garbageCollector == null || !PacketBufferNode.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						PacketBufferNode.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (PacketBufferNode.garbageCollector != null) {
			long var9 = Ignored.method6459();
			long var3 = PacketBufferNode.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
