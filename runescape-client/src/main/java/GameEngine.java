import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
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

@ObfuscatedName("at")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1498790041
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 7720778366731398503L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("o")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 754696353
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1982167591
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1753142183
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1142540823
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("f")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("h")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2048752203
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 378406057
	)
	static int field201;
	@ObfuscatedName("ai")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 7606602990836244853L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8091498223912527939L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("g")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -288639993
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1761448385
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1295061587
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2019603919
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -966863735
	)
	int field217;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1495548179
	)
	int field214;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1590080853
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 641620781
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("at")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("as")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ae")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("an")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ab")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -6826764741778154917L
	)
	volatile long field210;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aj")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ap")
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
		field201 = 500;
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
		this.field210 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		UrlRequester.method2368(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-21272"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method456();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1690521286"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				PlayerType.method5099(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lew;",
		garbageValue = "1587447732"
	)
	@Export("mouseWheel")
	protected class144 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1730980271"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-430"
	)
	protected void method443(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1652260667"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2001674855"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class117.method2501(this.canvas);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "865343613"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field217);
			this.contentHeight = Math.max(var2.highY, this.field214);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			InvDefinition.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - InvDefinition.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(InvDefinition.canvasWidth, canvasHeight);
			class11.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, canvasHeight, this.canvas);
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "104493179"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2089889845"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - InvDefinition.canvasWidth - var1;
		int var4 = this.contentHeight - canvasHeight - var2;
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1979005872"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field128 = -1;
		java.awt.Canvas var2 = this.canvas;
		var2.removeMouseListener(MouseHandler.MouseHandler_instance);
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var3 = this.canvas;
		var3.setFocusTraversalKeysEnabled(false);
		var3.addKeyListener(KeyHandler.KeyHandler_instance);
		var3.addFocusListener(KeyHandler.KeyHandler_instance);
		class117.method2501(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method456();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-58"
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
			InvDefinition.canvasWidth = var1;
			canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class4.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1993072824"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		InvDefinition.canvasWidth = Math.max(var1.getWidth(), this.field217);
		canvasHeight = Math.max(var1.getHeight(), this.field214);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			InvDefinition.canvasWidth -= var2.left + var2.right;
			canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(InvDefinition.canvasWidth, canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class11.rasterProvider != null && InvDefinition.canvasWidth == class11.rasterProvider.width && canvasHeight == class11.rasterProvider.height) {
			((RasterProvider)class11.rasterProvider).setComponent(this.canvas);
			class11.rasterProvider.drawFull(0, 0);
		} else {
			class11.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field210 = Occluder.method4335();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Occluder.method4335();
		long var3 = clientTickTimes[class78.field1019];
		clientTickTimes[class78.field1019] = var1;
		class78.field1019 = class78.field1019 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			Archive.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-947"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = Occluder.method4335();
		long var4 = graphicsTickTimes[Varcs.field1266];
		graphicsTickTimes[Varcs.field1266] = var2;
		Varcs.field1266 = Varcs.field1266 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field201 - 1 > 50) {
			field201 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(InvDefinition.canvasWidth, canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method453();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-97"
	)
	final void method453() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-703667251"
	)
	final void method456() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
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

			this.vmethod1443();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1304769230"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1834579741"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "1"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (Decimator.fontHelvetica13 == null) {
				Decimator.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				Occluder.loginScreenFontMetrics = this.canvas.getFontMetrics(Decimator.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, InvDefinition.canvasWidth, canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class130.field1489 == null) {
					class130.field1489 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class130.field1489.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(Decimator.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - Occluder.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class130.field1489, InvDefinition.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = InvDefinition.canvasWidth / 2 - 152;
				int var8 = canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(Decimator.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - Occluder.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-44135249"
	)
	protected final void method465() {
		class130.field1489 = null;
		Decimator.fontHelvetica13 = null;
		Occluder.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-83"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-426198040"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lmt;",
		garbageValue = "-2130903858"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field217);
		int var3 = Math.max(var1.getHeight(), this.field214);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-225846301"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1327639479"
	)
	protected abstract void vmethod1443();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Occluder.method4335();
			PlayerType.method5099(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (Occluder.method4335() - this.field210 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= InvDefinition.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Occluder.method4335() + 4000L;
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
						for (var3 = 6; var3 < var2.length() && FaceNormal.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Timer.isNumber(var4) && GrandExchangeOfferAgeComparator.method5303(var4) < 10) {
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

			class122.clock = (Clock)var8;

			while (stopTimeMs == 0L || Occluder.method4335() < stopTimeMs) {
				gameCyclesToDo = class122.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class4.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}
}
