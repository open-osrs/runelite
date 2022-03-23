import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I",
		garbageValue = "2079735474"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method2600(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 230 231
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Lkn;",
		garbageValue = "-750472197"
	)
	static Widget method2601(Widget var0) {
		int var1 = class270.method5241(WorldMapSection2.getWidgetFlags(var0)); // L: 11793
		if (var1 == 0) { // L: 11794
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 11795
				var0 = HorizontalAlignment.getWidget(var0.parentId); // L: 11796
				if (var0 == null) { // L: 11797
					return null;
				}
			}

			return var0; // L: 11799
		}
	}
}
