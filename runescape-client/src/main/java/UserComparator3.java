import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "-1086029817"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "1334244983"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10091
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10092
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10093
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10094
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10095
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10096
		}

		if (var0.yAlignment == 0) { // L: 10097
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10098
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10099
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10100
		} else if (var0.yAlignment == 4) { // L: 10101
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10102
		}

	} // L: 10103
}
