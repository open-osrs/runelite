import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cm")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("dn")
	@Export("removeDual")
	public void removeDual() {
		if (this.nextDual != null) {
			this.nextDual.previousDual = this.previousDual;
			this.previousDual.nextDual = this.nextDual;
			this.previousDual = null;
			this.nextDual = null;
		}
	}
}
