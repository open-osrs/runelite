import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class119 {
	@ObfuscatedName("ho")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 1922253905166501201L
	)
	long field1399;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1571580783
	)
	int field1396;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	IterableNodeDeque field1390;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public class119(Buffer var1) {
		this.field1396 = -1; // L: 9
		this.field1390 = new IterableNodeDeque(); // L: 10
		this.method2578(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "113"
	)
	void method2578(Buffer var1) {
		this.field1399 = var1.readLong(); // L: 32
		this.field1396 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class138(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class114(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class131(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class123(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class130(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class115(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class120(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class113(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class117(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class134(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class140(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class126(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class121(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class125(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class135(this);
			}

			((class116)var3).vmethod2847(var1); // L: 53
			this.field1390.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;S)V",
		garbageValue = "12513"
	)
	public void method2577(ClanSettings var1) {
		if (this.field1399 == var1.field1456 && this.field1396 == var1.field1465) { // L: 60
			for (class116 var2 = (class116)this.field1390.last(); var2 != null; var2 = (class116)this.field1390.previous()) { // L: 61
				var2.vmethod2848(var1); // L: 62
			}

			++var1.field1465; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1929405904"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class150.method2965(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}
}
