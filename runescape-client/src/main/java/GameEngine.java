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
	static GameEngine gameEngine;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1172672455
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8672480776898647035L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("h")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1471054529
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1858214361
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -860232961
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("f")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ax")
	static Image field480;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -855219925
	)
	static int field481;
	@ObfuscatedName("an")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 1354253672444800547L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 7149663946399436317L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("z")
	@Export("hasErrored")
	boolean hasErrored;
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
	int canvasX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2031980453
	)
	@Export("canvasY")
	int canvasY;
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
	volatile boolean fullRedraw;
	@ObfuscatedName("al")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aa")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -8976229610863512045L
	)
	volatile long field484;
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

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field481 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field484 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class2.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-420237579"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method1007();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "2080596148"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				ApproximateRouteStrategy.sleepExact(1L);
			}

			if (var1 != null) { // L: 110
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	} // L: 111

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lfo;",
		garbageValue = "-1572437052"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-775361579"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-367283277"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 131
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 132
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 133
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 138
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 139
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 140
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 141
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 142
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 143
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 146
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 147
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 148
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 149
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 150
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 151
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 152
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 153
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 154
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 155
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 156
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 157
		}

		java.awt.Canvas var1 = this.canvas; // L: 160
		var1.setFocusTraversalKeysEnabled(false); // L: 162
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 163
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 164
	} // L: 166

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1149446926"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		WorldMapArea.method489(this.canvas); // L: 169
	} // L: 170

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1907084559"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 173
		if (var1 != null) { // L: 174
			Bounds var2 = this.getFrameContentBounds(); // L: 175
			this.contentWidth = Math.max(var2.highX, this.field473); // L: 176
			this.contentHeight = Math.max(var2.highY, this.field460); // L: 177
			if (this.contentWidth <= 0) { // L: 178
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 179
				this.contentHeight = 1;
			}

			GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 180
			class25.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 181
			this.canvasX = (this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth) / 2; // L: 182
			this.canvasY = 0; // L: 183
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight); // L: 184
			FileSystem.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, this.canvas); // L: 185
			if (var1 == this.frame) { // L: 186
				Insets var3 = this.frame.getInsets(); // L: 187
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 188
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 190
			}

			this.fullRedraw = true; // L: 191
			this.resizeGame(); // L: 192
		}
	} // L: 193

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
		int var1 = this.canvasX; // L: 198
		int var2 = this.canvasY; // L: 199
		int var3 = this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth - var1; // L: 200
		int var4 = this.contentHeight - class25.canvasHeight - var2; // L: 201
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 202
			try {
				Container var5 = this.container(); // L: 204
				int var6 = 0; // L: 205
				int var7 = 0; // L: 206
				if (var5 == this.frame) { // L: 207
					Insets var8 = this.frame.getInsets(); // L: 208
					var6 = var8.left; // L: 209
					var7 = var8.top; // L: 210
				}

				Graphics var10 = var5.getGraphics(); // L: 212
				var10.setColor(Color.black); // L: 213
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 214
				}

				if (var2 > 0) { // L: 215
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 216
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 217
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 219
			}
		}

	} // L: 221

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		PlayerType.method4345(this.canvas); // L: 224
		java.awt.Canvas var1 = this.canvas; // L: 225
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 227
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 228
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 229
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 230
		if (this.mouseWheelHandler != null) { // L: 232
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 233
		java.awt.Canvas var2 = this.canvas; // L: 234
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(KeyHandler.KeyHandler_instance);
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 238
		WorldMapArea.method489(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method1007(); // L: 242
	} // L: 243

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2060658023"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 247
				++GameEngine_redundantStartThreadCount; // L: 248
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return; // L: 251
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 253
				return; // L: 254
			}

			gameEngine = this;
			GrandExchangeOfferTotalQuantityComparator.canvasWidth = var1;
			class25.canvasHeight = var2;
			RunException.RunException_revision = var3; // L: 259
			RunException.RunException_applet = this; // L: 260
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			SequenceDefinition.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	} // L: 268

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 271
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
		this.canvas.setBackground(Color.BLACK); // L: 289
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
			FileSystem.rasterProvider.drawFull(0, 0); // L: 300
		} else {
			FileSystem.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight, this.canvas); // L: 303
		}

		this.isCanvasInvalid = false;
		this.field484 = Tiles.currentTimeMillis(); // L: 306
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
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 312
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 314
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
		WallDecoration.clientTickTimeIdx = WallDecoration.clientTickTimeIdx + 1 & 31; // L: 373
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) { // L: 375
			PcmPlayer.hasFocus = volatileFocus;
		}

		this.doCycle();
	} // L: 379

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
			this.fullRedraw = true; // L: 393
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) { // L: 396
				Insets var7 = this.frame.getInsets(); // L: 397
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) { // L: 402
			this.replaceCanvas();
		}

		this.method1103();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) { // L: 405
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
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 411
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	} // L: 415

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-17755841"
	)
	final void method1007() {
		this.resizeCanvasNextFrame = true;
	} // L: 419

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1467969246"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true; // L: 423

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
				} catch (Exception var2) { // L: 442
				}
			}

			this.vmethod1423(); // L: 444
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
			if (WorldMapIcon_0.fontHelvetica13 == null) { // L: 506
				WorldMapIcon_0.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 507
				GrandExchangeOfferAgeComparator.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapIcon_0.fontHelvetica13); // L: 508
			}

			if (var3) { // L: 510
				var4.setColor(Color.black); // L: 511
				var4.fillRect(0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, class25.canvasHeight); // L: 512
			}

			Color var5 = new Color(140, 17, 17); // L: 514

			try {
				if (field480 == null) { // L: 516
					field480 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field480.getGraphics(); // L: 517
				var6.setColor(var5); // L: 518
				var6.drawRect(0, 0, 303, 33); // L: 519
				var6.fillRect(2, 2, var1 * 3, 30); // L: 520
				var6.setColor(Color.black); // L: 521
				var6.drawRect(1, 1, 301, 31); // L: 522
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 523
				var6.setFont(WorldMapIcon_0.fontHelvetica13); // L: 524
				var6.setColor(Color.white); // L: 525
				var6.drawString(var2, (304 - GrandExchangeOfferAgeComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 526
				var4.drawImage(field480, GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152, class25.canvasHeight / 2 - 18, (ImageObserver)null); // L: 527
			} catch (Exception var9) { // L: 529
				int var7 = GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152; // L: 530
				int var8 = class25.canvasHeight / 2 - 18; // L: 531
				var4.setColor(var5); // L: 532
				var4.drawRect(var7, var8, 303, 33); // L: 533
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 534
				var4.setColor(Color.black); // L: 535
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 536
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 537
				var4.setFont(WorldMapIcon_0.fontHelvetica13); // L: 538
				var4.setColor(Color.white); // L: 539
				var4.drawString(var2, var7 + (304 - GrandExchangeOfferAgeComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 540
			}
		} catch (Exception var10) { // L: 543
			this.canvas.repaint(); // L: 544
		}

	} // L: 546

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187634060"
	)
	protected final void method1078() {
		field480 = null; // L: 549
		WorldMapIcon_0.fontHelvetica13 = null; // L: 550
		GrandExchangeOfferAgeComparator.loginScreenFontMetrics = null; // L: 551
	} // L: 552

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "120"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 555
			this.hasErrored = true; // L: 556
			System.out.println("error_game_" + var1); // L: 557

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 559
			} catch (Exception var3) { // L: 561
			}

		}
	} // L: 562

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-838247309"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 565
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;",
		garbageValue = "-1070651105"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 570
		int var2 = Math.max(var1.getWidth(), this.field473); // L: 571
		int var3 = Math.max(var1.getHeight(), this.field460); // L: 572
		if (this.frame != null) { // L: 573
			Insets var4 = this.frame.getInsets(); // L: 574
			var2 -= var4.right + var4.left; // L: 575
			var3 -= var4.bottom + var4.top; // L: 576
		}

		return new Bounds(var2, var3); // L: 578
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-697132291"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 582
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	protected abstract void vmethod1423();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 458
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
					this.isCanvasInvalid = true; // L: 473
				}
			}

		}
	}

	public abstract void init();

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 323
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava"); // L: 327
						return; // L: 328
					}

					if (var2.startsWith("1.6.0_")) { // L: 330
						int var3;
						for (var3 = 6; var3 < var2.length() && Strings.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3); // L: 333
						if (WorldMapDecoration.isNumber(var4) && class217.parseInt(var4) < 10) {
							this.error("wrongjava"); // L: 335
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true); // L: 342
			this.addCanvas();
			this.setUp(); // L: 344

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			WorldMapSprite.clock = (Clock)var8; // L: 354

			while (stopTimeMs == 0L || Tiles.currentTimeMillis() < stopTimeMs) {
				VertexNormal.gameCyclesToDo = WorldMapSprite.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < VertexNormal.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas); // L: 359
			}
		} catch (Exception var7) {
			SequenceDefinition.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill(); // L: 366
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 453
			stopTimeMs = Tiles.currentTimeMillis() + 4000L;
		}
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	} // L: 491

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
		volatileFocus = true; // L: 478
		this.fullRedraw = true;
	} // L: 480

	public final void windowActivated(WindowEvent var1) {
	} // L: 486

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lje;",
		garbageValue = "1729948471"
	)
	static HorizontalAlignment[] method1137() {
		return new HorizontalAlignment[]{HorizontalAlignment.field3494, HorizontalAlignment.field3490, HorizontalAlignment.HorizontalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILeq;Lfe;I)V",
		garbageValue = "1508002032"
	)
	static final void method1134(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) { // L: 235 236 237
			if (var0 < Tiles.Tiles_minPlane) { // L: 240
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapAreaData.getObjectDefinition(var3); // L: 241
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) { // L: 244
				var9 = var8.sizeX; // L: 249
				var10 = var8.sizeY; // L: 250
			} else {
				var9 = var8.sizeY; // L: 245
				var10 = var8.sizeX; // L: 246
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) { // L: 256
				var11 = (var9 >> 1) + var1; // L: 257
				var12 = (var9 + 1 >> 1) + var1; // L: 258
			} else {
				var11 = var1; // L: 261
				var12 = var1 + 1; // L: 262
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) { // L: 264
				var13 = (var10 >> 1) + var2; // L: 265
				var14 = var2 + (var10 + 1 >> 1); // L: 266
			} else {
				var13 = var2; // L: 269
				var14 = var2 + 1; // L: 270
			}

			int[][] var15 = Tiles.Tiles_heights[var0]; // L: 272
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2; // L: 273
			int var17 = (var1 << 7) + (var9 << 6); // L: 274
			int var18 = (var2 << 7) + (var10 << 6); // L: 275
			long var19 = TextureProvider.calculateTag(var1, var2, 2, var8.int1 == 0, var3); // L: 276
			int var21 = var5 + (var4 << 6); // L: 277
			if (var8.int3 == 1) { // L: 278
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) { // L: 279
				ObjectSound var22 = new ObjectSound(); // L: 280
				var22.plane = var0; // L: 281
				var22.x = var1 * 128; // L: 282
				var22.y = var2 * 128; // L: 283
				var23 = var8.sizeX; // L: 284
				var24 = var8.sizeY; // L: 285
				if (var4 == 1 || var4 == 3) { // L: 286
					var23 = var8.sizeY; // L: 287
					var24 = var8.sizeX; // L: 288
				}

				var22.field1090 = (var23 + var1) * 128; // L: 290
				var22.field1094 = (var24 + var2) * 128; // L: 291
				var22.soundEffectId = var8.ambientSoundId; // L: 292
				var22.field1092 = var8.int4 * 128; // L: 293
				var22.field1095 = var8.int5; // L: 294
				var22.field1096 = var8.int6; // L: 295
				var22.soundEffectIds = var8.soundEffectIds; // L: 296
				if (var8.transforms != null) { // L: 297
					var22.obj = var8; // L: 298
					var22.set(); // L: 299
				}

				ObjectSound.objectSounds.addFirst(var22); // L: 301
				if (var22.soundEffectIds != null) { // L: 302
					var22.field1097 = var22.field1095 + (int)(Math.random() * (double)(var22.field1096 - var22.field1095));
				}
			}

			Object var34;
			if (var5 == 22) { // L: 304
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 305
					if (var8.animationId == -1 && var8.transforms == null) { // L: 307
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 308
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21); // L: 309
					if (var8.interactType == 1 && var7 != null) { // L: 310
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) { // L: 313
				int[] var10000;
				if (var5 >= 12) { // L: 334
					if (var8.animationId == -1 && var8.transforms == null) { // L: 336
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 337
					}

					var6.method3400(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 338
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) { // L: 339
						var10000 = class2.field12[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) { // L: 340
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) { // L: 343
					if (var8.animationId == -1 && var8.transforms == null) { // L: 345
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 346
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field521[var4], 0, var19, var21); // L: 347
					if (var4 == 0) { // L: 348
						if (var8.clipped) { // L: 349
							TaskHandler.field2045[var0][var1][var2] = 50; // L: 350
							TaskHandler.field2045[var0][var1][var2 + 1] = 50; // L: 351
						}

						if (var8.modelClipped) { // L: 353
							var10000 = class2.field12[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) { // L: 355
						if (var8.clipped) { // L: 356
							TaskHandler.field2045[var0][var1][var2 + 1] = 50; // L: 357
							TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50; // L: 358
						}

						if (var8.modelClipped) { // L: 360
							var10000 = class2.field12[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) { // L: 362
						if (var8.clipped) { // L: 363
							TaskHandler.field2045[var0][var1 + 1][var2] = 50; // L: 364
							TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50; // L: 365
						}

						if (var8.modelClipped) { // L: 367
							var10000 = class2.field12[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) { // L: 369
						if (var8.clipped) { // L: 370
							TaskHandler.field2045[var0][var1][var2] = 50; // L: 371
							TaskHandler.field2045[var0][var1 + 1][var2] = 50; // L: 372
						}

						if (var8.modelClipped) { // L: 374
							var10000 = class2.field12[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 376
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) { // L: 377
						var6.method3258(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) { // L: 380
					if (var8.animationId == -1 && var8.transforms == null) { // L: 382
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 383
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field514[var4], 0, var19, var21); // L: 384
					if (var8.clipped) { // L: 385
						if (var4 == 0) { // L: 386
							TaskHandler.field2045[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) { // L: 387
							TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) { // L: 388
							TaskHandler.field2045[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) { // L: 389
							TaskHandler.field2045[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 391
						var7.method3749(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) { // L: 394
						var28 = var4 + 1 & 3; // L: 395
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) { // L: 398
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18); // L: 399
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18); // L: 400
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 403
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 404
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field521[var4], Tiles.field521[var28], var19, var21); // L: 406
						if (var8.modelClipped) { // L: 407
							if (var4 == 0) { // L: 408
								var10000 = class2.field12[var0][var1]; // L: 409
								var10000[var2] |= 585;
								var10000 = class2.field12[var0][var1]; // L: 410
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) { // L: 412
								var10000 = class2.field12[var0][var1]; // L: 413
								var10000[1 + var2] |= 1170;
								var10000 = class2.field12[var0][var1 + 1]; // L: 414
								var10000[var2] |= 585;
							} else if (var4 == 2) { // L: 416
								var10000 = class2.field12[var0][var1 + 1]; // L: 417
								var10000[var2] |= 585;
								var10000 = class2.field12[var0][var1]; // L: 418
								var10000[var2] |= 1170;
							} else if (var4 == 3) { // L: 420
								var10000 = class2.field12[var0][var1]; // L: 421
								var10000[var2] |= 1170;
								var10000 = class2.field12[var0][var1]; // L: 422
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 425
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 426
							var6.method3258(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) { // L: 429
						if (var8.animationId == -1 && var8.transforms == null) { // L: 431
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 432
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field514[var4], 0, var19, var21); // L: 433
						if (var8.clipped) { // L: 434
							if (var4 == 0) { // L: 435
								TaskHandler.field2045[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) { // L: 436
								TaskHandler.field2045[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) { // L: 437
								TaskHandler.field2045[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) { // L: 438
								TaskHandler.field2045[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 440
							var7.method3749(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) { // L: 443
						if (var8.animationId == -1 && var8.transforms == null) { // L: 445
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 446
						}

						var6.method3400(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21); // L: 447
						if (var8.interactType != 0 && var7 != null) { // L: 448
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 449
							var6.method3258(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) { // L: 452
						if (var8.animationId == -1 && var8.transforms == null) { // L: 454
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 455
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field521[var4], 0, 0, 0, var19, var21); // L: 456
					} else {
						Object var25;
						long var29;
						if (var5 == 5) { // L: 459
							var28 = 16; // L: 460
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 461
							if (0L != var29) { // L: 462
								var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 464
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 465
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field521[var4], 0, var28 * Tiles.field523[var4], var28 * Tiles.field527[var4], var19, var21); // L: 466
						} else if (var5 == 6) { // L: 469
							var28 = 8; // L: 470
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 471
							if (0L != var29) { // L: 472
								var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) { // L: 474
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 475
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field525[var4], var28 * Tiles.field526[var4], var19, var21); // L: 476
						} else if (var5 == 7) { // L: 479
							var23 = var4 + 2 & 3; // L: 481
							if (var8.animationId == -1 && var8.transforms == null) { // L: 482
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 483
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21); // L: 484
						} else if (var5 == 8) { // L: 487
							var28 = 8; // L: 488
							var29 = var6.getBoundaryObjectTag(var0, var1, var2); // L: 489
							if (0L != var29) { // L: 490
								var28 = WorldMapAreaData.getObjectDefinition(class25.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3; // L: 493
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 494
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18); // L: 495
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18); // L: 496
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 499
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 500
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field525[var4], var28 * Tiles.field526[var4], var19, var21); // L: 502
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) { // L: 315
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field3429, (Renderable)null); // L: 316
				}

				if (var34 != null && var6.method3400(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 317 318
					var23 = 15; // L: 319
					if (var34 instanceof Model) { // L: 320
						var23 = ((Model)var34).method3079() / 4; // L: 321
						if (var23 > 30) { // L: 322
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) { // L: 324
						for (int var33 = 0; var33 <= var10; ++var33) { // L: 325
							if (var23 > TaskHandler.field2045[var0][var24 + var1][var33 + var2]) { // L: 326
								TaskHandler.field2045[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) { // L: 331
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	} // L: 311 332 341 378 392 427 441 450 457 467 477 485 503 505

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-325844225"
	)
	@Export("load")
	static void load() {
		int var14;
		if (Client.titleLoadingStage == 0) { // L: 1408
			MilliClock.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1409

			for (var14 = 0; var14 < 4; ++var14) { // L: 1410
				Client.collisionMaps[var14] = new CollisionMap(104, 104);
			}

			GrandExchangeOfferAgeComparator.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1411
			Login.Login_loadingText = "Starting game engine..."; // L: 1412
			Login.Login_loadingPercent = 5; // L: 1413
			Client.titleLoadingStage = 20; // L: 1414
		} else if (Client.titleLoadingStage == 20) { // L: 1417
			Login.Login_loadingText = "Prepared visibility map"; // L: 1418
			Login.Login_loadingPercent = 10; // L: 1419
			Client.titleLoadingStage = 30; // L: 1420
		} else if (Client.titleLoadingStage == 30) { // L: 1423
			class52.archive0 = ViewportMouse.newArchive(0, false, true, true); // L: 1424
			SpriteMask.archive1 = ViewportMouse.newArchive(1, false, true, true); // L: 1425
			WorldMapIcon_0.archive2 = ViewportMouse.newArchive(2, true, false, true); // L: 1426
			PlayerComposition.archive3 = ViewportMouse.newArchive(3, false, true, true); // L: 1427
			WorldMapCacheName.archive4 = ViewportMouse.newArchive(4, false, true, true); // L: 1428
			class8.archive5 = ViewportMouse.newArchive(5, true, true, true); // L: 1429
			UrlRequester.archive6 = ViewportMouse.newArchive(6, true, true, true); // L: 1430
			WorldMapData_0.archive7 = ViewportMouse.newArchive(7, false, true, true); // L: 1431
			ModeWhere.archive8 = ViewportMouse.newArchive(8, false, true, true); // L: 1432
			ViewportMouse.archive9 = ViewportMouse.newArchive(9, false, true, true); // L: 1433
			LoginScreenAnimation.archive10 = ViewportMouse.newArchive(10, false, true, true); // L: 1434
			WorldMapManager.archive11 = ViewportMouse.newArchive(11, false, true, true); // L: 1435
			WorldMapSection0.archive12 = ViewportMouse.newArchive(12, false, true, true); // L: 1436
			CollisionMap.archive13 = ViewportMouse.newArchive(13, true, false, true); // L: 1437
			Tiles.archive14 = ViewportMouse.newArchive(14, false, true, true); // L: 1438
			SpriteMask.archive15 = ViewportMouse.newArchive(15, false, true, true); // L: 1439
			ItemComposition.archive17 = ViewportMouse.newArchive(17, true, true, true); // L: 1440
			class25.archive18 = ViewportMouse.newArchive(18, false, true, true); // L: 1441
			ArchiveLoader.archive19 = ViewportMouse.newArchive(19, false, true, true); // L: 1442
			Login.archive20 = ViewportMouse.newArchive(20, false, true, true); // L: 1443
			Login.Login_loadingText = "Connecting to update server"; // L: 1444
			Login.Login_loadingPercent = 20; // L: 1445
			Client.titleLoadingStage = 40; // L: 1446
		} else if (Client.titleLoadingStage == 40) { // L: 1449
			byte var25 = 0; // L: 1450
			var14 = var25 + class52.archive0.percentage() * 4 / 100; // L: 1451
			var14 += SpriteMask.archive1.percentage() * 4 / 100; // L: 1452
			var14 += WorldMapIcon_0.archive2.percentage() * 2 / 100; // L: 1453
			var14 += PlayerComposition.archive3.percentage() * 2 / 100; // L: 1454
			var14 += WorldMapCacheName.archive4.percentage() * 6 / 100; // L: 1455
			var14 += class8.archive5.percentage() * 4 / 100; // L: 1456
			var14 += UrlRequester.archive6.percentage() * 2 / 100; // L: 1457
			var14 += WorldMapData_0.archive7.percentage() * 56 / 100; // L: 1458
			var14 += ModeWhere.archive8.percentage() * 2 / 100; // L: 1459
			var14 += ViewportMouse.archive9.percentage() * 2 / 100; // L: 1460
			var14 += LoginScreenAnimation.archive10.percentage() * 2 / 100; // L: 1461
			var14 += WorldMapManager.archive11.percentage() * 2 / 100; // L: 1462
			var14 += WorldMapSection0.archive12.percentage() * 2 / 100; // L: 1463
			var14 += CollisionMap.archive13.percentage() * 2 / 100; // L: 1464
			var14 += Tiles.archive14.percentage() * 2 / 100; // L: 1465
			var14 += SpriteMask.archive15.percentage() * 2 / 100; // L: 1466
			var14 += ArchiveLoader.archive19.percentage() / 100; // L: 1467
			var14 += class25.archive18.percentage() / 100; // L: 1468
			var14 += Login.archive20.percentage() / 100; // L: 1469
			var14 += ItemComposition.archive17.method4461() && ItemComposition.archive17.isFullyLoaded() ? 1 : 0; // L: 1470
			if (var14 != 100) { // L: 1471
				if (var14 != 0) { // L: 1472
					Login.Login_loadingText = "Checking for updates - " + var14 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1473
			} else {
				class217.method4155(class52.archive0, "Animations"); // L: 1476
				class217.method4155(SpriteMask.archive1, "Skeletons"); // L: 1477
				class217.method4155(WorldMapCacheName.archive4, "Sound FX"); // L: 1478
				class217.method4155(class8.archive5, "Maps"); // L: 1479
				class217.method4155(UrlRequester.archive6, "Music Tracks"); // L: 1480
				class217.method4155(WorldMapData_0.archive7, "Models"); // L: 1481
				class217.method4155(ModeWhere.archive8, "Sprites"); // L: 1482
				class217.method4155(WorldMapManager.archive11, "Music Jingles"); // L: 1483
				class217.method4155(Tiles.archive14, "Music Samples"); // L: 1484
				class217.method4155(SpriteMask.archive15, "Music Patches"); // L: 1485
				class217.method4155(ArchiveLoader.archive19, "World Map"); // L: 1486
				class217.method4155(class25.archive18, "World Map Geography"); // L: 1487
				class217.method4155(Login.archive20, "World Map Ground"); // L: 1488
				class60.spriteIds = new GraphicsDefaults(); // L: 1489
				class60.spriteIds.decode(ItemComposition.archive17); // L: 1490
				Login.Login_loadingText = "Loaded update list"; // L: 1491
				Login.Login_loadingPercent = 30; // L: 1492
				Client.titleLoadingStage = 45; // L: 1493
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1496
			boolean var24 = !Client.isLowDetail; // L: 1497
			StructComposition.field3338 = 22050; // L: 1500
			PcmPlayer.PcmPlayer_stereo = var24; // L: 1501
			PcmPlayer.field1419 = 2; // L: 1502
			MidiPcmStream var22 = new MidiPcmStream(); // L: 1504
			var22.method3919(9, 128); // L: 1505
			class197.pcmPlayer0 = GrandExchangeOffer.method167(taskHandler, 0, 22050); // L: 1506
			class197.pcmPlayer0.setStream(var22); // L: 1507
			class69.method1256(SpriteMask.archive15, Tiles.archive14, WorldMapCacheName.archive4, var22); // L: 1508
			WorldMapDecorationType.pcmPlayer1 = GrandExchangeOffer.method167(taskHandler, 1, 2048); // L: 1509
			VarbitComposition.pcmStreamMixer = new PcmStreamMixer(); // L: 1510
			WorldMapDecorationType.pcmPlayer1.setStream(VarbitComposition.pcmStreamMixer); // L: 1511
			World.decimator = new Decimator(22050, StructComposition.field3338); // L: 1512
			Login.Login_loadingText = "Prepared sound engine"; // L: 1513
			Login.Login_loadingPercent = 35; // L: 1514
			Client.titleLoadingStage = 50; // L: 1515
			class350.WorldMapElement_fonts = new Fonts(ModeWhere.archive8, CollisionMap.archive13); // L: 1516
		} else {
			int var1;
			if (Client.titleLoadingStage == 50) { // L: 1519
				FontName[] var20 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12}; // L: 1522
				var1 = var20.length; // L: 1524
				Fonts var23 = class350.WorldMapElement_fonts; // L: 1525
				FontName[] var18 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12}; // L: 1528
				Client.fontsMap = var23.createMap(var18); // L: 1530
				if (Client.fontsMap.size() < var1) { // L: 1531
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1532
					Login.Login_loadingPercent = 40; // L: 1533
				} else {
					SecureRandomCallable.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1536
					Login.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1537
					ScriptEvent.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1538
					GrandExchangeOfferUnitPriceComparator.platformInfo = Client.platformInfoProvider.get(); // L: 1539
					Login.Login_loadingText = "Loaded fonts"; // L: 1540
					Login.Login_loadingPercent = 40; // L: 1541
					Client.titleLoadingStage = 60; // L: 1542
				}
			} else {
				int var3;
				int var4;
				Archive var15;
				Archive var16;
				if (Client.titleLoadingStage == 60) { // L: 1545
					var15 = LoginScreenAnimation.archive10; // L: 1547
					var16 = ModeWhere.archive8; // L: 1548
					var3 = 0; // L: 1550
					if (var15.tryLoadFileByNames("title.jpg", "")) { // L: 1551
						++var3;
					}

					if (var16.tryLoadFileByNames("logo", "")) { // L: 1552
						++var3;
					}

					if (var16.tryLoadFileByNames("logo_deadman_mode", "")) { // L: 1553
						++var3;
					}

					if (var16.tryLoadFileByNames("logo_seasonal_mode", "")) { // L: 1554
						++var3;
					}

					if (var16.tryLoadFileByNames("titlebox", "")) { // L: 1555
						++var3;
					}

					if (var16.tryLoadFileByNames("titlebutton", "")) { // L: 1556
						++var3;
					}

					if (var16.tryLoadFileByNames("runes", "")) { // L: 1557
						++var3;
					}

					if (var16.tryLoadFileByNames("title_mute", "")) { // L: 1558
						++var3;
					}

					if (var16.tryLoadFileByNames("options_radio_buttons,0", "")) { // L: 1559
						++var3;
					}

					if (var16.tryLoadFileByNames("options_radio_buttons,2", "")) { // L: 1560
						++var3;
					}

					if (var16.tryLoadFileByNames("options_radio_buttons,4", "")) { // L: 1561
						++var3;
					}

					if (var16.tryLoadFileByNames("options_radio_buttons,6", "")) { // L: 1562
						++var3;
					}

					var16.tryLoadFileByNames("sl_back", ""); // L: 1563
					var16.tryLoadFileByNames("sl_flags", ""); // L: 1564
					var16.tryLoadFileByNames("sl_arrows", ""); // L: 1565
					var16.tryLoadFileByNames("sl_stars", ""); // L: 1566
					var16.tryLoadFileByNames("sl_button", ""); // L: 1567
					var4 = WorldMapIcon_0.method286(); // L: 1571
					if (var3 < var4) { // L: 1572
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 1573
						Login.Login_loadingPercent = 50; // L: 1574
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1577
						Login.Login_loadingPercent = 50; // L: 1578
						ItemContainer.updateGameState(5); // L: 1579
						Client.titleLoadingStage = 70; // L: 1580
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1583
					if (!WorldMapIcon_0.archive2.isFullyLoaded()) { // L: 1584
						Login.Login_loadingText = "Loading config - " + WorldMapIcon_0.archive2.loadPercent() + "%"; // L: 1585
						Login.Login_loadingPercent = 60; // L: 1586
					} else {
						class228.method4310(WorldMapIcon_0.archive2); // L: 1589
						Archive var19 = WorldMapIcon_0.archive2; // L: 1590
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var19; // L: 1592
						class235.method4331(WorldMapIcon_0.archive2, WorldMapData_0.archive7); // L: 1594
						Frames.method3429(WorldMapIcon_0.archive2, WorldMapData_0.archive7, Client.isLowDetail); // L: 1595
						class3.method41(WorldMapIcon_0.archive2, WorldMapData_0.archive7); // L: 1596
						DirectByteArrayCopier.method4147(WorldMapIcon_0.archive2); // L: 1597
						var15 = WorldMapIcon_0.archive2; // L: 1598
						var16 = WorldMapData_0.archive7; // L: 1599
						boolean var21 = Client.isMembersWorld; // L: 1600
						Font var17 = SecureRandomCallable.fontPlain11; // L: 1601
						class299.ItemDefinition_archive = var15; // L: 1603
						class8.ItemDefinition_modelArchive = var16; // L: 1604
						Bounds.ItemDefinition_inMembersWorld = var21; // L: 1605
						class52.ItemDefinition_fileCount = class299.ItemDefinition_archive.getGroupFileCount(10); // L: 1606
						ItemComposition.ItemDefinition_fontPlain11 = var17; // L: 1607
						TextureProvider.method2935(WorldMapIcon_0.archive2, class52.archive0, SpriteMask.archive1); // L: 1609
						Archive var5 = WorldMapIcon_0.archive2; // L: 1610
						Archive var6 = WorldMapData_0.archive7; // L: 1611
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var5; // L: 1613
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var6; // L: 1614
						Archive var7 = WorldMapIcon_0.archive2; // L: 1616
						VarbitComposition.VarbitDefinition_archive = var7; // L: 1618
						Archive var8 = WorldMapIcon_0.archive2; // L: 1620
						VarpDefinition.VarpDefinition_archive = var8; // L: 1622
						class58.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1623
						MouseHandler.method1151(PlayerComposition.archive3, WorldMapData_0.archive7, ModeWhere.archive8, CollisionMap.archive13); // L: 1625
						class217.method4154(WorldMapIcon_0.archive2); // L: 1626
						Archive var9 = WorldMapIcon_0.archive2; // L: 1627
						EnumComposition.EnumDefinition_archive = var9; // L: 1629
						class22.method227(WorldMapIcon_0.archive2); // L: 1631
						class197.method3828(WorldMapIcon_0.archive2); // L: 1632
						GrandExchangeOffer.varcs = new Varcs(); // L: 1633
						StructComposition.method4734(WorldMapIcon_0.archive2, ModeWhere.archive8, CollisionMap.archive13); // L: 1634
						UserComparator9.method3562(WorldMapIcon_0.archive2, ModeWhere.archive8); // L: 1635
						Archive var10 = WorldMapIcon_0.archive2; // L: 1636
						Archive var11 = ModeWhere.archive8; // L: 1637
						WorldMapElement.WorldMapElement_archive = var11; // L: 1639
						if (var10.isFullyLoaded()) { // L: 1640
							WorldMapElement.WorldMapElement_count = var10.getGroupFileCount(35); // L: 1643
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1644

							for (int var12 = 0; var12 < WorldMapElement.WorldMapElement_count; ++var12) { // L: 1645
								byte[] var13 = var10.takeFile(35, var12); // L: 1646
								WorldMapElement.WorldMapElement_cached[var12] = new WorldMapElement(var12); // L: 1647
								if (var13 != null) { // L: 1648
									WorldMapElement.WorldMapElement_cached[var12].decode(new Buffer(var13)); // L: 1649
									WorldMapElement.WorldMapElement_cached[var12].method4576(); // L: 1650
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1654
						Login.Login_loadingPercent = 60; // L: 1655
						Client.titleLoadingStage = 80; // L: 1656
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1659
					var14 = 0; // L: 1660
					if (LoginScreenAnimation.compass == null) { // L: 1661
						LoginScreenAnimation.compass = BufferedSource.SpriteBuffer_getSprite(ModeWhere.archive8, class60.spriteIds.compass, 0);
					} else {
						++var14; // L: 1662
					}

					if (class236.redHintArrowSprite == null) { // L: 1663
						class236.redHintArrowSprite = BufferedSource.SpriteBuffer_getSprite(ModeWhere.archive8, class60.spriteIds.field3847, 0);
					} else {
						++var14; // L: 1664
					}

					if (WorldMapSection1.mapSceneSprites == null) { // L: 1665
						WorldMapSection1.mapSceneSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.mapScenes, 0);
					} else {
						++var14; // L: 1666
					}

					if (Client.headIconPkSprites == null) { // L: 1667
						Client.headIconPkSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.headIconsPk, 0);
					} else {
						++var14; // L: 1668
					}

					if (class169.headIconPrayerSprites == null) { // L: 1669
						class169.headIconPrayerSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3838, 0);
					} else {
						++var14; // L: 1670
					}

					if (class13.headIconHintSprites == null) { // L: 1671
						class13.headIconHintSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3843, 0);
					} else {
						++var14; // L: 1672
					}

					if (GrandExchangeOfferWorldComparator.mapMarkerSprites == null) { // L: 1673
						GrandExchangeOfferWorldComparator.mapMarkerSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3839, 0);
					} else {
						++var14; // L: 1674
					}

					if (Frames.crossSprites == null) { // L: 1675
						Frames.crossSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3845, 0);
					} else {
						++var14; // L: 1676
					}

					if (ChatChannel.mapDotSprites == null) { // L: 1677
						ChatChannel.mapDotSprites = WorldMapLabelSize.method268(ModeWhere.archive8, class60.spriteIds.field3846, 0);
					} else {
						++var14; // L: 1678
					}

					if (ObjectSound.scrollBarSprites == null) { // L: 1679
						ObjectSound.scrollBarSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.field3840, 0);
					} else {
						++var14; // L: 1680
					}

					if (Actor.modIconSprites == null) { // L: 1681
						Actor.modIconSprites = BoundaryObject.method3420(ModeWhere.archive8, class60.spriteIds.field3848, 0);
					} else {
						++var14; // L: 1682
					}

					if (var14 < 11) { // L: 1683
						Login.Login_loadingText = "Loading sprites - " + var14 * 100 / 12 + "%"; // L: 1684
						Login.Login_loadingPercent = 70; // L: 1685
					} else {
						AbstractFont.AbstractFont_modIconSprites = Actor.modIconSprites; // L: 1688
						class236.redHintArrowSprite.normalize(); // L: 1689
						var1 = (int)(Math.random() * 21.0D) - 10; // L: 1690
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1691
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1692
						var4 = (int)(Math.random() * 41.0D) - 20; // L: 1693
						WorldMapSection1.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var4 + var3); // L: 1694
						Login.Login_loadingText = "Loaded sprites"; // L: 1695
						Login.Login_loadingPercent = 70; // L: 1696
						Client.titleLoadingStage = 90; // L: 1697
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1700
					if (!ViewportMouse.archive9.isFullyLoaded()) { // L: 1701
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1702
						Login.Login_loadingPercent = 90; // L: 1703
					} else {
						BoundaryObject.textureProvider = new TextureProvider(ViewportMouse.archive9, ModeWhere.archive8, 20, WorldMapSectionType.clientPreferences.field1072, Client.isLowDetail ? 64 : 128); // L: 1706
						Rasterizer3D.Rasterizer3D_setTextureLoader(BoundaryObject.textureProvider); // L: 1707
						Rasterizer3D.Rasterizer3D_setBrightness(WorldMapSectionType.clientPreferences.field1072); // L: 1708
						Client.titleLoadingStage = 100; // L: 1709
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1712
					var14 = BoundaryObject.textureProvider.getLoadedPercentage(); // L: 1713
					if (var14 < 100) { // L: 1714
						Login.Login_loadingText = "Loading textures - " + var14 + "%"; // L: 1715
						Login.Login_loadingPercent = 90; // L: 1716
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1719
						Login.Login_loadingPercent = 90; // L: 1720
						Client.titleLoadingStage = 110; // L: 1721
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1724
					Friend.mouseRecorder = new MouseRecorder(); // L: 1725
					taskHandler.newThreadTask(Friend.mouseRecorder, 10); // L: 1726
					Login.Login_loadingText = "Loaded input handler"; // L: 1727
					Login.Login_loadingPercent = 92; // L: 1728
					Client.titleLoadingStage = 120; // L: 1729
				} else if (Client.titleLoadingStage == 120) { // L: 1732
					if (!LoginScreenAnimation.archive10.tryLoadFileByNames("huffman", "")) { // L: 1733
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1734
						Login.Login_loadingPercent = 94; // L: 1735
					} else {
						Huffman var0 = new Huffman(LoginScreenAnimation.archive10.takeFileByNames("huffman", "")); // L: 1738
						class219.huffman = var0; // L: 1740
						Login.Login_loadingText = "Loaded wordpack"; // L: 1742
						Login.Login_loadingPercent = 94; // L: 1743
						Client.titleLoadingStage = 130; // L: 1744
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1747
					if (!PlayerComposition.archive3.isFullyLoaded()) { // L: 1748
						Login.Login_loadingText = "Loading interfaces - " + PlayerComposition.archive3.loadPercent() * 4 / 5 + "%"; // L: 1749
						Login.Login_loadingPercent = 96; // L: 1750
					} else if (!WorldMapSection0.archive12.isFullyLoaded()) { // L: 1753
						Login.Login_loadingText = "Loading interfaces - " + (80 + WorldMapSection0.archive12.loadPercent() / 6) + "%"; // L: 1754
						Login.Login_loadingPercent = 96; // L: 1755
					} else if (!CollisionMap.archive13.isFullyLoaded()) { // L: 1758
						Login.Login_loadingText = "Loading interfaces - " + (96 + CollisionMap.archive13.loadPercent() / 50) + "%"; // L: 1759
						Login.Login_loadingPercent = 96; // L: 1760
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1763
						Login.Login_loadingPercent = 98; // L: 1764
						Client.titleLoadingStage = 140; // L: 1765
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1768
					Login.Login_loadingPercent = 100; // L: 1769
					if (!ArchiveLoader.archive19.tryLoadGroupByName(WorldMapCacheName.field333.name)) { // L: 1770
						Login.Login_loadingText = "Loading world map - " + ArchiveLoader.archive19.groupLoadPercentByName(WorldMapCacheName.field333.name) / 10 + "%"; // L: 1771
					} else {
						if (SoundSystem.worldMap == null) { // L: 1774
							SoundSystem.worldMap = new WorldMap(); // L: 1775
							SoundSystem.worldMap.init(ArchiveLoader.archive19, class25.archive18, Login.archive20, ScriptEvent.fontBold12, Client.fontsMap, WorldMapSection1.mapSceneSprites); // L: 1776
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1778
						Client.titleLoadingStage = 150; // L: 1779
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1782
					ItemContainer.updateGameState(10); // L: 1783
				}
			}
		}
	} // L: 1415 1421 1447 1474 1494 1517 1534 1543 1575 1581 1587 1657 1686 1698 1704 1710 1717 1722 1730 1736 1745 1751 1756 1761 1766 1772 1780 1784 1786

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1110901691"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4293
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4294
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4295
				int var3 = var2.x >> 7; // L: 4296
				int var4 = var2.y >> 7; // L: 4297
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4298
					if (var2.field1007 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4299
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4300
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4301
					}

					long var5 = TextureProvider.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4303
					var2.playerCycle = Client.cycle; // L: 4304
					MilliClock.scene.drawEntity(class90.Client_plane, var2.x, var2.y, WorldMapRegion.getTileHeight(var2.field1007 * 64 - 64 + var2.x, var2.field1007 * 64 - 64 + var2.y, class90.Client_plane), var2.field1007 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4305
				}
			}
		}

	} // L: 4309
}
