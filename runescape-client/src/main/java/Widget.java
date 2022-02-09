import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Ljz;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("n")
	public static boolean field3262;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("mouseWheel")
	static class154 mouseWheel;
	@ObfuscatedName("m")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -180788535
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 685751725
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 384164941
	)
	@Export("type")
	public int type;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1070445783
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1360877493
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -731857837
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -761455235
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -598045779
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1735476283
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 978229061
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 529243245
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1439929829
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -252871963
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 633251767
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 877491551
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -528431965
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1285507771
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1058126991
	)
	public int field3281;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 776649427
	)
	public int field3282;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 102285177
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("as")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1090792645
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1061879615
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1839447183
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 54764769
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2025844013
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -62414059
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -926855627
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1058723143
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1595485359
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1943610129
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -202756683
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("be")
	public boolean field3298;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1082596211
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1408111085
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -292957173
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bx")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -288068171
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 971413031
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bm")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bi")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1188985969
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1715479403
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -390932075
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1358281371
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 619417351
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -939642299
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 484546545
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 787529923
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 407956303
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1666676163
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1851168267
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1696655143
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2040675921
	)
	public int field3310;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1540032617
	)
	public int field3320;
	@ObfuscatedName("by")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bk")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1683849957
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1902504381
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cf")
	@Export("text")
	public String text;
	@ObfuscatedName("cg")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -327102455
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1072242523
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1322917451
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cq")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 469005899
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1851947421
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cs")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cl")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ck")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cy")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -41103585
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cr")
	public boolean field3338;
	@ObfuscatedName("co")
	public byte[][] field3339;
	@ObfuscatedName("cj")
	public byte[][] field3397;
	@ObfuscatedName("ci")
	public int[] field3341;
	@ObfuscatedName("ct")
	public int[] field3342;
	@ObfuscatedName("cp")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ce")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -872870567
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 823813735
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("df")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("db")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dr")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dq")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dj")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dz")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("du")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dm")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("di")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dt")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dl")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("do")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dv")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dh")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("dw")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dp")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dd")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dy")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dg")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dn")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dx")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("da")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dc")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dk")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("er")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ep")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ea")
	public Object[] field3374;
	@ObfuscatedName("et")
	public Object[] field3321;
	@ObfuscatedName("eh")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ev")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ee")
	public Object[] field3328;
	@ObfuscatedName("ey")
	public Object[] field3271;
	@ObfuscatedName("eu")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ej")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("es")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eb")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("en")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ed")
	public Object[] field3385;
	@ObfuscatedName("ew")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eg")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -2001179919
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("em")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("eo")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ef")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ec")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -1695040585
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 26817127
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 1448243617
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 1519423877
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "[Ljz;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fi")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fw")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1921474143
	)
	public int field3401;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 684438727
	)
	public int field3402;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -782810715
	)
	public int field3403;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1290877129
	)
	public int field3370;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1391394429
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1638866449
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fb")
	public int[] field3254;
	@ObfuscatedName("fs")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fz")
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
		field3262 = false; // L: 35
	}

	public Widget() {
		this.isIf3 = false; // L: 36
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0; // L: 45
		this.rawX = 0; // L: 46
		this.rawY = 0; // L: 47
		this.rawWidth = 0; // L: 48
		this.rawHeight = 0; // L: 49
		this.x = 0; // L: 50
		this.y = 0; // L: 51
		this.width = 0; // L: 52
		this.height = 0; // L: 53
		this.field3281 = 1; // L: 54
		this.field3282 = 1; // L: 55
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
		this.field3298 = false; // L: 71
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
		this.field3310 = 0; // L: 92
		this.field3320 = 0; // L: 93
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
		this.field3338 = false; // L: 111
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
		this.field3401 = -1; // L: 178
		this.field3402 = 0; // L: 179
		this.field3403 = 0; // L: 180
		this.field3370 = 0; // L: 181
		this.rootIndex = -1; // L: 182
		this.cycle = -1; // L: 183
		this.noClickThrough = false; // L: 185
		this.noScrollThrough = false; // L: 186
		this.prioritizeMenuEntry = false; // L: 187
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "22618165"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 247
		this.type = var1.readUnsignedByte(); // L: 248
		this.buttonType = var1.readUnsignedByte(); // L: 249
		this.contentType = var1.readUnsignedShort(); // L: 250
		this.rawX = var1.readShort(); // L: 251
		this.rawY = var1.readShort(); // L: 252
		this.rawWidth = var1.readUnsignedShort(); // L: 253
		this.rawHeight = var1.readUnsignedShort(); // L: 254
		this.transparencyTop = var1.readUnsignedByte(); // L: 255
		this.parentId = var1.readUnsignedShort(); // L: 256
		if (this.parentId == 65535) { // L: 257
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 258
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 259
		if (this.mouseOverRedirect == 65535) { // L: 260
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 261
		int var3;
		if (var2 > 0) { // L: 262
			this.cs1Comparisons = new int[var2]; // L: 263
			this.cs1ComparisonValues = new int[var2]; // L: 264

			for (var3 = 0; var3 < var2; ++var3) { // L: 265
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 266
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 267
			}
		}

		var3 = var1.readUnsignedByte(); // L: 270
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 271
			this.cs1Instructions = new int[var3][]; // L: 272

			for (var4 = 0; var4 < var3; ++var4) { // L: 273
				var5 = var1.readUnsignedShort(); // L: 274
				this.cs1Instructions[var4] = new int[var5]; // L: 275

				for (var6 = 0; var6 < var5; ++var6) { // L: 276
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 277
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 278
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 282
			this.scrollHeight = var1.readUnsignedShort(); // L: 283
			this.isHidden = var1.readUnsignedByte() == 1; // L: 284
		}

		if (this.type == 1) { // L: 286
			var1.readUnsignedShort(); // L: 287
			var1.readUnsignedByte(); // L: 288
		}

		if (this.type == 2) { // L: 290
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 291
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 292
			var4 = var1.readUnsignedByte(); // L: 293
			if (var4 == 1) { // L: 294
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 295
			if (var5 == 1) { // L: 296
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 297
			if (var6 == 1) { // L: 298
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 299
			if (var7 == 1) { // L: 300
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 301
			this.paddingY = var1.readUnsignedByte(); // L: 302
			this.inventoryXOffsets = new int[20]; // L: 303
			this.inventoryYOffsets = new int[20]; // L: 304
			this.inventorySprites = new int[20]; // L: 305

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 306
				int var11 = var1.readUnsignedByte(); // L: 307
				if (var11 == 1) { // L: 308
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 309
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 310
					this.inventorySprites[var8] = var1.readInt(); // L: 311
				} else {
					this.inventorySprites[var8] = -1; // L: 313
				}
			}

			this.itemActions = new String[5]; // L: 315

			for (var8 = 0; var8 < 5; ++var8) { // L: 316
				String var9 = var1.readStringCp1252NullTerminated(); // L: 317
				if (var9.length() > 0) { // L: 318
					this.itemActions[var8] = var9; // L: 319
					this.flags |= 1 << var8 + 23; // L: 320
				}
			}
		}

		if (this.type == 3) { // L: 324
			this.fill = var1.readUnsignedByte() == 1; // L: 325
		}

		if (this.type == 4 || this.type == 1) { // L: 327
			this.textXAlignment = var1.readUnsignedByte(); // L: 328
			this.textYAlignment = var1.readUnsignedByte(); // L: 329
			this.textLineHeight = var1.readUnsignedByte(); // L: 330
			this.fontId = var1.readUnsignedShort(); // L: 331
			if (this.fontId == 65535) { // L: 332
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 333
		}

		if (this.type == 4) { // L: 335
			this.text = var1.readStringCp1252NullTerminated(); // L: 336
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 337
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 339
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 340
			this.color2 = var1.readInt(); // L: 341
			this.mouseOverColor = var1.readInt(); // L: 342
			this.mouseOverColor2 = var1.readInt(); // L: 343
		}

		if (this.type == 5) { // L: 345
			this.spriteId2 = var1.readInt(); // L: 346
			this.spriteId = var1.readInt(); // L: 347
		}

		if (this.type == 6) { // L: 349
			this.modelType = 1; // L: 350
			this.modelId = var1.readUnsignedShort(); // L: 351
			if (this.modelId == 65535) { // L: 352
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 353
			this.modelId2 = var1.readUnsignedShort(); // L: 354
			if (this.modelId2 == 65535) { // L: 355
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 356
			if (this.sequenceId == 65535) { // L: 357
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 358
			if (this.sequenceId2 == 65535) { // L: 359
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 360
			this.modelAngleX = var1.readUnsignedShort(); // L: 361
			this.modelAngleY = var1.readUnsignedShort(); // L: 362
		}

		if (this.type == 7) { // L: 364
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 365
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 366
			this.textXAlignment = var1.readUnsignedByte(); // L: 367
			this.fontId = var1.readUnsignedShort(); // L: 368
			if (this.fontId == 65535) { // L: 369
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 370
			this.color = var1.readInt(); // L: 371
			this.paddingX = var1.readShort(); // L: 372
			this.paddingY = var1.readShort(); // L: 373
			var4 = var1.readUnsignedByte(); // L: 374
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 375
			}

			this.itemActions = new String[5]; // L: 376

			for (var5 = 0; var5 < 5; ++var5) { // L: 377
				String var10 = var1.readStringCp1252NullTerminated(); // L: 378
				if (var10.length() > 0) { // L: 379
					this.itemActions[var5] = var10; // L: 380
					this.flags |= 1 << var5 + 23; // L: 381
				}
			}
		}

		if (this.type == 8) { // L: 385
			this.text = var1.readStringCp1252NullTerminated(); // L: 386
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 388
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 389
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 390
			var4 = var1.readUnsignedShort() & 63; // L: 391
			this.flags |= var4 << 11; // L: 392
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 394
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 395
			if (this.buttonText.length() == 0) { // L: 396
				if (this.buttonType == 1) { // L: 397
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 398
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 399
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 400
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 403
			this.flags |= 4194304; // L: 404
		}

		if (this.buttonType == 6) { // L: 406
			this.flags |= 1; // L: 407
		}

	} // L: 409

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "130100333"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 412
		this.isIf3 = true; // L: 413
		this.type = var1.readUnsignedByte(); // L: 414
		this.contentType = var1.readUnsignedShort(); // L: 415
		this.rawX = var1.readShort(); // L: 416
		this.rawY = var1.readShort(); // L: 417
		this.rawWidth = var1.readUnsignedShort(); // L: 418
		if (this.type == 9) { // L: 419
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 420
		}

		this.widthAlignment = var1.readByte(); // L: 421
		this.heightAlignment = var1.readByte(); // L: 422
		this.xAlignment = var1.readByte(); // L: 423
		this.yAlignment = var1.readByte(); // L: 424
		this.parentId = var1.readUnsignedShort(); // L: 425
		if (this.parentId == 65535) { // L: 426
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 427
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 428
		if (this.type == 0) { // L: 429
			this.scrollWidth = var1.readUnsignedShort(); // L: 430
			this.scrollHeight = var1.readUnsignedShort(); // L: 431
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 432
		}

		if (this.type == 5) { // L: 434
			this.spriteId2 = var1.readInt(); // L: 435
			this.spriteAngle = var1.readUnsignedShort(); // L: 436
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 437
			this.transparencyTop = var1.readUnsignedByte(); // L: 438
			this.outline = var1.readUnsignedByte(); // L: 439
			this.spriteShadow = var1.readInt(); // L: 440
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 441
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 442
		}

		if (this.type == 6) { // L: 444
			this.modelType = 1; // L: 445
			this.modelId = var1.readUnsignedShort(); // L: 446
			if (this.modelId == 65535) { // L: 447
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 448
			this.modelOffsetY = var1.readShort(); // L: 449
			this.modelAngleX = var1.readUnsignedShort(); // L: 450
			this.modelAngleY = var1.readUnsignedShort(); // L: 451
			this.modelAngleZ = var1.readUnsignedShort(); // L: 452
			this.modelZoom = var1.readUnsignedShort(); // L: 453
			this.sequenceId = var1.readUnsignedShort(); // L: 454
			if (this.sequenceId == 65535) { // L: 455
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 456
			var1.readUnsignedShort(); // L: 457
			if (this.widthAlignment != 0) { // L: 458
				this.field3310 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 459
				var1.readUnsignedShort(); // L: 460
			}
		}

		if (this.type == 4) { // L: 463
			this.fontId = var1.readUnsignedShort(); // L: 464
			if (this.fontId == 65535) { // L: 465
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 466
			this.textLineHeight = var1.readUnsignedByte(); // L: 467
			this.textXAlignment = var1.readUnsignedByte(); // L: 468
			this.textYAlignment = var1.readUnsignedByte(); // L: 469
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 470
			this.color = var1.readInt(); // L: 471
		}

		if (this.type == 3) { // L: 473
			this.color = var1.readInt(); // L: 474
			this.fill = var1.readUnsignedByte() == 1; // L: 475
			this.transparencyTop = var1.readUnsignedByte(); // L: 476
		}

		if (this.type == 9) { // L: 478
			this.lineWid = var1.readUnsignedByte(); // L: 479
			this.color = var1.readInt(); // L: 480
			this.field3298 = var1.readUnsignedByte() == 1; // L: 481
		}

		this.flags = var1.readMedium(); // L: 483
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 484
		int var2 = var1.readUnsignedByte(); // L: 485
		if (var2 > 0) { // L: 486
			this.actions = new String[var2]; // L: 487

			for (int var3 = 0; var3 < var2; ++var3) { // L: 488
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 490
		this.dragThreshold = var1.readUnsignedByte(); // L: 491
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 492
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 493
		this.onLoad = this.readListener(var1); // L: 494
		this.onMouseOver = this.readListener(var1); // L: 495
		this.onMouseLeave = this.readListener(var1); // L: 496
		this.onTargetLeave = this.readListener(var1); // L: 497
		this.onTargetEnter = this.readListener(var1); // L: 498
		this.onVarTransmit = this.readListener(var1); // L: 499
		this.onInvTransmit = this.readListener(var1); // L: 500
		this.onStatTransmit = this.readListener(var1); // L: 501
		this.onTimer = this.readListener(var1); // L: 502
		this.onOp = this.readListener(var1); // L: 503
		this.onMouseRepeat = this.readListener(var1); // L: 504
		this.onClick = this.readListener(var1); // L: 505
		this.onClickRepeat = this.readListener(var1); // L: 506
		this.onRelease = this.readListener(var1); // L: 507
		this.onHold = this.readListener(var1); // L: 508
		this.onDrag = this.readListener(var1); // L: 509
		this.onDragComplete = this.readListener(var1); // L: 510
		this.onScroll = this.readListener(var1); // L: 511
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 512
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 513
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 514
	} // L: 515

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)[Ljava/lang/Object;",
		garbageValue = "118970610"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 518
		if (var2 == 0) { // L: 519
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 520

			for (int var4 = 0; var4 < var2; ++var4) { // L: 521
				int var5 = var1.readUnsignedByte(); // L: 522
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 523
				} else if (var5 == 1) { // L: 524
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 526
			return var3; // L: 527
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)[I",
		garbageValue = "935192358"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 531
		if (var2 == 0) { // L: 532
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 533

			for (int var4 = 0; var4 < var2; ++var4) { // L: 534
				var3[var4] = var1.readInt(); // L: 535
			}

			return var3; // L: 537
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1011934245"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 541
		this.itemIds[var2] = this.itemIds[var1]; // L: 542
		this.itemIds[var1] = var3; // L: 543
		var3 = this.itemQuantities[var2]; // L: 544
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 545
		this.itemQuantities[var1] = var3; // L: 546
	} // L: 547

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lpt;",
		garbageValue = "12"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3262 = false; // L: 550
		int var2;
		if (var1) { // L: 552
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 553
		}

		if (var2 == -1) { // L: 554
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 555
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 556
			if (var5 != null) { // L: 557
				return var5;
			} else {
				var5 = class126.SpriteBuffer_getSprite(class160.Widget_spritesArchive, var2, 0); // L: 558
				if (var5 == null) { // L: 559
					field3262 = true; // L: 560
					return null; // L: 561
				} else {
					if (this.spriteFlipV) { // L: 563
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 564
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 565
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 566
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 567
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 568
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 569
					return var5; // L: 570
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "193785745"
	)
	@Export("getFont")
	public Font getFont() {
		field3262 = false; // L: 574
		if (this.fontId == -1) { // L: 575
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 576
			if (var1 != null) { // L: 577
				return var1;
			} else {
				AbstractArchive var3 = class160.Widget_spritesArchive; // L: 579
				AbstractArchive var4 = class222.Widget_fontsArchive; // L: 580
				int var5 = this.fontId; // L: 581
				Font var2;
				if (!class125.method2744(var3, var5, 0)) { // L: 583
					var2 = null; // L: 584
				} else {
					var2 = Clock.method3125(var4.takeFile(var5, 0)); // L: 587
				}

				if (var2 != null) { // L: 590
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3262 = true; // L: 591
				}

				return var2; // L: 592
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Lpt;",
		garbageValue = "1704463538"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3262 = false; // L: 596
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 597
			int var2 = this.inventorySprites[var1]; // L: 598
			if (var2 == -1) { // L: 599
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 600
				if (var3 != null) { // L: 601
					return var3;
				} else {
					var3 = class126.SpriteBuffer_getSprite(class160.Widget_spritesArchive, var2, 0); // L: 602
					if (var3 != null) { // L: 603
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3262 = true; // L: 604
					}

					return var3; // L: 605
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IZLjo;I)Lgf;",
		garbageValue = "2091049938"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3262 = false; // L: 609
		int var5;
		int var6;
		if (var3) { // L: 612
			var5 = this.modelType2; // L: 613
			var6 = this.modelId2; // L: 614
		} else {
			var5 = this.modelType; // L: 617
			var6 = this.modelId; // L: 618
		}

		if (var5 == 0) { // L: 620
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 621
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 622
			if (var7 == null) { // L: 623
				ModelData var8;
				if (var5 == 1) { // L: 625
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0); // L: 626
					if (var8 == null) { // L: 627
						field3262 = true; // L: 628
						return null; // L: 629
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 631
				}

				if (var5 == 2) { // L: 633
					var8 = UserComparator10.getNpcDefinition(var6).getModelData(); // L: 634
					if (var8 == null) { // L: 635
						field3262 = true; // L: 636
						return null; // L: 637
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 639
				}

				if (var5 == 3) { // L: 641
					if (var4 == null) { // L: 642
						return null;
					}

					var8 = var4.getModelData(); // L: 643
					if (var8 == null) { // L: 644
						field3262 = true; // L: 645
						return null; // L: 646
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 648
				}

				if (var5 == 4) { // L: 650
					ItemComposition var9 = Client.ItemDefinition_get(var6); // L: 651
					var8 = var9.getModelData(10); // L: 652
					if (var8 == null) { // L: 653
						field3262 = true; // L: 654
						return null; // L: 655
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 657
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 659
			}

			if (var1 != null) { // L: 661
				var7 = var1.transformWidgetModel(var7, var2); // L: 662
			}

			return var7; // L: 664
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZB)Ljq;",
		garbageValue = "44"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 668
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1408111085 * -1281291237 : this.spriteId2 * -1082596211 * 350322245; // L: 669
		if (var2 == -1) { // L: 670
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 671
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 672
			if (var5 != null) { // L: 673
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 674
				if (var6 == null) { // L: 675
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 676
					int[] var8 = new int[var7.subHeight]; // L: 677
					int[] var9 = new int[var7.subHeight]; // L: 678

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 679
						int var11 = 0; // L: 680
						int var12 = var7.subWidth; // L: 681

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 682
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 683
								var11 = var13; // L: 684
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 688
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 689
								var12 = var13 + 1; // L: 690
								break;
							}
						}

						var8[var10] = var11; // L: 694
						var9[var10] = var12 - var11; // L: 695
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 697
					Widget_cachedSpriteMasks.put(var5, var3); // L: 698
					return var5; // L: 699
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1989165628"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 710
			String[] var3 = new String[var1 + 1]; // L: 711
			if (this.actions != null) { // L: 712
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 713
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 715
		}

		this.actions[var1] = var2; // L: 717
	} // L: 718

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfd;",
		garbageValue = "198"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1637132835"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10264

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10265
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10266
		}

		if (var1.length() > 9) { // L: 10268
			return " " + LoginScreenAnimation.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + LoginScreenAnimation.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + LoginScreenAnimation.colorStartTag(16776960) + var1 + "</col>"; // L: 10269 10270
		}
	}
}
