import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("a")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 897280301
	)
	@Export("group")
	int group;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1329352515
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	boolean field1165;

	InterfaceParent() {
		this.field1165 = false; // L: 8
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "-647978763"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1452736307"
	)
	static final void method2083(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 3663
		if (var0.pathLength == 0) { // L: 3664
			var0.field1294 = 0; // L: 3665
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3668
				SequenceDefinition var1 = LoginScreenAnimation.SequenceDefinition_get(var0.sequence); // L: 3669
				if (var0.field1274 > 0 && var1.field1883 == 0) { // L: 3670
					++var0.field1294; // L: 3671
					return; // L: 3672
				}

				if (var0.field1274 <= 0 && var1.field1890 == 0) { // L: 3674
					++var0.field1294; // L: 3675
					return; // L: 3676
				}
			}

			int var10 = var0.x; // L: 3679
			int var2 = var0.y; // L: 3680
			int var3 = var0.field1239 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 3681
			int var4 = var0.field1239 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 3682
			if (var10 < var3) { // L: 3683
				if (var2 < var4) { // L: 3684
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 3685
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 3686
				}
			} else if (var10 > var3) { // L: 3688
				if (var2 < var4) { // L: 3689
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 3690
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 3691
				}
			} else if (var2 < var4) { // L: 3693
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 3694
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 3695
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 3696
				int var6 = var0.orientation - var0.rotation & 2047; // L: 3703
				if (var6 > 1024) { // L: 3704
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 3705
				if (var6 >= -256 && var6 <= 256) { // L: 3706
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 3707
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 3708
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 3709
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 3710
				int var8 = 4; // L: 3711
				boolean var9 = true; // L: 3712
				if (var0 instanceof NPC) { // L: 3713
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 3714
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1289 != 0) { // L: 3715
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 3716
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 3717
						var8 = 8;
					}

					if (var0.field1294 > 0 && var0.pathLength > 1) { // L: 3718
						var8 = 8; // L: 3719
						--var0.field1294; // L: 3720
					}
				} else {
					if (var0.pathLength > 1) { // L: 3724
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 3725
						var8 = 8;
					}

					if (var0.field1294 > 0 && var0.pathLength > 1) { // L: 3726
						var8 = 8; // L: 3727
						--var0.field1294; // L: 3728
					}
				}

				if (var5 == 2) { // L: 3731
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3732
					var0.movementSequence = var0.runSequence;
				}

				if (var3 != var10 || var4 != var2) { // L: 3733
					if (var10 < var3) { // L: 3734
						var0.x += var8; // L: 3735
						if (var0.x > var3) { // L: 3736
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 3738
						var0.x -= var8; // L: 3739
						if (var0.x < var3) { // L: 3740
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 3742
						var0.y += var8; // L: 3743
						if (var0.y > var4) { // L: 3744
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 3746
						var0.y -= var8; // L: 3747
						if (var0.y < var4) { // L: 3748
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 3751
					--var0.pathLength; // L: 3752
					if (var0.field1274 > 0) { // L: 3753
						--var0.field1274;
					}
				}

			} else {
				var0.x = var3; // L: 3697
				var0.y = var4; // L: 3698
				--var0.pathLength; // L: 3699
				if (var0.field1274 > 0) { // L: 3700
					--var0.field1274;
				}

			}
		}
	} // L: 3666 3701 3755

	@ObfuscatedName("je")
	static final void method2082(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 10888
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 10889
		Decimator.method1073(); // L: 10890
		ObjectComposition.clientPreferences.field1337 = var0; // L: 10891
		TileItem.savePreferences(); // L: 10892
	} // L: 10893
}
