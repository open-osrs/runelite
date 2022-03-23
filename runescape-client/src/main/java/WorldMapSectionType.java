import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 703478945
	)
	static int field2778;
	@ObfuscatedName("x")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -854711519
	)
	static int field2768;
	@ObfuscatedName("hw")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 263983215
	)
	@Export("type")
	final int type;
	@ObfuscatedName("n")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhs;",
		garbageValue = "330222458"
	)
	static WorldMapSectionType[] method4949() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0}; // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "334656571"
	)
	static int method4942(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 75
		if (var1 == null) { // L: 76
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 77 78
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)I",
		garbageValue = "100950073"
	)
	static int method4952(Widget var0) {
		if (var0.type != 11) { // L: 1238
			Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 1239
			return 1; // L: 1240
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 1242
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var0.method5666(var1); // L: 1243
			return 1; // L: 1244
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1416407373"
	)
	static final void method4945() {
		if (Client.field721 != class160.Client_plane) { // L: 3387
			Client.field721 = class160.Client_plane; // L: 3388
			Tile.method3991(class160.Client_plane); // L: 3389
		}

	} // L: 3391

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lco;I)V",
		garbageValue = "2020295686"
	)
	static final void method4950(Actor var0) {
		var0.isWalking = false; // L: 3777
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 3778
			var1 = ItemContainer.SequenceDefinition_get(var0.movementSequence); // L: 3779
			if (var1 != null) { // L: 3780
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 3781
					++var0.movementFrameCycle; // L: 3782
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 3783
						var0.movementFrameCycle = 1; // L: 3784
						++var0.movementFrame; // L: 3785
						class152.method3102(var1, var0.movementFrame, var0.x, var0.y); // L: 3786
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 3788
						var0.movementFrameCycle = 0; // L: 3789
						var0.movementFrame = 0; // L: 3790
						class152.method3102(var1, var0.movementFrame, var0.x, var0.y); // L: 3791
					}
				} else if (var1.isCachedModelIdSet()) { // L: 3794
					++var0.movementFrame; // L: 3795
					var2 = var1.method3827(); // L: 3796
					if (var0.movementFrame < var2) { // L: 3797
						class241.method5002(var1, var0.movementFrame, var0.x, var0.y); // L: 3798
					} else {
						var0.movementFrameCycle = 0; // L: 3801
						var0.movementFrame = 0; // L: 3802
						class241.method5002(var1, var0.movementFrame, var0.x, var0.y); // L: 3803
					}
				} else {
					var0.movementSequence = -1; // L: 3806
				}
			} else {
				var0.movementSequence = -1; // L: 3808
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1173) { // L: 3810
			if (var0.spotAnimationFrame < 0) { // L: 3811
				var0.spotAnimationFrame = 0;
			}

			int var4 = class6.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 3812
			if (var4 != -1) { // L: 3813
				SequenceDefinition var5 = ItemContainer.SequenceDefinition_get(var4); // L: 3814
				if (var5 != null && var5.frameIds != null) { // L: 3815
					++var0.spotAnimationFrameCycle; // L: 3816
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame]) { // L: 3817
						var0.spotAnimationFrameCycle = 1; // L: 3818
						++var0.spotAnimationFrame; // L: 3819
						class152.method3102(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 3820
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 3822 3823
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 3826
					++var0.spotAnimationFrame; // L: 3827
					int var3 = var5.method3827(); // L: 3828
					if (var0.spotAnimationFrame < var3) { // L: 3829
						class241.method5002(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 3830
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 3833
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 3836
				}
			} else {
				var0.spotAnimation = -1; // L: 3838
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 3840
			var1 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 3841
			if (var1.field2162 == 1 && var0.field1134 > 0 && var0.field1179 <= Client.cycle && var0.field1180 < Client.cycle) { // L: 3842 3843
				var0.sequenceDelay = 1; // L: 3844
				return; // L: 3845
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3849
			var1 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 3850
			if (var1 != null) { // L: 3851
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 3852
					++var0.sequenceFrameCycle; // L: 3853
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 3854
						var0.sequenceFrameCycle = 1; // L: 3855
						++var0.sequenceFrame; // L: 3856
						class152.method3102(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3857
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 3859
						var0.sequenceFrame -= var1.frameCount; // L: 3860
						++var0.field1169; // L: 3861
						if (var0.field1169 >= var1.field2169) { // L: 3862
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 3863
							class152.method3102(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3864
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2165; // L: 3866
				} else if (var1.isCachedModelIdSet()) { // L: 3868
					++var0.sequenceFrame; // L: 3869
					var2 = var1.method3801().method2771(); // L: 3870
					if (var0.sequenceFrame < var2) { // L: 3871
						class241.method5002(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3872
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 3875
						++var0.field1169; // L: 3876
						if (var0.field1169 >= var1.field2169) { // L: 3877
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 3878
							class241.method5002(var1, var0.sequenceFrame, var0.x, var0.y); // L: 3879
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1; // L: 3882
				}
			} else {
				var0.sequence = -1; // L: 3884
			}
		}

		if (var0.sequenceDelay > 0) { // L: 3886
			--var0.sequenceDelay;
		}

	} // L: 3887

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lge;",
		garbageValue = "1"
	)
	static RouteStrategy method4954(int var0, int var1) {
		Client.field477.approxDestinationX = var0; // L: 8006
		Client.field477.approxDestinationY = var1; // L: 8007
		Client.field477.approxDestinationSizeX = 1; // L: 8008
		Client.field477.approxDestinationSizeY = 1; // L: 8009
		return Client.field477; // L: 8010
	}
}
