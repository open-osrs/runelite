import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 114850491
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2059790001
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1654198693
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIB)V",
		garbageValue = "-51"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4529
			int var3 = MouseHandler.SequenceDefinition_get(var1).field1965; // L: 4530
			if (var3 == 1) { // L: 4531
				var0.sequenceFrame = 0; // L: 4532
				var0.sequenceFrameCycle = 0; // L: 4533
				var0.sequenceDelay = var2; // L: 4534
				var0.field1116 = 0; // L: 4535
			}

			if (var3 == 2) { // L: 4537
				var0.field1116 = 0; // L: 4538
			}
		} else if (var1 == -1 || var0.sequence == -1 || MouseHandler.SequenceDefinition_get(var1).field1959 >= MouseHandler.SequenceDefinition_get(var0.sequence).field1959) { // L: 4541
			var0.sequence = var1; // L: 4542
			var0.sequenceFrame = 0; // L: 4543
			var0.sequenceFrameCycle = 0; // L: 4544
			var0.sequenceDelay = var2; // L: 4545
			var0.field1116 = 0; // L: 4546
			var0.field1144 = var0.pathLength; // L: 4547
		}

	} // L: 4549
}
