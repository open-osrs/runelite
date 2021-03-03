import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("f")
	int field1511;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("e")
	protected abstract int vmethod4099();

	@ObfuscatedName("q")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("s")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bi")
	int vmethod2880() {
		return 255; // L: 16
	}

	@ObfuscatedName("em")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
