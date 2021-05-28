import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		longValue = 132872656098905307L
	)
	static long field3099;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[[Lio;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("b")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("a")
	public static boolean field2956;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("k")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1722455647
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 41180389
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1659206769
	)
	@Export("type")
	public int type;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 637562399
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1245218361
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 416061409
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -843432795
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 718963747
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -685885519
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 516231807
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1017092357
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1593997171
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -16853095
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1347538309
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2036682047
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1163271639
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -571887853
	)
	@Export("height")
	public int height;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1702141443
	)
	public int field3060;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 90095899
	)
	public int field2976;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1338646279
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("az")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1662391635
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1974901921
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1489642403
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1577090123
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1017532251
	)
	@Export("color")
	public int color;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -681284339
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -744384901
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -242226211
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ak")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 225521737
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1352946151
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1982124337
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bd")
	public boolean field2992;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1111346119
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1286862071
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1099843227
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bl")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -713540261
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -2047701929
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bz")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bh")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 946573619
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1064486253
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1387355717
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 6278113
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 679546321
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -296516383
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1143287517
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -712693961
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1005507705
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 490585271
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 625190029
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1456177915
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1993271177
	)
	public int field3013;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1762860885
	)
	public int field3014;
	@ObfuscatedName("bg")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("by")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -960978093
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1183409535
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cm")
	@Export("text")
	public String text;
	@ObfuscatedName("cv")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1855839745
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1863227195
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1397843337
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cq")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1116733639
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 354722393
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cn")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cs")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cg")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("co")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -721548567
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cj")
	public boolean field3032;
	@ObfuscatedName("cc")
	public byte[][] field3033;
	@ObfuscatedName("cu")
	public byte[][] field3034;
	@ObfuscatedName("cz")
	public int[] field3035;
	@ObfuscatedName("cb")
	public int[] field3079;
	@ObfuscatedName("ca")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cl")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1741236437
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1216934521
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dj")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dr")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("di")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dc")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dk")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ds")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("do")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("df")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dv")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dy")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dd")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("da")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dx")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("du")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dt")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dn")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dh")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dl")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dq")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("de")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dp")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dm")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dw")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ec")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ea")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ek")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("eu")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ez")
	public Object[] field3043;
	@ObfuscatedName("ed")
	public Object[] field3071;
	@ObfuscatedName("ep")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ex")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ew")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ej")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("el")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("et")
	public Object[] field3077;
	@ObfuscatedName("eb")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("er")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("en")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 898412889
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("em")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("es")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ey")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ee")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 539336237
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 1575834679
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 903501349
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -672258589
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("eo")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fl")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -772300497
	)
	public int field3104;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 1932726993
	)
	public int field2990;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 822217447
	)
	public int field3095;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -437140673
	)
	public int field3096;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 1408898685
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 861366973
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fe")
	public int[] field3012;
	@ObfuscatedName("fb")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fo")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2956 = false; // L: 35
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
		this.field3060 = 1; // L: 54
		this.field2976 = 1; // L: 55
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
		this.field2992 = false; // L: 71
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
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100; // L: 91
		this.field3013 = 0;
		this.field3014 = 0; // L: 93
		this.modelOrthog = false;
		this.modelTransparency = false; // L: 95
		this.itemQuantityMode = 2; // L: 96
		this.fontId = -1;
		this.text = ""; // L: 98
		this.text2 = ""; // L: 99
		this.textLineHeight = 0; // L: 100
		this.textXAlignment = 0; // L: 101
		this.textYAlignment = 0; // L: 102
		this.textShadowed = false; // L: 103
		this.paddingX = 0; // L: 104
		this.paddingY = 0; // L: 105
		this.flags = 0; // L: 110
		this.field3032 = false; // L: 111
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
		this.field3104 = -1; // L: 176
		this.field2990 = 0; // L: 177
		this.field3095 = 0; // L: 178
		this.field3096 = 0; // L: 179
		this.rootIndex = -1; // L: 180
		this.cycle = -1; // L: 181
		this.noClickThrough = false; // L: 183
		this.noScrollThrough = false; // L: 184
		this.prioritizeMenuEntry = false; // L: 185
	} // L: 684

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1748856001"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 229
		this.type = var1.readUnsignedByte(); // L: 230
		this.buttonType = var1.readUnsignedByte(); // L: 231
		this.contentType = var1.readUnsignedShort(); // L: 232
		this.rawX = var1.readShort(); // L: 233
		this.rawY = var1.readShort(); // L: 234
		this.rawWidth = var1.readUnsignedShort(); // L: 235
		this.rawHeight = var1.readUnsignedShort(); // L: 236
		this.transparencyTop = var1.readUnsignedByte(); // L: 237
		this.parentId = var1.readUnsignedShort(); // L: 238
		if (this.parentId == 65535) { // L: 239
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 240
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 241
		if (this.mouseOverRedirect == 65535) { // L: 242
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 243
		int var3;
		if (var2 > 0) { // L: 244
			this.cs1Comparisons = new int[var2]; // L: 245
			this.cs1ComparisonValues = new int[var2]; // L: 246

			for (var3 = 0; var3 < var2; ++var3) { // L: 247
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 248
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 249
			}
		}

		var3 = var1.readUnsignedByte(); // L: 252
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 253
			this.cs1Instructions = new int[var3][]; // L: 254

			for (var4 = 0; var4 < var3; ++var4) { // L: 255
				var5 = var1.readUnsignedShort(); // L: 256
				this.cs1Instructions[var4] = new int[var5]; // L: 257

				for (var6 = 0; var6 < var5; ++var6) { // L: 258
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 259
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 260
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 264
			this.scrollHeight = var1.readUnsignedShort(); // L: 265
			this.isHidden = var1.readUnsignedByte() == 1; // L: 266
		}

		if (this.type == 1) { // L: 268
			var1.readUnsignedShort(); // L: 269
			var1.readUnsignedByte(); // L: 270
		}

		if (this.type == 2) { // L: 272
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 273
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 274
			var4 = var1.readUnsignedByte(); // L: 275
			if (var4 == 1) { // L: 276
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 277
			if (var5 == 1) { // L: 278
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 279
			if (var6 == 1) { // L: 280
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 281
			if (var7 == 1) { // L: 282
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 283
			this.paddingY = var1.readUnsignedByte(); // L: 284
			this.inventoryXOffsets = new int[20]; // L: 285
			this.inventoryYOffsets = new int[20]; // L: 286
			this.inventorySprites = new int[20]; // L: 287

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 288
				int var11 = var1.readUnsignedByte(); // L: 289
				if (var11 == 1) { // L: 290
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 291
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 292
					this.inventorySprites[var8] = var1.readInt(); // L: 293
				} else {
					this.inventorySprites[var8] = -1; // L: 295
				}
			}

			this.itemActions = new String[5]; // L: 297

			for (var8 = 0; var8 < 5; ++var8) { // L: 298
				String var9 = var1.readStringCp1252NullTerminated(); // L: 299
				if (var9.length() > 0) { // L: 300
					this.itemActions[var8] = var9; // L: 301
					this.flags |= 1 << var8 + 23; // L: 302
				}
			}
		}

		if (this.type == 3) { // L: 306
			this.fill = var1.readUnsignedByte() == 1; // L: 307
		}

		if (this.type == 4 || this.type == 1) { // L: 309
			this.textXAlignment = var1.readUnsignedByte(); // L: 310
			this.textYAlignment = var1.readUnsignedByte(); // L: 311
			this.textLineHeight = var1.readUnsignedByte(); // L: 312
			this.fontId = var1.readUnsignedShort(); // L: 313
			if (this.fontId == 65535) { // L: 314
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 315
		}

		if (this.type == 4) { // L: 317
			this.text = var1.readStringCp1252NullTerminated(); // L: 318
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 319
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 321
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 322
			this.color2 = var1.readInt(); // L: 323
			this.mouseOverColor = var1.readInt(); // L: 324
			this.mouseOverColor2 = var1.readInt(); // L: 325
		}

		if (this.type == 5) { // L: 327
			this.spriteId2 = var1.readInt(); // L: 328
			this.spriteId = var1.readInt(); // L: 329
		}

		if (this.type == 6) { // L: 331
			this.modelType = 1; // L: 332
			this.modelId = var1.readUnsignedShort(); // L: 333
			if (this.modelId == 65535) { // L: 334
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 335
			this.modelId2 = var1.readUnsignedShort(); // L: 336
			if (this.modelId2 == 65535) { // L: 337
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 338
			if (this.sequenceId == 65535) { // L: 339
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 340
			if (this.sequenceId2 == 65535) { // L: 341
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 342
			this.modelAngleX = var1.readUnsignedShort(); // L: 343
			this.modelAngleY = var1.readUnsignedShort(); // L: 344
		}

		if (this.type == 7) { // L: 346
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 347
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 348
			this.textXAlignment = var1.readUnsignedByte(); // L: 349
			this.fontId = var1.readUnsignedShort(); // L: 350
			if (this.fontId == 65535) { // L: 351
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 352
			this.color = var1.readInt(); // L: 353
			this.paddingX = var1.readShort(); // L: 354
			this.paddingY = var1.readShort(); // L: 355
			var4 = var1.readUnsignedByte(); // L: 356
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 357
			}

			this.itemActions = new String[5]; // L: 358

			for (var5 = 0; var5 < 5; ++var5) { // L: 359
				String var10 = var1.readStringCp1252NullTerminated(); // L: 360
				if (var10.length() > 0) { // L: 361
					this.itemActions[var5] = var10; // L: 362
					this.flags |= 1 << var5 + 23; // L: 363
				}
			}
		}

		if (this.type == 8) { // L: 367
			this.text = var1.readStringCp1252NullTerminated(); // L: 368
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 370
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 371
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 372
			var4 = var1.readUnsignedShort() & 63; // L: 373
			this.flags |= var4 << 11; // L: 374
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 376
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 377
			if (this.buttonText.length() == 0) { // L: 378
				if (this.buttonType == 1) { // L: 379
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 380
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 381
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 382
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 385
			this.flags |= 4194304; // L: 386
		}

		if (this.buttonType == 6) { // L: 388
			this.flags |= 1; // L: 389
		}

	} // L: 391

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "107425419"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 394
		this.isIf3 = true; // L: 395
		this.type = var1.readUnsignedByte(); // L: 396
		this.contentType = var1.readUnsignedShort(); // L: 397
		this.rawX = var1.readShort(); // L: 398
		this.rawY = var1.readShort(); // L: 399
		this.rawWidth = var1.readUnsignedShort(); // L: 400
		if (this.type == 9) { // L: 401
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 402
		}

		this.widthAlignment = var1.readByte(); // L: 403
		this.heightAlignment = var1.readByte(); // L: 404
		this.xAlignment = var1.readByte(); // L: 405
		this.yAlignment = var1.readByte(); // L: 406
		this.parentId = var1.readUnsignedShort(); // L: 407
		if (this.parentId == 65535) { // L: 408
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 409
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 410
		if (this.type == 0) { // L: 411
			this.scrollWidth = var1.readUnsignedShort(); // L: 412
			this.scrollHeight = var1.readUnsignedShort(); // L: 413
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 414
		}

		if (this.type == 5) { // L: 416
			this.spriteId2 = var1.readInt(); // L: 417
			this.spriteAngle = var1.readUnsignedShort(); // L: 418
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 419
			this.transparencyTop = var1.readUnsignedByte(); // L: 420
			this.outline = var1.readUnsignedByte(); // L: 421
			this.spriteShadow = var1.readInt(); // L: 422
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 423
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 424
		}

		if (this.type == 6) { // L: 426
			this.modelType = 1; // L: 427
			this.modelId = var1.readUnsignedShort(); // L: 428
			if (this.modelId == 65535) { // L: 429
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 430
			this.modelOffsetY = var1.readShort(); // L: 431
			this.modelAngleX = var1.readUnsignedShort(); // L: 432
			this.modelAngleY = var1.readUnsignedShort(); // L: 433
			this.modelAngleZ = var1.readUnsignedShort(); // L: 434
			this.modelZoom = var1.readUnsignedShort(); // L: 435
			this.sequenceId = var1.readUnsignedShort(); // L: 436
			if (this.sequenceId == 65535) { // L: 437
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 438
			var1.readUnsignedShort(); // L: 439
			if (this.widthAlignment != 0) { // L: 440
				this.field3013 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 441
				var1.readUnsignedShort(); // L: 442
			}
		}

		if (this.type == 4) { // L: 445
			this.fontId = var1.readUnsignedShort(); // L: 446
			if (this.fontId == 65535) { // L: 447
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 448
			this.textLineHeight = var1.readUnsignedByte(); // L: 449
			this.textXAlignment = var1.readUnsignedByte(); // L: 450
			this.textYAlignment = var1.readUnsignedByte(); // L: 451
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 452
			this.color = var1.readInt(); // L: 453
		}

		if (this.type == 3) { // L: 455
			this.color = var1.readInt(); // L: 456
			this.fill = var1.readUnsignedByte() == 1; // L: 457
			this.transparencyTop = var1.readUnsignedByte(); // L: 458
		}

		if (this.type == 9) { // L: 460
			this.lineWid = var1.readUnsignedByte(); // L: 461
			this.color = var1.readInt(); // L: 462
			this.field2992 = var1.readUnsignedByte() == 1; // L: 463
		}

		this.flags = var1.readMedium(); // L: 465
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 466
		int var2 = var1.readUnsignedByte(); // L: 467
		if (var2 > 0) { // L: 468
			this.actions = new String[var2]; // L: 469

			for (int var3 = 0; var3 < var2; ++var3) { // L: 470
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 472
		this.dragThreshold = var1.readUnsignedByte(); // L: 473
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 474
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 475
		this.onLoad = this.readListener(var1); // L: 476
		this.onMouseOver = this.readListener(var1); // L: 477
		this.onMouseLeave = this.readListener(var1); // L: 478
		this.onTargetLeave = this.readListener(var1); // L: 479
		this.onTargetEnter = this.readListener(var1); // L: 480
		this.onVarTransmit = this.readListener(var1); // L: 481
		this.onInvTransmit = this.readListener(var1); // L: 482
		this.onStatTransmit = this.readListener(var1); // L: 483
		this.onTimer = this.readListener(var1); // L: 484
		this.onOp = this.readListener(var1); // L: 485
		this.onMouseRepeat = this.readListener(var1); // L: 486
		this.onClick = this.readListener(var1); // L: 487
		this.onClickRepeat = this.readListener(var1); // L: 488
		this.onRelease = this.readListener(var1); // L: 489
		this.onHold = this.readListener(var1); // L: 490
		this.onDrag = this.readListener(var1); // L: 491
		this.onDragComplete = this.readListener(var1); // L: 492
		this.onScroll = this.readListener(var1); // L: 493
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 494
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 495
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 496
	} // L: 497

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)[Ljava/lang/Object;",
		garbageValue = "1385511394"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 500
		if (var2 == 0) { // L: 501
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 502

			for (int var4 = 0; var4 < var2; ++var4) { // L: 503
				int var5 = var1.readUnsignedByte(); // L: 504
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 505
				} else if (var5 == 1) { // L: 506
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 508
			return var3; // L: 509
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)[I",
		garbageValue = "548579688"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 513
		if (var2 == 0) { // L: 514
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 515

			for (int var4 = 0; var4 < var2; ++var4) { // L: 516
				var3[var4] = var1.readInt(); // L: 517
			}

			return var3; // L: 519
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-296871230"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 523
		this.itemIds[var2] = this.itemIds[var1]; // L: 524
		this.itemIds[var1] = var3; // L: 525
		var3 = this.itemQuantities[var2]; // L: 526
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 527
		this.itemQuantities[var1] = var3; // L: 528
	} // L: 529

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loh;",
		garbageValue = "-903165753"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2956 = false; // L: 532
		int var2;
		if (var1) { // L: 534
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 535
		}

		if (var2 == -1) { // L: 536
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 537
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 538
			if (var5 != null) { // L: 539
				return var5;
			} else {
				var5 = ClientPacket.SpriteBuffer_getSprite(class245.Widget_spritesArchive, var2, 0); // L: 540
				if (var5 == null) { // L: 541
					field2956 = true; // L: 542
					return null; // L: 543
				} else {
					if (this.spriteFlipV) { // L: 545
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 546
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 547
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 548
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 549
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 550
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 551
					return var5; // L: 552
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "363940871"
	)
	@Export("getFont")
	public Font getFont() {
		field2956 = false; // L: 556
		if (this.fontId == -1) { // L: 557
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 558
			if (var1 != null) { // L: 559
				return var1;
			} else {
				var1 = AbstractArchive.method5018(class245.Widget_spritesArchive, VertexNormal.Widget_fontsArchive, this.fontId, 0); // L: 560
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 561
				} else {
					field2956 = true; // L: 562
				}

				return var1; // L: 563
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "-1449831748"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2956 = false; // L: 567
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 568
			int var2 = this.inventorySprites[var1]; // L: 569
			if (var2 == -1) { // L: 570
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 571
				if (var3 != null) { // L: 572
					return var3;
				} else {
					var3 = ClientPacket.SpriteBuffer_getSprite(class245.Widget_spritesArchive, var2, 0); // L: 573
					if (var3 != null) { // L: 574
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2956 = true; // L: 575
					}

					return var3; // L: 576
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfl;IZLic;S)Lgr;",
		garbageValue = "765"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2956 = false; // L: 580
		int var5;
		int var6;
		if (var3) { // L: 583
			var5 = this.modelType2; // L: 584
			var6 = this.modelId2; // L: 585
		} else {
			var5 = this.modelType; // L: 588
			var6 = this.modelId; // L: 589
		}

		if (var5 == 0) { // L: 591
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 592
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 593
			if (var7 == null) { // L: 594
				ModelData var8;
				if (var5 == 1) { // L: 596
					var8 = ModelData.ModelData_get(SpriteMask.Widget_modelsArchive, var6, 0); // L: 597
					if (var8 == null) { // L: 598
						field2956 = true; // L: 599
						return null; // L: 600
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 602
				}

				if (var5 == 2) { // L: 604
					var8 = StructComposition.getNpcDefinition(var6).getModelData(); // L: 605
					if (var8 == null) { // L: 606
						field2956 = true; // L: 607
						return null; // L: 608
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 610
				}

				if (var5 == 3) { // L: 612
					if (var4 == null) { // L: 613
						return null;
					}

					var8 = var4.getModelData(); // L: 614
					if (var8 == null) { // L: 615
						field2956 = true; // L: 616
						return null; // L: 617
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 619
				}

				if (var5 == 4) { // L: 621
					ItemComposition var9 = class260.ItemDefinition_get(var6); // L: 622
					var8 = var9.getModelData(10); // L: 623
					if (var8 == null) { // L: 624
						field2956 = true; // L: 625
						return null; // L: 626
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 628
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 630
			}

			if (var1 != null) { // L: 632
				var7 = var1.transformWidgetModel(var7, var2); // L: 633
			}

			return var7; // L: 635
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lit;",
		garbageValue = "1203194660"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 639
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 1725494073 * -1286862071 : this.spriteId2 * -879658487 * -1111346119; // L: 640
		if (var2 == -1) { // L: 641
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 642
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 643
			if (var5 != null) { // L: 644
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 645
				if (var6 == null) { // L: 646
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 647
					int[] var8 = new int[var7.subHeight]; // L: 648
					int[] var9 = new int[var7.subHeight]; // L: 649

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 650
						int var11 = 0; // L: 651
						int var12 = var7.subWidth; // L: 652

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 653
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 654
								var11 = var13; // L: 655
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 659
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 660
								var12 = var13 + 1; // L: 661
								break;
							}
						}

						var8[var10] = var11; // L: 665
						var9[var10] = var12 - var11; // L: 666
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 668
					Widget_cachedSpriteMasks.put(var5, var3); // L: 669
					return var5; // L: 670
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-22"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 674
			String[] var3 = new String[var1 + 1]; // L: 675
			if (this.actions != null) { // L: 676
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 677
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 679
		}

		this.actions[var1] = var2; // L: 681
	} // L: 682

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3623"
	)
	public static void method4759() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 88
			if (ArchiveDiskActionHandler.field3562 != 0) { // L: 89
				ArchiveDiskActionHandler.field3562 = 1; // L: 90

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 92
				} catch (InterruptedException var3) { // L: 94
				}
			}

		}
	} // L: 97
}
