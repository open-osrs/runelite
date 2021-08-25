import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 1540868815319592249L
	)
	long field3881;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 8333490752624652511L
	)
	long field3880;
	@ObfuscatedName("m")
	public boolean field3889;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 7224061540558797345L
	)
	long field3882;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -3991034196053816945L
	)
	long field3883;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -841860689116779547L
	)
	long field3885;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2006018083
	)
	int field3887;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -312688473
	)
	int field3886;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1260355139
	)
	int field3884;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1879698479
	)
	int field3888;

	public Timer() {
		this.field3881 = -1L;
		this.field3880 = -1L;
		this.field3889 = false;
		this.field3882 = 0L;
		this.field3883 = 0L;
		this.field3885 = 0L;
		this.field3887 = 0;
		this.field3886 = 0;
		this.field3884 = 0;
		this.field3888 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1453973445"
	)
	public void method5821() {
		this.field3881 = Occluder.method4335();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6922"
	)
	public void method5822() {
		if (-1L != this.field3881) {
			this.field3883 = Occluder.method4335() - this.field3881;
			this.field3881 = -1L;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1401008868"
	)
	public void method5827(int var1) {
		this.field3880 = Occluder.method4335();
		this.field3887 = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-995733299"
	)
	public void method5824() {
		if (-1L != this.field3880) {
			this.field3882 = Occluder.method4335() - this.field3880;
			this.field3880 = -1L;
		}

		++this.field3884;
		this.field3889 = true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2079083311"
	)
	public void method5825() {
		this.field3889 = false;
		this.field3886 = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1675975914"
	)
	public void method5826() {
		this.method5824();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-2016175702"
	)
	@Export("write")
	public void write(Buffer var1) {
		UserComparator9.method2439(var1, this.field3883);
		UserComparator9.method2439(var1, this.field3882);
		UserComparator9.method2439(var1, this.field3885);
		var1.writeShort(this.field3887);
		var1.writeShort(this.field3886);
		var1.writeShort(this.field3884);
		var1.writeShort(this.field3888);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1156082253"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return AttackOption.method2254(var0, 10, true);
	}
}
