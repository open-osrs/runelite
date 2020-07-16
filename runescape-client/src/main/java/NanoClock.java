import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -6841910125641657071L
	)
	@Export("lastTimeNano")
	long lastTimeNano;

	public NanoClock() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1017447827"
	)
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1786752641"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = (long)var2 * 1000000L;
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		long var7 = var5 / 1000000L;
		if (var7 > 0L) {
			if (0L == var7 % 10L) {
				SpriteMask.sleepExact(var7 - 1L);
				SpriteMask.sleepExact(1L);
			} else {
				SpriteMask.sleepExact(var7);
			}
		}

		long var9 = System.nanoTime();

		int var11;
		for (var11 = 0; var11 < 10 && (var11 < 1 || this.lastTimeNano < var9); this.lastTimeNano += (long)var1 * 1000000L) {
			++var11;
		}

		if (this.lastTimeNano < var9) {
			this.lastTimeNano = var9;
		}

		return var11;
	}
}
