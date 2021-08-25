import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class14 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static IndexedSprite field69;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1162986903
	)
	final int field71;
	@ObfuscatedName("c")
	final String field67;
	@ObfuscatedName("m")
	final ThreadFactory field68;
	@ObfuscatedName("k")
	final ThreadPoolExecutor field70;

	public class14(String var1, int var2, int var3) {
		this.field67 = var1;
		this.field71 = var2;
		this.field68 = new class16(this);
		this.field70 = this.method182(var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "6276176"
	)
	final ThreadPoolExecutor method182(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field71), this.field68);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ll;I)Lx;",
		garbageValue = "1026683688"
	)
	public class19 method186(class10 var1) {
		if (this.field70.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field70.getCorePoolSize() + " Queue capacity " + this.field71);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field70.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1134604933"
	)
	public final void method191() {
		try {
			this.field70.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1662089462"
	)
	static int method185(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			var4 = class87.getWidget(var3);
		} else {
			var4 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class240.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
			Actor.invalidateWidget(var4);
			ArchiveDiskActionHandler.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class240.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
			Actor.invalidateWidget(var4);
			ArchiveDiskActionHandler.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				Actor.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1305341703"
	)
	static int method190(int var0, Script var1, boolean var2) {
		Widget var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class138.Widget_unpackTargetMask(Decimator.getWidgetFlags(var3));
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
			int var4 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
