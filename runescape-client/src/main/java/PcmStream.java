import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("u")
	int field346;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lai;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("w")
	protected abstract int vmethod5260();

	@ObfuscatedName("n")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("o")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ac")
	int vmethod991() {
		return 255;
	}

	@ObfuscatedName("fv")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
