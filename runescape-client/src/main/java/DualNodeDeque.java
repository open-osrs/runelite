import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("DualNodeDeque")
public final class DualNodeDeque {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("sentinel")
	DualNode sentinel;

	public DualNodeDeque() {
		this.sentinel = new DualNode(); // L: 6
		this.sentinel.previousDual = this.sentinel; // L: 9
		this.sentinel.nextDual = this.sentinel; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	@Export("addFirst")
	public void addFirst(DualNode var1) {
		if (var1.nextDual != null) { // L: 14
			var1.removeDual();
		}

		var1.nextDual = this.sentinel.nextDual; // L: 15
		var1.previousDual = this.sentinel; // L: 16
		var1.nextDual.previousDual = var1; // L: 17
		var1.previousDual.nextDual = var1; // L: 18
	} // L: 19

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	@Export("addLast")
	public void addLast(DualNode var1) {
		if (var1.nextDual != null) { // L: 22
			var1.removeDual();
		}

		var1.nextDual = this.sentinel; // L: 23
		var1.previousDual = this.sentinel.previousDual; // L: 24
		var1.nextDual.previousDual = var1; // L: 25
		var1.previousDual.nextDual = var1; // L: 26
	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "()Lgp;"
	)
	@Export("removeLast")
	public DualNode removeLast() {
		DualNode var1 = this.sentinel.previousDual; // L: 30
		return var1 == this.sentinel ? null : var1; // L: 31 32
	}
}
