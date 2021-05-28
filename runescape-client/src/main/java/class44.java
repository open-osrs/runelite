import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class44 {
	@ObfuscatedName("v")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("n")
	public static String field318;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -26460885
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;

	static {
		applet = null; // L: 10
		field318 = ""; // L: 11
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1966582053"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "277125318"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		SoundCache.sortWorlds(Tiles.World_worlds, 0, Tiles.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "1230539063"
	)
	static final void method449(Actor var0) {
		var0.isWalking = false; // L: 3815
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 3816
			var1 = LoginScreenAnimation.SequenceDefinition_get(var0.movementSequence); // L: 3817
			if (var1 != null && var1.frameIds != null) { // L: 3818
				++var0.movementFrameCycle; // L: 3819
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 3820
					var0.movementFrameCycle = 1; // L: 3821
					++var0.movementFrame; // L: 3822
					Decimator.method1074(var1, var0.movementFrame, var0.x, var0.y); // L: 3823
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 3825
					var0.movementFrameCycle = 0; // L: 3826
					var0.movementFrame = 0; // L: 3827
					Decimator.method1074(var1, var0.movementFrame, var0.x, var0.y); // L: 3828
				}
			} else {
				var0.movementSequence = -1; // L: 3831
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1287) { // L: 3833
			if (var0.spotAnimationFrame < 0) { // L: 3834
				var0.spotAnimationFrame = 0;
			}

			int var3 = VarcInt.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 3835
			if (var3 != -1) { // L: 3836
				SequenceDefinition var2 = LoginScreenAnimation.SequenceDefinition_get(var3); // L: 3837
				if (var2 != null && var2.frameIds != null) { // L: 3838
					++var0.spotAnimationFrameCycle; // L: 3839
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 3840
						var0.spotAnimationFrameCycle = 1; // L: 3841
						++var0.spotAnimationFrame; // L: 3842
						Decimator.method1074(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 3843
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 3845 3846
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 3849
				}
			} else {
				var0.spotAnimation = -1; // L: 3851
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 3853
			var1 = LoginScreenAnimation.SequenceDefinition_get(var0.sequence); // L: 3854
			if (var1.field1883 == 1 && var0.field1274 > 0 && var0.field1265 <= Client.cycle && var0.field1283 < Client.cycle) { // L: 3855 3856
				var0.sequenceDelay = 1; // L: 3857
				return; // L: 3858
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3862
			var1 = LoginScreenAnimation.SequenceDefinition_get(var0.sequence); // L: 3863
			if (var1 != null && var1.frameIds != null) { // L: 3864
				++var0.sequenceFrameCycle; // L: 3865
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 3866
					var0.sequenceFrameCycle = 1; // L: 3867
					++var0.sequenceFrame; // L: 3868
					Decimator.method1074(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3869
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 3871
					var0.sequenceFrame -= var1.frameCount; // L: 3872
					++var0.field1245; // L: 3873
					if (var0.field1245 >= var1.field1888) { // L: 3874
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 3875
						Decimator.method1074(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3876
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1882; // L: 3878
			} else {
				var0.sequence = -1; // L: 3880
			}
		}

		if (var0.sequenceDelay > 0) { // L: 3882
			--var0.sequenceDelay;
		}

	} // L: 3883

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	static boolean method451() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4426
	}
}
