import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	public static class300 field3165;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[[Ljt;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("b")
	public static boolean field3045;
	@ObfuscatedName("x")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1239763633
	)
	@Export("id")
	public int id;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -886488703
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1172876095
	)
	@Export("type")
	public int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -83198569
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 151333425
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 604390457
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1107777295
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -578564921
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 243916291
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1337119043
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -526147055
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 359431951
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -563564287
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 754583103
	)
	@Export("x")
	public int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -66554765
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2019463933
	)
	@Export("width")
	public int width;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1955651309
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 290577259
	)
	public int field3067;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 38890935
	)
	public int field3136;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 802202319
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ar")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1647106185
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 379140179
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1993150083
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1068415699
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -892929689
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2093001181
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -415375271
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -557724983
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aw")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1463185953
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1030436607
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1155135239
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bz")
	public boolean field3081;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1605814115
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 805516873
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -261092147
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bj")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -81220287
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 96251317
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bu")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bc")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1936984001
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 617278149
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -230164833
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -74142311
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1444892265
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1467040689
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1967675591
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -789464497
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1294872275
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 315650477
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 787747681
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2013447747
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1278808337
	)
	public int field3102;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 905870085
	)
	public int field3038;
	@ObfuscatedName("bk")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bp")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -510674147
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1603883435
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ct")
	@Export("text")
	public String text;
	@ObfuscatedName("cy")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1721306803
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -591425127
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1728022553
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cd")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1282237629
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1042618055
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cr")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cq")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cs")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cw")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1141593057
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cz")
	public boolean field3121;
	@ObfuscatedName("cu")
	public byte[][] field3115;
	@ObfuscatedName("cv")
	public byte[][] field3123;
	@ObfuscatedName("cn")
	public int[] field3147;
	@ObfuscatedName("cf")
	public int[] field3066;
	@ObfuscatedName("ck")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cb")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -754803859
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -776072407
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dd")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dp")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dq")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("du")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dy")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dl")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("df")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dj")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dm")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dt")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dr")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("do")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("dv")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("di")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dw")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dn")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dh")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ds")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("da")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dz")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("de")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("et")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ev")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("es")
	public Object[] field3157;
	@ObfuscatedName("ee")
	public Object[] field3158;
	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("eu")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("eb")
	public Object[] field3161;
	@ObfuscatedName("ez")
	public Object[] field3163;
	@ObfuscatedName("er")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ea")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ej")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ek")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ew")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eg")
	public Object[] field3168;
	@ObfuscatedName("ec")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ei")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eq")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 1331506921
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ep")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("en")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ed")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ey")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1708716531
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1521917383
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1043627497
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -886660969
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "[Ljt;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fi")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fb")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -2088196585
	)
	public int field3064;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1027764261
	)
	public int field3185;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -1002447235
	)
	public int field3186;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 80527699
	)
	public int field3187;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 1516024327
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = -1555978879
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ff")
	public int[] field3190;
	@ObfuscatedName("fd")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fn")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fo")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3045 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field3067 = 1;
		this.field3136 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3081 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3102 = 0;
		this.field3038 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.paddingX = 0;
		this.paddingY = 0;
		this.flags = 0;
		this.field3121 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.spellName = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.containsMouse = false;
		this.isClicked = false;
		this.field3064 = -1;
		this.field3185 = 0;
		this.field3186 = 0;
		this.field3187 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "2061561057"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
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

		var3 = var1.readUnsignedByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 2) {
			this.itemIds = new int[this.rawWidth * this.rawHeight];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte();
			this.paddingY = var1.readUnsignedByte();
			this.inventoryXOffsets = new int[20];
			this.inventoryYOffsets = new int[20];
			this.inventorySprites = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var11 = var1.readUnsignedByte();
				if (var11 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.itemActions = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var9 = var1.readStringCp1252NullTerminated();
				if (var9.length() > 0) {
					this.itemActions[var8] = var9;
					this.flags |= 1 << var8 + 23;
				}
			}
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 7) {
			this.itemIds = new int[this.rawHeight * this.rawWidth];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			this.textXAlignment = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
			this.paddingX = var1.readShort();
			this.paddingY = var1.readShort();
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var5] = var10;
					this.flags |= 1 << var5 + 23;
				}
			}
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2 || this.type == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.spellName = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "1842256168"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field3102 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field3081 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)[Ljava/lang/Object;",
		garbageValue = "-1513095431"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)[I",
		garbageValue = "998021667"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1136689238"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lon;",
		garbageValue = "-1235914295"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3045 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = AccessFile.SpriteBuffer_getSprite(IntHashTable.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field3045 = true;
					return null;
				} else {
					if (this.spriteFlipV) {
						var5.flipVertically();
					}

					if (this.spriteFlipH) {
						var5.flipHorizontally();
					}

					if (this.outline > 0) {
						var5.pad(this.outline);
					}

					if (this.outline >= 1) {
						var5.outline(1);
					}

					if (this.outline >= 2) {
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) {
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Llt;",
		garbageValue = "-1004805347"
	)
	@Export("getFont")
	public Font getFont() {
		field3045 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Actor.method2153(IntHashTable.Widget_spritesArchive, SecureRandomFuture.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field3045 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Lon;",
		garbageValue = "-1032609925"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3045 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = AccessFile.SpriteBuffer_getSprite(IntHashTable.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3045 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfe;IZLie;B)Lhl;",
		garbageValue = "94"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3045 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = this.modelType2;
			var6 = this.modelId2;
		} else {
			var5 = this.modelType;
			var6 = this.modelId;
		}

		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3045 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = class112.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3045 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null) {
						return null;
					}

					var8 = var4.getModelData();
					if (var8 == null) {
						field3045 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = class87.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3045 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZB)Liw;",
		garbageValue = "103"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1158505479 * 805516873 : this.spriteId2 * -1605814115 * 1666649525;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-65"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("k")
	public static int method5030(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-790406239"
	)
	static void method4997(int var0, int var1) {
		int var2 = Interpreter.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var7 = Interpreter.fontBold12;
			String var8;
			if (var3 < 0) {
				var8 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3];
			}

			int var6 = var7.stringWidth(var8);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var4 = var0 - var2 / 2;
		if (var2 + var4 > Huffman.canvasWidth) {
			var4 = Huffman.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > MouseRecorder.canvasHeight) {
			var5 = MouseRecorder.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		LoginScreenAnimation.menuX = var4;
		class392.menuY = var5;
		UserComparator7.menuWidth = var2;
		ApproximateRouteStrategy.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
