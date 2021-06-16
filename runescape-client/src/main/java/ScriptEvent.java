import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("f")
	@Export("args")
	Object[] args;
	@ObfuscatedName("e")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 666010529
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1253492813
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1848842303
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1390259441
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 156564383
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("d")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1428737731
	)
	int field1154;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1474025505
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1554075021"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1915392065"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27
}
