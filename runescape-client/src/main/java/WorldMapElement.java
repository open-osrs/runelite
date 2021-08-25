import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("er")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ler;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1174068579
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 85360477
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 653122629
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1066557155
	)
	public int field1625;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 431900443
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("y")
	public boolean field1628;
	@ObfuscatedName("v")
	public boolean field1629;
	@ObfuscatedName("f")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("s")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("h")
	int[] field1632;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -683943103
	)
	int field1633;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1751934629
	)
	int field1638;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1111535343
	)
	int field1635;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -319002873
	)
	int field1636;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("r")
	int[] field1640;
	@ObfuscatedName("p")
	byte[] field1637;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1302475207
	)
	@Export("category")
	public int category;

	static {
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1628 = true;
		this.field1629 = false;
		this.menuActions = new String[5];
		this.field1633 = Integer.MAX_VALUE;
		this.field1638 = Integer.MAX_VALUE;
		this.field1635 = Integer.MIN_VALUE;
		this.field1636 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1299052460"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1724775081"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.method6985();
		} else if (var2 == 2) {
			this.sprite2 = var1.method6985();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1625 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1628 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1629 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1632 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1632[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1640 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1640.length; ++var5) {
					this.field1640[var5] = var1.readInt();
				}

				this.field1637 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1637[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.method6985();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.method6985();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field1697, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1699};
					this.horizontalAlignment = (HorizontalAlignment)class260.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class260.findEnumerated(HorizontalAlignment.method2943(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1992880187"
	)
	void method2846() {
		if (this.field1632 != null) {
			for (int var1 = 0; var1 < this.field1632.length; var1 += 2) {
				if (this.field1632[var1] < this.field1633) {
					this.field1633 = this.field1632[var1];
				} else if (this.field1632[var1] > this.field1635) {
					this.field1635 = this.field1632[var1];
				}

				if (this.field1632[var1 + 1] < this.field1638) {
					this.field1638 = this.field1632[var1 + 1];
				} else if (this.field1632[var1 + 1] > this.field1636) {
					this.field1636 = this.field1632[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loc;",
		garbageValue = "1072986518"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Loc;",
		garbageValue = "1239659620"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)WorldMapElement_cachedSprites.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class258.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "133441214"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "-858270951"
	)
	public static void method2827(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1549181494"
	)
	static int method2852(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			var3 = class87.getWidget(var4);
		} else {
			var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class240.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Actor.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class240.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 5];
			Actor.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					Actor.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					Actor.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class240.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class240.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Actor.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				DevicePcmPlayerProvider.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Actor.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				FillMode var6 = (FillMode)class260.findEnumerated(WorldMapScaleHandler.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					Actor.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
					var3.field3117 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					class240.Interpreter_intStackSize -= 2;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "101"
	)
	static final int method2851(int var0, int var1) {
		int var2 = Friend.method5915(45365 + var0, var1 + 91923, 4) - 128 + (Friend.method5915(10294 + var0, var1 + 37821, 2) - 128 >> 1) + (Friend.method5915(var0, var1, 1) - 128 >> 2);
		var2 = (int)((double)var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
