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
import java.io.File;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("GameShell")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lbn;"
	)
	@Export("gameShell")
	static GameShell gameShell;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 163534127
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -2327307276950282213L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("p")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 922025779
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1298368225
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -35847139
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1815625351
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -713678755
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("s")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ax")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -986046037
	)
	static int field486;
	@ObfuscatedName("at")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8410184394094094231L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3577293238906002649L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("g")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2146499721
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1028356475
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1337229323
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1367831001
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -895108673
	)
	int field462;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1908584737
	)
	int field479;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1319555883
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -155636407
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ag")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ab")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("am")
	volatile boolean field482;
	@ObfuscatedName("as")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ar")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3084699549014677093L
	)
	volatile long field489;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "Lbh;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("av")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("af")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameShell = null;
		GameShell_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field486 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameShell() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field482 = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field489 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		NPC.method2144(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2030982939"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method1029();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;I)V",
		garbageValue = "-876824322"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				SpriteMask.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Lfv;",
		garbageValue = "-192453473"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-981291570"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-2023298912"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-316862367"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		User.method5228();
		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "196707341"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		AbstractWorldMapData.method342(this.canvas);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-752017845"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field462);
			this.contentHeight = Math.max(var2.highY, this.field479);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			Varcs.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class52.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - Varcs.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(Varcs.canvasWidth, class52.canvasHeight);
			ArchiveLoader.rasterProvider = new RasterProvider(Varcs.canvasWidth, class52.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.field482 = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1805213007"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1664066560"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - Varcs.canvasWidth - var1;
		int var4 = this.contentHeight - class52.canvasHeight - var2;
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
		signature = "(B)V",
		garbageValue = "97"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field411 = -1;
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
		AbstractWorldMapData.method342(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method1029();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-946150877"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameShell != null) {
				++GameShell_redundantStartThreadCount;
				if (GameShell_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameShell = this;
			Varcs.canvasWidth = var1;
			class52.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (GrandExchangeOfferAgeComparator.taskHandler == null) {
				GrandExchangeOfferAgeComparator.taskHandler = new TaskHandler();
			}

			GrandExchangeOfferAgeComparator.taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class197.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "799710409"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		Varcs.canvasWidth = Math.max(var1.getWidth(), this.field462);
		class52.canvasHeight = Math.max(var1.getHeight(), this.field479);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			Varcs.canvasWidth -= var2.left + var2.right;
			class52.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(Varcs.canvasWidth, class52.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.field482 = true;
		if (ArchiveLoader.rasterProvider != null && Varcs.canvasWidth == ArchiveLoader.rasterProvider.width && class52.canvasHeight == ArchiveLoader.rasterProvider.height) {
			((RasterProvider)ArchiveLoader.rasterProvider).setComponent(this.canvas);
			ArchiveLoader.rasterProvider.drawFull(0, 0);
		} else {
			ArchiveLoader.rasterProvider = new RasterProvider(Varcs.canvasWidth, class52.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field489 = MilliClock.currentTimeMillis();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "424530917"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-311013157"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = MilliClock.currentTimeMillis();
		long var3 = clientTickTimes[Clock.clientTickTimeIdx];
		clientTickTimes[Clock.clientTickTimeIdx] = var1;
		Clock.clientTickTimeIdx = Clock.clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			WorldMapArea.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "553684525"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = MilliClock.currentTimeMillis();
		long var4 = graphicsTickTimes[graphicsTickTimeIdx];
		graphicsTickTimes[graphicsTickTimeIdx] = var2;
		graphicsTickTimeIdx = graphicsTickTimeIdx + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field486 - 1 > 50) {
			field486 -= 50;
			this.field482 = true;
			this.canvas.setSize(Varcs.canvasWidth, class52.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method1004();
		this.draw(this.field482);
		if (this.field482) {
			this.clearBackground();
		}

		this.field482 = false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "73839779"
	)
	final void method1004() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2043772276"
	)
	final void method1029() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-109609137"
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

			if (GrandExchangeOfferAgeComparator.taskHandler != null) {
				try {
					GrandExchangeOfferAgeComparator.taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1570();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "108465933"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "202919973"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(ZS)V",
		garbageValue = "255"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1432958229"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;ZS)V",
		garbageValue = "-6486"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class204.fontHelvetica13 == null) {
				class204.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				loginScreenFontMetrics = this.canvas.getFontMetrics(class204.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, Varcs.canvasWidth, class52.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (HealthBarUpdate.field1033 == null) {
					HealthBarUpdate.field1033 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = HealthBarUpdate.field1033.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class204.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(HealthBarUpdate.field1033, Varcs.canvasWidth / 2 - 152, class52.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = Varcs.canvasWidth / 2 - 152;
				int var8 = class52.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class204.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1038355483"
	)
	protected final void method1017() {
		HealthBarUpdate.field1033 = null;
		class204.fontHelvetica13 = null;
		loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;S)V",
		garbageValue = "23979"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(I)Ljava/awt/Container;",
		garbageValue = "1395544876"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(S)Llv;",
		garbageValue = "9055"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field462);
		int var3 = Math.max(var1.getHeight(), this.field479);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-2133416306"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-453140820"
	)
	protected abstract void vmethod1570();

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) {
			this.field482 = true;
			if (MilliClock.currentTimeMillis() - this.field489 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Varcs.canvasWidth && var2.height >= class52.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = MilliClock.currentTimeMillis();
			SpriteMask.sleepExact(4999L);
			SpriteMask.sleepExact(1L);
			this.kill();
		}
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
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
						for (var3 = 6; var3 < var2.length() && class296.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (UserComparator7.isNumber(var4) && Tiles.parseInt(var4) < 10) {
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

			FriendLoginUpdate.clock = (Clock)var8;

			while (stopTimeMs == 0L || MilliClock.currentTimeMillis() < stopTimeMs) {
				gameCyclesToDo = FriendLoginUpdate.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class197.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = MilliClock.currentTimeMillis() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.field482 = true;
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;",
		garbageValue = "968663760"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (RouteStrategy.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (RouteStrategy.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(ArchiveLoader.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lic;III)Llz;",
		garbageValue = "1598756055"
	)
	@Export("SpriteBuffer_getSprite")
	public static Sprite SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class3.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			Sprite var5 = new Sprite();
			var5.width = class335.SpriteBuffer_spriteWidth;
			var5.height = UserComparator8.SpriteBuffer_spriteHeight;
			var5.xOffset = class335.SpriteBuffer_xOffsets[0];
			var5.yOffset = NPC.SpriteBuffer_yOffsets[0];
			var5.subWidth = class335.SpriteBuffer_spriteWidths[0];
			var5.subHeight = class335.SpriteBuffer_spriteHeights[0];
			int var6 = var5.subWidth * var5.subHeight;
			byte[] var7 = ItemDefinition.SpriteBuffer_pixels[0];
			var5.pixels = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.pixels[var8] = class335.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			GrandExchangeEvent.method158();
			return var5;
		}
	}
}
