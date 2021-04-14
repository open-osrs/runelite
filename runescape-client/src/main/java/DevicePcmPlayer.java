import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("f")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("o")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1411994739
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("p")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "757289607"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)PcmPlayer.field394, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false); // L: 21
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1868594255"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 27
			this.line = (SourceDataLine)AudioSystem.getLine(var2); // L: 28
			this.line.open(); // L: 29
			this.line.start(); // L: 30
			this.capacity2 = var1; // L: 31
		} catch (LineUnavailableException var7) { // L: 33
			int var4 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765); // L: 37
			var4 = (var4 >>> 2 & 858993459) + (var4 & 858993459); // L: 38
			var4 = (var4 >>> 4) + var4 & 252645135; // L: 39
			var4 += var4 >>> 8; // L: 40
			var4 += var4 >>> 16; // L: 41
			int var3 = var4 & 255; // L: 42
			if (var3 != 1) { // L: 44
				int var6 = var1 - 1; // L: 48
				var6 |= var6 >>> 1; // L: 49
				var6 |= var6 >>> 2; // L: 50
				var6 |= var6 >>> 4; // L: 51
				var6 |= var6 >>> 8; // L: 52
				var6 |= var6 >>> 16; // L: 53
				int var5 = var6 + 1; // L: 54
				this.open(var5); // L: 56
			} else {
				this.line = null; // L: 59
				throw var7; // L: 60
			}
		}
	} // L: 57 62

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1317116866"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 65
	}

	@ObfuscatedName("p")
	@Export("write")
	protected void write() {
		int var1 = 256; // L: 70
		if (PcmPlayer.PcmPlayer_stereo) { // L: 71
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) { // L: 72
			int var3 = super.samples[var2]; // L: 73
			if ((var3 + 8388608 & -16777216) != 0) { // L: 74
				var3 = 8388607 ^ var3 >> 31; // L: 75
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8); // L: 77
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16); // L: 78
		}

		this.line.write(this.byteSamples, 0, var1 << 1); // L: 80
	} // L: 81

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) { // L: 84
			this.line.close(); // L: 85
			this.line = null; // L: 86
		}

	} // L: 88

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush(); // L: 91
	} // L: 92
}
