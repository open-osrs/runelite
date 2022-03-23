import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("u")
	static int[][] field3495;
	@ObfuscatedName("t")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static class361 field3388;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static class361 field3339;
	@ObfuscatedName("aw")
	public static boolean field3368;
	@ObfuscatedName("ar")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2073510769
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -241424449
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -305580981
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 316575905
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 931978387
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 168145407
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1353355369
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2100574927
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2097224197
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1713833669
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2083219921
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 397290189
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -553667537
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1525505925
	)
	@Export("x")
	public int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -246536175
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -646003077
	)
	@Export("width")
	public int width;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1323757205
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1760147361
	)
	public int field3359;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1431491597
	)
	public int field3360;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1448981285
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1148735313
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 122125457
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 519655973
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -4879553
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1118702575
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 402572965
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -753627881
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 657447847
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bd")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -374157533
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -32537097
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1832629109
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bb")
	public boolean field3491;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -234398187
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1599395709
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bx")
	public String field3386;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1957646801
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bi")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1878691133
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -512889241
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bn")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -250490489
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 393277933
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 621908161
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -35409701
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1320969547
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2046351265
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -230431727
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1064101877
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1053078933
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1123791315
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1378639755
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -867688381
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1683212549
	)
	public int field3398;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -507742713
	)
	public int field3399;
	@ObfuscatedName("cx")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cg")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1938208467
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1709783163
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cq")
	@Export("text")
	public String text;
	@ObfuscatedName("cf")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1518357985
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 135225825
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -2129783323
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ci")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1414679759
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -785857143
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ce")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dd")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("de")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dn")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	class155 field3476;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -743625073
	)
	int field3439;
	@ObfuscatedName("dk")
	HashMap field3418;
	@ObfuscatedName("dw")
	HashMap field3381;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1975625373
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dh")
	public boolean field3432;
	@ObfuscatedName("dm")
	public byte[][] field3422;
	@ObfuscatedName("dq")
	public byte[][] field3423;
	@ObfuscatedName("dy")
	public int[] field3424;
	@ObfuscatedName("di")
	public int[] field3425;
	@ObfuscatedName("du")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("da")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 253992415
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1843255509
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("db")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dt")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dl")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eu")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ee")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("em")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ec")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eb")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("er")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ei")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ed")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("eh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("en")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ex")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eo")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ev")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ek")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ez")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("el")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ep")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ey")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("es")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ej")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eg")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("et")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ew")
	public Object[] field3457;
	@ObfuscatedName("ea")
	public Object[] field3458;
	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fw")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fl")
	public Object[] field3395;
	@ObfuscatedName("fz")
	public Object[] field3461;
	@ObfuscatedName("fu")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fa")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ft")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fo")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fv")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fk")
	public Object[] field3468;
	@ObfuscatedName("fn")
	public Object[] field3408;
	@ObfuscatedName("fr")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ff")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 1262202449
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fc")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fs")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fb")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -82905401
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1170301129
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -97136633
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -531561985
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fm")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fp")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -1126667937
	)
	public int field3481;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 302132005
	)
	public int field3391;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1823882543
	)
	public int field3355;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 328128015
	)
	public int field3387;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1493505929
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -621080907
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gx")
	public int[] field3406;
	@ObfuscatedName("gz")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gu")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gg")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3388 = new class361(10, class359.field4222); // L: 56
		field3339 = new class361(10, class359.field4222); // L: 57
		field3368 = false; // L: 58
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
		this.field3359 = 1; // L: 77
		this.field3360 = 1; // L: 78
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
		this.field3491 = false; // L: 94
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
		this.field3398 = 0; // L: 116
		this.field3399 = 0; // L: 117
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
		this.field3439 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3432 = false; // L: 140
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
		this.field3481 = -1; // L: 208
		this.field3391 = 0; // L: 209
		this.field3355 = 0; // L: 210
		this.field3387 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-1306994469"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 277
		this.type = var1.readUnsignedByte(); // L: 278
		this.buttonType = var1.readUnsignedByte(); // L: 279
		this.contentType = var1.readUnsignedShort(); // L: 280
		this.rawX = var1.readShort(); // L: 281
		this.rawY = var1.readShort(); // L: 282
		this.rawWidth = var1.readUnsignedShort(); // L: 283
		this.rawHeight = var1.readUnsignedShort(); // L: 284
		this.transparencyTop = var1.readUnsignedByte(); // L: 285
		this.parentId = var1.readUnsignedShort(); // L: 286
		if (this.parentId == 65535) { // L: 287
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 288
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 289
		if (this.mouseOverRedirect == 65535) { // L: 290
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 291
		int var3;
		if (var2 > 0) { // L: 292
			this.cs1Comparisons = new int[var2]; // L: 293
			this.cs1ComparisonValues = new int[var2]; // L: 294

			for (var3 = 0; var3 < var2; ++var3) { // L: 295
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 296
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 297
			}
		}

		var3 = var1.readUnsignedByte(); // L: 300
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 301
			this.cs1Instructions = new int[var3][]; // L: 302

			for (var4 = 0; var4 < var3; ++var4) { // L: 303
				var5 = var1.readUnsignedShort(); // L: 304
				this.cs1Instructions[var4] = new int[var5]; // L: 305

				for (var6 = 0; var6 < var5; ++var6) { // L: 306
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 307
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 308
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 312
			this.scrollHeight = var1.readUnsignedShort(); // L: 313
			this.isHidden = var1.readUnsignedByte() == 1; // L: 314
		}

		if (this.type == 1) { // L: 316
			var1.readUnsignedShort(); // L: 317
			var1.readUnsignedByte(); // L: 318
		}

		if (this.type == 2) { // L: 320
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 321
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 322
			var4 = var1.readUnsignedByte(); // L: 323
			if (var4 == 1) { // L: 324
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 325
			if (var5 == 1) { // L: 326
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 327
			if (var6 == 1) { // L: 328
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 329
			if (var7 == 1) { // L: 330
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 331
			this.paddingY = var1.readUnsignedByte(); // L: 332
			this.inventoryXOffsets = new int[20]; // L: 333
			this.inventoryYOffsets = new int[20]; // L: 334
			this.inventorySprites = new int[20]; // L: 335

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 336
				int var11 = var1.readUnsignedByte(); // L: 337
				if (var11 == 1) { // L: 338
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 339
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 340
					this.inventorySprites[var8] = var1.readInt(); // L: 341
				} else {
					this.inventorySprites[var8] = -1; // L: 343
				}
			}

			this.itemActions = new String[5]; // L: 345

			for (var8 = 0; var8 < 5; ++var8) { // L: 346
				String var9 = var1.readStringCp1252NullTerminated(); // L: 347
				if (var9.length() > 0) { // L: 348
					this.itemActions[var8] = var9; // L: 349
					this.flags |= 1 << var8 + 23; // L: 350
				}
			}
		}

		if (this.type == 3) { // L: 354
			this.fill = var1.readUnsignedByte() == 1; // L: 355
		}

		if (this.type == 4 || this.type == 1) { // L: 357
			this.textXAlignment = var1.readUnsignedByte(); // L: 358
			this.textYAlignment = var1.readUnsignedByte(); // L: 359
			this.textLineHeight = var1.readUnsignedByte(); // L: 360
			this.fontId = var1.readUnsignedShort(); // L: 361
			if (this.fontId == 65535) { // L: 362
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 363
		}

		if (this.type == 4) { // L: 365
			this.text = var1.readStringCp1252NullTerminated(); // L: 366
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 367
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 369
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 370
			this.color2 = var1.readInt(); // L: 371
			this.mouseOverColor = var1.readInt(); // L: 372
			this.mouseOverColor2 = var1.readInt(); // L: 373
		}

		if (this.type == 5) { // L: 375
			this.spriteId2 = var1.readInt(); // L: 376
			this.spriteId = var1.readInt(); // L: 377
		}

		if (this.type == 6) { // L: 379
			this.modelType = 1; // L: 380
			this.modelId = var1.readUnsignedShort(); // L: 381
			if (this.modelId == 65535) { // L: 382
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 383
			this.modelId2 = var1.readUnsignedShort(); // L: 384
			if (this.modelId2 == 65535) { // L: 385
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 386
			if (this.sequenceId == 65535) { // L: 387
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 388
			if (this.sequenceId2 == 65535) { // L: 389
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 390
			this.modelAngleX = var1.readUnsignedShort(); // L: 391
			this.modelAngleY = var1.readUnsignedShort(); // L: 392
		}

		if (this.type == 7) { // L: 394
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 395
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 396
			this.textXAlignment = var1.readUnsignedByte(); // L: 397
			this.fontId = var1.readUnsignedShort(); // L: 398
			if (this.fontId == 65535) { // L: 399
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 400
			this.color = var1.readInt(); // L: 401
			this.paddingX = var1.readShort(); // L: 402
			this.paddingY = var1.readShort(); // L: 403
			var4 = var1.readUnsignedByte(); // L: 404
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 405
			}

			this.itemActions = new String[5]; // L: 406

			for (var5 = 0; var5 < 5; ++var5) { // L: 407
				String var10 = var1.readStringCp1252NullTerminated(); // L: 408
				if (var10.length() > 0) { // L: 409
					this.itemActions[var5] = var10; // L: 410
					this.flags |= 1 << var5 + 23; // L: 411
				}
			}
		}

		if (this.type == 8) { // L: 415
			this.text = var1.readStringCp1252NullTerminated(); // L: 416
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 418
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 419
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 420
			var4 = var1.readUnsignedShort() & 63; // L: 421
			this.flags |= var4 << 11; // L: 422
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 424
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 425
			if (this.buttonText.length() == 0) { // L: 426
				if (this.buttonType == 1) { // L: 427
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 428
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 429
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 430
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 433
			this.flags |= 4194304; // L: 434
		}

		if (this.buttonType == 6) { // L: 436
			this.flags |= 1; // L: 437
		}

	} // L: 439

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "108"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 442
		this.isIf3 = true; // L: 443
		this.type = var1.readUnsignedByte(); // L: 444
		this.contentType = var1.readUnsignedShort(); // L: 445
		this.rawX = var1.readShort(); // L: 446
		this.rawY = var1.readShort(); // L: 447
		this.rawWidth = var1.readUnsignedShort(); // L: 448
		if (this.type == 9) { // L: 449
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 450
		}

		this.widthAlignment = var1.readByte(); // L: 451
		this.heightAlignment = var1.readByte(); // L: 452
		this.xAlignment = var1.readByte(); // L: 453
		this.yAlignment = var1.readByte(); // L: 454
		this.parentId = var1.readUnsignedShort(); // L: 455
		if (this.parentId == 65535) { // L: 456
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 457
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 458
		if (this.type == 0) { // L: 459
			this.scrollWidth = var1.readUnsignedShort(); // L: 460
			this.scrollHeight = var1.readUnsignedShort(); // L: 461
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 462
		}

		if (this.type == 5) { // L: 464
			this.spriteId2 = var1.readInt(); // L: 465
			this.spriteAngle = var1.readUnsignedShort(); // L: 466
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 467
			this.transparencyTop = var1.readUnsignedByte(); // L: 468
			this.outline = var1.readUnsignedByte(); // L: 469
			this.spriteShadow = var1.readInt(); // L: 470
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 471
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 472
		}

		if (this.type == 6) { // L: 474
			this.modelType = 1; // L: 475
			this.modelId = var1.readUnsignedShort(); // L: 476
			if (this.modelId == 65535) { // L: 477
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 478
			this.modelOffsetY = var1.readShort(); // L: 479
			this.modelAngleX = var1.readUnsignedShort(); // L: 480
			this.modelAngleY = var1.readUnsignedShort(); // L: 481
			this.modelAngleZ = var1.readUnsignedShort(); // L: 482
			this.modelZoom = var1.readUnsignedShort(); // L: 483
			this.sequenceId = var1.readUnsignedShort(); // L: 484
			if (this.sequenceId == 65535) { // L: 485
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 486
			var1.readUnsignedShort(); // L: 487
			if (this.widthAlignment != 0) { // L: 488
				this.field3398 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 489
				var1.readUnsignedShort(); // L: 490
			}
		}

		if (this.type == 4) { // L: 493
			this.fontId = var1.readUnsignedShort(); // L: 494
			if (this.fontId == 65535) { // L: 495
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 496
			this.textLineHeight = var1.readUnsignedByte(); // L: 497
			this.textXAlignment = var1.readUnsignedByte(); // L: 498
			this.textYAlignment = var1.readUnsignedByte(); // L: 499
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 500
			this.color = var1.readInt(); // L: 501
		}

		if (this.type == 3) { // L: 503
			this.color = var1.readInt(); // L: 504
			this.fill = var1.readUnsignedByte() == 1; // L: 505
			this.transparencyTop = var1.readUnsignedByte(); // L: 506
		}

		if (this.type == 9) { // L: 508
			this.lineWid = var1.readUnsignedByte(); // L: 509
			this.color = var1.readInt(); // L: 510
			this.field3491 = var1.readUnsignedByte() == 1; // L: 511
		}

		this.flags = var1.readMedium(); // L: 513
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 514
		int var2 = var1.readUnsignedByte(); // L: 515
		if (var2 > 0) { // L: 516
			this.actions = new String[var2]; // L: 517

			for (int var3 = 0; var3 < var2; ++var3) { // L: 518
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 520
		this.dragThreshold = var1.readUnsignedByte(); // L: 521
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 522
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 523
		this.onLoad = this.readListener(var1); // L: 524
		this.onMouseOver = this.readListener(var1); // L: 525
		this.onMouseLeave = this.readListener(var1); // L: 526
		this.onTargetLeave = this.readListener(var1); // L: 527
		this.onTargetEnter = this.readListener(var1); // L: 528
		this.onVarTransmit = this.readListener(var1); // L: 529
		this.onInvTransmit = this.readListener(var1); // L: 530
		this.onStatTransmit = this.readListener(var1); // L: 531
		this.onTimer = this.readListener(var1); // L: 532
		this.onOp = this.readListener(var1); // L: 533
		this.onMouseRepeat = this.readListener(var1); // L: 534
		this.onClick = this.readListener(var1); // L: 535
		this.onClickRepeat = this.readListener(var1); // L: 536
		this.onRelease = this.readListener(var1); // L: 537
		this.onHold = this.readListener(var1); // L: 538
		this.onDrag = this.readListener(var1); // L: 539
		this.onDragComplete = this.readListener(var1); // L: 540
		this.onScroll = this.readListener(var1); // L: 541
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 542
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 543
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 544
	} // L: 545

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)[Ljava/lang/Object;",
		garbageValue = "67"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 548
		if (var2 == 0) { // L: 549
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 550

			for (int var4 = 0; var4 < var2; ++var4) { // L: 551
				int var5 = var1.readUnsignedByte(); // L: 552
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 553
				} else if (var5 == 1) { // L: 554
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 556
			return var3; // L: 557
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)[I",
		garbageValue = "-1157160948"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 561
		if (var2 == 0) { // L: 562
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 563

			for (int var4 = 0; var4 < var2; ++var4) { // L: 564
				var3[var4] = var1.readInt(); // L: 565
			}

			return var3; // L: 567
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-85"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 571
		this.itemIds[var2] = this.itemIds[var1]; // L: 572
		this.itemIds[var1] = var3; // L: 573
		var3 = this.itemQuantities[var2]; // L: 574
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 575
		this.itemQuantities[var1] = var3; // L: 576
	} // L: 577

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZLci;B)Lql;",
		garbageValue = "76"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3368 = false; // L: 580
		if (this.field3386 != null) { // L: 581
			SpritePixels var3 = this.method5628(var2); // L: 582
			if (var3 != null) { // L: 583
				return var3; // L: 584
			}
		}

		int var7;
		if (var1) { // L: 588
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 589
		}

		if (var7 == -1) { // L: 590
			return null;
		} else {
			long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var7 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 591
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 592
			if (var6 != null) { // L: 593
				return var6;
			} else {
				var6 = InterfaceParent.SpriteBuffer_getSprite(WorldMapLabel.Widget_spritesArchive, var7, 0); // L: 594
				if (var6 == null) { // L: 595
					field3368 = true; // L: 596
					return null; // L: 597
				} else {
					this.method5684(var6); // L: 599
					Widget_cachedSprites.put(var6, var4); // L: 600
					return var6; // L: 601
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)Lql;",
		garbageValue = "1697043029"
	)
	SpritePixels method5628(UrlRequester var1) {
		if (!this.method5633()) { // L: 605
			return this.method5621(var1); // L: 606
		} else {
			String var2 = this.field3386 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 608
			SpritePixels var3 = (SpritePixels)field3339.method6639(var2); // L: 609
			if (var3 == null) { // L: 610
				SpritePixels var4 = this.method5621(var1); // L: 611
				if (var4 != null) { // L: 612
					var3 = var4.method8177(); // L: 613
					this.method5684(var3); // L: 614
					field3339.method6640(var2, var3); // L: 615
				}
			}

			return var3; // L: 618
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)Lql;",
		garbageValue = "-895601509"
	)
	SpritePixels method5621(UrlRequester var1) {
		if (this.field3386 != null && var1 != null) { // L: 622
			class291 var2 = (class291)field3388.method6639(this.field3386); // L: 623
			if (var2 == null) { // L: 624
				var2 = new class291(this.field3386, var1); // L: 625
				field3388.method6640(this.field3386, var2); // L: 626
			}

			return var2.method5586(); // L: 628
		} else {
			return null; // L: 630
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1970852021"
	)
	boolean method5633() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 634
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)V",
		garbageValue = "705719056"
	)
	void method5684(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 638
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 639
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 640
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 641
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 642
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 643
			var1.shadow(this.spriteShadow);
		}

	} // L: 644

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1011074356"
	)
	@Export("getFont")
	public Font getFont() {
		field3368 = false; // L: 647
		if (this.fontId == -1) { // L: 648
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 649
			if (var1 != null) { // L: 650
				return var1;
			} else {
				var1 = class19.method319(WorldMapLabel.Widget_spritesArchive, Client.Widget_fontsArchive, this.fontId, 0); // L: 651
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 652
				} else {
					field3368 = true; // L: 653
				}

				return var1; // L: 654
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lql;",
		garbageValue = "1100651857"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3368 = false; // L: 658
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 659
			int var2 = this.inventorySprites[var1]; // L: 660
			if (var2 == -1) { // L: 661
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 662
				if (var3 != null) { // L: 663
					return var3;
				} else {
					var3 = InterfaceParent.SpriteBuffer_getSprite(WorldMapLabel.Widget_spritesArchive, var2, 0); // L: 664
					if (var3 != null) { // L: 665
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3368 = true; // L: 666
					}

					return var3; // L: 667
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IZLkq;B)Lhx;",
		garbageValue = "0"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3368 = false; // L: 671
		int var5;
		int var6;
		if (var3) { // L: 674
			var5 = this.modelType2; // L: 675
			var6 = this.modelId2; // L: 676
		} else {
			var5 = this.modelType; // L: 679
			var6 = this.modelId; // L: 680
		}

		if (var5 == 0) { // L: 682
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 683
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 684
			if (var7 == null) { // L: 685
				ModelData var8;
				if (var5 == 1) { // L: 687
					var8 = ModelData.ModelData_get(BoundaryObject.Widget_modelsArchive, var6, 0); // L: 688
					if (var8 == null) { // L: 689
						field3368 = true; // L: 690
						return null; // L: 691
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 693
				}

				if (var5 == 2) { // L: 695
					var8 = class9.getNpcDefinition(var6).getModelData(); // L: 696
					if (var8 == null) { // L: 697
						field3368 = true; // L: 698
						return null; // L: 699
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 701
				}

				if (var5 == 3) { // L: 703
					if (var4 == null) { // L: 704
						return null;
					}

					var8 = var4.getModelData(); // L: 705
					if (var8 == null) { // L: 706
						field3368 = true; // L: 707
						return null; // L: 708
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 710
				}

				if (var5 == 4) { // L: 712
					ItemComposition var9 = class67.ItemDefinition_get(var6); // L: 713
					var8 = var9.getModelData(10); // L: 714
					if (var8 == null) { // L: 715
						field3368 = true; // L: 716
						return null; // L: 717
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 719
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 721
			}

			if (var1 != null) { // L: 723
				var7 = var1.transformWidgetModel(var7, var2); // L: 724
			}

			return var7; // L: 726
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkw;",
		garbageValue = "-1173151994"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 730
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1599395709 * 1203004971 : this.spriteId2 * -234398187 * 1912504637; // L: 731
		if (var2 == -1) { // L: 732
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 733
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 734
			if (var5 != null) { // L: 735
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 736
				if (var6 == null) { // L: 737
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 738
					int[] var8 = new int[var7.subHeight]; // L: 739
					int[] var9 = new int[var7.subHeight]; // L: 740

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 741
						int var11 = 0; // L: 742
						int var12 = var7.subWidth; // L: 743

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 744
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 745
								var11 = var13; // L: 746
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 750
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 751
								var12 = var13 + 1; // L: 752
								break;
							}
						}

						var8[var10] = var11; // L: 756
						var9[var10] = var12 - var11; // L: 757
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 759
					Widget_cachedSpriteMasks.put(var5, var3); // L: 760
					return var5; // L: 761
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1364336092"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 765
			String[] var3 = new String[var1 + 1]; // L: 766
			if (this.actions != null) { // L: 767
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 768
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 770
		}

		this.actions[var1] = var2; // L: 772
	} // L: 773

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	public boolean method5637() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 776
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lci;J)V"
	)
	public void method5720(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 780
			var1.replaceAll("%userid%", Long.toString(var3)); // L: 781
			this.field3476 = new class155(); // L: 782
			if (!this.field3476.method3131(var1, var2)) { // L: 783
				this.field3476 = null; // L: 784
			} else {
				this.field3418 = new HashMap(); // L: 787
				this.field3381 = new HashMap(); // L: 788
			}
		}
	} // L: 785 789

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "936361700"
	)
	public void method5639(int var1, int var2) {
		if (this.type == 11 && this.field3418 != null) { // L: 792
			this.field3418.put(var1, var2); // L: 793
		}
	} // L: 794

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-426288266"
	)
	public void method5682(String var1, int var2) {
		if (this.type == 11 && this.field3381 != null) { // L: 797
			this.field3381.put(var1, var2); // L: 798
		}
	} // L: 799

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public boolean method5623(int var1, int var2) {
		if (this.type == 11 && this.field3476 != null && this.method5642()) { // L: 802
			int var3 = (int)(this.field3476.method3146()[0] * (float)this.width); // L: 803
			int var4 = (int)(this.field3476.method3146()[1] * (float)this.height); // L: 804
			int var5 = var3 + (int)(this.field3476.method3146()[2] * (float)this.width); // L: 805
			int var6 = var4 + (int)(this.field3476.method3146()[3] * (float)this.height); // L: 806
			return var1 >= var3 && var2 >= var4 && var1 < var5 && var2 < var6; // L: 807
		} else {
			return false;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1389898904"
	)
	public boolean method5642() {
		return this.field3439 == 2; // L: 811
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-942824800"
	)
	public int method5663(String var1) {
		return this.type == 11 && this.field3476 != null && this.method5642() ? this.field3476.method3134(var1) : -1; // L: 815 816 818
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1042520697"
	)
	public String method5666(String var1) {
		return this.type == 11 && this.field3476 != null && this.method5642() ? this.field3476.method3144(var1) : null; // L: 822 823
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2025421912"
	)
	public int method5656() {
		return this.field3381 != null && this.field3381.size() > 0 ? 1 : 0; // L: 827
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3071"
	)
	public int method5699() {
		if (this.type == 11 && this.field3476 != null && this.field3381 != null && !this.field3381.isEmpty()) { // L: 831
			String var1 = this.field3476.method3138(); // L: 832
			return var1 != null && this.field3381.containsKey(this.field3476.method3138()) ? (Integer)this.field3381.get(var1) : -1; // L: 833 834 836
		} else {
			return -1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1508958413"
	)
	public String method5647() {
		if (this.type == 11 && this.field3476 != null) { // L: 840
			String var1 = this.field3476.method3138(); // L: 841
			Iterator var2 = this.field3476.method3140().iterator(); // L: 842

			while (var2.hasNext()) {
				class166 var3 = (class166)var2.next(); // L: 843
				String var4 = String.format("%%%S%%", var3.method3295()); // L: 845
				if (var3.vmethod3297() == 0) { // L: 846
					var1.replaceAll(var4, Integer.toString(var3.vmethod3299())); // L: 847
				} else {
					var1.replaceAll(var4, var3.vmethod3296()); // L: 850
				}
			}

			return var1; // L: 854
		} else {
			return null; // L: 853
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1363848757"
	)
	public int[] method5686() {
		if (this.type == 11 && this.field3476 != null) { // L: 858
			int[] var1 = new int[3]; // L: 859
			int var2 = 0; // L: 860
			Iterator var3 = this.field3476.method3140().iterator(); // L: 861

			while (var3.hasNext()) { // L: 876
				class166 var4 = (class166)var3.next(); // L: 862
				if (!var4.method3295().equals("user_id")) { // L: 864
					if (var4.vmethod3297() != 0) { // L: 865
						return null; // L: 872
					}

					var1[var2++] = var4.vmethod3299(); // L: 866
					if (var2 > 3) { // L: 867
						return null; // L: 868
					}
				}
			}

			return var1; // L: 877
		} else {
			return null;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)Z",
		garbageValue = "-715123605"
	)
	public boolean method5694(UrlRequester var1) {
		if (this.type == 11 && this.field3476 != null) { // L: 881
			this.field3476.method3165(var1); // L: 882
			if (this.field3476.method3141() != this.field3439) { // L: 883
				this.field3439 = this.field3476.method3141(); // L: 884
				if (this.field3439 >= 100) { // L: 885
					return false; // L: 886
				}

				if (this.field3439 == 2) { // L: 888
					this.method5640(); // L: 889
					return true; // L: 890
				}
			}

			return false; // L: 893
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1643593972"
	)
	void method5640() {
		this.noClickThrough = true; // L: 914
		ArrayList var1 = this.field3476.method3130(); // L: 915
		ArrayList var2 = this.field3476.method3137(); // L: 916
		int var3 = var1.size() + var2.size(); // L: 917
		this.children = new Widget[var3]; // L: 918
		int var4 = 0; // L: 919

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 920 927
			class160 var6 = (class160)var5.next(); // L: 921
			var7 = class146.method3043(5, this, var4, 0, 0, 0, 0, var6.field1748); // L: 923
			var7.field3386 = var6.field1749.method2546(); // L: 924
			class291 var8 = new class291(var6.field1749); // L: 925
			field3388.method6640(var7.field3386, var8); // L: 926
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 930 938
			class162 var9 = (class162)var5.next(); // L: 931
			var7 = class146.method3043(4, this, var4, 0, 0, 0, 0, var9.field1769); // L: 933
			var7.text = var9.field1771; // L: 934
			var7.fontId = (Integer)this.field3418.get(var9.field1772); // L: 935
			var7.textXAlignment = var9.field1770; // L: 936
			var7.textYAlignment = var9.field1776; // L: 937
		}

	} // L: 941
}
