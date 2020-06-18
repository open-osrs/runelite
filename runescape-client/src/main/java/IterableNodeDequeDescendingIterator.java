import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljx;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	Node field3573;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		signature = "(Ljx;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.last = null;
		this.setDeque(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Ljx;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1;
		this.start();
	}

	@ObfuscatedName("n")
	@Export("start")
	void start() {
		this.field3573 = this.deque != null ? this.deque.sentinel.previous : null;
		this.last = null;
	}

	public boolean hasNext() {
		return this.deque.sentinel != this.field3573;
	}

	public Object next() {
		Node var1 = this.field3573;
		if (var1 == this.deque.sentinel) {
			var1 = null;
			this.field3573 = null;
		} else {
			this.field3573 = var1.previous;
		}

		this.last = var1;
		return var1;
	}

	public void remove() {
		this.last.remove();
		this.last = null;
	}
}
