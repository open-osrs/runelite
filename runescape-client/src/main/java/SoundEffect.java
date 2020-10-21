import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("SoundEffect")
public class SoundEffect {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	@Export("instruments")
	Instrument[] instruments;
	@ObfuscatedName("l")
	@Export("start")
	int start;
	@ObfuscatedName("m")
	@Export("end")
	int end;

	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	SoundEffect(Buffer var1) {
		this.instruments = new Instrument[10]; // L: 10

		for (int var2 = 0; var2 < 10; ++var2) { // L: 21
			int var3 = var1.readUnsignedByte(); // L: 22
			if (var3 != 0) { // L: 23
				--var1.offset; // L: 24
				this.instruments[var2] = new Instrument(); // L: 25
				this.instruments[var2].decode(var1); // L: 26
			}
		}

		this.start = var1.readUnsignedShort(); // L: 28
		this.end = var1.readUnsignedShort(); // L: 29
	} // L: 30

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "()Ldo;"
	)
	@Export("toRawSound")
	public RawSound toRawSound() {
		byte[] var1 = this.mix(); // L: 33
		return new RawSound(22050, var1, this.start * 22050 / 1000, this.end * 22050 / 1000); // L: 34
	}

	@ObfuscatedName("l")
	@Export("calculateDelay")
	public final int calculateDelay() {
		int var1 = 9999999; // L: 38

		int var2;
		for (var2 = 0; var2 < 10; ++var2) { // L: 39
			if (this.instruments[var2] != null && this.instruments[var2].offset / 20 < var1) { // L: 40 41
				var1 = this.instruments[var2].offset / 20;
			}
		}

		if (this.start < this.end && this.start / 20 < var1) { // L: 44
			var1 = this.start / 20;
		}

		if (var1 != 9999999 && var1 != 0) { // L: 45
			for (var2 = 0; var2 < 10; ++var2) { // L: 46
				if (this.instruments[var2] != null) {
					Instrument var10000 = this.instruments[var2];
					var10000.offset -= var1 * 20; // L: 47
				}
			}

			if (this.start < this.end) { // L: 49
				this.start -= var1 * 20; // L: 50
				this.end -= var1 * 20; // L: 51
			}

			return var1; // L: 53
		} else {
			return 0;
		}
	}

	@ObfuscatedName("m")
	@Export("mix")
	final byte[] mix() {
		int var1 = 0; // L: 57

		int var2;
		for (var2 = 0; var2 < 10; ++var2) { // L: 58
			if (this.instruments[var2] != null && this.instruments[var2].duration + this.instruments[var2].offset > var1) { // L: 59 60
				var1 = this.instruments[var2].duration + this.instruments[var2].offset;
			}
		}

		if (var1 == 0) { // L: 63
			return new byte[0];
		} else {
			var2 = var1 * 22050 / 1000; // L: 64
			byte[] var3 = new byte[var2]; // L: 65

			for (int var4 = 0; var4 < 10; ++var4) { // L: 66
				if (this.instruments[var4] != null) { // L: 67
					int var5 = this.instruments[var4].duration * 22050 / 1000; // L: 68
					int var6 = this.instruments[var4].offset * 22050 / 1000; // L: 69
					int[] var7 = this.instruments[var4].synthesize(var5, this.instruments[var4].duration); // L: 70

					for (int var8 = 0; var8 < var5; ++var8) { // L: 71
						int var9 = (var7[var8] >> 8) + var3[var8 + var6]; // L: 72
						if ((var9 + 128 & -256) != 0) { // L: 73
							var9 = var9 >> 31 ^ 127;
						}

						var3[var8 + var6] = (byte)var9; // L: 74
					}
				}
			}

			return var3; // L: 78
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;II)Ldq;"
	)
	@Export("readSoundEffect")
	public static SoundEffect readSoundEffect(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 15
		return var3 == null ? null : new SoundEffect(new Buffer(var3)); // L: 16
	}
}
