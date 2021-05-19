import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("h")
	long[] field1512;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1004088735
	)
	int field1506;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1832363075
	)
	int field1507;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 315218757111690761L
	)
	long field1508;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -125385855
	)
	int field1509;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1314949819
	)
	int field1510;

	MilliClock() {
		this.field1512 = new long[10]; // L: 7
		this.field1506 = 256; // L: 15
		this.field1507 = 1;
		this.field1509 = 0;
		this.field1508 = Archive.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1512[var1] = this.field1508;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109522039"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1512[var1] = 0L;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "665432073"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1506;
		int var4 = this.field1507;
		this.field1506 = 300; // L: 33
		this.field1507 = 1;
		this.field1508 = Archive.currentTimeMillis(); // L: 35
		if (this.field1512[this.field1510] == 0L) {
			this.field1506 = var3;
			this.field1507 = var4;
		} else if (this.field1508 > this.field1512[this.field1510]) { // L: 40
			this.field1506 = (int)((long)(var1 * 2560) / (this.field1508 - this.field1512[this.field1510]));
		}

		if (this.field1506 < 25) { // L: 41
			this.field1506 = 25;
		}

		if (this.field1506 > 256) { // L: 42
			this.field1506 = 256; // L: 43
			this.field1507 = (int)((long)var1 - (this.field1508 - this.field1512[this.field1510]) / 10L); // L: 44
		}

		if (this.field1507 > var1) { // L: 46
			this.field1507 = var1;
		}

		this.field1512[this.field1510] = this.field1508; // L: 47
		this.field1510 = (this.field1510 + 1) % 10; // L: 48
		int var5;
		if (this.field1507 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1512[var5]) { // L: 51
					this.field1512[var5] += (long)this.field1507;
				}
			}
		}

		if (this.field1507 < var2) { // L: 54
			this.field1507 = var2;
		}

		UrlRequest.sleepExact((long)this.field1507); // L: 55

		for (var5 = 0; this.field1509 < 256; this.field1509 += this.field1506) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1509 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("h")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (0L == var0 % 37L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class305.base37Table[(int)(var6 - var0 * 37L)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}
}
