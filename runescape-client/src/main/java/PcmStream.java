import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("x")
	int field346;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Laz;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Laz;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("w")
	protected abstract int vmethod5437();

	@ObfuscatedName("y")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("s")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("at")
	int vmethod948() {
		return 255; // L: 16
	}

	@ObfuscatedName("es")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
