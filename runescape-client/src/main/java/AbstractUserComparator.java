import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1488914561
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("o")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;S)V",
		garbageValue = "-28900"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Ljf;I)I",
		garbageValue = "864234218"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
