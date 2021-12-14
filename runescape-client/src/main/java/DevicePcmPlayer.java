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

@ObfuscatedName("ah")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("c")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("b")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 139243337
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("m")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993652709"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)class339.field4058, 16, SpriteMask.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (SpriteMask.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-865384228"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (SpriteMask.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (Language.method5825(var1) != 1) {
				this.open(SpotAnimationDefinition.method3362(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2142020678"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (SpriteMask.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (SpriteMask.PcmPlayer_stereo) {
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-514018891"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
