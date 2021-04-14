import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("NodeHashTable")
public final class NodeHashTable {
	@ObfuscatedName("f")
	@Export("size")
	int size;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("buckets")
	Node[] buckets;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("currentGet")
	Node currentGet;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("current")
	Node current;
	@ObfuscatedName("b")
	@Export("index")
	int index;

	public NodeHashTable(int var1) {
		this.index = 0; // L: 10
		this.size = var1; // L: 13
		this.buckets = new Node[var1]; // L: 14

		for (int var2 = 0; var2 < var1; ++var2) { // L: 15
			Node var3 = this.buckets[var2] = new Node(); // L: 16
			var3.previous = var3; // L: 17
			var3.next = var3; // L: 18
		}

	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(J)Lmh;"
	)
	@Export("get")
	public Node get(long var1) {
		Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))]; // L: 23

		for (this.currentGet = var3.previous; var3 != this.currentGet; this.currentGet = this.currentGet.previous) { // L: 24 25 31
			if (this.currentGet.key == var1) { // L: 26
				Node var4 = this.currentGet; // L: 27
				this.currentGet = this.currentGet.previous; // L: 28
				return var4; // L: 29
			}
		}

		this.currentGet = null; // L: 33
		return null; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmh;J)V"
	)
	@Export("put")
	public void put(Node var1, long var2) {
		if (var1.next != null) { // L: 38
			var1.remove();
		}

		Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))]; // L: 39
		var1.next = var4.next; // L: 40
		var1.previous = var4; // L: 41
		var1.next.previous = var1; // L: 42
		var1.previous.next = var1; // L: 43
		var1.key = var2; // L: 44
	} // L: 45

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("first")
	public Node first() {
		this.index = 0; // L: 48
		return this.next(); // L: 49
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lmh;"
	)
	@Export("next")
	public Node next() {
		Node var1;
		if (this.index > 0 && this.buckets[this.index - 1] != this.current) { // L: 53
			var1 = this.current; // L: 54
			this.current = var1.previous; // L: 55
			return var1; // L: 56
		} else {
			do {
				if (this.index >= this.size) { // L: 58
					return null; // L: 65
				}

				var1 = this.buckets[this.index++].previous; // L: 59
			} while(var1 == this.buckets[this.index - 1]); // L: 60

			this.current = var1.previous; // L: 61
			return var1; // L: 62
		}
	}
}
