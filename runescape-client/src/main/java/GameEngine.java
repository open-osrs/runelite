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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 592572313
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 4399734566856099317L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("l")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -217446521
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2138888743
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 484725993
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 410287199
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("r")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("a")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2119001659
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -135808343
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1378639745
	)
	static int field339;
	@ObfuscatedName("ac")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -1169990265502420109L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6076947773962414417L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("z")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 743110399
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1135790119
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2057175105
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 992390113
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1928026365
	)
	int field332;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -387860183
	)
	int field333;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -328692287
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1109070493
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("at")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("av")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ax")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ak")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 7498009749239990725L
	)
	volatile long field342;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ad")
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
		field339 = 500; // L: 73
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
		this.field342 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		StructComposition.method2863(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-26"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method542();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-21"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				UrlRequest.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Ldb;",
		garbageValue = "49"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "45003502"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1356656584"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "615867530"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		SecureRandomCallable.method2080(); // L: 127
		class82.method1946(this.canvas); // L: 128
	} // L: 129

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas; // L: 132
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 134
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 135
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 136
	} // L: 138

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-715885048"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 141
		if (var1 != null) { // L: 142
			Bounds var2 = this.getFrameContentBounds(); // L: 143
			this.contentWidth = Math.max(var2.highX, this.field332); // L: 144
			this.contentHeight = Math.max(var2.highY, this.field333); // L: 145
			if (this.contentWidth <= 0) { // L: 146
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 147
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 148
			HealthBarDefinition.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 149
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 150
			this.canvasY = 0; // L: 151
			this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight); // L: 152
			WorldMapDecorationType.rasterProvider = new RasterProvider(canvasWidth, HealthBarDefinition.canvasHeight, this.canvas); // L: 153
			if (var1 == this.frame) { // L: 154
				Insets var3 = this.frame.getInsets(); // L: 155
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 156
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 158
			}

			this.fullRedraw = true; // L: 159
			this.resizeGame(); // L: 160
		}
	} // L: 161

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-997141942"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1625111694"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 166
		int var2 = this.canvasY; // L: 167
		int var3 = this.contentWidth - canvasWidth - var1; // L: 168
		int var4 = this.contentHeight - HealthBarDefinition.canvasHeight - var2; // L: 169
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 170
			try {
				Container var5 = this.container(); // L: 172
				int var6 = 0; // L: 173
				int var7 = 0; // L: 174
				if (var5 == this.frame) { // L: 175
					Insets var8 = this.frame.getInsets(); // L: 176
					var6 = var8.left; // L: 177
					var7 = var8.top; // L: 178
				}

				Graphics var10 = var5.getGraphics(); // L: 180
				var10.setColor(Color.black); // L: 181
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 182
				}

				if (var2 > 0) { // L: 183
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 184
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 185
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 187
			}
		}

	} // L: 189

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "22836699"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 192
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 194
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 195
		KeyHandler.field260 = -1; // L: 196
		class21.method289(this.canvas); // L: 198
		if (this.mouseWheelHandler != null) { // L: 199
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 200
		class82.method1946(this.canvas); // L: 201
		class12.method192(this.canvas); // L: 202
		if (this.mouseWheelHandler != null) { // L: 203
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method542(); // L: 204
	} // L: 205

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "70"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 209
				++GameEngine_redundantStartThreadCount; // L: 210
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 211
					this.error("alreadyloaded"); // L: 212
					return; // L: 213
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 215
				return; // L: 216
			}

			gameEngine = this; // L: 218
			canvasWidth = var1; // L: 219
			HealthBarDefinition.canvasHeight = var2; // L: 220
			TileItem.RunException_revision = var3; // L: 221
			RunException.RunException_applet = this; // L: 222
			if (taskHandler == null) { // L: 223
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 224
		} catch (Exception var5) { // L: 226
			class27.RunException_sendStackTrace((String)null, var5); // L: 227
			this.error("crash"); // L: 228
		}

	} // L: 230

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-159166525"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 233
		if (this.canvas != null) { // L: 234
			this.canvas.removeFocusListener(this); // L: 235
			var1.remove(this.canvas); // L: 236
		}

		canvasWidth = Math.max(var1.getWidth(), this.field332); // L: 238
		HealthBarDefinition.canvasHeight = Math.max(var1.getHeight(), this.field333); // L: 239
		Insets var2;
		if (this.frame != null) { // L: 240
			var2 = this.frame.getInsets(); // L: 241
			canvasWidth -= var2.left + var2.right; // L: 242
			HealthBarDefinition.canvasHeight -= var2.top + var2.bottom; // L: 243
		}

		this.canvas = new Canvas(this); // L: 245
		var1.setBackground(Color.BLACK); // L: 246
		var1.setLayout((LayoutManager)null); // L: 247
		var1.add(this.canvas); // L: 248
		this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight); // L: 249
		this.canvas.setVisible(true); // L: 250
		this.canvas.setBackground(Color.BLACK); // L: 251
		if (var1 == this.frame) { // L: 252
			var2 = this.frame.getInsets(); // L: 253
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 254
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 256
		}

		this.canvas.addFocusListener(this); // L: 257
		this.canvas.requestFocus(); // L: 258
		this.fullRedraw = true; // L: 259
		if (WorldMapDecorationType.rasterProvider != null && canvasWidth == WorldMapDecorationType.rasterProvider.width && HealthBarDefinition.canvasHeight == WorldMapDecorationType.rasterProvider.height) { // L: 260
			((RasterProvider)WorldMapDecorationType.rasterProvider).setComponent(this.canvas); // L: 261
			WorldMapDecorationType.rasterProvider.drawFull(0, 0); // L: 262
		} else {
			WorldMapDecorationType.rasterProvider = new RasterProvider(canvasWidth, HealthBarDefinition.canvasHeight, this.canvas); // L: 265
		}

		this.isCanvasInvalid = false; // L: 267
		this.field342 = Archive.currentTimeMillis(); // L: 268
	} // L: 269

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1116268715"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 272
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 273
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 274
				if (var1.endsWith("127.0.0.1")) { // L: 275
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 276
					}

					if (var1.endsWith("192.168.1.")) { // L: 277
						return true;
					} else {
						this.error("invalidhost"); // L: 278
						return false; // L: 279
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2127496332"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Archive.currentTimeMillis(); // L: 323
		long var3 = clientTickTimes[clientTickTimeIdx]; // L: 324
		clientTickTimes[clientTickTimeIdx] = var1; // L: 325
		clientTickTimeIdx = clientTickTimeIdx + 1 & 31; // L: 326
		if (var3 != 0L && var1 > var3) { // L: 327
		}

		synchronized(this) { // L: 328
			class124.hasFocus = volatileFocus; // L: 329
		} // L: 330

		this.doCycle(); // L: 331
	} // L: 332

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "585935525"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 335
		long var2 = Archive.currentTimeMillis(); // L: 336
		long var4 = graphicsTickTimes[class286.graphicsTickTimeIdx]; // L: 337
		graphicsTickTimes[class286.graphicsTickTimeIdx] = var2; // L: 338
		class286.graphicsTickTimeIdx = class286.graphicsTickTimeIdx + 1 & 31; // L: 339
		if (0L != var4 && var2 > var4) { // L: 340
			int var6 = (int)(var2 - var4); // L: 341
			fps = ((var6 >> 1) + 32000) / var6; // L: 342
		}

		if (++field339 - 1 > 50) { // L: 344
			field339 -= 50; // L: 345
			this.fullRedraw = true; // L: 346
			this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight); // L: 347
			this.canvas.setVisible(true); // L: 348
			if (var1 == this.frame) { // L: 349
				Insets var7 = this.frame.getInsets(); // L: 350
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 351
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 353
			}
		}

		if (this.isCanvasInvalid) { // L: 355
			this.replaceCanvas();
		}

		this.method538(); // L: 356
		this.draw(this.fullRedraw); // L: 357
		if (this.fullRedraw) { // L: 358
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 359
	} // L: 360

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2139850312"
	)
	final void method538() {
		Bounds var1 = this.getFrameContentBounds(); // L: 363
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 364
			this.resizeCanvas(); // L: 365
			this.resizeCanvasNextFrame = false; // L: 366
		}

	} // L: 368

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	final void method542() {
		this.resizeCanvasNextFrame = true; // L: 371
	} // L: 372

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-643465371"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 375
			isKilled = true; // L: 376

			try {
				this.canvas.removeFocusListener(this); // L: 378
			} catch (Exception var5) { // L: 380
			}

			try {
				this.kill0(); // L: 382
			} catch (Exception var4) { // L: 384
			}

			if (this.frame != null) { // L: 385
				try {
					System.exit(0); // L: 387
				} catch (Throwable var3) { // L: 389
				}
			}

			if (taskHandler != null) { // L: 391
				try {
					taskHandler.close(); // L: 393
				} catch (Exception var2) { // L: 395
				}
			}

			this.vmethod1216(); // L: 397
		}
	} // L: 398

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254682788"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "302617031"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1176468254"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107475994"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-802613405"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 458
			if (class9.fontHelvetica13 == null) { // L: 459
				class9.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 460
				Interpreter.loginScreenFontMetrics = this.canvas.getFontMetrics(class9.fontHelvetica13); // L: 461
			}

			if (var3) { // L: 463
				var4.setColor(Color.black); // L: 464
				var4.fillRect(0, 0, canvasWidth, HealthBarDefinition.canvasHeight); // L: 465
			}

			Color var5 = new Color(140, 17, 17); // L: 467

			try {
				if (class340.field3934 == null) { // L: 469
					class340.field3934 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class340.field3934.getGraphics(); // L: 470
				var6.setColor(var5); // L: 471
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class9.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - Interpreter.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 479
				var4.drawImage(class340.field3934, canvasWidth / 2 - 152, HealthBarDefinition.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = canvasWidth / 2 - 152;
				int var8 = HealthBarDefinition.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33); // L: 486
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class9.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - Interpreter.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-856068332"
	)
	protected final void method548() {
		class340.field3934 = null;
		class9.fontHelvetica13 = null;
		Interpreter.loginScreenFontMetrics = null;
	} // L: 505

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1312350525"
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
	} // L: 515

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "2028320240"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lle;",
		garbageValue = "1474283096"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field332);
		int var3 = Math.max(var1.getHeight(), this.field333);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top; // L: 529
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-290533301"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701648283"
	)
	protected abstract void vmethod1216();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 422
			this.fullRedraw = true; // L: 423
			if (Archive.currentTimeMillis() - this.field342 > 1000L) { // L: 424
				Rectangle var2 = var1.getClipBounds(); // L: 425
				if (var2 == null || var2.width >= canvasWidth && var2.height >= HealthBarDefinition.canvasHeight) {
					this.isCanvasInvalid = true; // L: 426
				}
			}

		}
	} // L: 428

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 411
			stopTimeMs = Archive.currentTimeMillis(); // L: 412
			UrlRequest.sleepExact(5000L); // L: 413
			this.kill(); // L: 414
		}
	} // L: 415

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 406
			stopTimeMs = Archive.currentTimeMillis() + 4000L; // L: 407
		}
	} // L: 408

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 284
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 285
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 286
					String var2 = TaskHandler.javaVersion; // L: 287
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 288
						this.error("wrongjava"); // L: 289
						return; // L: 290
					}

					if (var2.startsWith("1.6.0_")) { // L: 292
						int var3;
						for (var3 = 6; var3 < var2.length() && GrandExchangeOfferWorldComparator.isDigit(var2.charAt(var3)); ++var3) { // L: 293 294
						}

						String var4 = var2.substring(6, var3); // L: 295
						if (GrandExchangeOfferAgeComparator.isNumber(var4) && FontName.method6162(var4) < 10) { // L: 296
							this.error("wrongjava"); // L: 297
							return; // L: 298
						}
					}

					fiveOrOne = 5; // L: 301
				}
			}

			this.setFocusCycleRoot(true); // L: 304
			this.addCanvas(); // L: 305
			this.setUp(); // L: 306
			WorldMapRectangle.clock = Clock.method2597(); // L: 307

			while (stopTimeMs == 0L || Archive.currentTimeMillis() < stopTimeMs) { // L: 308
				gameCyclesToDo = WorldMapRectangle.clock.wait(cycleDurationMillis, fiveOrOne); // L: 309

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 310
					this.clientTick();
				}

				this.graphicsTick(); // L: 311
				this.post(this.canvas); // L: 312
			}
		} catch (Exception var6) { // L: 315
			class27.RunException_sendStackTrace((String)null, var6); // L: 316
			this.error("crash"); // L: 317
		}

		this.kill(); // L: 319
	} // L: 320

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 401
			stopTimeMs = 0L; // L: 402
		}
	} // L: 403

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 431
		this.fullRedraw = true; // L: 432
	} // L: 433

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 436
	} // L: 437

	public final void windowClosed(WindowEvent var1) {
	} // L: 440

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 443
	} // L: 444

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 446

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 447

	public final void windowIconified(WindowEvent var1) {
	} // L: 448

	public final void windowOpened(WindowEvent var1) {
	} // L: 449

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	} // L: 439

	public final void update(Graphics var1) {
		this.paint(var1); // L: 418
	} // L: 419

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1912933891"
	)
	public static int method674(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var1;
		} else if (var2 == 1) { // L: 24
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 25
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "18"
	)
	static int method588(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 472
			WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 473
			var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 474
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 475
			int var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 476
			if (var4 == 0) { // L: 477
				throw new RuntimeException(); // L: 478
			} else {
				Widget var6 = DevicePcmPlayerProvider.getWidget(var9); // L: 480
				if (var6.children == null) { // L: 481
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 482
					Widget[] var7 = new Widget[var11 + 1]; // L: 483

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 484
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 485
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 487
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 488
					var12.type = var4; // L: 489
					var12.parentId = var12.id = var6.id; // L: 490
					var12.childIndex = var11; // L: 491
					var12.isIf3 = true; // L: 492
					var6.children[var11] = var12; // L: 493
					if (var2) { // L: 494
						class308.scriptDotWidget = var12;
					} else {
						class24.scriptActiveWidget = var12; // L: 495
					}

					VerticalAlignment.invalidateWidget(var6); // L: 496
					return 1; // L: 497
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 499
				var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 500
				Widget var10 = DevicePcmPlayerProvider.getWidget(var3.id); // L: 501
				var10.children[var3.childIndex] = null; // L: 502
				VerticalAlignment.invalidateWidget(var10); // L: 503
				return 1; // L: 504
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 506
				var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 507
				var3.children = null; // L: 508
				VerticalAlignment.invalidateWidget(var3); // L: 509
				return 1; // L: 510
			} else if (var0 == 103) { // L: 512
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 513
				return 1; // L: 514
			} else if (var0 == 104) { // L: 516
				--WorldMapCacheName.Interpreter_intStackSize; // L: 517
				return 1; // L: 518
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 520
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 533
					var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 534
					if (var3 != null) { // L: 535
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 536
						if (var2) { // L: 537
							class308.scriptDotWidget = var3;
						} else {
							class24.scriptActiveWidget = var3; // L: 538
						}
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 540
					}

					return 1; // L: 541
				} else if (var0 == 202) { // L: 543
					Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] = 0; // L: 544
					return 1; // L: 545
				} else if (var0 == 203) { // L: 547
					Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize + 1] = 0; // L: 548
					return 1; // L: 549
				} else {
					return 2; // L: 551
				}
			} else {
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 521
				var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 522
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 523
				Widget var5 = PacketWriter.getWidgetChild(var9, var4); // L: 524
				if (var5 != null && var4 != -1) { // L: 525
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 526
					if (var2) { // L: 527
						class308.scriptDotWidget = var5;
					} else {
						class24.scriptActiveWidget = var5; // L: 528
					}
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 530
				}

				return 1; // L: 531
			}
		}
	}
}
