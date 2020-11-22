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

@ObfuscatedName("bn")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("f")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("b")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1657780029
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("m")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-906788639"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)PcmPlayer.field1442, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false); // L: 21
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 22
	} // L: 23

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 27
			this.line = (SourceDataLine)AudioSystem.getLine(var2); // L: 28
			this.line.open(); // L: 29
			this.line.start(); // L: 30
			this.capacity2 = var1; // L: 31
		} catch (LineUnavailableException var5) { // L: 33
			int var4 = (var1 >>> 1 & 1431655765) + (var1 & 1431655765); // L: 37
			var4 = (var4 >>> 2 & 858993459) + (var4 & 858993459); // L: 38
			var4 = (var4 >>> 4) + var4 & 252645135; // L: 39
			var4 += var4 >>> 8; // L: 40
			var4 += var4 >>> 16; // L: 41
			int var3 = var4 & 255; // L: 42
			if (var3 != 1) { // L: 44
				this.open(WorldMapData_0.method266(var1)); // L: 45
			} else {
				this.line = null; // L: 48
				throw var5; // L: 49
			}
		}
	} // L: 46 51

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612241013"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 54
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() {
		int var1 = 256; // L: 59
		if (PcmPlayer.PcmPlayer_stereo) { // L: 60
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) { // L: 61
			int var3 = super.samples[var2]; // L: 62
			if ((var3 + 8388608 & -16777216) != 0) { // L: 63
				var3 = 8388607 ^ var3 >> 31; // L: 64
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8); // L: 66
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16); // L: 67
		}

		this.line.write(this.byteSamples, 0, var1 << 1); // L: 69
	} // L: 70

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) { // L: 73
			this.line.close(); // L: 74
			this.line = null; // L: 75
		}

	} // L: 77

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1393012391"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush(); // L: 80
	} // L: 81
}
