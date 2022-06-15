import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class138 extends class128 {
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1956537991
	)
	int field1623;
	@ObfuscatedName("v")
	String field1620;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1623 = var1.readInt(); // L: 326
		this.field1620 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2968(this.field1623, this.field1620); // L: 331
	} // L: 332

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;B)V",
		garbageValue = "4"
	)
	public static void method2948(AbstractArchive var0) {
		class435.field4666 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1195912675"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class362.World_worlds != null) { // L: 171
			class131.doWorldSorting(0, class362.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549613437"
	)
	static boolean method2944() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4953
	}
}
