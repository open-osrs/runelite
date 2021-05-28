import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	Node field3709;

	public IterableNodeDeque() {
		this.sentinel = new Node(); // L: 7
		this.sentinel.previous = this.sentinel; // L: 11
		this.sentinel.next = this.sentinel; // L: 12
	} // L: 13

	@ObfuscatedName("v")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) { // L: 16
			this.sentinel.previous.remove(); // L: 17
		}

	} // L: 19

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) { // L: 22
			var1.remove();
		}

		var1.next = this.sentinel.next; // L: 23
		var1.previous = this.sentinel; // L: 24
		var1.next.previous = var1; // L: 25
		var1.previous.next = var1; // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) { // L: 30
			var1.remove();
		}

		var1.next = this.sentinel; // L: 31
		var1.previous = this.sentinel.previous; // L: 32
		var1.next.previous = var1; // L: 33
		var1.previous.next = var1; // L: 34
	} // L: 35

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lmw;"
	)
	@Export("last")
	public Node last() {
		return this.method5233((Node)null); // L: 46
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Lmw;"
	)
	Node method5233(Node var1) {
		Node var2;
		if (var1 == null) { // L: 51
			var2 = this.sentinel.previous;
		} else {
			var2 = var1; // L: 52
		}

		if (var2 == this.sentinel) { // L: 53
			this.field3709 = null; // L: 54
			return null; // L: 55
		} else {
			this.field3709 = var2.previous; // L: 57
			return var2; // L: 58
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lmw;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3709; // L: 62
		if (var1 == this.sentinel) { // L: 63
			this.field3709 = null; // L: 64
			return null; // L: 65
		} else {
			this.field3709 = var1.previous; // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("b")
	int method5235() {
		int var1 = 0; // L: 72

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) { // L: 73 74 76
			++var1; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("d")
	public boolean method5236() {
		return this.sentinel.previous == this.sentinel; // L: 82
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()[Lmw;"
	)
	Node[] method5240() {
		Node[] var1 = new Node[this.method5235()]; // L: 86
		int var2 = 0; // L: 87

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 88 89 91
			var1[var2++] = var3; // L: 90
		}

		return var1; // L: 93
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)Z"
	)
	boolean method5239(Node var1) {
		this.addFirst(var1); // L: 127
		return true; // L: 128
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException(); // L: 144
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this); // L: 97
	}

	public boolean isEmpty() {
		return this.method5236(); // L: 105
	}

	public Object[] toArray() {
		return this.method5240(); // L: 113
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0; // L: 117

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 118 119 121
			var1[var2++] = var3; // L: 120
		}

		return var1; // L: 123
	}

	public boolean remove(Object var1) {
		throw new RuntimeException(); // L: 132
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException(); // L: 136
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException(); // L: 148
	}

	public void clear() {
		this.rsClear(); // L: 152
	} // L: 153

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 160
	}

	public int hashCode() {
		return super.hashCode(); // L: 164
	}

	public boolean add(Object var1) {
		return this.method5239((Node)var1); // L: 156
	}

	public int size() {
		return this.method5235(); // L: 101
	}

	public boolean contains(Object var1) {
		throw new RuntimeException(); // L: 109
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException(); // L: 140
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lmw;Lmw;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) { // L: 38
			var0.remove();
		}

		var0.next = var1; // L: 39
		var0.previous = var1.previous; // L: 40
		var0.next.previous = var0; // L: 41
		var0.previous.next = var0; // L: 42
	} // L: 43
}
