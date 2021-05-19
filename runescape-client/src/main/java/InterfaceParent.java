import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field1134;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2063280523
	)
	@Export("group")
	int group;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2020547515
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	boolean field1136;

	InterfaceParent() {
		this.field1136 = false; // L: 8
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-24242"
	)
	public static int method2111(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 49
		int var1 = (int)(var2 >>> 0 & 127L); // L: 51
		return var1; // L: 53
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "463563662"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class311.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 9083
	} // L: 9084
}
