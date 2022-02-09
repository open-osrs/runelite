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
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1515430643
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 2883359987560251415L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("r")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1948312411
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -431506545
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1466996331
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("p")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("m")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1537720839
	)
	static int field207;
	@ObfuscatedName("ae")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6798992322235179601L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -3548974340453788987L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("o")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 188130207
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 451056663
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2069778095
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1586010829
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -304380493
	)
	int field200;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 675819607
	)
	int field201;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1873513073
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1557812349
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("al")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("aa")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ao")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ab")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -8254453946735745309L
	)
	volatile long field210;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("au")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("at")
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
		field207 = 500; // L: 73
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
		this.field210 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class339.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "48"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method493();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)V",
		garbageValue = "24103"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				Language.method5813(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lei;",
		garbageValue = "-1948471075"
	)
	@Export("mouseWheel")
	protected class154 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-111030268"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	} // L: 123

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-38"
	)
	protected void method448(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	} // L: 127

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1740711259"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		UserComparator9.method2495();
		TileItem.method2299(this.canvas);
	} // L: 132

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "248"
	)
	protected final void method438() {
		class142.method2945(this.canvas);
	} // L: 136

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-558035967"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 139
		if (var1 != null) { // L: 140
			Bounds var2 = this.getFrameContentBounds(); // L: 141
			this.contentWidth = Math.max(var2.highX, this.field200); // L: 142
			this.contentHeight = Math.max(var2.highY, this.field201); // L: 143
			if (this.contentWidth <= 0) { // L: 144
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 145
				this.contentHeight = 1;
			}

			DirectByteArrayCopier.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 146
			NPC.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 147
			this.canvasX = (this.contentWidth - DirectByteArrayCopier.canvasWidth) / 2; // L: 148
			this.canvasY = 0; // L: 149
			this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight); // L: 150
			PcmPlayer.rasterProvider = new RasterProvider(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, this.canvas); // L: 151
			if (var1 == this.frame) { // L: 152
				Insets var3 = this.frame.getInsets(); // L: 153
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 154
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 156
			}

			this.fullRedraw = true; // L: 157
			this.resizeGame(); // L: 158
		}
	} // L: 159

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486103800"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098118072"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 164
		int var2 = this.canvasY; // L: 165
		int var3 = this.contentWidth - DirectByteArrayCopier.canvasWidth - var1; // L: 166
		int var4 = this.contentHeight - NPC.canvasHeight - var2; // L: 167
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 168
			try {
				Container var5 = this.container(); // L: 170
				int var6 = 0; // L: 171
				int var7 = 0; // L: 172
				if (var5 == this.frame) { // L: 173
					Insets var8 = this.frame.getInsets(); // L: 174
					var6 = var8.left; // L: 175
					var7 = var8.top; // L: 176
				}

				Graphics var10 = var5.getGraphics(); // L: 178
				var10.setColor(Color.black); // L: 179
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 180
				}

				if (var2 > 0) { // L: 181
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 182
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 183
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 185
			}
		}

	} // L: 187

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 190
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 192
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 193
		KeyHandler.field148 = -1; // L: 194
		java.awt.Canvas var2 = this.canvas; // L: 196
		var2.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 198
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 199
		var2.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 200
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 201
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas); // L: 203
		}

		this.addCanvas(); // L: 204
		TileItem.method2299(this.canvas); // L: 205
		class142.method2945(this.canvas); // L: 206
		if (this.mouseWheelHandler != null) { // L: 207
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method493(); // L: 208
	} // L: 209

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1173040223"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 213
				++GameEngine_redundantStartThreadCount; // L: 214
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 215
					this.error("alreadyloaded"); // L: 216
					return; // L: 217
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 219
				return; // L: 220
			}

			gameEngine = this; // L: 222
			DirectByteArrayCopier.canvasWidth = var1; // L: 223
			NPC.canvasHeight = var2; // L: 224
			class1.RunException_revision = var3; // L: 225
			RunException.RunException_applet = this; // L: 226
			if (taskHandler == null) { // L: 227
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 228
		} catch (Exception var5) { // L: 230
			FloorDecoration.RunException_sendStackTrace((String)null, var5); // L: 231
			this.error("crash"); // L: 232
		}

	} // L: 234

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 237
		if (this.canvas != null) { // L: 238
			this.canvas.removeFocusListener(this); // L: 239
			var1.remove(this.canvas); // L: 240
		}

		DirectByteArrayCopier.canvasWidth = Math.max(var1.getWidth(), this.field200); // L: 242
		NPC.canvasHeight = Math.max(var1.getHeight(), this.field201); // L: 243
		Insets var2;
		if (this.frame != null) { // L: 244
			var2 = this.frame.getInsets(); // L: 245
			DirectByteArrayCopier.canvasWidth -= var2.left + var2.right; // L: 246
			NPC.canvasHeight -= var2.top + var2.bottom; // L: 247
		}

		this.canvas = new Canvas(this); // L: 249
		var1.setBackground(Color.BLACK); // L: 250
		var1.setLayout((LayoutManager)null); // L: 251
		var1.add(this.canvas); // L: 252
		this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight); // L: 253
		this.canvas.setVisible(true); // L: 254
		this.canvas.setBackground(Color.BLACK); // L: 255
		if (var1 == this.frame) { // L: 256
			var2 = this.frame.getInsets(); // L: 257
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 258
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 260
		}

		this.canvas.addFocusListener(this); // L: 261
		this.canvas.requestFocus(); // L: 262
		this.fullRedraw = true; // L: 263
		if (PcmPlayer.rasterProvider != null && DirectByteArrayCopier.canvasWidth == PcmPlayer.rasterProvider.width && NPC.canvasHeight == PcmPlayer.rasterProvider.height) { // L: 264
			((RasterProvider)PcmPlayer.rasterProvider).setComponent(this.canvas); // L: 265
			PcmPlayer.rasterProvider.drawFull(0, 0); // L: 266
		} else {
			PcmPlayer.rasterProvider = new RasterProvider(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, this.canvas); // L: 269
		}

		this.isCanvasInvalid = false; // L: 271
		this.field210 = DirectByteArrayCopier.method5318(); // L: 272
	} // L: 273

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-128254341"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 276
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 277
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 278
				if (var1.endsWith("127.0.0.1")) { // L: 279
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 280
					}

					if (var1.endsWith("192.168.1.")) { // L: 281
						return true;
					} else {
						this.error("invalidhost"); // L: 282
						return false; // L: 283
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "907049786"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = DirectByteArrayCopier.method5318(); // L: 336
		long var3 = clientTickTimes[SpriteMask.field3215]; // L: 337
		clientTickTimes[SpriteMask.field3215] = var1; // L: 338
		SpriteMask.field3215 = SpriteMask.field3215 + 1 & 31; // L: 339
		if (0L != var3 && var1 > var3) { // L: 340
		}

		synchronized(this) { // L: 341
			class297.hasFocus = volatileFocus; // L: 342
		} // L: 343

		this.doCycle(); // L: 344
	} // L: 345

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-547730889"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 348
		long var2 = DirectByteArrayCopier.method5318(); // L: 349
		long var4 = graphicsTickTimes[class12.field74]; // L: 350
		graphicsTickTimes[class12.field74] = var2; // L: 351
		class12.field74 = class12.field74 + 1 & 31; // L: 352
		if (0L != var4 && var2 > var4) { // L: 353
			int var6 = (int)(var2 - var4); // L: 354
			fps = ((var6 >> 1) + 32000) / var6; // L: 355
		}

		if (++field207 - 1 > 50) { // L: 357
			field207 -= 50; // L: 358
			this.fullRedraw = true; // L: 359
			this.canvas.setSize(DirectByteArrayCopier.canvasWidth, NPC.canvasHeight); // L: 360
			this.canvas.setVisible(true); // L: 361
			if (var1 == this.frame) { // L: 362
				Insets var7 = this.frame.getInsets(); // L: 363
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY); // L: 364
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 366
			}
		}

		if (this.isCanvasInvalid) { // L: 368
			this.replaceCanvas();
		}

		this.method481(); // L: 369
		this.draw(this.fullRedraw); // L: 370
		if (this.fullRedraw) { // L: 371
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 372
	} // L: 373

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-113498730"
	)
	final void method481() {
		Bounds var1 = this.getFrameContentBounds(); // L: 376
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 377
			this.resizeCanvas(); // L: 378
			this.resizeCanvasNextFrame = false; // L: 379
		}

	} // L: 381

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	final void method493() {
		this.resizeCanvasNextFrame = true; // L: 384
	} // L: 385

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 388
			isKilled = true; // L: 389

			try {
				this.canvas.removeFocusListener(this); // L: 391
			} catch (Exception var5) { // L: 393
			}

			try {
				this.kill0(); // L: 395
			} catch (Exception var4) { // L: 397
			}

			if (this.frame != null) { // L: 398
				try {
					System.exit(0); // L: 400
				} catch (Throwable var3) { // L: 402
				}
			}

			if (taskHandler != null) { // L: 404
				try {
					taskHandler.close(); // L: 406
				} catch (Exception var2) { // L: 408
				}
			}

			this.vmethod1124(); // L: 410
		}
	} // L: 411

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1919454515"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "512730998"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1874168283"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-104"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZS)V",
		garbageValue = "12184"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 497
			if (Frames.fontHelvetica13 == null) { // L: 498
				Frames.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 499
				class263.loginScreenFontMetrics = this.canvas.getFontMetrics(Frames.fontHelvetica13); // L: 500
			}

			if (var3) { // L: 502
				var4.setColor(Color.black); // L: 503
				var4.fillRect(0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight); // L: 504
			}

			Color var5 = new Color(140, 17, 17); // L: 506

			try {
				if (Clock.field1740 == null) { // L: 508
					Clock.field1740 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = Clock.field1740.getGraphics(); // L: 509
				var6.setColor(var5); // L: 510
				var6.drawRect(0, 0, 303, 33); // L: 511
				var6.fillRect(2, 2, var1 * 3, 30); // L: 512
				var6.setColor(Color.black); // L: 513
				var6.drawRect(1, 1, 301, 31); // L: 514
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 515
				var6.setFont(Frames.fontHelvetica13); // L: 516
				var6.setColor(Color.white); // L: 517
				var6.drawString(var2, (304 - class263.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 518
				var4.drawImage(Clock.field1740, DirectByteArrayCopier.canvasWidth / 2 - 152, NPC.canvasHeight / 2 - 18, (ImageObserver)null); // L: 519
			} catch (Exception var9) { // L: 521
				int var7 = DirectByteArrayCopier.canvasWidth / 2 - 152; // L: 522
				int var8 = NPC.canvasHeight / 2 - 18; // L: 523
				var4.setColor(var5); // L: 524
				var4.drawRect(var7, var8, 303, 33); // L: 525
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 526
				var4.setColor(Color.black); // L: 527
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 528
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 529
				var4.setFont(Frames.fontHelvetica13); // L: 530
				var4.setColor(Color.white); // L: 531
				var4.drawString(var2, var7 + (304 - class263.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 532
			}
		} catch (Exception var10) { // L: 535
			this.canvas.repaint(); // L: 536
		}

	} // L: 538

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1327696255"
	)
	protected final void method449() {
		Clock.field1740 = null; // L: 541
		Frames.fontHelvetica13 = null; // L: 542
		class263.loginScreenFontMetrics = null; // L: 543
	} // L: 544

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 547
			this.hasErrored = true; // L: 548
			System.out.println("error_game_" + var1); // L: 549

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 551
			} catch (Exception var3) { // L: 553
			}

		}
	} // L: 554

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-2055722899"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 557
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "-498401581"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 562
		int var2 = Math.max(var1.getWidth(), this.field200); // L: 563
		int var3 = Math.max(var1.getHeight(), this.field201); // L: 564
		if (this.frame != null) { // L: 565
			Insets var4 = this.frame.getInsets(); // L: 566
			var2 -= var4.right + var4.left; // L: 567
			var3 -= var4.top + var4.bottom; // L: 568
		}

		return new Bounds(var2, var3); // L: 570
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2040982283"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 574
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773309183"
	)
	protected abstract void vmethod1124();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 434
			stopTimeMs = DirectByteArrayCopier.method5318(); // L: 435
			Language.method5813(5000L); // L: 436
			this.kill(); // L: 437
		}
	} // L: 438

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 447
			this.fullRedraw = true; // L: 448
			if (DirectByteArrayCopier.method5318() - this.field210 > 1000L) { // L: 449
				Rectangle var2 = var1.getClipBounds(); // L: 450
				if (var2 == null || var2.width >= DirectByteArrayCopier.canvasWidth && var2.height >= NPC.canvasHeight) {
					this.isCanvasInvalid = true; // L: 451
				}
			}

		}
	} // L: 453

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 288
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 289
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 290
					String var2 = class134.javaVersion; // L: 291
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 292
						this.error("wrongjava"); // L: 293
						return; // L: 294
					}

					if (var2.startsWith("1.6.0_")) { // L: 296
						int var3;
						for (var3 = 6; var3 < var2.length() && class118.isDigit(var2.charAt(var3)); ++var3) { // L: 297 298
						}

						String var4 = var2.substring(6, var3); // L: 299
						if (class117.isNumber(var4) && UserComparator7.method2464(var4) < 10) { // L: 300
							this.error("wrongjava"); // L: 301
							return; // L: 302
						}
					}

					fiveOrOne = 5; // L: 305
				}
			}

			this.setFocusCycleRoot(true); // L: 308
			this.addCanvas(); // L: 309
			this.setUp(); // L: 310

			Object var8;
			try {
				var8 = new NanoClock(); // L: 314
			} catch (Throwable var6) { // L: 316
				var8 = new MilliClock(); // L: 317
			}

			clock = (Clock)var8; // L: 320

			while (stopTimeMs == 0L || DirectByteArrayCopier.method5318() < stopTimeMs) { // L: 321
				class147.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne); // L: 322

				for (int var5 = 0; var5 < class147.gameCyclesToDo; ++var5) { // L: 323
					this.clientTick();
				}

				this.graphicsTick(); // L: 324
				this.post(this.canvas); // L: 325
			}
		} catch (Exception var7) { // L: 328
			FloorDecoration.RunException_sendStackTrace((String)null, var7); // L: 329
			this.error("crash"); // L: 330
		}

		this.kill(); // L: 332
	} // L: 333

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 422
			stopTimeMs = 0L; // L: 423
		}
	} // L: 424

	public final void update(Graphics var1) {
		this.paint(var1); // L: 442
	} // L: 443

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 457
		this.fullRedraw = true; // L: 458
	} // L: 459

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 463
	} // L: 464

	public final void windowActivated(WindowEvent var1) {
	} // L: 467

	public final void windowClosed(WindowEvent var1) {
	} // L: 470

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 478

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 481

	public final void windowIconified(WindowEvent var1) {
	} // L: 484

	public final void windowOpened(WindowEvent var1) {
	} // L: 487

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 428
			stopTimeMs = DirectByteArrayCopier.method5318() + 4000L; // L: 429
		}
	} // L: 430

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 474
	} // L: 475

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-38753022"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 122

		try {
			var0 = VarbitComposition.getPreferencesFile("", HorizontalAlignment.field1846.name, true); // L: 124
			Buffer var1 = class424.clientPreferences.toBuffer(); // L: 125
			var0.write(var1.array, 0, var1.offset); // L: 126
		} catch (Exception var3) { // L: 128
		}

		try {
			if (var0 != null) { // L: 130
				var0.closeSync(true); // L: 131
			}
		} catch (Exception var2) { // L: 134
		}

	} // L: 135

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1621596598"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ModeWhere.getWidgetChild(var1, var2); // L: 9205
		if (var5 != null) { // L: 9206
			if (var5.onOp != null) { // L: 9207
				ScriptEvent var6 = new ScriptEvent(); // L: 9208
				var6.widget = var5; // L: 9209
				var6.opIndex = var0; // L: 9210
				var6.targetName = var4; // L: 9211
				var6.args = var5.onOp; // L: 9212
				class92.runScriptEvent(var6); // L: 9213
			}

			boolean var8 = true; // L: 9215
			if (var5.contentType > 0) { // L: 9216
				var8 = LoginScreenAnimation.method2218(var5);
			}

			if (var8) { // L: 9217
				if (ClientPacket.method4979(Language.getWidgetFlags(var5), var0 - 1)) { // L: 9218
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9221
						var7 = class135.getPacketBufferNode(ClientPacket.field2857, Client.packetWriter.isaacCipher); // L: 9223
						var7.packetBuffer.writeInt(var1); // L: 9224
						var7.packetBuffer.writeShort(var2); // L: 9225
						var7.packetBuffer.writeShort(var3); // L: 9226
						Client.packetWriter.addNode(var7); // L: 9227
					}

					if (var0 == 2) { // L: 9229
						var7 = class135.getPacketBufferNode(ClientPacket.field2887, Client.packetWriter.isaacCipher); // L: 9231
						var7.packetBuffer.writeInt(var1); // L: 9232
						var7.packetBuffer.writeShort(var2); // L: 9233
						var7.packetBuffer.writeShort(var3); // L: 9234
						Client.packetWriter.addNode(var7); // L: 9235
					}

					if (var0 == 3) { // L: 9237
						var7 = class135.getPacketBufferNode(ClientPacket.field2895, Client.packetWriter.isaacCipher); // L: 9239
						var7.packetBuffer.writeInt(var1); // L: 9240
						var7.packetBuffer.writeShort(var2); // L: 9241
						var7.packetBuffer.writeShort(var3); // L: 9242
						Client.packetWriter.addNode(var7); // L: 9243
					}

					if (var0 == 4) { // L: 9245
						var7 = class135.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher); // L: 9247
						var7.packetBuffer.writeInt(var1); // L: 9248
						var7.packetBuffer.writeShort(var2); // L: 9249
						var7.packetBuffer.writeShort(var3); // L: 9250
						Client.packetWriter.addNode(var7); // L: 9251
					}

					if (var0 == 5) { // L: 9253
						var7 = class135.getPacketBufferNode(ClientPacket.field2874, Client.packetWriter.isaacCipher); // L: 9255
						var7.packetBuffer.writeInt(var1); // L: 9256
						var7.packetBuffer.writeShort(var2); // L: 9257
						var7.packetBuffer.writeShort(var3); // L: 9258
						Client.packetWriter.addNode(var7); // L: 9259
					}

					if (var0 == 6) { // L: 9261
						var7 = class135.getPacketBufferNode(ClientPacket.field2899, Client.packetWriter.isaacCipher); // L: 9263
						var7.packetBuffer.writeInt(var1); // L: 9264
						var7.packetBuffer.writeShort(var2); // L: 9265
						var7.packetBuffer.writeShort(var3); // L: 9266
						Client.packetWriter.addNode(var7); // L: 9267
					}

					if (var0 == 7) { // L: 9269
						var7 = class135.getPacketBufferNode(ClientPacket.field2871, Client.packetWriter.isaacCipher); // L: 9271
						var7.packetBuffer.writeInt(var1); // L: 9272
						var7.packetBuffer.writeShort(var2); // L: 9273
						var7.packetBuffer.writeShort(var3); // L: 9274
						Client.packetWriter.addNode(var7); // L: 9275
					}

					if (var0 == 8) { // L: 9277
						var7 = class135.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher); // L: 9279
						var7.packetBuffer.writeInt(var1); // L: 9280
						var7.packetBuffer.writeShort(var2); // L: 9281
						var7.packetBuffer.writeShort(var3); // L: 9282
						Client.packetWriter.addNode(var7); // L: 9283
					}

					if (var0 == 9) { // L: 9285
						var7 = class135.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher); // L: 9287
						var7.packetBuffer.writeInt(var1); // L: 9288
						var7.packetBuffer.writeShort(var2); // L: 9289
						var7.packetBuffer.writeShort(var3); // L: 9290
						Client.packetWriter.addNode(var7); // L: 9291
					}

					if (var0 == 10) { // L: 9293
						var7 = class135.getPacketBufferNode(ClientPacket.field2886, Client.packetWriter.isaacCipher); // L: 9295
						var7.packetBuffer.writeInt(var1); // L: 9296
						var7.packetBuffer.writeShort(var2); // L: 9297
						var7.packetBuffer.writeShort(var3); // L: 9298
						Client.packetWriter.addNode(var7); // L: 9299
					}

				}
			}
		}
	} // L: 9219 9301
}
