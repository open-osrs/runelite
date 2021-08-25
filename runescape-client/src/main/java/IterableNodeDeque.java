import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	Node field3822;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("n")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;)V"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnr;)V"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lnr;"
	)
	@Export("last")
	public Node last() {
		return this.method5474((Node)null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnr;)Lnr;"
	)
	Node method5474(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field3822 = null;
			return null;
		} else {
			this.field3822 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lnr;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3822;
		if (var1 == this.sentinel) {
			this.field3822 = null;
			return null;
		} else {
			this.field3822 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("a")
	int method5476() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("u")
	public boolean method5517() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()[Lnr;"
	)
	Node[] method5486() {
		Node[] var1 = new Node[this.method5476()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnr;)Z"
	)
	boolean method5482(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public boolean isEmpty() {
		return this.method5517();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method5486();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public int size() {
		return this.method5476();
	}

	public boolean add(Object var1) {
		return this.method5482((Node)var1);
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;)V"
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
