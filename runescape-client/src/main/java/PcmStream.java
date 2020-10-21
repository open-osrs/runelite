import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("y")
	int field1520;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("j")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("c")
	protected abstract int vmethod4043();

	@ObfuscatedName("u")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("e")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("aq")
	int vmethod2850() {
		return 255; // L: 16
	}

	@ObfuscatedName("fb")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
