import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -1925838321
	)
	static int field1042;
	@ObfuscatedName("v")
	@Export("args")
	Object[] args;
	@ObfuscatedName("c")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 736658407
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1446872253
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2054800039
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2138407541
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 606437039
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("o")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2094030297
	)
	int field1031;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2085929869
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-578941506"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "551800403"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-6716"
	)
	static final void method2092(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8661
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8662
				Client.field716[var4] = true;
			}
		}

	} // L: 8664
}
