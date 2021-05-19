import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[[Liv;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("e")
	public static boolean field2962;
	@ObfuscatedName("d")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1657404511
	)
	@Export("id")
	public int id;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -698732553
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 64684553
	)
	@Export("type")
	public int type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 324979553
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2139248973
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 845784617
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1176520073
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121464481
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -417852981
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 89011749
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1136780367
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 665432073
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 507916453
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -404307857
	)
	@Export("x")
	public int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1382743151
	)
	@Export("y")
	public int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1078557001
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 761540169
	)
	@Export("height")
	public int height;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -403059855
	)
	public int field2981;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 702840379
	)
	public int field3104;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1280996229
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ay")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1488969087
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1276398639
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -734718787
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -58177491
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1099336735
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1999893025
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -206274595
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1740312057
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ab")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1774292449
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1067540577
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2036973785
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bd")
	public boolean field2998;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 228731547
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1015582433
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -855224077
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2028815797
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -321927459
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("by")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bz")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -668548519
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 522593307
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1494613609
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 55793881
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 568573455
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1193261339
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 722531995
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1703742235
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -159122815
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -252617511
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 888599943
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1110666581
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -851269017
	)
	public int field3019;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -255882845
	)
	public int field3020;
	@ObfuscatedName("bc")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bo")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1473651185
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 713454117
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ch")
	@Export("text")
	public String text;
	@ObfuscatedName("cu")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 666665849
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 703489487
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 200371273
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ck")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -605112505
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -223176707
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cf")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cq")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cs")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cd")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -201279953
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("co")
	public boolean field2985;
	@ObfuscatedName("cz")
	public byte[][] field3039;
	@ObfuscatedName("cl")
	public byte[][] field2987;
	@ObfuscatedName("cp")
	public int[] field3070;
	@ObfuscatedName("cr")
	public int[] field3090;
	@ObfuscatedName("cb")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cv")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1548715729
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 106736357
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dj")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("du")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dw")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dp")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dl")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dd")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dz")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dh")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dn")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dm")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("da")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("de")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dy")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("di")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dt")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("df")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dg")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dv")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dx")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dc")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("db")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("el")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ec")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ei")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ek")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ee")
	public Object[] field3076;
	@ObfuscatedName("ea")
	public Object[] field2974;
	@ObfuscatedName("en")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ed")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ev")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("es")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ej")
	public Object[] field3004;
	@ObfuscatedName("ew")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eg")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 987883999
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ex")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ef")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("eh")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("eu")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 379748005
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1429348525
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 785848287
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -986770365
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("er")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fb")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 2000499449
	)
	public int field3015;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = 1600724097
	)
	public int field3100;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -2075433043
	)
	public int field3101;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -1259077203
	)
	public int field3049;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1662061379
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 359252081
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fo")
	public int[] field3105;
	@ObfuscatedName("fz")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fe")
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
		field2962 = false; // L: 35
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
		this.field2981 = 1; // L: 54
		this.field3104 = 1; // L: 55
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
		this.field2998 = false; // L: 71
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
		this.field3019 = 0; // L: 92
		this.field3020 = 0; // L: 93
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
		this.field2985 = false; // L: 111
		this.dataText = ""; // L: 120
		this.parent = null; // L: 122
		this.dragZoneSize = 0; // L: 123
		this.dragThreshold = 0; // L: 124
		this.isScrollBar = false; // L: 125
		this.spellActionName = ""; // L: 126
		this.hasListener = false; // L: 127
		this.mouseOverRedirect = -1; // L: 164
		this.spellName = ""; // L: 165
		this.buttonText = "Ok"; // L: 166
		this.itemId = -1; // L: 169
		this.itemQuantity = 0; // L: 170
		this.modelFrame = 0; // L: 171
		this.modelFrameCycle = 0; // L: 172
		this.containsMouse = false; // L: 174
		this.isClicked = false; // L: 175
		this.field3015 = -1; // L: 176
		this.field3100 = 0; // L: 177
		this.field3101 = 0; // L: 178
		this.field3049 = 0; // L: 179
		this.rootIndex = -1; // L: 180
		this.cycle = -1; // L: 181
		this.noClickThrough = false; // L: 183
		this.noScrollThrough = false; // L: 184
		this.prioritizeMenuEntry = false; // L: 185
	} // L: 745

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "106"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 254
		this.type = var1.readUnsignedByte(); // L: 255
		this.buttonType = var1.readUnsignedByte(); // L: 256
		this.contentType = var1.readUnsignedShort(); // L: 257
		this.rawX = var1.readShort(); // L: 258
		this.rawY = var1.readShort(); // L: 259
		this.rawWidth = var1.readUnsignedShort(); // L: 260
		this.rawHeight = var1.readUnsignedShort(); // L: 261
		this.transparencyTop = var1.readUnsignedByte(); // L: 262
		this.parentId = var1.readUnsignedShort(); // L: 263
		if (this.parentId == 65535) { // L: 264
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 265
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 266
		if (this.mouseOverRedirect == 65535) { // L: 267
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 268
		int var3;
		if (var2 > 0) { // L: 269
			this.cs1Comparisons = new int[var2]; // L: 270
			this.cs1ComparisonValues = new int[var2]; // L: 271

			for (var3 = 0; var3 < var2; ++var3) { // L: 272
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 273
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 274
			}
		}

		var3 = var1.readUnsignedByte(); // L: 277
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 278
			this.cs1Instructions = new int[var3][]; // L: 279

			for (var4 = 0; var4 < var3; ++var4) { // L: 280
				var5 = var1.readUnsignedShort(); // L: 281
				this.cs1Instructions[var4] = new int[var5]; // L: 282

				for (var6 = 0; var6 < var5; ++var6) { // L: 283
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 284
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 285
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 289
			this.scrollHeight = var1.readUnsignedShort(); // L: 290
			this.isHidden = var1.readUnsignedByte() == 1; // L: 291
		}

		if (this.type == 1) { // L: 293
			var1.readUnsignedShort(); // L: 294
			var1.readUnsignedByte(); // L: 295
		}

		if (this.type == 2) { // L: 297
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 298
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 299
			var4 = var1.readUnsignedByte(); // L: 300
			if (var4 == 1) { // L: 301
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 302
			if (var5 == 1) { // L: 303
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 304
			if (var6 == 1) { // L: 305
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 306
			if (var7 == 1) { // L: 307
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 308
			this.paddingY = var1.readUnsignedByte(); // L: 309
			this.inventoryXOffsets = new int[20]; // L: 310
			this.inventoryYOffsets = new int[20]; // L: 311
			this.inventorySprites = new int[20]; // L: 312

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 313
				int var11 = var1.readUnsignedByte(); // L: 314
				if (var11 == 1) { // L: 315
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 316
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 317
					this.inventorySprites[var8] = var1.readInt(); // L: 318
				} else {
					this.inventorySprites[var8] = -1; // L: 320
				}
			}

			this.itemActions = new String[5]; // L: 322

			for (var8 = 0; var8 < 5; ++var8) { // L: 323
				String var9 = var1.readStringCp1252NullTerminated(); // L: 324
				if (var9.length() > 0) { // L: 325
					this.itemActions[var8] = var9; // L: 326
					this.flags |= 1 << var8 + 23; // L: 327
				}
			}
		}

		if (this.type == 3) { // L: 331
			this.fill = var1.readUnsignedByte() == 1; // L: 332
		}

		if (this.type == 4 || this.type == 1) { // L: 334
			this.textXAlignment = var1.readUnsignedByte(); // L: 335
			this.textYAlignment = var1.readUnsignedByte(); // L: 336
			this.textLineHeight = var1.readUnsignedByte(); // L: 337
			this.fontId = var1.readUnsignedShort(); // L: 338
			if (this.fontId == 65535) { // L: 339
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 340
		}

		if (this.type == 4) { // L: 342
			this.text = var1.readStringCp1252NullTerminated(); // L: 343
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 344
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 346
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 347
			this.color2 = var1.readInt(); // L: 348
			this.mouseOverColor = var1.readInt(); // L: 349
			this.mouseOverColor2 = var1.readInt(); // L: 350
		}

		if (this.type == 5) { // L: 352
			this.spriteId2 = var1.readInt(); // L: 353
			this.spriteId = var1.readInt(); // L: 354
		}

		if (this.type == 6) { // L: 356
			this.modelType = 1; // L: 357
			this.modelId = var1.readUnsignedShort(); // L: 358
			if (this.modelId == 65535) { // L: 359
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 360
			this.modelId2 = var1.readUnsignedShort(); // L: 361
			if (this.modelId2 == 65535) { // L: 362
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 363
			if (this.sequenceId == 65535) { // L: 364
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 365
			if (this.sequenceId2 == 65535) { // L: 366
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 367
			this.modelAngleX = var1.readUnsignedShort(); // L: 368
			this.modelAngleY = var1.readUnsignedShort(); // L: 369
		}

		if (this.type == 7) { // L: 371
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 372
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 373
			this.textXAlignment = var1.readUnsignedByte(); // L: 374
			this.fontId = var1.readUnsignedShort(); // L: 375
			if (this.fontId == 65535) { // L: 376
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 377
			this.color = var1.readInt(); // L: 378
			this.paddingX = var1.readShort(); // L: 379
			this.paddingY = var1.readShort(); // L: 380
			var4 = var1.readUnsignedByte(); // L: 381
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 382
			}

			this.itemActions = new String[5]; // L: 383

			for (var5 = 0; var5 < 5; ++var5) { // L: 384
				String var10 = var1.readStringCp1252NullTerminated(); // L: 385
				if (var10.length() > 0) { // L: 386
					this.itemActions[var5] = var10; // L: 387
					this.flags |= 1 << var5 + 23; // L: 388
				}
			}
		}

		if (this.type == 8) { // L: 392
			this.text = var1.readStringCp1252NullTerminated(); // L: 393
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 395
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 396
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 397
			var4 = var1.readUnsignedShort() & 63; // L: 398
			this.flags |= var4 << 11; // L: 399
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 401
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 402
			if (this.buttonText.length() == 0) { // L: 403
				if (this.buttonType == 1) { // L: 404
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 405
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 406
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 407
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 410
			this.flags |= 4194304; // L: 411
		}

		if (this.buttonType == 6) { // L: 413
			this.flags |= 1; // L: 414
		}

	} // L: 416

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "918444461"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 419
		this.isIf3 = true; // L: 420
		this.type = var1.readUnsignedByte(); // L: 421
		this.contentType = var1.readUnsignedShort(); // L: 422
		this.rawX = var1.readShort(); // L: 423
		this.rawY = var1.readShort(); // L: 424
		this.rawWidth = var1.readUnsignedShort(); // L: 425
		if (this.type == 9) { // L: 426
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 427
		}

		this.widthAlignment = var1.readByte(); // L: 428
		this.heightAlignment = var1.readByte(); // L: 429
		this.xAlignment = var1.readByte(); // L: 430
		this.yAlignment = var1.readByte(); // L: 431
		this.parentId = var1.readUnsignedShort(); // L: 432
		if (this.parentId == 65535) { // L: 433
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 434
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 435
		if (this.type == 0) { // L: 436
			this.scrollWidth = var1.readUnsignedShort(); // L: 437
			this.scrollHeight = var1.readUnsignedShort(); // L: 438
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 439
		}

		if (this.type == 5) { // L: 441
			this.spriteId2 = var1.readInt(); // L: 442
			this.spriteAngle = var1.readUnsignedShort(); // L: 443
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 444
			this.transparencyTop = var1.readUnsignedByte(); // L: 445
			this.outline = var1.readUnsignedByte(); // L: 446
			this.spriteShadow = var1.readInt(); // L: 447
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 448
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 449
		}

		if (this.type == 6) { // L: 451
			this.modelType = 1; // L: 452
			this.modelId = var1.readUnsignedShort(); // L: 453
			if (this.modelId == 65535) { // L: 454
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 455
			this.modelOffsetY = var1.readShort(); // L: 456
			this.modelAngleX = var1.readUnsignedShort(); // L: 457
			this.modelAngleY = var1.readUnsignedShort(); // L: 458
			this.modelAngleZ = var1.readUnsignedShort(); // L: 459
			this.modelZoom = var1.readUnsignedShort(); // L: 460
			this.sequenceId = var1.readUnsignedShort(); // L: 461
			if (this.sequenceId == 65535) { // L: 462
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 463
			var1.readUnsignedShort(); // L: 464
			if (this.widthAlignment != 0) { // L: 465
				this.field3019 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 466
				var1.readUnsignedShort(); // L: 467
			}
		}

		if (this.type == 4) { // L: 470
			this.fontId = var1.readUnsignedShort(); // L: 471
			if (this.fontId == 65535) { // L: 472
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 473
			this.textLineHeight = var1.readUnsignedByte(); // L: 474
			this.textXAlignment = var1.readUnsignedByte(); // L: 475
			this.textYAlignment = var1.readUnsignedByte(); // L: 476
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 477
			this.color = var1.readInt(); // L: 478
		}

		if (this.type == 3) { // L: 480
			this.color = var1.readInt(); // L: 481
			this.fill = var1.readUnsignedByte() == 1; // L: 482
			this.transparencyTop = var1.readUnsignedByte(); // L: 483
		}

		if (this.type == 9) { // L: 485
			this.lineWid = var1.readUnsignedByte(); // L: 486
			this.color = var1.readInt(); // L: 487
			this.field2998 = var1.readUnsignedByte() == 1; // L: 488
		}

		this.flags = var1.readMedium(); // L: 490
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 491
		int var2 = var1.readUnsignedByte(); // L: 492
		if (var2 > 0) { // L: 493
			this.actions = new String[var2]; // L: 494

			for (int var3 = 0; var3 < var2; ++var3) { // L: 495
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 497
		this.dragThreshold = var1.readUnsignedByte(); // L: 498
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 499
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 500
		this.onLoad = this.readListener(var1); // L: 501
		this.onMouseOver = this.readListener(var1); // L: 502
		this.onMouseLeave = this.readListener(var1); // L: 503
		this.onTargetLeave = this.readListener(var1); // L: 504
		this.onTargetEnter = this.readListener(var1); // L: 505
		this.onVarTransmit = this.readListener(var1); // L: 506
		this.onInvTransmit = this.readListener(var1); // L: 507
		this.onStatTransmit = this.readListener(var1); // L: 508
		this.onTimer = this.readListener(var1); // L: 509
		this.onOp = this.readListener(var1); // L: 510
		this.onMouseRepeat = this.readListener(var1); // L: 511
		this.onClick = this.readListener(var1); // L: 512
		this.onClickRepeat = this.readListener(var1); // L: 513
		this.onRelease = this.readListener(var1); // L: 514
		this.onHold = this.readListener(var1); // L: 515
		this.onDrag = this.readListener(var1); // L: 516
		this.onDragComplete = this.readListener(var1); // L: 517
		this.onScroll = this.readListener(var1); // L: 518
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 519
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 520
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 521
	} // L: 522

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)[Ljava/lang/Object;",
		garbageValue = "-926814318"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 525
		if (var2 == 0) { // L: 526
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 527

			for (int var4 = 0; var4 < var2; ++var4) { // L: 528
				int var5 = var1.readUnsignedByte(); // L: 529
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 530
				} else if (var5 == 1) { // L: 531
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 533
			return var3; // L: 534
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)[I",
		garbageValue = "1740975257"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 538
		if (var2 == 0) { // L: 539
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 540

			for (int var4 = 0; var4 < var2; ++var4) { // L: 541
				var3[var4] = var1.readInt(); // L: 542
			}

			return var3; // L: 544
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "435222986"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 548
		this.itemIds[var2] = this.itemIds[var1]; // L: 549
		this.itemIds[var1] = var3; // L: 550
		var3 = this.itemQuantities[var2]; // L: 551
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 552
		this.itemQuantities[var1] = var3; // L: 553
	} // L: 554

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)Low;",
		garbageValue = "1342803906"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2962 = false; // L: 557
		int var2;
		if (var1) { // L: 559
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 560
		}

		if (var2 == -1) { // L: 561
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 562
			SpritePixels var5 = (SpritePixels) Widget_cachedSprites.get(var3); // L: 563
			if (var5 != null) { // L: 564
				return var5;
			} else {
				var5 = Friend.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 565
				if (var5 == null) { // L: 566
					field2962 = true; // L: 567
					return null; // L: 568
				} else {
					if (this.spriteFlipV) { // L: 570
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 571
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 572
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 573
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 574
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 575
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 576
					return var5; // L: 577
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "912358255"
	)
	@Export("getFont")
	public Font getFont() {
		field2962 = false; // L: 581
		if (this.fontId == -1) { // L: 582
			return null;
		} else {
			Font var1 = (Font) Widget_cachedFonts.get((long)this.fontId); // L: 583
			if (var1 != null) { // L: 584
				return var1;
			} else {
				AbstractArchive var3 = Widget_spritesArchive; // L: 586
				AbstractArchive var4 = FileSystem.Widget_fontsArchive; // L: 587
				int var5 = this.fontId; // L: 588
				Font var2;
				if (!Username.method5711(var3, var5, 0)) { // L: 590
					var2 = null; // L: 591
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 595
					Font var6;
					if (var7 == null) { // L: 597
						var6 = null; // L: 598
					} else {
						Font var8 = new Font(var7, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels); // L: 601
						class243.SpriteBuffer_xOffsets = null; // L: 603
						class396.SpriteBuffer_yOffsets = null; // L: 604
						ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null; // L: 605
						class372.SpriteBuffer_spriteHeights = null; // L: 606
						AccessFile.SpriteBuffer_spritePalette = null; // L: 607
						class396.SpriteBuffer_pixels = null; // L: 608
						var6 = var8; // L: 610
					}

					var2 = var6; // L: 612
				}

				if (var2 != null) { // L: 615
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field2962 = true; // L: 616
				}

				return var2; // L: 617
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Low;",
		garbageValue = "18"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2962 = false; // L: 621
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 622
			int var2 = this.inventorySprites[var1]; // L: 623
			if (var2 == -1) { // L: 624
				return null;
			} else {
				SpritePixels var3 = (SpritePixels) Widget_cachedSprites.get((long)var2); // L: 625
				if (var3 != null) { // L: 626
					return var3;
				} else {
					var3 = Friend.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0); // L: 627
					if (var3 != null) { // L: 628
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2962 = true; // L: 629
					}

					return var3; // L: 630
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfb;IZLii;B)Lgj;",
		garbageValue = "-34"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2962 = false; // L: 634
		int var5;
		int var6;
		if (var3) { // L: 637
			var5 = this.modelType2; // L: 638
			var6 = this.modelId2; // L: 639
		} else {
			var5 = this.modelType; // L: 642
			var6 = this.modelId; // L: 643
		}

		if (var5 == 0) { // L: 645
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 646
			return null;
		} else {
			Model var7 = (Model) Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 647
			if (var7 == null) { // L: 648
				ModelData var8;
				if (var5 == 1) { // L: 650
					var8 = ModelData.ModelData_get(class245.Widget_modelsArchive, var6, 0); // L: 651
					if (var8 == null) { // L: 652
						field2962 = true; // L: 653
						return null; // L: 654
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 656
				}

				if (var5 == 2) { // L: 658
					var8 = class8.getNpcDefinition(var6).getModelData(); // L: 659
					if (var8 == null) { // L: 660
						field2962 = true; // L: 661
						return null; // L: 662
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 664
				}

				if (var5 == 3) { // L: 666
					if (var4 == null) { // L: 667
						return null;
					}

					var8 = var4.getModelData(); // L: 668
					if (var8 == null) { // L: 669
						field2962 = true; // L: 670
						return null; // L: 671
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 673
				}

				if (var5 == 4) { // L: 675
					ItemComposition var9 = Strings.ItemDefinition_get(var6); // L: 676
					var8 = var9.getModelData(10); // L: 677
					if (var8 == null) { // L: 678
						field2962 = true; // L: 679
						return null; // L: 680
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 682
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 684
			}

			if (var1 != null) { // L: 686
				var7 = var1.transformWidgetModel(var7, var2); // L: 687
			}

			return var7; // L: 689
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lil;",
		garbageValue = "1247885701"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 693
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1015582433 * 873384671 : this.spriteId2 * 228731547 * -50025581; // L: 694
		if (var2 == -1) { // L: 695
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 696
			SpriteMask var5 = (SpriteMask) Widget_cachedSpriteMasks.get(var3); // L: 697
			if (var5 != null) { // L: 698
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 699
				if (var6 == null) { // L: 700
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 701
					int[] var8 = new int[var7.subHeight]; // L: 702
					int[] var9 = new int[var7.subHeight]; // L: 703

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 704
						int var11 = 0; // L: 705
						int var12 = var7.subWidth; // L: 706

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 707
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 708
								var11 = var13; // L: 709
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 713
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 714
								var12 = var13 + 1; // L: 715
								break;
							}
						}

						var8[var10] = var11; // L: 719
						var9[var10] = var12 - var11; // L: 720
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 722
					Widget_cachedSpriteMasks.put(var5, var3); // L: 723
					return var5; // L: 724
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-97817393"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 735
			String[] var3 = new String[var1 + 1]; // L: 736
			if (this.actions != null) { // L: 737
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 738
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 740
		}

		this.actions[var1] = var2; // L: 742
	} // L: 743

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZIZB)I",
		garbageValue = "1"
	)
	static int method4688(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ApproximateRouteStrategy.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = ApproximateRouteStrategy.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}
}
