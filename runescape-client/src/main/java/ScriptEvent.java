import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 1903848297
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("dq")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1883417759
	)
	static int field597;
	@ObfuscatedName("z")
	@Export("args")
	Object[] args;
	@ObfuscatedName("k")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2100516553
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1832434813
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -720675073
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1621651451
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -582654831
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("m")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -735061669
	)
	int field593;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 926169729
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1399912972"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-802645814"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)Ljava/lang/String;",
		garbageValue = "-64"
	)
	public static String method1235(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 25
			if (var2 > 32767) { // L: 26
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 27
			var0.offset += class219.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 28
			String var4 = SpotAnimationDefinition.decodeStringCp1252(var3, 0, var2); // L: 29
			var1 = var4; // L: 30
		} catch (Exception var6) { // L: 32
			var1 = "Cabbage"; // L: 33
		}

		return var1; // L: 36
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "-1474859384"
	)
	static String method1236(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 173

		for (int var3 = 0; var3 < var1; ++var3) { // L: 174
			var2[var3] = var0;
		}

		return new String(var2); // L: 175
	}
}
