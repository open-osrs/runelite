import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 4167164667386910969L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	public NanoClock() {
		this.lastTimeNano = System.nanoTime(); // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095078818"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime(); // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-680717242"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = 1000000L * (long)var2; // L: 18
		long var5 = this.lastTimeNano - System.nanoTime(); // L: 19
		if (var5 < var3) { // L: 20
			var5 = var3;
		}

		class236.sleepExact(var5 / 1000000L); // L: 21
		long var7 = System.nanoTime(); // L: 22

		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || this.lastTimeNano < var7); this.lastTimeNano += (long)var1 * 1000000L) { // L: 23 24 26
			++var9; // L: 25
		}

		if (this.lastTimeNano < var7) { // L: 28
			this.lastTimeNano = var7;
		}

		return var9; // L: 29
	}
}
