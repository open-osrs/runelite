import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("s")
	long[] field1501;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1604146545
	)
	int field1499;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 297982951
	)
	int field1500;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 6545994804951437021L
	)
	long field1502;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 955506643
	)
	int field1504;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1688753709
	)
	int field1503;

	public MilliClock() {
		this.field1501 = new long[10];
		this.field1499 = 256;
		this.field1500 = 1;
		this.field1504 = 0;
		this.field1502 = UrlRequester.method2125();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1501[var1] = this.field1502;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-296506208"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1501[var1] = 0L;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2079435375"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1499;
		int var4 = this.field1500;
		this.field1499 = 300;
		this.field1500 = 1;
		this.field1502 = UrlRequester.method2125();
		if (this.field1501[this.field1503] == 0L) {
			this.field1499 = var3;
			this.field1500 = var4;
		} else if (this.field1502 > this.field1501[this.field1503]) {
			this.field1499 = (int)((long)(var1 * 2560) / (this.field1502 - this.field1501[this.field1503]));
		}

		if (this.field1499 < 25) {
			this.field1499 = 25;
		}

		if (this.field1499 > 256) {
			this.field1499 = 256;
			this.field1500 = (int)((long)var1 - (this.field1502 - this.field1501[this.field1503]) / 10L);
		}

		if (this.field1500 > var1) {
			this.field1500 = var1;
		}

		this.field1501[this.field1503] = this.field1502;
		this.field1503 = (this.field1503 + 1) % 10;
		int var5;
		if (this.field1500 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1501[var5]) {
					this.field1501[var5] += (long)this.field1500;
				}
			}
		}

		if (this.field1500 < var2) {
			this.field1500 = var2;
		}

		SceneTilePaint.method4322((long)this.field1500);

		for (var5 = 0; this.field1504 < 256; this.field1504 += this.field1499) {
			++var5;
		}

		this.field1504 &= 255;
		return var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1037668761"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = NPC.getPreferencesFile("", MouseRecorder.field975.name, true);
			Buffer var1 = Decimator.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	public static void method2671() {
		StructComposition.StructDefinition_cached.clear();
	}
}
