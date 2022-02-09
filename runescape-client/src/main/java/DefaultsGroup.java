import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final DefaultsGroup field4206;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 394872165
	)
	@Export("group")
	final int group;

	static {
		field4206 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-18"
	)
	static void method6589(int var0) {
	} // L: 32

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "84"
	)
	static void method6590(String var0, String var1, String var2) {
		Player.method2159(7); // L: 1171
		UserComparator7.setLoginResponseString(var0, var1, var2); // L: 1172
	} // L: 1173
}
