import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "-540043560"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;B)V",
		garbageValue = "-10"
	)
	public static void method2453(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	static void method2455(int var0) {
		Login.loginIndex = 12; // L: 1541
		Login.field996 = var0; // L: 1542
	} // L: 1543
}
