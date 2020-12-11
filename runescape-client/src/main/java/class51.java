import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class51 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 386223373
	)
	int field391;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2109143743
	)
	int field383;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1355419329
	)
	int field384;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -76124047
	)
	int field385;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1532618423
	)
	int field392;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1466028357
	)
	int field387;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -249737173
	)
	int field388;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1727232939
	)
	int field389;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -196617295
	)
	int field390;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1159678885
	)
	int field393;

	class51() {
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field392) { // L: 21
			var1.regionLowX = this.field392;
		}

		if (var1.regionHighX < this.field392) {
			var1.regionHighX = this.field392; // L: 22
		}

		if (var1.regionLowY > this.field387) { // L: 23
			var1.regionLowY = this.field387;
		}

		if (var1.regionHighY < this.field387) { // L: 24
			var1.regionHighY = this.field387;
		}

	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field391 && var1 < this.field391 + this.field383) { // L: 28
			return var2 >= (this.field384 << 6) + (this.field388 << 3) && var2 <= (this.field384 << 6) + (this.field388 << 3) + 7 && var3 >= (this.field385 << 6) + (this.field389 << 3) && var3 <= (this.field385 << 6) + (this.field389 << 3) + 7; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field392 << 6) + (this.field390 << 3) && var1 <= (this.field392 << 6) + (this.field390 << 3) + 7 && var2 >= (this.field387 << 6) + (this.field393 << 3) && var2 <= (this.field387 << 6) + (this.field393 << 3) + 7; // L: 35
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field392 * 64 - this.field384 * 64) + (this.field390 * 8 - this.field388 * 8), var3 + (this.field387 * 64 - this.field385 * 64) + (this.field393 * 8 - this.field389 * 8)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.field384 * 64 - this.field392 * 64 + (this.field388 * 8 - this.field390 * 8) + var1; // L: 52
			int var4 = var2 + (this.field385 * 64 - this.field387 * 64) + (this.field389 * 8 - this.field393 * 8); // L: 53
			return new Coord(this.field391, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field391 = var1.readUnsignedByte(); // L: 58
		this.field383 = var1.readUnsignedByte(); // L: 59
		this.field384 = var1.readUnsignedShort(); // L: 60
		this.field388 = var1.readUnsignedByte(); // L: 61
		this.field385 = var1.readUnsignedShort(); // L: 62
		this.field389 = var1.readUnsignedByte(); // L: 63
		this.field392 = var1.readUnsignedShort(); // L: 64
		this.field390 = var1.readUnsignedByte(); // L: 65
		this.field387 = var1.readUnsignedShort(); // L: 66
		this.field393 = var1.readUnsignedByte(); // L: 67
		this.method817(); // L: 68
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	void method817() {
	} // L: 71

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "73723896"
	)
	public static int method815(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lib;Ljava/lang/String;Ljava/lang/String;I)Llo;",
		garbageValue = "-973430603"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 125
		int var4 = var0.getFileId(var3, var2); // L: 126
		IndexedSprite var5;
		if (!class304.method5363(var0, var3, var4)) { // L: 129
			var5 = null; // L: 130
		} else {
			var5 = PrivateChatMode.method5937(); // L: 133
		}

		return var5; // L: 135
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "1281357003"
	)
	static final void method831(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 3985
		if (var0.pathLength == 0) { // L: 3986
			var0.field963 = 0; // L: 3987
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3990
				SequenceDefinition var1 = ParamDefinition.SequenceDefinition_get(var0.sequence); // L: 3991
				if (var0.field996 > 0 && var1.field3560 == 0) { // L: 3992
					++var0.field963; // L: 3993
					return; // L: 3994
				}

				if (var0.field996 <= 0 && var1.field3555 == 0) { // L: 3996
					++var0.field963; // L: 3997
					return; // L: 3998
				}
			}

			int var10 = var0.x; // L: 4001
			int var2 = var0.y; // L: 4002
			int var3 = var0.field941 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4003
			int var4 = var0.field941 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4004
			if (var10 < var3) { // L: 4005
				if (var2 < var4) { // L: 4006
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4007
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4008
				}
			} else if (var10 > var3) { // L: 4010
				if (var2 < var4) { // L: 4011
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4012
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4013
				}
			} else if (var2 < var4) { // L: 4015
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4016
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4017
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4018
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4025
				if (var6 > 1024) { // L: 4026
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4027
				if (var6 >= -256 && var6 <= 256) { // L: 4028
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4029
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4030
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4031
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4032
				int var8 = 4; // L: 4033
				boolean var9 = true; // L: 4034
				if (var0 instanceof NPC) { // L: 4035
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4036
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field940 != 0) { // L: 4037
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4038
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4039
						var8 = 8;
					}

					if (var0.field963 > 0 && var0.pathLength > 1) { // L: 4040
						var8 = 8; // L: 4041
						--var0.field963; // L: 4042
					}
				} else {
					if (var0.pathLength > 1) { // L: 4046
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4047
						var8 = 8;
					}

					if (var0.field963 > 0 && var0.pathLength > 1) { // L: 4048
						var8 = 8; // L: 4049
						--var0.field963; // L: 4050
					}
				}

				if (var5 == 2) { // L: 4053
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4054
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) { // L: 4055
					if (var10 < var3) { // L: 4056
						var0.x += var8; // L: 4057
						if (var0.x > var3) { // L: 4058
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4060
						var0.x -= var8; // L: 4061
						if (var0.x < var3) { // L: 4062
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4064
						var0.y += var8; // L: 4065
						if (var0.y > var4) { // L: 4066
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4068
						var0.y -= var8; // L: 4069
						if (var0.y < var4) { // L: 4070
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4073
					--var0.pathLength; // L: 4074
					if (var0.field996 > 0) { // L: 4075
						--var0.field996;
					}
				}

			} else {
				var0.x = var3; // L: 4019
				var0.y = var4; // L: 4020
				--var0.pathLength; // L: 4021
				if (var0.field996 > 0) {
					--var0.field996; // L: 4022
				}

			}
		}
	} // L: 3988 4023 4077

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1731859133"
	)
	static void method832() {
		if (Client.renderSelf) { // L: 4708
			ClientPreferences.addPlayerToScene(PlayerAppearance.localPlayer, false); // L: 4709
		}

	} // L: 4711

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class41.loadInterface(var0)) { // L: 9904
			Players.updateInterface(class9.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 9905
		}
	} // L: 9906

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "([Lhe;II)V",
		garbageValue = "1271776997"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10376
			Widget var3 = var0[var2]; // L: 10377
			if (var3 != null) { // L: 10378
				if (var3.type == 0) { // L: 10379
					if (var3.children != null) { // L: 10380
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10381
					if (var4 != null) { // L: 10382
						WorldMapRectangle.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10384
					var5 = new ScriptEvent(); // L: 10385
					var5.widget = var3; // L: 10386
					var5.args = var3.onDialogAbort; // L: 10387
					class22.runScriptEvent(var5); // L: 10388
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10390
					if (var3.childIndex >= 0) { // L: 10391
						Widget var6 = CollisionMap.getWidget(var3.id); // L: 10392
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10393
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10397
					var5.widget = var3; // L: 10398
					var5.args = var3.onSubChange; // L: 10399
					class22.runScriptEvent(var5); // L: 10400
				}
			}
		}

	} // L: 10403
}
