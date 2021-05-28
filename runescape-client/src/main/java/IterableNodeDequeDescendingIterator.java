import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	Node field3706;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lki;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null; // L: 9
		this.setDeque(var1); // L: 12
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lki;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1; // L: 16
		this.start(); // L: 17
	} // L: 18

	@ObfuscatedName("n")
	@Export("start")
	void start() {
		this.field3706 = this.deque != null ? this.deque.sentinel.previous : null; // L: 21
		this.last = null; // L: 22
	} // L: 23

	public void remove() {
		if (this.last == null) { // L: 41
			throw new IllegalStateException();
		} else {
			this.last.remove(); // L: 42
			this.last = null; // L: 43
		}
	} // L: 44

	public boolean hasNext() {
		return this.deque.sentinel != this.field3706; // L: 37
	}

	public Object next() {
		Node var1 = this.field3706; // L: 26
		if (var1 == this.deque.sentinel) { // L: 27
			var1 = null; // L: 28
			this.field3706 = null; // L: 29
		} else {
			this.field3706 = var1.previous; // L: 31
		}

		this.last = var1; // L: 32
		return var1; // L: 33
	}
}
