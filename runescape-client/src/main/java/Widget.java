import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("io")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Lio;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("u")
	public static boolean field2955;
	@ObfuscatedName("e")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1996852661
	)
	@Export("id")
	public int id;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1948690547
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1560081371
	)
	@Export("type")
	public int type;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1640727545
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1069362067
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1123710663
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -463900241
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -170763861
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1434396973
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -513241127
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 225529443
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2102410665
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1913897155
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -332499741
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 552380009
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1408116923
	)
	@Export("width")
	public int width;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1272528565
	)
	@Export("height")
	public int height;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1847409391
	)
	public int field2974;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1505427003
	)
	public int field2975;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -759927677
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("az")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1341100981
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1262956443
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 13396411
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1927321653
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 66844485
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1152823329
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 653941429
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 237992241
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ag")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 97041307
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1480271257
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1529608337
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bt")
	public boolean field2991;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2108501805
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 323350109
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1630918777
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bv")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 753525735
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1569235665
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bg")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1237275757
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 981744205
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2003366431
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 318960909
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -33810755
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1553312229
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1998903261
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2096572299
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1875119171
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1078593123
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1542513487
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -775690617
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 222244751
	)
	public int field3012;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1951424775
	)
	public int field3013;
	@ObfuscatedName("bp")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bh")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -5465671
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1446916169
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cl")
	@Export("text")
	public String text;
	@ObfuscatedName("ce")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -114777247
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2062314829
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1721788583
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cq")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1196643207
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1517443571
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cd")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("co")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cm")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("ct")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1724953039
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cy")
	public boolean field3031;
	@ObfuscatedName("cp")
	public byte[][] field2987;
	@ObfuscatedName("cs")
	public byte[][] field3033;
	@ObfuscatedName("cv")
	public int[] field2993;
	@ObfuscatedName("cg")
	public int[] field3035;
	@ObfuscatedName("cx")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cr")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1233836703
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -639280281
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dn")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("de")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dc")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("do")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dx")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dr")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("da")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dw")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dj")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dm")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("du")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("dv")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("db")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dh")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("di")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ds")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dq")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dt")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dp")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dg")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dy")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dl")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dd")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dz")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eu")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("eo")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ef")
	public Object[] field3067;
	@ObfuscatedName("ek")
	public Object[] field3068;
	@ObfuscatedName("ev")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ex")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ee")
	public Object[] field3074;
	@ObfuscatedName("er")
	public Object[] field3072;
	@ObfuscatedName("el")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eg")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("ei")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ep")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ea")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eb")
	public Object[] field3078;
	@ObfuscatedName("ed")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eh")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -397970209
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ey")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ew")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("en")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ec")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1754155315
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1249175763
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 281675057
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -99781977
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fw")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fz")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 578002571
	)
	public int field3094;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -358588347
	)
	public int field3095;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -851225199
	)
	public int field3096;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 85334139
	)
	public int field3097;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -1432964963
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 972810775
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fq")
	public int[] field2966;
	@ObfuscatedName("fv")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fa")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fb")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field2955 = false;
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
		this.field2974 = 1;
		this.field2975 = 1;
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
		this.field2991 = false;
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
		this.field3012 = 0;
		this.field3013 = 0;
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
		this.field3031 = false;
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
		this.field3094 = -1;
		this.field3095 = 0;
		this.field3096 = 0;
		this.field3097 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "-878990627"
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
			this.itemIds = new int[this.rawHeight * this.rawWidth];
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "-113"
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
				this.field3012 = var1.readUnsignedShort();
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
			this.field2991 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)[Ljava/lang/Object;",
		garbageValue = "-2023401750"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)[I",
		garbageValue = "-539742690"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "59021697"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lom;",
		garbageValue = "-125"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2955 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = ViewportMouse.SpriteBuffer_getSprite(SoundSystem.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field2955 = true;
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "-804215048"
	)
	@Export("getFont")
	public Font getFont() {
		field2955 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class251.method4840(SoundSystem.Widget_spritesArchive, Login.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field2955 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lom;",
		garbageValue = "1502130498"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2955 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = ViewportMouse.SpriteBuffer_getSprite(SoundSystem.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2955 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lfz;IZLih;B)Lgl;",
		garbageValue = "-53"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2955 = false;
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
					var8 = ModelData.ModelData_get(UserComparator3.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field2955 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = UserComparator6.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field2955 = true;
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
						field2955 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = KeyHandler.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field2955 = true;
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)Liy;",
		garbageValue = "61831850"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId * 1120294389 * 323350109 : this.spriteId2 * 998115163 * -2108501805;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "634412101"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1835381046"
	)
	public static void method4799() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3556 != 0) {
				ArchiveDiskActionHandler.field3556 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "341363554"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
