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

@ObfuscatedName("ag")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("i")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("w")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1458693003
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("a")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	} // L: 18

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)UserComparator2.field4359, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false); // L: 21
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 22
	} // L: 23

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "122369223"
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
			if (Tile.method4199(var1) != 1) { // L: 34
				int var4 = var1 - 1; // L: 38
				var4 |= var4 >>> 1; // L: 39
				var4 |= var4 >>> 2; // L: 40
				var4 |= var4 >>> 4; // L: 41
				var4 |= var4 >>> 8; // L: 42
				var4 |= var4 >>> 16; // L: 43
				int var3 = var4 + 1; // L: 44
				this.open(var3); // L: 46
			} else {
				this.line = null; // L: 49
				throw var5; // L: 50
			}
		}
	} // L: 47 52

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1689594693"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 55
	}

	@ObfuscatedName("a")
	@Export("write")
	protected void write() {
		int var1 = 256; // L: 60
		if (PcmPlayer.PcmPlayer_stereo) { // L: 61
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) { // L: 62
			int var3 = super.samples[var2]; // L: 63
			if ((var3 + 8388608 & -16777216) != 0) { // L: 64
				var3 = 8388607 ^ var3 >> 31; // L: 65
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8); // L: 67
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16); // L: 68
		}

		this.line.write(this.byteSamples, 0, var1 << 1); // L: 70
	} // L: 71

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1440644043"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) { // L: 74
			this.line.close(); // L: 75
			this.line = null; // L: 76
		}

	} // L: 78

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush(); // L: 81
	} // L: 82
}
