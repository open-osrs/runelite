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

@ObfuscatedName("ap")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("c")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("l")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1555148237
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("e")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)PcmPlayer.field305, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false); // L: 22
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 23
	} // L: 24

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1020940076"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 29
			this.line = (SourceDataLine)AudioSystem.getLine(var2); // L: 30
			this.line.open(); // L: 31
			this.line.start(); // L: 32
			this.capacity2 = var1; // L: 33
		} catch (LineUnavailableException var3) { // L: 35
			if (class9.method67(var1) != 1) { // L: 36
				this.open(GrandExchangeOfferNameComparator.method5702(var1)); // L: 37
			} else {
				this.line = null; // L: 40
				throw var3; // L: 41
			}
		}
	} // L: 38 43

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1)); // L: 47
	}

	@ObfuscatedName("e")
	@Export("write")
	protected void write() {
		int var1 = 256; // L: 53
		if (PcmPlayer.PcmPlayer_stereo) { // L: 54
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) { // L: 55
			int var3 = super.samples[var2]; // L: 56
			if ((var3 + 8388608 & -16777216) != 0) { // L: 57
				var3 = 8388607 ^ var3 >> 31; // L: 58
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8); // L: 60
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16); // L: 61
		}

		this.line.write(this.byteSamples, 0, var1 << 1); // L: 63
	} // L: 64

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-375742034"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) { // L: 68
			this.line.close(); // L: 69
			this.line = null; // L: 70
		}

	} // L: 72

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush(); // L: 76
	} // L: 77
}
