import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class363 {
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "499018335"
	)
	static final void method6612(Actor var0) {
		var0.isWalking = false; // L: 4826
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4827
			var1 = UserComparator5.SequenceDefinition_get(var0.movementSequence); // L: 4828
			if (var1 != null) { // L: 4829
				if (!var1.method3690() && var1.frameIds != null) { // L: 4830
					++var0.movementFrameCycle; // L: 4831
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4832
						var0.movementFrameCycle = 1; // L: 4833
						++var0.movementFrame; // L: 4834
						class409.method7269(var1, var0.movementFrame, var0.x, var0.y); // L: 4835
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4837
						var0.movementFrameCycle = 0; // L: 4838
						var0.movementFrame = 0; // L: 4839
						class409.method7269(var1, var0.movementFrame, var0.x, var0.y); // L: 4840
					}
				} else if (var1.method3690()) { // L: 4843
					++var0.movementFrame; // L: 4844
					var2 = var1.method3647(); // L: 4845
					if (var0.movementFrame < var2) { // L: 4846
						Varcs.method2427(var1, var0.movementFrame, var0.x, var0.y); // L: 4847
					} else {
						var0.movementFrameCycle = 0; // L: 4850
						var0.movementFrame = 0; // L: 4851
						Varcs.method2427(var1, var0.movementFrame, var0.x, var0.y); // L: 4852
					}
				} else {
					var0.movementSequence = -1; // L: 4855
				}
			} else {
				var0.movementSequence = -1; // L: 4857
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1130) { // L: 4859
			if (var0.spotAnimationFrame < 0) { // L: 4860
				var0.spotAnimationFrame = 0;
			}

			int var4 = AccessFile.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4861
			if (var4 != -1) { // L: 4862
				SequenceDefinition var5 = UserComparator5.SequenceDefinition_get(var4); // L: 4863
				if (var5 != null && var5.frameIds != null) { // L: 4864
					++var0.spotAnimationFrameCycle; // L: 4865
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4866
						var0.spotAnimationFrameCycle = 1; // L: 4867
						++var0.spotAnimationFrame; // L: 4868
						class409.method7269(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4869
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4871 4872
						var0.spotAnimation = -1;
					}
				} else if (var5.method3690()) { // L: 4875
					++var0.spotAnimationFrame; // L: 4876
					int var3 = var5.method3647(); // L: 4877
					if (var0.spotAnimationFrame < var3) { // L: 4878
						Varcs.method2427(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4879
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4882
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4885
				}
			} else {
				var0.spotAnimation = -1; // L: 4887
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4889
			var1 = UserComparator5.SequenceDefinition_get(var0.sequence); // L: 4890
			if (var1.field2096 == 1 && var0.field1098 > 0 && var0.field1136 <= Client.cycle && var0.field1157 < Client.cycle) { // L: 4891 4892
				var0.sequenceDelay = 1; // L: 4893
				return; // L: 4894
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4898
			var1 = UserComparator5.SequenceDefinition_get(var0.sequence); // L: 4899
			if (var1 != null) { // L: 4900
				if (!var1.method3690() && var1.frameIds != null) { // L: 4901
					++var0.sequenceFrameCycle; // L: 4902
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4903
						var0.sequenceFrameCycle = 1; // L: 4904
						++var0.sequenceFrame; // L: 4905
						class409.method7269(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4906
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4908
						var0.sequenceFrame -= var1.frameCount; // L: 4909
						++var0.field1126; // L: 4910
						if (var0.field1126 >= var1.field2095) { // L: 4911
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4912
							class409.method7269(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4913
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2091; // L: 4915
				} else if (var1.method3690()) { // L: 4917
					++var0.sequenceFrame; // L: 4918
					var2 = var1.method3648().method2691(); // L: 4919
					if (var0.sequenceFrame < var2) { // L: 4920
						Varcs.method2427(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4921
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4924
						++var0.field1126; // L: 4925
						if (var0.field1126 >= var1.field2095) { // L: 4926
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4927
							Varcs.method2427(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4928
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1; // L: 4931
				}
			} else {
				var0.sequence = -1; // L: 4933
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4935
			--var0.sequenceDelay;
		}

	} // L: 4936

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)I",
		garbageValue = "1020849345"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12561
		return var1 != null ? var1.integer : var0.flags; // L: 12562 12563
	}
}
