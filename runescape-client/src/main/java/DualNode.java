import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class DualNode extends Node {
	@ObfuscatedName("cj")
	public long keyDual;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public DualNode previousDual;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public DualNode nextDual;

	@ObfuscatedName("dq")
	public void removeDual() {
		if (this.nextDual != null) { // L: 9
			this.nextDual.previousDual = this.previousDual; // L: 10
			this.previousDual.nextDual = this.nextDual; // L: 11
			this.previousDual = null; // L: 12
			this.nextDual = null; // L: 13
		}
	} // L: 14
}
