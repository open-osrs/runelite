import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bu")
	public static String field3306;
	@ObfuscatedName("cu")
	public static String field3327;
	@ObfuscatedName("jy")
	public static String field3503;
	@ObfuscatedName("jg")
	public static String field3504;
	@ObfuscatedName("jp")
	public static String field3505;

	static {
		field3306 = "Please visit the support page for assistance."; // L: 60
		field3327 = "Please visit the support page for assistance."; // L: 99
		field3503 = ""; // L: 275
		field3504 = "Page has opened in a new window."; // L: 276
		field3505 = "(Please check your popup blocker.)"; // L: 277
	} // L: 307

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1661416870"
	)
	static final void method4850(Actor var0) {
		if (var0.field1289 != 0) { // L: 3758
			if (var0.targetIndex != -1) { // L: 3759
				Object var1 = null; // L: 3760
				if (var0.targetIndex < 32768) { // L: 3761
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3762
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 3763
					int var2 = var0.x - ((Actor)var1).x; // L: 3764
					int var3 = var0.y - ((Actor)var1).y; // L: 3765
					if (var2 != 0 || var3 != 0) { // L: 3766
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3768
					var0.targetIndex = -1; // L: 3769
					var0.false0 = false; // L: 3770
				}
			}

			if (var0.field1264 != -1 && (var0.pathLength == 0 || var0.field1294 > 0)) { // L: 3773
				var0.orientation = var0.field1264; // L: 3774
				var0.field1264 = -1; // L: 3775
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 3777
			if (var4 == 0 && var0.false0) { // L: 3778
				var0.targetIndex = -1; // L: 3779
				var0.false0 = false; // L: 3780
			}

			if (var4 != 0) { // L: 3782
				++var0.field1282; // L: 3783
				boolean var6;
				if (var4 > 1024) { // L: 3784
					var0.rotation -= var0.field1289; // L: 3785
					var6 = true; // L: 3786
					if (var4 < var0.field1289 || var4 > 2048 - var0.field1289) { // L: 3787
						var0.rotation = var0.orientation; // L: 3788
						var6 = false; // L: 3789
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1282 > 25 || var6)) { // L: 3791
						if (var0.turnLeftSequence != -1) { // L: 3792
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3793
						}
					}
				} else {
					var0.rotation += var0.field1289; // L: 3797
					var6 = true; // L: 3798
					if (var4 < var0.field1289 || var4 > 2048 - var0.field1289) { // L: 3799
						var0.rotation = var0.orientation; // L: 3800
						var6 = false; // L: 3801
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1282 > 25 || var6)) { // L: 3803
						if (var0.turnRightSequence != -1) { // L: 3804
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3805
						}
					}
				}

				var0.rotation &= 2047; // L: 3809
			} else {
				var0.field1282 = 0; // L: 3811
			}

		}
	} // L: 3812
}
