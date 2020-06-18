import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgr;"
	)
	Node field3565;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("m")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lgr;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lgr;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "()Lgr;"
	)
	@Export("last")
	public Node last() {
		return this.method5064((Node)null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lgr;)Lgr;"
	)
	Node method5064(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field3565 = null;
			return null;
		} else {
			this.field3565 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Lgr;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3565;
		if (var1 == this.sentinel) {
			this.field3565 = null;
			return null;
		} else {
			this.field3565 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("u")
	int method5008() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("a")
	public boolean method5014() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "()[Lgr;"
	)
	Node[] method5010() {
		Node[] var1 = new Node[this.method5008()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Lgr;)Z"
	)
	boolean method5012(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method5008();
	}

	public boolean isEmpty() {
		return this.method5014();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method5012((Node)var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public Object[] toArray() {
		return this.method5010();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lgr;Lgr;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
