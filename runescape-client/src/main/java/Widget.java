import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("a")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("d")
	public static boolean field3153;
	@ObfuscatedName("q")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 296163183
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -777771557
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 107388147
	)
	@Export("type")
	public int type;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -231341979
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -858005441
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -208704695
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 685786265
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 163148157
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1485076407
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -710949859
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1209137767
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 146294391
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1463154587
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -140051959
	)
	@Export("x")
	public int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2008945777
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -159544843
	)
	@Export("width")
	public int width;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1187557111
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1186994173
	)
	public int field3062;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -463238507
	)
	public int field3116;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 976214871
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("au")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -29580989
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 767819915
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1186027877
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -351476243
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1026377677
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1093693915
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1351015695
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1460565007
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ar")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 828202395
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 551618297
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1815197675
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bd")
	public boolean field3117;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 471118811
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1355774769
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1174131045
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bl")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1073210623
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 216456419
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bw")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bh")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2065033069
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1300658987
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -754274845
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1709943069
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 146417919
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1620944493
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -583533991
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -636491287
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1547833425
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1758135277
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1500142185
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -2007787695
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1875497623
	)
	public int field3089;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 802663565
	)
	public int field3101;
	@ObfuscatedName("bs")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("by")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1642020263
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 194821185
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ci")
	@Export("text")
	public String text;
	@ObfuscatedName("cl")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -524346475
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1916096277
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -956843697
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cf")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -992184317
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1889718339
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ch")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cx")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cv")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cr")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 765734327
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ck")
	public boolean field3119;
	@ObfuscatedName("cm")
	public byte[][] field3100;
	@ObfuscatedName("cy")
	public byte[][] field3121;
	@ObfuscatedName("cp")
	public int[] field3135;
	@ObfuscatedName("cg")
	public int[] field3123;
	@ObfuscatedName("ct")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cz")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 813889663
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1607858313
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ds")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("df")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("db")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dn")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("do")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dp")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dx")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dl")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("du")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dj")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dy")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("dr")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dc")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("dm")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dv")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("de")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dz")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dg")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dt")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("da")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("di")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dw")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dq")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eo")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ep")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ez")
	public Object[] field3155;
	@ObfuscatedName("ec")
	public Object[] field3069;
	@ObfuscatedName("ev")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ex")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("eb")
	public Object[] field3159;
	@ObfuscatedName("em")
	public Object[] field3160;
	@ObfuscatedName("eq")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("eu")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ej")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ei")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("et")
	public Object[] field3174;
	@ObfuscatedName("ew")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("el")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ey")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1896718129
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ed")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ee")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("es")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("en")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -494571141
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 625331841
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1615923275
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1522041953
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "[Ljd;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fo")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fg")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -852634285
	)
	public int field3182;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1015960745
	)
	public int field3183;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 661094543
	)
	public int field3184;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1743471611
	)
	public int field3122;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1316483769
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -2124839629
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fn")
	public int[] field3188;
	@ObfuscatedName("fz")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fe")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("ff")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3153 = false;
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
		this.field3062 = 1;
		this.field3116 = 1;
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
		this.field3117 = false;
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
		this.field3089 = 0;
		this.field3101 = 0;
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
		this.field3119 = false;
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
		this.field3182 = -1;
		this.field3183 = 0;
		this.field3184 = 0;
		this.field3122 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "652833467"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "90"
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
				this.field3089 = var1.readUnsignedShort();
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
			this.field3117 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)[Ljava/lang/Object;",
		garbageValue = "41"
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
		descriptor = "(Lot;B)[I",
		garbageValue = "5"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2111527355"
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
		descriptor = "(ZI)Loc;",
		garbageValue = "978404018"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3153 = false;
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
				var5 = class258.SpriteBuffer_getSprite(class184.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field3153 = true;
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;",
		garbageValue = "92532649"
	)
	@Export("getFont")
	public Font getFont() {
		field3153 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractSocket.method6107(class184.Widget_spritesArchive, class260.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field3153 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Loc;",
		garbageValue = "526304883"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3153 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = class258.SpriteBuffer_getSprite(class184.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3153 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfa;IZLiu;I)Lhg;",
		garbageValue = "-2094189944"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3153 = false;
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
					var8 = ModelData.ModelData_get(GrandExchangeOfferOwnWorldComparator.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3153 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = ScriptEvent.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3153 = true;
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
						field3153 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = class65.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3153 = true;
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lii;",
		garbageValue = "-1411986694"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * -1355774769 * -1718484433 : this.spriteId2 * 471118811 * -1310453677;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-520197213"
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
