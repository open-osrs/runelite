import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 593799609
	)
	static int field4239;
	@ObfuscatedName("fh")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 6252735517652003957L
	)
	long field4243;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6672603263529714973L
	)
	long field4234;
	@ObfuscatedName("l")
	public boolean field4235;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 3502493809847278955L
	)
	long field4233;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 1482756365689687747L
	)
	long field4237;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 6358858334505222211L
	)
	long field4238;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1223349955
	)
	int field4242;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2005745533
	)
	int field4240;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 677343331
	)
	int field4241;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2040849017
	)
	int field4236;

	public Timer() {
		this.field4243 = -1L; // L: 7
		this.field4234 = -1L; // L: 8
		this.field4235 = false; // L: 9
		this.field4233 = 0L; // L: 10
		this.field4237 = 0L; // L: 11
		this.field4238 = 0L; // L: 12
		this.field4242 = 0; // L: 13
		this.field4240 = 0; // L: 14
		this.field4241 = 0; // L: 15
		this.field4236 = 0; // L: 16
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1914622703"
	)
	public void method6374() {
		this.field4243 = class113.method2624(); // L: 19
	} // L: 20

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "521585779"
	)
	public void method6375() {
		if (-1L != this.field4243) { // L: 23
			this.field4237 = class113.method2624() - this.field4243; // L: 24
			this.field4243 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "744646168"
	)
	public void method6369(int var1) {
		this.field4234 = class113.method2624(); // L: 30
		this.field4242 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-689161961"
	)
	public void method6370() {
		if (this.field4234 != -1L) { // L: 35
			this.field4233 = class113.method2624() - this.field4234; // L: 36
			this.field4234 = -1L; // L: 37
		}

		++this.field4241; // L: 39
		this.field4235 = true; // L: 40
	} // L: 41

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-607387453"
	)
	public void method6371() {
		this.field4235 = false; // L: 44
		this.field4240 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1431625813"
	)
	public void method6372() {
		this.method6370(); // L: 49
	} // L: 50

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "393397012"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4237; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4233; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4238; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4242); // L: 74
		var1.writeShort(this.field4240); // L: 75
		var1.writeShort(this.field4241); // L: 76
		var1.writeShort(this.field4236); // L: 77
	} // L: 78

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;Llp;Llp;I)V",
		garbageValue = "-1059775601"
	)
	public static void method6381(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		class134.Widget_archive = var0; // L: 220
		class162.Widget_modelsArchive = var1; // L: 221
		WorldMapCacheName.Widget_spritesArchive = var2; // L: 222
		class93.Widget_fontsArchive = var3; // L: 223
		NetSocket.Widget_interfaceComponents = new Widget[class134.Widget_archive.getGroupCount()][]; // L: 224
		class120.Widget_loadedInterfaces = new boolean[class134.Widget_archive.getGroupCount()]; // L: 225
	} // L: 226
}
