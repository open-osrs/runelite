import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("x")
	int field473;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("q")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("r")
	protected abstract int vmethod4740();

	@ObfuscatedName("h")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("z")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ay")
	int vmethod1099() {
		return 255; // L: 16
	}

	@ObfuscatedName("eu")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
