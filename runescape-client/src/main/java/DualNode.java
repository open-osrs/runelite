import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("DualNode")
public class DualNode extends Node {
	@ObfuscatedName("cq")
	@Export("keyDual")
	public long keyDual;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("previousDual")
	public DualNode previousDual;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("nextDual")
	public DualNode nextDual;

	@ObfuscatedName("ci")
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
