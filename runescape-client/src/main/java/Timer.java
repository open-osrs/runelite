import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -1068147205
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -3244593562421258965L
	)
	long field4174;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 1641413866718548925L
	)
	long field4172;
	@ObfuscatedName("i")
	public boolean field4179;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 7215038072955031607L
	)
	long field4173;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -4614957419067559229L
	)
	long field4175;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -584897100758161969L
	)
	long field4171;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 225650281
	)
	int field4177;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -648366881
	)
	int field4178;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -809978943
	)
	int field4176;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1244988383
	)
	int field4180;

	public Timer() {
		this.field4174 = -1L; // L: 7
		this.field4172 = -1L; // L: 8
		this.field4179 = false; // L: 9
		this.field4173 = 0L; // L: 10
		this.field4175 = 0L; // L: 11
		this.field4171 = 0L; // L: 12
		this.field4177 = 0; // L: 13
		this.field4178 = 0; // L: 14
		this.field4176 = 0; // L: 15
		this.field4180 = 0; // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6574() {
		this.field4174 = class136.method2931(); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "369845371"
	)
	public void method6562() {
		if (this.field4174 != -1L) { // L: 23
			this.field4175 = class136.method2931() - this.field4174; // L: 24
			this.field4174 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-52559849"
	)
	public void method6563(int var1) {
		this.field4172 = class136.method2931(); // L: 30
		this.field4177 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-929974829"
	)
	public void method6564() {
		if (this.field4172 != -1L) { // L: 35
			this.field4173 = class136.method2931() - this.field4172; // L: 36
			this.field4172 = -1L; // L: 37
		}

		++this.field4176; // L: 39
		this.field4179 = true; // L: 40
	} // L: 41

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	public void method6580() {
		this.field4179 = false; // L: 44
		this.field4178 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1687652356"
	)
	public void method6566() {
		this.method6564(); // L: 49
	} // L: 50

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-598240073"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4175; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4173; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4171; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4177); // L: 74
		var1.writeShort(this.field4178); // L: 75
		var1.writeShort(this.field4176); // L: 76
		var1.writeShort(this.field4180); // L: 77
	} // L: 78
}
