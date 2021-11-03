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

@ObfuscatedName("ai")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -858712261
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -5031362625863510515L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("g")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 617104153
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2102456181
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 390027783
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("z")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 688008119
	)
	static int field178;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1856914925
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 942844513
	)
	static int field191;
	@ObfuscatedName("ap")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 4237137078128785361L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2056276932530273441L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 32100603
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -160724727
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -827932873
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1933012565
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1123175499
	)
	int field184;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2060371379
	)
	int field185;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1530282643
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -628736541
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ai")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ah")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("as")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ak")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 578203363854775073L
	)
	volatile long field195;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ax")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("av")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0; // L: 50
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field191 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false; // L: 75
		this.field195 = 0L; // L: 76
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		ItemContainer.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-608909834"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method533();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	} // L: 105

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2098346454"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				FloorUnderlayDefinition.method3190(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Leg;",
		garbageValue = "97"
	)
	@Export("mouseWheel")
	protected class144 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-999701566"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	protected void method484(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-99443969"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 132
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 133
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 138
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 139
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 140
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 141
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 146
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 147
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 148
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 149
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 150
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 151
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 152
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 153
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 156
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

		java.awt.Canvas var1 = this.canvas; // L: 160
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1124509937"
	)
	protected final void method440() {
		java.awt.Canvas var1 = this.canvas; // L: 169
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 172
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 178
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds(); // L: 180
			this.contentWidth = Math.max(var2.highX, this.field184);
			this.contentHeight = Math.max(var2.highY, this.field185); // L: 182
			if (this.contentWidth <= 0) { // L: 183
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			KeyHandler.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight); // L: 189
			Canvas.rasterProvider = new RasterProvider(canvasWidth, KeyHandler.canvasHeight, this.canvas); // L: 190
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 195
			}

			this.fullRedraw = true; // L: 196
			this.resizeGame();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701018417"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 203
		int var2 = this.canvasY; // L: 204
		int var3 = this.contentWidth - canvasWidth - var1; // L: 205
		int var4 = this.contentHeight - KeyHandler.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.container();
				int var6 = 0; // L: 210
				int var7 = 0; // L: 211
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets(); // L: 213
					var6 = var8.left; // L: 214
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics(); // L: 217
				var10.setColor(Color.black); // L: 218
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 219
				}

				if (var2 > 0) { // L: 220
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 221
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 222
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 224
			}
		}

	} // L: 226

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1296094559"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 229
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 231
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 232
		KeyHandler.field122 = -1; // L: 233
		ModeWhere.method5543(this.canvas); // L: 235
		if (this.mouseWheelHandler != null) { // L: 236
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 237
		java.awt.Canvas var2 = this.canvas; // L: 238
		var2.setFocusTraversalKeysEnabled(false); // L: 240
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 241
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 242
		java.awt.Canvas var3 = this.canvas; // L: 244
		var3.addMouseListener(MouseHandler.MouseHandler_instance); // L: 246
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 247
		var3.addFocusListener(MouseHandler.MouseHandler_instance); // L: 248
		if (this.mouseWheelHandler != null) { // L: 250
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method533(); // L: 251
	} // L: 252

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-417163265"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 256
				++GameEngine_redundantStartThreadCount; // L: 257
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 258
					this.error("alreadyloaded"); // L: 259
					return; // L: 260
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 262
				return; // L: 263
			}

			gameEngine = this; // L: 265
			canvasWidth = var1; // L: 266
			KeyHandler.canvasHeight = var2; // L: 267
			RunException.RunException_revision = var3; // L: 268
			RunException.RunException_applet = this; // L: 269
			if (taskHandler == null) { // L: 270
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 271
		} catch (Exception var5) { // L: 273
			MilliClock.RunException_sendStackTrace((String)null, var5); // L: 274
			this.error("crash"); // L: 275
		}

	} // L: 277

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 280
		if (this.canvas != null) { // L: 281
			this.canvas.removeFocusListener(this); // L: 282
			var1.remove(this.canvas); // L: 283
		}

		canvasWidth = Math.max(var1.getWidth(), this.field184); // L: 285
		KeyHandler.canvasHeight = Math.max(var1.getHeight(), this.field185); // L: 286
		Insets var2;
		if (this.frame != null) { // L: 287
			var2 = this.frame.getInsets(); // L: 288
			canvasWidth -= var2.left + var2.right; // L: 289
			KeyHandler.canvasHeight -= var2.bottom + var2.top; // L: 290
		}

		this.canvas = new Canvas(this); // L: 292
		var1.setBackground(Color.BLACK); // L: 293
		var1.setLayout((LayoutManager)null); // L: 294
		var1.add(this.canvas); // L: 295
		this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight); // L: 296
		this.canvas.setVisible(true); // L: 297
		this.canvas.setBackground(Color.BLACK); // L: 298
		if (var1 == this.frame) { // L: 299
			var2 = this.frame.getInsets(); // L: 300
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 301
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 303
		}

		this.canvas.addFocusListener(this); // L: 304
		this.canvas.requestFocus(); // L: 305
		this.fullRedraw = true; // L: 306
		if (Canvas.rasterProvider != null && canvasWidth == Canvas.rasterProvider.width && KeyHandler.canvasHeight == Canvas.rasterProvider.height) { // L: 307
			((RasterProvider)Canvas.rasterProvider).setComponent(this.canvas); // L: 308
			Canvas.rasterProvider.drawFull(0, 0); // L: 309
		} else {
			Canvas.rasterProvider = new RasterProvider(canvasWidth, KeyHandler.canvasHeight, this.canvas); // L: 312
		}

		this.isCanvasInvalid = false; // L: 314
		this.field195 = class111.method2516(); // L: 315
	} // L: 316

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-597352233"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 319
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 320
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 321
				if (var1.endsWith("127.0.0.1")) { // L: 322
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 323
					}

					if (var1.endsWith("192.168.1.")) { // L: 324
						return true;
					} else {
						this.error("invalidhost"); // L: 325
						return false; // L: 326
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-754121126"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class111.method2516(); // L: 379
		long var3 = clientTickTimes[field178]; // L: 380
		clientTickTimes[field178] = var1; // L: 381
		field178 = field178 + 1 & 31; // L: 382
		if (0L != var3 && var1 > var3) { // L: 383
		}

		synchronized(this) { // L: 384
			WorldMapSectionType.hasFocus = volatileFocus; // L: 385
		} // L: 386

		this.doCycle(); // L: 387
	} // L: 388

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25949374"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 391
		long var2 = class111.method2516(); // L: 392
		long var4 = graphicsTickTimes[class362.field4057]; // L: 393
		graphicsTickTimes[class362.field4057] = var2; // L: 394
		class362.field4057 = class362.field4057 + 1 & 31; // L: 395
		if (var4 != 0L && var2 > var4) { // L: 396
			int var6 = (int)(var2 - var4); // L: 397
			fps = ((var6 >> 1) + 32000) / var6; // L: 398
		}

		if (++field191 - 1 > 50) { // L: 400
			field191 -= 50; // L: 401
			this.fullRedraw = true; // L: 402
			this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight); // L: 403
			this.canvas.setVisible(true); // L: 404
			if (var1 == this.frame) { // L: 405
				Insets var7 = this.frame.getInsets(); // L: 406
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 407
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 409
			}
		}

		if (this.isCanvasInvalid) { // L: 411
			this.replaceCanvas();
		}

		this.method449(); // L: 412
		this.draw(this.fullRedraw); // L: 413
		if (this.fullRedraw) { // L: 414
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 415
	} // L: 416

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1812985306"
	)
	final void method449() {
		Bounds var1 = this.getFrameContentBounds(); // L: 419
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 420
			this.resizeCanvas(); // L: 421
			this.resizeCanvasNextFrame = false; // L: 422
		}

	} // L: 424

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1443705423"
	)
	final void method533() {
		this.resizeCanvasNextFrame = true; // L: 427
	} // L: 428

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1010664187"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 431
			isKilled = true; // L: 432

			try {
				this.canvas.removeFocusListener(this); // L: 434
			} catch (Exception var5) { // L: 436
			}

			try {
				this.kill0(); // L: 438
			} catch (Exception var4) { // L: 440
			}

			if (this.frame != null) { // L: 441
				try {
					System.exit(0); // L: 443
				} catch (Throwable var3) { // L: 445
				}
			}

			if (taskHandler != null) { // L: 447
				try {
					taskHandler.close(); // L: 449
				} catch (Exception var2) { // L: 451
				}
			}

			this.vmethod1164(); // L: 453
		}
	} // L: 454

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071280922"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466223513"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1302395481"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9054"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1526487406"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 514
			if (class115.fontHelvetica13 == null) { // L: 515
				class115.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 516
				class28.loginScreenFontMetrics = this.canvas.getFontMetrics(class115.fontHelvetica13); // L: 517
			}

			if (var3) { // L: 519
				var4.setColor(Color.black); // L: 520
				var4.fillRect(0, 0, canvasWidth, KeyHandler.canvasHeight); // L: 521
			}

			Color var5 = new Color(140, 17, 17); // L: 523

			try {
				if (class19.field89 == null) { // L: 525
					class19.field89 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class19.field89.getGraphics(); // L: 526
				var6.setColor(var5); // L: 527
				var6.drawRect(0, 0, 303, 33); // L: 528
				var6.fillRect(2, 2, var1 * 3, 30); // L: 529
				var6.setColor(Color.black); // L: 530
				var6.drawRect(1, 1, 301, 31); // L: 531
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 532
				var6.setFont(class115.fontHelvetica13); // L: 533
				var6.setColor(Color.white); // L: 534
				var6.drawString(var2, (304 - class28.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 535
				var4.drawImage(class19.field89, canvasWidth / 2 - 152, KeyHandler.canvasHeight / 2 - 18, (ImageObserver)null); // L: 536
			} catch (Exception var9) { // L: 538
				int var7 = canvasWidth / 2 - 152; // L: 539
				int var8 = KeyHandler.canvasHeight / 2 - 18; // L: 540
				var4.setColor(var5); // L: 541
				var4.drawRect(var7, var8, 303, 33); // L: 542
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 543
				var4.setColor(Color.black); // L: 544
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 545
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 546
				var4.setFont(class115.fontHelvetica13); // L: 547
				var4.setColor(Color.white); // L: 548
				var4.drawString(var2, var7 + (304 - class28.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 549
			}
		} catch (Exception var10) { // L: 552
			this.canvas.repaint(); // L: 553
		}

	} // L: 555

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1801681604"
	)
	protected final void method508() {
		class19.field89 = null; // L: 558
		class115.fontHelvetica13 = null; // L: 559
		class28.loginScreenFontMetrics = null; // L: 560
	} // L: 561

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1990615273"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 564
			this.hasErrored = true; // L: 565
			System.out.println("error_game_" + var1); // L: 566

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 568
			} catch (Exception var3) { // L: 570
			}

		}
	} // L: 571

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-2036429987"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 574
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1380374752"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 579
		int var2 = Math.max(var1.getWidth(), this.field184); // L: 580
		int var3 = Math.max(var1.getHeight(), this.field185); // L: 581
		if (this.frame != null) { // L: 582
			Insets var4 = this.frame.getInsets(); // L: 583
			var2 -= var4.right + var4.left; // L: 584
			var3 -= var4.bottom + var4.top; // L: 585
		}

		return new Bounds(var2, var3); // L: 587
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1980"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 591
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	protected abstract void vmethod1164();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 467
			stopTimeMs = class111.method2516(); // L: 468
			FloorUnderlayDefinition.method3190(5000L); // L: 469
			this.kill(); // L: 470
		}
	} // L: 471

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 478
			this.fullRedraw = true; // L: 479
			if (class111.method2516() - this.field195 > 1000L) { // L: 480
				Rectangle var2 = var1.getClipBounds(); // L: 481
				if (var2 == null || var2.width >= canvasWidth && var2.height >= KeyHandler.canvasHeight) {
					this.isCanvasInvalid = true; // L: 482
				}
			}

		}
	} // L: 484

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 499
	} // L: 500

	public final void windowIconified(WindowEvent var1) {
	} // L: 504

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 457
			stopTimeMs = 0L; // L: 458
		}
	} // L: 459

	public final void windowClosed(WindowEvent var1) {
	} // L: 496

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 503

	public final void windowOpened(WindowEvent var1) {
	} // L: 505

	public abstract void init();

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 492
	} // L: 493

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 462
			stopTimeMs = class111.method2516() + 4000L; // L: 463
		}
	} // L: 464

	public final void windowActivated(WindowEvent var1) {
	} // L: 495

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 487
		this.fullRedraw = true; // L: 488
	} // L: 489

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 502

	public final void update(Graphics var1) {
		this.paint(var1); // L: 474
	} // L: 475

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 331
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 332
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 333
					String var2 = GrandExchangeOfferAgeComparator.javaVersion; // L: 334
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 335
						this.error("wrongjava"); // L: 336
						return; // L: 337
					}

					if (var2.startsWith("1.6.0_")) { // L: 339
						int var3;
						for (var3 = 6; var3 < var2.length() && class117.isDigit(var2.charAt(var3)); ++var3) { // L: 340 341
						}

						String var4 = var2.substring(6, var3); // L: 342
						if (class129.isNumber(var4) && TaskHandler.method2881(var4) < 10) { // L: 343
							this.error("wrongjava"); // L: 344
							return; // L: 345
						}
					}

					fiveOrOne = 5; // L: 348
				}
			}

			this.setFocusCycleRoot(true); // L: 351
			this.addCanvas(); // L: 352
			this.setUp(); // L: 353

			Object var8;
			try {
				var8 = new NanoClock(); // L: 357
			} catch (Throwable var6) { // L: 359
				var8 = new MilliClock(); // L: 360
			}

			Clock.clock = (Clock)var8; // L: 363

			while (stopTimeMs == 0L || class111.method2516() < stopTimeMs) { // L: 364
				class1.gameCyclesToDo = Clock.clock.wait(cycleDurationMillis, fiveOrOne); // L: 365

				for (int var5 = 0; var5 < class1.gameCyclesToDo; ++var5) { // L: 366
					this.clientTick();
				}

				this.graphicsTick(); // L: 367
				this.post(this.canvas); // L: 368
			}
		} catch (Exception var7) { // L: 371
			MilliClock.RunException_sendStackTrace((String)null, var7); // L: 372
			this.error("crash"); // L: 373
		}

		this.kill(); // L: 375
	} // L: 376

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1953693522"
	)
	public static int method584() {
		return KeyHandler.KeyHandler_idleCycles; // L: 134
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lni;I)Ljava/lang/String;",
		garbageValue = "658724655"
	)
	public static String method585(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 32
			return null;
		} else {
			int var2 = 0; // L: 33

			int var3;
			for (var3 = var0.length(); var2 < var3 && Ignored.method6212(var0.charAt(var2)); ++var2) { // L: 34 35
			}

			while (var3 > var2 && Ignored.method6212(var0.charAt(var3 - 1))) { // L: 36
				--var3;
			}

			int var4 = var3 - var2; // L: 37
			if (var4 >= 1 && var4 <= SecureRandomCallable.method2052(var1)) { // L: 38
				StringBuilder var5 = new StringBuilder(var4); // L: 39

				for (int var6 = var2; var6 < var3; ++var6) { // L: 40
					char var7 = var0.charAt(var6); // L: 41
					boolean var8;
					if (Character.isISOControl(var7)) { // L: 44
						var8 = false; // L: 45
					} else if (ObjectComposition.isAlphaNumeric(var7)) { // L: 48
						var8 = true; // L: 49
					} else {
						char[] var9 = class383.field4236; // L: 53
						int var10 = 0;

						label93:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class383.field4237; // L: 63

								for (var10 = 0; var10 < var9.length; ++var10) { // L: 64
									var11 = var9[var10]; // L: 65
									if (var11 == var7) { // L: 66
										var8 = true; // L: 67
										break label93; // L: 68
									}
								}

								var8 = false; // L: 72
								break;
							}

							var11 = var9[var10]; // L: 55
							if (var7 == var11) { // L: 56
								var8 = true; // L: 57
								break; // L: 58
							}

							++var10; // L: 54
						}
					}

					if (var8) { // L: 74
						char var12;
						switch(var7) { // L: 77
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_'; // L: 95
							break; // L: 96
						case '#':
						case '[':
						case ']':
							var12 = var7; // L: 112
							break; // L: 113
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var12 = 'a'; // L: 154
							break; // L: 155
						case 'Ç':
						case 'ç':
							var12 = 'c'; // L: 116
							break; // L: 117
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e'; // L: 130
							break; // L: 131
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i'; // L: 103
							break; // L: 104
						case 'Ñ':
						case 'ñ':
							var12 = 'n'; // L: 107
							break; // L: 108
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var12 = 'o'; // L: 142
							break; // L: 143
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u'; // L: 89
							break; // L: 90
						case 'ß':
							var12 = 'b'; // L: 157
							break;
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y'; // L: 120
							break; // L: 121
						default:
							var12 = Character.toLowerCase(var7); // L: 79
						}

						if (var12 != 0) {
							var5.append(var12); // L: 163
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lop;IIIIIII)V",
		garbageValue = "1750259584"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 161
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 162

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 164
				if (var7 == 0) { // L: 165
					if (var1 == 0) { // L: 166
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 167
						int var11 = var2 + var4 + 932731; // L: 170
						int var12 = var3 + var5 + 556238; // L: 171
						int var13 = class19.method291(var11 + 45365, var12 + 91923, 4) - 128 + (class19.method291(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class19.method291(var11, var12, 1) - 128 >> 2); // L: 173
						var13 = (int)(0.3D * (double)var13) + 35; // L: 174
						if (var13 < 10) { // L: 175
							var13 = 10;
						} else if (var13 > 60) { // L: 176
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 179
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 181
					}
					break;
				}

				if (var7 == 1) { // L: 184
					int var8 = var0.readUnsignedByte(); // L: 185
					if (var8 == 1) { // L: 186
						var8 = 0;
					}

					if (var1 == 0) { // L: 187
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 188
					}
					break;
				}

				if (var7 <= 49) { // L: 191
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 192
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 193
					Tiles.field969[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 194
				} else if (var7 <= 81) { // L: 197
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 198
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 201
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 206
				if (var7 == 0) { // L: 207
					break;
				}

				if (var7 == 1) { // L: 208
					var0.readUnsignedByte(); // L: 209
					break;
				}

				if (var7 <= 49) { // L: 212
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 215

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "8"
	)
	static int method555(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2114
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2115
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = PlayerType.method5239(var3) ? 1 : 0; // L: 2116
			return 1; // L: 2117
		} else if (var0 == 3501) { // L: 2119
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2120
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Varps.method5007(var3) ? 1 : 0; // L: 2121
			return 1; // L: 2122
		} else if (var0 == 3502) { // L: 2124
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2125
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ItemComposition.method3403(var3) ? 1 : 0; // L: 2126
			return 1; // L: 2127
		} else {
			return 2; // L: 2129
		}
	}
}
