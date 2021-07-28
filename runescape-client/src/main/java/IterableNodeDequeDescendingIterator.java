import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	Node field3720;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("t")
	@Export("start")
	void start() {
		this.field3720 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3720;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3720 = null;
		} else {
			this.field3720 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3720 && this.field3720 != null;
	}
}
