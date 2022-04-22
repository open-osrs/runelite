import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[[Lky;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static class361 field3389;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static class361 field3332;
	@ObfuscatedName("ao")
	public static boolean field3411;
	@ObfuscatedName("aj")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 785571949
	)
	@Export("id")
	public int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1317080121
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 370654815
	)
	@Export("type")
	public int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1674852349
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 707687703
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 56148415
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 817696093
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 513405589
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2040346085
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -26114281
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 387503687
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2011247383
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1435796997
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1718696181
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -566234841
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1237179477
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -686825733
	)
	@Export("height")
	public int height;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 324512829
	)
	public int field3352;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -98155543
	)
	public int field3353;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -937388189
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1914558753
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -647232793
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -188983191
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1426770415
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 532413421
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 103132295
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -154297075
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -811313521
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bx")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -470805339
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -112532293
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1537981101
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bk")
	public boolean field3369;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 43628099
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 781497615
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bt")
	public String field3487;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2105991617
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bc")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 454838749
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 517366521
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bu")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bz")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1227370175
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 945684985
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 445983049
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1687897513
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1946938751
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 450134807
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -219810473
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 2011213921
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1199644179
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -870869659
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1027382321
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -19522443
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -701988609
	)
	public int field3467;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -781066785
	)
	public int field3392;
	@ObfuscatedName("cy")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cr")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1801031319
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1408415309
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cu")
	@Export("text")
	public String text;
	@ObfuscatedName("cg")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1122513061
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -694565497
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 182093077
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ck")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1633261963
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1192225759
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cx")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dr")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dj")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dd")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	class155 field3409;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1539311711
	)
	int field3410;
	@ObfuscatedName("dp")
	HashMap field3354;
	@ObfuscatedName("dx")
	HashMap field3412;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1690080249
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dm")
	public boolean field3414;
	@ObfuscatedName("dv")
	public byte[][] field3415;
	@ObfuscatedName("da")
	public byte[][] field3485;
	@ObfuscatedName("di")
	public int[] field3417;
	@ObfuscatedName("dt")
	public int[] field3418;
	@ObfuscatedName("do")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -255992791
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -228708447
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dq")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dy")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ec")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("es")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("el")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ej")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("em")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ei")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ep")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("eo")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ex")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("eq")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ed")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ek")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("eb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ew")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("er")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("et")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ee")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ea")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("eu")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("eg")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("en")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ez")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ey")
	public Object[] field3416;
	@ObfuscatedName("eh")
	public Object[] field3451;
	@ObfuscatedName("ev")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ff")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fp")
	public Object[] field3454;
	@ObfuscatedName("fo")
	public Object[] field3455;
	@ObfuscatedName("fm")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fu")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fd")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fi")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fa")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fn")
	public Object[] field3432;
	@ObfuscatedName("fx")
	public Object[] field3462;
	@ObfuscatedName("fy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fr")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fj")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 1863918323
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fb")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fe")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fc")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fq")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -806667787
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -603366955
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 726749667
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 1426555603
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "[Lky;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fg")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fh")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -235731823
	)
	public int field3478;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 590193357
	)
	public int field3479;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -438997263
	)
	public int field3480;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1088082053
	)
	public int field3433;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1419320507
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 396807883
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gj")
	public int[] field3484;
	@ObfuscatedName("gf")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gw")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3389 = new class361(10, class359.field4204); // L: 56
		field3332 = new class361(10, class359.field4204); // L: 57
		field3411 = false; // L: 58
	}

	public Widget() {
		this.isIf3 = false; // L: 59
		this.id = -1; // L: 60
		this.childIndex = -1; // L: 61
		this.buttonType = 0; // L: 63
		this.contentType = 0; // L: 64
		this.xAlignment = 0; // L: 65
		this.yAlignment = 0; // L: 66
		this.widthAlignment = 0; // L: 67
		this.heightAlignment = 0; // L: 68
		this.rawX = 0; // L: 69
		this.rawY = 0; // L: 70
		this.rawWidth = 0; // L: 71
		this.rawHeight = 0; // L: 72
		this.x = 0; // L: 73
		this.y = 0; // L: 74
		this.width = 0; // L: 75
		this.height = 0; // L: 76
		this.field3352 = 1; // L: 77
		this.field3353 = 1; // L: 78
		this.parentId = -1; // L: 79
		this.isHidden = false; // L: 80
		this.scrollX = 0; // L: 81
		this.scrollY = 0; // L: 82
		this.scrollWidth = 0; // L: 83
		this.scrollHeight = 0; // L: 84
		this.color = 0; // L: 85
		this.color2 = 0; // L: 86
		this.mouseOverColor = 0; // L: 87
		this.mouseOverColor2 = 0; // L: 88
		this.fill = false; // L: 89
		this.fillMode = FillMode.SOLID; // L: 90
		this.transparencyTop = 0; // L: 91
		this.transparencyBot = 0; // L: 92
		this.lineWid = 1; // L: 93
		this.field3369 = false; // L: 94
		this.spriteId2 = -1; // L: 95
		this.spriteId = -1; // L: 96
		this.spriteAngle = 0; // L: 98
		this.spriteTiling = false; // L: 99
		this.outline = 0; // L: 100
		this.spriteShadow = 0; // L: 101
		this.modelType = 1; // L: 104
		this.modelId = -1; // L: 105
		this.modelType2 = 1; // L: 106
		this.modelId2 = -1; // L: 107
		this.sequenceId = -1; // L: 108
		this.sequenceId2 = -1; // L: 109
		this.modelOffsetX = 0; // L: 110
		this.modelOffsetY = 0; // L: 111
		this.modelAngleX = 0; // L: 112
		this.modelAngleY = 0; // L: 113
		this.modelAngleZ = 0; // L: 114
		this.modelZoom = 100; // L: 115
		this.field3467 = 0; // L: 116
		this.field3392 = 0; // L: 117
		this.modelOrthog = false; // L: 118
		this.modelTransparency = false; // L: 119
		this.itemQuantityMode = 2; // L: 120
		this.fontId = -1; // L: 121
		this.text = ""; // L: 122
		this.text2 = ""; // L: 123
		this.textLineHeight = 0; // L: 124
		this.textXAlignment = 0; // L: 125
		this.textYAlignment = 0; // L: 126
		this.textShadowed = false; // L: 127
		this.paddingX = 0; // L: 128
		this.paddingY = 0; // L: 129
		this.field3410 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3414 = false; // L: 140
		this.dataText = ""; // L: 149
		this.parent = null; // L: 151
		this.dragZoneSize = 0; // L: 152
		this.dragThreshold = 0; // L: 153
		this.isScrollBar = false; // L: 154
		this.spellActionName = ""; // L: 155
		this.hasListener = false; // L: 156
		this.mouseOverRedirect = -1; // L: 196
		this.spellName = ""; // L: 197
		this.buttonText = "Ok"; // L: 198
		this.itemId = -1; // L: 201
		this.itemQuantity = 0; // L: 202
		this.modelFrame = 0; // L: 203
		this.modelFrameCycle = 0; // L: 204
		this.containsMouse = false; // L: 206
		this.isClicked = false; // L: 207
		this.field3478 = -1; // L: 208
		this.field3479 = 0; // L: 209
		this.field3480 = 0; // L: 210
		this.field3433 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	} // L: 936

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-39"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort(); // L: 273
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte(); // L: 293
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][]; // L: 295

			for (var4 = 0; var4 < var3; ++var4) { // L: 296
				var5 = var1.readUnsignedShort(); // L: 297
				this.cs1Instructions[var4] = new int[var5]; // L: 298

				for (var6 = 0; var6 < var5; ++var6) { // L: 299
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 300
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 301
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 305
			this.scrollHeight = var1.readUnsignedShort(); // L: 306
			this.isHidden = var1.readUnsignedByte() == 1; // L: 307
		}

		if (this.type == 1) { // L: 309
			var1.readUnsignedShort(); // L: 310
			var1.readUnsignedByte(); // L: 311
		}

		if (this.type == 2) { // L: 313
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 314
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 315
			var4 = var1.readUnsignedByte(); // L: 316
			if (var4 == 1) { // L: 317
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 318
			if (var5 == 1) { // L: 319
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 320
			if (var6 == 1) { // L: 321
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 322
			if (var7 == 1) { // L: 323
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 324
			this.paddingY = var1.readUnsignedByte(); // L: 325
			this.inventoryXOffsets = new int[20]; // L: 326
			this.inventoryYOffsets = new int[20]; // L: 327
			this.inventorySprites = new int[20]; // L: 328

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 329
				int var11 = var1.readUnsignedByte(); // L: 330
				if (var11 == 1) { // L: 331
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 332
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 333
					this.inventorySprites[var8] = var1.readInt(); // L: 334
				} else {
					this.inventorySprites[var8] = -1; // L: 336
				}
			}

			this.itemActions = new String[5]; // L: 338

			for (var8 = 0; var8 < 5; ++var8) { // L: 339
				String var9 = var1.readStringCp1252NullTerminated(); // L: 340
				if (var9.length() > 0) { // L: 341
					this.itemActions[var8] = var9; // L: 342
					this.flags |= 1 << var8 + 23; // L: 343
				}
			}
		}

		if (this.type == 3) { // L: 347
			this.fill = var1.readUnsignedByte() == 1; // L: 348
		}

		if (this.type == 4 || this.type == 1) { // L: 350
			this.textXAlignment = var1.readUnsignedByte(); // L: 351
			this.textYAlignment = var1.readUnsignedByte(); // L: 352
			this.textLineHeight = var1.readUnsignedByte(); // L: 353
			this.fontId = var1.readUnsignedShort(); // L: 354
			if (this.fontId == 65535) { // L: 355
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 356
		}

		if (this.type == 4) { // L: 358
			this.text = var1.readStringCp1252NullTerminated(); // L: 359
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 360
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 362
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 363
			this.color2 = var1.readInt(); // L: 364
			this.mouseOverColor = var1.readInt(); // L: 365
			this.mouseOverColor2 = var1.readInt(); // L: 366
		}

		if (this.type == 5) { // L: 368
			this.spriteId2 = var1.readInt(); // L: 369
			this.spriteId = var1.readInt(); // L: 370
		}

		if (this.type == 6) { // L: 372
			this.modelType = 1; // L: 373
			this.modelId = var1.readUnsignedShort(); // L: 374
			if (this.modelId == 65535) { // L: 375
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 376
			this.modelId2 = var1.readUnsignedShort(); // L: 377
			if (this.modelId2 == 65535) { // L: 378
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 379
			if (this.sequenceId == 65535) { // L: 380
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 381
			if (this.sequenceId2 == 65535) { // L: 382
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 383
			this.modelAngleX = var1.readUnsignedShort(); // L: 384
			this.modelAngleY = var1.readUnsignedShort(); // L: 385
		}

		if (this.type == 7) { // L: 387
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 388
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 389
			this.textXAlignment = var1.readUnsignedByte(); // L: 390
			this.fontId = var1.readUnsignedShort(); // L: 391
			if (this.fontId == 65535) { // L: 392
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 393
			this.color = var1.readInt(); // L: 394
			this.paddingX = var1.readShort(); // L: 395
			this.paddingY = var1.readShort(); // L: 396
			var4 = var1.readUnsignedByte(); // L: 397
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 398
			}

			this.itemActions = new String[5]; // L: 399

			for (var5 = 0; var5 < 5; ++var5) { // L: 400
				String var10 = var1.readStringCp1252NullTerminated(); // L: 401
				if (var10.length() > 0) { // L: 402
					this.itemActions[var5] = var10; // L: 403
					this.flags |= 1 << var5 + 23; // L: 404
				}
			}
		}

		if (this.type == 8) { // L: 408
			this.text = var1.readStringCp1252NullTerminated(); // L: 409
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 411
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 412
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 413
			var4 = var1.readUnsignedShort() & 63; // L: 414
			this.flags |= var4 << 11; // L: 415
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 417
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 418
			if (this.buttonText.length() == 0) { // L: 419
				if (this.buttonType == 1) { // L: 420
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 421
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 422
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 423
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 426
			this.flags |= 4194304; // L: 427
		}

		if (this.buttonType == 6) { // L: 429
			this.flags |= 1; // L: 430
		}

	} // L: 432

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-107310721"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 435
		this.isIf3 = true; // L: 436
		this.type = var1.readUnsignedByte(); // L: 437
		this.contentType = var1.readUnsignedShort(); // L: 438
		this.rawX = var1.readShort(); // L: 439
		this.rawY = var1.readShort(); // L: 440
		this.rawWidth = var1.readUnsignedShort(); // L: 441
		if (this.type == 9) { // L: 442
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 443
		}

		this.widthAlignment = var1.readByte(); // L: 444
		this.heightAlignment = var1.readByte(); // L: 445
		this.xAlignment = var1.readByte(); // L: 446
		this.yAlignment = var1.readByte(); // L: 447
		this.parentId = var1.readUnsignedShort(); // L: 448
		if (this.parentId == 65535) { // L: 449
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 450
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 451
		if (this.type == 0) { // L: 452
			this.scrollWidth = var1.readUnsignedShort(); // L: 453
			this.scrollHeight = var1.readUnsignedShort(); // L: 454
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 455
		}

		if (this.type == 5) { // L: 457
			this.spriteId2 = var1.readInt(); // L: 458
			this.spriteAngle = var1.readUnsignedShort(); // L: 459
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 460
			this.transparencyTop = var1.readUnsignedByte(); // L: 461
			this.outline = var1.readUnsignedByte(); // L: 462
			this.spriteShadow = var1.readInt(); // L: 463
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 464
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 465
		}

		if (this.type == 6) { // L: 467
			this.modelType = 1; // L: 468
			this.modelId = var1.readUnsignedShort(); // L: 469
			if (this.modelId == 65535) { // L: 470
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 471
			this.modelOffsetY = var1.readShort(); // L: 472
			this.modelAngleX = var1.readUnsignedShort(); // L: 473
			this.modelAngleY = var1.readUnsignedShort(); // L: 474
			this.modelAngleZ = var1.readUnsignedShort(); // L: 475
			this.modelZoom = var1.readUnsignedShort(); // L: 476
			this.sequenceId = var1.readUnsignedShort(); // L: 477
			if (this.sequenceId == 65535) { // L: 478
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 479
			var1.readUnsignedShort(); // L: 480
			if (this.widthAlignment != 0) { // L: 481
				this.field3467 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 482
				var1.readUnsignedShort(); // L: 483
			}
		}

		if (this.type == 4) { // L: 486
			this.fontId = var1.readUnsignedShort(); // L: 487
			if (this.fontId == 65535) { // L: 488
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 489
			this.textLineHeight = var1.readUnsignedByte(); // L: 490
			this.textXAlignment = var1.readUnsignedByte(); // L: 491
			this.textYAlignment = var1.readUnsignedByte(); // L: 492
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 493
			this.color = var1.readInt(); // L: 494
		}

		if (this.type == 3) { // L: 496
			this.color = var1.readInt(); // L: 497
			this.fill = var1.readUnsignedByte() == 1; // L: 498
			this.transparencyTop = var1.readUnsignedByte(); // L: 499
		}

		if (this.type == 9) { // L: 501
			this.lineWid = var1.readUnsignedByte(); // L: 502
			this.color = var1.readInt(); // L: 503
			this.field3369 = var1.readUnsignedByte() == 1; // L: 504
		}

		this.flags = var1.readMedium(); // L: 506
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 507
		int var2 = var1.readUnsignedByte(); // L: 508
		if (var2 > 0) { // L: 509
			this.actions = new String[var2]; // L: 510

			for (int var3 = 0; var3 < var2; ++var3) { // L: 511
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 513
		this.dragThreshold = var1.readUnsignedByte(); // L: 514
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 515
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 516
		this.onLoad = this.readListener(var1); // L: 517
		this.onMouseOver = this.readListener(var1); // L: 518
		this.onMouseLeave = this.readListener(var1); // L: 519
		this.onTargetLeave = this.readListener(var1); // L: 520
		this.onTargetEnter = this.readListener(var1); // L: 521
		this.onVarTransmit = this.readListener(var1); // L: 522
		this.onInvTransmit = this.readListener(var1); // L: 523
		this.onStatTransmit = this.readListener(var1); // L: 524
		this.onTimer = this.readListener(var1); // L: 525
		this.onOp = this.readListener(var1); // L: 526
		this.onMouseRepeat = this.readListener(var1); // L: 527
		this.onClick = this.readListener(var1); // L: 528
		this.onClickRepeat = this.readListener(var1); // L: 529
		this.onRelease = this.readListener(var1); // L: 530
		this.onHold = this.readListener(var1); // L: 531
		this.onDrag = this.readListener(var1); // L: 532
		this.onDragComplete = this.readListener(var1); // L: 533
		this.onScroll = this.readListener(var1); // L: 534
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 535
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 536
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 537
	} // L: 538

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)[Ljava/lang/Object;",
		garbageValue = "117"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 541
		if (var2 == 0) { // L: 542
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 543

			for (int var4 = 0; var4 < var2; ++var4) { // L: 544
				int var5 = var1.readUnsignedByte(); // L: 545
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 546
				} else if (var5 == 1) { // L: 547
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 549
			return var3; // L: 550
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)[I",
		garbageValue = "-1"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 554
		if (var2 == 0) { // L: 555
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 556

			for (int var4 = 0; var4 < var2; ++var4) { // L: 557
				var3[var4] = var1.readInt(); // L: 558
			}

			return var3; // L: 560
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 564
		this.itemIds[var2] = this.itemIds[var1]; // L: 565
		this.itemIds[var1] = var3; // L: 566
		var3 = this.itemQuantities[var2]; // L: 567
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 568
		this.itemQuantities[var1] = var3; // L: 569
	} // L: 570

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZLck;B)Lqi;",
		garbageValue = "-6"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3411 = false; // L: 573
		if (this.field3487 != null) { // L: 574
			SpritePixels var3 = this.method5646(var2); // L: 575
			if (var3 != null) { // L: 576
				return var3; // L: 577
			}
		}

		int var7;
		if (var1) { // L: 581
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 582
		}

		if (var7 == -1) { // L: 583
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 584
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 585
			if (var6 != null) { // L: 586
				return var6;
			} else {
				var6 = class6.SpriteBuffer_getSprite(SoundCache.Widget_spritesArchive, var7, 0); // L: 587
				if (var6 == null) { // L: 588
					field3411 = true; // L: 589
					return null; // L: 590
				} else {
					this.method5611(var6); // L: 592
					Widget_cachedSprites.put(var6, var4); // L: 593
					return var6; // L: 594
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)Lqi;",
		garbageValue = "48"
	)
	SpritePixels method5646(UrlRequester var1) {
		if (!this.method5610()) { // L: 598
			return this.method5609(var1); // L: 599
		} else {
			String var2 = this.field3487 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 601
			SpritePixels var3 = (SpritePixels)field3332.method6601(var2); // L: 602
			if (var3 == null) { // L: 603
				SpritePixels var4 = this.method5609(var1); // L: 604
				if (var4 != null) { // L: 605
					var3 = var4.method8147(); // L: 606
					this.method5611(var3); // L: 607
					field3332.method6596(var2, var3); // L: 608
				}
			}

			return var3; // L: 611
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)Lqi;",
		garbageValue = "1"
	)
	SpritePixels method5609(UrlRequester var1) {
		if (this.field3487 != null && var1 != null) { // L: 615
			class291 var2 = (class291)field3389.method6601(this.field3487); // L: 616
			if (var2 == null) { // L: 617
				var2 = new class291(this.field3487, var1); // L: 618
				field3389.method6596(this.field3487, var2); // L: 619
			}

			return var2.method5563(); // L: 621
		} else {
			return null; // L: 623
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666597852"
	)
	boolean method5610() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 627
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "576149889"
	)
	void method5611(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 631
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 632
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 633
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 634
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 635
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 636
			var1.shadow(this.spriteShadow);
		}

	} // L: 637

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lmd;",
		garbageValue = "-1386663176"
	)
	@Export("getFont")
	public Font getFont() {
		field3411 = false; // L: 640
		if (this.fontId == -1) { // L: 641
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 642
			if (var1 != null) { // L: 643
				return var1;
			} else {
				var1 = class163.method3322(SoundCache.Widget_spritesArchive, class17.Widget_fontsArchive, this.fontId, 0); // L: 644
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 645
				} else {
					field3411 = true; // L: 646
				}

				return var1; // L: 647
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqi;",
		garbageValue = "7"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3411 = false; // L: 651
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 652
			int var2 = this.inventorySprites[var1]; // L: 653
			if (var2 == -1) { // L: 654
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 655
				if (var3 != null) { // L: 656
					return var3;
				} else {
					var3 = class6.SpriteBuffer_getSprite(SoundCache.Widget_spritesArchive, var2, 0); // L: 657
					if (var3 != null) { // L: 658
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3411 = true; // L: 659
					}

					return var3; // L: 660
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lgw;IZLkp;I)Liq;",
		garbageValue = "-1321759215"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3411 = false; // L: 664
		int var5;
		int var6;
		if (var3) { // L: 667
			var5 = this.modelType2; // L: 668
			var6 = this.modelId2; // L: 669
		} else {
			var5 = this.modelType; // L: 672
			var6 = this.modelId; // L: 673
		}

		if (var5 == 0) { // L: 675
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 676
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 677
			if (var7 == null) { // L: 678
				ModelData var8;
				if (var5 == 1) { // L: 680
					var8 = ModelData.ModelData_get(class162.Widget_modelsArchive, var6, 0); // L: 681
					if (var8 == null) { // L: 682
						field3411 = true; // L: 683
						return null; // L: 684
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 686
				}

				if (var5 == 2) { // L: 688
					var8 = KeyHandler.getNpcDefinition(var6).getModelData(); // L: 689
					if (var8 == null) { // L: 690
						field3411 = true; // L: 691
						return null; // L: 692
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 694
				}

				if (var5 == 3) { // L: 696
					if (var4 == null) { // L: 697
						return null;
					}

					var8 = var4.getModelData(); // L: 698
					if (var8 == null) { // L: 699
						field3411 = true; // L: 700
						return null; // L: 701
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 703
				}

				if (var5 == 4) { // L: 705
					ItemComposition var9 = class19.ItemDefinition_get(var6); // L: 706
					var8 = var9.getModelData(10); // L: 707
					if (var8 == null) { // L: 708
						field3411 = true; // L: 709
						return null; // L: 710
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 712
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 714
			}

			if (var1 != null) { // L: 716
				var7 = var1.transformWidgetModel(var7, var2); // L: 717
			}

			return var7; // L: 719
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lki;",
		garbageValue = "2"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 723
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1883530769 * 781497615 : this.spriteId2 * 1275315819 * 43628099; // L: 724
		if (var2 == -1) { // L: 725
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 726
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 727
			if (var5 != null) { // L: 728
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 729
				if (var6 == null) { // L: 730
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 731
					int[] var8 = new int[var7.subHeight]; // L: 732
					int[] var9 = new int[var7.subHeight]; // L: 733

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 734
						int var11 = 0; // L: 735
						int var12 = var7.subWidth; // L: 736

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 737
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 738
								var11 = var13; // L: 739
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 743
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 744
								var12 = var13 + 1; // L: 745
								break;
							}
						}

						var8[var10] = var11; // L: 749
						var9[var10] = var12 - var11; // L: 750
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 752
					Widget_cachedSpriteMasks.put(var5, var3); // L: 753
					return var5; // L: 754
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-60"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 758
			String[] var3 = new String[var1 + 1]; // L: 759
			if (this.actions != null) { // L: 760
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 761
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 763
		}

		this.actions[var1] = var2; // L: 765
	} // L: 766

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-398525420"
	)
	public boolean method5617() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 769
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lck;J)V"
	)
	public void method5618(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 773
			var1.replaceAll("%userid%", Long.toString(var3)); // L: 774
			this.field3409 = new class155(); // L: 775
			if (!this.field3409.method3201(var1, var2)) { // L: 776
				this.field3409 = null; // L: 777
			} else {
				this.field3354 = new HashMap(); // L: 780
				this.field3412 = new HashMap(); // L: 781
			}
		}
	} // L: 778 782

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-459125487"
	)
	public void method5722(int var1, int var2) {
		if (this.type == 11 && this.field3354 != null) { // L: 785
			this.field3354.put(var1, var2); // L: 786
		}
	} // L: 787

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1957119277"
	)
	public void method5672(String var1, int var2) {
		if (this.type == 11 && this.field3412 != null) { // L: 790
			this.field3412.put(var1, var2); // L: 791
		}
	} // L: 792

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-22"
	)
	public boolean method5721(int var1, int var2) {
		if (this.type == 11 && this.field3409 != null && this.method5690()) { // L: 795
			int var3 = (int)(this.field3409.method3190()[0] * (float)this.width); // L: 796
			int var4 = (int)(this.field3409.method3190()[1] * (float)this.height); // L: 797
			int var5 = var3 + (int)(this.field3409.method3190()[2] * (float)this.width); // L: 798
			int var6 = var4 + (int)(this.field3409.method3190()[3] * (float)this.height); // L: 799
			return var1 >= var3 && var2 >= var4 && var1 < var5 && var2 < var6; // L: 800
		} else {
			return false;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "98"
	)
	public boolean method5690() {
		return this.field3410 == 2; // L: 804
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "9"
	)
	public int method5623(String var1) {
		return this.type == 11 && this.field3409 != null && this.method5690() ? this.field3409.method3189(var1) : -1; // L: 808 809 811
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "787247673"
	)
	public String method5624(String var1) {
		return this.type == 11 && this.field3409 != null && this.method5690() ? this.field3409.method3223(var1) : null; // L: 815 816
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1923228408"
	)
	public int method5625() {
		return this.field3412 != null && this.field3412.size() > 0 ? 1 : 0; // L: 820
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public int method5647() {
		if (this.type == 11 && this.field3409 != null && this.field3412 != null && !this.field3412.isEmpty()) { // L: 824
			String var1 = this.field3409.method3188(); // L: 825
			return var1 != null && this.field3412.containsKey(this.field3409.method3188()) ? (Integer)this.field3412.get(var1) : -1; // L: 826 827 829
		} else {
			return -1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-41"
	)
	public String method5627() {
		if (this.type == 11 && this.field3409 != null) { // L: 833
			String var1 = this.field3409.method3188(); // L: 834
			Iterator var2 = this.field3409.method3191().iterator(); // L: 835

			while (var2.hasNext()) {
				class166 var3 = (class166)var2.next(); // L: 836
				String var4 = String.format("%%%S%%", var3.method3336()); // L: 838
				if (var3.vmethod3341() == 0) { // L: 839
					var1.replaceAll(var4, Integer.toString(var3.vmethod3334())); // L: 840
				} else {
					var1.replaceAll(var4, var3.vmethod3333()); // L: 843
				}
			}

			return var1; // L: 847
		} else {
			return null; // L: 846
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "998374015"
	)
	public int[] method5628() {
		if (this.type == 11 && this.field3409 != null) { // L: 851
			int[] var1 = new int[3]; // L: 852
			int var2 = 0; // L: 853
			Iterator var3 = this.field3409.method3191().iterator(); // L: 854

			while (var3.hasNext()) {
				class166 var4 = (class166)var3.next(); // L: 855
				if (!var4.method3336().equals("user_id")) { // L: 857
					if (var4.vmethod3341() != 0) { // L: 858
						return null; // L: 865
					}

					var1[var2++] = var4.vmethod3334(); // L: 859
					if (var2 > 3) { // L: 860
						return null; // L: 861
					}
				}
			}

			return var1; // L: 870
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lck;I)Z",
		garbageValue = "-1463897993"
	)
	public boolean method5629(UrlRequester var1) {
		if (this.type == 11 && this.field3409 != null) { // L: 874
			this.field3409.method3184(var1); // L: 875
			if (this.field3409.method3230() != this.field3410) { // L: 876
				this.field3410 = this.field3409.method3230(); // L: 877
				if (this.field3410 >= 100) { // L: 878
					return false; // L: 879
				}

				if (this.field3410 == 2) { // L: 881
					this.method5701(); // L: 882
					return true; // L: 883
				}
			}

			return false; // L: 886
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1471555316"
	)
	void method5701() {
		this.noClickThrough = true; // L: 907
		ArrayList var1 = this.field3409.method3187(); // L: 908
		ArrayList var2 = this.field3409.method3229(); // L: 909
		int var3 = var1.size() + var2.size(); // L: 910
		this.children = new Widget[var3]; // L: 911
		int var4 = 0; // L: 912

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 913 920
			class160 var6 = (class160)var5.next(); // L: 914
			var7 = class83.method2111(5, this, var4, 0, 0, 0, 0, var6.field1735); // L: 916
			var7.field3487 = var6.field1737.method2554(); // L: 917
			class291 var8 = new class291(var6.field1737); // L: 918
			field3389.method6596(var7.field3487, var8); // L: 919
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 923 931
			class162 var9 = (class162)var5.next(); // L: 924
			var7 = class83.method2111(4, this, var4, 0, 0, 0, 0, var9.field1754); // L: 926
			var7.text = var9.field1758; // L: 927
			var7.fontId = (Integer)this.field3354.get(var9.field1752); // L: 928
			var7.textXAlignment = var9.field1755; // L: 929
			var7.textYAlignment = var9.field1756; // L: 930
		}

	} // L: 934

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-2380539"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 33
				if (var1 != null) { // L: 34
					var2 = class128.method2853(var1);
				}

				if (var0 != null) { // L: 35
					if (var1 != null) { // L: 36
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 37
				}

				System.out.println("Error: " + var2); // L: 39
				var2 = var2.replace(':', '.'); // L: 40
				var2 = var2.replace('@', '_'); // L: 41
				var2 = var2.replace('&', '_'); // L: 42
				var2 = var2.replace('#', '_'); // L: 43
				if (RunException.RunException_applet == null) { // L: 44
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + WorldMapRegion.clientType + "&e=" + var2); // L: 45
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 46
				var4.read(); // L: 47
				var4.close(); // L: 48
			} catch (Exception var5) { // L: 50
			}

		}
	} // L: 51

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIILhv;[Lgv;I)V",
		garbageValue = "-2111400483"
	)
	static final void method5681(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 266
		int var6 = -1; // L: 267

		while (true) {
			int var7 = var5.method7743(); // L: 269
			if (var7 == 0) { // L: 270
				return; // L: 294
			}

			var6 += var7; // L: 271
			int var8 = 0; // L: 272

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 274
				if (var9 == 0) { // L: 275
					break;
				}

				var8 += var9 - 1; // L: 276
				int var10 = var8 & 63; // L: 277
				int var11 = var8 >> 6 & 63; // L: 278
				int var12 = var8 >> 12; // L: 279
				int var13 = var5.readUnsignedByte(); // L: 280
				int var14 = var13 >> 2; // L: 281
				int var15 = var13 & 3; // L: 282
				int var16 = var11 + var1; // L: 283
				int var17 = var10 + var2; // L: 284
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 285
					int var18 = var12; // L: 286
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 287
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 288
					if (var18 >= 0) { // L: 289
						var19 = var4[var18];
					}

					WorldMapElement.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 290
				}
			}
		}
	}
}
