import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cu")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dm")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) { // L: 9
			this.nextDual.previousDual = this.previousDual; // L: 10
			this.previousDual.nextDual = this.nextDual; // L: 11
			this.previousDual = null; // L: 12
			this.nextDual = null; // L: 13
		}
	} // L: 14
}
