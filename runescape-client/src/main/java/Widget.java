import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "[[Lhd;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("s")
	public static boolean field2600;
	@ObfuscatedName("v")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1532053467
	)
	@Export("id")
	public int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 94060767
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1914677931
	)
	@Export("type")
	public int type;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 650107535
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1929640649
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 671987209
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1358214717
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1288389301
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 147496779
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -108757037
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1114050541
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -426293773
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1314381509
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1103460101
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 102959843
	)
	@Export("y")
	public int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -75340697
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2125257181
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -30981469
	)
	public int field2741;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1536699571
	)
	public int field2641;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1118896329
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ap")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1010580353
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1724100971
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1772823043
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -519746393
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1542653287
	)
	@Export("color")
	public int color;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2094712983
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -583623665
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1750494175
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("az")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("fillMode")
	public class332 fillMode;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 374007217
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1124278239
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1598998121
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bk")
	public boolean field2633;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -26976881
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 735913065
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1395543785
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bf")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1014909581
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 511945889
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bb")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 2063868425
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 2132248089
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1137051425
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -2115206777
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1819802445
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1542616685
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 775491195
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1987076219
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1572125175
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -34840117
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1647170417
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 433394219
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2079945959
	)
	public int field2657;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 295500307
	)
	public int field2658;
	@ObfuscatedName("by")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bj")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 904576921
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -732516347
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cb")
	@Export("text")
	public String text;
	@ObfuscatedName("ch")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1932808517
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1100910863
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1006232377
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cn")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1719700201
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -895052993
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ck")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cv")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cp")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("ci")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1451565177
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cq")
	public boolean field2709;
	@ObfuscatedName("co")
	public byte[][] field2647;
	@ObfuscatedName("ca")
	public byte[][] field2678;
	@ObfuscatedName("cd")
	public int[] field2679;
	@ObfuscatedName("cy")
	public int[] field2680;
	@ObfuscatedName("dx")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -730835665
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 2091861089
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dl")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dr")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("di")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dp")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dt")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ds")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dg")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("do")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dn")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("db")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("de")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dv")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dk")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("da")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("df")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dz")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dq")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dy")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("du")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dj")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ek")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ej")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("eu")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eo")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("es")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ea")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ef")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ei")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("et")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("eq")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ex")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("er")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("em")
	public Object[] field2719;
	@ObfuscatedName("en")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("el")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ez")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -1020277937
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("eg")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ey")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ew")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ep")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -2118409911
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 488452853
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1121550345
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 404689141
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "[Lhd;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fe")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fi")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -1318677179
	)
	public int field2735;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 1691925671
	)
	public int field2736;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 717903213
	)
	public int field2643;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = 989290657
	)
	public int field2721;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -775158901
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1023305039
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fk")
	public int[] field2723;
	@ObfuscatedName("fx")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fy")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fn")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field2600 = false;
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
		this.field2741 = 1;
		this.field2641 = 1;
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
		this.fillMode = class332.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field2633 = false;
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
		this.field2657 = 0;
		this.field2658 = 0;
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
		this.field2709 = false;
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
		this.field2735 = -1;
		this.field2736 = 0;
		this.field2643 = 0;
		this.field2721 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkn;S)V",
		garbageValue = "27305"
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
				int var9 = var1.readUnsignedByte();
				if (var9 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.itemActions = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var8] = var10;
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
				String var11 = var1.readStringCp1252NullTerminated();
				if (var11.length() > 0) {
					this.itemActions[var5] = var11;
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lkn;B)V",
		garbageValue = "0"
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
				this.field2657 = var1.readUnsignedShort();
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
			this.field2633 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lkn;I)[Ljava/lang/Object;",
		garbageValue = "2034218421"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lkn;S)[I",
		garbageValue = "-3542"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "429586427"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(ZB)Llz;",
		garbageValue = "1"
	)
	@Export("getSprite")
	public Sprite getSprite(boolean var1) {
		field2600 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((long)this.spriteShadow << 40);
			Sprite var5 = (Sprite)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = GameShell.SpriteBuffer_getSprite(class349.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field2600 = true;
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)Lko;",
		garbageValue = "24"
	)
	@Export("getFont")
	public Font getFont() {
		field2600 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Frames.method3394(class349.Widget_spritesArchive, WorldMapLabel.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field2600 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)Llz;",
		garbageValue = "2132771251"
	)
	@Export("getInventorySprite")
	public Sprite getInventorySprite(int var1) {
		field2600 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				Sprite var3 = (Sprite)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = GameShell.SpriteBuffer_getSprite(class349.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2600 = true;
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
		signature = "(Ljm;IZLhv;I)Lef;",
		garbageValue = "-893461893"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerAppearance var4) {
		field2600 = false;
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
					var8 = ModelData.ModelData_get(SecureRandomCallable.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field2600 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = StudioGame.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field2600 = true;
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
						field2600 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemDefinition var9 = KitDefinition.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field2600 = true;
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ZI)Lhh;",
		garbageValue = "-1801496414"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 735913065 * -114644007 : this.spriteId2 * -26976881 * 953426287;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				Sprite var6 = this.getSprite(var1);
				if (var6 == null) {
					return null;
				} else {
					Sprite var7 = var6.copyNormalized();
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "1766154663"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "863764794"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitDefinition var2 = (VarbitDefinition)VarbitDefinition.VarbitDefinition_cached.get((long)var0);
		VarbitDefinition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var7 = VarbitDefinition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitDefinition();
			if (var7 != null) {
				var2.decode(new Buffer(var7));
			}

			VarbitDefinition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var3 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var3] >> var4 & var6;
	}
}
