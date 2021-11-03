import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -1958240273
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("i")
	@Export("args")
	Object[] args;
	@ObfuscatedName("w")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1998799811
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1979729253
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -932845739
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1702725871
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1708889307
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("b")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 989440955
	)
	int field1024;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1164936437
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1142629297"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2078540065"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27
}
