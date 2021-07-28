import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("e")
	int field253;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("f")
	protected abstract int vmethod4662();

	@ObfuscatedName("o")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("r")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ak")
	int vmethod716() {
		return 255;
	}

	@ObfuscatedName("fz")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
