import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("w")
	@Export("Widget_loadedInterfaces")
	static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static EvictingDualNodeHashTable field3222;
	@ObfuscatedName("a")
	public static boolean field3223;
	@ObfuscatedName("u")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2075239563
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1765912961
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -662656213
	)
	@Export("type")
	public int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2103555439
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -421542377
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1776788083
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 755518345
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1656675739
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1261392773
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1808070299
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1911563275
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1569538763
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 556685443
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1962054505
	)
	@Export("x")
	public int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1127629965
	)
	@Export("y")
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 137530349
	)
	@Export("width")
	public int width;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 147077041
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 130394051
	)
	public int field3242;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 341333975
	)
	public int field3243;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1186103625
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("af")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 665368309
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1369672271
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -362959503
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -390853847
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -830468905
	)
	@Export("color")
	public int color;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -744334253
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 147049371
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1415992785
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aw")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 193150235
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -749359679
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 19573505
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bp")
	public boolean field3359;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 949557953
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 728672183
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1593709613
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bg")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 904416977
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 878706021
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bm")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1789185725
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 434114019
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2007672513
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 961616719
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1588019651
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 583977265
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 459494725
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 584596143
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2011255181
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -192481701
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1120643849
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1128501563
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1248935109
	)
	public int field3280;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1790940755
	)
	public int field3260;
	@ObfuscatedName("bo")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bf")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1120157659
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1677313687
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cl")
	@Export("text")
	public String text;
	@ObfuscatedName("cp")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1468399469
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1376772263
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1684285413
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cy")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2093941643
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -792170613
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("co")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cc")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cs")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cr")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 485964777
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cj")
	public boolean field3299;
	@ObfuscatedName("ca")
	public byte[][] field3300;
	@ObfuscatedName("cz")
	public byte[][] field3301;
	@ObfuscatedName("cw")
	public int[] field3302;
	@ObfuscatedName("ct")
	public int[] field3303;
	@ObfuscatedName("cu")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cx")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -2013881261
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -2058089895
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ds")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dv")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("do")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dt")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dy")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dk")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("de")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("df")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dh")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dn")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dx")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dp")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dc")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dq")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("db")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dj")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dd")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("du")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dl")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dw")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("di")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dz")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("da")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eu")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("et")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eg")
	public Object[] field3335;
	@ObfuscatedName("ek")
	public Object[] field3336;
	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ev")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ep")
	public Object[] field3217;
	@ObfuscatedName("ej")
	public Object[] field3340;
	@ObfuscatedName("er")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("em")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("el")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eo")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ee")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("en")
	public Object[] field3294;
	@ObfuscatedName("ez")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eh")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ei")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -1965658387
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ea")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ex")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ec")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("es")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -757750871
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -462414583
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1348132735
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -676166249
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ft")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fk")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1631841167
	)
	public int field3341;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1237599647
	)
	public int field3363;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1972995307
	)
	public int field3364;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1004662139
	)
	public int field3365;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -1959664983
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1623310513
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fh")
	public int[] field3368;
	@ObfuscatedName("fd")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fq")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fz")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedModels = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedFonts = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(20); // L: 33
		field3222 = new EvictingDualNodeHashTable(8); // L: 34
		field3223 = false; // L: 35
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
		this.field3242 = 1; // L: 54
		this.field3243 = 1; // L: 55
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
		this.field3359 = false; // L: 71
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
		this.field3280 = 0; // L: 92
		this.field3260 = 0; // L: 93
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
		this.field3299 = false; // L: 111
		this.dataText = ""; // L: 120
		this.parent = null; // L: 122
		this.dragZoneSize = 0; // L: 123
		this.dragThreshold = 0; // L: 124
		this.isScrollBar = false; // L: 125
		this.spellActionName = ""; // L: 126
		this.hasListener = false; // L: 127
		this.mouseOverRedirect = -1; // L: 166
		this.spellName = ""; // L: 167
		this.buttonText = "Ok"; // L: 168
		this.itemId = -1; // L: 171
		this.itemQuantity = 0; // L: 172
		this.modelFrame = 0; // L: 173
		this.modelFrameCycle = 0; // L: 174
		this.containsMouse = false; // L: 176
		this.isClicked = false; // L: 177
		this.field3341 = -1; // L: 178
		this.field3363 = 0; // L: 179
		this.field3364 = 0; // L: 180
		this.field3365 = 0; // L: 181
		this.rootIndex = -1; // L: 182
		this.cycle = -1; // L: 183
		this.noClickThrough = false; // L: 185
		this.noScrollThrough = false; // L: 186
		this.prioritizeMenuEntry = false; // L: 187
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "8"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 256
		this.type = var1.readUnsignedByte(); // L: 257
		this.buttonType = var1.readUnsignedByte(); // L: 258
		this.contentType = var1.readUnsignedShort(); // L: 259
		this.rawX = var1.readShort(); // L: 260
		this.rawY = var1.readShort(); // L: 261
		this.rawWidth = var1.readUnsignedShort(); // L: 262
		this.rawHeight = var1.readUnsignedShort(); // L: 263
		this.transparencyTop = var1.readUnsignedByte(); // L: 264
		this.parentId = var1.readUnsignedShort(); // L: 265
		if (this.parentId == 65535) { // L: 266
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 267
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 268
		if (this.mouseOverRedirect == 65535) { // L: 269
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 270
		int var3;
		if (var2 > 0) { // L: 271
			this.cs1Comparisons = new int[var2]; // L: 272
			this.cs1ComparisonValues = new int[var2]; // L: 273

			for (var3 = 0; var3 < var2; ++var3) { // L: 274
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 275
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 276
			}
		}

		var3 = var1.readUnsignedByte(); // L: 279
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 280
			this.cs1Instructions = new int[var3][]; // L: 281

			for (var4 = 0; var4 < var3; ++var4) { // L: 282
				var5 = var1.readUnsignedShort(); // L: 283
				this.cs1Instructions[var4] = new int[var5]; // L: 284

				for (var6 = 0; var6 < var5; ++var6) { // L: 285
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 286
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 287
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 291
			this.scrollHeight = var1.readUnsignedShort(); // L: 292
			this.isHidden = var1.readUnsignedByte() == 1; // L: 293
		}

		if (this.type == 1) { // L: 295
			var1.readUnsignedShort(); // L: 296
			var1.readUnsignedByte(); // L: 297
		}

		if (this.type == 2) { // L: 299
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 300
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 301
			var4 = var1.readUnsignedByte(); // L: 302
			if (var4 == 1) { // L: 303
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 304
			if (var5 == 1) { // L: 305
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 306
			if (var6 == 1) { // L: 307
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 308
			if (var7 == 1) { // L: 309
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 310
			this.paddingY = var1.readUnsignedByte(); // L: 311
			this.inventoryXOffsets = new int[20]; // L: 312
			this.inventoryYOffsets = new int[20]; // L: 313
			this.inventorySprites = new int[20]; // L: 314

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 315
				int var11 = var1.readUnsignedByte(); // L: 316
				if (var11 == 1) { // L: 317
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 318
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 319
					this.inventorySprites[var8] = var1.readInt(); // L: 320
				} else {
					this.inventorySprites[var8] = -1; // L: 322
				}
			}

			this.itemActions = new String[5]; // L: 324

			for (var8 = 0; var8 < 5; ++var8) { // L: 325
				String var9 = var1.readStringCp1252NullTerminated(); // L: 326
				if (var9.length() > 0) { // L: 327
					this.itemActions[var8] = var9; // L: 328
					this.flags |= 1 << var8 + 23; // L: 329
				}
			}
		}

		if (this.type == 3) { // L: 333
			this.fill = var1.readUnsignedByte() == 1; // L: 334
		}

		if (this.type == 4 || this.type == 1) { // L: 336
			this.textXAlignment = var1.readUnsignedByte(); // L: 337
			this.textYAlignment = var1.readUnsignedByte(); // L: 338
			this.textLineHeight = var1.readUnsignedByte(); // L: 339
			this.fontId = var1.readUnsignedShort(); // L: 340
			if (this.fontId == 65535) { // L: 341
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 342
		}

		if (this.type == 4) { // L: 344
			this.text = var1.readStringCp1252NullTerminated(); // L: 345
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 346
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 348
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 349
			this.color2 = var1.readInt(); // L: 350
			this.mouseOverColor = var1.readInt(); // L: 351
			this.mouseOverColor2 = var1.readInt(); // L: 352
		}

		if (this.type == 5) { // L: 354
			this.spriteId2 = var1.readInt(); // L: 355
			this.spriteId = var1.readInt(); // L: 356
		}

		if (this.type == 6) { // L: 358
			this.modelType = 1; // L: 359
			this.modelId = var1.readUnsignedShort(); // L: 360
			if (this.modelId == 65535) { // L: 361
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 362
			this.modelId2 = var1.readUnsignedShort(); // L: 363
			if (this.modelId2 == 65535) { // L: 364
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 365
			if (this.sequenceId == 65535) { // L: 366
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 367
			if (this.sequenceId2 == 65535) { // L: 368
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 369
			this.modelAngleX = var1.readUnsignedShort(); // L: 370
			this.modelAngleY = var1.readUnsignedShort(); // L: 371
		}

		if (this.type == 7) { // L: 373
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 374
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 375
			this.textXAlignment = var1.readUnsignedByte(); // L: 376
			this.fontId = var1.readUnsignedShort(); // L: 377
			if (this.fontId == 65535) { // L: 378
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 379
			this.color = var1.readInt(); // L: 380
			this.paddingX = var1.readShort(); // L: 381
			this.paddingY = var1.readShort(); // L: 382
			var4 = var1.readUnsignedByte(); // L: 383
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 384
			}

			this.itemActions = new String[5]; // L: 385

			for (var5 = 0; var5 < 5; ++var5) { // L: 386
				String var10 = var1.readStringCp1252NullTerminated(); // L: 387
				if (var10.length() > 0) { // L: 388
					this.itemActions[var5] = var10; // L: 389
					this.flags |= 1 << var5 + 23; // L: 390
				}
			}
		}

		if (this.type == 8) { // L: 394
			this.text = var1.readStringCp1252NullTerminated(); // L: 395
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 397
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 398
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 399
			var4 = var1.readUnsignedShort() & 63; // L: 400
			this.flags |= var4 << 11; // L: 401
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 403
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 404
			if (this.buttonText.length() == 0) { // L: 405
				if (this.buttonType == 1) { // L: 406
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 407
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 408
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 409
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 412
			this.flags |= 4194304; // L: 413
		}

		if (this.buttonType == 6) { // L: 415
			this.flags |= 1; // L: 416
		}

	} // L: 418

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "3"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 421
		this.isIf3 = true; // L: 422
		this.type = var1.readUnsignedByte(); // L: 423
		this.contentType = var1.readUnsignedShort(); // L: 424
		this.rawX = var1.readShort(); // L: 425
		this.rawY = var1.readShort(); // L: 426
		this.rawWidth = var1.readUnsignedShort(); // L: 427
		if (this.type == 9) { // L: 428
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 429
		}

		this.widthAlignment = var1.readByte(); // L: 430
		this.heightAlignment = var1.readByte(); // L: 431
		this.xAlignment = var1.readByte(); // L: 432
		this.yAlignment = var1.readByte(); // L: 433
		this.parentId = var1.readUnsignedShort(); // L: 434
		if (this.parentId == 65535) { // L: 435
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 436
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 437
		if (this.type == 0) { // L: 438
			this.scrollWidth = var1.readUnsignedShort(); // L: 439
			this.scrollHeight = var1.readUnsignedShort(); // L: 440
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 441
		}

		if (this.type == 5) { // L: 443
			this.spriteId2 = var1.readInt(); // L: 444
			this.spriteAngle = var1.readUnsignedShort(); // L: 445
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 446
			this.transparencyTop = var1.readUnsignedByte(); // L: 447
			this.outline = var1.readUnsignedByte(); // L: 448
			this.spriteShadow = var1.readInt(); // L: 449
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 450
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 451
		}

		if (this.type == 6) { // L: 453
			this.modelType = 1; // L: 454
			this.modelId = var1.readUnsignedShort(); // L: 455
			if (this.modelId == 65535) { // L: 456
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 457
			this.modelOffsetY = var1.readShort(); // L: 458
			this.modelAngleX = var1.readUnsignedShort(); // L: 459
			this.modelAngleY = var1.readUnsignedShort(); // L: 460
			this.modelAngleZ = var1.readUnsignedShort(); // L: 461
			this.modelZoom = var1.readUnsignedShort(); // L: 462
			this.sequenceId = var1.readUnsignedShort(); // L: 463
			if (this.sequenceId == 65535) { // L: 464
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 465
			var1.readUnsignedShort(); // L: 466
			if (this.widthAlignment != 0) { // L: 467
				this.field3280 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 468
				var1.readUnsignedShort(); // L: 469
			}
		}

		if (this.type == 4) { // L: 472
			this.fontId = var1.readUnsignedShort(); // L: 473
			if (this.fontId == 65535) { // L: 474
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 475
			this.textLineHeight = var1.readUnsignedByte(); // L: 476
			this.textXAlignment = var1.readUnsignedByte(); // L: 477
			this.textYAlignment = var1.readUnsignedByte(); // L: 478
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 479
			this.color = var1.readInt(); // L: 480
		}

		if (this.type == 3) { // L: 482
			this.color = var1.readInt(); // L: 483
			this.fill = var1.readUnsignedByte() == 1; // L: 484
			this.transparencyTop = var1.readUnsignedByte(); // L: 485
		}

		if (this.type == 9) { // L: 487
			this.lineWid = var1.readUnsignedByte(); // L: 488
			this.color = var1.readInt(); // L: 489
			this.field3359 = var1.readUnsignedByte() == 1; // L: 490
		}

		this.flags = var1.readMedium(); // L: 492
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 493
		int var2 = var1.readUnsignedByte(); // L: 494
		if (var2 > 0) { // L: 495
			this.actions = new String[var2]; // L: 496

			for (int var3 = 0; var3 < var2; ++var3) { // L: 497
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 499
		this.dragThreshold = var1.readUnsignedByte(); // L: 500
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 501
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 502
		this.onLoad = this.readListener(var1); // L: 503
		this.onMouseOver = this.readListener(var1); // L: 504
		this.onMouseLeave = this.readListener(var1); // L: 505
		this.onTargetLeave = this.readListener(var1); // L: 506
		this.onTargetEnter = this.readListener(var1); // L: 507
		this.onVarTransmit = this.readListener(var1); // L: 508
		this.onInvTransmit = this.readListener(var1); // L: 509
		this.onStatTransmit = this.readListener(var1); // L: 510
		this.onTimer = this.readListener(var1); // L: 511
		this.onOp = this.readListener(var1); // L: 512
		this.onMouseRepeat = this.readListener(var1); // L: 513
		this.onClick = this.readListener(var1); // L: 514
		this.onClickRepeat = this.readListener(var1); // L: 515
		this.onRelease = this.readListener(var1); // L: 516
		this.onHold = this.readListener(var1); // L: 517
		this.onDrag = this.readListener(var1); // L: 518
		this.onDragComplete = this.readListener(var1); // L: 519
		this.onScroll = this.readListener(var1); // L: 520
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 521
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 522
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 523
	} // L: 524

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)[Ljava/lang/Object;",
		garbageValue = "-48"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 527
		if (var2 == 0) { // L: 528
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 529

			for (int var4 = 0; var4 < var2; ++var4) { // L: 530
				int var5 = var1.readUnsignedByte(); // L: 531
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 532
				} else if (var5 == 1) { // L: 533
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 535
			return var3; // L: 536
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)[I",
		garbageValue = "-1206239013"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 540
		if (var2 == 0) { // L: 541
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 542

			for (int var4 = 0; var4 < var2; ++var4) { // L: 543
				var3[var4] = var1.readInt(); // L: 544
			}

			return var3; // L: 546
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1907354945"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 550
		this.itemIds[var2] = this.itemIds[var1]; // L: 551
		this.itemIds[var1] = var3; // L: 552
		var3 = this.itemQuantities[var2]; // L: 553
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 554
		this.itemQuantities[var1] = var3; // L: 555
	} // L: 556

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpl;",
		garbageValue = "-2081524052"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3223 = false; // L: 559
		int var2;
		if (var1) { // L: 561
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 562
		}

		if (var2 == -1) { // L: 563
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 564
			SpritePixels var5 = (SpritePixels)Widget_cachedModels.get(var3); // L: 565
			if (var5 != null) { // L: 566
				return var5;
			} else {
				var5 = class6.SpriteBuffer_getSprite(GraphicsObject.Widget_spritesArchive, var2, 0); // L: 567
				if (var5 == null) { // L: 568
					field3223 = true; // L: 569
					return null; // L: 570
				} else {
					if (this.spriteFlipV) { // L: 572
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 573
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 574
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 575
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 576
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 577
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedModels.put(var5, var3); // L: 578
					return var5; // L: 579
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-2079109490"
	)
	@Export("getFont")
	public Font getFont() {
		field3223 = false; // L: 583
		if (this.fontId == -1) { // L: 584
			return null;
		} else {
			Font var1 = (Font)Widget_cachedSpriteMasks.get((long)this.fontId); // L: 585
			if (var1 != null) { // L: 586
				return var1;
			} else {
				AbstractArchive var3 = GraphicsObject.Widget_spritesArchive; // L: 588
				AbstractArchive var4 = NPC.Widget_fontsArchive; // L: 589
				int var5 = this.fontId; // L: 590
				Font var2;
				if (!class147.method3009(var3, var5, 0)) { // L: 592
					var2 = null; // L: 593
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 597
					Font var6;
					if (var7 == null) { // L: 599
						var6 = null; // L: 600
					} else {
						Font var8 = new Font(var7, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels); // L: 603
						UserComparator3.method2529(); // L: 604
						var6 = var8; // L: 605
					}

					var2 = var6; // L: 607
				}

				if (var2 != null) { // L: 610
					Widget_cachedSpriteMasks.put(var2, (long)this.fontId);
				} else {
					field3223 = true; // L: 611
				}

				return var2; // L: 612
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpl;",
		garbageValue = "-95"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3223 = false; // L: 616
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 617
			int var2 = this.inventorySprites[var1]; // L: 618
			if (var2 == -1) { // L: 619
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedModels.get((long)var2); // L: 620
				if (var3 != null) { // L: 621
					return var3;
				} else {
					var3 = class6.SpriteBuffer_getSprite(GraphicsObject.Widget_spritesArchive, var2, 0); // L: 622
					if (var3 != null) { // L: 623
						Widget_cachedModels.put(var3, (long)var2);
					} else {
						field3223 = true; // L: 624
					}

					return var3; // L: 625
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IZLjo;I)Lgo;",
		garbageValue = "733986686"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3223 = false; // L: 629
		int var5;
		int var6;
		if (var3) { // L: 632
			var5 = this.modelType2; // L: 633
			var6 = this.modelId2; // L: 634
		} else {
			var5 = this.modelType; // L: 637
			var6 = this.modelId; // L: 638
		}

		if (var5 == 0) { // L: 640
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 641
			return null;
		} else {
			Model var7 = (Model)Widget_cachedFonts.get((long)(var6 + (var5 << 16))); // L: 642
			if (var7 == null) { // L: 643
				ModelData var8;
				if (var5 == 1) { // L: 645
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0); // L: 646
					if (var8 == null) { // L: 647
						field3223 = true; // L: 648
						return null; // L: 649
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 651
				}

				if (var5 == 2) { // L: 653
					var8 = WorldMapLabelSize.getNpcDefinition(var6).getModelData(); // L: 654
					if (var8 == null) { // L: 655
						field3223 = true; // L: 656
						return null; // L: 657
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 659
				}

				if (var5 == 3) { // L: 661
					if (var4 == null) { // L: 662
						return null;
					}

					var8 = var4.getModelData(); // L: 663
					if (var8 == null) { // L: 664
						field3223 = true; // L: 665
						return null; // L: 666
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 668
				}

				if (var5 == 4) { // L: 670
					ItemComposition var9 = UserComparator6.ItemDefinition_get(var6); // L: 671
					var8 = var9.getModelData(10); // L: 672
					if (var8 == null) { // L: 673
						field3223 = true; // L: 674
						return null; // L: 675
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 677
				}

				Widget_cachedFonts.put(var7, (long)(var6 + (var5 << 16))); // L: 679
			}

			if (var1 != null) { // L: 681
				var7 = var1.transformWidgetModel(var7, var2); // L: 682
			}

			return var7; // L: 684
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ljr;",
		garbageValue = "-1371777519"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 688
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 728672183 * 655222279 : this.spriteId2 * -1083804351 * 949557953; // L: 689
		if (var2 == -1) { // L: 690
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 691
			SpriteMask var5 = (SpriteMask)field3222.get(var3); // L: 692
			if (var5 != null) { // L: 693
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 694
				if (var6 == null) { // L: 695
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 696
					int[] var8 = new int[var7.subHeight]; // L: 697
					int[] var9 = new int[var7.subHeight]; // L: 698

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 699
						int var11 = 0; // L: 700
						int var12 = var7.subWidth; // L: 701

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 702
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 703
								var11 = var13; // L: 704
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 708
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 709
								var12 = var13 + 1; // L: 710
								break;
							}
						}

						var8[var10] = var11; // L: 714
						var9[var10] = var12 - var11; // L: 715
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 717
					field3222.put(var5, var3); // L: 718
					return var5; // L: 719
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "340067933"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 730
			String[] var3 = new String[var1 + 1]; // L: 731
			if (this.actions != null) { // L: 732
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 733
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 735
		}

		this.actions[var1] = var2; // L: 737
	} // L: 738
}
