import java.io.IOException;
import java.net.Socket;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ct")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;I)I",
		garbageValue = "-672050093"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1687929303"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1655549224"
	)
	static int method2388(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class92 var8 = new class92(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field818.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class240.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class92 var6 = new class92(var5, var3, var4, class87.getWidget(var3).itemId);
					Interpreter.field818.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field813 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1035 = Interpreter.field813 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lmv;",
		garbageValue = "-1484666434"
	)
	public static AbstractSocket method2379(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
