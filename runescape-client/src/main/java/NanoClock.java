import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6745793608477696967L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	NanoClock() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1402657312"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-333181863"
	)
	@Export("wait")
	public int wait(int tickLength, int fiveOrOne) {
		long var3 = 1000000L * (long)fiveOrOne;
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		EnumDefinition.sleepMillis(var5 / 1000000L);
		long var7 = System.nanoTime();

		int var9 = 0;
		while (var9 < 10 && (var9 < 1 || this.lastTimeNano < var7)) {
			++var9;
			this.lastTimeNano += (long)tickLength * 1000000L;
		}

		if (this.lastTimeNano < var7) {
			this.lastTimeNano = var7;
		}

		return var9;
	}
}
