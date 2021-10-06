import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class119 {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		longValue = 1593022172438021303L
	)
	static long field1395;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lon;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -4273243190506141755L
	)
	long field1396;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 49116901
	)
	int field1399;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	IterableNodeDeque field1397;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public class119(Buffer var1) {
		this.field1399 = -1;
		this.field1397 = new IterableNodeDeque();
		this.method2521(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "54600340"
	)
	void method2521(Buffer var1) {
		this.field1396 = var1.readLong();
		this.field1399 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class138(this);
			} else if (var2 == 1) {
				var3 = new class114(this);
			} else if (var2 == 13) {
				var3 = new class131(this);
			} else if (var2 == 4) {
				var3 = new class123(this);
			} else if (var2 == 6) {
				var3 = new class130(this);
			} else if (var2 == 5) {
				var3 = new class115(this);
			} else if (var2 == 2) {
				var3 = new class120(this);
			} else if (var2 == 7) {
				var3 = new class113(this);
			} else if (var2 == 14) {
				var3 = new class117(this);
			} else if (var2 == 8) {
				var3 = new class134(this);
			} else if (var2 == 9) {
				var3 = new class140(this);
			} else if (var2 == 10) {
				var3 = new class126(this);
			} else if (var2 == 11) {
				var3 = new class121(this);
			} else if (var2 == 12) {
				var3 = new class125(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class135(this);
			}

			((class116)var3).vmethod2767(var1);
			this.field1397.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "1587577632"
	)
	public void method2522(ClanSettings var1) {
		if (var1.field1446 == this.field1396 && this.field1399 == var1.field1447) {
			for (class116 var2 = (class116)this.field1397.last(); var2 != null; var2 = (class116)this.field1397.previous()) {
				var2.vmethod2766(var1);
			}

			++var1.field1447;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "63"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + FloorUnderlayDefinition.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + FloorUnderlayDefinition.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + FloorUnderlayDefinition.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
