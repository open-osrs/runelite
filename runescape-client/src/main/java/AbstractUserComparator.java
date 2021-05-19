import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("c")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-1938939594"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Llm;Llm;B)I",
		garbageValue = "-41"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-246385012"
	)
	static int method5592(int var0, int var1) {
		if (var0 == -2) { // L: 37
			return 12345678;
		} else if (var0 == -1) { // L: 38
			if (var1 < 0) { // L: 39
				var1 = 0; // L: 40
			} else if (var1 > 127) { // L: 42
				var1 = 127; // L: 43
			}

			var1 = 127 - var1; // L: 45
			return var1; // L: 46
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 48
			if (var1 < 2) { // L: 49
				var1 = 2;
			} else if (var1 > 126) { // L: 50
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 51
		}
	}
}
