import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class65 {
	@ObfuscatedName("o")
	static final BigInteger field822;
	@ObfuscatedName("g")
	static final BigInteger field823;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1036778265
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		field822 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field823 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2099438942"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 61
		if (var0 < 0 || var0 >= 65536) { // L: 62
			var0 >>>= 16; // L: 63
			var1 += 16; // L: 64
		}

		if (var0 >= 256) { // L: 66
			var0 >>>= 8; // L: 67
			var1 += 8; // L: 68
		}

		if (var0 >= 16) { // L: 70
			var0 >>>= 4; // L: 71
			var1 += 4; // L: 72
		}

		if (var0 >= 4) { // L: 74
			var0 >>>= 2; // L: 75
			var1 += 2; // L: 76
		}

		if (var0 >= 1) { // L: 78
			var0 >>>= 1; // L: 79
			++var1; // L: 80
		}

		return var0 + var1; // L: 82
	}
}
