import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("n")
	int field348;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Lao;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("s")
	protected abstract int vmethod5295();

	@ObfuscatedName("r")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("y")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("al")
	int vmethod951() {
		return 255; // L: 16
	}

	@ObfuscatedName("fy")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
