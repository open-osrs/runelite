import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("queue")
	IterableDualNodeQueue queue;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("head")
	DualNode head;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("last")
	DualNode last;

	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
		this.last = null; // L: 9
		this.queue = var1; // L: 12
		this.head = this.queue.sentinel.previousDual; // L: 13
		this.last = null; // L: 14
	} // L: 15

	public void remove() {
		if (this.last == null) { // L: 33
			throw new IllegalStateException();
		} else {
			this.last.removeDual(); // L: 34
			this.last = null; // L: 35
		}
	} // L: 36

	public boolean hasNext() {
		return this.queue.sentinel != this.head; // L: 29
	}

	public Object next() {
		DualNode var1 = this.head; // L: 18
		if (var1 == this.queue.sentinel) { // L: 19
			var1 = null; // L: 20
			this.head = null; // L: 21
		} else {
			this.head = var1.previousDual; // L: 23
		}

		this.last = var1; // L: 24
		return var1; // L: 25
	}
}
