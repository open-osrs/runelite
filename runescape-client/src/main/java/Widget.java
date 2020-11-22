import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[[Lht;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("c")
	@Export("Widget_loadedInterfaces")
	static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("y")
	public static boolean field2677;
	@ObfuscatedName("s")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -583486671
	)
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1360175439
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1823014479
	)
	@Export("type")
	public int type;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1601942739
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1509263011
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -577014137
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1228051433
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 841889031
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -300976641
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1326300873
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1422648317
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 497062529
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -682926215
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 371785153
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 766965945
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 410180701
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1661593933
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -370918947
	)
	public int field2610;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1940118895
	)
	public int field2611;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1412750483
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ax")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -182885719
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 192866787
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -999155981
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1625501093
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1857019467
	)
	@Export("color")
	public int color;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 808301363
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -153387015
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2099006501
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 527341201
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 509195953
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 854987601
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bb")
	public boolean field2627;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 372301921
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -402783927
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1106974971
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bc")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -90624959
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 980647975
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bn")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bo")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -498393033
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -259490959
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1852201437
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1086899159
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1208440245
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 931568329
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -858623233
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -741084995
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2065006749
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 989386551
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1566757881
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 695055175
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 200052753
	)
	public int field2678;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 2066974309
	)
	public int field2734;
	@ObfuscatedName("bi")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bu")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -484301607
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 272063495
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ce")
	@Export("text")
	public String text;
	@ObfuscatedName("cf")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1323405895
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1997351313
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1635883311
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cl")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1844469737
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1233173447
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cx")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("ca")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cn")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cw")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 59391427
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cq")
	public boolean field2667;
	@ObfuscatedName("cd")
	public byte[][] field2668;
	@ObfuscatedName("cj")
	public byte[][] field2649;
	@ObfuscatedName("cv")
	public int[] field2670;
	@ObfuscatedName("cz")
	public int[] field2671;
	@ObfuscatedName("dg")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("db")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1496607755
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -149689265
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dl")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dq")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dp")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("do")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dm")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dh")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("da")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dz")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ds")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dc")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dy")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dj")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dw")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dx")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("dt")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("de")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("di")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dn")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("du")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dr")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("en")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("eq")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ek")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ez")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("er")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eo")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("eh")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ew")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ep")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eu")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ei")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ef")
	public Object[] field2669;
	@ObfuscatedName("ec")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ej")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("em")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 493890133
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ex")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ea")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ed")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ey")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -659047965
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1581915613
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1715464223
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 540822947
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[Lht;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fs")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fw")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -884134671
	)
	public int field2726;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1253917553
	)
	public int field2727;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1015869805
	)
	public int field2728;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 884540733
	)
	public int field2729;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 651630769
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = -536480473
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fb")
	public int[] field2594;
	@ObfuscatedName("fv")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fk")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fm")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2677 = false; // L: 35
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
		this.field2610 = 1; // L: 54
		this.field2611 = 1; // L: 55
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
		this.field2627 = false; // L: 71
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
		this.field2678 = 0; // L: 92
		this.field2734 = 0; // L: 93
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
		this.field2667 = false; // L: 111
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
		this.field2726 = -1; // L: 174
		this.field2727 = 0; // L: 175
		this.field2728 = 0; // L: 176
		this.field2729 = 0; // L: 177
		this.rootIndex = -1; // L: 178
		this.cycle = -1; // L: 179
		this.noClickThrough = false; // L: 181
		this.noScrollThrough = false; // L: 182
		this.prioritizeMenuEntry = false; // L: 183
	} // L: 728

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "1764104870"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 252
		this.type = var1.readUnsignedByte(); // L: 253
		this.buttonType = var1.readUnsignedByte(); // L: 254
		this.contentType = var1.readUnsignedShort(); // L: 255
		this.rawX = var1.readShort(); // L: 256
		this.rawY = var1.readShort(); // L: 257
		this.rawWidth = var1.readUnsignedShort(); // L: 258
		this.rawHeight = var1.readUnsignedShort(); // L: 259
		this.transparencyTop = var1.readUnsignedByte(); // L: 260
		this.parentId = var1.readUnsignedShort(); // L: 261
		if (this.parentId == 65535) { // L: 262
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 263
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 264
		if (this.mouseOverRedirect == 65535) { // L: 265
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 266
		int var3;
		if (var2 > 0) { // L: 267
			this.cs1Comparisons = new int[var2]; // L: 268
			this.cs1ComparisonValues = new int[var2]; // L: 269

			for (var3 = 0; var3 < var2; ++var3) { // L: 270
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 271
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 272
			}
		}

		var3 = var1.readUnsignedByte(); // L: 275
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 276
			this.cs1Instructions = new int[var3][]; // L: 277

			for (var4 = 0; var4 < var3; ++var4) { // L: 278
				var5 = var1.readUnsignedShort(); // L: 279
				this.cs1Instructions[var4] = new int[var5]; // L: 280

				for (var6 = 0; var6 < var5; ++var6) { // L: 281
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 282
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 283
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 287
			this.scrollHeight = var1.readUnsignedShort(); // L: 288
			this.isHidden = var1.readUnsignedByte() == 1; // L: 289
		}

		if (this.type == 1) { // L: 291
			var1.readUnsignedShort(); // L: 292
			var1.readUnsignedByte(); // L: 293
		}

		if (this.type == 2) { // L: 295
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 296
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 297
			var4 = var1.readUnsignedByte(); // L: 298
			if (var4 == 1) { // L: 299
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 300
			if (var5 == 1) { // L: 301
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 302
			if (var6 == 1) { // L: 303
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 304
			if (var7 == 1) { // L: 305
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 306
			this.paddingY = var1.readUnsignedByte(); // L: 307
			this.inventoryXOffsets = new int[20]; // L: 308
			this.inventoryYOffsets = new int[20]; // L: 309
			this.inventorySprites = new int[20]; // L: 310

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 311
				int var11 = var1.readUnsignedByte(); // L: 312
				if (var11 == 1) { // L: 313
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 314
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 315
					this.inventorySprites[var8] = var1.readInt(); // L: 316
				} else {
					this.inventorySprites[var8] = -1; // L: 318
				}
			}

			this.itemActions = new String[5]; // L: 320

			for (var8 = 0; var8 < 5; ++var8) { // L: 321
				String var9 = var1.readStringCp1252NullTerminated(); // L: 322
				if (var9.length() > 0) { // L: 323
					this.itemActions[var8] = var9; // L: 324
					this.flags |= 1 << var8 + 23; // L: 325
				}
			}
		}

		if (this.type == 3) { // L: 329
			this.fill = var1.readUnsignedByte() == 1; // L: 330
		}

		if (this.type == 4 || this.type == 1) { // L: 332
			this.textXAlignment = var1.readUnsignedByte(); // L: 333
			this.textYAlignment = var1.readUnsignedByte(); // L: 334
			this.textLineHeight = var1.readUnsignedByte(); // L: 335
			this.fontId = var1.readUnsignedShort(); // L: 336
			if (this.fontId == 65535) { // L: 337
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 338
		}

		if (this.type == 4) { // L: 340
			this.text = var1.readStringCp1252NullTerminated(); // L: 341
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 342
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 344
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 345
			this.color2 = var1.readInt(); // L: 346
			this.mouseOverColor = var1.readInt(); // L: 347
			this.mouseOverColor2 = var1.readInt(); // L: 348
		}

		if (this.type == 5) { // L: 350
			this.spriteId2 = var1.readInt(); // L: 351
			this.spriteId = var1.readInt(); // L: 352
		}

		if (this.type == 6) { // L: 354
			this.modelType = 1; // L: 355
			this.modelId = var1.readUnsignedShort(); // L: 356
			if (this.modelId == 65535) { // L: 357
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 358
			this.modelId2 = var1.readUnsignedShort(); // L: 359
			if (this.modelId2 == 65535) { // L: 360
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 361
			if (this.sequenceId == 65535) { // L: 362
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 363
			if (this.sequenceId2 == 65535) { // L: 364
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 365
			this.modelAngleX = var1.readUnsignedShort(); // L: 366
			this.modelAngleY = var1.readUnsignedShort(); // L: 367
		}

		if (this.type == 7) { // L: 369
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 370
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 371
			this.textXAlignment = var1.readUnsignedByte(); // L: 372
			this.fontId = var1.readUnsignedShort(); // L: 373
			if (this.fontId == 65535) { // L: 374
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 375
			this.color = var1.readInt(); // L: 376
			this.paddingX = var1.readShort(); // L: 377
			this.paddingY = var1.readShort(); // L: 378
			var4 = var1.readUnsignedByte(); // L: 379
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 380
			}

			this.itemActions = new String[5]; // L: 381

			for (var5 = 0; var5 < 5; ++var5) { // L: 382
				String var10 = var1.readStringCp1252NullTerminated(); // L: 383
				if (var10.length() > 0) { // L: 384
					this.itemActions[var5] = var10; // L: 385
					this.flags |= 1 << var5 + 23; // L: 386
				}
			}
		}

		if (this.type == 8) { // L: 390
			this.text = var1.readStringCp1252NullTerminated(); // L: 391
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 393
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 394
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 395
			var4 = var1.readUnsignedShort() & 63; // L: 396
			this.flags |= var4 << 11; // L: 397
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 399
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 400
			if (this.buttonText.length() == 0) { // L: 401
				if (this.buttonType == 1) { // L: 402
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 403
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 404
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 405
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 408
			this.flags |= 4194304; // L: 409
		}

		if (this.buttonType == 6) { // L: 411
			this.flags |= 1; // L: 412
		}

	} // L: 414

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-517843839"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 417
		this.isIf3 = true; // L: 418
		this.type = var1.readUnsignedByte(); // L: 419
		this.contentType = var1.readUnsignedShort(); // L: 420
		this.rawX = var1.readShort(); // L: 421
		this.rawY = var1.readShort(); // L: 422
		this.rawWidth = var1.readUnsignedShort(); // L: 423
		if (this.type == 9) { // L: 424
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 425
		}

		this.widthAlignment = var1.readByte(); // L: 426
		this.heightAlignment = var1.readByte(); // L: 427
		this.xAlignment = var1.readByte(); // L: 428
		this.yAlignment = var1.readByte(); // L: 429
		this.parentId = var1.readUnsignedShort(); // L: 430
		if (this.parentId == 65535) { // L: 431
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 432
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 433
		if (this.type == 0) { // L: 434
			this.scrollWidth = var1.readUnsignedShort(); // L: 435
			this.scrollHeight = var1.readUnsignedShort(); // L: 436
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 437
		}

		if (this.type == 5) { // L: 439
			this.spriteId2 = var1.readInt(); // L: 440
			this.spriteAngle = var1.readUnsignedShort(); // L: 441
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 442
			this.transparencyTop = var1.readUnsignedByte(); // L: 443
			this.outline = var1.readUnsignedByte(); // L: 444
			this.spriteShadow = var1.readInt(); // L: 445
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 446
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 447
		}

		if (this.type == 6) { // L: 449
			this.modelType = 1; // L: 450
			this.modelId = var1.readUnsignedShort(); // L: 451
			if (this.modelId == 65535) { // L: 452
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 453
			this.modelOffsetY = var1.readShort(); // L: 454
			this.modelAngleX = var1.readUnsignedShort(); // L: 455
			this.modelAngleY = var1.readUnsignedShort(); // L: 456
			this.modelAngleZ = var1.readUnsignedShort(); // L: 457
			this.modelZoom = var1.readUnsignedShort(); // L: 458
			this.sequenceId = var1.readUnsignedShort(); // L: 459
			if (this.sequenceId == 65535) { // L: 460
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 461
			var1.readUnsignedShort(); // L: 462
			if (this.widthAlignment != 0) { // L: 463
				this.field2678 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 464
				var1.readUnsignedShort(); // L: 465
			}
		}

		if (this.type == 4) { // L: 468
			this.fontId = var1.readUnsignedShort(); // L: 469
			if (this.fontId == 65535) { // L: 470
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 471
			this.textLineHeight = var1.readUnsignedByte(); // L: 472
			this.textXAlignment = var1.readUnsignedByte(); // L: 473
			this.textYAlignment = var1.readUnsignedByte(); // L: 474
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 475
			this.color = var1.readInt(); // L: 476
		}

		if (this.type == 3) { // L: 478
			this.color = var1.readInt(); // L: 479
			this.fill = var1.readUnsignedByte() == 1; // L: 480
			this.transparencyTop = var1.readUnsignedByte(); // L: 481
		}

		if (this.type == 9) { // L: 483
			this.lineWid = var1.readUnsignedByte(); // L: 484
			this.color = var1.readInt(); // L: 485
			this.field2627 = var1.readUnsignedByte() == 1; // L: 486
		}

		this.flags = var1.readMedium(); // L: 488
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 489
		int var2 = var1.readUnsignedByte(); // L: 490
		if (var2 > 0) { // L: 491
			this.actions = new String[var2]; // L: 492

			for (int var3 = 0; var3 < var2; ++var3) { // L: 493
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 495
		this.dragThreshold = var1.readUnsignedByte(); // L: 496
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 497
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 498
		this.onLoad = this.readListener(var1); // L: 499
		this.onMouseOver = this.readListener(var1); // L: 500
		this.onMouseLeave = this.readListener(var1); // L: 501
		this.onTargetLeave = this.readListener(var1); // L: 502
		this.onTargetEnter = this.readListener(var1); // L: 503
		this.onVarTransmit = this.readListener(var1); // L: 504
		this.onInvTransmit = this.readListener(var1); // L: 505
		this.onStatTransmit = this.readListener(var1); // L: 506
		this.onTimer = this.readListener(var1); // L: 507
		this.onOp = this.readListener(var1); // L: 508
		this.onMouseRepeat = this.readListener(var1); // L: 509
		this.onClick = this.readListener(var1); // L: 510
		this.onClickRepeat = this.readListener(var1); // L: 511
		this.onRelease = this.readListener(var1); // L: 512
		this.onHold = this.readListener(var1); // L: 513
		this.onDrag = this.readListener(var1); // L: 514
		this.onDragComplete = this.readListener(var1); // L: 515
		this.onScroll = this.readListener(var1); // L: 516
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 517
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 518
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 519
	} // L: 520

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)[Ljava/lang/Object;",
		garbageValue = "1938670345"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 523
		if (var2 == 0) { // L: 524
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 525

			for (int var4 = 0; var4 < var2; ++var4) { // L: 526
				int var5 = var1.readUnsignedByte(); // L: 527
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 528
				} else if (var5 == 1) { // L: 529
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 531
			return var3; // L: 532
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkb;S)[I",
		garbageValue = "22328"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 536
		if (var2 == 0) { // L: 537
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 538

			for (int var4 = 0; var4 < var2; ++var4) { // L: 539
				var3[var4] = var1.readInt(); // L: 540
			}

			return var3; // L: 542
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "49"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 546
		this.itemIds[var2] = this.itemIds[var1]; // L: 547
		this.itemIds[var1] = var3; // L: 548
		var3 = this.itemQuantities[var2]; // L: 549
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 550
		this.itemQuantities[var1] = var3; // L: 551
	} // L: 552

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llc;",
		garbageValue = "1009735615"
	)
	@Export("getSprite")
	public Sprite getSprite(boolean var1) {
		field2677 = false; // L: 555
		int var2;
		if (var1) { // L: 557
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 558
		}

		if (var2 == -1) { // L: 559
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 560
			Sprite var5 = (Sprite)Widget_cachedSprites.get(var3); // L: 561
			if (var5 != null) { // L: 562
				return var5;
			} else {
				var5 = FloorDecoration.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 563
				if (var5 == null) { // L: 564
					field2677 = true; // L: 565
					return null; // L: 566
				} else {
					if (this.spriteFlipV) { // L: 568
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 569
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 570
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 571
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 572
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 573
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 574
					return var5; // L: 575
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-1856461280"
	)
	@Export("getFont")
	public Font getFont() {
		field2677 = false; // L: 579
		if (this.fontId == -1) { // L: 580
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 581
			if (var1 != null) { // L: 582
				return var1;
			} else {
				AbstractArchive var3 = Widget_spritesArchive; // L: 584
				AbstractArchive var4 = Widget_fontsArchive; // L: 585
				int var5 = this.fontId; // L: 586
				byte[] var7 = var3.takeFile(var5, 0); // L: 590
				boolean var6;
				if (var7 == null) { // L: 591
					var6 = false; // L: 592
				} else {
					class217.SpriteBuffer_decode(var7); // L: 595
					var6 = true; // L: 596
				}

				Font var2;
				if (!var6) { // L: 598
					var2 = null; // L: 599
				} else {
					var2 = UrlRequester.method3430(var4.takeFile(var5, 0)); // L: 602
				}

				if (var2 != null) {
					Widget_cachedFonts.put(var2, (long)this.fontId); // L: 605
				} else {
					field2677 = true; // L: 606
				}

				return var2; // L: 607
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Llc;",
		garbageValue = "-521963360"
	)
	@Export("getInventorySprite")
	public Sprite getInventorySprite(int var1) {
		field2677 = false; // L: 611
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 612
			int var2 = this.inventorySprites[var1]; // L: 613
			if (var2 == -1) { // L: 614
				return null;
			} else {
				Sprite var3 = (Sprite)Widget_cachedSprites.get((long)var2); // L: 615
				if (var3 != null) { // L: 616
					return var3;
				} else {
					var3 = FloorDecoration.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 617
					if (var3 != null) { // L: 618
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2677 = true; // L: 619
					}

					return var3; // L: 620
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IZLhu;I)Leh;",
		garbageValue = "1269686702"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerAppearance var4) {
		field2677 = false; // L: 624
		int var5;
		int var6;
		if (var3) { // L: 627
			var5 = this.modelType2; // L: 628
			var6 = this.modelId2; // L: 629
		} else {
			var5 = this.modelType; // L: 632
			var6 = this.modelId; // L: 633
		}

		if (var5 == 0) { // L: 635
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 636
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 637
			if (var7 == null) { // L: 638
				ModelData var8;
				if (var5 == 1) { // L: 640
					var8 = ModelData.ModelData_get(GameBuild.Widget_modelsArchive, var6, 0); // L: 641
					if (var8 == null) { // L: 642
						field2677 = true; // L: 643
						return null; // L: 644
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 646
				}

				if (var5 == 2) { // L: 648
					var8 = Clock.getNpcDefinition(var6).getModelData(); // L: 649
					if (var8 == null) { // L: 650
						field2677 = true; // L: 651
						return null; // L: 652
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 654
				}

				if (var5 == 3) { // L: 656
					if (var4 == null) { // L: 657
						return null;
					}

					var8 = var4.getModelData(); // L: 658
					if (var8 == null) { // L: 659
						field2677 = true; // L: 660
						return null; // L: 661
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 663
				}

				if (var5 == 4) { // L: 665
					ItemDefinition var9 = AbstractWorldMapData.ItemDefinition_get(var6); // L: 666
					var8 = var9.getModelData(10); // L: 667
					if (var8 == null) { // L: 668
						field2677 = true; // L: 669
						return null; // L: 670
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 672
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 674
			}

			if (var1 != null) { // L: 676
				var7 = var1.transformWidgetModel(var7, var2); // L: 677
			}

			return var7; // L: 679
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lho;",
		garbageValue = "-13"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 683
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -402783927 * -1960132359 : this.spriteId2 * 372301921 * -755383391; // L: 684
		if (var2 == -1) { // L: 685
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 686
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 687
			if (var5 != null) { // L: 688
				return var5;
			} else {
				Sprite var6 = this.getSprite(var1); // L: 689
				if (var6 == null) { // L: 690
					return null;
				} else {
					Sprite var7 = var6.copyNormalized(); // L: 691
					int[] var8 = new int[var7.subHeight]; // L: 692
					int[] var9 = new int[var7.subHeight]; // L: 693

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 694
						int var11 = 0; // L: 695
						int var12 = var7.subWidth; // L: 696

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 697
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 698
								var11 = var13; // L: 699
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 703
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 704
								var12 = var13 + 1; // L: 705
								break;
							}
						}

						var8[var10] = var11; // L: 709
						var9[var10] = var12 - var11; // L: 710
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 712
					Widget_cachedSpriteMasks.put(var5, var3); // L: 713
					return var5; // L: 714
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1671583868"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 718
			String[] var3 = new String[var1 + 1]; // L: 719
			if (this.actions != null) { // L: 720
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 721
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 723
		}

		this.actions[var1] = var2; // L: 725
	} // L: 726

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	static boolean method4239() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4922
	}
}
