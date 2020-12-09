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
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field392) {
			var1.regionLowX = this.field392;
		}

		if (var1.regionHighX < this.field392) {
			var1.regionHighX = this.field392;
		}

		if (var1.regionLowY > this.field387) {
			var1.regionLowY = this.field387;
		}

		if (var1.regionHighY < this.field387) {
			var1.regionHighY = this.field387;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field391 && var1 < this.field391 + this.field383) {
			return var2 >= (this.field384 << 6) + (this.field388 << 3) && var2 <= (this.field384 << 6) + (this.field388 << 3) + 7 && var3 >= (this.field385 << 6) + (this.field389 << 3) && var3 <= (this.field385 << 6) + (this.field389 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field392 << 6) + (this.field390 << 3) && var1 <= (this.field392 << 6) + (this.field390 << 3) + 7 && var2 >= (this.field387 << 6) + (this.field393 << 3) && var2 <= (this.field387 << 6) + (this.field393 << 3) + 7;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field392 * 64 - this.field384 * 64 + var2 + (this.field390 * 8 - this.field388 * 8), var3 + (this.field387 * 64 - this.field385 * 64) + (this.field393 * 8 - this.field389 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field384 * 64 - this.field392 * 64 + (this.field388 * 8 - this.field390 * 8) + var1;
			int var4 = this.field385 * 64 - this.field387 * 64 + var2 + (this.field389 * 8 - this.field393 * 8);
			return new Coord(this.field391, var3, var4);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field391 = var1.readUnsignedByte();
		this.field383 = var1.readUnsignedByte();
		this.field384 = var1.readUnsignedShort();
		this.field388 = var1.readUnsignedByte();
		this.field385 = var1.readUnsignedShort();
		this.field389 = var1.readUnsignedByte();
		this.field392 = var1.readUnsignedShort();
		this.field390 = var1.readUnsignedByte();
		this.field387 = var1.readUnsignedShort();
		this.field393 = var1.readUnsignedByte();
		this.method817();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	void method817() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "73723896"
	)
	public static int method815(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lib;Ljava/lang/String;Ljava/lang/String;I)Llo;",
		garbageValue = "-973430603"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite var5;
		if (!class304.method5363(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = PrivateChatMode.method5937();
		}

		return var5;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "1281357003"
	)
	static final void method831(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field963 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = ParamDefinition.SequenceDefinition_get(var0.sequence);
				if (var0.field996 > 0 && var1.field3560 == 0) {
					++var0.field963;
					return;
				}

				if (var0.field996 <= 0 && var1.field3555 == 0) {
					++var0.field963;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field941 * 108072960;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field941 * 108072960;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) {
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field940 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field963 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field963;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field963 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field963;
					}
				}

				if (var5 == 2) {
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field996 > 0) {
						--var0.field996;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field996 > 0) {
					--var0.field996;
				}

			}
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1731859133"
	)
	static void method832() {
		if (Client.renderSelf) {
			ClientPreferences.addPlayerToScene(PlayerAppearance.localPlayer, false);
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class41.loadInterface(var0)) {
			Players.updateInterface(class9.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "([Lhe;II)V",
		garbageValue = "1271776997"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						WorldMapRectangle.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class22.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = CollisionMap.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class22.runScriptEvent(var5);
				}
			}
		}

	}
}
