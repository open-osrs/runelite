import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("x")
	int field335;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("a")
	protected abstract int vmethod4889();

	@ObfuscatedName("e")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("y")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("aq")
	int vmethod944() {
		return 255;
	}

	@ObfuscatedName("ei")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
