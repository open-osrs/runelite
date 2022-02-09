import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 7666449776100644517L
	)
	long field4091;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 7643972614193275521L
	)
	long field4086;
	@ObfuscatedName("s")
	public boolean field4087;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 2147518401873365381L
	)
	long field4088;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 7978551471441627079L
	)
	long field4089;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -7821732314937529085L
	)
	long field4085;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1729935737
	)
	int field4090;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -861607359
	)
	int field4097;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -936537631
	)
	int field4093;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1497729987
	)
	int field4094;

	public Timer() {
		this.field4091 = -1L; // L: 7
		this.field4086 = -1L; // L: 8
		this.field4087 = false; // L: 9
		this.field4088 = 0L; // L: 10
		this.field4089 = 0L; // L: 11
		this.field4085 = 0L; // L: 12
		this.field4090 = 0; // L: 13
		this.field4097 = 0; // L: 14
		this.field4093 = 0; // L: 15
		this.field4094 = 0; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204571477"
	)
	public void method6230() {
		this.field4091 = DirectByteArrayCopier.method5318(); // L: 19
	} // L: 20

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142280170"
	)
	public void method6243() {
		if (this.field4091 != -1L) { // L: 23
			this.field4089 = DirectByteArrayCopier.method5318() - this.field4091; // L: 24
			this.field4091 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1216107861"
	)
	public void method6232(int var1) {
		this.field4086 = DirectByteArrayCopier.method5318(); // L: 30
		this.field4090 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	public void method6240() {
		if (this.field4086 != -1L) { // L: 35
			this.field4088 = DirectByteArrayCopier.method5318() - this.field4086; // L: 36
			this.field4086 = -1L; // L: 37
		}

		++this.field4093; // L: 39
		this.field4087 = true; // L: 40
	} // L: 41

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1652628938"
	)
	public void method6234() {
		this.field4087 = false; // L: 44
		this.field4097 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1956304109"
	)
	public void method6235() {
		this.method6240(); // L: 49
	} // L: 50

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "105"
	)
	@Export("write")
	public void write(Buffer var1) {
		NetFileRequest.method5573(var1, this.field4089); // L: 53
		NetFileRequest.method5573(var1, this.field4088); // L: 54
		NetFileRequest.method5573(var1, this.field4085); // L: 55
		var1.writeShort(this.field4090); // L: 56
		var1.writeShort(this.field4097); // L: 57
		var1.writeShort(this.field4093); // L: 58
		var1.writeShort(this.field4094); // L: 59
	} // L: 60
}
