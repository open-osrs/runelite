import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -528381057
	)
	static int field1999;
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;B)I",
		garbageValue = "0"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "126"
	)
	static final boolean method3592(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 181
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 182
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 183
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 184
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 185
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 186
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 187
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 188
				}
			}
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lbk;IIB)V",
		garbageValue = "-26"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 3784
			int var3 = InterfaceParent.SequenceDefinition_get(var1).field3548; // L: 3785
			if (var3 == 1) { // L: 3786
				var0.sequenceFrame = 0; // L: 3787
				var0.sequenceFrameCycle = 0; // L: 3788
				var0.sequenceDelay = var2; // L: 3789
				var0.field973 = 0; // L: 3790
			}

			if (var3 == 2) { // L: 3792
				var0.field973 = 0; // L: 3793
			}
		} else if (var1 == -1 || var0.sequence == -1 || InterfaceParent.SequenceDefinition_get(var1).field3560 >= InterfaceParent.SequenceDefinition_get(var0.sequence).field3560) { // L: 3796
			var0.sequence = var1; // L: 3797
			var0.sequenceFrame = 0; // L: 3798
			var0.sequenceFrameCycle = 0; // L: 3799
			var0.sequenceDelay = var2; // L: 3800
			var0.field973 = 0; // L: 3801
			var0.field1012 = var0.pathLength; // L: 3802
		}

	} // L: 3804
}
