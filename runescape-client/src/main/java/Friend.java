import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("f")
	boolean field3824;
	@ObfuscatedName("e")
	boolean field3825;

	Friend() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)I",
		garbageValue = "-1323328192"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3824 && !var1.field3824) {
			return -1;
		} else if (!this.field3824 && var1.field3824) {
			return 1;
		} else if (this.field3825 && !var1.field3825) { // L: 18
			return -1;
		} else if (!this.field3825 && var1.field3825) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 24
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)I",
		garbageValue = "-1545273649"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1856875972"
	)
	public static int method5774(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "-1814552496"
	)
	public static final int method5773(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4090) { // L: 19
			case 7:
				return 20; // L: 21
			default:
				return 12; // L: 23
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "-304151220"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10051
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10052
				int var2 = class27.method355(var0, var1); // L: 10053
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10054
				if (var0.cs1Comparisons[var1] == 2) { // L: 10055
					if (var2 >= var3) { // L: 10056
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10058
					if (var2 <= var3) { // L: 10059
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10061
					if (var3 == var2) { // L: 10062
						return false;
					}
				} else if (var3 != var2) { // L: 10064
					return false;
				}
			}

			return true; // L: 10066
		}
	}
}
