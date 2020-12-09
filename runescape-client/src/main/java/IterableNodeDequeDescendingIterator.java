import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	Node field3575;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("u")
	@Export("start")
	void start() {
		this.field3575 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3575;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3575 = null;
		} else {
			this.field3575 = var1.previous;
		}

		this.last = var1;
		return var1;
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
		return this.deque.sentinel != this.field3575;
	}
}
