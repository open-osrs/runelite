import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("a")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class426 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("v")
	@Export("args")
	Object[] args;
	@ObfuscatedName("o")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 590834085
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1385336571
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 274794473
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 639168691
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 272606769
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("r")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1898862119
	)
	int field1053;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1051993591
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "108517262"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2145174079"
	)
	static void method2111() {
		Tiles.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null; // L: 65
		Tiles.Tiles_shapes = null; // L: 66
		RunException.field4754 = null; // L: 67
		DirectByteArrayCopier.field3277 = null; // L: 68
		GrandExchangeOfferNameComparator.field4010 = null; // L: 69
		Widget.field3495 = null; // L: 70
		class4.Tiles_hue = null; // L: 71
		Login.Tiles_saturation = null; // L: 72
		WorldMapSectionType.Tiles_lightness = null; // L: 73
		class300.Tiles_hueMultiplier = null; // L: 74
		Tiles.field986 = null; // L: 75
	} // L: 76
}
