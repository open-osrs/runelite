import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1421972333
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1203625827
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1101114041
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1652145053
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -515786911
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -530095189
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 803439659
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1516171493
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1126880699
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2104357143
	)
	int field2541;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1530415993
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -7431595291754481309L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1220854209
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhv;",
		garbageValue = "-873058170"
	)
	public static class227[] method4342() {
		return new class227[]{class227.field2679, class227.field2675, class227.field2678, class227.field2676, class227.field2677, class227.field2680, class227.field2674, class227.field2683, class227.field2681, class227.field2682};
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1928503982"
	)
	static int method4341(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class79 var8 = new class79(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field754.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				Interpreter.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class79 var6 = new class79(var5, var3, var4, UrlRequester.getWidget(var3).itemId);
					Interpreter.field754.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field742 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = UrlRequester.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field961 = Interpreter.field742 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
