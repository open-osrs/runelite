import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cy")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("cr")
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
