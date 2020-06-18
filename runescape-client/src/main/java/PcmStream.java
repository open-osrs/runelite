import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Ldf;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("v")
	int field1520;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "()Ldf;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("u")
	protected abstract int vmethod4037();

	@ObfuscatedName("a")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("w")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("af")
	int vmethod2840() {
		return 255;
	}

	@ObfuscatedName("ft")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
