import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Players")
public class Players {
	@ObfuscatedName("d")
	static byte[] field1275;
	@ObfuscatedName("c")
	static byte[] field1274;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lkx;"
	)
	static Buffer[] field1269;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 286612825
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("z")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1913130791
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("q")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("l")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("s")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("b")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 8929153
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("w")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static Buffer field1279;

	static {
		field1275 = new byte[2048]; // L: 18
		field1274 = new byte[2048]; // L: 19
		field1269 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1279 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V",
		garbageValue = "-202535471"
	)
	static final void method2286(Actor var0) {
		var0.isWalking = false; // L: 3706
		SequenceDefinition var1;
		if (var0.movementSequence != -1) { // L: 3707
			var1 = InterfaceParent.SequenceDefinition_get(var0.movementSequence); // L: 3708
			if (var1 != null && var1.frameIds != null) { // L: 3709
				++var0.movementFrameCycle; // L: 3710
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 3711
					var0.movementFrameCycle = 1; // L: 3712
					++var0.movementFrame; // L: 3713
					class169.method3637(var1, var0.movementFrame, var0.x, var0.y); // L: 3714
				}

				if (var0.movementFrame >= var1.frameIds.length) { // L: 3716
					var0.movementFrameCycle = 0; // L: 3717
					var0.movementFrame = 0; // L: 3718
					class169.method3637(var1, var0.movementFrame, var0.x, var0.y); // L: 3719
				}
			} else {
				var0.movementSequence = -1; // L: 3722
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field993) { // L: 3724
			if (var0.spotAnimationFrame < 0) { // L: 3725
				var0.spotAnimationFrame = 0;
			}

			int var3 = AbstractUserComparator.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 3726
			if (var3 != -1) { // L: 3727
				SequenceDefinition var2 = InterfaceParent.SequenceDefinition_get(var3); // L: 3728
				if (var2 != null && var2.frameIds != null) { // L: 3729
					++var0.spotAnimationFrameCycle; // L: 3730
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) { // L: 3731
						var0.spotAnimationFrameCycle = 1; // L: 3732
						++var0.spotAnimationFrame; // L: 3733
						class169.method3637(var2, var0.spotAnimationFrame, var0.x, var0.y); // L: 3734
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) { // L: 3736 3737
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 3740
				}
			} else {
				var0.spotAnimation = -1; // L: 3742
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 3744
			var1 = InterfaceParent.SequenceDefinition_get(var0.sequence); // L: 3745
			if (var1.field3564 == 1 && var0.field1012 > 0 && var0.field999 <= Client.cycle && var0.field1000 < Client.cycle) { // L: 3746 3747
				var0.sequenceDelay = 1; // L: 3748
				return; // L: 3749
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3753
			var1 = InterfaceParent.SequenceDefinition_get(var0.sequence); // L: 3754
			if (var1 != null && var1.frameIds != null) { // L: 3755
				++var0.sequenceFrameCycle; // L: 3756
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 3757
					var0.sequenceFrameCycle = 1; // L: 3758
					++var0.sequenceFrame; // L: 3759
					class169.method3637(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3760
				}

				if (var0.sequenceFrame >= var1.frameIds.length) { // L: 3762
					var0.sequenceFrame -= var1.frameCount; // L: 3763
					++var0.field973; // L: 3764
					if (var0.field973 >= var1.field3563) { // L: 3765
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 3766
						class169.method3637(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3767
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field3559; // L: 3769
			} else {
				var0.sequence = -1; // L: 3771
			}
		}

		if (var0.sequenceDelay > 0) { // L: 3773
			--var0.sequenceDelay;
		}

	} // L: 3774
}
