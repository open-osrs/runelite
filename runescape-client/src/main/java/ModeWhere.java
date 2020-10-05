import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2413("", 0, new class200[]{class200.field2401}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2405("", 1, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2406("", 2, new class200[]{class200.field2399, class200.field2402, class200.field2401}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2407("", 3, new class200[]{class200.field2399}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2409("", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2416("", 5, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2410("", 6, new class200[]{class200.field2401}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2411("", 8, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2408("", 9, new class200[]{class200.field2399, class200.field2402}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2404("", 10, new class200[]{class200.field2399}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2414("", 11, new class200[]{class200.field2399}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2415("", 12, new class200[]{class200.field2399, class200.field2401}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	field2412("", 13, new class200[]{class200.field2399});

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1536594685
	)
	final int id;
	@ObfuscatedName("q")
	final Set field2418;

	static {
		method3771(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lgl;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2418 = new HashSet();
		this.id = var4; // L: 43
		class200[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class200 var8 = var6[var7]; // L: 47
			this.field2418.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field2418 = new HashSet();
		this.id = var4; // L: 39
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "385513888"
	)
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgy;",
		garbageValue = "-1051683174"
	)
	static ModeWhere[] method3771() {
		return new ModeWhere[]{field2411, field2407, field2404, field2408, field2409, field2414, field2412, field2415, field2406, field2413, field2410, field2405, field2416};
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "166019854"
	)
	static void method3772() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				Players.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				Players.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lfa;",
		garbageValue = "-839194319"
	)
	public static Clock method3761() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1007074370"
	)
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 105
			int var3 = var0; // L: 107
			String var2;
			if (var1 && var0 >= 0) { // L: 110
				int var4 = 2; // L: 114

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 115 116 118
					var5 /= 10; // L: 117
				}

				char[] var6 = new char[var4]; // L: 120
				var6[0] = '+'; // L: 121

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 122
					int var8 = var3; // L: 123
					var3 /= 10; // L: 124
					int var9 = var8 - var3 * 10; // L: 125
					if (var9 >= 10) { // L: 126
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 127
					}
				}

				var2 = new String(var6); // L: 129
			} else {
				var2 = Integer.toString(var0, 10); // L: 111
			}

			return var2; // L: 131
		} else {
			return Integer.toString(var0);
		}
	}
}
