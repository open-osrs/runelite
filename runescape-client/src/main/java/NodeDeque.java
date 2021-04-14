import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("NodeDeque")
public class NodeDeque {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("sentinel")
	public Node sentinel;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("current")
	Node current;

	public NodeDeque() {
		this.sentinel = new Node(); // L: 6
		this.sentinel.previous = this.sentinel; // L: 10
		this.sentinel.next = this.sentinel; // L: 11
	} // L: 12

	@ObfuscatedName("f")
	@Export("clear")
	public void clear() {
		while (true) {
			Node var1 = this.sentinel.previous; // L: 16
			if (var1 == this.sentinel) { // L: 17
				this.current = null; // L: 20
				return; // L: 21
			}

			var1.remove(); // L: 18
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) { // L: 24
			var1.remove();
		}

		var1.next = this.sentinel.next; // L: 25
		var1.previous = this.sentinel; // L: 26
		var1.next.previous = var1; // L: 27
		var1.previous.next = var1; // L: 28
	} // L: 29

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmh;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) { // L: 32
			var1.remove();
		}

		var1.next = this.sentinel; // L: 33
		var1.previous = this.sentinel.previous; // L: 34
		var1.next.previous = var1; // L: 35
		var1.previous.next = var1; // L: 36
	} // L: 37

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("removeLast")
	public Node removeLast() {
		Node var1 = this.sentinel.previous; // L: 48
		if (var1 == this.sentinel) {
			return null; // L: 49
		} else {
			var1.remove(); // L: 50
			return var1; // L: 51
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("removeFirst")
	public Node removeFirst() {
		Node var1 = this.sentinel.next; // L: 55
		if (var1 == this.sentinel) {
			return null; // L: 56
		} else {
			var1.remove(); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("last")
	public Node last() {
		Node var1 = this.sentinel.previous; // L: 62
		if (var1 == this.sentinel) { // L: 63
			this.current = null; // L: 64
			return null; // L: 65
		} else {
			this.current = var1.previous; // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("first")
	public Node first() {
		Node var1 = this.sentinel.next; // L: 72
		if (var1 == this.sentinel) { // L: 73
			this.current = null; // L: 74
			return null; // L: 75
		} else {
			this.current = var1.next; // L: 77
			return var1; // L: 78
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.current; // L: 82
		if (var1 == this.sentinel) { // L: 83
			this.current = null; // L: 84
			return null; // L: 85
		} else {
			this.current = var1.previous; // L: 87
			return var1; // L: 88
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("next")
	public Node next() {
		Node var1 = this.current; // L: 92
		if (var1 == this.sentinel) { // L: 93
			this.current = null; // L: 94
			return null; // L: 95
		} else {
			this.current = var1.next; // L: 97
			return var1; // L: 98
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lmh;Lmh;)V"
	)
	@Export("NodeDeque_addBefore")
	public static void NodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) { // L: 40
			var0.remove();
		}

		var0.next = var1.next; // L: 41
		var0.previous = var1; // L: 42
		var0.next.previous = var0; // L: 43
		var0.previous.next = var0; // L: 44
	} // L: 45
}
