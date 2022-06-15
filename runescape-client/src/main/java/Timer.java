import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -18121781
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -7534706657050485889L
	)
	long field4229;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -5833618965012635637L
	)
	long field4222;
	@ObfuscatedName("q")
	public boolean field4223;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 3038728060957111589L
	)
	long field4225;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6534297593738218343L
	)
	long field4224;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -6100054900427269931L
	)
	long field4226;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1919878609
	)
	int field4230;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 804777017
	)
	int field4228;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 100565155
	)
	int field4227;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2082864779
	)
	int field4221;

	public Timer() {
		this.field4229 = -1L; // L: 7
		this.field4222 = -1L; // L: 8
		this.field4223 = false; // L: 9
		this.field4225 = 0L; // L: 10
		this.field4224 = 0L; // L: 11
		this.field4226 = 0L; // L: 12
		this.field4230 = 0; // L: 13
		this.field4228 = 0; // L: 14
		this.field4227 = 0; // L: 15
		this.field4221 = 0; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2014926456"
	)
	public void method6509() {
		this.field4229 = class115.method2692(); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107977295"
	)
	public void method6510() {
		if (-1L != this.field4229) { // L: 23
			this.field4224 = class115.method2692() - this.field4229; // L: 24
			this.field4229 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method6528(int var1) {
		this.field4222 = class115.method2692(); // L: 30
		this.field4230 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-869956596"
	)
	public void method6511() {
		if (-1L != this.field4222) { // L: 35
			this.field4225 = class115.method2692() - this.field4222; // L: 36
			this.field4222 = -1L; // L: 37
		}

		++this.field4227; // L: 39
		this.field4223 = true; // L: 40
	} // L: 41

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "665300300"
	)
	public void method6513() {
		this.field4223 = false; // L: 44
		this.field4228 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "29951237"
	)
	public void method6514() {
		this.method6511(); // L: 49
	} // L: 50

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1160086305"
	)
	@Export("write")
	public void write(Buffer var1) {
		FloorOverlayDefinition.method3822(var1, this.field4224); // L: 53
		FloorOverlayDefinition.method3822(var1, this.field4225); // L: 54
		FloorOverlayDefinition.method3822(var1, this.field4226); // L: 55
		var1.writeShort(this.field4230); // L: 56
		var1.writeShort(this.field4228); // L: 57
		var1.writeShort(this.field4227); // L: 58
		var1.writeShort(this.field4221); // L: 59
	} // L: 60
}
