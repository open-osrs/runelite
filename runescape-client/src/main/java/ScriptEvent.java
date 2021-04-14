import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("f")
	@Export("args")
	Object[] args;
	@ObfuscatedName("o")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1784296503
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1719559371
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 770661921
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2016047147
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1513404237
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("n")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1732094063
	)
	int field1154;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 360823723
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "18"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1577560500"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;ZLkq;B)V",
		garbageValue = "15"
	)
	public static void method2101(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		Widget.ItemDefinition_archive = var0; // L: 84
		ItemComposition.ItemDefinition_modelArchive = var1; // L: 85
		class21.ItemDefinition_inMembersWorld = var2; // L: 86
		UserComparator8.ItemDefinition_fileCount = Widget.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		DevicePcmPlayerProvider.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89
}
