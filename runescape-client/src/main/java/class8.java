import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class8 implements Callable {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1988326555
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	final Buffer field35;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class12 field32;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lz;Lkj;Lm;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1; // L: 47
		this.field35 = var2; // L: 48
		this.field32 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field32.vmethod123(this.field35); // L: 53
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-497960753"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Z",
		garbageValue = "-2010469963"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 9587
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 9588
				int var2 = HealthBarDefinition.method4512(var0, var1); // L: 9589
				int var3 = var0.cs1ComparisonValues[var1]; // L: 9590
				if (var0.cs1Comparisons[var1] == 2) { // L: 9591
					if (var2 >= var3) { // L: 9592
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 9594
					if (var2 <= var3) { // L: 9595
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 9597
					if (var2 == var3) { // L: 9598
						return false;
					}
				} else if (var3 != var2) { // L: 9600
					return false;
				}
			}

			return true; // L: 9602
		}
	}
}
