import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-1791270735"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IB)V",
		garbageValue = "39"
	)
	public static void method3513(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 327
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 329
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 330
			} catch (Exception var3) { // L: 332
			}
		}

	} // L: 334

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "([Lht;Lht;ZI)V",
		garbageValue = "137772189"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1991373371 * -999155981 : var1.width * 1458952181 * 410180701; // L: 9875
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -1625501093 * 850398675 : var1.height * -1661593933 * 964462715; // L: 9876
		SecureRandomFuture.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9877
		if (var1.children != null) { // L: 9878
			SecureRandomFuture.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9879
		if (var5 != null) {
			Fonts.method5463(var5.group, var3, var4, var2); // L: 9880
		}

		if (var1.contentType == 1337) { // L: 9881
		}

	} // L: 9882
}
