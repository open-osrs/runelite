import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("w")
	@Export("Widget_loadedInterfaces")
	static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("a")
	public static boolean field3223;
	@ObfuscatedName("u")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2075239563
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1765912961
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -662656213
	)
	@Export("type")
	public int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2103555439
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -421542377
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1776788083
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 755518345
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1656675739
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1261392773
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1808070299
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1911563275
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1569538763
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 556685443
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1962054505
	)
	@Export("x")
	public int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1127629965
	)
	@Export("y")
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 137530349
	)
	@Export("width")
	public int width;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 147077041
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 130394051
	)
	public int field3242;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 341333975
	)
	public int field3243;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1186103625
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("af")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 665368309
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1369672271
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -362959503
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -390853847
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -830468905
	)
	@Export("color")
	public int color;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -744334253
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 147049371
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1415992785
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aw")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 193150235
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -749359679
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 19573505
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bp")
	public boolean field3359;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 949557953
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 728672183
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1593709613
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bg")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 904416977
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 878706021
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bm")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1789185725
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 434114019
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2007672513
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 961616719
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1588019651
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 583977265
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 459494725
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 584596143
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2011255181
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -192481701
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1120643849
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1128501563
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1248935109
	)
	public int field3280;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1790940755
	)
	public int field3260;
	@ObfuscatedName("bo")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bf")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1120157659
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1677313687
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cl")
	@Export("text")
	public String text;
	@ObfuscatedName("cp")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1468399469
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1376772263
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1684285413
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cy")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2093941643
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -792170613
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("co")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cc")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cs")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cr")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 485964777
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cj")
	public boolean field3299;
	@ObfuscatedName("ca")
	public byte[][] field3300;
	@ObfuscatedName("cz")
	public byte[][] field3301;
	@ObfuscatedName("cw")
	public int[] field3302;
	@ObfuscatedName("ct")
	public int[] field3303;
	@ObfuscatedName("cu")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cx")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -2013881261
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -2058089895
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ds")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dv")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("do")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dt")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dy")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dk")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("de")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("df")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dh")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dn")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dx")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dp")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dc")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dq")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("db")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dj")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dd")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("du")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dl")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dw")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("di")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dz")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("da")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eu")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("et")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eg")
	public Object[] field3335;
	@ObfuscatedName("ek")
	public Object[] field3336;
	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ev")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ep")
	public Object[] field3217;
	@ObfuscatedName("ej")
	public Object[] field3340;
	@ObfuscatedName("er")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("em")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("el")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eo")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ee")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("en")
	public Object[] field3294;
	@ObfuscatedName("ez")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eh")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ei")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -1965658387
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ea")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ex")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ec")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("es")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -757750871
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -462414583
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1348132735
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -676166249
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ft")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fk")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1631841167
	)
	public int field3341;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1237599647
	)
	public int field3363;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1972995307
	)
	public int field3364;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1004662139
	)
	public int field3365;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -1959664983
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 1623310513
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fh")
	public int[] field3368;
	@ObfuscatedName("fd")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fq")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fz")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3223 = false;
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
		this.field3242 = 1;
		this.field3243 = 1;
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
		this.field3359 = false;
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
		this.field3280 = 0;
		this.field3260 = 0;
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
		this.field3299 = false;
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
		this.field3341 = -1;
		this.field3363 = 0;
		this.field3364 = 0;
		this.field3365 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "8"
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
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
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
			this.itemIds = new int[this.rawWidth * this.rawHeight];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "3"
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
				this.field3280 = var1.readUnsignedShort();
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
			this.field3359 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)[Ljava/lang/Object;",
		garbageValue = "-48"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)[I",
		garbageValue = "-1206239013"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1907354945"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpl;",
		garbageValue = "-2081524052"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3223 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var5 = (SpritePixels) Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = class6.SpriteBuffer_getSprite(GraphicsObject.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field3223 = true;
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-2079109490"
	)
	@Export("getFont")
	public Font getFont() {
		field3223 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font) Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = GraphicsObject.Widget_spritesArchive;
				AbstractArchive var4 = NPC.Widget_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!class147.method3009(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class141.SpriteBuffer_xOffsets, RouteStrategy.SpriteBuffer_yOffsets, class432.SpriteBuffer_spriteWidths, class330.SpriteBuffer_spriteHeights, class432.SpriteBuffer_spritePalette, class369.SpriteBuffer_pixels);
						UserComparator3.method2529();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3223 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpl;",
		garbageValue = "-95"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3223 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels) Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = class6.SpriteBuffer_getSprite(GraphicsObject.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3223 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IZLjo;I)Lgo;",
		garbageValue = "733986686"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3223 = false;
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
			Model var7 = (Model) Widget_cachedModels.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3223 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = WorldMapLabelSize.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3223 = true;
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
						field3223 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = UserComparator6.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3223 = true;
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
		descriptor = "(ZI)Ljr;",
		garbageValue = "-1371777519"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 728672183 * 655222279 : this.spriteId2 * -1083804351 * 949557953;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpriteMask var5 = (SpriteMask) Widget_cachedSpriteMasks.get(var3);
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "340067933"
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
}
