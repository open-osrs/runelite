import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[[Lhu;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("q")
	public static boolean field2622;
	@ObfuscatedName("t")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 516202957
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1704710587
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 812287217
	)
	@Export("type")
	public int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 930394621
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2019337075
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 188435577
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1709656523
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 728571695
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -745936495
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -350194089
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 990647639
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -787516857
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1615336231
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -722762479
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1586546691
	)
	@Export("y")
	public int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1340111239
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -834307829
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -598841187
	)
	public int field2614;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -365488349
	)
	public int field2642;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1589172375
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("af")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1529220539
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1431413215
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1255368413
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -639002299
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1774033701
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1100945301
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1200561941
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -160089127
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ar")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1037045283
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1529069059
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -757656999
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bh")
	public boolean field2727;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1779540973
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 718176713
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -609319985
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1156505419
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2056543533
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ba")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("be")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1125239001
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1279491537
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1632912361
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1784046267
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1638579631
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -440155799
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1697744779
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1772660447
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 32750401
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1631404785
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -962772699
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1961993049
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1304752559
	)
	public int field2720;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -556877877
	)
	public int field2680;
	@ObfuscatedName("bu")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bl")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1625407889
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1150086731
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cf")
	@Export("text")
	public String text;
	@ObfuscatedName("co")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1148032829
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1334007947
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -283419665
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ce")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -624611843
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1918897871
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cn")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("ca")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ch")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cq")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -960682031
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cu")
	public boolean field2698;
	@ObfuscatedName("cb")
	public byte[][] field2699;
	@ObfuscatedName("cv")
	public byte[][] field2747;
	@ObfuscatedName("cj")
	public int[] field2701;
	@ObfuscatedName("cy")
	public int[] field2692;
	@ObfuscatedName("ci")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cm")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 2060963123
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1057442763
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dy")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dg")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dq")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dl")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dn")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("de")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("da")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dz")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dr")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dh")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("du")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("di")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dp")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("db")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ds")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dv")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("df")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dx")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dj")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dt")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dd")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dw")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ec")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ek")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ei")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ep")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("et")
	public Object[] field2736;
	@ObfuscatedName("el")
	public Object[] field2655;
	@ObfuscatedName("eb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eg")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("em")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eh")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ey")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eu")
	public Object[] field2743;
	@ObfuscatedName("en")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ew")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -1860696897
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ef")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ev")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("er")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("es")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 830132731
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1175523821
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -972274073
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1021336893
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "[Lhu;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ea")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fi")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -149116897
	)
	public int field2759;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1251998105
	)
	public int field2760;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1199991373
	)
	public int field2748;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 290924521
	)
	public int field2754;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 738866907
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 11649141
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fv")
	public int[] field2653;
	@ObfuscatedName("fr")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fw")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fp")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2622 = false; // L: 35
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
		this.width = 0;
		this.height = 0;
		this.field2614 = 1;
		this.field2642 = 1; // L: 55
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0; // L: 60
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0; // L: 65
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1; // L: 70
		this.field2727 = false; // L: 71
		this.spriteId2 = -1;
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
		this.field2720 = 0; // L: 92
		this.field2680 = 0; // L: 93
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
		this.field2698 = false; // L: 111
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
		this.field2759 = -1; // L: 176
		this.field2760 = 0; // L: 177
		this.field2748 = 0; // L: 178
		this.field2754 = 0; // L: 179
		this.rootIndex = -1; // L: 180
		this.cycle = -1; // L: 181
		this.noClickThrough = false; // L: 183
		this.noScrollThrough = false; // L: 184
		this.prioritizeMenuEntry = false; // L: 185
	} // L: 707

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "4"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 245
		this.type = var1.readUnsignedByte(); // L: 246
		this.buttonType = var1.readUnsignedByte(); // L: 247
		this.contentType = var1.readUnsignedShort(); // L: 248
		this.rawX = var1.readShort(); // L: 249
		this.rawY = var1.readShort(); // L: 250
		this.rawWidth = var1.readUnsignedShort(); // L: 251
		this.rawHeight = var1.readUnsignedShort(); // L: 252
		this.transparencyTop = var1.readUnsignedByte(); // L: 253
		this.parentId = var1.readUnsignedShort(); // L: 254
		if (this.parentId == 65535) { // L: 255
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 256
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 257
		if (this.mouseOverRedirect == 65535) { // L: 258
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 259
		int var3;
		if (var2 > 0) { // L: 260
			this.cs1Comparisons = new int[var2]; // L: 261
			this.cs1ComparisonValues = new int[var2]; // L: 262

			for (var3 = 0; var3 < var2; ++var3) { // L: 263
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 264
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 265
			}
		}

		var3 = var1.readUnsignedByte(); // L: 268
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 269
			this.cs1Instructions = new int[var3][]; // L: 270

			for (var4 = 0; var4 < var3; ++var4) { // L: 271
				var5 = var1.readUnsignedShort(); // L: 272
				this.cs1Instructions[var4] = new int[var5]; // L: 273

				for (var6 = 0; var6 < var5; ++var6) { // L: 274
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 275
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 276
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 280
			this.scrollHeight = var1.readUnsignedShort(); // L: 281
			this.isHidden = var1.readUnsignedByte() == 1; // L: 282
		}

		if (this.type == 1) { // L: 284
			var1.readUnsignedShort(); // L: 285
			var1.readUnsignedByte(); // L: 286
		}

		if (this.type == 2) { // L: 288
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 289
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 290
			var4 = var1.readUnsignedByte(); // L: 291
			if (var4 == 1) { // L: 292
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 293
			if (var5 == 1) { // L: 294
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 295
			if (var6 == 1) { // L: 296
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 297
			if (var7 == 1) { // L: 298
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 299
			this.paddingY = var1.readUnsignedByte(); // L: 300
			this.inventoryXOffsets = new int[20]; // L: 301
			this.inventoryYOffsets = new int[20]; // L: 302
			this.inventorySprites = new int[20]; // L: 303

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 304
				int var11 = var1.readUnsignedByte(); // L: 305
				if (var11 == 1) { // L: 306
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 307
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 308
					this.inventorySprites[var8] = var1.readInt(); // L: 309
				} else {
					this.inventorySprites[var8] = -1; // L: 311
				}
			}

			this.itemActions = new String[5]; // L: 313

			for (var8 = 0; var8 < 5; ++var8) { // L: 314
				String var9 = var1.readStringCp1252NullTerminated(); // L: 315
				if (var9.length() > 0) { // L: 316
					this.itemActions[var8] = var9; // L: 317
					this.flags |= 1 << var8 + 23; // L: 318
				}
			}
		}

		if (this.type == 3) { // L: 322
			this.fill = var1.readUnsignedByte() == 1; // L: 323
		}

		if (this.type == 4 || this.type == 1) { // L: 325
			this.textXAlignment = var1.readUnsignedByte(); // L: 326
			this.textYAlignment = var1.readUnsignedByte(); // L: 327
			this.textLineHeight = var1.readUnsignedByte(); // L: 328
			this.fontId = var1.readUnsignedShort(); // L: 329
			if (this.fontId == 65535) { // L: 330
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 331
		}

		if (this.type == 4) { // L: 333
			this.text = var1.readStringCp1252NullTerminated(); // L: 334
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 335
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 337
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 338
			this.color2 = var1.readInt(); // L: 339
			this.mouseOverColor = var1.readInt(); // L: 340
			this.mouseOverColor2 = var1.readInt(); // L: 341
		}

		if (this.type == 5) { // L: 343
			this.spriteId2 = var1.readInt(); // L: 344
			this.spriteId = var1.readInt(); // L: 345
		}

		if (this.type == 6) { // L: 347
			this.modelType = 1; // L: 348
			this.modelId = var1.readUnsignedShort(); // L: 349
			if (this.modelId == 65535) { // L: 350
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 351
			this.modelId2 = var1.readUnsignedShort(); // L: 352
			if (this.modelId2 == 65535) { // L: 353
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 354
			if (this.sequenceId == 65535) { // L: 355
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 356
			if (this.sequenceId2 == 65535) { // L: 357
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 358
			this.modelAngleX = var1.readUnsignedShort(); // L: 359
			this.modelAngleY = var1.readUnsignedShort(); // L: 360
		}

		if (this.type == 7) { // L: 362
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 363
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 364
			this.textXAlignment = var1.readUnsignedByte(); // L: 365
			this.fontId = var1.readUnsignedShort(); // L: 366
			if (this.fontId == 65535) { // L: 367
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 368
			this.color = var1.readInt(); // L: 369
			this.paddingX = var1.readShort(); // L: 370
			this.paddingY = var1.readShort(); // L: 371
			var4 = var1.readUnsignedByte(); // L: 372
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 373
			}

			this.itemActions = new String[5]; // L: 374

			for (var5 = 0; var5 < 5; ++var5) { // L: 375
				String var10 = var1.readStringCp1252NullTerminated(); // L: 376
				if (var10.length() > 0) { // L: 377
					this.itemActions[var5] = var10; // L: 378
					this.flags |= 1 << var5 + 23; // L: 379
				}
			}
		}

		if (this.type == 8) { // L: 383
			this.text = var1.readStringCp1252NullTerminated(); // L: 384
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 386
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 387
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 388
			var4 = var1.readUnsignedShort() & 63; // L: 389
			this.flags |= var4 << 11; // L: 390
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 392
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 393
			if (this.buttonText.length() == 0) { // L: 394
				if (this.buttonType == 1) { // L: 395
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 396
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 397
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 398
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 401
			this.flags |= 4194304; // L: 402
		}

		if (this.buttonType == 6) { // L: 404
			this.flags |= 1; // L: 405
		}

	} // L: 407

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "-47"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 410
		this.isIf3 = true; // L: 411
		this.type = var1.readUnsignedByte(); // L: 412
		this.contentType = var1.readUnsignedShort(); // L: 413
		this.rawX = var1.readShort(); // L: 414
		this.rawY = var1.readShort(); // L: 415
		this.rawWidth = var1.readUnsignedShort(); // L: 416
		if (this.type == 9) { // L: 417
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 418
		}

		this.widthAlignment = var1.readByte(); // L: 419
		this.heightAlignment = var1.readByte(); // L: 420
		this.xAlignment = var1.readByte(); // L: 421
		this.yAlignment = var1.readByte(); // L: 422
		this.parentId = var1.readUnsignedShort(); // L: 423
		if (this.parentId == 65535) { // L: 424
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 425
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 426
		if (this.type == 0) { // L: 427
			this.scrollWidth = var1.readUnsignedShort(); // L: 428
			this.scrollHeight = var1.readUnsignedShort(); // L: 429
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 430
		}

		if (this.type == 5) { // L: 432
			this.spriteId2 = var1.readInt(); // L: 433
			this.spriteAngle = var1.readUnsignedShort(); // L: 434
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 435
			this.transparencyTop = var1.readUnsignedByte(); // L: 436
			this.outline = var1.readUnsignedByte(); // L: 437
			this.spriteShadow = var1.readInt(); // L: 438
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 439
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 440
		}

		if (this.type == 6) { // L: 442
			this.modelType = 1; // L: 443
			this.modelId = var1.readUnsignedShort(); // L: 444
			if (this.modelId == 65535) { // L: 445
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 446
			this.modelOffsetY = var1.readShort(); // L: 447
			this.modelAngleX = var1.readUnsignedShort(); // L: 448
			this.modelAngleY = var1.readUnsignedShort(); // L: 449
			this.modelAngleZ = var1.readUnsignedShort(); // L: 450
			this.modelZoom = var1.readUnsignedShort(); // L: 451
			this.sequenceId = var1.readUnsignedShort(); // L: 452
			if (this.sequenceId == 65535) { // L: 453
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 454
			var1.readUnsignedShort(); // L: 455
			if (this.widthAlignment != 0) { // L: 456
				this.field2720 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 457
				var1.readUnsignedShort(); // L: 458
			}
		}

		if (this.type == 4) { // L: 461
			this.fontId = var1.readUnsignedShort(); // L: 462
			if (this.fontId == 65535) { // L: 463
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 464
			this.textLineHeight = var1.readUnsignedByte(); // L: 465
			this.textXAlignment = var1.readUnsignedByte(); // L: 466
			this.textYAlignment = var1.readUnsignedByte(); // L: 467
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 468
			this.color = var1.readInt(); // L: 469
		}

		if (this.type == 3) { // L: 471
			this.color = var1.readInt(); // L: 472
			this.fill = var1.readUnsignedByte() == 1; // L: 473
			this.transparencyTop = var1.readUnsignedByte(); // L: 474
		}

		if (this.type == 9) { // L: 476
			this.lineWid = var1.readUnsignedByte(); // L: 477
			this.color = var1.readInt(); // L: 478
			this.field2727 = var1.readUnsignedByte() == 1; // L: 479
		}

		this.flags = var1.readMedium(); // L: 481
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 482
		int var2 = var1.readUnsignedByte(); // L: 483
		if (var2 > 0) { // L: 484
			this.actions = new String[var2]; // L: 485

			for (int var3 = 0; var3 < var2; ++var3) { // L: 486
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 488
		this.dragThreshold = var1.readUnsignedByte(); // L: 489
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 490
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 491
		this.onLoad = this.readListener(var1); // L: 492
		this.onMouseOver = this.readListener(var1); // L: 493
		this.onMouseLeave = this.readListener(var1); // L: 494
		this.onTargetLeave = this.readListener(var1); // L: 495
		this.onTargetEnter = this.readListener(var1); // L: 496
		this.onVarTransmit = this.readListener(var1); // L: 497
		this.onInvTransmit = this.readListener(var1); // L: 498
		this.onStatTransmit = this.readListener(var1); // L: 499
		this.onTimer = this.readListener(var1); // L: 500
		this.onOp = this.readListener(var1); // L: 501
		this.onMouseRepeat = this.readListener(var1); // L: 502
		this.onClick = this.readListener(var1); // L: 503
		this.onClickRepeat = this.readListener(var1); // L: 504
		this.onRelease = this.readListener(var1); // L: 505
		this.onHold = this.readListener(var1); // L: 506
		this.onDrag = this.readListener(var1); // L: 507
		this.onDragComplete = this.readListener(var1); // L: 508
		this.onScroll = this.readListener(var1); // L: 509
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 510
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 511
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 512
	} // L: 513

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)[Ljava/lang/Object;",
		garbageValue = "1322277036"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 516
		if (var2 == 0) { // L: 517
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 518

			for (int var4 = 0; var4 < var2; ++var4) { // L: 519
				int var5 = var1.readUnsignedByte(); // L: 520
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 521
				} else if (var5 == 1) { // L: 522
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 524
			return var3; // L: 525
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)[I",
		garbageValue = "-45"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 529
		if (var2 == 0) { // L: 530
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 531

			for (int var4 = 0; var4 < var2; ++var4) { // L: 532
				var3[var4] = var1.readInt(); // L: 533
			}

			return var3; // L: 535
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "47"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 539
		this.itemIds[var2] = this.itemIds[var1]; // L: 540
		this.itemIds[var1] = var3; // L: 541
		var3 = this.itemQuantities[var2]; // L: 542
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 543
		this.itemQuantities[var1] = var3; // L: 544
	} // L: 545

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZB)Loh;",
		garbageValue = "-10"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2622 = false; // L: 548
		int var2;
		if (var1) { // L: 550
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 551
		}

		if (var2 == -1) { // L: 552
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 553
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 554
			if (var5 != null) { // L: 555
				return var5;
			} else {
				var5 = ModelData0.SpriteBuffer_getSprite(UrlRequest.Widget_spritesArchive, var2, 0); // L: 556
				if (var5 == null) { // L: 557
					field2622 = true; // L: 558
					return null; // L: 559
				} else {
					if (this.spriteFlipV) { // L: 561
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 562
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 563
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 564
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 565
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 566
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 567
					return var5; // L: 568
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "1091608415"
	)
	@Export("getFont")
	public Font getFont() {
		field2622 = false; // L: 572
		if (this.fontId == -1) { // L: 573
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 574
			if (var1 != null) { // L: 575
				return var1;
			} else {
				var1 = class236.method4378(UrlRequest.Widget_spritesArchive, class32.Widget_fontsArchive, this.fontId, 0); // L: 576
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 577
				} else {
					field2622 = true; // L: 578
				}

				return var1; // L: 579
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Loh;",
		garbageValue = "0"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2622 = false; // L: 583
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 584
			int var2 = this.inventorySprites[var1]; // L: 585
			if (var2 == -1) { // L: 586
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 587
				if (var3 != null) { // L: 588
					return var3;
				} else {
					var3 = ModelData0.SpriteBuffer_getSprite(UrlRequest.Widget_spritesArchive, var2, 0); // L: 589
					if (var3 != null) { // L: 590
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2622 = true; // L: 591
					}

					return var3; // L: 592
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IZLht;B)Lgv;",
		garbageValue = "-63"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2622 = false; // L: 596
		int var5;
		int var6;
		if (var3) { // L: 599
			var5 = this.modelType2; // L: 600
			var6 = this.modelId2; // L: 601
		} else {
			var5 = this.modelType; // L: 604
			var6 = this.modelId; // L: 605
		}

		if (var5 == 0) { // L: 607
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 608
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 609
			if (var7 == null) { // L: 610
				ModelData var8;
				if (var5 == 1) { // L: 612
					var8 = ModelData.ModelData_get(WorldMapDecoration.Widget_modelsArchive, var6, 0); // L: 613
					if (var8 == null) { // L: 614
						field2622 = true; // L: 615
						return null; // L: 616
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 618
				}

				if (var5 == 2) { // L: 620
					var8 = GraphicsObject.getNpcDefinition(var6).getModelData(); // L: 621
					if (var8 == null) { // L: 622
						field2622 = true; // L: 623
						return null; // L: 624
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 626
				}

				if (var5 == 3) { // L: 628
					if (var4 == null) { // L: 629
						return null;
					}

					var8 = var4.getModelData(); // L: 630
					if (var8 == null) { // L: 631
						field2622 = true; // L: 632
						return null; // L: 633
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 635
				}

				if (var5 == 4) { // L: 637
					ItemComposition var9 = class23.ItemDefinition_get(var6); // L: 638
					var8 = var9.getModelData(10); // L: 639
					if (var8 == null) { // L: 640
						field2622 = true; // L: 641
						return null; // L: 642
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 644
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 646
			}

			if (var1 != null) { // L: 648
				var7 = var1.transformWidgetModel(var7, var2); // L: 649
			}

			return var7; // L: 651
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lhh;",
		garbageValue = "-791835766"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 655
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 802383993 * 718176713 : this.spriteId2 * 1779540973 * 708325861; // L: 656
		if (var2 == -1) { // L: 657
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 658
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 659
			if (var5 != null) { // L: 660
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 661
				if (var6 == null) { // L: 662
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 663
					int[] var8 = new int[var7.subHeight]; // L: 664
					int[] var9 = new int[var7.subHeight]; // L: 665

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 666
						int var11 = 0; // L: 667
						int var12 = var7.subWidth; // L: 668

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 669
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 670
								var11 = var13; // L: 671
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 675
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 676
								var12 = var13 + 1; // L: 677
								break;
							}
						}

						var8[var10] = var11; // L: 681
						var9[var10] = var12 - var11; // L: 682
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 684
					Widget_cachedSpriteMasks.put(var5, var3); // L: 685
					return var5; // L: 686
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2040886071"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 697
			String[] var3 = new String[var1 + 1]; // L: 698
			if (this.actions != null) { // L: 699
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 700
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 702
		}

		this.actions[var1] = var2; // L: 704
	} // L: 705

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcc;",
		garbageValue = "42"
	)
	static Script method4292(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 52
		if (var2 != null) { // L: 53
			return var2; // L: 54
		} else {
			String var3 = String.valueOf(var0); // L: 56
			int var4 = BuddyRankComparator.archive12.getGroupId(var3); // L: 57
			if (var4 == -1) { // L: 58
				return null; // L: 59
			} else {
				byte[] var5 = BuddyRankComparator.archive12.takeFileFlat(var4); // L: 61
				if (var5 != null) { // L: 62
					if (var5.length <= 1) { // L: 63
						return null; // L: 64
					}

					var2 = WorldMapIcon_1.newScript(var5); // L: 66
					if (var2 != null) { // L: 67
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 68
						return var2; // L: 69
					}
				}

				return null; // L: 72
			}
		}
	}
}
