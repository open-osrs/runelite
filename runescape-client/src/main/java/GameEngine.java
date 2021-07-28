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

@ObfuscatedName("c")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -572700985
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -8189016587990638143L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("l")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1722087711
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -739549633
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1954220685
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("a")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("u")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static Bounds field127;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -178817671
	)
	static int field117;
	@ObfuscatedName("ay")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5971536972929410603L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 951887522386488093L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("n")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 335914375
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1416349779
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1281897111
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1606064133
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 857323867
	)
	int field110;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -890185029
	)
	int field107;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 334692067
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2042851179
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("aa")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ab")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ax")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("as")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ao")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -5140593388388923075L
	)
	volatile long field120;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("af")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ar")
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
		field117 = 500;
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
		this.field120 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		World.method1428(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "705207797"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method256();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-32325713"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				SceneTilePaint.method4322(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Leo;",
		garbageValue = "1895135430"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1788933120"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "12"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1733808528"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		WorldMapLabel.method3650(this.canvas);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1967831367"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field110);
			this.contentHeight = Math.max(var2.highY, this.field107);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			MouseRecorder.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			Client.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - MouseRecorder.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(MouseRecorder.canvasWidth, Client.canvasHeight);
			class263.rasterProvider = new RasterProvider(MouseRecorder.canvasWidth, Client.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "160337006"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - MouseRecorder.canvasWidth - var1;
		int var4 = this.contentHeight - Client.canvasHeight - var2;
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3066"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field50 = -1;
		WorldMapSectionType.method3607(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var2 = this.canvas;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(KeyHandler.KeyHandler_instance);
		var2.addFocusListener(KeyHandler.KeyHandler_instance);
		WorldMapLabel.method3650(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method256();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-52889177"
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
			MouseRecorder.canvasWidth = var1;
			Client.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			BufferedSink.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "685533083"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		MouseRecorder.canvasWidth = Math.max(var1.getWidth(), this.field110);
		Client.canvasHeight = Math.max(var1.getHeight(), this.field107);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			MouseRecorder.canvasWidth -= var2.right + var2.left;
			Client.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(MouseRecorder.canvasWidth, Client.canvasHeight);
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
		if (class263.rasterProvider != null && MouseRecorder.canvasWidth == class263.rasterProvider.width && Client.canvasHeight == class263.rasterProvider.height) {
			((RasterProvider)class263.rasterProvider).setComponent(this.canvas);
			class263.rasterProvider.drawFull(0, 0);
		} else {
			class263.rasterProvider = new RasterProvider(MouseRecorder.canvasWidth, Client.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field120 = UrlRequester.method2125();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2067430375"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1079433901"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UrlRequester.method2125();
		long var3 = clientTickTimes[Buddy.field3863];
		clientTickTimes[Buddy.field3863] = var1;
		Buddy.field3863 = Buddy.field3863 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class255.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1862154561"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = UrlRequester.method2125();
		long var4 = graphicsTickTimes[FileSystem.field1484];
		graphicsTickTimes[FileSystem.field1484] = var2;
		FileSystem.field1484 = FileSystem.field1484 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field117 - 1 > 50) {
			field117 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(MouseRecorder.canvasWidth, Client.canvasHeight);
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

		this.method210();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-295553069"
	)
	final void method210() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1139596163"
	)
	final void method256() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1754382036"
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

			this.vmethod899();
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1217845372"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1475528453"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-232047700"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class6.fontHelvetica13 == null) {
				class6.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				UserComparator10.loginScreenFontMetrics = this.canvas.getFontMetrics(class6.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, MouseRecorder.canvasWidth, Client.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class54.field794 == null) {
					class54.field794 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class54.field794.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class6.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - UserComparator10.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class54.field794, MouseRecorder.canvasWidth / 2 - 152, Client.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = MouseRecorder.canvasWidth / 2 - 152;
				int var8 = Client.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class6.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - UserComparator10.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1859584500"
	)
	protected final void method224() {
		class54.field794 = null;
		class6.fontHelvetica13 = null;
		UserComparator10.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1367970758"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "75"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Llo;",
		garbageValue = "-70"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field110);
		int var3 = Math.max(var1.getHeight(), this.field107);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1916598411"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	protected abstract void vmethod899();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UrlRequester.method2125();
			SceneTilePaint.method4322(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (UrlRequester.method2125() - this.field120 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= MouseRecorder.canvasWidth && var2.height >= Client.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
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
						for (var3 = 6; var3 < var2.length() && GrandExchangeOfferAgeComparator.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class249.isNumber(var4) && NetCache.method5088(var4) < 10) {
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

			Messages.clock = (Clock)var8;

			while (stopTimeMs == 0L || UrlRequester.method2125() < stopTimeMs) {
				Skills.gameCyclesToDo = Messages.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < Skills.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			BufferedSink.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UrlRequester.method2125() + 4000L;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-14039"
	)
	public static boolean method345() {
		try {
			if (class234.musicPlayerStatus == 2) {
				if (WorldMapLabel.musicTrack == null) {
					WorldMapLabel.musicTrack = MusicTrack.readTrack(class234.musicTrackArchive, class234.musicTrackGroupId, UserComparator6.musicTrackFileId);
					if (WorldMapLabel.musicTrack == null) {
						return false;
					}
				}

				if (KitDefinition.soundCache == null) {
					KitDefinition.soundCache = new SoundCache(class234.soundEffectsArchive, class234.musicSamplesArchive);
				}

				if (class234.midiPcmStream.loadMusicTrack(WorldMapLabel.musicTrack, class234.musicPatchesArchive, KitDefinition.soundCache, 22050)) {
					class234.midiPcmStream.clearAll();
					class234.midiPcmStream.setPcmStreamVolume(HorizontalAlignment.musicTrackVolume);
					class234.midiPcmStream.setMusicTrack(WorldMapLabel.musicTrack, EnumComposition.musicTrackBoolean);
					class234.musicPlayerStatus = 0;
					WorldMapLabel.musicTrack = null;
					KitDefinition.soundCache = null;
					class234.musicTrackArchive = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class234.midiPcmStream.clear();
			class234.musicPlayerStatus = 0;
			WorldMapLabel.musicTrack = null;
			KitDefinition.soundCache = null;
			class234.musicTrackArchive = null;
		}

		return false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-428766711"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + ArchiveDiskActionHandler.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)V",
		garbageValue = "1590834282"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			class7.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = PcmPlayer.Widget_getSpellActionName(var0);
			if (var3 != null) {
				class7.insertMenuItemNoShift(var3, ScriptFrame.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			class7.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class7.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class7.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class7.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		int var15;
		if (var0.type == 2) {
			var15 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (var5 = 0; var5 < var0.width; ++var5) {
					var6 = (var0.paddingX + 32) * var5;
					var7 = (var0.paddingY + 32) * var4;
					if (var15 < 20) {
						var6 += var0.inventoryXOffsets[var15];
						var7 += var0.inventoryYOffsets[var15];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var15;
						Client.hoveredItemContainer = var0;
						if (var0.itemIds[var15] > 0) {
							ItemComposition var8 = KeyHandler.ItemDefinition_get(var0.itemIds[var15] - 1);
							if (Client.isItemSelected == 1 && ClientPacket.method4406(MusicPatchNode.getWidgetFlags(var0))) {
								if (var0.id != Tiles.selectedItemWidget || var15 != KeyHandler.selectedItemSlot) {
									class7.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + ScriptFrame.colorStartTag(16748608) + var8.name, 31, var8.id, var15, var0.id);
								}
							} else if (Client.isSpellSelected && ClientPacket.method4406(MusicPatchNode.getWidgetFlags(var0))) {
								if ((ViewportMouse.selectedSpellFlags & 16) == 16) {
									class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + ScriptFrame.colorStartTag(16748608) + var8.name, 32, var8.id, var15, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop && class79.method1979()) {
									var10 = var8.getShiftClickIndex();
								}

								if (ClientPacket.method4406(MusicPatchNode.getWidgetFlags(var0))) {
									for (int var11 = 4; var11 >= 3; --var11) {
										if (var11 != var10) {
											class376.addWidgetItemMenuItem(var0, var8, var15, var11, false);
										}
									}
								}

								int var12 = MusicPatchNode.getWidgetFlags(var0);
								boolean var22 = (var12 >> 31 & 1) != 0;
								if (var22) {
									class7.insertMenuItemNoShift("Use", ScriptFrame.colorStartTag(16748608) + var8.name, 38, var8.id, var15, var0.id);
								}

								Object var10000 = null;
								int var13;
								if (ClientPacket.method4406(MusicPatchNode.getWidgetFlags(var0))) {
									for (var13 = 2; var13 >= 0; --var13) {
										if (var13 != var10) {
											class376.addWidgetItemMenuItem(var0, var8, var15, var13, false);
										}
									}

									if (var10 >= 0) {
										class376.addWidgetItemMenuItem(var0, var8, var15, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var13 = 4; var13 >= 0; --var13) {
										if (var9[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 39;
											}

											if (var13 == 1) {
												var14 = 40;
											}

											if (var13 == 2) {
												var14 = 41;
											}

											if (var13 == 3) {
												var14 = 42;
											}

											if (var13 == 4) {
												var14 = 43;
											}

											class7.insertMenuItemNoShift(var9[var13], ScriptFrame.colorStartTag(16748608) + var8.name, var14, var8.id, var15, var0.id);
										}
									}
								}

								class7.insertMenuItemNoShift("Examine", ScriptFrame.colorStartTag(16748608) + var8.name, 1005, var8.id, var15, var0.id);
							}
						}
					}

					++var15;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class110.method2322(MusicPatchNode.getWidgetFlags(var0)) && (ViewportMouse.selectedSpellFlags & 32) == 32) {
					class7.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var15 = 9; var15 >= 5; --var15) {
					var6 = MusicPatchNode.getWidgetFlags(var0);
					boolean var20 = (var6 >> var15 + 1 & 1) != 0;
					String var18;
					if (!var20 && var0.onOp == null) {
						var18 = null;
					} else if (var0.actions != null && var0.actions.length > var15 && var0.actions[var15] != null && var0.actions[var15].trim().length() != 0) {
						var18 = var0.actions[var15];
					} else {
						var18 = null;
					}

					if (var18 != null) {
						class7.insertMenuItemNoShift(var18, var0.dataText, 1007, var15 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = PcmPlayer.Widget_getSpellActionName(var0);
				if (var3 != null) {
					class7.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					var7 = MusicPatchNode.getWidgetFlags(var0);
					boolean var21 = (var7 >> var4 + 1 & 1) != 0;
					String var16;
					if (!var21 && var0.onOp == null) {
						var16 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var16 = var0.actions[var4];
					} else {
						var16 = null;
					}

					if (var16 != null) {
						PcmPlayer.insertMenuItem(var16, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				var5 = MusicPatchNode.getWidgetFlags(var0);
				boolean var19 = (var5 & 1) != 0;
				if (var19) {
					class7.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1091902185"
	)
	static final void method343() {
		Client.field603 = Client.cycleCntr;
		UserComparator8.ClanChat_inClanChat = true;
	}
}
