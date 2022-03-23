import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("IterableDualNodeQueue")
public class IterableDualNodeQueue implements Iterable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("sentinel")
	public DualNode sentinel;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("head")
	DualNode head;

	public IterableDualNodeQueue() {
		this.sentinel = new DualNode(); // L: 7
		this.sentinel.previousDual = this.sentinel; // L: 11
		this.sentinel.nextDual = this.sentinel; // L: 12
	} // L: 13

	@ObfuscatedName("v")
	@Export("clear")
	public void clear() {
		while (this.sentinel.previousDual != this.sentinel) { // L: 16
			this.sentinel.previousDual.removeDual(); // L: 17
		}

	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loh;)V"
	)
	@Export("add")
	public void add(DualNode var1) {
		if (var1.nextDual != null) { // L: 22
			var1.removeDual();
		}

		var1.nextDual = this.sentinel.nextDual; // L: 23
		var1.previousDual = this.sentinel; // L: 24
		var1.nextDual.previousDual = var1; // L: 25
		var1.previousDual.nextDual = var1; // L: 26
	} // L: 27

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Loh;"
	)
	@Export("removeLast")
	public DualNode removeLast() {
		DualNode var1 = this.sentinel.previousDual; // L: 39
		if (var1 == this.sentinel) {
			return null; // L: 40
		} else {
			var1.removeDual(); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "()Loh;"
	)
	@Export("last")
	public DualNode last() {
		return this.previousOrLast((DualNode)null); // L: 46
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Loh;)Loh;"
	)
	@Export("previousOrLast")
	DualNode previousOrLast(DualNode var1) {
		DualNode var2;
		if (var1 == null) { // L: 52
			var2 = this.sentinel.previousDual;
		} else {
			var2 = var1; // L: 53
		}

		if (var2 == this.sentinel) { // L: 54
			this.head = null; // L: 55
			return null; // L: 56
		} else {
			this.head = var2.previousDual; // L: 58
			return var2; // L: 59
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "()Loh;"
	)
	@Export("previous")
	public DualNode previous() {
		DualNode var1 = this.head; // L: 64
		if (var1 == this.sentinel) { // L: 65
			this.head = null; // L: 66
			return null; // L: 67
		} else {
			this.head = var1.previousDual; // L: 69
			return var1; // L: 70
		}
	}

	public Iterator iterator() {
		return new IterableDualNodeQueueIterator(this); // L: 74
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;)V"
	)
	@Export("DualNodeDeque_addBefore")
	public static void DualNodeDeque_addBefore(DualNode var0, DualNode var1) {
		if (var0.nextDual != null) { // L: 30
			var0.removeDual();
		}

		var0.nextDual = var1; // L: 31
		var0.previousDual = var1.previousDual; // L: 32
		var0.nextDual.previousDual = var0; // L: 33
		var0.previousDual.nextDual = var0; // L: 34
	} // L: 35
}
