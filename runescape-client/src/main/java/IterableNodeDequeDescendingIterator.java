import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	Node field3826;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lkt;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkt;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("q")
	@Export("start")
	void start() {
		this.field3826 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3826;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3826 = null;
		} else {
			this.field3826 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3826 && this.field3826 != null;
	}

	public void remove() {
		if (this.last == null) {
			throw new IllegalStateException();
		} else {
			this.last.remove();
			this.last = null;
		}
	}
}
