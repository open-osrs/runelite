import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lfu;"
   )
   @Export("taskHandler")
   protected static TaskHandler taskHandler;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lbt;"
   )
   @Export("gameEngine")
   static GameEngine gameEngine = null;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1172672455
   )
   @Export("GameEngine_redundantStartThreadCount")
   static int GameEngine_redundantStartThreadCount = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      longValue = -8672480776898647035L
   )
   @Export("stopTimeMs")
   static long stopTimeMs = 0L;
   @ObfuscatedName("h")
   @Export("isKilled")
   static boolean isKilled = false;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1471054529
   )
   @Export("cycleDurationMillis")
   static int cycleDurationMillis = 20;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1858214361
   )
   @Export("fiveOrOne")
   static int fiveOrOne = 1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -860232961
   )
   @Export("fps")
   protected static int fps = 0;
   @ObfuscatedName("k")
   @Export("graphicsTickTimes")
   protected static long[] graphicsTickTimes = new long[32];
   @ObfuscatedName("f")
   @Export("clientTickTimes")
   protected static long[] clientTickTimes = new long[32];
   @ObfuscatedName("ax")
   static Image field480;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -855219925
   )
   static int field481 = 500;
   @ObfuscatedName("an")
   @Export("volatileFocus")
   static volatile boolean volatileFocus = true;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = 1354253672444800547L
   )
   @Export("garbageCollectorLastCollectionTime")
   static long garbageCollectorLastCollectionTime = -1L;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      longValue = 7149663946399436317L
   )
   @Export("garbageCollectorLastCheckTimeMs")
   static long garbageCollectorLastCheckTimeMs = -1L;
   @ObfuscatedName("z")
   @Export("hasErrored")
   boolean hasErrored = false;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -250488397
   )
   @Export("contentWidth")
   protected int contentWidth;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -100223911
   )
   @Export("contentHeight")
   protected int contentHeight;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -99597119
   )
   @Export("canvasX")
   int canvasX = 0;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2031980453
   )
   @Export("canvasY")
   int canvasY = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -2105446269
   )
   int field473;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -501888553
   )
   int field460;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1655080689
   )
   @Export("maxCanvasWidth")
   int maxCanvasWidth;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 892249971
   )
   @Export("maxCanvasHeight")
   int maxCanvasHeight;
   @ObfuscatedName("aq")
   @Export("frame")
   Frame frame;
   @ObfuscatedName("at")
   @Export("canvas")
   java.awt.Canvas canvas;
   @ObfuscatedName("ak")
   @Export("fullRedraw")
   volatile boolean fullRedraw = true;
   @ObfuscatedName("al")
   @Export("resizeCanvasNextFrame")
   boolean resizeCanvasNextFrame = false;
   @ObfuscatedName("aa")
   @Export("isCanvasInvalid")
   volatile boolean isCanvasInvalid = false;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = -8976229610863512045L
   )
   volatile long field484 = 0L;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   @Export("mouseWheelHandler")
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("ap")
   @Export("clipboard")
   Clipboard clipboard;
   @ObfuscatedName("aj")
   @Export("eventQueue")
   final EventQueue eventQueue;

   protected GameEngine() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.eventQueue = var1;
      DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
      class2.pcmPlayerProvider = var2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-420237579"
   )
   @Export("setMaxCanvasSize")
   protected final void setMaxCanvasSize(int var1, int var2) {
      if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
         this.method1007();
      }

      this.maxCanvasWidth = var1;
      this.maxCanvasHeight = var2;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;I)V",
      garbageValue = "2080596148"
   )
   @Export("post")
   final void post(Object var1) {
      if (this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            ApproximateRouteStrategy.sleepExact(1L);
         }

         if (var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lfo;",
      garbageValue = "-1572437052"
   )
   @Export("mouseWheel")
   protected MouseWheel mouseWheel() {
      if (this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.addTo(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "84"
   )
   @Export("setUpClipboard")
   protected void setUpClipboard() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-775361579"
   )
   @Export("clipboardSetString")
   protected void clipboardSetString(String var1) {
      this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-367283277"
   )
   @Export("setUpKeyboard")
   protected final void setUpKeyboard() {
      if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         KeyHandler.KeyHandler_keyCodes[186] = 57;
         KeyHandler.KeyHandler_keyCodes[187] = 27;
         KeyHandler.KeyHandler_keyCodes[188] = 71;
         KeyHandler.KeyHandler_keyCodes[189] = 26;
         KeyHandler.KeyHandler_keyCodes[190] = 72;
         KeyHandler.KeyHandler_keyCodes[191] = 73;
         KeyHandler.KeyHandler_keyCodes[192] = 58;
         KeyHandler.KeyHandler_keyCodes[219] = 42;
         KeyHandler.KeyHandler_keyCodes[220] = 74;
         KeyHandler.KeyHandler_keyCodes[221] = 43;
         KeyHandler.KeyHandler_keyCodes[222] = 59;
         KeyHandler.KeyHandler_keyCodes[223] = 28;
      } else {
         KeyHandler.KeyHandler_keyCodes[44] = 71;
         KeyHandler.KeyHandler_keyCodes[45] = 26;
         KeyHandler.KeyHandler_keyCodes[46] = 72;
         KeyHandler.KeyHandler_keyCodes[47] = 73;
         KeyHandler.KeyHandler_keyCodes[59] = 57;
         KeyHandler.KeyHandler_keyCodes[61] = 27;
         KeyHandler.KeyHandler_keyCodes[91] = 42;
         KeyHandler.KeyHandler_keyCodes[92] = 74;
         KeyHandler.KeyHandler_keyCodes[93] = 43;
         KeyHandler.KeyHandler_keyCodes[192] = 28;
         KeyHandler.KeyHandler_keyCodes[222] = 58;
         KeyHandler.KeyHandler_keyCodes[520] = 59;
      }

      java.awt.Canvas var1 = this.canvas;
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(KeyHandler.KeyHandler_instance);
      var1.addFocusListener(KeyHandler.KeyHandler_instance);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1149446926"
   )
   @Export("setUpMouse")
   protected final void setUpMouse() {
      WorldMapArea.method489(this.canvas);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1907084559"
   )
   @Export("resizeCanvas")
   final void resizeCanvas() {
      Container var1 = this.container();
      if (var1 != null) {
         Bounds var2 = this.getFrameContentBounds();
         this.contentWidth = Math.max(var2.highX, this.field473);
         this.contentHeight = Math.max(var2.highY, this.field460);
         if (this.contentWidth <= 0) {
            this.contentWidth = 1;
         }

         if (this.contentHeight <= 0) {
            this.contentHeight = 1;
         }

         GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
         class25.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
         this.canvasX = (this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth) / 2;
         this.canvasY = 0;
         this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight);
         FileSystem.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, this.canvas);
         if (var1 == this.frame) {
            Insets var3 = this.frame.getInsets();
            this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
         } else {
            this.canvas.setLocation(this.canvasX, this.canvasY);
         }

         this.fullRedraw = true;
         this.resizeGame();
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-226650241"
   )
   @Export("resizeGame")
   protected abstract void resizeGame();

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-998749826"
   )
   @Export("clearBackground")
   void clearBackground() {
      int var1 = this.canvasX;
      int var2 = this.canvasY;
      int var3 = this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth - var1;
      int var4 = this.contentHeight - class25.canvasHeight - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.container();
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.frame) {
               Insets var8 = this.frame.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.contentHeight);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, this.contentWidth, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-14"
   )
   @Export("replaceCanvas")
   final void replaceCanvas() {
      PlayerType.method4345(this.canvas);
      java.awt.Canvas var1 = this.canvas;
      var1.removeMouseListener(MouseHandler.MouseHandler_instance);
      var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var1.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.removeFrom(this.canvas);
      }

      this.addCanvas();
      java.awt.Canvas var2 = this.canvas;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(KeyHandler.KeyHandler_instance);
      var2.addFocusListener(KeyHandler.KeyHandler_instance);
      WorldMapArea.method489(this.canvas);
      if (this.mouseWheelHandler != null) {
         this.mouseWheelHandler.addTo(this.canvas);
      }

      this.method1007();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2060658023"
   )
   @Export("startThread")
   protected final void startThread(int var1, int var2, int var3) {
      try {
         if (gameEngine != null) {
            ++GameEngine_redundantStartThreadCount;
            if (GameEngine_redundantStartThreadCount >= 3) {
               this.error("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         gameEngine = this;
         GrandExchangeOfferTotalQuantityComparator.canvasWidth = var1;
         class25.canvasHeight = var2;
         RunException.RunException_revision = var3;
         RunException.RunException_applet = this;
         if (taskHandler == null) {
            taskHandler = new TaskHandler();
         }

         taskHandler.newThreadTask(this, 1);
      } catch (Exception var5) {
         SequenceDefinition.RunException_sendStackTrace((String)null, var5);
         this.error("crash");
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "128"
   )
   @Export("addCanvas")
   final synchronized void addCanvas() {
      Container var1 = this.container();
      if (this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.max(var1.getWidth(), this.field473);
      class25.canvasHeight = Math.max(var1.getHeight(), this.field460);
      Insets var2;
      if (this.frame != null) {
         var2 = this.frame.getInsets();
         GrandExchangeOfferTotalQuantityComparator.canvasWidth -= var2.right + var2.left;
         class25.canvasHeight -= var2.top + var2.bottom;
      }

      this.canvas = new Canvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.canvas);
      this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if (var1 == this.frame) {
         var2 = this.frame.getInsets();
         this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY);
      } else {
         this.canvas.setLocation(this.canvasX, this.canvasY);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.fullRedraw = true;
      if (FileSystem.rasterProvider != null && GrandExchangeOfferTotalQuantityComparator.canvasWidth == FileSystem.rasterProvider.width && class25.canvasHeight == FileSystem.rasterProvider.height) {
         ((RasterProvider)FileSystem.rasterProvider).setComponent(this.canvas);
         FileSystem.rasterProvider.drawFull(0, 0);
      } else {
         FileSystem.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, this.canvas);
      }

      this.isCanvasInvalid = false;
      this.field484 = Tiles.currentTimeMillis();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1882599672"
   )
   @Export("checkHost")
   protected final boolean checkHost() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.error("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("clientTick")
   void clientTick() {
      long var1 = Tiles.currentTimeMillis();
      long var3 = clientTickTimes[WallDecoration.clientTickTimeIdx];
      clientTickTimes[WallDecoration.clientTickTimeIdx] = var1;
      WallDecoration.clientTickTimeIdx = WallDecoration.clientTickTimeIdx + 1 & 31;
      if (0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         PcmPlayer.hasFocus = volatileFocus;
      }

      this.doCycle();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "548741005"
   )
   @Export("graphicsTick")
   void graphicsTick() {
      Container var1 = this.container();
      long var2 = Tiles.currentTimeMillis();
      long var4 = graphicsTickTimes[class60.graphicsTickTimeIdx];
      graphicsTickTimes[class60.graphicsTickTimeIdx] = var2;
      class60.graphicsTickTimeIdx = class60.graphicsTickTimeIdx + 1 & 31;
      if (var4 != 0L && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6;
      }

      if (++field481 - 1 > 50) {
         field481 -= 50;
         this.fullRedraw = true;
         this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight);
         this.canvas.setVisible(true);
         if (var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
         } else {
            this.canvas.setLocation(this.canvasX, this.canvasY);
         }
      }

      if (this.isCanvasInvalid) {
         this.replaceCanvas();
      }

      this.method1103();
      this.draw(this.fullRedraw);
      if (this.fullRedraw) {
         this.clearBackground();
      }

      this.fullRedraw = false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   final void method1103() {
      Bounds var1 = this.getFrameContentBounds();
      if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
         this.resizeCanvas();
         this.resizeCanvasNextFrame = false;
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-17755841"
   )
   final void method1007() {
      this.resizeCanvasNextFrame = true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1467969246"
   )
   @Export("kill")
   final synchronized void kill() {
      if (!isKilled) {
         isKilled = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.kill0();
         } catch (Exception var4) {
            ;
         }

         if (this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if (taskHandler != null) {
            try {
               taskHandler.close();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod1423();
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-337269105"
   )
   @Export("setUp")
   protected abstract void setUp();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-123"
   )
   @Export("doCycle")
   protected abstract void doCycle();

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1888023388"
   )
   @Export("draw")
   protected abstract void draw(boolean var1);

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1925350941"
   )
   @Export("kill0")
   protected abstract void kill0();

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;ZS)V",
      garbageValue = "239"
   )
   @Export("drawInitial")
   protected final void drawInitial(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if (WorldMapIcon_0.fontHelvetica13 == null) {
            WorldMapIcon_0.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
            GrandExchangeOfferAgeComparator.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapIcon_0.fontHelvetica13);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (field480 == null) {
               field480 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = field480.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(WorldMapIcon_0.fontHelvetica13);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - GrandExchangeOfferAgeComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
            var4.drawImage(field480, GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152, class25.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152;
            int var8 = class25.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(WorldMapIcon_0.fontHelvetica13);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - GrandExchangeOfferAgeComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1187634060"
   )
   protected final void method1078() {
      field480 = null;
      WorldMapIcon_0.fontHelvetica13 = null;
      GrandExchangeOfferAgeComparator.loginScreenFontMetrics = null;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "120"
   )
   @Export("error")
   protected void error(String var1) {
      if (!this.hasErrored) {
         this.hasErrored = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/awt/Container;",
      garbageValue = "-838247309"
   )
   @Export("container")
   Container container() {
      return (Container)(this.frame != null ? this.frame : this);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lli;",
      garbageValue = "-1070651105"
   )
   @Export("getFrameContentBounds")
   Bounds getFrameContentBounds() {
      Container var1 = this.container();
      int var2 = Math.max(var1.getWidth(), this.field473);
      int var3 = Math.max(var1.getHeight(), this.field460);
      if (this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.bottom + var4.top;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-697132291"
   )
   @Export("hasFrame")
   protected final boolean hasFrame() {
      return this.frame != null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "103"
   )
   protected abstract void vmethod1423();

   public final void destroy() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = Tiles.currentTimeMillis();
         ApproximateRouteStrategy.sleepExact(5000L);
         this.kill();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if (this == gameEngine && !isKilled) {
         this.fullRedraw = true;
         if (Tiles.currentTimeMillis() - this.field484 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= GrandExchangeOfferTotalQuantityComparator.canvasWidth && var2.height >= class25.canvasHeight) {
               this.isCanvasInvalid = true;
            }
         }

      }
   }

   public abstract void init();

   public void run() {
      try {
         if (TaskHandler.javaVendor != null) {
            String var1 = TaskHandler.javaVendor.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = TaskHandler.javaVersion;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.error("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && Strings.isDigit(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if (WorldMapDecoration.isNumber(var4) && class217.parseInt(var4) < 10) {
                     this.error("wrongjava");
                     return;
                  }
               }

               fiveOrOne = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.addCanvas();
         this.setUp();

         Object var8;
         try {
            var8 = new NanoClock();
         } catch (Throwable var6) {
            var8 = new MilliClock();
         }

         WorldMapSprite.clock = (Clock)var8;

         while(stopTimeMs == 0L || Tiles.currentTimeMillis() < stopTimeMs) {
            VertexNormal.gameCyclesToDo = WorldMapSprite.clock.wait(cycleDurationMillis, fiveOrOne);

            for(int var5 = 0; var5 < VertexNormal.gameCyclesToDo; ++var5) {
               this.clientTick();
            }

            this.graphicsTick();
            this.post(this.canvas);
         }
      } catch (Exception var7) {
         SequenceDefinition.RunException_sendStackTrace((String)null, var7);
         this.error("crash");
      }

      this.kill();
   }

   public final void stop() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = Tiles.currentTimeMillis() + 4000L;
      }
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void start() {
      if (this == gameEngine && !isKilled) {
         stopTimeMs = 0L;
      }
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void focusLost(FocusEvent var1) {
      volatileFocus = false;
   }

   public final void focusGained(FocusEvent var1) {
      volatileFocus = true;
      this.fullRedraw = true;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[Lje;",
      garbageValue = "1729948471"
   )
   static HorizontalAlignment[] method1137() {
      return new HorizontalAlignment[]{HorizontalAlignment.field3494, HorizontalAlignment.field3490, HorizontalAlignment.HorizontalAlignment_centered};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILeq;Lfe;I)V",
      garbageValue = "1508002032"
   )
   static final void method1134(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
      if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
         if (var0 < Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = var0;
         }

         ObjectComposition var8 = WorldMapAreaData.getObjectDefinition(var3);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.sizeX;
            var10 = var8.sizeY;
         } else {
            var9 = var8.sizeY;
            var10 = var8.sizeX;
         }

         int var11;
         int var12;
         if (var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = Tiles.Tiles_heights[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = TextureProvider.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.int3 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if (var8.hasSound()) {
            ObjectSound var22 = new ObjectSound();
            var22.plane = var0;
            var22.x = var1 * 128;
            var22.y = var2 * 128;
            var23 = var8.sizeX;
            var24 = var8.sizeY;
            if (var4 == 1 || var4 == 3) {
               var23 = var8.sizeY;
               var24 = var8.sizeX;
            }

            var22.field1090 = (var23 + var1) * 128;
            var22.field1094 = (var24 + var2) * 128;
            var22.soundEffectId = var8.ambientSoundId;
            var22.field1092 = var8.int4 * 128;
            var22.field1095 = var8.int5;
            var22.field1096 = var8.int6;
            var22.soundEffectIds = var8.soundEffectIds;
            if (var8.transforms != null) {
               var22.obj = var8;
               var22.set();
            }

            ObjectSound.objectSounds.addFirst(var22);
            if (var22.soundEffectIds != null) {
               var22.field1097 = var22.field1095 + (int)(Math.random() * (double)(var22.field1096 - var22.field1095));
            }
         }

         Object var34;
         if (var5 == 22) {
            if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
               }

               var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
               if (var8.interactType == 1 && var7 != null) {
                  var7.setBlockedByFloorDec(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            if (var5 >= 12) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
               }

               var6.method3400(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class2.field12[var0][var1][var2] |= 2340;
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
               }

            } else if (var5 == 0) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field521[var4], 0, var19, var21);
               if (var4 == 0) {
                  if (var8.clipped) {
                     TaskHandler.field2045[var0][var1][var2] = 50;
                     TaskHandler.field2045[var0][var1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     class2.field12[var0][var1][var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var8.clipped) {
                     TaskHandler.field2045[var0][var1][var2 + 1] = 50;
                     TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     class2.field12[var0][var1][var2 + 1] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var8.clipped) {
                     TaskHandler.field2045[var0][var1 + 1][var2] = 50;
                     TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     class2.field12[var0][var1 + 1][var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var8.clipped) {
                     TaskHandler.field2045[var0][var1][var2] = 50;
                     TaskHandler.field2045[var0][var1 + 1][var2] = 50;
                  }

                  if (var8.modelClipped) {
                     class2.field12[var0][var1][var2] |= 1170;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method3749(var1, var2, var5, var4, var8.boolean1);
               }

               if (var8.int2 != 16) {
                  var6.method3258(var0, var1, var2, var8.int2);
               }

            } else if (var5 == 1) {
               if (var8.animationId == -1 && var8.transforms == null) {
                  var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
               }

               var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field514[var4], 0, var19, var21);
               if (var8.clipped) {
                  if (var4 == 0) {
                     TaskHandler.field2045[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     TaskHandler.field2045[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     TaskHandler.field2045[var0][var1][var2] = 50;
                  }
               }

               if (var8.interactType != 0 && var7 != null) {
                  var7.method3749(var1, var2, var5, var4, var8.boolean1);
               }

            } else {
               int var28;
               if (var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var31;
                  Object var32;
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
                     var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
                  } else {
                     var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                     var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field521[var4], Tiles.field521[var28], var19, var21);
                  if (var8.modelClipped) {
                     if (var4 == 0) {
                        class2.field12[var0][var1][var2] |= 585;
                        class2.field12[var0][var1][var2 + 1] |= 1170;
                     } else if (var4 == 1) {
                        class2.field12[var0][var1][1 + var2] |= 1170;
                        class2.field12[var0][var1 + 1][var2] |= 585;
                     } else if (var4 == 2) {
                        class2.field12[var0][var1 + 1][var2] |= 585;
                        class2.field12[var0][var1][var2] |= 1170;
                     } else if (var4 == 3) {
                        class2.field12[var0][var1][var2] |= 1170;
                        class2.field12[var0][var1][var2] |= 585;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method3749(var1, var2, var5, var4, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method3258(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 3) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                  }

                  var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field514[var4], 0, var19, var21);
                  if (var8.clipped) {
                     if (var4 == 0) {
                        TaskHandler.field2045[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        TaskHandler.field2045[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        TaskHandler.field2045[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.interactType != 0 && var7 != null) {
                     var7.method3749(var1, var2, var5, var4, var8.boolean1);
                  }

               } else if (var5 == 9) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                  }

                  var6.method3400(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
                  if (var8.interactType != 0 && var7 != null) {
                     var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
                  }

                  if (var8.int2 != 16) {
                     var6.method3258(var0, var1, var2, var8.int2);
                  }

               } else if (var5 == 4) {
                  if (var8.animationId == -1 && var8.transforms == null) {
                     var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                  }

                  var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field521[var4], 0, 0, 0, var19, var21);
               } else {
                  Object var25;
                  long var29;
                  if (var5 == 5) {
                     var28 = 16;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field521[var4], 0, var28 * Tiles.field523[var4], var28 * Tiles.field527[var4], var19, var21);
                  } else if (var5 == 6) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2 / 2;
                     }

                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field525[var4], var28 * Tiles.field526[var4], var19, var21);
                  } else if (var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
                  } else if (var5 == 8) {
                     var28 = 8;
                     var29 = var6.getBoundaryObjectTag(var0, var1, var2);
                     if (0L != var29) {
                        var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2 / 2;
                     }

                     int var27 = var4 + 2 & 3;
                     Object var26;
                     if (var8.animationId == -1 && var8.transforms == null) {
                        var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
                        var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
                     } else {
                        var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                        var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
                     }

                     var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field525[var4], var28 * Tiles.field526[var4], var19, var21);
                  }
               }
            }
         } else {
            if (var8.animationId == -1 && var8.transforms == null) {
               var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null);
            }

            if (var34 != null && var6.method3400(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
               var23 = 15;
               if (var34 instanceof Model) {
                  var23 = ((Model)var34).method3079() / 4;
                  if (var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var33 = 0; var33 <= var10; ++var33) {
                     if (var23 > TaskHandler.field2045[var0][var24 + var1][var33 + var2]) {
                        TaskHandler.field2045[var0][var24 + var1][var33 + var2] = (byte)var23;
                     }
                  }
               }
            }

            if (var8.interactType != 0 && var7 != null) {
               var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
            }

         }
      }
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-325844225"
   )
   @Export("load")
   static void load() {
      int var14;
      if (Client.titleLoadingStage == 0) {
         MilliClock.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14] = new CollisionMap(104, 104);
         }

         GrandExchangeOfferAgeComparator.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         class52.archive0 = ViewportMouse.newArchive(0, false, true, true);
         SpriteMask.archive1 = ViewportMouse.newArchive(1, false, true, true);
         WorldMapIcon_0.archive2 = ViewportMouse.newArchive(2, true, false, true);
         PlayerComposition.archive3 = ViewportMouse.newArchive(3, false, true, true);
         WorldMapCacheName.archive4 = ViewportMouse.newArchive(4, false, true, true);
         class8.archive5 = ViewportMouse.newArchive(5, true, true, true);
         UrlRequester.archive6 = ViewportMouse.newArchive(6, true, true, true);
         WorldMapData_0.archive7 = ViewportMouse.newArchive(7, false, true, true);
         ModeWhere.archive8 = ViewportMouse.newArchive(8, false, true, true);
         ViewportMouse.archive9 = ViewportMouse.newArchive(9, false, true, true);
         LoginScreenAnimation.archive10 = ViewportMouse.newArchive(10, false, true, true);
         WorldMapManager.archive11 = ViewportMouse.newArchive(11, false, true, true);
         WorldMapSection0.archive12 = ViewportMouse.newArchive(12, false, true, true);
         CollisionMap.archive13 = ViewportMouse.newArchive(13, true, false, true);
         Tiles.archive14 = ViewportMouse.newArchive(14, false, true, true);
         SpriteMask.archive15 = ViewportMouse.newArchive(15, false, true, true);
         ItemComposition.archive17 = ViewportMouse.newArchive(17, true, true, true);
         class25.archive18 = ViewportMouse.newArchive(18, false, true, true);
         ArchiveLoader.archive19 = ViewportMouse.newArchive(19, false, true, true);
         Login.archive20 = ViewportMouse.newArchive(20, false, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage == 40) {
         byte var25 = 0;
         var14 = var25 + class52.archive0.percentage() * 4 / 100;
         var14 += SpriteMask.archive1.percentage() * 4 / 100;
         var14 += WorldMapIcon_0.archive2.percentage() * 2 / 100;
         var14 += PlayerComposition.archive3.percentage() * 2 / 100;
         var14 += WorldMapCacheName.archive4.percentage() * 6 / 100;
         var14 += class8.archive5.percentage() * 4 / 100;
         var14 += UrlRequester.archive6.percentage() * 2 / 100;
         var14 += WorldMapData_0.archive7.percentage() * 56 / 100;
         var14 += ModeWhere.archive8.percentage() * 2 / 100;
         var14 += ViewportMouse.archive9.percentage() * 2 / 100;
         var14 += LoginScreenAnimation.archive10.percentage() * 2 / 100;
         var14 += WorldMapManager.archive11.percentage() * 2 / 100;
         var14 += WorldMapSection0.archive12.percentage() * 2 / 100;
         var14 += CollisionMap.archive13.percentage() * 2 / 100;
         var14 += Tiles.archive14.percentage() * 2 / 100;
         var14 += SpriteMask.archive15.percentage() * 2 / 100;
         var14 += ArchiveLoader.archive19.percentage() / 100;
         var14 += class25.archive18.percentage() / 100;
         var14 += Login.archive20.percentage() / 100;
         var14 += ItemComposition.archive17.method4461() && ItemComposition.archive17.isFullyLoaded() ? 1 : 0;
         if (var14 != 100) {
            if (var14 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var14 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            class217.method4155(class52.archive0, "Animations");
            class217.method4155(SpriteMask.archive1, "Skeletons");
            class217.method4155(WorldMapCacheName.archive4, "Sound FX");
            class217.method4155(class8.archive5, "Maps");
            class217.method4155(UrlRequester.archive6, "Music Tracks");
            class217.method4155(WorldMapData_0.archive7, "Models");
            class217.method4155(ModeWhere.archive8, "Sprites");
            class217.method4155(WorldMapManager.archive11, "Music Jingles");
            class217.method4155(Tiles.archive14, "Music Samples");
            class217.method4155(SpriteMask.archive15, "Music Patches");
            class217.method4155(ArchiveLoader.archive19, "World Map");
            class217.method4155(class25.archive18, "World Map Geography");
            class217.method4155(Login.archive20, "World Map Ground");
            class60.spriteIds = new GraphicsDefaults();
            class60.spriteIds.decode(ItemComposition.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      } else if (Client.titleLoadingStage == 45) {
         boolean var24 = !Client.isLowDetail;
         StructComposition.field3338 = 486202500;
         PcmPlayer.PcmPlayer_stereo = var24;
         PcmPlayer.field1419 = 2;
         MidiPcmStream var22 = new MidiPcmStream();
         var22.method3919(9, 128);
         class197.pcmPlayer0 = GrandExchangeOffer.method167(taskHandler, 0, 22050);
         class197.pcmPlayer0.setStream(var22);
         class69.method1256(SpriteMask.archive15, Tiles.archive14, WorldMapCacheName.archive4, var22);
         WorldMapDecorationType.pcmPlayer1 = GrandExchangeOffer.method167(taskHandler, 1, 2048);
         VarbitComposition.pcmStreamMixer = new PcmStreamMixer();
         WorldMapDecorationType.pcmPlayer1.setStream(VarbitComposition.pcmStreamMixer);
         World.decimator = new Decimator(22050, StructComposition.field3338 * 22050);
         Login.Login_loadingText = "Prepared sound engine";
         Login.Login_loadingPercent = 35;
         Client.titleLoadingStage = 50;
         class350.WorldMapElement_fonts = new Fonts(ModeWhere.archive8, CollisionMap.archive13);
      } else {
         int var1;
         if (Client.titleLoadingStage == 50) {
            FontName[] var20 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12};
            var1 = var20.length;
            Fonts var23 = class350.WorldMapElement_fonts;
            FontName[] var18 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12};
            Client.fontsMap = var23.createMap(var18);
            if (Client.fontsMap.size() < var1) {
               Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
               Login.Login_loadingPercent = 40;
            } else {
               SecureRandomCallable.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
               Login.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
               ScriptEvent.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
               GrandExchangeOfferUnitPriceComparator.platformInfo = Client.platformInfoProvider.get();
               Login.Login_loadingText = "Loaded fonts";
               Login.Login_loadingPercent = 40;
               Client.titleLoadingStage = 60;
            }
         } else {
            int var3;
            int var4;
            Archive var15;
            Archive var16;
            if (Client.titleLoadingStage == 60) {
               var15 = LoginScreenAnimation.archive10;
               var16 = ModeWhere.archive8;
               var3 = 0;
               if (var15.tryLoadFileByNames("title.jpg", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("logo", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("logo_deadman_mode", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("logo_seasonal_mode", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("titlebox", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("titlebutton", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("runes", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("title_mute", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("options_radio_buttons,0", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("options_radio_buttons,2", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("options_radio_buttons,4", "")) {
                  ++var3;
               }

               if (var16.tryLoadFileByNames("options_radio_buttons,6", "")) {
                  ++var3;
               }

               var16.tryLoadFileByNames("sl_back", "");
               var16.tryLoadFileByNames("sl_flags", "");
               var16.tryLoadFileByNames("sl_arrows", "");
               var16.tryLoadFileByNames("sl_stars", "");
               var16.tryLoadFileByNames("sl_button", "");
               var4 = WorldMapIcon_0.method286();
               if (var3 < var4) {
                  Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
                  Login.Login_loadingPercent = 50;
               } else {
                  Login.Login_loadingText = "Loaded title screen";
                  Login.Login_loadingPercent = 50;
                  ItemContainer.updateGameState(5);
                  Client.titleLoadingStage = 70;
               }
            } else if (Client.titleLoadingStage == 70) {
               if (!WorldMapIcon_0.archive2.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + WorldMapIcon_0.archive2.loadPercent() + "%";
                  Login.Login_loadingPercent = 60;
               } else {
                  class228.method4310(WorldMapIcon_0.archive2);
                  Archive var19 = WorldMapIcon_0.archive2;
                  FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var19;
                  class235.method4331(WorldMapIcon_0.archive2, WorldMapData_0.archive7);
                  Frames.method3429(WorldMapIcon_0.archive2, WorldMapData_0.archive7, Client.isLowDetail);
                  class3.method41(WorldMapIcon_0.archive2, WorldMapData_0.archive7);
                  DirectByteArrayCopier.method4147(WorldMapIcon_0.archive2);
                  var15 = WorldMapIcon_0.archive2;
                  var16 = WorldMapData_0.archive7;
                  boolean var21 = Client.isMembersWorld;
                  Font var17 = SecureRandomCallable.fontPlain11;
                  class299.ItemDefinition_archive = var15;
                  class8.ItemDefinition_modelArchive = var16;
                  Bounds.ItemDefinition_inMembersWorld = var21;
                  class52.ItemDefinition_fileCount = class299.ItemDefinition_archive.getGroupFileCount(10);
                  ItemComposition.ItemDefinition_fontPlain11 = var17;
                  TextureProvider.method2935(WorldMapIcon_0.archive2, class52.archive0, SpriteMask.archive1);
                  Archive var5 = WorldMapIcon_0.archive2;
                  Archive var6 = WorldMapData_0.archive7;
                  SpotAnimationDefinition.SpotAnimationDefinition_archive = var5;
                  SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var6;
                  Archive var7 = WorldMapIcon_0.archive2;
                  VarbitComposition.VarbitDefinition_archive = var7;
                  Archive var8 = WorldMapIcon_0.archive2;
                  VarpDefinition.VarpDefinition_archive = var8;
                  class58.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
                  MouseHandler.method1151(PlayerComposition.archive3, WorldMapData_0.archive7, ModeWhere.archive8, CollisionMap.archive13);
                  class217.method4154(WorldMapIcon_0.archive2);
                  Archive var9 = WorldMapIcon_0.archive2;
                  EnumComposition.EnumDefinition_archive = var9;
                  class22.method227(WorldMapIcon_0.archive2);
                  class197.method3828(WorldMapIcon_0.archive2);
                  GrandExchangeOffer.varcs = new Varcs();
                  StructComposition.method4734(WorldMapIcon_0.archive2, ModeWhere.archive8, CollisionMap.archive13);
                  UserComparator9.method3562(WorldMapIcon_0.archive2, ModeWhere.archive8);
                  Archive var10 = WorldMapIcon_0.archive2;
                  Archive var11 = ModeWhere.archive8;
                  WorldMapElement.WorldMapElement_archive = var11;
                  if (var10.isFullyLoaded()) {
                     WorldMapElement.WorldMapElement_count = var10.getGroupFileCount(35);
                     WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

                     for(int var12 = 0; var12 < WorldMapElement.WorldMapElement_count; ++var12) {
                        byte[] var13 = var10.takeFile(35, var12);
                        WorldMapElement.WorldMapElement_cached[var12] = new WorldMapElement(var12);
                        if (var13 != null) {
                           WorldMapElement.WorldMapElement_cached[var12].decode(new Buffer(var13));
                           WorldMapElement.WorldMapElement_cached[var12].method4576();
                        }
                     }
                  }

                  Login.Login_loadingText = "Loaded config";
                  Login.Login_loadingPercent = 60;
                  Client.titleLoadingStage = 80;
               }
            } else if (Client.titleLoadingStage == 80) {
               var14 = 0;
               if (LoginScreenAnimation.compass == null) {
                  LoginScreenAnimation.compass = BufferedSource.SpriteBuffer_getSprite(ModeWhere.archive8, class60.spriteIds.compass, 0);
               } else {
                  ++var14;
               }

               if (class236.redHintArrowSprite == null) {
                  class236.redHintArrowSprite = BufferedSource.SpriteBuffer_getSprite(ModeWhere.archive8, class60.spriteIds.field3847, 0);
               } else {
                  ++var14;
               }

               if (WorldMapSection1.mapSceneSprites == null) {
                  WorldMapSection1.mapSceneSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.mapScenes, 0);
               } else {
                  ++var14;
               }

               if (Client.headIconPkSprites == null) {
                  Client.headIconPkSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.headIconsPk, 0);
               } else {
                  ++var14;
               }

               if (class169.headIconPrayerSprites == null) {
                  class169.headIconPrayerSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3838, 0);
               } else {
                  ++var14;
               }

               if (class13.headIconHintSprites == null) {
                  class13.headIconHintSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3843, 0);
               } else {
                  ++var14;
               }

               if (GrandExchangeOfferWorldComparator.mapMarkerSprites == null) {
                  GrandExchangeOfferWorldComparator.mapMarkerSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3839, 0);
               } else {
                  ++var14;
               }

               if (Frames.crossSprites == null) {
                  Frames.crossSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3845, 0);
               } else {
                  ++var14;
               }

               if (ChatChannel.mapDotSprites == null) {
                  ChatChannel.mapDotSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3846, 0);
               } else {
                  ++var14;
               }

               if (ObjectSound.scrollBarSprites == null) {
                  ObjectSound.scrollBarSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.field3840, 0);
               } else {
                  ++var14;
               }

               if (Actor.modIconSprites == null) {
                  Actor.modIconSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.field3848, 0);
               } else {
                  ++var14;
               }

               if (var14 < 11) {
                  Login.Login_loadingText = "Loading sprites - " + var14 * 100 / 12 + "%";
                  Login.Login_loadingPercent = 70;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = Actor.modIconSprites;
                  class236.redHintArrowSprite.normalize();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  int var2 = (int)(Math.random() * 21.0D) - 10;
                  var3 = (int)(Math.random() * 21.0D) - 10;
                  var4 = (int)(Math.random() * 41.0D) - 20;
                  WorldMapSection1.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var4 + var3);
                  Login.Login_loadingText = "Loaded sprites";
                  Login.Login_loadingPercent = 70;
                  Client.titleLoadingStage = 90;
               }
            } else if (Client.titleLoadingStage == 90) {
               if (!ViewportMouse.archive9.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading textures - " + "0%";
                  Login.Login_loadingPercent = 90;
               } else {
                  BoundaryObject.textureProvider = new TextureProvider(ViewportMouse.archive9, ModeWhere.archive8, 20, WorldMapSectionType.clientPreferences.field1072, Client.isLowDetail ? 64 : 128);
                  Rasterizer3D.Rasterizer3D_setTextureLoader(BoundaryObject.textureProvider);
                  Rasterizer3D.Rasterizer3D_setBrightness(WorldMapSectionType.clientPreferences.field1072);
                  Client.titleLoadingStage = 100;
               }
            } else if (Client.titleLoadingStage == 100) {
               var14 = BoundaryObject.textureProvider.getLoadedPercentage();
               if (var14 < 100) {
                  Login.Login_loadingText = "Loading textures - " + var14 + "%";
                  Login.Login_loadingPercent = 90;
               } else {
                  Login.Login_loadingText = "Loaded textures";
                  Login.Login_loadingPercent = 90;
                  Client.titleLoadingStage = 110;
               }
            } else if (Client.titleLoadingStage == 110) {
               Friend.mouseRecorder = new MouseRecorder();
               taskHandler.newThreadTask(Friend.mouseRecorder, 10);
               Login.Login_loadingText = "Loaded input handler";
               Login.Login_loadingPercent = 92;
               Client.titleLoadingStage = 120;
            } else if (Client.titleLoadingStage == 120) {
               if (!LoginScreenAnimation.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                  Login.Login_loadingPercent = 94;
               } else {
                  Huffman var0 = new Huffman(LoginScreenAnimation.archive10.takeFileByNames("huffman", ""));
                  class219.huffman = var0;
                  Login.Login_loadingText = "Loaded wordpack";
                  Login.Login_loadingPercent = 94;
                  Client.titleLoadingStage = 130;
               }
            } else if (Client.titleLoadingStage == 130) {
               if (!PlayerComposition.archive3.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + PlayerComposition.archive3.loadPercent() * 4 / 5 + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!WorldMapSection0.archive12.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (80 + WorldMapSection0.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!CollisionMap.archive13.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (96 + CollisionMap.archive13.loadPercent() / 50) + "%";
                  Login.Login_loadingPercent = 96;
               } else {
                  Login.Login_loadingText = "Loaded interfaces";
                  Login.Login_loadingPercent = 98;
                  Client.titleLoadingStage = 140;
               }
            } else if (Client.titleLoadingStage == 140) {
               Login.Login_loadingPercent = 100;
               if (!ArchiveLoader.archive19.tryLoadGroupByName(WorldMapCacheName.field333.name)) {
                  Login.Login_loadingText = "Loading world map - " + ArchiveLoader.archive19.groupLoadPercentByName(WorldMapCacheName.field333.name) / 10 + "%";
               } else {
                  if (SoundSystem.worldMap == null) {
                     SoundSystem.worldMap = new WorldMap();
                     SoundSystem.worldMap.init(ArchiveLoader.archive19, class25.archive18, Login.archive20, ScriptEvent.fontBold12, Client.fontsMap, WorldMapSection1.mapSceneSprites);
                  }

                  Login.Login_loadingText = "Loaded world map";
                  Client.titleLoadingStage = 150;
               }
            } else if (Client.titleLoadingStage == 150) {
               ItemContainer.updateGameState(10);
            }
         }
      }
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1110901691"
   )
   @Export("addNpcsToScene")
   static final void addNpcsToScene(boolean var0) {
      for(int var1 = 0; var1 < Client.npcCount; ++var1) {
         NPC var2 = Client.npcs[Client.npcIndices[var1]];
         if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field1007 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
                     continue;
                  }

                  Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
               }

               long var5 = TextureProvider.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
               var2.playerCycle = Client.cycle;
               MilliClock.scene.drawEntity(class90.Client_plane, var2.x, var2.y, WorldMapRegion.getTileHeight(var2.field1007 * 64 - 64 + var2.x, var2.field1007 * 64 - 64 + var2.y, class90.Client_plane), var2.field1007 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
            }
         }
      }

   }
}
