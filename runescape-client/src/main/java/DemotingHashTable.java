import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("DemotingHashTable")
public final class DemotingHashTable {
	@ObfuscatedName("o")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("q")
	@Export("remaining")
	int remaining;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("queue")
	IterableDualNodeQueue queue;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	class253 field2932;

	public DemotingHashTable(int var1, int var2) {
		this.queue = new IterableDualNodeQueue(); // L: 11
		this.capacity = var1; // L: 19
		this.remaining = var1; // L: 20

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) { // L: 21 22
		}

		this.hashTable = new IterableNodeHashTable(var3); // L: 23
	} // L: 24

	public DemotingHashTable(int var1) {
		this(var1, var1); // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@Export("get")
	public Object get(long var1) {
		Wrapper var3 = (Wrapper)this.hashTable.get(var1); // L: 27
		if (var3 == null) { // L: 28
			return null;
		} else {
			Object var4 = var3.get(); // L: 29
			if (var4 == null) { // L: 30
				var3.remove(); // L: 31
				var3.removeDual(); // L: 32
				this.remaining += var3.size; // L: 33
				return null; // L: 34
			} else {
				if (var3.isSoft()) { // L: 36
					DirectWrapper var5 = new DirectWrapper(var4, var3.size); // L: 37
					this.hashTable.put(var5, var3.key); // L: 38
					this.queue.add(var5); // L: 39
					var5.keyDual = 0L; // L: 40
					var3.remove(); // L: 41
					var3.removeDual(); // L: 42
				} else {
					this.queue.add(var3); // L: 45
					var3.keyDual = 0L; // L: 46
				}

				return var4; // L: 48
			}
		}
	}

	@ObfuscatedName("q")
	@Export("remove")
	void remove(long var1) {
		Wrapper var3 = (Wrapper)this.hashTable.get(var1); // L: 52
		this.removeWrapper(var3); // L: 53
	} // L: 54

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lim;)V"
	)
	@Export("removeWrapper")
	void removeWrapper(Wrapper var1) {
		if (var1 != null) { // L: 57
			var1.remove(); // L: 58
			var1.removeDual(); // L: 59
			this.remaining += var1.size; // L: 60
		}

	} // L: 62

	@ObfuscatedName("k")
	public void method4942(Object var1, long var2) {
		this.put(var1, var2, 1); // L: 65
	} // L: 66

	@ObfuscatedName("a")
	@Export("put")
	public void put(Object var1, long var2, int var4) {
		if (var4 > this.capacity) { // L: 69
			throw new IllegalStateException();
		} else {
			this.remove(var2); // L: 70
			this.remaining -= var4; // L: 71

			while (this.remaining < 0) { // L: 72
				Wrapper var5 = (Wrapper)this.queue.removeLast(); // L: 73
				if (var5 == null) { // L: 74
					throw new RuntimeException(""); // L: 75
				}

				if (!var5.isSoft()) { // L: 77
				}

				this.removeWrapper(var5); // L: 78
				if (this.field2932 != null) { // L: 79
					this.field2932.method4937(var5.get()); // L: 80
				}
			}

			DirectWrapper var6 = new DirectWrapper(var1, var4); // L: 83
			this.hashTable.put(var6, var2); // L: 84
			this.queue.add(var6); // L: 85
			var6.keyDual = 0L; // L: 86
		}
	} // L: 87

	@ObfuscatedName("m")
	@Export("demote")
	public void demote(int var1) {
		for (Wrapper var2 = (Wrapper)this.queue.last(); var2 != null; var2 = (Wrapper)this.queue.previous()) { // L: 90
			if (var2.isSoft()) { // L: 91
				if (var2.get() == null) { // L: 92
					var2.remove(); // L: 93
					var2.removeDual(); // L: 94
					this.remaining += var2.size; // L: 95
				}
			} else if (++var2.keyDual > (long)var1) { // L: 100
				SoftWrapper var3 = new SoftWrapper(var2.get(), var2.size); // L: 101
				this.hashTable.put(var3, var2.key); // L: 102
				IterableDualNodeQueue.DualNodeDeque_addBefore(var3, var2); // L: 103
				var2.remove(); // L: 104
				var2.removeDual(); // L: 105
			}
		}

	} // L: 109

	@ObfuscatedName("p")
	@Export("clear")
	public void clear() {
		this.queue.clear(); // L: 112
		this.hashTable.clear(); // L: 113
		this.remaining = this.capacity; // L: 114
	} // L: 115
}
