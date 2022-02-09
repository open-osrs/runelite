import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("w")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("c")
	long[] field1725;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 793127537
	)
	int field1723;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2097716395
	)
	int field1722;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -9075716537403747691L
	)
	long field1728;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 652468747
	)
	int field1726;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -790386425
	)
	int field1727;

	public MilliClock() {
		this.field1725 = new long[10]; // L: 7
		this.field1723 = 256; // L: 15
		this.field1722 = 1; // L: 16
		this.field1726 = 0; // L: 17
		this.field1728 = DirectByteArrayCopier.method5318(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1725[var1] = this.field1728; // L: 20
		}

	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049179835"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1725[var1] = 0L; // L: 26
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-113"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1723;
		int var4 = this.field1722; // L: 32
		this.field1723 = 300; // L: 33
		this.field1722 = 1;
		this.field1728 = DirectByteArrayCopier.method5318(); // L: 35
		if (0L == this.field1725[this.field1727]) {
			this.field1723 = var3; // L: 37
			this.field1722 = var4; // L: 38
		} else if (this.field1728 > this.field1725[this.field1727]) { // L: 40
			this.field1723 = (int)((long)(var1 * 2560) / (this.field1728 - this.field1725[this.field1727]));
		}

		if (this.field1723 < 25) { // L: 41
			this.field1723 = 25;
		}

		if (this.field1723 > 256) { // L: 42
			this.field1723 = 256; // L: 43
			this.field1722 = (int)((long)var1 - (this.field1728 - this.field1725[this.field1727]) / 10L);
		}

		if (this.field1722 > var1) { // L: 46
			this.field1722 = var1;
		}

		this.field1725[this.field1727] = this.field1728; // L: 47
		this.field1727 = (this.field1727 + 1) % 10; // L: 48
		int var5;
		if (this.field1722 > 1) {
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1725[var5]) { // L: 51
					this.field1725[var5] += (long)this.field1722;
				}
			}
		}

		if (this.field1722 < var2) {
			this.field1722 = var2;
		}

		Language.method5813((long)this.field1722); // L: 55

		for (var5 = 0; this.field1726 < 256; this.field1726 += this.field1723) { // L: 56 57 59
			++var5;
		}

		this.field1726 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1844077463"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class29.field175.startsWith("win")) { // L: 36
				UrlRequester.method2419(var0, 0, "openjs"); // L: 39
			} else if (class29.field175.startsWith("mac")) { // L: 44
				UrlRequester.method2419(var0, 1, "openjs"); // L: 45
			} else {
				UrlRequester.method2419(var0, 2, "openjs"); // L: 49
			}
		} else {
			UrlRequester.method2419(var0, 3, "openjs"); // L: 54
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method3115(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 29
	}
}
