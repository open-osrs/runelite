import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	Node field3567;

	public IterableNodeDeque() {
		this.sentinel = new Node(); // L: 7
		this.sentinel.previous = this.sentinel; // L: 11
		this.sentinel.next = this.sentinel; // L: 12
	} // L: 13

	@ObfuscatedName("h")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) { // L: 16
			this.sentinel.previous.remove(); // L: 17
		}

	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)V"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	@Export("last")
	public Node last() {
		return this.method4837((Node)null); // L: 46
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Lgu;"
	)
	Node method4837(Node var1) {
		Node var2;
		if (var1 == null) { // L: 51
			var2 = this.sentinel.previous;
		} else {
			var2 = var1; // L: 52
		}

		if (var2 == this.sentinel) { // L: 53
			this.field3567 = null; // L: 54
			return null; // L: 55
		} else {
			this.field3567 = var2.previous; // L: 57
			return var2; // L: 58
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Lgu;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3567; // L: 62
		if (var1 == this.sentinel) { // L: 63
			this.field3567 = null; // L: 64
			return null; // L: 65
		} else {
			this.field3567 = var1.previous; // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("p")
	int method4853() {
		int var1 = 0; // L: 72

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) { // L: 73 74 76
			++var1; // L: 75
		}

		return var1; // L: 78
	}

	@ObfuscatedName("l")
	public boolean method4840() {
		return this.sentinel.previous == this.sentinel; // L: 82
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()[Lgu;"
	)
	Node[] method4841() {
		Node[] var1 = new Node[this.method4853()]; // L: 86
		int var2 = 0; // L: 87

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 88 89 91
			var1[var2++] = var3; // L: 90
		}

		return var1; // L: 93
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lgu;)Z"
	)
	boolean method4832(Node var1) {
		this.addFirst(var1); // L: 127
		return true; // L: 128
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 160
	}

	public int size() {
		return this.method4853(); // L: 101
	}

	public boolean isEmpty() {
		return this.method4840(); // L: 105
	}

	public boolean contains(Object var1) {
		throw new RuntimeException(); // L: 109
	}

	public Object[] toArray() {
		return this.method4841(); // L: 113
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0; // L: 117

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) { // L: 118 119 121
			var1[var2++] = var3; // L: 120
		}

		return var1; // L: 123
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException(); // L: 140
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException(); // L: 144
	}

	public void clear() {
		this.rsClear(); // L: 152
	} // L: 153

	public boolean add(Object var1) {
		return this.method4832((Node)var1); // L: 156
	}

	public boolean remove(Object var1) {
		throw new RuntimeException(); // L: 132
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this); // L: 97
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException(); // L: 148
	}

	public int hashCode() {
		return super.hashCode(); // L: 164
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException(); // L: 136
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgu;Lgu;)V"
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
