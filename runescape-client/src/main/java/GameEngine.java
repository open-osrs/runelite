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
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 101195885
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 1041392062207193601L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("t")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -449593007
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 361879733
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2003926073
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1529824095
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("h")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1869136141
	)
	static int field191;
	@ObfuscatedName("e")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1200359535
	)
	static int field204;
	@ObfuscatedName("at")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5901538680007950845L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -3709786579924747147L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("s")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -484792125
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1903337841
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 523594845
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1957375435
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -193525917
	)
	int field197;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1511981227
	)
	int field195;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1719280099
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1219535973
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("am")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("az")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5964602634567771817L
	)
	volatile long field207;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aa")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("as")
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
		field204 = 500;
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
		this.field207 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class130.method2795(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-271494890"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method482();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "109"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				Bounds.method6608(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Leq;",
		garbageValue = "247241900"
	)
	@Export("mouseWheel")
	protected class154 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1865121079"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1085024846"
	)
	protected void method492(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1640324259"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class132.method2810();
		DevicePcmPlayerProvider.method393(this.canvas);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-150976467"
	)
	protected final void method472() {
		class136.method2839(this.canvas);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-740959937"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field197);
			this.contentHeight = Math.max(var2.highY, this.field195);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class186.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			BoundaryObject.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class186.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight);
			class19.rasterProvider = new RasterProvider(class186.canvasWidth, BoundaryObject.canvasHeight, this.canvas);
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122855875"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990507849"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class186.canvasWidth - var1;
		int var4 = this.contentHeight - BoundaryObject.canvasHeight - var2;
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
		garbageValue = "-168794893"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field120 = -1;
		GameBuild.method5494(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		DevicePcmPlayerProvider.method393(this.canvas);
		class136.method2839(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method482();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2147483648"
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
			class186.canvasWidth = var1;
			BoundaryObject.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			AccessFile.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1171942510"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class186.canvasWidth = Math.max(var1.getWidth(), this.field197);
		BoundaryObject.canvasHeight = Math.max(var1.getHeight(), this.field195);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class186.canvasWidth -= var2.right + var2.left;
			BoundaryObject.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class19.rasterProvider != null && class186.canvasWidth == class19.rasterProvider.width && BoundaryObject.canvasHeight == class19.rasterProvider.height) {
			((RasterProvider)class19.rasterProvider).setComponent(this.canvas);
			class19.rasterProvider.drawFull(0, 0);
		} else {
			class19.rasterProvider = new RasterProvider(class186.canvasWidth, BoundaryObject.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field207 = Ignored.method6459();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-426429067"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Ignored.method6459();
		long var3 = clientTickTimes[ScriptFrame.field448];
		clientTickTimes[ScriptFrame.field448] = var1;
		ScriptFrame.field448 = ScriptFrame.field448 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			World.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = Ignored.method6459();
		long var4 = graphicsTickTimes[field191];
		graphicsTickTimes[field191] = var2;
		field191 = field191 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field204 - 1 > 50) {
			field204 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight);
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

		this.method594();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862280135"
	)
	final void method594() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	final void method482() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
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

			this.vmethod1151();
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264122801"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24240"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "549681271"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665222357"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1887501266"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class131.fontHelvetica13 == null) {
				class131.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class114.loginScreenFontMetrics = this.canvas.getFontMetrics(class131.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class186.canvasWidth, BoundaryObject.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class18.field97 == null) {
					class18.field97 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class18.field97.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class131.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class18.field97, class186.canvasWidth / 2 - 152, BoundaryObject.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = class186.canvasWidth / 2 - 152;
				int var8 = BoundaryObject.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class131.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	protected final void method498() {
		class18.field97 = null;
		class131.fontHelvetica13 = null;
		class114.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1493080137"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-9231929"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "441270158"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field197);
		int var3 = Math.max(var1.getHeight(), this.field195);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	protected abstract void vmethod1151();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (Ignored.method6459() - this.field207 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class186.canvasWidth && var2.height >= BoundaryObject.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Ignored.method6459();
			Bounds.method6608(5000L);
			this.kill();
		}
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = NPC.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class277.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (ClanSettings.isNumber(var4) && ClanChannelMember.method2778(var4) < 10) {
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

			class91.clock = (Clock)var8;

			while (0L == stopTimeMs || Ignored.method6459() < stopTimeMs) {
				gameCyclesToDo = class91.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			AccessFile.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Ignored.method6459() + 4000L;
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

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1157157000"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(class125.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "15"
	)
	static int method581(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class20.Client_plane;
			int var15 = (class340.localPlayer.x >> 7) + class131.baseX;
			int var8 = (class340.localPlayer.y >> 7) + TileItem.baseY;
			WorldMapRectangle.getWorldMap().method6870(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				String var16 = "";
				var9 = WorldMapRectangle.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				WorldMapRectangle.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				WorldMapRectangle.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
					WorldMapRectangle.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
					WorldMapRectangle.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
					WorldMapRectangle.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
					WorldMapRectangle.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = WorldMapRectangle.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
						var11 = WorldMapRectangle.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
							var11 = WorldMapRectangle.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								IsaacCipher.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
								SoundCache.method831(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								IsaacCipher.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
								SoundCache.method831(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								IsaacCipher.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
								var9 = WorldMapRectangle.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
								var11 = WorldMapRectangle.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								WorldMapRectangle.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								WorldMapRectangle.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								WorldMapRectangle.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								WorldMapRectangle.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
									WorldMapRectangle.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
									WorldMapRectangle.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
									WorldMapRectangle.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									WorldMapRectangle.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
									WorldMapRectangle.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										IsaacCipher.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1;
										WorldMapRectangle.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										IsaacCipher.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1;
										WorldMapRectangle.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										IsaacCipher.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
										var5 = WorldMapRectangle.getWorldMap().method6988(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = WorldMapRectangle.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = WorldMapRectangle.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
												var4 = class78.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
												var4 = class78.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
												var4 = class78.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
												var4 = class78.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
