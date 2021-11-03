import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
final class class393 implements class388 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lop;B)V",
		garbageValue = "59"
	)
	public void vmethod6878(Object var1, Buffer var2) {
		this.method6876((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Ljava/lang/Object;",
		garbageValue = "-2140031619"
	)
	public Object vmethod6883(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lop;S)V",
		garbageValue = "4140"
	)
	void method6876(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lko;Ljava/lang/String;Ljava/lang/String;I)[Loe;",
		garbageValue = "-910424433"
	)
	public static IndexedSprite[] method6882(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 58
		int var4 = var0.getFileId(var3, var2); // L: 59
		return UserComparator5.method2478(var0, var3, var4); // L: 60
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-496918873"
	)
	static final void method6885(int var0, int var1, int var2, int var3) {
		class114.method2538(); // L: 5609
	} // L: 5610
}
