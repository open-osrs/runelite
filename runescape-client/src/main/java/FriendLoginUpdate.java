import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lfb;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1885881665
	)
	public int field3667;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("p")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		signature = "(Lkq;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3667 = (int)(MilliClock.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgz;I)I",
		garbageValue = "1283981780"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = ModelData0.method3374(var9);
			var8 = ModelData0.method3374(var10);
			var9 = Frames.standardizeChar(var9, var2);
			var10 = Frames.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class1.lowercaseChar(var9, var2) - class1.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class1.lowercaseChar(var11, var2) - class1.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return class1.lowercaseChar(var12, var2) - class1.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}
}
