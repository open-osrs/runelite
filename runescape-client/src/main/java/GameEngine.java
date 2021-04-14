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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("al")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1685725481
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -4853509514782557043L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("b")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 53446861
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1368983969
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 651117419
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("d")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("j")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1639936393
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 531187917
	)
	static int field321;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ab")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6808670330875016505L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 5063361816700909807L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 523882701
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -504731567
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1685077201
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -327773481
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 981917933
	)
	int field332;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2017329663
	)
	int field320;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 9044595
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1660420049
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("at")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("aj")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("aw")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("as")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ad")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5289724236337246501L
	)
	volatile long field303;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("az")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("au")
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
		field321 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field303 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class301.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "7"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method560();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "2112263032"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				GrandExchangeEvent.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ldw;",
		garbageValue = "-702892795"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1964367866"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1478107780"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "825633698"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class82.method1924(); // L: 130
		java.awt.Canvas var1 = this.canvas; // L: 131
		var1.setFocusTraversalKeysEnabled(false); // L: 133
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 134
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 135
	} // L: 137

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-748357036"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		UserComparator4.method2419(this.canvas); // L: 140
	} // L: 141

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 144
		if (var1 != null) { // L: 145
			Bounds var2 = this.getFrameContentBounds(); // L: 146
			this.contentWidth = Math.max(var2.highX, this.field332); // L: 147
			this.contentHeight = Math.max(var2.highY, this.field320); // L: 148
			if (this.contentWidth <= 0) { // L: 149
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 150
				this.contentHeight = 1;
			}

			InterfaceParent.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 151
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 152
			this.canvasX = (this.contentWidth - InterfaceParent.canvasWidth) / 2; // L: 153
			this.canvasY = 0; // L: 154
			this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight); // L: 155
			rasterProvider = new RasterProvider(InterfaceParent.canvasWidth, canvasHeight, this.canvas); // L: 156
			if (var1 == this.frame) { // L: 157
				Insets var3 = this.frame.getInsets(); // L: 158
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 159
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 161
			}

			this.fullRedraw = true; // L: 162
			this.resizeGame(); // L: 163
		}
	} // L: 164

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1835470787"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "35349985"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 169
		int var2 = this.canvasY; // L: 170
		int var3 = this.contentWidth - InterfaceParent.canvasWidth - var1; // L: 171
		int var4 = this.contentHeight - canvasHeight - var2; // L: 172
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 173
			try {
				Container var5 = this.container(); // L: 175
				int var6 = 0; // L: 176
				int var7 = 0; // L: 177
				if (var5 == this.frame) { // L: 178
					Insets var8 = this.frame.getInsets(); // L: 179
					var6 = var8.left; // L: 180
					var7 = var8.top; // L: 181
				}

				Graphics var10 = var5.getGraphics(); // L: 183
				var10.setColor(Color.black); // L: 184
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 185
				}

				if (var2 > 0) { // L: 186
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 187
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 188
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 190
			}
		}

	} // L: 192

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2129767231"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 195
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 197
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 198
		KeyHandler.field259 = -1; // L: 199
		WorldMapLabelSize.method2677(this.canvas); // L: 201
		if (this.mouseWheelHandler != null) { // L: 202
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 203
		java.awt.Canvas var2 = this.canvas; // L: 204
		var2.setFocusTraversalKeysEnabled(false); // L: 206
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 207
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 208
		UserComparator4.method2419(this.canvas); // L: 210
		if (this.mouseWheelHandler != null) { // L: 211
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method560(); // L: 212
	} // L: 213

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "69063419"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 217
				++GameEngine_redundantStartThreadCount; // L: 218
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 219
					this.error("alreadyloaded"); // L: 220
					return; // L: 221
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 223
				return; // L: 224
			}

			gameEngine = this; // L: 226
			InterfaceParent.canvasWidth = var1; // L: 227
			canvasHeight = var2; // L: 228
			RunException.RunException_revision = var3; // L: 229
			SecureRandomCallable.RunException_applet = this; // L: 230
			if (taskHandler == null) { // L: 231
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 232
		} catch (Exception var5) { // L: 234
			class223.RunException_sendStackTrace((String)null, var5); // L: 235
			this.error("crash"); // L: 236
		}

	} // L: 238

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-431845158"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 241
		if (this.canvas != null) { // L: 242
			this.canvas.removeFocusListener(this); // L: 243
			var1.remove(this.canvas); // L: 244
		}

		InterfaceParent.canvasWidth = Math.max(var1.getWidth(), this.field332); // L: 246
		canvasHeight = Math.max(var1.getHeight(), this.field320); // L: 247
		Insets var2;
		if (this.frame != null) { // L: 248
			var2 = this.frame.getInsets(); // L: 249
			InterfaceParent.canvasWidth -= var2.right + var2.left; // L: 250
			canvasHeight -= var2.top + var2.bottom; // L: 251
		}

		this.canvas = new Canvas(this); // L: 253
		var1.setBackground(Color.BLACK); // L: 254
		var1.setLayout((LayoutManager)null); // L: 255
		var1.add(this.canvas); // L: 256
		this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight); // L: 257
		this.canvas.setVisible(true); // L: 258
		this.canvas.setBackground(Color.BLACK); // L: 259
		if (var1 == this.frame) { // L: 260
			var2 = this.frame.getInsets(); // L: 261
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY); // L: 262
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 264
		}

		this.canvas.addFocusListener(this); // L: 265
		this.canvas.requestFocus(); // L: 266
		this.fullRedraw = true; // L: 267
		if (rasterProvider != null && InterfaceParent.canvasWidth == rasterProvider.width && canvasHeight == rasterProvider.height) { // L: 268
			((RasterProvider)rasterProvider).setComponent(this.canvas); // L: 269
			rasterProvider.drawFull(0, 0); // L: 270
		} else {
			rasterProvider = new RasterProvider(InterfaceParent.canvasWidth, canvasHeight, this.canvas); // L: 273
		}

		this.isCanvasInvalid = false; // L: 275
		this.field303 = ObjectSound.currentTimeMillis(); // L: 276
	} // L: 277

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 280
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 281
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 282
				if (var1.endsWith("127.0.0.1")) { // L: 283
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 284
					}

					if (var1.endsWith("192.168.1.")) { // L: 285
						return true;
					} else {
						this.error("invalidhost"); // L: 286
						return false; // L: 287
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ObjectSound.currentTimeMillis(); // L: 331
		long var3 = clientTickTimes[class29.clientTickTimeIdx]; // L: 332
		clientTickTimes[class29.clientTickTimeIdx] = var1; // L: 333
		class29.clientTickTimeIdx = class29.clientTickTimeIdx + 1 & 31; // L: 334
		if (0L != var3 && var1 > var3) { // L: 335
		}

		synchronized(this) { // L: 336
			GrandExchangeOfferAgeComparator.hasFocus = volatileFocus; // L: 337
		} // L: 338

		this.doCycle(); // L: 339
	} // L: 340

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 343
		long var2 = ObjectSound.currentTimeMillis(); // L: 344
		long var4 = graphicsTickTimes[class139.graphicsTickTimeIdx]; // L: 345
		graphicsTickTimes[class139.graphicsTickTimeIdx] = var2; // L: 346
		class139.graphicsTickTimeIdx = class139.graphicsTickTimeIdx + 1 & 31; // L: 347
		if (var4 != 0L && var2 > var4) { // L: 348
			int var6 = (int)(var2 - var4); // L: 349
			fps = ((var6 >> 1) + 32000) / var6; // L: 350
		}

		if (++field321 - 1 > 50) { // L: 352
			field321 -= 50; // L: 353
			this.fullRedraw = true; // L: 354
			this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight); // L: 355
			this.canvas.setVisible(true); // L: 356
			if (var1 == this.frame) { // L: 357
				Insets var7 = this.frame.getInsets(); // L: 358
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 359
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 361
			}
		}

		if (this.isCanvasInvalid) { // L: 363
			this.replaceCanvas();
		}

		this.method673(); // L: 364
		this.draw(this.fullRedraw); // L: 365
		if (this.fullRedraw) { // L: 366
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 367
	} // L: 368

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082996572"
	)
	final void method673() {
		Bounds var1 = this.getFrameContentBounds(); // L: 371
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 372
			this.resizeCanvas(); // L: 373
			this.resizeCanvasNextFrame = false; // L: 374
		}

	} // L: 376

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1539118256"
	)
	final void method560() {
		this.resizeCanvasNextFrame = true; // L: 379
	} // L: 380

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1612459374"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 383
			isKilled = true; // L: 384

			try {
				this.canvas.removeFocusListener(this); // L: 386
			} catch (Exception var5) { // L: 388
			}

			try {
				this.kill0(); // L: 390
			} catch (Exception var4) { // L: 392
			}

			if (this.frame != null) { // L: 393
				try {
					System.exit(0); // L: 395
				} catch (Throwable var3) { // L: 397
				}
			}

			if (taskHandler != null) { // L: 399
				try {
					taskHandler.close(); // L: 401
				} catch (Exception var2) { // L: 403
				}
			}

			this.vmethod1219(); // L: 405
		}
	} // L: 406

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-473168642"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-278821415"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1020883079"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 466
			if (class26.fontHelvetica13 == null) { // L: 467
				class26.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 468
				GrandExchangeOfferNameComparator.loginScreenFontMetrics = this.canvas.getFontMetrics(class26.fontHelvetica13); // L: 469
			}

			if (var3) { // L: 471
				var4.setColor(Color.black); // L: 472
				var4.fillRect(0, 0, InterfaceParent.canvasWidth, canvasHeight); // L: 473
			}

			Color var5 = new Color(140, 17, 17); // L: 475

			try {
				if (GrandExchangeOfferWorldComparator.field3318 == null) { // L: 477
					GrandExchangeOfferWorldComparator.field3318 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = GrandExchangeOfferWorldComparator.field3318.getGraphics(); // L: 478
				var6.setColor(var5); // L: 479
				var6.drawRect(0, 0, 303, 33); // L: 480
				var6.fillRect(2, 2, var1 * 3, 30); // L: 481
				var6.setColor(Color.black); // L: 482
				var6.drawRect(1, 1, 301, 31); // L: 483
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 484
				var6.setFont(class26.fontHelvetica13); // L: 485
				var6.setColor(Color.white); // L: 486
				var6.drawString(var2, (304 - GrandExchangeOfferNameComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 487
				var4.drawImage(GrandExchangeOfferWorldComparator.field3318, InterfaceParent.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null); // L: 488
			} catch (Exception var9) { // L: 490
				int var7 = InterfaceParent.canvasWidth / 2 - 152; // L: 491
				int var8 = canvasHeight / 2 - 18; // L: 492
				var4.setColor(var5); // L: 493
				var4.drawRect(var7, var8, 303, 33); // L: 494
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 495
				var4.setColor(Color.black); // L: 496
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 497
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 498
				var4.setFont(class26.fontHelvetica13); // L: 499
				var4.setColor(Color.white); // L: 500
				var4.drawString(var2, var7 + (304 - GrandExchangeOfferNameComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 501
			}
		} catch (Exception var10) { // L: 504
			this.canvas.repaint(); // L: 505
		}

	} // L: 507

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "320452892"
	)
	protected final void method594() {
		GrandExchangeOfferWorldComparator.field3318 = null; // L: 510
		class26.fontHelvetica13 = null; // L: 511
		GrandExchangeOfferNameComparator.loginScreenFontMetrics = null; // L: 512
	} // L: 513

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2138250050"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 516
			this.hasErrored = true; // L: 517
			System.out.println("error_game_" + var1); // L: 518

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 520
			} catch (Exception var3) { // L: 522
			}

		}
	} // L: 523

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1157412337"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 526
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Llj;",
		garbageValue = "80"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 531
		int var2 = Math.max(var1.getWidth(), this.field332); // L: 532
		int var3 = Math.max(var1.getHeight(), this.field320); // L: 533
		if (this.frame != null) { // L: 534
			Insets var4 = this.frame.getInsets(); // L: 535
			var2 -= var4.right + var4.left; // L: 536
			var3 -= var4.bottom + var4.top; // L: 537
		}

		return new Bounds(var2, var3); // L: 539
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-42126832"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 543
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1242495393"
	)
	protected abstract void vmethod1219();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 430
			this.fullRedraw = true; // L: 431
			if (ObjectSound.currentTimeMillis() - this.field303 > 1000L) { // L: 432
				Rectangle var2 = var1.getClipBounds(); // L: 433
				if (var2 == null || var2.width >= InterfaceParent.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true; // L: 434
				}
			}

		}
	} // L: 436

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 419
			stopTimeMs = ObjectSound.currentTimeMillis(); // L: 420
			GrandExchangeEvent.sleepExact(5000L); // L: 421
			this.kill(); // L: 422
		}
	} // L: 423

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 409
			stopTimeMs = 0L; // L: 410
		}
	} // L: 411

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 414
			stopTimeMs = ObjectSound.currentTimeMillis() + 4000L; // L: 415
		}
	} // L: 416

	public final void windowIconified(WindowEvent var1) {
	} // L: 456

	public final void update(Graphics var1) {
		this.paint(var1); // L: 426
	} // L: 427

	public final void windowActivated(WindowEvent var1) {
	} // L: 447

	public final void windowClosed(WindowEvent var1) {
	} // L: 448

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 451
	} // L: 452

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 454

	public abstract void init();

	public final void windowOpened(WindowEvent var1) {
	} // L: 457

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 439
		this.fullRedraw = true; // L: 440
	} // L: 441

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 292
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 293
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 294
					String var2 = TaskHandler.javaVersion; // L: 295
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 296
						this.error("wrongjava"); // L: 297
						return; // L: 298
					}

					if (var2.startsWith("1.6.0_")) { // L: 300
						int var3;
						for (var3 = 6; var3 < var2.length() && UserComparator4.isDigit(var2.charAt(var3)); ++var3) { // L: 301 302
						}

						String var4 = var2.substring(6, var3); // L: 303
						if (WorldMapArea.isNumber(var4) && class69.method1168(var4) < 10) { // L: 304
							this.error("wrongjava"); // L: 305
							return; // L: 306
						}
					}

					fiveOrOne = 5; // L: 309
				}
			}

			this.setFocusCycleRoot(true); // L: 312
			this.addCanvas(); // L: 313
			this.setUp(); // L: 314
			Decimator.clock = PacketBuffer.method6523(); // L: 315

			while (0L == stopTimeMs || ObjectSound.currentTimeMillis() < stopTimeMs) { // L: 316
				class232.gameCyclesToDo = Decimator.clock.wait(cycleDurationMillis, fiveOrOne); // L: 317

				for (int var5 = 0; var5 < class232.gameCyclesToDo; ++var5) { // L: 318
					this.clientTick();
				}

				this.graphicsTick(); // L: 319
				this.post(this.canvas); // L: 320
			}
		} catch (Exception var6) { // L: 323
			class223.RunException_sendStackTrace((String)null, var6); // L: 324
			this.error("crash"); // L: 325
		}

		this.kill(); // L: 327
	} // L: 328

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 444
	} // L: 445

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 455

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1469338847"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 68

		for (int var6 = 0; var6 < var5; ++var6) { // L: 69
			char var7 = var0.charAt(var6 + var1); // L: 70
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 71
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 72
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 73
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 74
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 75
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 76
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 77
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 78
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 79
			} else if (var7 == 8240) { // L: 80
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 81
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 82
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 83
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 84
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 85
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 86
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 87
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 88
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 89
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 90
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 91
			} else if (var7 == 732) { // L: 92
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 93
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 94
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 95
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 96
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 97
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 98
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 99
			}
		}

		return var5; // L: 101
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1318947252"
	)
	static void method682() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 57

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 58
			var1.clearIsFromFriend(); // L: 60
		}

	} // L: 63

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lfu;[Lel;I)V",
		garbageValue = "1781189638"
	)
	static final void method680(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 615
			for (var3 = 0; var3 < 104; ++var3) { // L: 616
				for (var4 = 0; var4 < 104; ++var4) { // L: 617
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 618
						var5 = var2; // L: 619
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 620
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 621
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field1103 += (int)(Math.random() * 5.0D) - 2; // L: 626
		if (Tiles.field1103 < -8) { // L: 627
			Tiles.field1103 = -8;
		}

		if (Tiles.field1103 > 8) { // L: 628
			Tiles.field1103 = 8;
		}

		Tiles.field1104 += (int)(Math.random() * 5.0D) - 2; // L: 629
		if (Tiles.field1104 < -16) { // L: 630
			Tiles.field1104 = -16;
		}

		if (Tiles.field1104 > 16) { // L: 631
			Tiles.field1104 = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) { // L: 632
			byte[][] var42 = SecureRandomCallable.field1106[var2]; // L: 633
			var9 = (int)Math.sqrt(5100.0D); // L: 639
			var10 = var9 * 768 >> 8; // L: 640

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 641
				for (var12 = 1; var12 < 103; ++var12) { // L: 642
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 643
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 644
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 645
					var16 = (var13 << 8) / var15; // L: 646
					var17 = 65536 / var15; // L: 647
					var18 = (var14 << 8) / var15; // L: 648
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 649
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1); // L: 650
					WorldMapLabelSize.field1570[var12][var11] = var19 - var20; // L: 651
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 654
				Tiles.Tiles_hue[var11] = 0; // L: 655
				Tiles.Tiles_saturation[var11] = 0; // L: 656
				Tiles.Tiles_lightness[var11] = 0; // L: 657
				GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var11] = 0; // L: 658
				class375.field4136[var11] = 0; // L: 659
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 661
				for (var12 = 0; var12 < 104; ++var12) { // L: 662
					var13 = var11 + 5; // L: 663
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 664
						var14 = class9.field69[var2][var13][var12] & 255; // L: 665
						if (var14 > 0) { // L: 666
							var16 = var14 - 1; // L: 668
							FloorUnderlayDefinition var44 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16); // L: 670
							FloorUnderlayDefinition var46;
							if (var44 != null) { // L: 671
								var46 = var44; // L: 672
							} else {
								byte[] var45 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16); // L: 675
								var44 = new FloorUnderlayDefinition(); // L: 676
								if (var45 != null) { // L: 677
									var44.decode(new Buffer(var45), var16);
								}

								var44.postDecode(); // L: 678
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var44, (long)var16); // L: 679
								var46 = var44; // L: 680
							}

							var10000 = Tiles.Tiles_hue; // L: 683
							var10000[var12] += var46.hue;
							var10000 = Tiles.Tiles_saturation; // L: 684
							var10000[var12] += var46.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 685
							var10000[var12] += var46.lightness;
							var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier; // L: 686
							var10000[var12] += var46.hueMultiplier;
							var10002 = class375.field4136[var12]++; // L: 687
						}
					}

					var14 = var11 - 5; // L: 690
					if (var14 >= 0 && var14 < 104) { // L: 691
						var15 = class9.field69[var2][var14][var12] & 255; // L: 692
						if (var15 > 0) { // L: 693
							FloorUnderlayDefinition var47 = Tiles.method2035(var15 - 1); // L: 694
							var10000 = Tiles.Tiles_hue; // L: 695
							var10000[var12] -= var47.hue;
							var10000 = Tiles.Tiles_saturation; // L: 696
							var10000[var12] -= var47.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 697
							var10000[var12] -= var47.lightness;
							var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier; // L: 698
							var10000[var12] -= var47.hueMultiplier;
							var10002 = class375.field4136[var12]--; // L: 699
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 703
					var12 = 0; // L: 704
					var13 = 0; // L: 705
					var14 = 0; // L: 706
					var15 = 0; // L: 707
					var16 = 0; // L: 708

					for (var17 = -5; var17 < 109; ++var17) { // L: 709
						var18 = var17 + 5; // L: 710
						if (var18 >= 0 && var18 < 104) { // L: 711
							var12 += Tiles.Tiles_hue[var18]; // L: 712
							var13 += Tiles.Tiles_saturation[var18]; // L: 713
							var14 += Tiles.Tiles_lightness[var18]; // L: 714
							var15 += GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var18]; // L: 715
							var16 += class375.field4136[var18]; // L: 716
						}

						var19 = var17 - 5; // L: 718
						if (var19 >= 0 && var19 < 104) { // L: 719
							var12 -= Tiles.Tiles_hue[var19]; // L: 720
							var13 -= Tiles.Tiles_saturation[var19]; // L: 721
							var14 -= Tiles.Tiles_lightness[var19]; // L: 722
							var15 -= GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var19]; // L: 723
							var16 -= class375.field4136[var19]; // L: 724
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 726 727 728 729
							if (var2 < Tiles.Tiles_minPlane) { // L: 732
								Tiles.Tiles_minPlane = var2;
							}

							var20 = class9.field69[var2][var11][var17] & 255; // L: 733
							int var21 = Tiles.field1092[var2][var11][var17] & 255; // L: 734
							if (var20 > 0 || var21 > 0) { // L: 735
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 736
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 737
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 738
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 739
								int var26 = WorldMapLabelSize.field1570[var11][var17]; // L: 740
								int var27 = WorldMapLabelSize.field1570[var11 + 1][var17]; // L: 741
								int var28 = WorldMapLabelSize.field1570[var11 + 1][var17 + 1]; // L: 742
								int var29 = WorldMapLabelSize.field1570[var11][var17 + 1]; // L: 743
								int var30 = -1; // L: 744
								int var31 = -1; // L: 745
								int var32;
								int var33;
								if (var20 > 0) { // L: 746
									var32 = var12 * 256 / var15; // L: 747
									var33 = var13 / var16; // L: 748
									int var34 = var14 / var16; // L: 749
									var30 = Script.hslToRgb(var32, var33, var34); // L: 750
									var32 = var32 + Tiles.field1103 & 255; // L: 751
									var34 += Tiles.field1104; // L: 752
									if (var34 < 0) { // L: 753
										var34 = 0;
									} else if (var34 > 255) { // L: 754
										var34 = 255;
									}

									var31 = Script.hslToRgb(var32, var33, var34); // L: 755
								}

								if (var2 > 0) { // L: 757
									boolean var49 = true; // L: 758
									if (var20 == 0 && Tiles.field1091[var2][var11][var17] != 0) { // L: 759
										var49 = false;
									}

									if (var21 > 0 && !Login.method1968(var21 - 1).hideUnderlay) { // L: 760
										var49 = false;
									}

									if (var49 && var22 == var23 && var22 == var24 && var25 == var22) { // L: 761 762
										var10000 = MidiPcmStream.field2489[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 765
								if (var31 != -1) { // L: 766
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[Message.method1191(var31, 96)];
								}

								if (var21 == 0) { // L: 767
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, Message.method1191(var30, var26), Message.method1191(var30, var27), Message.method1191(var30, var28), Message.method1191(var30, var29), 0, 0, 0, 0, var32, 0); // L: 768
								} else {
									var33 = Tiles.field1091[var2][var11][var17] + 1; // L: 771
									byte var50 = class362.field4079[var2][var11][var17]; // L: 772
									FloorOverlayDefinition var35 = Login.method1968(var21 - 1); // L: 773
									int var36 = var35.texture; // L: 774
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) { // L: 777
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36); // L: 778
										var37 = -1; // L: 779
									} else if (var35.primaryRgb == 16711935) { // L: 782
										var37 = -2; // L: 783
										var36 = -1; // L: 784
										var38 = -2; // L: 785
									} else {
										var37 = Script.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 788
										var39 = var35.hue + Tiles.field1103 & 255; // L: 789
										var40 = var35.lightness + Tiles.field1104; // L: 790
										if (var40 < 0) { // L: 791
											var40 = 0;
										} else if (var40 > 255) { // L: 792
											var40 = 255;
										}

										var38 = Script.hslToRgb(var39, var35.saturation, var40); // L: 793
									}

									var39 = 0; // L: 796
									if (var38 != -2) { // L: 797
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Player.method2148(var38, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 798
										var40 = var35.secondaryHue + Tiles.field1103 & 255; // L: 799
										int var41 = var35.secondaryLightness + Tiles.field1104; // L: 800
										if (var41 < 0) { // L: 801
											var41 = 0;
										} else if (var41 > 255) { // L: 802
											var41 = 255;
										}

										var38 = Script.hslToRgb(var40, var35.secondarySaturation, var41); // L: 803
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Player.method2148(var38, 96)]; // L: 804
									}

									var0.addTile(var2, var11, var17, var33, var50, var36, var22, var23, var24, var25, Message.method1191(var30, var26), Message.method1191(var30, var27), Message.method1191(var30, var28), Message.method1191(var30, var29), Player.method2148(var37, var26), Player.method2148(var37, var27), Player.method2148(var37, var28), Player.method2148(var37, var29), var32, var39); // L: 806
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 813
				for (var12 = 1; var12 < 103; ++var12) { // L: 814
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 821
						var17 = 0; // L: 822
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 825
						var17 = var2 - 1; // L: 826
					} else {
						var17 = var2; // L: 829
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 831
				}
			}

			class9.field69[var2] = null; // L: 834
			Tiles.field1092[var2] = null; // L: 835
			Tiles.field1091[var2] = null; // L: 836
			class362.field4079[var2] = null; // L: 837
			SecureRandomCallable.field1106[var2] = null; // L: 838
		}

		var0.method3466(-50, -10, -50); // L: 840

		for (var2 = 0; var2 < 104; ++var2) { // L: 841
			for (var3 = 0; var3 < 104; ++var3) { // L: 842
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 843
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 846
		var3 = 2; // L: 847
		var4 = 4; // L: 848

		for (var5 = 0; var5 < 4; ++var5) { // L: 849
			if (var5 > 0) { // L: 850
				var2 <<= 3; // L: 851
				var3 <<= 3; // L: 852
				var4 <<= 3; // L: 853
			}

			for (int var6 = 0; var6 <= var5; ++var6) { // L: 855
				for (int var7 = 0; var7 <= 104; ++var7) { // L: 856
					for (int var8 = 0; var8 <= 104; ++var8) { // L: 857
						short var48;
						if ((MidiPcmStream.field2489[var6][var8][var7] & var2) != 0) { // L: 858
							var9 = var7; // L: 859
							var10 = var7; // L: 860
							var11 = var6; // L: 861

							for (var12 = var6; var9 > 0 && (MidiPcmStream.field2489[var6][var8][var9 - 1] & var2) != 0; --var9) { // L: 862 863
							}

							while (var10 < 104 && (MidiPcmStream.field2489[var6][var8][var10 + 1] & var2) != 0) { // L: 864
								++var10;
							}

							label444:
							while (var11 > 0) { // L: 865
								for (var13 = var9; var13 <= var10; ++var13) { // L: 866
									if ((MidiPcmStream.field2489[var11 - 1][var8][var13] & var2) == 0) {
										break label444;
									}
								}

								--var11; // L: 867
							}

							label433:
							while (var12 < var5) { // L: 869
								for (var13 = var9; var13 <= var10; ++var13) { // L: 870
									if ((MidiPcmStream.field2489[var12 + 1][var8][var13] & var2) == 0) {
										break label433;
									}
								}

								++var12; // L: 871
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 873
							if (var13 >= 8) { // L: 874
								var48 = 240; // L: 875
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var48; // L: 876
								var16 = Tiles.Tiles_heights[var11][var8][var9]; // L: 877
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 878

								for (var17 = var11; var17 <= var12; ++var17) { // L: 879
									for (var18 = var9; var18 <= var10; ++var18) { // L: 880
										var10000 = MidiPcmStream.field2489[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((MidiPcmStream.field2489[var6][var8][var7] & var3) != 0) { // L: 884
							var9 = var8; // L: 885
							var10 = var8; // L: 886
							var11 = var6; // L: 887

							for (var12 = var6; var9 > 0 && (MidiPcmStream.field2489[var6][var9 - 1][var7] & var3) != 0; --var9) { // L: 888 889
							}

							while (var10 < 104 && (MidiPcmStream.field2489[var6][var10 + 1][var7] & var3) != 0) { // L: 890
								++var10;
							}

							label497:
							while (var11 > 0) { // L: 891
								for (var13 = var9; var13 <= var10; ++var13) { // L: 892
									if ((MidiPcmStream.field2489[var11 - 1][var13][var7] & var3) == 0) {
										break label497;
									}
								}

								--var11; // L: 893
							}

							label486:
							while (var12 < var5) { // L: 895
								for (var13 = var9; var13 <= var10; ++var13) { // L: 896
									if ((MidiPcmStream.field2489[var12 + 1][var13][var7] & var3) == 0) {
										break label486;
									}
								}

								++var12; // L: 897
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 899
							if (var13 >= 8) { // L: 900
								var48 = 240; // L: 901
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var48; // L: 902
								var16 = Tiles.Tiles_heights[var11][var9][var7]; // L: 903
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16); // L: 904

								for (var17 = var11; var17 <= var12; ++var17) { // L: 905
									for (var18 = var9; var18 <= var10; ++var18) { // L: 906
										var10000 = MidiPcmStream.field2489[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((MidiPcmStream.field2489[var6][var8][var7] & var4) != 0) { // L: 910
							var9 = var8; // L: 911
							var10 = var8; // L: 912
							var11 = var7; // L: 913

							for (var12 = var7; var11 > 0 && (MidiPcmStream.field2489[var6][var8][var11 - 1] & var4) != 0; --var11) { // L: 914 915
							}

							while (var12 < 104 && (MidiPcmStream.field2489[var6][var8][var12 + 1] & var4) != 0) { // L: 916
								++var12;
							}

							label550:
							while (var9 > 0) { // L: 917
								for (var13 = var11; var13 <= var12; ++var13) { // L: 918
									if ((MidiPcmStream.field2489[var6][var9 - 1][var13] & var4) == 0) {
										break label550;
									}
								}

								--var9; // L: 919
							}

							label539:
							while (var10 < 104) { // L: 921
								for (var13 = var11; var13 <= var12; ++var13) { // L: 922
									if ((MidiPcmStream.field2489[var6][var10 + 1][var13] & var4) == 0) {
										break label539;
									}
								}

								++var10; // L: 923
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 925
								var13 = Tiles.Tiles_heights[var6][var9][var11]; // L: 926
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 927

								for (var14 = var9; var14 <= var10; ++var14) { // L: 928
									for (var15 = var11; var15 <= var12; ++var15) { // L: 929
										var10000 = MidiPcmStream.field2489[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 937

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZS)I",
		garbageValue = "174"
	)
	static int method547(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1102
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1103
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1104
			return 1; // L: 1105
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1107
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1108
			return 1; // L: 1109
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1111
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1112
			return 1; // L: 1113
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1115
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1116
			return 1; // L: 1117
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1119
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1120
			return 1; // L: 1121
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1123
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1124
			return 1; // L: 1125
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1127
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1128
			return 1; // L: 1129
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1131
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1132
			return 1; // L: 1133
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1135
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1136
			return 1; // L: 1137
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) { // L: 1139
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1140
			return 1; // L: 1141
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) { // L: 1143
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1144
			return 1; // L: 1145
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1147
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color; // L: 1148
			return 1; // L: 1149
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1151
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color2; // L: 1152
			return 1; // L: 1153
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) { // L: 1155
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1156
			return 1; // L: 1157
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1159
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1160
			return 1; // L: 1161
		} else if (var0 != 1615 && var0 != 1616) { // L: 1163
			return 2; // L: 1167
		} else {
			++class16.Interpreter_intStackSize; // L: 1164
			return 1; // L: 1165
		}
	}
}
