import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;B)I",
		garbageValue = "12"
	)
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgv;S)V",
		garbageValue = "-16264"
	)
	static final void method8020(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					Players.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108
}
