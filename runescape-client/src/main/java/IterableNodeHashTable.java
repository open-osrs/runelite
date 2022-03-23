import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("IterableNodeHashTable")
public final class IterableNodeHashTable implements Iterable {
	@ObfuscatedName("v")
	@Export("size")
	int size;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("buckets")
	Node[] buckets;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("currentGet")
	Node currentGet;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("current")
	Node current;
	@ObfuscatedName("l")
	@Export("index")
	int index;

	public IterableNodeHashTable(int var1) {
		this.index = 0; // L: 11
		this.size = var1; // L: 14
		this.buckets = new Node[var1]; // L: 15

		for (int var2 = 0; var2 < var1; ++var2) { // L: 16
			Node var3 = this.buckets[var2] = new Node(); // L: 17
			var3.previous = var3; // L: 18
			var3.next = var3; // L: 19
		}

	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(J)Loz;"
	)
	@Export("get")
	public Node get(long var1) {
		Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))]; // L: 25

		for (this.currentGet = var3.previous; var3 != this.currentGet; this.currentGet = this.currentGet.previous) { // L: 26 27 33
			if (this.currentGet.key == var1) { // L: 28
				Node var4 = this.currentGet; // L: 29
				this.currentGet = this.currentGet.previous; // L: 30
				return var4; // L: 31
			}
		}

		this.currentGet = null; // L: 35
		return null; // L: 36
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loz;J)V"
	)
	@Export("put")
	public void put(Node var1, long var2) {
		if (var1.next != null) { // L: 40
			var1.remove();
		}

		Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))]; // L: 41
		var1.next = var4.next; // L: 42
		var1.previous = var4; // L: 43
		var1.next.previous = var1; // L: 44
		var1.previous.next = var1; // L: 45
		var1.key = var2; // L: 46
	} // L: 47

	@ObfuscatedName("h")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.size; ++var1) { // L: 50
			Node var2 = this.buckets[var1]; // L: 51

			while (true) {
				Node var3 = var2.previous; // L: 53
				if (var3 == var2) { // L: 54
					break;
				}

				var3.remove(); // L: 55
			}
		}

		this.currentGet = null; // L: 58
		this.current = null; // L: 59
	} // L: 60

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Loz;"
	)
	@Export("first")
	public Node first() {
		this.index = 0; // L: 63
		return this.next(); // L: 64
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "()Loz;"
	)
	@Export("next")
	public Node next() {
		Node var1;
		if (this.index > 0 && this.buckets[this.index - 1] != this.current) { // L: 69
			var1 = this.current; // L: 70
			this.current = var1.previous; // L: 71
			return var1; // L: 72
		} else {
			do {
				if (this.index >= this.size) { // L: 74
					return null; // L: 81
				}

				var1 = this.buckets[this.index++].previous; // L: 75
			} while(var1 == this.buckets[this.index - 1]); // L: 76

			this.current = var1.previous; // L: 77
			return var1; // L: 78
		}
	}

	public Iterator iterator() {
		return new IterableNodeHashTableIterator(this); // L: 86
	}
}
