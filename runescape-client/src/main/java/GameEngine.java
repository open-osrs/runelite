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

@ObfuscatedName("af")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 661166393
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 3801980113368397719L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 849049895
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1089824943
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1080528073
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("c")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1807936759
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("g")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1202015039
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("ax")
	static Image field354;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 116937435
	)
	static int field355;
	@ObfuscatedName("aq")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6246927008582722683L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -7805304911218154981L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("r")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1091351445
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2128033235
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1437613301
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -179382835
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1558391463
	)
	int field350;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -422930921
	)
	int field348;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 59571423
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -45318295
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ai")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ar")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ag")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("aj")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("am")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8555805370222747289L
	)
	volatile long field363;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ah")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ao")
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
		field355 = 500; // L: 73
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
		this.field363 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		class19.method225(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1134068726"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method490();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "104"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				try {
					Thread.sleep(1L); // L: 125
				} catch (InterruptedException var4) { // L: 127
				}
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 130
			}

		}
	} // L: 131

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Ldw;",
		garbageValue = "-92"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 134
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 135
			this.mouseWheelHandler.addTo(this.canvas); // L: 136
		}

		return this.mouseWheelHandler; // L: 138
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383352988"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 142
	} // L: 143

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "973874436"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 146
	} // L: 147

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1238474569"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class243.method4668(); // L: 150
		LoginScreenAnimation.method2236(this.canvas); // L: 151
	} // L: 152

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas; // L: 155
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 157
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 158
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 159
	} // L: 161

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1759538265"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 164
		if (var1 != null) { // L: 165
			Bounds var2 = this.getFrameContentBounds(); // L: 166
			this.contentWidth = Math.max(var2.highX, this.field350); // L: 167
			this.contentHeight = Math.max(var2.highY, this.field348); // L: 168
			if (this.contentWidth <= 0) { // L: 169
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 170
				this.contentHeight = 1;
			}

			class32.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 171
			ReflectionCheck.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 172
			this.canvasX = (this.contentWidth - class32.canvasWidth) / 2; // L: 173
			this.canvasY = 0; // L: 174
			this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight); // L: 175
			class26.rasterProvider = new RasterProvider(class32.canvasWidth, ReflectionCheck.canvasHeight, this.canvas); // L: 176
			if (var1 == this.frame) { // L: 177
				Insets var3 = this.frame.getInsets(); // L: 178
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 179
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 181
			}

			this.fullRedraw = true; // L: 182
			this.resizeGame(); // L: 183
		}
	} // L: 184

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101906226"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 189
		int var2 = this.canvasY; // L: 190
		int var3 = this.contentWidth - class32.canvasWidth - var1; // L: 191
		int var4 = this.contentHeight - ReflectionCheck.canvasHeight - var2; // L: 192
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 193
			try {
				Container var5 = this.container(); // L: 195
				int var6 = 0; // L: 196
				int var7 = 0; // L: 197
				if (var5 == this.frame) { // L: 198
					Insets var8 = this.frame.getInsets(); // L: 199
					var6 = var8.left; // L: 200
					var7 = var8.top; // L: 201
				}

				Graphics var10 = var5.getGraphics(); // L: 203
				var10.setColor(Color.black); // L: 204
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 205
				}

				if (var2 > 0) { // L: 206
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 207
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 208
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 210
			}
		}

	} // L: 212

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		SoundSystem.method803(this.canvas); // L: 215
		java.awt.Canvas var1 = this.canvas; // L: 216
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 218
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 219
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 220
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 221
		if (this.mouseWheelHandler != null) { // L: 223
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 224
		LoginScreenAnimation.method2236(this.canvas); // L: 225
		java.awt.Canvas var2 = this.canvas; // L: 226
		var2.addMouseListener(MouseHandler.MouseHandler_instance); // L: 228
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 229
		var2.addFocusListener(MouseHandler.MouseHandler_instance); // L: 230
		if (this.mouseWheelHandler != null) { // L: 232
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method490(); // L: 233
	} // L: 234

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "428962423"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 238
				++GameEngine_redundantStartThreadCount; // L: 239
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 240
					this.error("alreadyloaded"); // L: 241
					return; // L: 242
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 244
				return; // L: 245
			}

			gameEngine = this; // L: 247
			class32.canvasWidth = var1; // L: 248
			ReflectionCheck.canvasHeight = var2; // L: 249
			RunException.RunException_revision = var3; // L: 250
			RunException.RunException_applet = this; // L: 251
			if (taskHandler == null) { // L: 252
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 253
		} catch (Exception var5) { // L: 255
			class266.RunException_sendStackTrace((String)null, var5); // L: 256
			this.error("crash"); // L: 257
		}

	} // L: 259

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1032083147"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 262
		if (this.canvas != null) { // L: 263
			this.canvas.removeFocusListener(this); // L: 264
			var1.remove(this.canvas); // L: 265
		}

		class32.canvasWidth = Math.max(var1.getWidth(), this.field350); // L: 267
		ReflectionCheck.canvasHeight = Math.max(var1.getHeight(), this.field348); // L: 268
		Insets var2;
		if (this.frame != null) { // L: 269
			var2 = this.frame.getInsets(); // L: 270
			class32.canvasWidth -= var2.right + var2.left; // L: 271
			ReflectionCheck.canvasHeight -= var2.bottom + var2.top; // L: 272
		}

		this.canvas = new Canvas(this); // L: 274
		var1.setBackground(Color.BLACK); // L: 275
		var1.setLayout((LayoutManager)null); // L: 276
		var1.add(this.canvas); // L: 277
		this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight); // L: 278
		this.canvas.setVisible(true); // L: 279
		this.canvas.setBackground(Color.BLACK); // L: 280
		if (var1 == this.frame) { // L: 281
			var2 = this.frame.getInsets(); // L: 282
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 283
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 285
		}

		this.canvas.addFocusListener(this); // L: 286
		this.canvas.requestFocus(); // L: 287
		this.fullRedraw = true; // L: 288
		if (class26.rasterProvider != null && class32.canvasWidth == class26.rasterProvider.width && ReflectionCheck.canvasHeight == class26.rasterProvider.height) { // L: 289
			((RasterProvider)class26.rasterProvider).setComponent(this.canvas); // L: 290
			class26.rasterProvider.drawFull(0, 0); // L: 291
		} else {
			class26.rasterProvider = new RasterProvider(class32.canvasWidth, ReflectionCheck.canvasHeight, this.canvas); // L: 294
		}

		this.isCanvasInvalid = false; // L: 296
		this.field363 = ObjectComposition.currentTimeMillis(); // L: 297
	} // L: 298

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1231993586"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 301
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 302
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 303
				if (var1.endsWith("127.0.0.1")) { // L: 304
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 305
					}

					if (var1.endsWith("192.168.1.")) { // L: 306
						return true;
					} else {
						this.error("invalidhost"); // L: 307
						return false; // L: 308
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
		garbageValue = "996629970"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ObjectComposition.currentTimeMillis(); // L: 361
		long var3 = clientTickTimes[clientTickTimeIdx]; // L: 362
		clientTickTimes[clientTickTimeIdx] = var1; // L: 363
		clientTickTimeIdx = clientTickTimeIdx + 1 & 31; // L: 364
		if (var3 != 0L && var1 > var3) { // L: 365
		}

		synchronized(this) { // L: 366
			WorldMapSection1.hasFocus = volatileFocus; // L: 367
		} // L: 368

		this.doCycle(); // L: 369
	} // L: 370

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 373
		long var2 = ObjectComposition.currentTimeMillis(); // L: 374
		long var4 = graphicsTickTimes[graphicsTickTimeIdx]; // L: 375
		graphicsTickTimes[graphicsTickTimeIdx] = var2; // L: 376
		graphicsTickTimeIdx = graphicsTickTimeIdx + 1 & 31; // L: 377
		if (0L != var4 && var2 > var4) { // L: 378
			int var6 = (int)(var2 - var4); // L: 379
			fps = ((var6 >> 1) + 32000) / var6; // L: 380
		}

		if (++field355 - 1 > 50) { // L: 382
			field355 -= 50; // L: 383
			this.fullRedraw = true; // L: 384
			this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight); // L: 385
			this.canvas.setVisible(true); // L: 386
			if (var1 == this.frame) { // L: 387
				Insets var7 = this.frame.getInsets(); // L: 388
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 389
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 391
			}
		}

		if (this.isCanvasInvalid) { // L: 393
			this.replaceCanvas();
		}

		this.method493(); // L: 394
		this.draw(this.fullRedraw); // L: 395
		if (this.fullRedraw) { // L: 396
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 397
	} // L: 398

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	final void method493() {
		Bounds var1 = this.getFrameContentBounds(); // L: 401
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 402
			this.resizeCanvas(); // L: 403
			this.resizeCanvasNextFrame = false; // L: 404
		}

	} // L: 406

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1998261621"
	)
	final void method490() {
		this.resizeCanvasNextFrame = true; // L: 409
	} // L: 410

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "928825308"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 413
			isKilled = true; // L: 414

			try {
				this.canvas.removeFocusListener(this); // L: 416
			} catch (Exception var5) { // L: 418
			}

			try {
				this.kill0(); // L: 420
			} catch (Exception var4) { // L: 422
			}

			if (this.frame != null) { // L: 423
				try {
					System.exit(0); // L: 425
				} catch (Throwable var3) { // L: 427
				}
			}

			if (taskHandler != null) { // L: 429
				try {
					taskHandler.close(); // L: 431
				} catch (Exception var2) { // L: 433
				}
			}

			this.vmethod1471(); // L: 435
		}
	} // L: 436

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232069568"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "9311"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "561275520"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "91092739"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 519
			if (KitDefinition.fontHelvetica13 == null) { // L: 520
				KitDefinition.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 521
				DefaultsGroup.loginScreenFontMetrics = this.canvas.getFontMetrics(KitDefinition.fontHelvetica13); // L: 522
			}

			if (var3) { // L: 524
				var4.setColor(Color.black); // L: 525
				var4.fillRect(0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight); // L: 526
			}

			Color var5 = new Color(140, 17, 17); // L: 528

			try {
				if (field354 == null) { // L: 530
					field354 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field354.getGraphics(); // L: 531
				var6.setColor(var5); // L: 532
				var6.drawRect(0, 0, 303, 33); // L: 533
				var6.fillRect(2, 2, var1 * 3, 30); // L: 534
				var6.setColor(Color.black); // L: 535
				var6.drawRect(1, 1, 301, 31); // L: 536
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 537
				var6.setFont(KitDefinition.fontHelvetica13); // L: 538
				var6.setColor(Color.white); // L: 539
				var6.drawString(var2, (304 - DefaultsGroup.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 540
				var4.drawImage(field354, class32.canvasWidth / 2 - 152, ReflectionCheck.canvasHeight / 2 - 18, (ImageObserver)null); // L: 541
			} catch (Exception var9) { // L: 543
				int var7 = class32.canvasWidth / 2 - 152; // L: 544
				int var8 = ReflectionCheck.canvasHeight / 2 - 18; // L: 545
				var4.setColor(var5); // L: 546
				var4.drawRect(var7, var8, 303, 33); // L: 547
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 548
				var4.setColor(Color.black); // L: 549
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 550
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 551
				var4.setFont(KitDefinition.fontHelvetica13); // L: 552
				var4.setColor(Color.white); // L: 553
				var4.drawString(var2, var7 + (304 - DefaultsGroup.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 554
			}
		} catch (Exception var10) { // L: 557
			this.canvas.repaint(); // L: 558
		}

	} // L: 560

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	protected final void method501() {
		field354 = null; // L: 563
		KitDefinition.fontHelvetica13 = null; // L: 564
		DefaultsGroup.loginScreenFontMetrics = null; // L: 565
	} // L: 566

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 569
			this.hasErrored = true; // L: 570
			System.out.println("error_game_" + var1); // L: 571

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 573
			} catch (Exception var3) { // L: 575
			}

		}
	} // L: 576

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1142166715"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 579
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;",
		garbageValue = "1389693294"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 584
		int var2 = Math.max(var1.getWidth(), this.field350); // L: 585
		int var3 = Math.max(var1.getHeight(), this.field348); // L: 586
		if (this.frame != null) { // L: 587
			Insets var4 = this.frame.getInsets(); // L: 588
			var2 -= var4.right + var4.left; // L: 589
			var3 -= var4.bottom + var4.top; // L: 590
		}

		return new Bounds(var2, var3); // L: 592
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 596
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992375266"
	)
	protected abstract void vmethod1471();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 449
			stopTimeMs = ObjectComposition.currentTimeMillis(); // L: 450
			long var1 = 4999L; // L: 454

			try {
				Thread.sleep(var1); // L: 457
			} catch (InterruptedException var5) { // L: 459
			}

			try {
				Thread.sleep(1L); // L: 463
			} catch (InterruptedException var4) { // L: 465
			}

			this.kill(); // L: 475
		}
	} // L: 476

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 483
			this.fullRedraw = true; // L: 484
			if (ObjectComposition.currentTimeMillis() - this.field363 > 1000L) { // L: 485
				Rectangle var2 = var1.getClipBounds(); // L: 486
				if (var2 == null || var2.width >= class32.canvasWidth && var2.height >= ReflectionCheck.canvasHeight) {
					this.isCanvasInvalid = true; // L: 487
				}
			}

		}
	} // L: 489

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 439
			stopTimeMs = 0L; // L: 440
		}
	} // L: 441

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 444
			stopTimeMs = ObjectComposition.currentTimeMillis() + 4000L; // L: 445
		}
	} // L: 446

	public final void update(Graphics var1) {
		this.paint(var1); // L: 479
	} // L: 480

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 492
		this.fullRedraw = true; // L: 493
	} // L: 494

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 497
	} // L: 498

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 313
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 314
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 315
					String var2 = TaskHandler.javaVersion; // L: 316
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 317
						this.error("wrongjava"); // L: 318
						return; // L: 319
					}

					if (var2.startsWith("1.6.0_")) { // L: 321
						int var3;
						for (var3 = 6; var3 < var2.length() && UserComparator10.isDigit(var2.charAt(var3)); ++var3) { // L: 322 323
						}

						String var4 = var2.substring(6, var3); // L: 324
						if (class20.isNumber(var4) && class82.method1908(var4) < 10) { // L: 325
							this.error("wrongjava"); // L: 326
							return; // L: 327
						}
					}

					fiveOrOne = 5; // L: 330
				}
			}

			this.setFocusCycleRoot(true); // L: 333
			this.addCanvas(); // L: 334
			this.setUp(); // L: 335

			Object var8;
			try {
				var8 = new NanoClock(); // L: 339
			} catch (Throwable var6) { // L: 341
				var8 = new MilliClock(); // L: 342
			}

			clock = (Clock)var8; // L: 345

			while (0L == stopTimeMs || ObjectComposition.currentTimeMillis() < stopTimeMs) { // L: 346
				class260.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne); // L: 347

				for (int var5 = 0; var5 < class260.gameCyclesToDo; ++var5) { // L: 348
					this.clientTick();
				}

				this.graphicsTick(); // L: 349
				this.post(this.canvas); // L: 350
			}
		} catch (Exception var7) { // L: 353
			class266.RunException_sendStackTrace((String)null, var7); // L: 354
			this.error("crash"); // L: 355
		}

		this.kill(); // L: 357
	} // L: 358

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 507

	public final void windowIconified(WindowEvent var1) {
	} // L: 509

	public final void windowClosed(WindowEvent var1) {
	} // L: 501

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 504
	} // L: 505

	public final void windowActivated(WindowEvent var1) {
	} // L: 500

	public final void windowOpened(WindowEvent var1) {
	} // L: 510

	public abstract void init();

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 508

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1726985857"
	)
	static int method538(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2043539672"
	)
	static void method572(int var0) {
		Login.loginIndex = 12; // L: 1635
		Login.field1032 = var0; // L: 1636
	} // L: 1637
}
