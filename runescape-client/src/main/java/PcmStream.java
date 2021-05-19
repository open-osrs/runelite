import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("e")
	int field469;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("u")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("v")
	protected abstract int vmethod4560();

	@ObfuscatedName("b")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("i")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("ax")
	int vmethod1044() {
		return 255; // L: 16
	}

	@ObfuscatedName("eg")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
