import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
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

@ObfuscatedName("ay")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 997222287
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 5452737720301901037L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("m")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1021542923
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 115124095
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1771635901
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1720266437
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("s")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 261633385
	)
	static int field189;
	@ObfuscatedName("b")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ah")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1523559739
	)
	static int field200;
	@ObfuscatedName("ap")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6264958768936891363L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2125926651661480101L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("k")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -712859225
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -967675265
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -741575651
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1158546781
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 583786985
	)
	int field179;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1417825827
	)
	int field193;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1730708465
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -322414797
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ay")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("al")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ao")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ag")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aq")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6172438691100776965L
	)
	volatile long field203;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("av")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field200 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field203 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		GraphicsObject.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method462();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1628524412"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class121.method2542(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lec;",
		garbageValue = "-1260959118"
	)
	@Export("mouseWheel")
	protected class144 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1813234694"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	protected void method450(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-79671387"
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

		class12.method157(this.canvas);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1100115563"
	)
	protected final void method452() {
		class131.method2690(this.canvas);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494856599"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field179);
			this.contentHeight = Math.max(var2.highY, this.field193);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			Huffman.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			MouseRecorder.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - Huffman.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(Huffman.canvasWidth, MouseRecorder.canvasHeight);
			class244.rasterProvider = new RasterProvider(Huffman.canvasWidth, MouseRecorder.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1526531599"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-642312042"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - Huffman.canvasWidth - var1;
		int var4 = this.contentHeight - MouseRecorder.canvasHeight - var2;
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
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field123 = -1;
		java.awt.Canvas var2 = this.canvas;
		var2.removeMouseListener(MouseHandler.MouseHandler_instance);
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		class12.method157(this.canvas);
		class131.method2690(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method462();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "346411464"
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
			Huffman.canvasWidth = var1;
			MouseRecorder.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			Timer.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1804120842"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		Huffman.canvasWidth = Math.max(var1.getWidth(), this.field179);
		MouseRecorder.canvasHeight = Math.max(var1.getHeight(), this.field193);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			Huffman.canvasWidth -= var2.left + var2.right;
			MouseRecorder.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(Huffman.canvasWidth, MouseRecorder.canvasHeight);
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
		if (class244.rasterProvider != null && Huffman.canvasWidth == class244.rasterProvider.width && MouseRecorder.canvasHeight == class244.rasterProvider.height) {
			((RasterProvider)class244.rasterProvider).setComponent(this.canvas);
			class244.rasterProvider.drawFull(0, 0);
		} else {
			class244.rasterProvider = new RasterProvider(Huffman.canvasWidth, MouseRecorder.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field203 = UserComparator4.method2406();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1617567570"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UserComparator4.method2406();
		long var3 = clientTickTimes[class139.field1537];
		clientTickTimes[class139.field1537] = var1;
		class139.field1537 = class139.field1537 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			KitDefinition.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1115374200"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = UserComparator4.method2406();
		long var4 = graphicsTickTimes[field189];
		graphicsTickTimes[field189] = var2;
		field189 = field189 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field200 - 1 > 50) {
			field200 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(Huffman.canvasWidth, MouseRecorder.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method461();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-341516966"
	)
	final void method461() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	final void method462() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1738301151"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1165();
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "940201361"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1675225894"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-296185885"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "2025094069"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class185.fontHelvetica13 == null) {
				class185.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				loginScreenFontMetrics = this.canvas.getFontMetrics(class185.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, Huffman.canvasWidth, MouseRecorder.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class1.field3 == null) {
					class1.field3 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class1.field3.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class185.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class1.field3, Huffman.canvasWidth / 2 - 152, MouseRecorder.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = Huffman.canvasWidth / 2 - 152;
				int var8 = MouseRecorder.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class185.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1537678468"
	)
	protected final void method474() {
		class1.field3 = null;
		class185.fontHelvetica13 = null;
		loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-225365347"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "306371774"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "-1028709613"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field179);
		int var3 = Math.max(var1.getHeight(), this.field193);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1668739330"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1826906753"
	)
	protected abstract void vmethod1165();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator4.method2406();
			class121.method2542(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (UserComparator4.method2406() - this.field203 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Huffman.canvasWidth && var2.height >= MouseRecorder.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

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
						for (var3 = 6; var3 < var2.length() && class65.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (LoginType.isNumber(var4) && class279.method5134(var4) < 10) {
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
			LoginPacket.clock = AbstractWorldMapIcon.method3943();

			while (stopTimeMs == 0L || UserComparator4.method2406() < stopTimeMs) {
				gameCyclesToDo = LoginPacket.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			Timer.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator4.method2406() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public abstract void init();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "83"
	)
	static final boolean method510() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljt;I)Ljava/lang/String;",
		garbageValue = "-1670482877"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (Interpreter.Widget_unpackTargetMask(WorldMapRegion.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
