import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1416799975
	)
	static int field1326;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)I",
		garbageValue = "-1547709141"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljf;",
		garbageValue = "-28609"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 199
		int var2 = var0 & 65535; // L: 200
		if (WorldMapSection1.Widget_interfaceComponents[var1] == null || WorldMapSection1.Widget_interfaceComponents[var1][var2] == null) { // L: 201
			boolean var3 = class174.loadInterface(var1); // L: 202
			if (!var3) { // L: 203
				return null;
			}
		}

		return WorldMapSection1.Widget_interfaceComponents[var1][var2]; // L: 205
	}
}
