import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lft;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lft;"
	)
	Node field3528;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("c")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lft;)V"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lft;)V"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "()Lft;"
	)
	@Export("last")
	public Node last() {
		return this.method4884((Node)null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lft;)Lft;"
	)
	Node method4884(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field3528 = null;
			return null;
		} else {
			this.field3528 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "()Lft;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3528;
		if (var1 == this.sentinel) {
			this.field3528 = null;
			return null;
		} else {
			this.field3528 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("l")
	int method4885() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("j")
	public boolean method4886() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "()[Lft;"
	)
	Node[] method4887() {
		Node[] var1 = new Node[this.method4885()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lft;)Z"
	)
	boolean method4891(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Object[] toArray() {
		return this.method4887();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean isEmpty() {
		return this.method4886();
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

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public void clear() {
		this.rsClear();
	}

	public int hashCode() {
		return super.hashCode();
	}

	public int size() {
		return this.method4885();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method4891((Node)var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lft;Lft;)V"
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
