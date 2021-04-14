import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	DualNode field2210;
	@ObfuscatedName("o")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("u")
	@Export("remainingCapacity")
	int remainingCapacity;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("deque")
	IterableDualNodeQueue deque;

	public EvictingDualNodeHashTable(int var1) {
		this.field2210 = new DualNode(); // L: 8
		this.deque = new IterableDualNodeQueue(); // L: 12
		this.capacity = var1; // L: 15
		this.remainingCapacity = var1; // L: 16

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) { // L: 17 18
		}

		this.hashTable = new IterableNodeHashTable(var2); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(J)Lmz;"
	)
	@Export("get")
	public DualNode get(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1); // L: 23
		if (var3 != null) { // L: 24
			this.deque.add(var3); // L: 25
		}

		return var3; // L: 28
	}

	@ObfuscatedName("o")
	@Export("remove")
	public void remove(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1); // L: 32
		if (var3 != null) { // L: 33
			var3.remove(); // L: 34
			var3.removeDual(); // L: 35
			++this.remainingCapacity; // L: 36
		}

	} // L: 38

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmz;J)V"
	)
	@Export("put")
	public void put(DualNode var1, long var2) {
		if (this.remainingCapacity == 0) { // L: 41
			DualNode var4 = this.deque.removeLast(); // L: 42
			var4.remove(); // L: 43
			var4.removeDual(); // L: 44
			if (var4 == this.field2210) { // L: 45
				var4 = this.deque.removeLast(); // L: 46
				var4.remove(); // L: 47
				var4.removeDual(); // L: 48
			}
		} else {
			--this.remainingCapacity; // L: 51
		}

		this.hashTable.put(var1, var2); // L: 52
		this.deque.add(var1); // L: 53
	} // L: 54

	@ObfuscatedName("p")
	@Export("clear")
	public void clear() {
		this.deque.clear(); // L: 57
		this.hashTable.clear(); // L: 58
		this.field2210 = new DualNode(); // L: 59
		this.remainingCapacity = this.capacity; // L: 60
	} // L: 61
}
