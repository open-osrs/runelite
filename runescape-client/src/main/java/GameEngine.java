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

@ObfuscatedName("ap")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 230880625
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 4471126598307559601L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 122633451
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 600236541
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 632095801
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("h")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1680088159
	)
	static int field209;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 962598391
	)
	static int field199;
	@ObfuscatedName("ai")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2698055439581478877L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 2171634668724389491L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1031196877
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1354234301
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 266716801
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -159679161
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1936598847
	)
	int field210;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1703466295
	)
	int field193;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -206719703
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1670280347
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ap")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ac")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ae")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("an")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("af")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -9120615609352465965L
	)
	volatile long field185;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aq")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ah")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20;
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field199 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field185 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		class132.method2885(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method477();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1780495724"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				DynamicObject.method1991(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lfh;",
		garbageValue = "-1640531527"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	protected void method385(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class432.method7572(); // L: 127
		ClientPreferences.method2344(this.canvas); // L: 128
	} // L: 129

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	protected final void method387() {
		java.awt.Canvas var1 = this.canvas; // L: 132
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 134
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 135
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 136
	} // L: 138

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294986808"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 141
		if (var1 != null) { // L: 142
			Bounds var2 = this.getFrameContentBounds(); // L: 143
			this.contentWidth = Math.max(var2.highX, this.field210); // L: 144
			this.contentHeight = Math.max(var2.highY, this.field193); // L: 145
			if (this.contentWidth <= 0) { // L: 146
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 147
				this.contentHeight = 1;
			}

			Script.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 148
			class78.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 149
			this.canvasX = (this.contentWidth - Script.canvasWidth) / 2; // L: 150
			this.canvasY = 0; // L: 151
			this.canvas.setSize(Script.canvasWidth, class78.canvasHeight); // L: 152
			Message.rasterProvider = new RasterProvider(Script.canvasWidth, class78.canvasHeight, this.canvas); // L: 153
			if (var1 == this.frame) { // L: 154
				Insets var3 = this.frame.getInsets(); // L: 155
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 156
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 158
			}

			this.fullRedraw = true; // L: 159
			this.resizeGame(); // L: 160
		}
	} // L: 161

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1807518530"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1100660124"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 166
		int var2 = this.canvasY; // L: 167
		int var3 = this.contentWidth - Script.canvasWidth - var1; // L: 168
		int var4 = this.contentHeight - class78.canvasHeight - var2; // L: 169
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		ObjectComposition.method3709(this.canvas); // L: 192
		java.awt.Canvas var1 = this.canvas; // L: 193
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 195
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 196
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 197
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 198
		if (this.mouseWheelHandler != null) { // L: 200
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 201
		ClientPreferences.method2344(this.canvas); // L: 202
		java.awt.Canvas var2 = this.canvas; // L: 203
		var2.addMouseListener(MouseHandler.MouseHandler_instance); // L: 205
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 206
		var2.addFocusListener(MouseHandler.MouseHandler_instance); // L: 207
		if (this.mouseWheelHandler != null) { // L: 209
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method477(); // L: 210
	} // L: 211

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1937564144"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 215
				++GameEngine_redundantStartThreadCount; // L: 216
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 217
					this.error("alreadyloaded"); // L: 218
					return; // L: 219
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 221
				return; // L: 222
			}

			gameEngine = this; // L: 224
			Script.canvasWidth = var1; // L: 225
			class78.canvasHeight = var2; // L: 226
			RunException.RunException_revision = var3; // L: 227
			RunException.field4839 = var4; // L: 228
			RunException.RunException_applet = this; // L: 229
			if (taskHandler == null) { // L: 230
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 231
		} catch (Exception var6) { // L: 233
			class249.RunException_sendStackTrace((String)null, var6); // L: 234
			this.error("crash"); // L: 235
		}

	} // L: 237

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1260783779"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 240
		if (this.canvas != null) { // L: 241
			this.canvas.removeFocusListener(this); // L: 242
			var1.remove(this.canvas); // L: 243
		}

		Script.canvasWidth = Math.max(var1.getWidth(), this.field210); // L: 245
		class78.canvasHeight = Math.max(var1.getHeight(), this.field193); // L: 246
		Insets var2;
		if (this.frame != null) { // L: 247
			var2 = this.frame.getInsets(); // L: 248
			Script.canvasWidth -= var2.left + var2.right; // L: 249
			class78.canvasHeight -= var2.bottom + var2.top; // L: 250
		}

		this.canvas = new Canvas(this); // L: 252
		var1.setBackground(Color.BLACK); // L: 253
		var1.setLayout((LayoutManager)null); // L: 254
		var1.add(this.canvas); // L: 255
		this.canvas.setSize(Script.canvasWidth, class78.canvasHeight); // L: 256
		this.canvas.setVisible(true); // L: 257
		this.canvas.setBackground(Color.BLACK); // L: 258
		if (var1 == this.frame) { // L: 259
			var2 = this.frame.getInsets(); // L: 260
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 261
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 263
		}

		this.canvas.addFocusListener(this); // L: 264
		this.canvas.requestFocus(); // L: 265
		this.fullRedraw = true; // L: 266
		if (Message.rasterProvider != null && Script.canvasWidth == Message.rasterProvider.width && class78.canvasHeight == Message.rasterProvider.height) { // L: 267
			((RasterProvider)Message.rasterProvider).setComponent(this.canvas); // L: 268
			Message.rasterProvider.drawFull(0, 0); // L: 269
		} else {
			Message.rasterProvider = new RasterProvider(Script.canvasWidth, class78.canvasHeight, this.canvas); // L: 272
		}

		this.isCanvasInvalid = false; // L: 274
		this.field185 = class115.method2692(); // L: 275
	} // L: 276

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-309516342"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 279
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 280
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 281
				if (var1.endsWith("127.0.0.1")) { // L: 282
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 283
					}

					if (var1.endsWith("192.168.1.")) { // L: 284
						return true;
					} else {
						this.error("invalidhost"); // L: 285
						return false; // L: 286
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1424742256"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class115.method2692(); // L: 330
		long var3 = clientTickTimes[field209]; // L: 331
		clientTickTimes[field209] = var1; // L: 332
		field209 = field209 + 1 & 31; // L: 333
		if (var3 != 0L && var1 > var3) { // L: 334
		}

		synchronized(this) { // L: 335
			ModelData0.hasFocus = volatileFocus; // L: 336
		} // L: 337

		this.doCycle(); // L: 338
	} // L: 339

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-97569955"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 342
		long var2 = class115.method2692(); // L: 343
		long var4 = graphicsTickTimes[UserList.field4319]; // L: 344
		graphicsTickTimes[UserList.field4319] = var2; // L: 345
		UserList.field4319 = UserList.field4319 + 1 & 31; // L: 346
		if (var4 != 0L && var2 > var4) { // L: 347
			int var6 = (int)(var2 - var4); // L: 348
			fps = ((var6 >> 1) + 32000) / var6; // L: 349
		}

		if (++field199 - 1 > 50) { // L: 351
			field199 -= 50; // L: 352
			this.fullRedraw = true; // L: 353
			this.canvas.setSize(Script.canvasWidth, class78.canvasHeight); // L: 354
			this.canvas.setVisible(true); // L: 355
			if (var1 == this.frame) { // L: 356
				Insets var7 = this.frame.getInsets(); // L: 357
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 358
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 360
			}
		}

		if (this.isCanvasInvalid) { // L: 362
			this.replaceCanvas();
		}

		this.method397(); // L: 363
		this.draw(this.fullRedraw); // L: 364
		if (this.fullRedraw) { // L: 365
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 366
	} // L: 367

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863381045"
	)
	final void method397() {
		Bounds var1 = this.getFrameContentBounds(); // L: 370
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 371
			this.resizeCanvas(); // L: 372
			this.resizeCanvasNextFrame = false; // L: 373
		}

	} // L: 375

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1552775883"
	)
	final void method477() {
		this.resizeCanvasNextFrame = true; // L: 378
	} // L: 379

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1520335833"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 382
			isKilled = true; // L: 383

			try {
				this.canvas.removeFocusListener(this); // L: 385
			} catch (Exception var5) { // L: 387
			}

			try {
				this.kill0(); // L: 389
			} catch (Exception var4) { // L: 391
			}

			if (this.frame != null) { // L: 392
				try {
					System.exit(0); // L: 394
				} catch (Throwable var3) { // L: 396
				}
			}

			if (taskHandler != null) { // L: 398
				try {
					taskHandler.close(); // L: 400
				} catch (Exception var2) { // L: 402
				}
			}

			this.vmethod1099(); // L: 404
		}
	} // L: 405

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1208160772"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160439504"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2097579655"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "853101705"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "89"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 491
			if (class192.fontHelvetica13 == null) { // L: 492
				class192.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 493
				class11.loginScreenFontMetrics = this.canvas.getFontMetrics(class192.fontHelvetica13); // L: 494
			}

			if (var3) { // L: 496
				var4.setColor(Color.black); // L: 497
				var4.fillRect(0, 0, Script.canvasWidth, class78.canvasHeight); // L: 498
			}

			Color var5 = new Color(140, 17, 17); // L: 500

			try {
				if (class162.field1781 == null) { // L: 502
					class162.field1781 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class162.field1781.getGraphics(); // L: 503
				var6.setColor(var5); // L: 504
				var6.drawRect(0, 0, 303, 33); // L: 505
				var6.fillRect(2, 2, var1 * 3, 30); // L: 506
				var6.setColor(Color.black); // L: 507
				var6.drawRect(1, 1, 301, 31); // L: 508
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 509
				var6.setFont(class192.fontHelvetica13); // L: 510
				var6.setColor(Color.white); // L: 511
				var6.drawString(var2, (304 - class11.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 512
				var4.drawImage(class162.field1781, Script.canvasWidth / 2 - 152, class78.canvasHeight / 2 - 18, (ImageObserver)null); // L: 513
			} catch (Exception var9) { // L: 515
				int var7 = Script.canvasWidth / 2 - 152; // L: 516
				int var8 = class78.canvasHeight / 2 - 18; // L: 517
				var4.setColor(var5); // L: 518
				var4.drawRect(var7, var8, 303, 33); // L: 519
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 520
				var4.setColor(Color.black); // L: 521
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 522
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 523
				var4.setFont(class192.fontHelvetica13); // L: 524
				var4.setColor(Color.white); // L: 525
				var4.drawString(var2, var7 + (304 - class11.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 526
			}
		} catch (Exception var10) { // L: 529
			this.canvas.repaint(); // L: 530
		}

	} // L: 532

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-195360691"
	)
	protected final void method410() {
		class162.field1781 = null; // L: 535
		class192.fontHelvetica13 = null; // L: 536
		class11.loginScreenFontMetrics = null; // L: 537
	} // L: 538

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1654563788"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 541
			this.hasErrored = true; // L: 542
			System.out.println("error_game_" + var1); // L: 543

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 545
			} catch (Exception var3) { // L: 547
			}

		}
	} // L: 548

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "35"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 551
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lns;",
		garbageValue = "1"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 556
		int var2 = Math.max(var1.getWidth(), this.field210); // L: 557
		int var3 = Math.max(var1.getHeight(), this.field193); // L: 558
		if (this.frame != null) { // L: 559
			Insets var4 = this.frame.getInsets(); // L: 560
			var2 -= var4.left + var4.right; // L: 561
			var3 -= var4.top + var4.bottom; // L: 562
		}

		return new Bounds(var2, var3); // L: 564
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 568
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	protected abstract void vmethod1099();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 428
			stopTimeMs = class115.method2692(); // L: 429
			DynamicObject.method1991(5000L); // L: 430
			this.kill(); // L: 431
		}
	} // L: 432

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 441
			this.fullRedraw = true; // L: 442
			if (class115.method2692() - this.field185 > 1000L) { // L: 443
				Rectangle var2 = var1.getClipBounds(); // L: 444
				if (var2 == null || var2.width >= Script.canvasWidth && var2.height >= class78.canvasHeight) {
					this.isCanvasInvalid = true; // L: 445
				}
			}

		}
	} // L: 447

	public void run() {
		try {
			if (class360.javaVendor != null) { // L: 291
				String var1 = class360.javaVendor.toLowerCase(); // L: 292
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 293
					String var2 = TaskHandler.javaVersion; // L: 294
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 295
						this.error("wrongjava"); // L: 296
						return; // L: 297
					}

					if (var2.startsWith("1.6.0_")) { // L: 299
						int var3;
						for (var3 = 6; var3 < var2.length() && class83.isDigit(var2.charAt(var3)); ++var3) { // L: 300 301
						}

						String var4 = var2.substring(6, var3); // L: 302
						if (class114.isNumber(var4) && FaceNormal.method4344(var4) < 10) { // L: 303
							this.error("wrongjava"); // L: 304
							return; // L: 305
						}
					}

					fiveOrOne = 5; // L: 308
				}
			}

			this.setFocusCycleRoot(true); // L: 311
			this.addCanvas(); // L: 312
			this.setUp(); // L: 313
			class10.clock = World.method1601(); // L: 314

			while (0L == stopTimeMs || class115.method2692() < stopTimeMs) { // L: 315
				Messages.gameCyclesToDo = class10.clock.wait(cycleDurationMillis, fiveOrOne); // L: 316

				for (int var5 = 0; var5 < Messages.gameCyclesToDo; ++var5) { // L: 317
					this.clientTick();
				}

				this.graphicsTick(); // L: 318
				this.post(this.canvas); // L: 319
			}
		} catch (Exception var6) { // L: 322
			class249.RunException_sendStackTrace((String)null, var6); // L: 323
			this.error("crash"); // L: 324
		}

		this.kill(); // L: 326
	} // L: 327

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 416
			stopTimeMs = 0L; // L: 417
		}
	} // L: 418

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 451
		this.fullRedraw = true; // L: 452
	} // L: 453

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 457
	} // L: 458

	public final void windowActivated(WindowEvent var1) {
	} // L: 461

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 472

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 475

	public final void windowOpened(WindowEvent var1) {
	} // L: 481

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 422
			stopTimeMs = class115.method2692() + 4000L; // L: 423
		}
	} // L: 424

	public final void windowIconified(WindowEvent var1) {
	} // L: 478

	public final void windowClosed(WindowEvent var1) {
	} // L: 464

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 468
	} // L: 469

	public final void update(Graphics var1) {
		this.paint(var1); // L: 436
	} // L: 437

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-2119363364"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}
}
