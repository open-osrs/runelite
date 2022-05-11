import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static class362 field3390;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static class362 field3378;
	@ObfuscatedName("aj")
	public static boolean field3407;
	@ObfuscatedName("ae")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1115174973
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -776270713
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1972844397
	)
	@Export("type")
	public int type;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 235823181
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -388100275
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -396062445
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 678418613
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1351515849
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1340623801
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1043867923
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2102072707
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1127967955
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 232379525
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1835485941
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2009390011
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1172311447
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -459533989
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2136321081
	)
	public int field3411;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1059357481
	)
	public int field3494;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -906080451
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ba")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 577252931
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1581918007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1123320165
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -578131215
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -979741419
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -792649141
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 387100237
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -554834039
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -193710345
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 992811287
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 184656457
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bt")
	public boolean field3428;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2014760189
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 286536551
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bh")
	public String field3431;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1597579983
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bm")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 346905275
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -460120439
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bg")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bp")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2112595825
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 288041705
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1783833135
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1672879833
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1814404803
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2098504379
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 509392171
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -164846883
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1338987037
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -245886579
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1535139247
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1846491567
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 399903033
	)
	public int field3406;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -891150003
	)
	public int field3451;
	@ObfuscatedName("cd")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cw")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2138903919
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1797182937
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cg")
	@Export("text")
	public String text;
	@ObfuscatedName("cl")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1967727263
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1185644193
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1879071397
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ce")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1427227403
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -91862955
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cp")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dc")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dp")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dg")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	class155 field3408;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1702458807
	)
	int field3391;
	@ObfuscatedName("dj")
	HashMap field3470;
	@ObfuscatedName("dx")
	HashMap field3471;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1159870601
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("di")
	public boolean field3473;
	@ObfuscatedName("de")
	public byte[][] field3474;
	@ObfuscatedName("db")
	public byte[][] field3419;
	@ObfuscatedName("dn")
	public int[] field3476;
	@ObfuscatedName("dz")
	public int[] field3481;
	@ObfuscatedName("ds")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dt")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -899991807
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 799594581
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dw")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dk")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("du")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ej")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("en")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eb")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ea")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("er")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ec")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ek")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ed")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ew")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ev")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("el")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ef")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ee")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("es")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("eg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("et")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ex")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ei")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ey")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ep")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eu")
	public Object[] field3443;
	@ObfuscatedName("ez")
	public Object[] field3510;
	@ObfuscatedName("eq")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fs")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fp")
	public Object[] field3513;
	@ObfuscatedName("fy")
	public Object[] field3456;
	@ObfuscatedName("fg")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fd")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fh")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fv")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ff")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fz")
	public Object[] field3520;
	@ObfuscatedName("fl")
	public Object[] field3460;
	@ObfuscatedName("fq")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fo")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fn")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1959307231
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fi")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fx")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fe")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fb")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -756375481
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -572001819
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 564625883
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1825821707
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "[Lki;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fk")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fw")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -773430937
	)
	public int field3524;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1877978217
	)
	public int field3538;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -486342891
	)
	public int field3539;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1612828663
	)
	public int field3540;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1878678007
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -2036768027
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gy")
	public int[] field3527;
	@ObfuscatedName("gl")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gi")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3390 = new class362(10, class360.field4274); // L: 56
		field3378 = new class362(10, class360.field4274); // L: 57
		field3407 = false; // L: 58
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
		this.field3411 = 1; // L: 77
		this.field3494 = 1; // L: 78
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
		this.field3428 = false; // L: 94
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
		this.field3406 = 0; // L: 116
		this.field3451 = 0; // L: 117
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
		this.field3391 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3473 = false; // L: 140
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
		this.field3524 = -1; // L: 208
		this.field3538 = 0; // L: 209
		this.field3539 = 0; // L: 210
		this.field3540 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1773202641"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 270
		this.type = var1.readUnsignedByte(); // L: 271
		this.buttonType = var1.readUnsignedByte(); // L: 272
		this.contentType = var1.readUnsignedShort(); // L: 273
		this.rawX = var1.readShort(); // L: 274
		this.rawY = var1.readShort(); // L: 275
		this.rawWidth = var1.readUnsignedShort(); // L: 276
		this.rawHeight = var1.readUnsignedShort(); // L: 277
		this.transparencyTop = var1.readUnsignedByte(); // L: 278
		this.parentId = var1.readUnsignedShort(); // L: 279
		if (this.parentId == 65535) { // L: 280
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 281
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 282
		if (this.mouseOverRedirect == 65535) { // L: 283
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 284
		int var3;
		if (var2 > 0) { // L: 285
			this.cs1Comparisons = new int[var2]; // L: 286
			this.cs1ComparisonValues = new int[var2]; // L: 287

			for (var3 = 0; var3 < var2; ++var3) { // L: 288
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 289
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 290
			}
		}

		var3 = var1.readUnsignedByte(); // L: 293
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 294
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
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 314
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
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 388
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
			if (var4 == 1) { // L: 398
				this.flags |= 1073741824;
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-659209979"
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
				this.field3406 = var1.readUnsignedShort();
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
			this.field3428 = var1.readUnsignedByte() == 1; // L: 504
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)[Ljava/lang/Object;",
		garbageValue = "1297123633"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpx;S)[I",
		garbageValue = "-14146"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "986584305"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZLce;I)Lqr;",
		garbageValue = "1939454695"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3407 = false; // L: 573
		if (this.field3431 != null) { // L: 574
			SpritePixels var3 = this.method5546(var2); // L: 575
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
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var7 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 584
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 585
			if (var6 != null) { // L: 586
				return var6;
			} else {
				var6 = StructComposition.SpriteBuffer_getSprite(WorldMapCacheName.Widget_spritesArchive, var7, 0); // L: 587
				if (var6 == null) { // L: 588
					field3407 = true; // L: 589
					return null; // L: 590
				} else {
					this.method5442(var6); // L: 592
					Widget_cachedSprites.put(var6, var4); // L: 593
					return var6; // L: 594
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Lqr;",
		garbageValue = "-503493635"
	)
	SpritePixels method5546(UrlRequester var1) {
		if (!this.method5499()) { // L: 598
			return this.method5519(var1); // L: 599
		} else {
			String var2 = this.field3431 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 601
			SpritePixels var3 = (SpritePixels)field3378.method6413(var2); // L: 602
			if (var3 == null) { // L: 603
				SpritePixels var4 = this.method5519(var1); // L: 604
				if (var4 != null) { // L: 605
					var3 = var4.method8001(); // L: 606
					this.method5442(var3); // L: 607
					field3378.method6402(var2, var3); // L: 608
				}
			}

			return var3; // L: 611
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Lqr;",
		garbageValue = "1002412597"
	)
	SpritePixels method5519(UrlRequester var1) {
		if (this.field3431 != null && var1 != null) { // L: 615
			class291 var2 = (class291)field3390.method6413(this.field3431); // L: 616
			if (var2 == null) { // L: 617
				var2 = new class291(this.field3431, var1); // L: 618
				field3390.method6402(this.field3431, var2); // L: 619
			}

			return var2.method5391(); // L: 621
		} else {
			return null; // L: 623
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "205888634"
	)
	boolean method5499() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 627
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-110"
	)
	void method5442(SpritePixels var1) {
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

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 635
		}

		if (this.spriteShadow != 0) { // L: 636
			var1.shadow(this.spriteShadow);
		}

	} // L: 637

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;",
		garbageValue = "797268567"
	)
	@Export("getFont")
	public Font getFont() {
		field3407 = false; // L: 640
		if (this.fontId == -1) { // L: 641
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 642
			if (var1 != null) { // L: 643
				return var1;
			} else {
				var1 = class387.method6781(WorldMapCacheName.Widget_spritesArchive, class93.Widget_fontsArchive, this.fontId, 0); // L: 644
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 645
				} else {
					field3407 = true; // L: 646
				}

				return var1; // L: 647
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lqr;",
		garbageValue = "122047479"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3407 = false; // L: 651
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 652
			int var2 = this.inventorySprites[var1]; // L: 653
			if (var2 == -1) { // L: 654
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 655
				if (var3 != null) { // L: 656
					return var3;
				} else {
					var3 = StructComposition.SpriteBuffer_getSprite(WorldMapCacheName.Widget_spritesArchive, var2, 0); // L: 657
					if (var3 != null) { // L: 658
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3407 = true; // L: 659
					}

					return var3; // L: 660
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgq;IZLkp;I)Lhv;",
		garbageValue = "-1604059191"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3407 = false; // L: 664
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
						field3407 = true; // L: 683
						return null; // L: 684
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 686
				}

				if (var5 == 2) { // L: 688
					var8 = WorldMapSectionType.getNpcDefinition(var6).getModelData(); // L: 689
					if (var8 == null) { // L: 690
						field3407 = true; // L: 691
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
						field3407 = true; // L: 700
						return null; // L: 701
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 703
				}

				if (var5 == 4) { // L: 705
					ItemComposition var9 = FileSystem.ItemDefinition_get(var6); // L: 706
					var8 = var9.getModelData(10); // L: 707
					if (var8 == null) { // L: 708
						field3407 = true; // L: 709
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lka;",
		garbageValue = "1947856981"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 723
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 286536551 * 2004629591 : this.spriteId2 * -1501605973 * -2014760189; // L: 724
		if (var2 == -1) { // L: 725
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 726
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-39"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1684340581"
	)
	public boolean method5448() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 769
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;J)V"
	)
	public void method5449(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 773
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 774
			this.field3408 = new class155(); // L: 775
			if (!this.field3408.method3085(var1, var2)) { // L: 776
				this.field3408 = null; // L: 777
			} else {
				if (this.field3470 == null || this.field3471 == null) { // L: 780
					this.method5450(); // L: 781
				}

			}
		}
	} // L: 778 783

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1904926209"
	)
	void method5450() {
		this.field3470 = new HashMap(); // L: 786
		this.field3471 = new HashMap(); // L: 787
	} // L: 788

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-118212999"
	)
	public void method5451(int var1, int var2) {
		if (this.type == 11) { // L: 791
			if (this.field3470 == null) { // L: 792
				this.method5450();
			}

			this.field3470.put(var1, var2); // L: 793
		}
	} // L: 794

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2090155850"
	)
	public void method5468(String var1, int var2) {
		if (this.type == 11) { // L: 797
			if (this.field3471 == null) { // L: 798
				this.method5450();
			}

			this.field3471.put(var1, var2); // L: 799
		}
	} // L: 800

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1974836941"
	)
	public boolean method5474(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3408 != null && this.method5498()) { // L: 803
			var1 -= var3; // L: 804
			var2 -= var4; // L: 805
			int var5 = (int)(this.field3408.method3071()[0] * (float)this.width); // L: 806
			int var6 = (int)(this.field3408.method3071()[1] * (float)this.height); // L: 807
			int var7 = var5 + (int)(this.field3408.method3071()[2] * (float)this.width); // L: 808
			int var8 = var6 + (int)(this.field3408.method3071()[3] * (float)this.height); // L: 809
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 810
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1289380657"
	)
	public boolean method5498() {
		return this.field3391 == 2; // L: 814
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2103754718"
	)
	public int method5455(String var1) {
		return this.type == 11 && this.field3408 != null && this.method5498() ? this.field3408.method3066(var1) : -1; // L: 818 819 821
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-386169422"
	)
	public String method5523(String var1) {
		return this.type == 11 && this.field3408 != null && this.method5498() ? this.field3408.method3097(var1) : null; // L: 825 826
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1984681933"
	)
	public int method5457() {
		return this.field3471 != null && this.field3471.size() > 0 ? 1 : 0; // L: 830
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public int method5458() {
		if (this.type == 11 && this.field3408 != null && this.field3471 != null && !this.field3471.isEmpty()) { // L: 834
			String var1 = this.field3408.method3075(); // L: 835
			return var1 != null && this.field3471.containsKey(this.field3408.method3075()) ? (Integer)this.field3471.get(var1) : -1; // L: 836 837 839
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-24"
	)
	public String method5480() {
		if (this.type == 11 && this.field3408 != null) { // L: 843
			String var1 = this.field3408.method3075(); // L: 844
			Iterator var2 = this.field3408.method3072().iterator(); // L: 845

			while (var2.hasNext()) {
				class166 var3 = (class166)var2.next(); // L: 846
				String var4 = String.format("%%%S%%", var3.method3226()); // L: 848
				if (var3.vmethod3227() == 0) { // L: 849
					var1.replaceAll(var4, Integer.toString(var3.vmethod3228())); // L: 850
				} else {
					var1.replaceAll(var4, var3.vmethod3238()); // L: 853
				}
			}

			return var1; // L: 857
		} else {
			return null; // L: 856
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-216583671"
	)
	public int[] method5460() {
		if (this.type == 11 && this.field3408 != null) { // L: 861
			int[] var1 = new int[3]; // L: 862
			int var2 = 0; // L: 863
			Iterator var3 = this.field3408.method3072().iterator(); // L: 864

			while (var3.hasNext()) {
				class166 var4 = (class166)var3.next(); // L: 865
				if (!var4.method3226().equals("user_id")) { // L: 867
					if (var4.vmethod3227() != 0) { // L: 868
						return null; // L: 875
					}

					var1[var2++] = var4.vmethod3228(); // L: 869
					if (var2 > 3) { // L: 870
						return null; // L: 871
					}
				}
			}

			return var1; // L: 880
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lce;I)Z",
		garbageValue = "1243855497"
	)
	public boolean method5517(UrlRequester var1) {
		if (this.type == 11 && this.field3408 != null) { // L: 884
			this.field3408.method3064(var1); // L: 885
			if (this.field3408.method3067() != this.field3391) { // L: 886
				this.field3391 = this.field3408.method3067(); // L: 887
				if (this.field3391 >= 100) { // L: 888
					return true; // L: 889
				}

				if (this.field3391 == 2) { // L: 891
					this.method5462(); // L: 892
					return true; // L: 893
				}
			}

			return false; // L: 896
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method5462() {
		this.noClickThrough = true; // L: 917
		ArrayList var1 = this.field3408.method3110(); // L: 918
		ArrayList var2 = this.field3408.method3069(); // L: 919
		int var3 = var1.size() + var2.size(); // L: 920
		this.children = new Widget[var3]; // L: 921
		int var4 = 0; // L: 922

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 923 930
			class160 var6 = (class160)var5.next(); // L: 924
			var7 = class273.method5077(5, this, var4, 0, 0, 0, 0, var6.field1782); // L: 926
			var7.field3431 = var6.field1783.method2556(); // L: 927
			class291 var8 = new class291(var6.field1783); // L: 928
			field3390.method6402(var7.field3431, var8); // L: 929
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 933 941
			class162 var9 = (class162)var5.next(); // L: 934
			var7 = class273.method5077(4, this, var4, 0, 0, 0, 0, var9.field1804); // L: 936
			var7.text = var9.field1803; // L: 937
			var7.fontId = (Integer)this.field3470.get(var9.field1807); // L: 938
			var7.textXAlignment = var9.field1811; // L: 939
			var7.textYAlignment = var9.field1806; // L: 940
		}

	} // L: 944

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "543446302"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field711 = 0L; // L: 4345
		if (var0 >= 2) { // L: 4346
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4347
		}

		if (ClanChannelMember.getWindowedMode() == 1) { // L: 4348
			class82.client.setMaxCanvasSize(765, 503); // L: 4349
		} else {
			class82.client.setMaxCanvasSize(7680, 2160); // L: 4352
		}

		if (Client.gameState >= 25) { // L: 4354
			PacketBufferNode var1 = WallDecoration.getPacketBufferNode(ClientPacket.field3054, Client.packetWriter.isaacCipher); // L: 4356
			var1.packetBuffer.writeByte(ClanChannelMember.getWindowedMode()); // L: 4357
			var1.packetBuffer.writeShort(GraphicsObject.canvasWidth); // L: 4358
			var1.packetBuffer.writeShort(class433.canvasHeight); // L: 4359
			Client.packetWriter.addNode(var1); // L: 4360
		}

	} // L: 4362
}
