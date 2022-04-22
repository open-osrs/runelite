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

@ObfuscatedName("ao")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 399090461
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1669508535
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5981543505247076235L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("b")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 449978353
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1442597045
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1121679723
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("m")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1397179313
	)
	static int field206;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -4858752129692683603L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -1651553175101575951L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -543979185
	)
	public static int field218;
	@ObfuscatedName("n")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1855082601
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 995503961
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1680473879
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -63361611
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 741948317
	)
	int field205;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1573332371
	)
	int field200;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1344171121
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -337625473
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ao")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("aj")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("an")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ay")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 5910881770928839481L
	)
	volatile long field209;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("au")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("af")
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
		field206 = 500; // L: 73
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
		this.field209 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class384.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1436013377"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method466();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "82345296"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				class93.method2384(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lfo;",
		garbageValue = "-1578740301"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1872048935"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "109"
	)
	protected void method452(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1077399719"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		StudioGame.method5776(); // L: 130
		java.awt.Canvas var1 = this.canvas; // L: 131
		var1.setFocusTraversalKeysEnabled(false); // L: 133
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 135
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	protected final void method428() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 144
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "825452096"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 149
		if (var1 != null) { // L: 150
			Bounds var2 = this.getFrameContentBounds(); // L: 151
			this.contentWidth = Math.max(var2.highX, this.field205); // L: 152
			this.contentHeight = Math.max(var2.highY, this.field200); // L: 153
			if (this.contentWidth <= 0) { // L: 154
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 155
				this.contentHeight = 1;
			}

			InvDefinition.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 156
			class321.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 157
			this.canvasX = (this.contentWidth - InvDefinition.canvasWidth) / 2; // L: 158
			this.canvasY = 0; // L: 159
			this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight); // L: 160
			FontName.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, class321.canvasHeight, this.canvas); // L: 161
			if (var1 == this.frame) { // L: 162
				Insets var3 = this.frame.getInsets(); // L: 163
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 164
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1462606142"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-977788049"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 174
		int var2 = this.canvasY; // L: 175
		int var3 = this.contentWidth - InvDefinition.canvasWidth - var1; // L: 176
		int var4 = this.contentHeight - class321.canvasHeight - var2; // L: 177
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 178
			try {
				Container var5 = this.container(); // L: 180
				int var6 = 0; // L: 181
				int var7 = 0; // L: 182
				if (var5 == this.frame) { // L: 183
					Insets var8 = this.frame.getInsets(); // L: 184
					var6 = var8.left; // L: 185
					var7 = var8.top; // L: 186
				}

				Graphics var10 = var5.getGraphics(); // L: 188
				var10.setColor(Color.black); // L: 189
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 190
				}

				if (var2 > 0) { // L: 191
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 192
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 193
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 195
			}
		}

	} // L: 197

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		Renderable.method4928(this.canvas); // L: 200
		java.awt.Canvas var1 = this.canvas; // L: 201
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 203
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 204
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 205
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 206
		if (this.mouseWheelHandler != null) { // L: 208
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 209
		java.awt.Canvas var2 = this.canvas; // L: 210
		var2.setFocusTraversalKeysEnabled(false); // L: 212
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 213
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 214
		java.awt.Canvas var3 = this.canvas; // L: 216
		var3.addMouseListener(MouseHandler.MouseHandler_instance); // L: 218
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 219
		var3.addFocusListener(MouseHandler.MouseHandler_instance); // L: 220
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas); // L: 222
		}

		this.method466(); // L: 223
	} // L: 224

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-34"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 228
				++GameEngine_redundantStartThreadCount; // L: 229
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 230
					this.error("alreadyloaded"); // L: 231
					return; // L: 232
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 234
				return; // L: 235
			}

			gameEngine = this; // L: 237
			InvDefinition.canvasWidth = var1; // L: 238
			class321.canvasHeight = var2; // L: 239
			RunException.RunException_revision = var3; // L: 240
			RunException.RunException_applet = this; // L: 241
			if (taskHandler == null) { // L: 242
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 243
		} catch (Exception var5) { // L: 245
			Widget.RunException_sendStackTrace((String)null, var5); // L: 246
			this.error("crash"); // L: 247
		}

	} // L: 249

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2136462097"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 252
		if (this.canvas != null) { // L: 253
			this.canvas.removeFocusListener(this); // L: 254
			var1.remove(this.canvas); // L: 255
		}

		InvDefinition.canvasWidth = Math.max(var1.getWidth(), this.field205); // L: 257
		class321.canvasHeight = Math.max(var1.getHeight(), this.field200); // L: 258
		Insets var2;
		if (this.frame != null) { // L: 259
			var2 = this.frame.getInsets(); // L: 260
			InvDefinition.canvasWidth -= var2.right + var2.left; // L: 261
			class321.canvasHeight -= var2.top + var2.bottom; // L: 262
		}

		this.canvas = new Canvas(this); // L: 264
		var1.setBackground(Color.BLACK); // L: 265
		var1.setLayout((LayoutManager)null); // L: 266
		var1.add(this.canvas); // L: 267
		this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight); // L: 268
		this.canvas.setVisible(true); // L: 269
		this.canvas.setBackground(Color.BLACK); // L: 270
		if (var1 == this.frame) { // L: 271
			var2 = this.frame.getInsets(); // L: 272
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 273
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 275
		}

		this.canvas.addFocusListener(this); // L: 276
		this.canvas.requestFocus(); // L: 277
		this.fullRedraw = true; // L: 278
		if (FontName.rasterProvider != null && InvDefinition.canvasWidth == FontName.rasterProvider.width && class321.canvasHeight == FontName.rasterProvider.height) { // L: 279
			((RasterProvider)FontName.rasterProvider).setComponent(this.canvas); // L: 280
			FontName.rasterProvider.drawFull(0, 0); // L: 281
		} else {
			FontName.rasterProvider = new RasterProvider(InvDefinition.canvasWidth, class321.canvasHeight, this.canvas); // L: 284
		}

		this.isCanvasInvalid = false; // L: 286
		this.field209 = class136.method2931(); // L: 287
	} // L: 288

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1626365648"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 291
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 292
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 293
				if (var1.endsWith("127.0.0.1")) { // L: 294
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 295
					}

					if (var1.endsWith("192.168.1.")) { // L: 296
						return true;
					} else {
						this.error("invalidhost"); // L: 297
						return false; // L: 298
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1855362741"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class136.method2931(); // L: 351
		long var3 = clientTickTimes[SoundCache.field311]; // L: 352
		clientTickTimes[SoundCache.field311] = var1; // L: 353
		SoundCache.field311 = SoundCache.field311 + 1 & 31; // L: 354
		if (var3 != 0L && var1 > var3) { // L: 355
		}

		synchronized(this) { // L: 356
			Varcs.hasFocus = volatileFocus; // L: 357
		} // L: 358

		this.doCycle(); // L: 359
	} // L: 360

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 363
		long var2 = class136.method2931(); // L: 364
		long var4 = graphicsTickTimes[Fonts.field4517]; // L: 365
		graphicsTickTimes[Fonts.field4517] = var2; // L: 366
		Fonts.field4517 = Fonts.field4517 + 1 & 31; // L: 367
		if (0L != var4 && var2 > var4) { // L: 368
			int var6 = (int)(var2 - var4); // L: 369
			fps = ((var6 >> 1) + 32000) / var6; // L: 370
		}

		if (++field206 - 1 > 50) { // L: 372
			field206 -= 50; // L: 373
			this.fullRedraw = true; // L: 374
			this.canvas.setSize(InvDefinition.canvasWidth, class321.canvasHeight); // L: 375
			this.canvas.setVisible(true); // L: 376
			if (var1 == this.frame) { // L: 377
				Insets var7 = this.frame.getInsets(); // L: 378
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 379
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 381
			}
		}

		if (this.isCanvasInvalid) { // L: 383
			this.replaceCanvas();
		}

		this.method438(); // L: 384
		this.draw(this.fullRedraw); // L: 385
		if (this.fullRedraw) { // L: 386
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 387
	} // L: 388

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	final void method438() {
		Bounds var1 = this.getFrameContentBounds(); // L: 391
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 392
			this.resizeCanvas(); // L: 393
			this.resizeCanvasNextFrame = false; // L: 394
		}

	} // L: 396

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1741244290"
	)
	final void method466() {
		this.resizeCanvasNextFrame = true; // L: 399
	} // L: 400

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463619182"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 403
			isKilled = true; // L: 404

			try {
				this.canvas.removeFocusListener(this); // L: 406
			} catch (Exception var5) { // L: 408
			}

			try {
				this.kill0(); // L: 410
			} catch (Exception var4) { // L: 412
			}

			if (this.frame != null) { // L: 413
				try {
					System.exit(0); // L: 415
				} catch (Throwable var3) { // L: 417
				}
			}

			if (taskHandler != null) { // L: 419
				try {
					taskHandler.close(); // L: 421
				} catch (Exception var2) { // L: 423
				}
			}

			this.vmethod1140(); // L: 425
		}
	} // L: 426

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1665364684"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "612160698"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-8708"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1364313232"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "40"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 493
			if (WorldMapArchiveLoader.fontHelvetica13 == null) { // L: 494
				WorldMapArchiveLoader.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 495
				WorldMapSection1.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapArchiveLoader.fontHelvetica13); // L: 496
			}

			if (var3) { // L: 498
				var4.setColor(Color.black); // L: 499
				var4.fillRect(0, 0, InvDefinition.canvasWidth, class321.canvasHeight); // L: 500
			}

			Color var5 = new Color(140, 17, 17); // L: 502

			try {
				if (class1.field3 == null) { // L: 504
					class1.field3 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class1.field3.getGraphics(); // L: 505
				var6.setColor(var5); // L: 506
				var6.drawRect(0, 0, 303, 33); // L: 507
				var6.fillRect(2, 2, var1 * 3, 30); // L: 508
				var6.setColor(Color.black); // L: 509
				var6.drawRect(1, 1, 301, 31); // L: 510
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 511
				var6.setFont(WorldMapArchiveLoader.fontHelvetica13); // L: 512
				var6.setColor(Color.white); // L: 513
				var6.drawString(var2, (304 - WorldMapSection1.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 514
				var4.drawImage(class1.field3, InvDefinition.canvasWidth / 2 - 152, class321.canvasHeight / 2 - 18, (ImageObserver)null); // L: 515
			} catch (Exception var9) { // L: 517
				int var7 = InvDefinition.canvasWidth / 2 - 152; // L: 518
				int var8 = class321.canvasHeight / 2 - 18; // L: 519
				var4.setColor(var5); // L: 520
				var4.drawRect(var7, var8, 303, 33); // L: 521
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 522
				var4.setColor(Color.black); // L: 523
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 524
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 525
				var4.setFont(WorldMapArchiveLoader.fontHelvetica13); // L: 526
				var4.setColor(Color.white); // L: 527
				var4.drawString(var2, var7 + (304 - WorldMapSection1.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 528
			}
		} catch (Exception var10) { // L: 531
			this.canvas.repaint(); // L: 532
		}

	} // L: 534

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "900281563"
	)
	protected final void method520() {
		class1.field3 = null; // L: 537
		WorldMapArchiveLoader.fontHelvetica13 = null; // L: 538
		WorldMapSection1.loginScreenFontMetrics = null; // L: 539
	} // L: 540

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1191491956"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 543
			this.hasErrored = true; // L: 544
			System.out.println("error_game_" + var1); // L: 545

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 547
			} catch (Exception var3) { // L: 549
			}

		}
	} // L: 550

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "-23"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 553
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Lnm;",
		garbageValue = "5503"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 558
		int var2 = Math.max(var1.getWidth(), this.field205); // L: 559
		int var3 = Math.max(var1.getHeight(), this.field200); // L: 560
		if (this.frame != null) { // L: 561
			Insets var4 = this.frame.getInsets(); // L: 562
			var2 -= var4.left + var4.right; // L: 563
			var3 -= var4.top + var4.bottom; // L: 564
		}

		return new Bounds(var2, var3); // L: 566
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "180596017"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 570
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "111435525"
	)
	protected abstract void vmethod1140();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 457
			this.fullRedraw = true; // L: 458
			if (class136.method2931() - this.field209 > 1000L) { // L: 459
				Rectangle var2 = var1.getClipBounds(); // L: 460
				if (var2 == null || var2.width >= InvDefinition.canvasWidth && var2.height >= class321.canvasHeight) {
					this.isCanvasInvalid = true; // L: 461
				}
			}

		}
	} // L: 463

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 446
			stopTimeMs = class136.method2931(); // L: 447
			class93.method2384(5000L); // L: 448
			this.kill(); // L: 449
		}
	} // L: 450

	public final void windowActivated(WindowEvent var1) {
	} // L: 474

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 436
			stopTimeMs = 0L; // L: 437
		}
	} // L: 438

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 441
			stopTimeMs = class136.method2931() + 4000L; // L: 442
		}
	} // L: 443

	public final void update(Graphics var1) {
		this.paint(var1); // L: 453
	} // L: 454

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 471
	} // L: 472

	public final void windowClosed(WindowEvent var1) {
	} // L: 475

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 478
	} // L: 479

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 482

	public final void windowIconified(WindowEvent var1) {
	} // L: 483

	public final void windowOpened(WindowEvent var1) {
	} // L: 484

	public abstract void init();

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 466
		this.fullRedraw = true; // L: 467
	} // L: 468

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 481

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 303
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 304
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 305
					String var2 = TaskHandler.javaVersion; // L: 306
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 307
						this.error("wrongjava"); // L: 308
						return; // L: 309
					}

					if (var2.startsWith("1.6.0_")) { // L: 311
						int var3;
						for (var3 = 6; var3 < var2.length() && WorldMapElement.isDigit(var2.charAt(var3)); ++var3) { // L: 312 313
						}

						String var4 = var2.substring(6, var3); // L: 314
						if (class300.isNumber(var4) && class19.method288(var4) < 10) { // L: 315
							this.error("wrongjava"); // L: 316
							return; // L: 317
						}
					}

					fiveOrOne = 5; // L: 320
				}
			}

			this.setFocusCycleRoot(true); // L: 323
			this.addCanvas(); // L: 324
			this.setUp(); // L: 325

			Object var8;
			try {
				var8 = new NanoClock(); // L: 329
			} catch (Throwable var6) { // L: 331
				var8 = new MilliClock(); // L: 332
			}

			class431.clock = (Clock)var8; // L: 335

			while (stopTimeMs == 0L || class136.method2931() < stopTimeMs) { // L: 336
				TriBool.gameCyclesToDo = class431.clock.wait(cycleDurationMillis, fiveOrOne); // L: 337

				for (int var5 = 0; var5 < TriBool.gameCyclesToDo; ++var5) { // L: 338
					this.clientTick();
				}

				this.graphicsTick(); // L: 339
				this.post(this.canvas); // L: 340
			}
		} catch (Exception var7) { // L: 343
			Widget.RunException_sendStackTrace((String)null, var7); // L: 344
			this.error("crash"); // L: 345
		}

		this.kill(); // L: 347
	} // L: 348

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1147911593"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 134

		try {
			var0 = ModeWhere.getPreferencesFile("", Messages.field1305.name, true); // L: 136
			Buffer var1 = class131.clientPreferences.toBuffer(); // L: 137
			var0.write(var1.array, 0, var1.offset); // L: 138
		} catch (Exception var3) { // L: 140
		}

		try {
			if (var0 != null) { // L: 142
				var0.closeSync(true); // L: 143
			}
		} catch (Exception var2) { // L: 146
		}

	} // L: 147

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1079114439"
	)
	static final void method569(String var0) {
		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher); // L: 165
		var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0)); // L: 166
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 167
		Client.packetWriter.addNode(var1); // L: 168
	} // L: 169

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILks;ZI)V",
		garbageValue = "1109556006"
	)
	static void method570(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class21.getWorldMap().getMapArea(var0); // L: 4737
		int var4 = GrandExchangeEvents.localPlayer.plane; // L: 4738
		int var5 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX; // L: 4739
		int var6 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY; // L: 4740
		Coord var7 = new Coord(var4, var5, var6); // L: 4741
		class21.getWorldMap().method7231(var3, var7, var1, var2); // L: 4742
	} // L: 4743
}
