import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("n")
	public static boolean field3049;
	@ObfuscatedName("z")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -830177389
	)
	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 855382617
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -918896741
	)
	@Export("type")
	public int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1801435393
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1660525629
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 284180189
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -107040825
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2054031979
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1765529153
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -716032615
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -84019821
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -966786115
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -727779257
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -836435373
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 470259933
	)
	@Export("y")
	public int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1492995549
	)
	@Export("width")
	public int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1623576255
	)
	@Export("height")
	public int height;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1759853159
	)
	public int field3068;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -9428879
	)
	public int field3069;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 528333103
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ab")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 168917907
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1094545789
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1040080419
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1297742855
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1557539219
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 37220023
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1939141949
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -664309699
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("af")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1200768777
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1147011099
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1035105757
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bg")
	public boolean field3085;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 338387711
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1784284609
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1886200049
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bt")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 460210347
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -940365255
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bh")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1682155053
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1325924463
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1907857883
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -294218779
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 995334035
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 359756345
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1329362105
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1310924187
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1082654603
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2109691849
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -383796933
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -588937837
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 368452663
	)
	public int field3106;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 168328461
	)
	public int field3165;
	@ObfuscatedName("by")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("ba")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 57057327
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 928434151
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cq")
	@Export("text")
	public String text;
	@ObfuscatedName("ck")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 150906213
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1685073913
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -556962931
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ct")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1531986129
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 176722309
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cl")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cs")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ce")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cp")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1837183897
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cw")
	public boolean field3125;
	@ObfuscatedName("cr")
	public byte[][] field3180;
	@ObfuscatedName("cu")
	public byte[][] field3105;
	@ObfuscatedName("cc")
	public int[] field3128;
	@ObfuscatedName("ch")
	public int[] field3129;
	@ObfuscatedName("co")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cy")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1233976297
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1376334067
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("da")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dw")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dn")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dc")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("du")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("db")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dj")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dt")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dy")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ds")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("de")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("di")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("do")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dr")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dz")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dd")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dl")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dm")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dk")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dv")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ed")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ej")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eu")
	public Object[] field3161;
	@ObfuscatedName("eh")
	public Object[] field3162;
	@ObfuscatedName("ec")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ek")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ea")
	public Object[] field3056;
	@ObfuscatedName("em")
	public Object[] field3166;
	@ObfuscatedName("ep")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("el")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ex")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ew")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("er")
	public Object[] field3172;
	@ObfuscatedName("eg")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ez")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -712270533
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ev")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ee")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ey")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ei")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1000336005
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -119048843
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1683480099
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -1549295787
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fa")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fi")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 500124989
	)
	public int field3188;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -898435809
	)
	public int field3189;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -242702175
	)
	public int field3073;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -592278881
	)
	public int field3191;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1719884029
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 11938569
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fn")
	public int[] field3194;
	@ObfuscatedName("ft")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fl")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fe")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field3049 = false; // L: 35
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
		this.field3068 = 1; // L: 54
		this.field3069 = 1; // L: 55
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
		this.field3085 = false; // L: 71
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
		this.field3106 = 0; // L: 92
		this.field3165 = 0; // L: 93
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
		this.field3125 = false; // L: 111
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
		this.field3188 = -1; // L: 178
		this.field3189 = 0; // L: 179
		this.field3073 = 0; // L: 180
		this.field3191 = 0; // L: 181
		this.rootIndex = -1; // L: 182
		this.cycle = -1; // L: 183
		this.noClickThrough = false; // L: 185
		this.noScrollThrough = false; // L: 186
		this.prioritizeMenuEntry = false; // L: 187
	} // L: 724

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1471945401"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 240
		this.type = var1.readUnsignedByte(); // L: 241
		this.buttonType = var1.readUnsignedByte(); // L: 242
		this.contentType = var1.readUnsignedShort(); // L: 243
		this.rawX = var1.readShort(); // L: 244
		this.rawY = var1.readShort(); // L: 245
		this.rawWidth = var1.readUnsignedShort(); // L: 246
		this.rawHeight = var1.readUnsignedShort(); // L: 247
		this.transparencyTop = var1.readUnsignedByte(); // L: 248
		this.parentId = var1.readUnsignedShort(); // L: 249
		if (this.parentId == 65535) { // L: 250
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 251
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 252
		if (this.mouseOverRedirect == 65535) { // L: 253
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 254
		int var3;
		if (var2 > 0) { // L: 255
			this.cs1Comparisons = new int[var2]; // L: 256
			this.cs1ComparisonValues = new int[var2]; // L: 257

			for (var3 = 0; var3 < var2; ++var3) { // L: 258
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 259
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 260
			}
		}

		var3 = var1.readUnsignedByte(); // L: 263
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 264
			this.cs1Instructions = new int[var3][]; // L: 265

			for (var4 = 0; var4 < var3; ++var4) { // L: 266
				var5 = var1.readUnsignedShort(); // L: 267
				this.cs1Instructions[var4] = new int[var5]; // L: 268

				for (var6 = 0; var6 < var5; ++var6) { // L: 269
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 270
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 271
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 275
			this.scrollHeight = var1.readUnsignedShort(); // L: 276
			this.isHidden = var1.readUnsignedByte() == 1; // L: 277
		}

		if (this.type == 1) { // L: 279
			var1.readUnsignedShort(); // L: 280
			var1.readUnsignedByte(); // L: 281
		}

		if (this.type == 2) { // L: 283
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 284
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 285
			var4 = var1.readUnsignedByte(); // L: 286
			if (var4 == 1) { // L: 287
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 288
			if (var5 == 1) { // L: 289
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 290
			if (var6 == 1) { // L: 291
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 292
			if (var7 == 1) { // L: 293
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 294
			this.paddingY = var1.readUnsignedByte(); // L: 295
			this.inventoryXOffsets = new int[20]; // L: 296
			this.inventoryYOffsets = new int[20]; // L: 297
			this.inventorySprites = new int[20]; // L: 298

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 299
				int var11 = var1.readUnsignedByte(); // L: 300
				if (var11 == 1) { // L: 301
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 302
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 303
					this.inventorySprites[var8] = var1.readInt(); // L: 304
				} else {
					this.inventorySprites[var8] = -1; // L: 306
				}
			}

			this.itemActions = new String[5]; // L: 308

			for (var8 = 0; var8 < 5; ++var8) { // L: 309
				String var9 = var1.readStringCp1252NullTerminated(); // L: 310
				if (var9.length() > 0) { // L: 311
					this.itemActions[var8] = var9; // L: 312
					this.flags |= 1 << var8 + 23; // L: 313
				}
			}
		}

		if (this.type == 3) { // L: 317
			this.fill = var1.readUnsignedByte() == 1; // L: 318
		}

		if (this.type == 4 || this.type == 1) { // L: 320
			this.textXAlignment = var1.readUnsignedByte(); // L: 321
			this.textYAlignment = var1.readUnsignedByte(); // L: 322
			this.textLineHeight = var1.readUnsignedByte(); // L: 323
			this.fontId = var1.readUnsignedShort(); // L: 324
			if (this.fontId == 65535) { // L: 325
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 326
		}

		if (this.type == 4) { // L: 328
			this.text = var1.readStringCp1252NullTerminated(); // L: 329
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 330
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 332
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 333
			this.color2 = var1.readInt(); // L: 334
			this.mouseOverColor = var1.readInt(); // L: 335
			this.mouseOverColor2 = var1.readInt(); // L: 336
		}

		if (this.type == 5) { // L: 338
			this.spriteId2 = var1.readInt(); // L: 339
			this.spriteId = var1.readInt(); // L: 340
		}

		if (this.type == 6) { // L: 342
			this.modelType = 1; // L: 343
			this.modelId = var1.readUnsignedShort(); // L: 344
			if (this.modelId == 65535) { // L: 345
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 346
			this.modelId2 = var1.readUnsignedShort(); // L: 347
			if (this.modelId2 == 65535) { // L: 348
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 349
			if (this.sequenceId == 65535) { // L: 350
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 351
			if (this.sequenceId2 == 65535) { // L: 352
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 353
			this.modelAngleX = var1.readUnsignedShort(); // L: 354
			this.modelAngleY = var1.readUnsignedShort(); // L: 355
		}

		if (this.type == 7) { // L: 357
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 358
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 359
			this.textXAlignment = var1.readUnsignedByte(); // L: 360
			this.fontId = var1.readUnsignedShort(); // L: 361
			if (this.fontId == 65535) { // L: 362
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 363
			this.color = var1.readInt(); // L: 364
			this.paddingX = var1.readShort(); // L: 365
			this.paddingY = var1.readShort(); // L: 366
			var4 = var1.readUnsignedByte(); // L: 367
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 368
			}

			this.itemActions = new String[5]; // L: 369

			for (var5 = 0; var5 < 5; ++var5) { // L: 370
				String var10 = var1.readStringCp1252NullTerminated(); // L: 371
				if (var10.length() > 0) { // L: 372
					this.itemActions[var5] = var10; // L: 373
					this.flags |= 1 << var5 + 23; // L: 374
				}
			}
		}

		if (this.type == 8) { // L: 378
			this.text = var1.readStringCp1252NullTerminated(); // L: 379
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 381
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 382
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 383
			var4 = var1.readUnsignedShort() & 63; // L: 384
			this.flags |= var4 << 11; // L: 385
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 387
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 388
			if (this.buttonText.length() == 0) { // L: 389
				if (this.buttonType == 1) { // L: 390
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 391
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 392
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 393
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 396
			this.flags |= 4194304; // L: 397
		}

		if (this.buttonType == 6) { // L: 399
			this.flags |= 1; // L: 400
		}

	} // L: 402

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1242431249"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 405
		this.isIf3 = true; // L: 406
		this.type = var1.readUnsignedByte(); // L: 407
		this.contentType = var1.readUnsignedShort(); // L: 408
		this.rawX = var1.readShort(); // L: 409
		this.rawY = var1.readShort(); // L: 410
		this.rawWidth = var1.readUnsignedShort(); // L: 411
		if (this.type == 9) { // L: 412
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 413
		}

		this.widthAlignment = var1.readByte(); // L: 414
		this.heightAlignment = var1.readByte(); // L: 415
		this.xAlignment = var1.readByte(); // L: 416
		this.yAlignment = var1.readByte(); // L: 417
		this.parentId = var1.readUnsignedShort(); // L: 418
		if (this.parentId == 65535) { // L: 419
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 420
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 421
		if (this.type == 0) { // L: 422
			this.scrollWidth = var1.readUnsignedShort(); // L: 423
			this.scrollHeight = var1.readUnsignedShort(); // L: 424
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 425
		}

		if (this.type == 5) { // L: 427
			this.spriteId2 = var1.readInt(); // L: 428
			this.spriteAngle = var1.readUnsignedShort(); // L: 429
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 430
			this.transparencyTop = var1.readUnsignedByte(); // L: 431
			this.outline = var1.readUnsignedByte(); // L: 432
			this.spriteShadow = var1.readInt(); // L: 433
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 434
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 435
		}

		if (this.type == 6) { // L: 437
			this.modelType = 1; // L: 438
			this.modelId = var1.readUnsignedShort(); // L: 439
			if (this.modelId == 65535) { // L: 440
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 441
			this.modelOffsetY = var1.readShort(); // L: 442
			this.modelAngleX = var1.readUnsignedShort(); // L: 443
			this.modelAngleY = var1.readUnsignedShort(); // L: 444
			this.modelAngleZ = var1.readUnsignedShort(); // L: 445
			this.modelZoom = var1.readUnsignedShort(); // L: 446
			this.sequenceId = var1.readUnsignedShort(); // L: 447
			if (this.sequenceId == 65535) { // L: 448
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 449
			var1.readUnsignedShort(); // L: 450
			if (this.widthAlignment != 0) { // L: 451
				this.field3106 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 452
				var1.readUnsignedShort(); // L: 453
			}
		}

		if (this.type == 4) { // L: 456
			this.fontId = var1.readUnsignedShort(); // L: 457
			if (this.fontId == 65535) { // L: 458
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 459
			this.textLineHeight = var1.readUnsignedByte(); // L: 460
			this.textXAlignment = var1.readUnsignedByte(); // L: 461
			this.textYAlignment = var1.readUnsignedByte(); // L: 462
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 463
			this.color = var1.readInt(); // L: 464
		}

		if (this.type == 3) { // L: 466
			this.color = var1.readInt(); // L: 467
			this.fill = var1.readUnsignedByte() == 1; // L: 468
			this.transparencyTop = var1.readUnsignedByte(); // L: 469
		}

		if (this.type == 9) { // L: 471
			this.lineWid = var1.readUnsignedByte(); // L: 472
			this.color = var1.readInt(); // L: 473
			this.field3085 = var1.readUnsignedByte() == 1; // L: 474
		}

		this.flags = var1.readMedium(); // L: 476
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 477
		int var2 = var1.readUnsignedByte(); // L: 478
		if (var2 > 0) { // L: 479
			this.actions = new String[var2]; // L: 480

			for (int var3 = 0; var3 < var2; ++var3) { // L: 481
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 483
		this.dragThreshold = var1.readUnsignedByte(); // L: 484
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 485
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 486
		this.onLoad = this.readListener(var1); // L: 487
		this.onMouseOver = this.readListener(var1); // L: 488
		this.onMouseLeave = this.readListener(var1); // L: 489
		this.onTargetLeave = this.readListener(var1); // L: 490
		this.onTargetEnter = this.readListener(var1); // L: 491
		this.onVarTransmit = this.readListener(var1); // L: 492
		this.onInvTransmit = this.readListener(var1); // L: 493
		this.onStatTransmit = this.readListener(var1); // L: 494
		this.onTimer = this.readListener(var1); // L: 495
		this.onOp = this.readListener(var1); // L: 496
		this.onMouseRepeat = this.readListener(var1); // L: 497
		this.onClick = this.readListener(var1); // L: 498
		this.onClickRepeat = this.readListener(var1); // L: 499
		this.onRelease = this.readListener(var1); // L: 500
		this.onHold = this.readListener(var1); // L: 501
		this.onDrag = this.readListener(var1); // L: 502
		this.onDragComplete = this.readListener(var1); // L: 503
		this.onScroll = this.readListener(var1); // L: 504
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 505
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 506
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 507
	} // L: 508

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)[Ljava/lang/Object;",
		garbageValue = "-866877812"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 511
		if (var2 == 0) { // L: 512
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 513

			for (int var4 = 0; var4 < var2; ++var4) { // L: 514
				int var5 = var1.readUnsignedByte(); // L: 515
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 516
				} else if (var5 == 1) { // L: 517
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 519
			return var3; // L: 520
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)[I",
		garbageValue = "105"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 524
		if (var2 == 0) { // L: 525
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 526

			for (int var4 = 0; var4 < var2; ++var4) { // L: 527
				var3[var4] = var1.readInt(); // L: 528
			}

			return var3; // L: 530
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "657208411"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 534
		this.itemIds[var2] = this.itemIds[var1]; // L: 535
		this.itemIds[var1] = var3; // L: 536
		var3 = this.itemQuantities[var2]; // L: 537
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 538
		this.itemQuantities[var1] = var3; // L: 539
	} // L: 540

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZB)Low;",
		garbageValue = "-58"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3049 = false; // L: 543
		int var2;
		if (var1) { // L: 545
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 546
		}

		if (var2 == -1) { // L: 547
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 548
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 549
			if (var5 != null) { // L: 550
				return var5;
			} else {
				var5 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapScaleHandler.Widget_spritesArchive, var2, 0); // L: 551
				if (var5 == null) { // L: 552
					field3049 = true; // L: 553
					return null; // L: 554
				} else {
					if (this.spriteFlipV) { // L: 556
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 557
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 558
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 559
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 560
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 561
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 562
					return var5; // L: 563
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lle;",
		garbageValue = "96"
	)
	@Export("getFont")
	public Font getFont() {
		field3049 = false; // L: 567
		if (this.fontId == -1) { // L: 568
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 569
			if (var1 != null) { // L: 570
				return var1;
			} else {
				AbstractArchive var3 = WorldMapScaleHandler.Widget_spritesArchive; // L: 572
				AbstractArchive var4 = class134.Widget_fontsArchive; // L: 573
				int var5 = this.fontId; // L: 574
				Font var2;
				if (!BuddyRankComparator.method2502(var3, var5, 0)) { // L: 576
					var2 = null; // L: 577
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 581
					Font var6;
					if (var7 == null) { // L: 583
						var6 = null; // L: 584
					} else {
						Font var8 = new Font(var7, class414.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, UrlRequester.SpriteBuffer_spriteWidths, class414.SpriteBuffer_spriteHeights, HitSplatDefinition.SpriteBuffer_spritePalette, class295.SpriteBuffer_pixels); // L: 587
						PacketBuffer.method6913(); // L: 588
						var6 = var8; // L: 589
					}

					var2 = var6; // L: 591
				}

				if (var2 != null) { // L: 594
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3049 = true; // L: 595
				}

				return var2; // L: 596
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-1869717535"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3049 = false; // L: 600
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 601
			int var2 = this.inventorySprites[var1]; // L: 602
			if (var2 == -1) { // L: 603
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 604
				if (var3 != null) { // L: 605
					return var3;
				} else {
					var3 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapScaleHandler.Widget_spritesArchive, var2, 0); // L: 606
					if (var3 != null) { // L: 607
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3049 = true; // L: 608
					}

					return var3; // L: 609
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IZLit;I)Lhl;",
		garbageValue = "811469011"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3049 = false; // L: 613
		int var5;
		int var6;
		if (var3) { // L: 616
			var5 = this.modelType2; // L: 617
			var6 = this.modelId2; // L: 618
		} else {
			var5 = this.modelType; // L: 621
			var6 = this.modelId; // L: 622
		}

		if (var5 == 0) { // L: 624
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 625
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 626
			if (var7 == null) { // L: 627
				ModelData var8;
				if (var5 == 1) { // L: 629
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0); // L: 630
					if (var8 == null) { // L: 631
						field3049 = true; // L: 632
						return null; // L: 633
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 635
				}

				if (var5 == 2) { // L: 637
					var8 = ScriptFrame.getNpcDefinition(var6).getModelData(); // L: 638
					if (var8 == null) { // L: 639
						field3049 = true; // L: 640
						return null; // L: 641
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 643
				}

				if (var5 == 3) { // L: 645
					if (var4 == null) { // L: 646
						return null;
					}

					var8 = var4.getModelData(); // L: 647
					if (var8 == null) { // L: 648
						field3049 = true; // L: 649
						return null; // L: 650
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 652
				}

				if (var5 == 4) { // L: 654
					ItemComposition var9 = TaskHandler.ItemDefinition_get(var6); // L: 655
					var8 = var9.getModelData(10); // L: 656
					if (var8 == null) { // L: 657
						field3049 = true; // L: 658
						return null; // L: 659
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 661
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 663
			}

			if (var1 != null) { // L: 665
				var7 = var1.transformWidgetModel(var7, var2); // L: 666
			}

			return var7; // L: 668
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)Liw;",
		garbageValue = "-56"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 672
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1784284609 * -1672153665 : this.spriteId2 * 1217109247 * 338387711; // L: 673
		if (var2 == -1) { // L: 674
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 675
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 676
			if (var5 != null) { // L: 677
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 678
				if (var6 == null) { // L: 679
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 680
					int[] var8 = new int[var7.subHeight]; // L: 681
					int[] var9 = new int[var7.subHeight]; // L: 682

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 683
						int var11 = 0; // L: 684
						int var12 = var7.subWidth; // L: 685

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 686
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 687
								var11 = var13; // L: 688
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 692
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 693
								var12 = var13 + 1; // L: 694
								break;
							}
						}

						var8[var10] = var11; // L: 698
						var9[var10] = var12 - var11; // L: 699
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 701
					Widget_cachedSpriteMasks.put(var5, var3); // L: 702
					return var5; // L: 703
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "35"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 714
			String[] var3 = new String[var1 + 1]; // L: 715
			if (this.actions != null) { // L: 716
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 717
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 719
		}

		this.actions[var1] = var2; // L: 721
	} // L: 722
}
