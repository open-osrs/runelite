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

@ObfuscatedName("bb")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("m")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("o")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1034506245
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("j")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2128910021"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)class237.field3113, 16, Messages.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (Messages.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-14"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (Messages.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var5) {
			if (DynamicObject.method2375(var1) != 1) {
				int var4 = var1 - 1;
				var4 |= var4 >>> 1;
				var4 |= var4 >>> 2;
				var4 |= var4 >>> 4;
				var4 |= var4 >>> 8;
				var4 |= var4 >>> 16;
				int var3 = var4 + 1;
				this.open(var3);
			} else {
				this.line = null;
				throw var5;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1868944096"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (Messages.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("j")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (Messages.PcmPlayer_stereo) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1900446281"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "630637593"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
