import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1652344105
	)
	static int field1588;
	@ObfuscatedName("l")
	long[] field1592;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 13513773
	)
	int field1587;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -546197089
	)
	int field1589;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 1648403741631593641L
	)
	long field1586;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2027949555
	)
	int field1590;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1944600771
	)
	int field1591;

	MilliClock() {
		this.field1592 = new long[10];
		this.field1587 = 256;
		this.field1589 = 1;
		this.field1590 = 0;
		this.field1586 = UserComparator4.method2406();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1592[var1] = this.field1586;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-973245062"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1592[var1] = 0L;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "904483746"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1587;
		int var4 = this.field1589;
		this.field1587 = 300;
		this.field1589 = 1;
		this.field1586 = UserComparator4.method2406();
		if (this.field1592[this.field1591] == 0L) {
			this.field1587 = var3;
			this.field1589 = var4;
		} else if (this.field1586 > this.field1592[this.field1591]) {
			this.field1587 = (int)((long)(var1 * 2560) / (this.field1586 - this.field1592[this.field1591]));
		}

		if (this.field1587 < 25) {
			this.field1587 = 25;
		}

		if (this.field1587 > 256) {
			this.field1587 = 256;
			this.field1589 = (int)((long)var1 - (this.field1586 - this.field1592[this.field1591]) / 10L);
		}

		if (this.field1589 > var1) {
			this.field1589 = var1;
		}

		this.field1592[this.field1591] = this.field1586;
		this.field1591 = (this.field1591 + 1) % 10;
		int var5;
		if (this.field1589 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1592[var5]) {
					this.field1592[var5] += (long)this.field1589;
				}
			}
		}

		if (this.field1589 < var2) {
			this.field1589 = var2;
		}

		class121.method2542((long)this.field1589);

		for (var5 = 0; this.field1590 < 256; this.field1590 += this.field1587) {
			++var5;
		}

		this.field1590 &= 255;
		return var5;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1031571888"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "152507441"
	)
	public static void method2858() {
		WorldMapElement.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-1575464478"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class124.method2560(class13.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
