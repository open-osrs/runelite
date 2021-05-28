import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("a")
	int field494;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("m")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("b")
	protected abstract int vmethod4610();

	@ObfuscatedName("d")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("u")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ah")
	int vmethod987() {
		return 255; // L: 16
	}

	@ObfuscatedName("ee")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
