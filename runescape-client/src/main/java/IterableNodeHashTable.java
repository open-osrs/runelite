import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("IterableNodeHashTable")
public final class IterableNodeHashTable implements Iterable {
	@ObfuscatedName("f")
	@Export("size")
	int size;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("buckets")
	Node[] buckets;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("currentGet")
	Node currentGet;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("current")
	Node current;
	@ObfuscatedName("z")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(J)Lgn;"
	)
	@Export("get")
	public Node get(long var1) {
		Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))]; // L: 24

		for (this.currentGet = var3.previous; var3 != this.currentGet; this.currentGet = this.currentGet.previous) { // L: 25 26 32
			if (this.currentGet.key == var1) { // L: 27
				Node var4 = this.currentGet; // L: 28
				this.currentGet = this.currentGet.previous; // L: 29
				return var4; // L: 30
			}
		}

		this.currentGet = null; // L: 34
		return null; // L: 35
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgn;J)V"
	)
	@Export("put")
	public void put(Node var1, long var2) {
		if (var1.next != null) { // L: 39
			var1.remove();
		}

		Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))]; // L: 40
		var1.next = var4.next; // L: 41
		var1.previous = var4; // L: 42
		var1.next.previous = var1; // L: 43
		var1.previous.next = var1; // L: 44
		var1.key = var2; // L: 45
	} // L: 46

	@ObfuscatedName("l")
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.size; ++var1) { // L: 49
			Node var2 = this.buckets[var1]; // L: 50

			while (true) {
				Node var3 = var2.previous; // L: 52
				if (var3 == var2) { // L: 53
					break;
				}

				var3.remove(); // L: 54
			}
		}

		this.currentGet = null; // L: 57
		this.current = null; // L: 58
	} // L: 59

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lgn;"
	)
	@Export("first")
	public Node first() {
		this.index = 0; // L: 62
		return this.next(); // L: 63
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lgn;"
	)
	@Export("next")
	public Node next() {
		Node var1;
		if (this.index > 0 && this.buckets[this.index - 1] != this.current) { // L: 67
			var1 = this.current; // L: 68
			this.current = var1.previous; // L: 69
			return var1; // L: 70
		} else {
			do {
				if (this.index >= this.size) { // L: 72
					return null; // L: 79
				}

				var1 = this.buckets[this.index++].previous; // L: 73
			} while(var1 == this.buckets[this.index - 1]); // L: 74

			this.current = var1.previous; // L: 75
			return var1; // L: 76
		}
	}

	public Iterator iterator() {
		return new IterableNodeHashTableIterator(this); // L: 83
	}
}
