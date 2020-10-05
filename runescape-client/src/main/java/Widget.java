import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class Widget extends Node {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[[Lhq;"
	)
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("f")
	public static boolean field2611;
	@ObfuscatedName("y")
	public boolean isIf3;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1189552295
	)
	public int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1997993253
	)
	public int childIndex;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -531389959
	)
	public int type;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -271172565
	)
	public int buttonType;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -784599883
	)
	public int contentType;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -160427093
	)
	public int xAlignment;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1846560629
	)
	public int yAlignment;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 84465573
	)
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1226090749
	)
	public int heightAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2088624487
	)
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1233836267
	)
	public int rawY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1843073905
	)
	public int rawWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1879271747
	)
	public int rawHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1517732015
	)
	public int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 256308969
	)
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1613274363
	)
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1991496335
	)
	public int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1488324875
	)
	public int field2622;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1765523627
	)
	public int field2623;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1948885583
	)
	public int parentId;
	@ObfuscatedName("al")
	public boolean isHidden;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1183715667
	)
	public int scrollX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -699502093
	)
	public int scrollY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1556531767
	)
	public int scrollWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1626628049
	)
	public int scrollHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1201601061
	)
	public int color;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1272515191
	)
	public int color2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -5591483
	)
	public int mouseOverColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1367295317
	)
	public int mouseOverColor2;
	@ObfuscatedName("aj")
	public boolean fill;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public FillMode fillMode;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 955254737
	)
	public int transparencyTop;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1148839493
	)
	public int transparencyBot;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1328949873
	)
	public int lineWid;
	@ObfuscatedName("bl")
	public boolean field2639;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1969239081
	)
	public int spriteId2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -250118287
	)
	public int spriteId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -237364125
	)
	public int spriteAngle;
	@ObfuscatedName("bh")
	public boolean spriteTiling;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1634007559
	)
	public int outline;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1037474535
	)
	public int spriteShadow;
	@ObfuscatedName("br")
	public boolean spriteFlipV;
	@ObfuscatedName("bp")
	public boolean spriteFlipH;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1324605985
	)
	public int modelType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 734022747
	)
	public int modelId;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1986373533
	)
	int modelType2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -651946363
	)
	int modelId2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1530355915
	)
	public int sequenceId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1814107681
	)
	public int sequenceId2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1684215659
	)
	public int modelOffsetX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2011277719
	)
	public int modelOffsetY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1767129155
	)
	public int modelAngleX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 21691605
	)
	public int modelAngleY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1295427891
	)
	public int modelAngleZ;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1679520267
	)
	public int modelZoom;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1534988333
	)
	public int field2728;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1067909943
	)
	public int field2633;
	@ObfuscatedName("bf")
	public boolean modelOrthog;
	@ObfuscatedName("bt")
	public boolean modelTransparency;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1750770011
	)
	public int itemQuantityMode;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 228754721
	)
	public int fontId;
	@ObfuscatedName("ca")
	public String text;
	@ObfuscatedName("ct")
	public String text2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 22170567
	)
	public int textLineHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 372737821
	)
	public int textXAlignment;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 188319241
	)
	public int textYAlignment;
	@ObfuscatedName("cn")
	public boolean textShadowed;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1239558509
	)
	public int paddingX;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 684939999
	)
	public int paddingY;
	@ObfuscatedName("cu")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cw")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cq")
	public int[] inventorySprites;
	@ObfuscatedName("cc")
	public String[] itemActions;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1387630371
	)
	public int flags;
	@ObfuscatedName("cj")
	public boolean field2676;
	@ObfuscatedName("cd")
	public byte[][] field2626;
	@ObfuscatedName("cx")
	public byte[][] field2719;
	@ObfuscatedName("ck")
	public int[] field2682;
	@ObfuscatedName("co")
	public int[] field2683;
	@ObfuscatedName("dx")
	public String dataText;
	@ObfuscatedName("dq")
	public String[] actions;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	public Widget parent;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1668184029
	)
	public int dragZoneSize;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1282838075
	)
	public int dragThreshold;
	@ObfuscatedName("db")
	public boolean isScrollBar;
	@ObfuscatedName("dj")
	public String spellActionName;
	@ObfuscatedName("dk")
	public boolean hasListener;
	@ObfuscatedName("de")
	public Object[] onLoad;
	@ObfuscatedName("da")
	public Object[] onClick;
	@ObfuscatedName("dr")
	public Object[] onClickRepeat;
	@ObfuscatedName("dw")
	public Object[] onRelease;
	@ObfuscatedName("dy")
	public Object[] onHold;
	@ObfuscatedName("ds")
	public Object[] onMouseOver;
	@ObfuscatedName("dl")
	public Object[] onMouseRepeat;
	@ObfuscatedName("di")
	public Object[] onMouseLeave;
	@ObfuscatedName("do")
	public Object[] onDrag;
	@ObfuscatedName("df")
	public Object[] onDragComplete;
	@ObfuscatedName("dm")
	public Object[] onTargetEnter;
	@ObfuscatedName("du")
	public Object[] onTargetLeave;
	@ObfuscatedName("dc")
	public Object[] onVarTransmit;
	@ObfuscatedName("dn")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dz")
	public Object[] onInvTransmit;
	@ObfuscatedName("dp")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dt")
	public Object[] onStatTransmit;
	@ObfuscatedName("dg")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ee")
	public Object[] onTimer;
	@ObfuscatedName("en")
	public Object[] onOp;
	@ObfuscatedName("eu")
	public Object[] onScroll;
	@ObfuscatedName("eo")
	public Object[] onChatTransmit;
	@ObfuscatedName("es")
	public Object[] onKey;
	@ObfuscatedName("ek")
	public Object[] onFriendTransmit;
	@ObfuscatedName("er")
	public Object[] onClanTransmit;
	@ObfuscatedName("ep")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eg")
	public Object[] onDialogAbort;
	@ObfuscatedName("eq")
	public Object[] onSubChange;
	@ObfuscatedName("em")
	public Object[] onResize;
	@ObfuscatedName("eh")
	public Object[] onStockTransmit;
	@ObfuscatedName("ec")
	public Object[] field2722;
	@ObfuscatedName("ej")
	public int[][] cs1Instructions;
	@ObfuscatedName("ez")
	public int[] cs1Comparisons;
	@ObfuscatedName("eb")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1041425319
	)
	public int mouseOverRedirect;
	@ObfuscatedName("ef")
	public String spellName;
	@ObfuscatedName("ey")
	public String buttonText;
	@ObfuscatedName("ew")
	public int[] itemIds;
	@ObfuscatedName("ex")
	public int[] itemQuantities;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -419140007
	)
	public int itemId;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -239895029
	)
	public int itemQuantity;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -844392783
	)
	public int modelFrame;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -450327171
	)
	public int modelFrameCycle;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	public Widget[] children;
	@ObfuscatedName("fq")
	public boolean containsMouse;
	@ObfuscatedName("fx")
	public boolean isClicked;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1974330189
	)
	public int field2664;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 786737003
	)
	public int field2618;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 421837705
	)
	public int field2727;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1990354289
	)
	public int field2681;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -390238451
	)
	public int rootIndex;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 1135189541
	)
	public int cycle;
	@ObfuscatedName("fe")
	public int[] field2661;
	@ObfuscatedName("fb")
	public boolean noClickThrough;
	@ObfuscatedName("fc")
	public boolean noScrollThrough;
	@ObfuscatedName("fm")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2611 = false; // L: 35
	}

	public Widget() {
		this.isIf3 = false; // L: 36
		this.id = -1; // L: 37
		this.childIndex = -1; // L: 38
		this.buttonType = 0; // L: 40
		this.contentType = 0; // L: 41
		this.xAlignment = 0; // L: 42
		this.yAlignment = 0; // L: 43
		this.widthAlignment = 0; // L: 44
		this.heightAlignment = 0; // L: 45
		this.rawX = 0; // L: 46
		this.rawY = 0; // L: 47
		this.rawWidth = 0; // L: 48
		this.rawHeight = 0; // L: 49
		this.x = 0; // L: 50
		this.y = 0; // L: 51
		this.width = 0; // L: 52
		this.height = 0; // L: 53
		this.field2622 = 1; // L: 54
		this.field2623 = 1; // L: 55
		this.parentId = -1; // L: 56
		this.isHidden = false; // L: 57
		this.scrollX = 0; // L: 58
		this.scrollY = 0; // L: 59
		this.scrollWidth = 0; // L: 60
		this.scrollHeight = 0; // L: 61
		this.color = 0; // L: 62
		this.color2 = 0; // L: 63
		this.mouseOverColor = 0; // L: 64
		this.mouseOverColor2 = 0; // L: 65
		this.fill = false; // L: 66
		this.fillMode = FillMode.SOLID; // L: 67
		this.transparencyTop = 0; // L: 68
		this.transparencyBot = 0; // L: 69
		this.lineWid = 1; // L: 70
		this.field2639 = false; // L: 71
		this.spriteId2 = -1; // L: 72
		this.spriteId = -1; // L: 73
		this.spriteAngle = 0; // L: 74
		this.spriteTiling = false; // L: 75
		this.outline = 0; // L: 76
		this.spriteShadow = 0; // L: 77
		this.modelType = 1; // L: 80
		this.modelId = -1; // L: 81
		this.modelType2 = 1; // L: 82
		this.modelId2 = -1; // L: 83
		this.sequenceId = -1; // L: 84
		this.sequenceId2 = -1; // L: 85
		this.modelOffsetX = 0; // L: 86
		this.modelOffsetY = 0; // L: 87
		this.modelAngleX = 0; // L: 88
		this.modelAngleY = 0; // L: 89
		this.modelAngleZ = 0; // L: 90
		this.modelZoom = 100; // L: 91
		this.field2728 = 0; // L: 92
		this.field2633 = 0; // L: 93
		this.modelOrthog = false; // L: 94
		this.modelTransparency = false; // L: 95
		this.itemQuantityMode = 2; // L: 96
		this.fontId = -1; // L: 97
		this.text = ""; // L: 98
		this.text2 = ""; // L: 99
		this.textLineHeight = 0; // L: 100
		this.textXAlignment = 0; // L: 101
		this.textYAlignment = 0; // L: 102
		this.textShadowed = false; // L: 103
		this.paddingX = 0; // L: 104
		this.paddingY = 0; // L: 105
		this.flags = 0; // L: 110
		this.field2676 = false; // L: 111
		this.dataText = ""; // L: 120
		this.parent = null; // L: 122
		this.dragZoneSize = 0; // L: 123
		this.dragThreshold = 0; // L: 124
		this.isScrollBar = false; // L: 125
		this.spellActionName = ""; // L: 126
		this.hasListener = false; // L: 127
		this.mouseOverRedirect = -1; // L: 162
		this.spellName = ""; // L: 163
		this.buttonText = "Ok"; // L: 164
		this.itemId = -1; // L: 167
		this.itemQuantity = 0; // L: 168
		this.modelFrame = 0; // L: 169
		this.modelFrameCycle = 0; // L: 170
		this.containsMouse = false; // L: 172
		this.isClicked = false; // L: 173
		this.field2664 = -1; // L: 174
		this.field2618 = 0; // L: 175
		this.field2727 = 0; // L: 176
		this.field2681 = 0; // L: 177
		this.rootIndex = -1; // L: 178
		this.cycle = -1; // L: 179
		this.noClickThrough = false; // L: 181
		this.noScrollThrough = false; // L: 182
		this.prioritizeMenuEntry = false; // L: 183
	} // L: 705

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "-56"
	)
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte(); // L: 244
		this.buttonType = var1.readUnsignedByte(); // L: 245
		this.contentType = var1.readUnsignedShort(); // L: 246
		this.rawX = var1.readShort();
		this.rawY = var1.readShort(); // L: 248
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort(); // L: 252
		if (this.parentId == 65535) { // L: 253
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 257
		int var3;
		if (var2 > 0) { // L: 258
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) { // L: 269
				var5 = var1.readUnsignedShort(); // L: 270
				this.cs1Instructions[var4] = new int[var5]; // L: 271

				for (var6 = 0; var6 < var5; ++var6) { // L: 272
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 273
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 274
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 278
			this.scrollHeight = var1.readUnsignedShort(); // L: 279
			this.isHidden = var1.readUnsignedByte() == 1; // L: 280
		}

		if (this.type == 1) { // L: 282
			var1.readUnsignedShort(); // L: 283
			var1.readUnsignedByte(); // L: 284
		}

		if (this.type == 2) { // L: 286
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 287
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 288
			var4 = var1.readUnsignedByte(); // L: 289
			if (var4 == 1) { // L: 290
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 291
			if (var5 == 1) { // L: 292
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 293
			if (var6 == 1) { // L: 294
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 295
			if (var7 == 1) { // L: 296
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 297
			this.paddingY = var1.readUnsignedByte(); // L: 298
			this.inventoryXOffsets = new int[20]; // L: 299
			this.inventoryYOffsets = new int[20]; // L: 300
			this.inventorySprites = new int[20]; // L: 301

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 302
				int var11 = var1.readUnsignedByte(); // L: 303
				if (var11 == 1) { // L: 304
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 305
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 306
					this.inventorySprites[var8] = var1.readInt(); // L: 307
				} else {
					this.inventorySprites[var8] = -1; // L: 309
				}
			}

			this.itemActions = new String[5]; // L: 311

			for (var8 = 0; var8 < 5; ++var8) { // L: 312
				String var9 = var1.readStringCp1252NullTerminated(); // L: 313
				if (var9.length() > 0) { // L: 314
					this.itemActions[var8] = var9; // L: 315
					this.flags |= 1 << var8 + 23; // L: 316
				}
			}
		}

		if (this.type == 3) { // L: 320
			this.fill = var1.readUnsignedByte() == 1; // L: 321
		}

		if (this.type == 4 || this.type == 1) { // L: 323
			this.textXAlignment = var1.readUnsignedByte(); // L: 324
			this.textYAlignment = var1.readUnsignedByte(); // L: 325
			this.textLineHeight = var1.readUnsignedByte(); // L: 326
			this.fontId = var1.readUnsignedShort(); // L: 327
			if (this.fontId == 65535) { // L: 328
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 329
		}

		if (this.type == 4) { // L: 331
			this.text = var1.readStringCp1252NullTerminated(); // L: 332
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 333
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 335
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 336
			this.color2 = var1.readInt(); // L: 337
			this.mouseOverColor = var1.readInt(); // L: 338
			this.mouseOverColor2 = var1.readInt(); // L: 339
		}

		if (this.type == 5) { // L: 341
			this.spriteId2 = var1.readInt(); // L: 342
			this.spriteId = var1.readInt(); // L: 343
		}

		if (this.type == 6) { // L: 345
			this.modelType = 1; // L: 346
			this.modelId = var1.readUnsignedShort(); // L: 347
			if (this.modelId == 65535) { // L: 348
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 349
			this.modelId2 = var1.readUnsignedShort(); // L: 350
			if (this.modelId2 == 65535) { // L: 351
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 352
			if (this.sequenceId == 65535) { // L: 353
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 354
			if (this.sequenceId2 == 65535) { // L: 355
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 356
			this.modelAngleX = var1.readUnsignedShort(); // L: 357
			this.modelAngleY = var1.readUnsignedShort(); // L: 358
		}

		if (this.type == 7) { // L: 360
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 361
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 362
			this.textXAlignment = var1.readUnsignedByte(); // L: 363
			this.fontId = var1.readUnsignedShort(); // L: 364
			if (this.fontId == 65535) { // L: 365
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 366
			this.color = var1.readInt(); // L: 367
			this.paddingX = var1.readShort(); // L: 368
			this.paddingY = var1.readShort(); // L: 369
			var4 = var1.readUnsignedByte(); // L: 370
			if (var4 == 1) { // L: 371
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5]; // L: 372

			for (var5 = 0; var5 < 5; ++var5) { // L: 373
				String var10 = var1.readStringCp1252NullTerminated(); // L: 374
				if (var10.length() > 0) { // L: 375
					this.itemActions[var5] = var10; // L: 376
					this.flags |= 1 << var5 + 23; // L: 377
				}
			}
		}

		if (this.type == 8) { // L: 381
			this.text = var1.readStringCp1252NullTerminated(); // L: 382
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 384
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 385
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 386
			var4 = var1.readUnsignedShort() & 63; // L: 387
			this.flags |= var4 << 11; // L: 388
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 390
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 391
			if (this.buttonText.length() == 0) { // L: 392
				if (this.buttonType == 1) { // L: 393
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 394
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 395
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 396
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 399
			this.flags |= 4194304; // L: 400
		}

		if (this.buttonType == 6) { // L: 402
			this.flags |= 1; // L: 403
		}

	} // L: 405

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1100284620"
	)
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 408
		this.isIf3 = true; // L: 409
		this.type = var1.readUnsignedByte(); // L: 410
		this.contentType = var1.readUnsignedShort(); // L: 411
		this.rawX = var1.readShort(); // L: 412
		this.rawY = var1.readShort(); // L: 413
		this.rawWidth = var1.readUnsignedShort(); // L: 414
		if (this.type == 9) { // L: 415
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 416
		}

		this.widthAlignment = var1.readByte(); // L: 417
		this.heightAlignment = var1.readByte(); // L: 418
		this.xAlignment = var1.readByte(); // L: 419
		this.yAlignment = var1.readByte(); // L: 420
		this.parentId = var1.readUnsignedShort(); // L: 421
		if (this.parentId == 65535) { // L: 422
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 423
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 424
		if (this.type == 0) { // L: 425
			this.scrollWidth = var1.readUnsignedShort(); // L: 426
			this.scrollHeight = var1.readUnsignedShort(); // L: 427
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 428
		}

		if (this.type == 5) { // L: 430
			this.spriteId2 = var1.readInt(); // L: 431
			this.spriteAngle = var1.readUnsignedShort(); // L: 432
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 433
			this.transparencyTop = var1.readUnsignedByte(); // L: 434
			this.outline = var1.readUnsignedByte(); // L: 435
			this.spriteShadow = var1.readInt(); // L: 436
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 437
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 438
		}

		if (this.type == 6) { // L: 440
			this.modelType = 1; // L: 441
			this.modelId = var1.readUnsignedShort(); // L: 442
			if (this.modelId == 65535) { // L: 443
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 444
			this.modelOffsetY = var1.readShort(); // L: 445
			this.modelAngleX = var1.readUnsignedShort(); // L: 446
			this.modelAngleY = var1.readUnsignedShort(); // L: 447
			this.modelAngleZ = var1.readUnsignedShort(); // L: 448
			this.modelZoom = var1.readUnsignedShort(); // L: 449
			this.sequenceId = var1.readUnsignedShort(); // L: 450
			if (this.sequenceId == 65535) { // L: 451
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 452
			var1.readUnsignedShort(); // L: 453
			if (this.widthAlignment != 0) { // L: 454
				this.field2728 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 455
				var1.readUnsignedShort(); // L: 456
			}
		}

		if (this.type == 4) { // L: 459
			this.fontId = var1.readUnsignedShort(); // L: 460
			if (this.fontId == 65535) { // L: 461
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 462
			this.textLineHeight = var1.readUnsignedByte(); // L: 463
			this.textXAlignment = var1.readUnsignedByte(); // L: 464
			this.textYAlignment = var1.readUnsignedByte(); // L: 465
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 466
			this.color = var1.readInt(); // L: 467
		}

		if (this.type == 3) { // L: 469
			this.color = var1.readInt(); // L: 470
			this.fill = var1.readUnsignedByte() == 1; // L: 471
			this.transparencyTop = var1.readUnsignedByte(); // L: 472
		}

		if (this.type == 9) { // L: 474
			this.lineWid = var1.readUnsignedByte(); // L: 475
			this.color = var1.readInt(); // L: 476
			this.field2639 = var1.readUnsignedByte() == 1; // L: 477
		}

		this.flags = var1.readMedium(); // L: 479
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 480
		int var2 = var1.readUnsignedByte(); // L: 481
		if (var2 > 0) { // L: 482
			this.actions = new String[var2]; // L: 483

			for (int var3 = 0; var3 < var2; ++var3) { // L: 484
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 486
		this.dragThreshold = var1.readUnsignedByte(); // L: 487
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 488
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 489
		this.onLoad = this.readListener(var1); // L: 490
		this.onMouseOver = this.readListener(var1); // L: 491
		this.onMouseLeave = this.readListener(var1); // L: 492
		this.onTargetLeave = this.readListener(var1); // L: 493
		this.onTargetEnter = this.readListener(var1); // L: 494
		this.onVarTransmit = this.readListener(var1); // L: 495
		this.onInvTransmit = this.readListener(var1); // L: 496
		this.onStatTransmit = this.readListener(var1); // L: 497
		this.onTimer = this.readListener(var1); // L: 498
		this.onOp = this.readListener(var1); // L: 499
		this.onMouseRepeat = this.readListener(var1); // L: 500
		this.onClick = this.readListener(var1); // L: 501
		this.onClickRepeat = this.readListener(var1); // L: 502
		this.onRelease = this.readListener(var1); // L: 503
		this.onHold = this.readListener(var1); // L: 504
		this.onDrag = this.readListener(var1); // L: 505
		this.onDragComplete = this.readListener(var1); // L: 506
		this.onScroll = this.readListener(var1); // L: 507
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 508
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 509
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 510
	} // L: 511

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)[Ljava/lang/Object;",
		garbageValue = "1410086858"
	)
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 514
		if (var2 == 0) { // L: 515
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 516

			for (int var4 = 0; var4 < var2; ++var4) { // L: 517
				int var5 = var1.readUnsignedByte(); // L: 518
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 519
				} else if (var5 == 1) { // L: 520
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 522
			return var3; // L: 523
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)[I",
		garbageValue = "931068469"
	)
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 527
		if (var2 == 0) { // L: 528
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 529

			for (int var4 = 0; var4 < var2; ++var4) { // L: 530
				var3[var4] = var1.readInt(); // L: 531
			}

			return var3; // L: 533
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1248652086"
	)
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 537
		this.itemIds[var2] = this.itemIds[var1]; // L: 538
		this.itemIds[var1] = var3; // L: 539
		var3 = this.itemQuantities[var2]; // L: 540
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 541
		this.itemQuantities[var1] = var3; // L: 542
	} // L: 543

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZB)Llp;",
		garbageValue = "-13"
	)
	public Sprite getSprite(boolean var1) {
		field2611 = false; // L: 546
		int var2;
		if (var1) { // L: 548
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 549
		}

		if (var2 == -1) { // L: 550
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 551
			Sprite var5 = (Sprite)Widget_cachedSprites.get(var3); // L: 552
			if (var5 != null) { // L: 553
				return var5;
			} else {
				var5 = AbstractUserComparator.SpriteBuffer_getSprite(Messages.Widget_spritesArchive, var2, 0); // L: 554
				if (var5 == null) { // L: 555
					field2611 = true; // L: 556
					return null; // L: 557
				} else {
					if (this.spriteFlipV) { // L: 559
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 560
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 561
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 562
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 563
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 564
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 565
					return var5; // L: 566
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lkr;",
		garbageValue = "-5714739"
	)
	public Font getFont() {
		field2611 = false; // L: 570
		if (this.fontId == -1) { // L: 571
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 572
			if (var1 != null) { // L: 573
				return var1;
			} else {
				var1 = RouteStrategy.method3688(Messages.Widget_spritesArchive, HealthBar.Widget_fontsArchive, this.fontId, 0); // L: 574
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 575
				} else {
					field2611 = true; // L: 576
				}

				return var1; // L: 577
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Llp;",
		garbageValue = "45"
	)
	public Sprite getInventorySprite(int var1) {
		field2611 = false; // L: 581
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 582
			int var2 = this.inventorySprites[var1]; // L: 583
			if (var2 == -1) { // L: 584
				return null;
			} else {
				Sprite var3 = (Sprite)Widget_cachedSprites.get((long)var2); // L: 585
				if (var3 != null) { // L: 586
					return var3;
				} else {
					var3 = AbstractUserComparator.SpriteBuffer_getSprite(Messages.Widget_spritesArchive, var2, 0); // L: 587
					if (var3 != null) { // L: 588
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2611 = true; // L: 589
					}

					return var3; // L: 590
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IZLha;I)Ler;",
		garbageValue = "-1710688056"
	)
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerAppearance var4) {
		field2611 = false; // L: 594
		int var5;
		int var6;
		if (var3) { // L: 597
			var5 = this.modelType2; // L: 598
			var6 = this.modelId2; // L: 599
		} else {
			var5 = this.modelType; // L: 602
			var6 = this.modelId; // L: 603
		}

		if (var5 == 0) { // L: 605
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 606
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 607
			if (var7 == null) { // L: 608
				ModelData var8;
				if (var5 == 1) { // L: 610
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0); // L: 611
					if (var8 == null) { // L: 612
						field2611 = true; // L: 613
						return null; // L: 614
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 616
				}

				if (var5 == 2) { // L: 618
					var8 = Skeleton.getNpcDefinition(var6).getModelData(); // L: 619
					if (var8 == null) { // L: 620
						field2611 = true; // L: 621
						return null; // L: 622
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 624
				}

				if (var5 == 3) { // L: 626
					if (var4 == null) { // L: 627
						return null;
					}

					var8 = var4.getModelData(); // L: 628
					if (var8 == null) { // L: 629
						field2611 = true; // L: 630
						return null; // L: 631
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 633
				}

				if (var5 == 4) { // L: 635
					ItemDefinition var9 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6); // L: 636
					var8 = var9.getModelData(10); // L: 637
					if (var8 == null) { // L: 638
						field2611 = true; // L: 639
						return null; // L: 640
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 642
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 644
			}

			if (var1 != null) { // L: 646
				var7 = var1.transformWidgetModel(var7, var2); // L: 647
			}

			return var7; // L: 649
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lhz;",
		garbageValue = "1282321676"
	)
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 653
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 1800888721 * -250118287 : this.spriteId2 * -408987673 * -1969239081; // L: 654
		if (var2 == -1) { // L: 655
			return null;
		} else {
			long var3 = ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 656
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 657
			if (var5 != null) { // L: 658
				return var5;
			} else {
				Sprite var6 = this.getSprite(var1); // L: 659
				if (var6 == null) { // L: 660
					return null;
				} else {
					Sprite var7 = var6.copyNormalized(); // L: 661
					int[] var8 = new int[var7.subHeight]; // L: 662
					int[] var9 = new int[var7.subHeight]; // L: 663

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 664
						int var11 = 0; // L: 665
						int var12 = var7.subWidth; // L: 666

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 667
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 668
								var11 = var13; // L: 669
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 673
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 674
								var12 = var13 + 1; // L: 675
								break;
							}
						}

						var8[var10] = var11; // L: 679
						var9[var10] = var12 - var11; // L: 680
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 682
					Widget_cachedSpriteMasks.put(var5, var3); // L: 683
					return var5; // L: 684
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1337078024"
	)
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 695
			String[] var3 = new String[var1 + 1]; // L: 696
			if (this.actions != null) { // L: 697
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 698
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 700
		}

		this.actions[var1] = var2; // L: 702
	} // L: 703

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lln;ZI)V",
		garbageValue = "-846882241"
	)
	public static void method4173(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 193
			try {
				NetCache.NetCache_socket.close(); // L: 195
			} catch (Exception var8) { // L: 197
			}

			NetCache.NetCache_socket = null; // L: 198
		}

		NetCache.NetCache_socket = var0; // L: 200
		Buffer var2;
		if (NetCache.NetCache_socket != null) { // L: 202
			try {
				var2 = new Buffer(4); // L: 204
				var2.writeByte(var1 ? 2 : 3); // L: 205
				var2.writeMedium(0); // L: 206
				NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 207
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close(); // L: 211
				} catch (Exception var6) { // L: 213
				}

				++NetCache.NetCache_ioExceptions; // L: 214
				NetCache.NetCache_socket = null; // L: 215
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 218
		TilePaint.NetCache_currentResponse = null; // L: 219
		class224.NetCache_responseArchiveBuffer = null; // L: 220
		NetCache.field3205 = 0; // L: 221

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 223
			if (var9 == null) { // L: 224
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 230
					if (var9 == null) { // L: 231
						if (NetCache.field3208 != 0) { // L: 237
							try {
								var2 = new Buffer(4); // L: 239
								var2.writeByte(4); // L: 240
								var2.writeByte(NetCache.field3208); // L: 241
								var2.writeShort(0); // L: 242
								NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 243
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 247
								} catch (Exception var4) { // L: 249
								}

								++NetCache.NetCache_ioExceptions; // L: 250
								NetCache.NetCache_socket = null; // L: 251
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 254
						NetCache.field3195 = PacketWriter.currentTimeMillis(); // L: 255
						return; // L: 256
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9); // L: 232
					NetCache.NetCache_pendingWrites.put(var9, var9.key); // L: 233
					++NetCache.NetCache_pendingWritesCount; // L: 234
					--NetCache.NetCache_pendingResponsesCount; // L: 235
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key); // L: 225
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 226
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 227
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Liw;IS)V",
		garbageValue = "1604"
	)
	static void method4174(Archive var0, int var1) {
		if (MenuAction.NetCache_reference != null) { // L: 259
			MenuAction.NetCache_reference.offset = var1 * 8 + 5; // L: 260
			int var2 = MenuAction.NetCache_reference.readInt(); // L: 261
			int var3 = MenuAction.NetCache_reference.readInt(); // L: 262
			var0.loadIndex(var2, var3); // L: 263
		} else {
			Varps.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 266
			NetCache.NetCache_archives[var1] = var0; // L: 267
		}
	} // L: 264 268

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "37"
	)
	public static boolean method4172(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 25
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "757638710"
	)
	static final void method4175(int var0) {
		if (var0 >= 0) { // L: 7239
			int var1 = Client.menuArguments1[var0]; // L: 7240
			int var2 = Client.menuArguments2[var0]; // L: 7241
			int var3 = Client.menuOpcodes[var0]; // L: 7242
			int var4 = Client.menuIdentifiers[var0]; // L: 7243
			String var5 = Client.menuActions[var0]; // L: 7244
			String var6 = Client.menuTargets[var0]; // L: 7245
			SecureRandomCallable.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 7246
		}
	} // L: 7247
}
