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
   static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("Widget_cachedModels")
   static EvictingDualNodeHashTable Widget_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("Widget_cachedFonts")
   static EvictingDualNodeHashTable Widget_cachedFonts = new EvictingDualNodeHashTable(20);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("Widget_cachedSpriteMasks")
   static EvictingDualNodeHashTable Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("x")
   public static boolean field2591 = false;
   @ObfuscatedName("f")
   @Export("isIf3")
   public boolean isIf3 = false;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 584503877
   )
   @Export("id")
   public int id = -1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -572555511
   )
   @Export("childIndex")
   public int childIndex = -1;
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
   public int buttonType = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 950643501
   )
   @Export("contentType")
   public int contentType = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1444067651
   )
   @Export("xAlignment")
   public int xAlignment = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 61587371
   )
   @Export("yAlignment")
   public int yAlignment = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -748645369
   )
   @Export("widthAlignment")
   public int widthAlignment = 0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1468744315
   )
   @Export("heightAlignment")
   public int heightAlignment = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 103560479
   )
   @Export("rawX")
   public int rawX = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -519325005
   )
   @Export("rawY")
   public int rawY = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -76139235
   )
   @Export("rawWidth")
   public int rawWidth = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -776487251
   )
   @Export("rawHeight")
   public int rawHeight = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 858952753
   )
   @Export("x")
   public int x = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1333739283
   )
   @Export("y")
   public int y = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1593306137
   )
   @Export("width")
   public int width = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -937018705
   )
   @Export("height")
   public int height = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 2022992129
   )
   public int field2610 = 1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1312652811
   )
   public int field2611 = 1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -624975397
   )
   @Export("parentId")
   public int parentId = -1;
   @ObfuscatedName("as")
   @Export("isHidden")
   public boolean isHidden = false;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -963861053
   )
   @Export("scrollX")
   public int scrollX = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1198753763
   )
   @Export("scrollY")
   public int scrollY = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 262059497
   )
   @Export("scrollWidth")
   public int scrollWidth = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1576927071
   )
   @Export("scrollHeight")
   public int scrollHeight = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 23277245
   )
   @Export("color")
   public int color = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -164131939
   )
   @Export("color2")
   public int color2 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -71444347
   )
   @Export("mouseOverColor")
   public int mouseOverColor = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1701318471
   )
   @Export("mouseOverColor2")
   public int mouseOverColor2 = 0;
   @ObfuscatedName("au")
   @Export("fill")
   public boolean fill = false;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   @Export("fillMode")
   public WidgetFillMode fillMode;
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

   public Widget() {
      this.fillMode = WidgetFillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = 1;
      this.field2627 = false;
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
      this.field2648 = 0;
      this.field2649 = 0;
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
      this.field2667 = false;
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
      this.field2719 = -1;
      this.field2727 = 0;
      this.field2728 = 0;
      this.field2729 = 0;
      this.rootIndex = -1;
      this.cycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "14"
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

         for(var3 = 0; var3 < var2; ++var3) {
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

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.readUnsignedShort();
            this.cs1Instructions[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
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
         for(var8 = 0; var8 < 20; ++var8) {
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

         for(var8 = 0; var8 < 5; ++var8) {
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

         for(var5 = 0; var5 < 5; ++var5) {
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "-327034944"
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
            this.field2648 = var1.readUnsignedShort();
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
         this.field2627 = var1.readUnsignedByte() == 1;
      }

      this.flags = var1.readMedium();
      this.dataText = var1.readStringCp1252NullTerminated();
      int var2 = var1.readUnsignedByte();
      if (var2 > 0) {
         this.actions = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
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
      descriptor = "(Lkx;B)[Ljava/lang/Object;",
      garbageValue = "-123"
   )
   @Export("readListener")
   Object[] readListener(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 == 0) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)[I",
      garbageValue = "-892606734"
   )
   @Export("readListenerTriggers")
   int[] readListenerTriggers(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.readInt();
         }

         return var3;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "42"
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ZI)Llm;",
      garbageValue = "1522680461"
   )
   @Export("getSprite")
   public SpritePixels getSprite(boolean var1) {
      field2591 = false;
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
            var5 = BufferedSource.SpriteBuffer_getSprite(InterfaceParent.Widget_spritesArchive, var2, 0);
            if (var5 == null) {
               field2591 = true;
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Lkl;",
      garbageValue = "1746762389"
   )
   @Export("getFont")
   public Font getFont() {
      field2591 = false;
      if (this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
         if (var1 != null) {
            return var1;
         } else {
            AbstractArchive var3 = InterfaceParent.Widget_spritesArchive;
            AbstractArchive var4 = Widget_fontsArchive;
            int var5 = this.fontId;
            byte[] var7 = var3.takeFile(var5, 0);
            boolean var6;
            if (var7 == null) {
               var6 = false;
            } else {
               GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7);
               var6 = true;
            }

            Font var2;
            if (!var6) {
               var2 = null;
            } else {
               byte[] var8 = var4.takeFile(var5, 0);
               Font var10;
               if (var8 == null) {
                  var10 = null;
               } else {
                  Font var9 = new Font(var8, class105.SpriteBuffer_xOffsets, class336.SpriteBuffer_yOffsets, class336.SpriteBuffer_spriteWidths, class225.SpriteBuffer_spriteHeights, HorizontalAlignment.SpriteBuffer_spritePalette, class2.SpriteBuffer_pixels);
                  class105.SpriteBuffer_xOffsets = null;
                  class336.SpriteBuffer_yOffsets = null;
                  class336.SpriteBuffer_spriteWidths = null;
                  class225.SpriteBuffer_spriteHeights = null;
                  HorizontalAlignment.SpriteBuffer_spritePalette = null;
                  class2.SpriteBuffer_pixels = null;
                  var10 = var9;
               }

               var2 = var10;
            }

            if (var2 != null) {
               Widget_cachedFonts.put(var2, (long)this.fontId);
            } else {
               field2591 = true;
            }

            return var2;
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
      field2591 = false;
      if (var1 >= 0 && var1 < this.inventorySprites.length) {
         int var2 = this.inventorySprites[var1];
         if (var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
            if (var3 != null) {
               return var3;
            } else {
               var3 = BufferedSource.SpriteBuffer_getSprite(InterfaceParent.Widget_spritesArchive, var2, 0);
               if (var3 != null) {
                  Widget_cachedSprites.put(var3, (long)var2);
               } else {
                  field2591 = true;
               }

               return var3;
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
      field2591 = false;
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
               var8 = ModelData.ModelData_get(DirectByteArrayCopier.Widget_modelsArchive, var6, 0);
               if (var8 == null) {
                  field2591 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if (var5 == 2) {
               var8 = class90.getNpcDefinition(var6).getModelData();
               if (var8 == null) {
                  field2591 = true;
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
                  field2591 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if (var5 == 4) {
               ItemComposition var9 = class281.ItemDefinition_get(var6);
               var8 = var9.getModelData(10);
               if (var8 == null) {
                  field2591 = true;
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lht;",
      garbageValue = "202613287"
   )
   @Export("getSpriteMask")
   public SpriteMask getSpriteMask(boolean var1) {
      if (this.spriteId == -1) {
         var1 = false;
      }

      int var2 = var1 ? this.spriteId : this.spriteId2;
      if (var2 == -1) {
         return null;
      } else {
         long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
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

               for(int var10 = 0; var10 < var7.subHeight; ++var10) {
                  int var11 = 0;
                  int var12 = var7.subWidth;

                  int var13;
                  for(var13 = 0; var13 < var7.subWidth; ++var13) {
                     if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
                        var11 = var13;
                        break;
                     }
                  }

                  for(var13 = var7.subWidth - 1; var13 >= var11; --var13) {
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)V",
      garbageValue = "-44"
   )
   @Export("setAction")
   public void setAction(int var1, String var2) {
      if (this.actions == null || this.actions.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if (this.actions != null) {
            for(int var4 = 0; var4 < this.actions.length; ++var4) {
               var3[var4] = this.actions[var4];
            }
         }

         this.actions = var3;
      }

      this.actions[var1] = var2;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "-2098441807"
   )
   static int method4292(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.LOGOUT) {
         Client.logoutTimer = 250;
         return 1;
      } else if (var0 != 5631 && var0 != 5633) {
         if (var0 == 5632) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 26;
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_stringStackSize -= 2;
         return 1;
      }
   }
}
