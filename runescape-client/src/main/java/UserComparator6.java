import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)I",
		garbageValue = "2014862906"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfl;B)V",
		garbageValue = "6"
	)
	static final void method2580(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 62
			for (var10 = 0; var10 < 8; ++var10) { // L: 63
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2]; // L: 64
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var13 = new Buffer(var0); // L: 67

		for (var10 = 0; var10 < 4; ++var10) { // L: 68
			for (int var11 = 0; var11 < 64; ++var11) { // L: 69
				for (int var12 = 0; var12 < 64; ++var12) { // L: 70
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 71
						Huffman.loadTerrain(var13, var1, var2 + class143.method2815(var11 & 7, var12 & 7, var7), var3 + class171.method3614(var11 & 7, var12 & 7, var7), 0, 0, var7); // L: 72
					} else {
						Huffman.loadTerrain(var13, 0, -1, -1, 0, 0, 0); // L: 74
					}
				}
			}
		}

	} // L: 78

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-675377144"
	)
	static int method2585(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3547
			Client.logoutTimer = 250; // L: 3548
			return 1; // L: 3549
		} else if (var0 != 5631 && var0 != 5633) { // L: 3551
			if (var0 == 5632) { // L: 3555
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 26; // L: 3556
				return 1; // L: 3557
			} else {
				return 2; // L: 3559
			}
		} else {
			UserComparator9.Interpreter_stringStackSize -= 2; // L: 3552
			return 1; // L: 3553
		}
	}
}
