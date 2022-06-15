import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static EvictingDualNodeHashTable field3360;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static EvictingDualNodeHashTable field3361;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("archive0")
	public static EvictingDualNodeHashTable archive0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("archive1")
	public static EvictingDualNodeHashTable archive1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	static class361 field3364;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	static class361 field3434;
	@ObfuscatedName("ap")
	public static boolean field3366;
	@ObfuscatedName("ac")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1038587213
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 9919479
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1118126063
	)
	@Export("type")
	public int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 415919075
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -862979207
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1309107069
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1417249065
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 273105613
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1091004413
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1898110743
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1869502249
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1783254653
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1196896537
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1812498029
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2082347123
	)
	@Export("y")
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2092161229
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 236010991
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1874017121
	)
	public int field3385;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -172663443
	)
	public int field3386;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 838621367
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -493284763
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1748495919
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1791635595
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1042306339
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1451576805
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 188440311
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2054568339
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -20212915
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bv")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1829670381
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1998673549
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 836809511
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bb")
	public boolean field3402;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1629333209
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1981513631
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bw")
	public String field3405;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1810600515
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1694605707
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -85393371
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("by")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bj")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -995090603
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1782143991
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1290197811
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 656981263
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 2070609235
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -256587501
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1012716483
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -572856693
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 477045813
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1709788917
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 318324183
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2138854643
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 257878607
	)
	public int field3424;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -408566491
	)
	public int field3373;
	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cz")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1937000389
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 113073421
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cy")
	@Export("text")
	public String text;
	@ObfuscatedName("ca")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -743795135
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1036288673
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -933475705
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cd")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1948142259
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1944775287
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ch")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dm")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dd")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dz")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	class155 field3483;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1506293413
	)
	int field3443;
	@ObfuscatedName("dy")
	HashMap field3403;
	@ObfuscatedName("ds")
	HashMap field3415;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -2070315127
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dx")
	public boolean field3498;
	@ObfuscatedName("dl")
	public byte[][] field3448;
	@ObfuscatedName("dc")
	public byte[][] field3406;
	@ObfuscatedName("dn")
	public int[] field3450;
	@ObfuscatedName("do")
	public int[] field3451;
	@ObfuscatedName("da")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("df")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 457867783
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1514522147
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("db")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("de")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ew")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ej")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("eb")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ez")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eg")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ea")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ed")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("eq")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("en")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ei")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ec")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eh")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ek")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("el")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("eu")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ep")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("em")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ex")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ey")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ev")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ee")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ef")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("er")
	public Object[] field3516;
	@ObfuscatedName("et")
	public Object[] field3513;
	@ObfuscatedName("es")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fr")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fz")
	public Object[] field3365;
	@ObfuscatedName("fh")
	public Object[] field3353;
	@ObfuscatedName("fw")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fb")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fn")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fl")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ff")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fm")
	public Object[] field3494;
	@ObfuscatedName("fo")
	public Object[] field3495;
	@ObfuscatedName("fv")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fy")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fc")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1995877883
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fa")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fg")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fi")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fe")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 402623915
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 1163106397
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -433476253
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1260061199
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fx")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fd")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -991745953
	)
	public int field3426;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1109857383
	)
	public int field3512;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -666577749
	)
	public int field3367;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -6385865
	)
	public int field3514;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 1568734049
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 426616237
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gs")
	public int[] field3517;
	@ObfuscatedName("gp")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gv")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3360 = new EvictingDualNodeHashTable(200); // L: 52
		field3361 = new EvictingDualNodeHashTable(50); // L: 53
		archive0 = new EvictingDualNodeHashTable(20); // L: 54
		archive1 = new EvictingDualNodeHashTable(8); // L: 55
		field3364 = new class361(10, class359.field4260); // L: 56
		field3434 = new class361(10, class359.field4260); // L: 57
		field3366 = false; // L: 58
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
		this.field3385 = 1; // L: 77
		this.field3386 = 1; // L: 78
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
		this.field3402 = false; // L: 94
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
		this.field3424 = 0; // L: 116
		this.field3373 = 0; // L: 117
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
		this.field3443 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3498 = false; // L: 140
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
		this.field3426 = -1; // L: 208
		this.field3512 = 0; // L: 209
		this.field3367 = 0; // L: 210
		this.field3514 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-47"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 261
		this.type = var1.readUnsignedByte(); // L: 262
		this.buttonType = var1.readUnsignedByte(); // L: 263
		this.contentType = var1.readUnsignedShort(); // L: 264
		this.rawX = var1.readShort(); // L: 265
		this.rawY = var1.readShort(); // L: 266
		this.rawWidth = var1.readUnsignedShort(); // L: 267
		this.rawHeight = var1.readUnsignedShort(); // L: 268
		this.transparencyTop = var1.readUnsignedByte(); // L: 269
		this.parentId = var1.readUnsignedShort(); // L: 270
		if (this.parentId == 65535) { // L: 271
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 272
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 273
		if (this.mouseOverRedirect == 65535) { // L: 274
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 275
		int var3;
		if (var2 > 0) { // L: 276
			this.cs1Comparisons = new int[var2]; // L: 277
			this.cs1ComparisonValues = new int[var2]; // L: 278

			for (var3 = 0; var3 < var2; ++var3) { // L: 279
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 280
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 281
			}
		}

		var3 = var1.readUnsignedByte(); // L: 284
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 285
			this.cs1Instructions = new int[var3][]; // L: 286

			for (var4 = 0; var4 < var3; ++var4) { // L: 287
				var5 = var1.readUnsignedShort(); // L: 288
				this.cs1Instructions[var4] = new int[var5]; // L: 289

				for (var6 = 0; var6 < var5; ++var6) { // L: 290
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 291
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 292
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 296
			this.scrollHeight = var1.readUnsignedShort(); // L: 297
			this.isHidden = var1.readUnsignedByte() == 1; // L: 298
		}

		if (this.type == 1) { // L: 300
			var1.readUnsignedShort(); // L: 301
			var1.readUnsignedByte(); // L: 302
		}

		if (this.type == 2) { // L: 304
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 305
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 306
			var4 = var1.readUnsignedByte(); // L: 307
			if (var4 == 1) { // L: 308
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 309
			if (var5 == 1) { // L: 310
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 311
			if (var6 == 1) { // L: 312
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 313
			if (var7 == 1) { // L: 314
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 315
			this.paddingY = var1.readUnsignedByte(); // L: 316
			this.inventoryXOffsets = new int[20]; // L: 317
			this.inventoryYOffsets = new int[20]; // L: 318
			this.inventorySprites = new int[20]; // L: 319

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 320
				int var11 = var1.readUnsignedByte(); // L: 321
				if (var11 == 1) { // L: 322
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 323
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 324
					this.inventorySprites[var8] = var1.readInt(); // L: 325
				} else {
					this.inventorySprites[var8] = -1; // L: 327
				}
			}

			this.itemActions = new String[5]; // L: 329

			for (var8 = 0; var8 < 5; ++var8) { // L: 330
				String var9 = var1.readStringCp1252NullTerminated(); // L: 331
				if (var9.length() > 0) { // L: 332
					this.itemActions[var8] = var9; // L: 333
					this.flags |= 1 << var8 + 23; // L: 334
				}
			}
		}

		if (this.type == 3) { // L: 338
			this.fill = var1.readUnsignedByte() == 1; // L: 339
		}

		if (this.type == 4 || this.type == 1) { // L: 341
			this.textXAlignment = var1.readUnsignedByte(); // L: 342
			this.textYAlignment = var1.readUnsignedByte(); // L: 343
			this.textLineHeight = var1.readUnsignedByte(); // L: 344
			this.fontId = var1.readUnsignedShort(); // L: 345
			if (this.fontId == 65535) { // L: 346
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 347
		}

		if (this.type == 4) { // L: 349
			this.text = var1.readStringCp1252NullTerminated(); // L: 350
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 351
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 353
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 354
			this.color2 = var1.readInt(); // L: 355
			this.mouseOverColor = var1.readInt(); // L: 356
			this.mouseOverColor2 = var1.readInt(); // L: 357
		}

		if (this.type == 5) { // L: 359
			this.spriteId2 = var1.readInt(); // L: 360
			this.spriteId = var1.readInt(); // L: 361
		}

		if (this.type == 6) { // L: 363
			this.modelType = 1; // L: 364
			this.modelId = var1.readUnsignedShort(); // L: 365
			if (this.modelId == 65535) { // L: 366
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 367
			this.modelId2 = var1.readUnsignedShort(); // L: 368
			if (this.modelId2 == 65535) { // L: 369
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 370
			if (this.sequenceId == 65535) { // L: 371
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 372
			if (this.sequenceId2 == 65535) { // L: 373
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 374
			this.modelAngleX = var1.readUnsignedShort(); // L: 375
			this.modelAngleY = var1.readUnsignedShort(); // L: 376
		}

		if (this.type == 7) { // L: 378
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 379
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 380
			this.textXAlignment = var1.readUnsignedByte(); // L: 381
			this.fontId = var1.readUnsignedShort(); // L: 382
			if (this.fontId == 65535) { // L: 383
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 384
			this.color = var1.readInt(); // L: 385
			this.paddingX = var1.readShort(); // L: 386
			this.paddingY = var1.readShort(); // L: 387
			var4 = var1.readUnsignedByte(); // L: 388
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 389
			}

			this.itemActions = new String[5]; // L: 390

			for (var5 = 0; var5 < 5; ++var5) { // L: 391
				String var10 = var1.readStringCp1252NullTerminated(); // L: 392
				if (var10.length() > 0) { // L: 393
					this.itemActions[var5] = var10; // L: 394
					this.flags |= 1 << var5 + 23; // L: 395
				}
			}
		}

		if (this.type == 8) { // L: 399
			this.text = var1.readStringCp1252NullTerminated(); // L: 400
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 402
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 403
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 404
			var4 = var1.readUnsignedShort() & 63; // L: 405
			this.flags |= var4 << 11; // L: 406
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 408
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 409
			if (this.buttonText.length() == 0) { // L: 410
				if (this.buttonType == 1) { // L: 411
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 412
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 413
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 414
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 417
			this.flags |= 4194304; // L: 418
		}

		if (this.buttonType == 6) { // L: 420
			this.flags |= 1; // L: 421
		}

	} // L: 423

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqt;S)V",
		garbageValue = "18120"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 426
		this.isIf3 = true; // L: 427
		this.type = var1.readUnsignedByte(); // L: 428
		this.contentType = var1.readUnsignedShort(); // L: 429
		this.rawX = var1.readShort(); // L: 430
		this.rawY = var1.readShort(); // L: 431
		this.rawWidth = var1.readUnsignedShort(); // L: 432
		if (this.type == 9) { // L: 433
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 434
		}

		this.widthAlignment = var1.readByte(); // L: 435
		this.heightAlignment = var1.readByte(); // L: 436
		this.xAlignment = var1.readByte(); // L: 437
		this.yAlignment = var1.readByte(); // L: 438
		this.parentId = var1.readUnsignedShort(); // L: 439
		if (this.parentId == 65535) { // L: 440
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 441
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 442
		if (this.type == 0) { // L: 443
			this.scrollWidth = var1.readUnsignedShort(); // L: 444
			this.scrollHeight = var1.readUnsignedShort(); // L: 445
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 446
		}

		if (this.type == 5) { // L: 448
			this.spriteId2 = var1.readInt(); // L: 449
			this.spriteAngle = var1.readUnsignedShort(); // L: 450
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 451
			this.transparencyTop = var1.readUnsignedByte(); // L: 452
			this.outline = var1.readUnsignedByte(); // L: 453
			this.spriteShadow = var1.readInt(); // L: 454
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 455
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 456
		}

		if (this.type == 6) { // L: 458
			this.modelType = 1; // L: 459
			this.modelId = var1.readUnsignedShort(); // L: 460
			if (this.modelId == 65535) { // L: 461
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 462
			this.modelOffsetY = var1.readShort(); // L: 463
			this.modelAngleX = var1.readUnsignedShort(); // L: 464
			this.modelAngleY = var1.readUnsignedShort(); // L: 465
			this.modelAngleZ = var1.readUnsignedShort(); // L: 466
			this.modelZoom = var1.readUnsignedShort(); // L: 467
			this.sequenceId = var1.readUnsignedShort(); // L: 468
			if (this.sequenceId == 65535) { // L: 469
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 470
			var1.readUnsignedShort(); // L: 471
			if (this.widthAlignment != 0) { // L: 472
				this.field3424 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 473
				var1.readUnsignedShort(); // L: 474
			}
		}

		if (this.type == 4) { // L: 477
			this.fontId = var1.readUnsignedShort(); // L: 478
			if (this.fontId == 65535) { // L: 479
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 480
			this.textLineHeight = var1.readUnsignedByte(); // L: 481
			this.textXAlignment = var1.readUnsignedByte(); // L: 482
			this.textYAlignment = var1.readUnsignedByte(); // L: 483
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 484
			this.color = var1.readInt(); // L: 485
		}

		if (this.type == 3) { // L: 487
			this.color = var1.readInt(); // L: 488
			this.fill = var1.readUnsignedByte() == 1; // L: 489
			this.transparencyTop = var1.readUnsignedByte(); // L: 490
		}

		if (this.type == 9) { // L: 492
			this.lineWid = var1.readUnsignedByte(); // L: 493
			this.color = var1.readInt(); // L: 494
			this.field3402 = var1.readUnsignedByte() == 1; // L: 495
		}

		this.flags = var1.readMedium(); // L: 497
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 498
		int var2 = var1.readUnsignedByte(); // L: 499
		if (var2 > 0) { // L: 500
			this.actions = new String[var2]; // L: 501

			for (int var3 = 0; var3 < var2; ++var3) { // L: 502
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 504
		this.dragThreshold = var1.readUnsignedByte(); // L: 505
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 506
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 507
		this.onLoad = this.readListener(var1); // L: 508
		this.onMouseOver = this.readListener(var1); // L: 509
		this.onMouseLeave = this.readListener(var1); // L: 510
		this.onTargetLeave = this.readListener(var1); // L: 511
		this.onTargetEnter = this.readListener(var1); // L: 512
		this.onVarTransmit = this.readListener(var1); // L: 513
		this.onInvTransmit = this.readListener(var1); // L: 514
		this.onStatTransmit = this.readListener(var1); // L: 515
		this.onTimer = this.readListener(var1); // L: 516
		this.onOp = this.readListener(var1); // L: 517
		this.onMouseRepeat = this.readListener(var1); // L: 518
		this.onClick = this.readListener(var1); // L: 519
		this.onClickRepeat = this.readListener(var1); // L: 520
		this.onRelease = this.readListener(var1); // L: 521
		this.onHold = this.readListener(var1); // L: 522
		this.onDrag = this.readListener(var1); // L: 523
		this.onDragComplete = this.readListener(var1); // L: 524
		this.onScroll = this.readListener(var1); // L: 525
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 526
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 527
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 528
	} // L: 529

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)[Ljava/lang/Object;",
		garbageValue = "109"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 532
		if (var2 == 0) { // L: 533
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 534

			for (int var4 = 0; var4 < var2; ++var4) { // L: 535
				int var5 = var1.readUnsignedByte(); // L: 536
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 537
				} else if (var5 == 1) { // L: 538
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 540
			return var3; // L: 541
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)[I",
		garbageValue = "-346146000"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 545
		if (var2 == 0) { // L: 546
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 547

			for (int var4 = 0; var4 < var2; ++var4) { // L: 548
				var3[var4] = var1.readInt(); // L: 549
			}

			return var3; // L: 551
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "39"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 555
		this.itemIds[var2] = this.itemIds[var1]; // L: 556
		this.itemIds[var1] = var3; // L: 557
		var3 = this.itemQuantities[var2]; // L: 558
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 559
		this.itemQuantities[var1] = var3; // L: 560
	} // L: 561

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZLcd;B)Lqe;",
		garbageValue = "84"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3366 = false; // L: 564
		if (this.field3405 != null) { // L: 565
			SpritePixels var3 = this.method5607(var2); // L: 566
			if (var3 != null) { // L: 567
				return var3; // L: 568
			}
		}

		int var7;
		if (var1) { // L: 572
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 573
		}

		if (var7 == -1) { // L: 574
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 575
			SpritePixels var6 = (SpritePixels)field3360.get(var4); // L: 576
			if (var6 != null) { // L: 577
				return var6;
			} else {
				var6 = class7.SpriteBuffer_getSprite(StructComposition.Widget_spritesArchive, var7, 0); // L: 578
				if (var6 == null) { // L: 579
					field3366 = true; // L: 580
					return null; // L: 581
				} else {
					this.method5699(var6); // L: 583
					field3360.put(var6, var4); // L: 584
					return var6; // L: 585
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)Lqe;",
		garbageValue = "1267758311"
	)
	SpritePixels method5607(UrlRequester var1) {
		if (!this.method5611()) { // L: 589
			return this.method5610(var1); // L: 590
		} else {
			String var2 = this.field3405 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 592
			SpritePixels var3 = (SpritePixels)field3434.method6538(var2); // L: 593
			if (var3 == null) { // L: 594
				SpritePixels var4 = this.method5610(var1); // L: 595
				if (var4 != null) { // L: 596
					var3 = var4.method8151(); // L: 597
					this.method5699(var3); // L: 598
					field3434.method6539(var2, var3); // L: 599
				}
			}

			return var3; // L: 602
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)Lqe;",
		garbageValue = "-1472222097"
	)
	SpritePixels method5610(UrlRequester var1) {
		if (this.field3405 != null && var1 != null) { // L: 606
			class290 var2 = (class290)field3364.method6538(this.field3405); // L: 607
			if (var2 == null) { // L: 608
				var2 = new class290(this.field3405, var1); // L: 609
				field3364.method6539(this.field3405, var2); // L: 610
			}

			return var2.method5562(); // L: 612
		} else {
			return null; // L: 614
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2722954"
	)
	boolean method5611() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 618
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V",
		garbageValue = "1165836984"
	)
	void method5699(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 622
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 623
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 624
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 625
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 626
		}

		if (this.spriteShadow != 0) { // L: 627
			var1.shadow(this.spriteShadow);
		}

	} // L: 628

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lmt;",
		garbageValue = "1724756527"
	)
	@Export("getFont")
	public Font getFont() {
		field3366 = false; // L: 631
		if (this.fontId == -1) { // L: 632
			return null;
		} else {
			Font var1 = (Font)archive0.get((long)this.fontId); // L: 633
			if (var1 != null) { // L: 634
				return var1;
			} else {
				AbstractArchive var3 = StructComposition.Widget_spritesArchive; // L: 636
				AbstractArchive var4 = MilliClock.Widget_fontsArchive; // L: 637
				int var5 = this.fontId; // L: 638
				Font var2;
				if (!Ignored.method6774(var3, var5, 0)) { // L: 640
					var2 = null; // L: 641
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 645
					Font var6;
					if (var7 == null) { // L: 647
						var6 = null; // L: 648
					} else {
						Font var8 = new Font(var7, class426.SpriteBuffer_xOffsets, class142.SpriteBuffer_yOffsets, class359.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, class13.SpriteBuffer_spritePalette, class421.SpriteBuffer_pixels); // L: 651
						class426.SpriteBuffer_xOffsets = null; // L: 653
						class142.SpriteBuffer_yOffsets = null; // L: 654
						class359.SpriteBuffer_spriteWidths = null; // L: 655
						class456.SpriteBuffer_spriteHeights = null; // L: 656
						class13.SpriteBuffer_spritePalette = null; // L: 657
						class421.SpriteBuffer_pixels = null; // L: 658
						var6 = var8; // L: 660
					}

					var2 = var6; // L: 662
				}

				if (var2 != null) { // L: 665
					archive0.put(var2, (long)this.fontId);
				} else {
					field3366 = true; // L: 666
				}

				return var2; // L: 667
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "1707735518"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3366 = false; // L: 671
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 672
			int var2 = this.inventorySprites[var1]; // L: 673
			if (var2 == -1) { // L: 674
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)field3360.get((long)var2); // L: 675
				if (var3 != null) { // L: 676
					return var3;
				} else {
					var3 = class7.SpriteBuffer_getSprite(StructComposition.Widget_spritesArchive, var2, 0); // L: 677
					if (var3 != null) { // L: 678
						field3360.put(var3, (long)var2);
					} else {
						field3366 = true; // L: 679
					}

					return var3; // L: 680
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IZLkt;S)Lhy;",
		garbageValue = "-28815"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3366 = false; // L: 684
		int var5;
		int var6;
		if (var3) { // L: 687
			var5 = this.modelType2; // L: 688
			var6 = this.modelId2; // L: 689
		} else {
			var5 = this.modelType; // L: 692
			var6 = this.modelId; // L: 693
		}

		if (var5 == 0) { // L: 695
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 696
			return null;
		} else {
			Model var7 = (Model)field3361.get((long)(var6 + (var5 << 16))); // L: 697
			if (var7 == null) { // L: 698
				ModelData var8;
				if (var5 == 1) { // L: 700
					var8 = ModelData.ModelData_get(class126.Widget_modelsArchive, var6, 0); // L: 701
					if (var8 == null) { // L: 702
						field3366 = true; // L: 703
						return null; // L: 704
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 706
				}

				if (var5 == 2) { // L: 708
					var8 = BuddyRankComparator.getNpcDefinition(var6).getModelData(); // L: 709
					if (var8 == null) { // L: 710
						field3366 = true; // L: 711
						return null; // L: 712
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 714
				}

				if (var5 == 3) { // L: 716
					if (var4 == null) { // L: 717
						return null;
					}

					var8 = var4.getModelData(); // L: 718
					if (var8 == null) { // L: 719
						field3366 = true; // L: 720
						return null; // L: 721
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 723
				}

				if (var5 == 4) { // L: 725
					ItemComposition var9 = EnumComposition.ItemDefinition_get(var6); // L: 726
					var8 = var9.getModelData(10); // L: 727
					if (var8 == null) { // L: 728
						field3366 = true; // L: 729
						return null; // L: 730
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 732
				}

				field3361.put(var7, (long)(var6 + (var5 << 16))); // L: 734
			}

			if (var1 != null) { // L: 736
				var7 = var1.transformWidgetModel(var7, var2); // L: 737
			}

			return var7; // L: 739
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lkp;",
		garbageValue = "11"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 743
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 1981513631 * -444474273 : this.spriteId2 * -1629333209 * -646609257; // L: 744
		if (var2 == -1) { // L: 745
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 746
			SpriteMask var5 = (SpriteMask)archive1.get(var3); // L: 747
			if (var5 != null) { // L: 748
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 749
				if (var6 == null) { // L: 750
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 751
					int[] var8 = new int[var7.subHeight]; // L: 752
					int[] var9 = new int[var7.subHeight]; // L: 753

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 754
						int var11 = 0; // L: 755
						int var12 = var7.subWidth; // L: 756

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 757
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 758
								var11 = var13; // L: 759
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 763
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 764
								var12 = var13 + 1; // L: 765
								break;
							}
						}

						var8[var10] = var11; // L: 769
						var9[var10] = var12 - var11; // L: 770
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 772
					archive1.put(var5, var3); // L: 773
					return var5; // L: 774
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-32"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 778
			String[] var3 = new String[var1 + 1]; // L: 779
			if (this.actions != null) { // L: 780
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 781
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 783
		}

		this.actions[var1] = var2; // L: 785
	} // L: 786

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-816942050"
	)
	public boolean method5618() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 789
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcd;J)V"
	)
	public void method5619(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 793
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 794
			this.field3483 = new class155(); // L: 795
			if (!this.field3483.method3174(var1, var2)) { // L: 796
				this.field3483 = null; // L: 797
			} else {
				if (this.field3403 == null || this.field3415 == null) { // L: 800
					this.method5668(); // L: 801
				}

			}
		}
	} // L: 798 803

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-443886653"
	)
	void method5668() {
		this.field3403 = new HashMap(); // L: 806
		this.field3415 = new HashMap(); // L: 807
	} // L: 808

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "7845"
	)
	public void method5621(int var1, int var2) {
		if (this.type == 11) { // L: 811
			if (this.field3403 == null) { // L: 812
				this.method5668();
			}

			this.field3403.put(var1, var2); // L: 813
		}
	} // L: 814

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "3"
	)
	public void method5622(String var1, int var2) {
		if (this.type == 11) { // L: 817
			if (this.field3415 == null) { // L: 818
				this.method5668();
			}

			this.field3415.put(var1, var2); // L: 819
		}
	} // L: 820

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1298089118"
	)
	public boolean method5623(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3483 != null && this.method5680()) { // L: 823
			var1 -= var3; // L: 824
			var2 -= var4; // L: 825
			int var5 = (int)(this.field3483.method3182()[0] * (float)this.width); // L: 826
			int var6 = (int)(this.field3483.method3182()[1] * (float)this.height); // L: 827
			int var7 = var5 + (int)(this.field3483.method3182()[2] * (float)this.width); // L: 828
			int var8 = var6 + (int)(this.field3483.method3182()[3] * (float)this.height); // L: 829
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 830
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	public boolean method5680() {
		return this.field3443 == 2; // L: 834
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1088006631"
	)
	public int method5625(String var1) {
		return this.type == 11 && this.field3483 != null && this.method5680() ? this.field3483.method3196(var1) : -1; // L: 838 839 841
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1684221351"
	)
	public String method5626(String var1) {
		return this.type == 11 && this.field3483 != null && this.method5680() ? this.field3483.method3178(var1) : null; // L: 845 846
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1532573495"
	)
	public int method5627() {
		return this.field3415 != null && this.field3415.size() > 0 ? 1 : 0; // L: 850
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1221314363"
	)
	public int method5709() {
		if (this.type == 11 && this.field3483 != null && this.field3415 != null && !this.field3415.isEmpty()) { // L: 854
			String var1 = this.field3483.method3201(); // L: 855
			return var1 != null && this.field3415.containsKey(this.field3483.method3201()) ? (Integer)this.field3415.get(var1) : -1; // L: 856 857 859
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "339767953"
	)
	public String method5629() {
		if (this.type == 11 && this.field3483 != null) { // L: 863
			String var1 = this.field3483.method3201(); // L: 864
			Iterator var2 = this.field3483.method3183().iterator(); // L: 865

			while (var2.hasNext()) {
				class165 var3 = (class165)var2.next(); // L: 866
				String var4 = String.format("%%%S%%", var3.method3315()); // L: 868
				if (var3.vmethod3314() == 0) { // L: 869
					var1.replaceAll(var4, Integer.toString(var3.vmethod3318())); // L: 870
				} else {
					var1.replaceAll(var4, var3.vmethod3320()); // L: 873
				}
			}

			return var1; // L: 877
		} else {
			return null; // L: 876
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "111"
	)
	public int[] method5630() {
		if (this.type == 11 && this.field3483 != null) { // L: 881
			int[] var1 = new int[3]; // L: 882
			int var2 = 0; // L: 883
			Iterator var3 = this.field3483.method3183().iterator(); // L: 884

			while (var3.hasNext()) {
				class165 var4 = (class165)var3.next(); // L: 885
				if (!var4.method3315().equals("user_id")) { // L: 887
					if (var4.vmethod3314() != 0) { // L: 888
						return null; // L: 895
					}

					var1[var2++] = var4.vmethod3318(); // L: 889
					if (var2 > 3) { // L: 890
						return null; // L: 891
					}
				}
			}

			return var1; // L: 900
		} else {
			return null;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lcd;B)Z",
		garbageValue = "4"
	)
	public boolean method5628(UrlRequester var1) {
		if (this.type == 11 && this.field3483 != null) { // L: 904
			this.field3483.method3175(var1); // L: 905
			if (this.field3483.method3176() != this.field3443) { // L: 906
				this.field3443 = this.field3483.method3176(); // L: 907
				if (this.field3443 >= 100) { // L: 908
					return true; // L: 909
				}

				if (this.field3443 == 2) { // L: 911
					this.method5632(); // L: 912
					return true; // L: 913
				}
			}

			return false; // L: 916
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1057032420"
	)
	void method5632() {
		this.noClickThrough = true; // L: 937
		ArrayList var1 = this.field3483.method3179(); // L: 938
		ArrayList var2 = this.field3483.method3190(); // L: 939
		int var3 = var1.size() + var2.size(); // L: 940
		this.children = new Widget[var3]; // L: 941
		int var4 = 0; // L: 942

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 943 950
			class160 var6 = (class160)var5.next(); // L: 944
			var7 = class11.method97(5, this, var4, 0, 0, 0, 0, var6.field1770); // L: 946
			var7.field3405 = var6.field1772.method2553(); // L: 947
			class290 var8 = new class290(var6.field1772); // L: 948
			field3364.method6539(var7.field3405, var8); // L: 949
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 953 961
			class161 var9 = (class161)var5.next(); // L: 954
			var7 = class11.method97(4, this, var4, 0, 0, 0, 0, var9.field1776); // L: 956
			var7.text = var9.field1775; // L: 957
			var7.fontId = (Integer)this.field3403.get(var9.field1779); // L: 958
			var7.textXAlignment = var9.field1773; // L: 959
			var7.textYAlignment = var9.field1777; // L: 960
		}

	} // L: 964

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-827050905"
	)
	public static void method5711() {
		KitDefinition.KitDefinition_cached.clear(); // L: 130
	} // L: 131
}
