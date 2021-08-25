import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	Node field3820;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("c")
	@Export("start")
	void start() {
		this.field3820 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public Object next() {
		Node var1 = this.field3820;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3820 = null;
		} else {
			this.field3820 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3820 && this.field3820 != null;
	}
}
