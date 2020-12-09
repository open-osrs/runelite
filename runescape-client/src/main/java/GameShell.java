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

@ObfuscatedName("bd")
@Implements("GameShell")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("gameShell")
	static GameShell gameShell;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 548418733
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -299301004563523829L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("n")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1522252181
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1346634793
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1771447701
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("i")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("a")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static Bounds field481;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 475129239
	)
	static int field471;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 2878224535020418697L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 6896252381737928241L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("p")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -421640867
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 654050171
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -153393077
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1458839985
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2092282905
	)
	int field464;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1103282921
	)
	int field467;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1546847555
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1533275397
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("as")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ae")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ac")
	volatile boolean field470;
	@ObfuscatedName("aq")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ah")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 8455429718960757091L
	)
	volatile long field472;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aw")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ap")
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
		field471 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameShell() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field470 = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field472 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		FaceNormal.method3344(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-387026818"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method985();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "136428180"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class236.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;",
		garbageValue = "1655914874"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636889033"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1432423267"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "639866181"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		WorldMapIcon_1.method354();
		Messages.method2275(this.canvas);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1383107169"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field464);
			this.contentHeight = Math.max(var2.highY, this.field467);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			IgnoreList.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			ModelData0.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - IgnoreList.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight);
			WorldMapIcon_0.rasterProvider = new RasterProvider(IgnoreList.canvasWidth, ModelData0.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.field470 = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "312942940"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111621500"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - IgnoreList.canvasWidth - var1;
		int var4 = this.contentHeight - ModelData0.canvasHeight - var2;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2006885359"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field410 = -1;
		java.awt.Canvas var2 = this.canvas;
		var2.removeMouseListener(MouseHandler.MouseHandler_instance);
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		Messages.method2275(this.canvas);
		java.awt.Canvas var3 = this.canvas;
		var3.addMouseListener(MouseHandler.MouseHandler_instance);
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var3.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method985();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-108"
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
			IgnoreList.canvasWidth = var1;
			ModelData0.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			PlayerAppearance.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254255664"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		IgnoreList.canvasWidth = Math.max(var1.getWidth(), this.field464);
		ModelData0.canvasHeight = Math.max(var1.getHeight(), this.field467);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			IgnoreList.canvasWidth -= var2.left + var2.right;
			ModelData0.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight);
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
		this.field470 = true;
		if (WorldMapIcon_0.rasterProvider != null && IgnoreList.canvasWidth == WorldMapIcon_0.rasterProvider.width && ModelData0.canvasHeight == WorldMapIcon_0.rasterProvider.height) {
			((RasterProvider)WorldMapIcon_0.rasterProvider).setComponent(this.canvas);
			WorldMapIcon_0.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapIcon_0.rasterProvider = new RasterProvider(IgnoreList.canvasWidth, ModelData0.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field472 = class298.currentTimeMillis();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-206373344"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "176376535"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class298.currentTimeMillis();
		long var3 = clientTickTimes[Varcs.clientTickTimeIdx];
		clientTickTimes[Varcs.clientTickTimeIdx] = var1;
		Varcs.clientTickTimeIdx = Varcs.clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			ScriptEvent.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055112654"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class298.currentTimeMillis();
		long var4 = graphicsTickTimes[PacketWriter.graphicsTickTimeIdx];
		graphicsTickTimes[PacketWriter.graphicsTickTimeIdx] = var2;
		PacketWriter.graphicsTickTimeIdx = PacketWriter.graphicsTickTimeIdx + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field471 - 1 > 50) {
			field471 -= 50;
			this.field470 = true;
			this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight);
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

		this.method984();
		this.draw(this.field470);
		if (this.field470) {
			this.clearBackground();
		}

		this.field470 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	final void method984() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "287076222"
	)
	final void method985() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "646391246"
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

			this.vmethod1777();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1376035132"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-20163413"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6923156"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1645109532"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (GrandExchangeEvent.fontHelvetica13 == null) {
				GrandExchangeEvent.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				ViewportMouse.loginScreenFontMetrics = this.canvas.getFontMetrics(GrandExchangeEvent.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (Canvas.field425 == null) {
					Canvas.field425 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = Canvas.field425.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(GrandExchangeEvent.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(Canvas.field425, IgnoreList.canvasWidth / 2 - 152, ModelData0.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = IgnoreList.canvasWidth / 2 - 152;
				int var8 = ModelData0.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(GrandExchangeEvent.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779228195"
	)
	protected final void method1050() {
		Canvas.field425 = null;
		GrandExchangeEvent.fontHelvetica13 = null;
		ViewportMouse.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2134570011"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/Container;",
		garbageValue = "-16488"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "-2080787573"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field464);
		int var3 = Math.max(var1.getHeight(), this.field467);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-418919904"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	protected abstract void vmethod1777();

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) {
			this.field470 = true;
			if (class298.currentTimeMillis() - this.field472 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= IgnoreList.canvasWidth && var2.height >= ModelData0.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = class298.currentTimeMillis();
			class236.sleepExact(5000L);
			this.kill();
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.field470 = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosed(WindowEvent var1) {
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

	public abstract void init();

	public final void stop() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = class298.currentTimeMillis() + 4000L;
		}
	}

	public final void start() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = 0L;
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
						for (var3 = 6; var3 < var2.length() && class39.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (ArchiveDiskAction.isNumber(var4) && class279.parseInt(var4) < 10) {
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

			class225.clock = (Clock)var8;

			while (stopTimeMs == 0L || class298.currentTimeMillis() < stopTimeMs) {
				class8.gameCyclesToDo = class225.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class8.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			PlayerAppearance.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1024924303"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
