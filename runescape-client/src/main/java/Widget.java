import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("r")
	@Export("Widget_loadedInterfaces")
	static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("x")
	public static boolean field2958;
	@ObfuscatedName("u")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 363798319
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1482836169
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -562774219
	)
	@Export("type")
	public int type;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1974626303
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1544814105
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 627320861
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1854244357
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -95025113
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1904389547
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 836624487
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1601596941
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2139008707
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1355473233
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -66404377
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2017763811
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1476009263
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 25115113
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1087835647
	)
	public int field2977;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 192749483
	)
	public int field2957;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1196708861
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("an")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 976115909
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -28685509
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1727030445
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2062739769
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1286368221
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -506797087
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1740449063
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1715490111
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ai")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1449839719
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2085035941
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1723133007
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bq")
	public boolean field2994;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -241980903
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1019565859
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1070860823
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1470776531
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1555949609
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("be")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ba")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1769374205
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1676521399
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1490803313
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1980636949
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -4788971
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1751751309
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -958895997
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1127276269
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1281350053
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 638768595
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1289880071
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 495124129
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 154966647
	)
	public int field3011;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 415113775
	)
	public int field2981;
	@ObfuscatedName("bk")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bh")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -455387
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1632678803
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cx")
	@Export("text")
	public String text;
	@ObfuscatedName("cq")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1171015399
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1858738259
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -264519941
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cp")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1938227679
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1590211597
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cb")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cg")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ca")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cd")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -766759313
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cy")
	public boolean field3034;
	@ObfuscatedName("ct")
	public byte[][] field3035;
	@ObfuscatedName("ci")
	public byte[][] field3036;
	@ObfuscatedName("cs")
	public int[] field3037;
	@ObfuscatedName("co")
	public int[] field3038;
	@ObfuscatedName("ck")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cn")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1885239925
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -933833781
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dm")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("di")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ds")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("df")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dg")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dq")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dz")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dc")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dt")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dp")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("do")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dl")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("de")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("dr")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dd")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dk")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dj")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dw")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dv")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dy")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("da")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dn")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ei")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ej")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ea")
	public Object[] field3071;
	@ObfuscatedName("ec")
	public Object[] field3000;
	@ObfuscatedName("el")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("en")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("et")
	public Object[] field3075;
	@ObfuscatedName("ex")
	public Object[] field3076;
	@ObfuscatedName("eb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ek")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("em")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("er")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ey")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eg")
	public Object[] field3082;
	@ObfuscatedName("ep")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ev")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -1679183343
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("eu")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("eo")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ew")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ed")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1075326629
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1814169921
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1965960865
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 209321267
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fm")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fl")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 798804461
	)
	public int field3098;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = 327523393
	)
	public int field3089;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1440845135
	)
	public int field3100;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -1749487493
	)
	public int field2971;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -80188581
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1217907707
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fs")
	public int[] field3104;
	@ObfuscatedName("fa")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fn")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("ft")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2958 = false; // L: 35
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
		this.field2977 = 1; // L: 54
		this.field2957 = 1; // L: 55
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
		this.field2994 = false; // L: 71
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
		this.field3011 = 0; // L: 92
		this.field2981 = 0; // L: 93
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
		this.field3034 = false; // L: 111
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
		this.field3098 = -1; // L: 178
		this.field3089 = 0; // L: 179
		this.field3100 = 0; // L: 180
		this.field2971 = 0; // L: 181
		this.rootIndex = -1; // L: 182
		this.cycle = -1; // L: 183
		this.noClickThrough = false; // L: 185
		this.noScrollThrough = false; // L: 186
		this.prioritizeMenuEntry = false; // L: 187
	} // L: 711

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1168354029"
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
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 300
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 301
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
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 375
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "1"
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
				this.field3011 = var1.readUnsignedShort();
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
			this.field2994 = var1.readUnsignedByte() == 1; // L: 490
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)[Ljava/lang/Object;",
		garbageValue = "535834146"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)[I",
		garbageValue = "-86"
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-103507162"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZB)Loa;",
		garbageValue = "32"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2958 = false; // L: 559
		int var2;
		if (var1) { // L: 561
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 562
		}

		if (var2 == -1) { // L: 563
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 564
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 565
			if (var5 != null) { // L: 566
				return var5;
			} else {
				var5 = Tile.SpriteBuffer_getSprite(class44.Widget_spritesArchive, var2, 0); // L: 567
				if (var5 == null) { // L: 568
					field2958 = true; // L: 569
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

					Widget_cachedSprites.put(var5, var3); // L: 578
					return var5; // L: 579
				}
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;",
		garbageValue = "-1064213642"
	)
	@Export("getFont")
	public Font getFont() {
		field2958 = false; // L: 583
		if (this.fontId == -1) { // L: 584
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 585
			if (var1 != null) { // L: 586
				return var1;
			} else {
				var1 = Bounds.method6034(class44.Widget_spritesArchive, ChatChannel.Widget_fontsArchive, this.fontId, 0); // L: 587
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 588
				} else {
					field2958 = true; // L: 589
				}

				return var1; // L: 590
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Loa;",
		garbageValue = "39"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2958 = false; // L: 594
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 595
			int var2 = this.inventorySprites[var1]; // L: 596
			if (var2 == -1) { // L: 597
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 598
				if (var3 != null) { // L: 599
					return var3;
				} else {
					var3 = Tile.SpriteBuffer_getSprite(class44.Widget_spritesArchive, var2, 0); // L: 600
					if (var3 != null) { // L: 601
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2958 = true; // L: 602
					}

					return var3; // L: 603
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IZLih;B)Lgd;",
		garbageValue = "-1"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2958 = false; // L: 607
		int var5;
		int var6;
		if (var3) { // L: 610
			var5 = this.modelType2; // L: 611
			var6 = this.modelId2; // L: 612
		} else {
			var5 = this.modelType; // L: 615
			var6 = this.modelId; // L: 616
		}

		if (var5 == 0) { // L: 618
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 619
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 620
			if (var7 == null) { // L: 621
				ModelData var8;
				if (var5 == 1) { // L: 623
					var8 = ModelData.ModelData_get(class375.Widget_modelsArchive, var6, 0); // L: 624
					if (var8 == null) { // L: 625
						field2958 = true; // L: 626
						return null; // L: 627
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 629
				}

				if (var5 == 2) { // L: 631
					var8 = class248.getNpcDefinition(var6).getModelData(); // L: 632
					if (var8 == null) { // L: 633
						field2958 = true; // L: 634
						return null; // L: 635
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 637
				}

				if (var5 == 3) { // L: 639
					if (var4 == null) { // L: 640
						return null;
					}

					var8 = var4.getModelData(); // L: 641
					if (var8 == null) { // L: 642
						field2958 = true; // L: 643
						return null; // L: 644
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 646
				}

				if (var5 == 4) { // L: 648
					ItemComposition var9 = class250.ItemDefinition_get(var6); // L: 649
					var8 = var9.getModelData(10); // L: 650
					if (var8 == null) { // L: 651
						field2958 = true; // L: 652
						return null; // L: 653
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 655
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 657
			}

			if (var1 != null) { // L: 659
				var7 = var1.transformWidgetModel(var7, var2); // L: 660
			}

			return var7; // L: 662
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Liq;",
		garbageValue = "-1028341940"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 666
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1019565859 * -1228050571 : this.spriteId2 * -241980903 * 218370601; // L: 667
		if (var2 == -1) { // L: 668
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 669
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 670
			if (var5 != null) { // L: 671
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 672
				if (var6 == null) { // L: 673
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 674
					int[] var8 = new int[var7.subHeight]; // L: 675
					int[] var9 = new int[var7.subHeight]; // L: 676

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 677
						int var11 = 0; // L: 678
						int var12 = var7.subWidth; // L: 679

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 680
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 681
								var11 = var13; // L: 682
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 686
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 687
								var12 = var13 + 1; // L: 688
								break;
							}
						}

						var8[var10] = var11; // L: 692
						var9[var10] = var12 - var11; // L: 693
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 695
					Widget_cachedSpriteMasks.put(var5, var3); // L: 696
					return var5; // L: 697
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "16904"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 701
			String[] var3 = new String[var1 + 1]; // L: 702
			if (this.actions != null) { // L: 703
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 704
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 706
		}

		this.actions[var1] = var2; // L: 708
	} // L: 709
}
