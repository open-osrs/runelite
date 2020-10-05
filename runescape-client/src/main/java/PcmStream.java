import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	volatile boolean active;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	PcmStream after;
	@ObfuscatedName("y")
	int field1519;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Ldc;"
	)
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "()Ldc;"
	)
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("w")
	protected abstract int vmethod3987();

	@ObfuscatedName("g")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("n")
	protected abstract void skip(int var1);

	@ObfuscatedName("aw")
	int vmethod2837() {
		return 255; // L: 16
	}

	@ObfuscatedName("fd")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
