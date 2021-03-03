import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hz")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("e")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("x")
	public static boolean field2591;
	@ObfuscatedName("f")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 584503877
	)
	@Export("id")
	public int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -572555511
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1058288237
	)
	@Export("type")
	public int type;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1437398639
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 950643501
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1444067651
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 61587371
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -748645369
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1468744315
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 103560479
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -519325005
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -76139235
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -776487251
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 858952753
	)
	@Export("x")
	public int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1333739283
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1593306137
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -937018705
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2022992129
	)
	public int field2610;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1312652811
	)
	public int field2611;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -624975397
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("as")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -963861053
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1198753763
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 262059497
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1576927071
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 23277245
	)
	@Export("color")
	public int color;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -164131939
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -71444347
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1701318471
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("au")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -517594781
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 703155759
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -434003147
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bj")
	public boolean field2627;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1886053401
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 506442589
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 302006269
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("br")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 790935343
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -319259827
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1855366631
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1644049389
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 720841123
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -376137673
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1628856543
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1256829773
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1988544673
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1084480665
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -253353483
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 324297009
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1451560447
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1608940237
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -830126165
	)
	public int field2648;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 539011583
	)
	public int field2649;
	@ObfuscatedName("bk")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bu")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 565005291
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 518745989
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cd")
	@Export("text")
	public String text;
	@ObfuscatedName("cq")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -562457883
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1758780327
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 849313675
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ck")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1465907063
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1082787047
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cr")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("ca")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cz")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cs")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 980328243
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cu")
	public boolean field2667;
	@ObfuscatedName("ci")
	public byte[][] field2668;
	@ObfuscatedName("cy")
	public byte[][] field2669;
	@ObfuscatedName("cx")
	public int[] field2686;
	@ObfuscatedName("cg")
	public int[] field2599;
	@ObfuscatedName("dx")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("do")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 886736563
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 997775527
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dd")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("db")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dl")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dm")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dj")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dh")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ds")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dy")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dv")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dr")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dc")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dq")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dt")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("de")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dw")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dz")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dn")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("da")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("df")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ek")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("eo")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("en")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ep")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("eg")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("es")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ef")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("eb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ec")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ev")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eq")
	public Object[] field2678;
	@ObfuscatedName("ey")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("em")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ee")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1386091893
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("el")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ew")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ea")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("eu")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1781492575
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 717373231
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1513891293
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1411252919
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fi")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fa")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 1159743735
	)
	public int field2719;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 1951762573
	)
	public int field2727;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 2104952635
	)
	public int field2728;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -1295480183
	)
	public int field2729;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1168412841
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = 1829947671
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fc")
	public int[] field2660;
	@ObfuscatedName("fg")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fv")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fy")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 31
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 32
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 33
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 34
		field2591 = false; // L: 35
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
		this.field2648 = 0; // L: 92
		this.field2649 = 0; // L: 93
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
		this.field2719 = -1; // L: 174
		this.field2727 = 0; // L: 175
		this.field2728 = 0; // L: 176
		this.field2729 = 0; // L: 177
		this.rootIndex = -1; // L: 178
		this.cycle = -1; // L: 179
		this.noClickThrough = false; // L: 181
		this.noScrollThrough = false; // L: 182
		this.prioritizeMenuEntry = false; // L: 183
	} // L: 737

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "14"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 236
		this.type = var1.readUnsignedByte(); // L: 237
		this.buttonType = var1.readUnsignedByte(); // L: 238
		this.contentType = var1.readUnsignedShort(); // L: 239
		this.rawX = var1.readShort(); // L: 240
		this.rawY = var1.readShort(); // L: 241
		this.rawWidth = var1.readUnsignedShort(); // L: 242
		this.rawHeight = var1.readUnsignedShort(); // L: 243
		this.transparencyTop = var1.readUnsignedByte(); // L: 244
		this.parentId = var1.readUnsignedShort(); // L: 245
		if (this.parentId == 65535) { // L: 246
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 247
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 248
		if (this.mouseOverRedirect == 65535) { // L: 249
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 250
		int var3;
		if (var2 > 0) { // L: 251
			this.cs1Comparisons = new int[var2]; // L: 252
			this.cs1ComparisonValues = new int[var2]; // L: 253

			for (var3 = 0; var3 < var2; ++var3) { // L: 254
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 255
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 256
			}
		}

		var3 = var1.readUnsignedByte(); // L: 259
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 260
			this.cs1Instructions = new int[var3][]; // L: 261

			for (var4 = 0; var4 < var3; ++var4) { // L: 262
				var5 = var1.readUnsignedShort(); // L: 263
				this.cs1Instructions[var4] = new int[var5]; // L: 264

				for (var6 = 0; var6 < var5; ++var6) { // L: 265
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 266
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 267
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 271
			this.scrollHeight = var1.readUnsignedShort(); // L: 272
			this.isHidden = var1.readUnsignedByte() == 1; // L: 273
		}

		if (this.type == 1) { // L: 275
			var1.readUnsignedShort(); // L: 276
			var1.readUnsignedByte(); // L: 277
		}

		if (this.type == 2) { // L: 279
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 280
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 281
			var4 = var1.readUnsignedByte(); // L: 282
			if (var4 == 1) { // L: 283
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 284
			if (var5 == 1) { // L: 285
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 286
			if (var6 == 1) { // L: 287
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 288
			if (var7 == 1) { // L: 289
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 290
			this.paddingY = var1.readUnsignedByte(); // L: 291
			this.inventoryXOffsets = new int[20]; // L: 292
			this.inventoryYOffsets = new int[20]; // L: 293
			this.inventorySprites = new int[20]; // L: 294

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 295
				int var11 = var1.readUnsignedByte(); // L: 296
				if (var11 == 1) { // L: 297
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 298
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 299
					this.inventorySprites[var8] = var1.readInt(); // L: 300
				} else {
					this.inventorySprites[var8] = -1; // L: 302
				}
			}

			this.itemActions = new String[5]; // L: 304

			for (var8 = 0; var8 < 5; ++var8) { // L: 305
				String var9 = var1.readStringCp1252NullTerminated(); // L: 306
				if (var9.length() > 0) { // L: 307
					this.itemActions[var8] = var9; // L: 308
					this.flags |= 1 << var8 + 23; // L: 309
				}
			}
		}

		if (this.type == 3) { // L: 313
			this.fill = var1.readUnsignedByte() == 1; // L: 314
		}

		if (this.type == 4 || this.type == 1) { // L: 316
			this.textXAlignment = var1.readUnsignedByte(); // L: 317
			this.textYAlignment = var1.readUnsignedByte(); // L: 318
			this.textLineHeight = var1.readUnsignedByte(); // L: 319
			this.fontId = var1.readUnsignedShort(); // L: 320
			if (this.fontId == 65535) { // L: 321
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 322
		}

		if (this.type == 4) { // L: 324
			this.text = var1.readStringCp1252NullTerminated(); // L: 325
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 326
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 328
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 329
			this.color2 = var1.readInt(); // L: 330
			this.mouseOverColor = var1.readInt(); // L: 331
			this.mouseOverColor2 = var1.readInt(); // L: 332
		}

		if (this.type == 5) { // L: 334
			this.spriteId2 = var1.readInt(); // L: 335
			this.spriteId = var1.readInt(); // L: 336
		}

		if (this.type == 6) { // L: 338
			this.modelType = 1; // L: 339
			this.modelId = var1.readUnsignedShort(); // L: 340
			if (this.modelId == 65535) { // L: 341
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 342
			this.modelId2 = var1.readUnsignedShort(); // L: 343
			if (this.modelId2 == 65535) { // L: 344
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 345
			if (this.sequenceId == 65535) { // L: 346
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 347
			if (this.sequenceId2 == 65535) { // L: 348
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 349
			this.modelAngleX = var1.readUnsignedShort(); // L: 350
			this.modelAngleY = var1.readUnsignedShort(); // L: 351
		}

		if (this.type == 7) { // L: 353
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 354
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 355
			this.textXAlignment = var1.readUnsignedByte(); // L: 356
			this.fontId = var1.readUnsignedShort(); // L: 357
			if (this.fontId == 65535) { // L: 358
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 359
			this.color = var1.readInt(); // L: 360
			this.paddingX = var1.readShort(); // L: 361
			this.paddingY = var1.readShort(); // L: 362
			var4 = var1.readUnsignedByte(); // L: 363
			if (var4 == 1) { // L: 364
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5]; // L: 365

			for (var5 = 0; var5 < 5; ++var5) { // L: 366
				String var10 = var1.readStringCp1252NullTerminated(); // L: 367
				if (var10.length() > 0) { // L: 368
					this.itemActions[var5] = var10; // L: 369
					this.flags |= 1 << var5 + 23; // L: 370
				}
			}
		}

		if (this.type == 8) { // L: 374
			this.text = var1.readStringCp1252NullTerminated(); // L: 375
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 377
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 378
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 379
			var4 = var1.readUnsignedShort() & 63; // L: 380
			this.flags |= var4 << 11; // L: 381
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 383
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 384
			if (this.buttonText.length() == 0) { // L: 385
				if (this.buttonType == 1) { // L: 386
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 387
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 388
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 389
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 392
			this.flags |= 4194304; // L: 393
		}

		if (this.buttonType == 6) { // L: 395
			this.flags |= 1; // L: 396
		}

	} // L: 398

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-327034944"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 401
		this.isIf3 = true; // L: 402
		this.type = var1.readUnsignedByte(); // L: 403
		this.contentType = var1.readUnsignedShort(); // L: 404
		this.rawX = var1.readShort(); // L: 405
		this.rawY = var1.readShort(); // L: 406
		this.rawWidth = var1.readUnsignedShort(); // L: 407
		if (this.type == 9) { // L: 408
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 409
		}

		this.widthAlignment = var1.readByte(); // L: 410
		this.heightAlignment = var1.readByte(); // L: 411
		this.xAlignment = var1.readByte(); // L: 412
		this.yAlignment = var1.readByte(); // L: 413
		this.parentId = var1.readUnsignedShort(); // L: 414
		if (this.parentId == 65535) { // L: 415
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 416
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 417
		if (this.type == 0) { // L: 418
			this.scrollWidth = var1.readUnsignedShort(); // L: 419
			this.scrollHeight = var1.readUnsignedShort(); // L: 420
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 421
		}

		if (this.type == 5) { // L: 423
			this.spriteId2 = var1.readInt(); // L: 424
			this.spriteAngle = var1.readUnsignedShort(); // L: 425
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 426
			this.transparencyTop = var1.readUnsignedByte(); // L: 427
			this.outline = var1.readUnsignedByte(); // L: 428
			this.spriteShadow = var1.readInt(); // L: 429
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 430
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 431
		}

		if (this.type == 6) { // L: 433
			this.modelType = 1; // L: 434
			this.modelId = var1.readUnsignedShort(); // L: 435
			if (this.modelId == 65535) { // L: 436
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 437
			this.modelOffsetY = var1.readShort(); // L: 438
			this.modelAngleX = var1.readUnsignedShort(); // L: 439
			this.modelAngleY = var1.readUnsignedShort(); // L: 440
			this.modelAngleZ = var1.readUnsignedShort(); // L: 441
			this.modelZoom = var1.readUnsignedShort(); // L: 442
			this.sequenceId = var1.readUnsignedShort(); // L: 443
			if (this.sequenceId == 65535) { // L: 444
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 445
			var1.readUnsignedShort(); // L: 446
			if (this.widthAlignment != 0) { // L: 447
				this.field2648 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 448
				var1.readUnsignedShort(); // L: 449
			}
		}

		if (this.type == 4) { // L: 452
			this.fontId = var1.readUnsignedShort(); // L: 453
			if (this.fontId == 65535) { // L: 454
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 455
			this.textLineHeight = var1.readUnsignedByte(); // L: 456
			this.textXAlignment = var1.readUnsignedByte(); // L: 457
			this.textYAlignment = var1.readUnsignedByte(); // L: 458
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 459
			this.color = var1.readInt(); // L: 460
		}

		if (this.type == 3) { // L: 462
			this.color = var1.readInt(); // L: 463
			this.fill = var1.readUnsignedByte() == 1; // L: 464
			this.transparencyTop = var1.readUnsignedByte(); // L: 465
		}

		if (this.type == 9) { // L: 467
			this.lineWid = var1.readUnsignedByte(); // L: 468
			this.color = var1.readInt(); // L: 469
			this.field2627 = var1.readUnsignedByte() == 1; // L: 470
		}

		this.flags = var1.readMedium(); // L: 472
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 473
		int var2 = var1.readUnsignedByte(); // L: 474
		if (var2 > 0) { // L: 475
			this.actions = new String[var2]; // L: 476

			for (int var3 = 0; var3 < var2; ++var3) { // L: 477
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 479
		this.dragThreshold = var1.readUnsignedByte(); // L: 480
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 481
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 482
		this.onLoad = this.readListener(var1); // L: 483
		this.onMouseOver = this.readListener(var1); // L: 484
		this.onMouseLeave = this.readListener(var1); // L: 485
		this.onTargetLeave = this.readListener(var1); // L: 486
		this.onTargetEnter = this.readListener(var1); // L: 487
		this.onVarTransmit = this.readListener(var1); // L: 488
		this.onInvTransmit = this.readListener(var1); // L: 489
		this.onStatTransmit = this.readListener(var1); // L: 490
		this.onTimer = this.readListener(var1); // L: 491
		this.onOp = this.readListener(var1); // L: 492
		this.onMouseRepeat = this.readListener(var1); // L: 493
		this.onClick = this.readListener(var1); // L: 494
		this.onClickRepeat = this.readListener(var1); // L: 495
		this.onRelease = this.readListener(var1); // L: 496
		this.onHold = this.readListener(var1); // L: 497
		this.onDrag = this.readListener(var1); // L: 498
		this.onDragComplete = this.readListener(var1); // L: 499
		this.onScroll = this.readListener(var1); // L: 500
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 501
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 502
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 503
	} // L: 504

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)[Ljava/lang/Object;",
		garbageValue = "-123"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 507
		if (var2 == 0) { // L: 508
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 509

			for (int var4 = 0; var4 < var2; ++var4) { // L: 510
				int var5 = var1.readUnsignedByte(); // L: 511
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 512
				} else if (var5 == 1) { // L: 513
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 515
			return var3; // L: 516
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)[I",
		garbageValue = "-892606734"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 520
		if (var2 == 0) { // L: 521
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 522

			for (int var4 = 0; var4 < var2; ++var4) { // L: 523
				var3[var4] = var1.readInt(); // L: 524
			}

			return var3; // L: 526
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "42"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 530
		this.itemIds[var2] = this.itemIds[var1]; // L: 531
		this.itemIds[var1] = var3; // L: 532
		var3 = this.itemQuantities[var2]; // L: 533
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 534
		this.itemQuantities[var1] = var3; // L: 535
	} // L: 536

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Llm;",
		garbageValue = "1522680461"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2591 = false; // L: 539
		int var2;
		if (var1) { // L: 541
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2; // L: 542
		}

		if (var2 == -1) { // L: 543
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 544
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3); // L: 545
			if (var5 != null) { // L: 546
				return var5;
			} else {
				var5 = BufferedSource.SpriteBuffer_getSprite(InterfaceParent.Widget_spritesArchive, var2, 0); // L: 547
				if (var5 == null) { // L: 548
					field2591 = true; // L: 549
					return null; // L: 550
				} else {
					if (this.spriteFlipV) { // L: 552
						var5.flipVertically();
					}

					if (this.spriteFlipH) { // L: 553
						var5.flipHorizontally();
					}

					if (this.outline > 0) { // L: 554
						var5.pad(this.outline);
					}

					if (this.outline >= 1) { // L: 555
						var5.outline(1);
					}

					if (this.outline >= 2) { // L: 556
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) { // L: 557
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3); // L: 558
					return var5; // L: 559
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lkl;",
		garbageValue = "1746762389"
	)
	@Export("getFont")
	public Font getFont() {
		field2591 = false; // L: 563
		if (this.fontId == -1) { // L: 564
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 565
			if (var1 != null) { // L: 566
				return var1;
			} else {
				AbstractArchive var3 = InterfaceParent.Widget_spritesArchive; // L: 568
				AbstractArchive var4 = Widget_fontsArchive; // L: 569
				int var5 = this.fontId; // L: 570
				byte[] var7 = var3.takeFile(var5, 0); // L: 574
				boolean var6;
				if (var7 == null) { // L: 575
					var6 = false; // L: 576
				} else {
					GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7); // L: 579
					var6 = true; // L: 580
				}

				Font var2;
				if (!var6) { // L: 582
					var2 = null; // L: 583
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 587
					Font var10;
					if (var8 == null) { // L: 589
						var10 = null; // L: 590
					} else {
						Font var9 = new Font(var8, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels); // L: 593
						class105.SpriteBuffer_xOffsets = null; // L: 595
						class336.SpriteBuffer_yOffsets = null; // L: 596
						class336.SpriteBuffer_spriteWidths = null; // L: 597
						class225.SpriteBuffer_spriteHeights = null; // L: 598
						HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 599
						class2.SpriteBuffer_pixels = null; // L: 600
						var10 = var9; // L: 602
					}

					var2 = var10; // L: 604
				}

				if (var2 != null) { // L: 607
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field2591 = true; // L: 608
				}

				return var2; // L: 609
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Llm;",
		garbageValue = "-33"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2591 = false; // L: 613
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 614
			int var2 = this.inventorySprites[var1]; // L: 615
			if (var2 == -1) { // L: 616
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 617
				if (var3 != null) { // L: 618
					return var3;
				} else {
					var3 = BufferedSource.SpriteBuffer_getSprite(InterfaceParent.Widget_spritesArchive, var2, 0); // L: 619
					if (var3 != null) { // L: 620
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2591 = true; // L: 621
					}

					return var3; // L: 622
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljs;IZLhu;B)Lef;",
		garbageValue = "-25"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2591 = false; // L: 626
		int var5;
		int var6;
		if (var3) { // L: 629
			var5 = this.modelType2; // L: 630
			var6 = this.modelId2; // L: 631
		} else {
			var5 = this.modelType; // L: 634
			var6 = this.modelId; // L: 635
		}

		if (var5 == 0) { // L: 637
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 638
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 639
			if (var7 == null) { // L: 640
				ModelData var8;
				if (var5 == 1) { // L: 642
					var8 = ModelData.ModelData_get(DirectByteArrayCopier.Widget_modelsArchive, var6, 0); // L: 643
					if (var8 == null) { // L: 644
						field2591 = true; // L: 645
						return null; // L: 646
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 648
				}

				if (var5 == 2) { // L: 650
					var8 = class90.getNpcDefinition(var6).getModelData(); // L: 651
					if (var8 == null) { // L: 652
						field2591 = true; // L: 653
						return null; // L: 654
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 656
				}

				if (var5 == 3) { // L: 658
					if (var4 == null) { // L: 659
						return null;
					}

					var8 = var4.getModelData(); // L: 660
					if (var8 == null) { // L: 661
						field2591 = true; // L: 662
						return null; // L: 663
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 665
				}

				if (var5 == 4) { // L: 667
					ItemComposition var9 = class281.ItemDefinition_get(var6); // L: 668
					var8 = var9.getModelData(10); // L: 669
					if (var8 == null) { // L: 670
						field2591 = true; // L: 671
						return null; // L: 672
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 674
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 676
			}

			if (var1 != null) { // L: 678
				var7 = var1.transformWidgetModel(var7, var2); // L: 679
			}

			return var7; // L: 681
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lht;",
		garbageValue = "202613287"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 685
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 506442589 * 79771893 : this.spriteId2 * -1146894377 * -1886053401; // L: 686
		if (var2 == -1) { // L: 687
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 688
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 689
			if (var5 != null) { // L: 690
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1); // L: 691
				if (var6 == null) { // L: 692
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 693
					int[] var8 = new int[var7.subHeight]; // L: 694
					int[] var9 = new int[var7.subHeight]; // L: 695

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 696
						int var11 = 0; // L: 697
						int var12 = var7.subWidth; // L: 698

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 699
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 700
								var11 = var13; // L: 701
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 705
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 706
								var12 = var13 + 1; // L: 707
								break;
							}
						}

						var8[var10] = var11; // L: 711
						var9[var10] = var12 - var11; // L: 712
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 714
					Widget_cachedSpriteMasks.put(var5, var3); // L: 715
					return var5; // L: 716
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-44"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 727
			String[] var3 = new String[var1 + 1]; // L: 728
			if (this.actions != null) { // L: 729
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 730
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 732
		}

		this.actions[var1] = var2; // L: 734
	} // L: 735

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-2098441807"
	)
	static int method4292(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3257
			Client.logoutTimer = 250; // L: 3258
			return 1; // L: 3259
		} else if (var0 != 5631 && var0 != 5633) { // L: 3261
			if (var0 == 5632) { // L: 3265
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 26; // L: 3266
				return 1; // L: 3267
			} else {
				return 2; // L: 3269
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2; // L: 3262
			return 1; // L: 3263
		}
	}
}
