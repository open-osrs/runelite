import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -87747295156547195L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	public NanoClock() {
		this.lastTimeNano = System.nanoTime(); // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1887937791"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime(); // L: 14
	} // L: 15

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1841090229"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = (long)var2 * 1000000L; // L: 18
		long var5 = this.lastTimeNano - System.nanoTime(); // L: 19
		if (var5 < var3) { // L: 20
			var5 = var3;
		}

		long var7 = var5 / 1000000L; // L: 21
		long var9;
		if (var7 > 0L) { // L: 23
			if (var7 % 10L == 0L) { // L: 24
				var9 = var7 - 1L; // L: 25

				try {
					Thread.sleep(var9); // L: 28
				} catch (InterruptedException var16) { // L: 30
				}

				try {
					Thread.sleep(1L); // L: 34
				} catch (InterruptedException var15) { // L: 36
				}
			} else {
				try {
					Thread.sleep(var7); // L: 41
				} catch (InterruptedException var14) { // L: 43
				}
			}
		}

		var9 = System.nanoTime(); // L: 46

		int var13;
		for (var13 = 0; var13 < 10 && (var13 < 1 || this.lastTimeNano < var9); this.lastTimeNano += 1000000L * (long)var1) { // L: 47 48 50
			++var13; // L: 49
		}

		if (this.lastTimeNano < var9) { // L: 52
			this.lastTimeNano = var9;
		}

		return var13; // L: 53
	}
}
