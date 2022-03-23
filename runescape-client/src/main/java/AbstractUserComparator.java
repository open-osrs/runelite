import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1477105489
	)
	static int field4268;
	@ObfuscatedName("o")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1235523353"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lnc;I)I",
		garbageValue = "1354743050"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llq;IB)Z",
		garbageValue = "-20"
	)
	static boolean method6771(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 161
		if (var2 == null) { // L: 162
			return false;
		} else {
			ClientPreferences.SpriteBuffer_decode(var2); // L: 163
			return true; // L: 164
		}
	}
}
