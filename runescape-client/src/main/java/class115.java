import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class115 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lpb;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -671595341
	)
	public final int field1395;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	public class115 field1388;
	@ObfuscatedName("i")
	float[][] field1385;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	final class387[] field1386;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	class387[] field1387;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	class387[] field1383;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	class387 field1389;
	@ObfuscatedName("l")
	boolean field1392;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	class387 field1384;
	@ObfuscatedName("o")
	boolean field1391;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	class387 field1393;
	@ObfuscatedName("p")
	float[][] field1394;
	@ObfuscatedName("w")
	float[][] field1390;
	@ObfuscatedName("k")
	float[][] field1396;

	@ObfuscatedSignature(
		descriptor = "(ILpi;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1389 = new class387(); // L: 13
		this.field1392 = true; // L: 14
		this.field1384 = new class387(); // L: 15
		this.field1391 = true; // L: 16
		this.field1393 = new class387(); // L: 17
		this.field1395 = var2.readShort(); // L: 23
		this.field1386 = new class387[var1]; // L: 24
		this.field1387 = new class387[this.field1386.length]; // L: 25
		this.field1383 = new class387[this.field1386.length]; // L: 26
		this.field1385 = new float[this.field1386.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1386.length; ++var4) { // L: 28
			this.field1386[var4] = new class387(var2, var3); // L: 29
			this.field1385[var4][0] = var2.method7681(); // L: 30
			this.field1385[var4][1] = var2.method7681(); // L: 31
			this.field1385[var4][2] = var2.method7681(); // L: 32
		}

		this.method2664(); // L: 34
	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	void method2664() {
		this.field1394 = new float[this.field1386.length][3]; // L: 38
		this.field1390 = new float[this.field1386.length][3]; // L: 39
		this.field1396 = new float[this.field1386.length][3]; // L: 40
		class387 var1;
		synchronized(class387.field4346) { // L: 43
			if (class387.field4347 == 0) { // L: 44
				var1 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011(); // L: 46
				var1 = class387.field4346[class387.field4347]; // L: 47
			}
		}

		class387 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1386.length; ++var5) { // L: 52
			class387 var4 = this.method2665(var5); // L: 53
			var2.method7032(var4); // L: 54
			var2.method7021(); // L: 55
			this.field1394[var5] = var2.method7010(); // L: 56
			this.field1390[var5][0] = var4.field4348[12]; // L: 57
			this.field1390[var5][1] = var4.field4348[13]; // L: 58
			this.field1390[var5][2] = var4.field4348[14]; // L: 59
			this.field1396[var5] = var4.method7023(); // L: 60
		}

		var2.method7029(); // L: 62
	} // L: 63

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "1022205323"
	)
	class387 method2665(int var1) {
		return this.field1386[var1]; // L: 66
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnt;",
		garbageValue = "85"
	)
	class387 method2666(int var1) {
		if (this.field1387[var1] == null) { // L: 70
			this.field1387[var1] = new class387(this.method2665(var1)); // L: 71
			if (this.field1388 != null) { // L: 72
				this.field1387[var1].method7017(this.field1388.method2666(var1)); // L: 73
			} else {
				this.field1387[var1].method7017(class387.field4345); // L: 76
			}
		}

		return this.field1387[var1]; // L: 79
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "-1203957232"
	)
	class387 method2667(int var1) {
		if (this.field1383[var1] == null) { // L: 83
			this.field1383[var1] = new class387(this.method2666(var1)); // L: 84
			this.field1383[var1].method7021(); // L: 85
		}

		return this.field1383[var1]; // L: 87
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "2046672010"
	)
	void method2676(class387 var1) {
		this.field1389.method7032(var1); // L: 91
		this.field1392 = true; // L: 92
		this.field1391 = true; // L: 93
	} // L: 94

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lnt;",
		garbageValue = "54"
	)
	class387 method2678() {
		return this.field1389; // L: 97
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lnt;",
		garbageValue = "-12"
	)
	class387 method2669() {
		if (this.field1392) { // L: 101
			this.field1384.method7032(this.method2678()); // L: 102
			if (this.field1388 != null) { // L: 103
				this.field1384.method7017(this.field1388.method2669()); // L: 104
			}

			this.field1392 = false; // L: 106
		}

		return this.field1384; // L: 108
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnt;",
		garbageValue = "-47"
	)
	public class387 method2671(int var1) {
		if (this.field1391) { // L: 112
			this.field1393.method7032(this.method2667(var1)); // L: 113
			this.field1393.method7017(this.method2669()); // L: 114
			this.field1391 = false; // L: 115
		}

		return this.field1393; // L: 117
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-101383971"
	)
	float[] method2672(int var1) {
		return this.field1394[var1]; // L: 121
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-748184127"
	)
	float[] method2673(int var1) {
		return this.field1390[var1]; // L: 125
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "9"
	)
	float[] method2674(int var1) {
		return this.field1396[var1]; // L: 129
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lim;",
		garbageValue = "1491781541"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 322
		if (var1 != null) { // L: 323
			return var1;
		} else {
			var1 = HealthBarUpdate.method2185(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 324
			if (var1 != null) { // L: 325
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 326
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "246529128"
	)
	static final void method2680(int var0) {
		if (class155.loadInterface(var0)) { // L: 11936
			class119.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1); // L: 11937
		}
	} // L: 11938

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2141464292"
	)
	static void method2684() {
		if (VarcInt.field1841 != null) { // L: 12649
			Client.field779 = Client.cycle; // L: 12650
			VarcInt.field1841.method6057(); // L: 12651

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12652
				if (Client.players[var0] != null) { // L: 12653
					VarcInt.field1841.method6044((Client.players[var0].x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX, (Client.players[var0].y >> 7) + VarcInt.baseY); // L: 12654
				}
			}
		}

	} // L: 12658
}
