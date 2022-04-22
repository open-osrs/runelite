import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("v")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("c")
	@Export("samples")
	public byte[] samples;
	@ObfuscatedName("i")
	@Export("start")
	public int start;
	@ObfuscatedName("f")
	@Export("end")
	int end;
	@ObfuscatedName("b")
	public boolean field254;

	RawSound(int var1, byte[] var2, int var3, int var4) {
		this.sampleRate = var1; // L: 13
		this.samples = var2; // L: 14
		this.start = var3; // L: 15
		this.end = var4; // L: 16
	} // L: 17

	RawSound(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.sampleRate = var1; // L: 20
		this.samples = var2; // L: 21
		this.start = var3; // L: 22
		this.end = var4; // L: 23
		this.field254 = var5; // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Las;)Lat;"
	)
	@Export("resample")
	public RawSound resample(Decimator var1) {
		this.samples = var1.resample(this.samples); // L: 28
		this.sampleRate = var1.scaleRate(this.sampleRate); // L: 29
		if (this.start == this.end) { // L: 30
			this.start = this.end = var1.scalePosition(this.start);
		} else {
			this.start = var1.scalePosition(this.start); // L: 32
			this.end = var1.scalePosition(this.end); // L: 33
			if (this.start == this.end) { // L: 34
				--this.start;
			}
		}

		return this; // L: 36
	}
}
