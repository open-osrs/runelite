import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("d")
	int field335;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("j")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("a")
	protected abstract int vmethod4836();

	@ObfuscatedName("u")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("l")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ar")
	int vmethod972() {
		return 255;
	}

	@ObfuscatedName("fl")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
