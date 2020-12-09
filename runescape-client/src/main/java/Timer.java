import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 3770281443563997935L
	)
	long field3620;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -2250207918034291381L
	)
	long field3616;
	@ObfuscatedName("x")
	public boolean field3614;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -2802156095156479445L
	)
	long field3615;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -1144199365391722153L
	)
	long field3622;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6579691889222792449L
	)
	long field3613;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121997523
	)
	int field3618;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1353523553
	)
	int field3619;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1070107525
	)
	int field3612;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1445210843
	)
	int field3621;

	public Timer() {
		this.field3620 = -1L;
		this.field3616 = -1L;
		this.field3614 = false;
		this.field3615 = 0L;
		this.field3622 = 0L;
		this.field3613 = 0L;
		this.field3618 = 0;
		this.field3619 = 0;
		this.field3612 = 0;
		this.field3621 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	public void method5010() {
		this.field3620 = class298.currentTimeMillis();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1990101755"
	)
	public void method5018() {
		if (-1L != this.field3620) {
			this.field3622 = class298.currentTimeMillis() - this.field3620;
			this.field3620 = -1L;
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	public void method5033(int var1) {
		this.field3616 = class298.currentTimeMillis();
		this.field3618 = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "820461529"
	)
	public void method5013() {
		if (this.field3616 != -1L) {
			this.field3615 = class298.currentTimeMillis() - this.field3616;
			this.field3616 = -1L;
		}

		++this.field3612;
		this.field3614 = true;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method5014() {
		this.field3614 = false;
		this.field3619 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-105042609"
	)
	public void method5015() {
		this.method5013();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1266632335"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3622;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3615;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3613;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3618);
		var1.writeShort(this.field3619);
		var1.writeShort(this.field3612);
		var1.writeShort(this.field3621);
	}
}
