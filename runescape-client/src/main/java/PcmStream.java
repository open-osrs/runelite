import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("q")
	int field454;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("v")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("g")
	protected abstract int vmethod4124();

	@ObfuscatedName("h")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("l")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("af")
	int vmethod1039() {
		return 255; // L: 16
	}

	@ObfuscatedName("ef")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
