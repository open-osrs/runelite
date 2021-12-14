import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	Node field3964;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Llr;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llr;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("b")
	@Export("start")
	void start() {
		this.field3964 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3964 && this.field3964 != null;
	}

	public Object next() {
		Node var1 = this.field3964;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3964 = null;
		} else {
			this.field3964 = var1.previous;
		}

		this.last = var1;
		return var1;
	}
}
