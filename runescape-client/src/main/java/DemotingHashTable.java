import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("DemotingHashTable")
public final class DemotingHashTable {
	@ObfuscatedName("f")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("b")
	@Export("remaining")
	int remaining;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("queue")
	IterableDualNodeQueue queue;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	class155 field1986;

	public DemotingHashTable(int var1, int var2) {
		this.queue = new IterableDualNodeQueue(); // L: 11
		this.capacity = var1; // L: 15
		this.remaining = var1; // L: 16

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) { // L: 17 18
		}

		this.hashTable = new IterableNodeHashTable(var3); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@Export("get")
	public Object get(long var1) {
		Wrapper var3 = (Wrapper)this.hashTable.get(var1); // L: 23
		if (var3 == null) { // L: 24
			return null;
		} else {
			Object var4 = var3.get(); // L: 25
			if (var4 == null) { // L: 26
				var3.remove(); // L: 27
				var3.removeDual(); // L: 28
				this.remaining += var3.size; // L: 29
				return null; // L: 30
			} else {
				if (var3.isSoft()) { // L: 32
					DirectWrapper var5 = new DirectWrapper(var4, var3.size); // L: 33
					this.hashTable.put(var5, var3.key); // L: 34
					this.queue.add(var5); // L: 35
					var5.keyDual = 0L; // L: 36
					var3.remove(); // L: 37
					var3.removeDual(); // L: 38
				} else {
					this.queue.add(var3); // L: 41
					var3.keyDual = 0L; // L: 42
				}

				return var4; // L: 44
			}
		}
	}

	@ObfuscatedName("b")
	@Export("remove")
	void remove(long var1) {
		Wrapper var3 = (Wrapper)this.hashTable.get(var1); // L: 48
		this.removeWrapper(var3); // L: 49
	} // L: 50

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	@Export("removeWrapper")
	void removeWrapper(Wrapper var1) {
		if (var1 != null) { // L: 53
			var1.remove(); // L: 54
			var1.removeDual(); // L: 55
			this.remaining += var1.size; // L: 56
		}

	} // L: 58

	@ObfuscatedName("m")
	@Export("put")
	public void put(Object var1, long var2, int var4) {
		if (var4 > this.capacity) { // L: 61
			throw new IllegalStateException();
		} else {
			this.remove(var2); // L: 62
			this.remaining -= var4; // L: 63

			while (this.remaining < 0) { // L: 64
				Wrapper var5 = (Wrapper)this.queue.removeLast(); // L: 65
				if (var5 == null) { // L: 66
					throw new RuntimeException(""); // L: 67
				}

				if (!var5.isSoft()) { // L: 69
				}

				this.removeWrapper(var5); // L: 70
				if (this.field1986 != null) { // L: 71
					this.field1986.method3450(var5.get()); // L: 72
				}
			}

			DirectWrapper var6 = new DirectWrapper(var1, var4); // L: 75
			this.hashTable.put(var6, var2); // L: 76
			this.queue.add(var6); // L: 77
			var6.keyDual = 0L; // L: 78
		}
	} // L: 79

	@ObfuscatedName("z")
	@Export("demote")
	public void demote(int var1) {
		for (Wrapper var2 = (Wrapper)this.queue.last(); var2 != null; var2 = (Wrapper)this.queue.previous()) { // L: 82
			if (var2.isSoft()) { // L: 83
				if (var2.get() == null) { // L: 84
					var2.remove(); // L: 85
					var2.removeDual(); // L: 86
					this.remaining += var2.size; // L: 87
				}
			} else if (++var2.keyDual > (long)var1) { // L: 92
				SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size); // L: 93
				this.hashTable.put(var3, var2.key); // L: 94
				IterableDualNodeQueue.DualNodeDeque_addBefore(var3, var2); // L: 95
				var2.remove(); // L: 96
				var2.removeDual(); // L: 97
			}
		}

	} // L: 101

	@ObfuscatedName("q")
	@Export("clear")
	public void clear() {
		this.queue.clear(); // L: 104
		this.hashTable.clear(); // L: 105
		this.remaining = this.capacity; // L: 106
	} // L: 107
}
