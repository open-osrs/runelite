import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("t")
	int field343;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laf;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Laf;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("l")
	protected abstract int vmethod5441();

	@ObfuscatedName("q")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("r")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ag")
	int vmethod962() {
		return 255; // L: 16
	}

	@ObfuscatedName("fs")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
