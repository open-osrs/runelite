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

@ObfuscatedName("bw")
@Implements("GameShell")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("gameShell")
	static GameShell gameShell;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -823733869
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 5260130147769638647L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("i")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -551512965
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1340319367
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 253564767
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("q")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("f")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -744176475
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1469478575
	)
	static int field477;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5656541566078499911L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6735850027157901575L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("o")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -666140821
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 528808707
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2020225171
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1122384321
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 236351201
	)
	int field475;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1328280729
	)
	int field476;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1655899873
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1639831573
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("am")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ap")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	volatile boolean field481;
	@ObfuscatedName("at")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aq")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 158421572570045259L
	)
	volatile long field485;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("az")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameShell = null; // L: 41
		GameShell_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field477 = 500; // L: 73
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameShell() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field481 = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field485 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class300.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2029851592"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method991();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1294823568"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				class227.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lfd;",
		garbageValue = "51"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-726775332"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "783743664"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class8.method105(); // L: 130
		java.awt.Canvas var1 = this.canvas; // L: 131
		var1.setFocusTraversalKeysEnabled(false); // L: 133
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 134
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 135
	} // L: 137

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "15264"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		GrandExchangeOfferAgeComparator.method242(this.canvas); // L: 140
	} // L: 141

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "185905257"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 144
		if (var1 != null) { // L: 145
			Bounds var2 = this.getFrameContentBounds(); // L: 146
			this.contentWidth = Math.max(var2.highX, this.field475); // L: 147
			this.contentHeight = Math.max(var2.highY, this.field476); // L: 148
			if (this.contentWidth <= 0) { // L: 149
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 150
				this.contentHeight = 1;
			}

			FloorDecoration.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 151
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 152
			this.canvasX = (this.contentWidth - FloorDecoration.canvasWidth) / 2; // L: 153
			this.canvasY = 0; // L: 154
			this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight); // L: 155
			WorldMapSprite.rasterProvider = new RasterProvider(FloorDecoration.canvasWidth, canvasHeight, this.canvas); // L: 156
			if (var1 == this.frame) { // L: 157
				Insets var3 = this.frame.getInsets(); // L: 158
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 159
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 161
			}

			this.field481 = true; // L: 162
			this.resizeGame(); // L: 163
		}
	} // L: 164

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "912814062"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1351857768"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 169
		int var2 = this.canvasY; // L: 170
		int var3 = this.contentWidth - FloorDecoration.canvasWidth - var1; // L: 171
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1486323299"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		class182.method3683(this.canvas); // L: 195
		WorldMapAreaData.method751(this.canvas); // L: 196
		if (this.mouseWheelHandler != null) { // L: 197
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 198
		java.awt.Canvas var1 = this.canvas; // L: 199
		var1.setFocusTraversalKeysEnabled(false); // L: 201
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 202
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 203
		GrandExchangeOfferAgeComparator.method242(this.canvas); // L: 205
		if (this.mouseWheelHandler != null) { // L: 206
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method991(); // L: 207
	} // L: 208

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-922388983"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameShell != null) { // L: 212
				++GameShell_redundantStartThreadCount; // L: 213
				if (GameShell_redundantStartThreadCount >= 3) { // L: 214
					this.error("alreadyloaded"); // L: 215
					return; // L: 216
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 218
				return; // L: 219
			}

			gameShell = this; // L: 221
			FloorDecoration.canvasWidth = var1; // L: 222
			canvasHeight = var2; // L: 223
			ObjectDefinition.RunException_revision = var3; // L: 224
			RunException.RunException_applet = this; // L: 225
			if (taskHandler == null) { // L: 226
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 227
		} catch (Exception var5) { // L: 229
			Decimator.RunException_sendStackTrace((String)null, var5); // L: 230
			this.error("crash"); // L: 231
		}

	} // L: 233

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1659845190"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 236
		if (this.canvas != null) { // L: 237
			this.canvas.removeFocusListener(this); // L: 238
			var1.remove(this.canvas); // L: 239
		}

		FloorDecoration.canvasWidth = Math.max(var1.getWidth(), this.field475); // L: 241
		canvasHeight = Math.max(var1.getHeight(), this.field476); // L: 242
		Insets var2;
		if (this.frame != null) { // L: 243
			var2 = this.frame.getInsets(); // L: 244
			FloorDecoration.canvasWidth -= var2.left + var2.right; // L: 245
			canvasHeight -= var2.bottom + var2.top; // L: 246
		}

		this.canvas = new Canvas(this); // L: 248
		var1.setBackground(Color.BLACK); // L: 249
		var1.setLayout((LayoutManager)null); // L: 250
		var1.add(this.canvas); // L: 251
		this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight); // L: 252
		this.canvas.setVisible(true); // L: 253
		this.canvas.setBackground(Color.BLACK); // L: 254
		if (var1 == this.frame) { // L: 255
			var2 = this.frame.getInsets(); // L: 256
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 257
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 259
		}

		this.canvas.addFocusListener(this); // L: 260
		this.canvas.requestFocus(); // L: 261
		this.field481 = true; // L: 262
		if (WorldMapSprite.rasterProvider != null && FloorDecoration.canvasWidth == WorldMapSprite.rasterProvider.width && canvasHeight == WorldMapSprite.rasterProvider.height) { // L: 263
			((RasterProvider)WorldMapSprite.rasterProvider).setComponent(this.canvas); // L: 264
			WorldMapSprite.rasterProvider.drawFull(0, 0); // L: 265
		} else {
			WorldMapSprite.rasterProvider = new RasterProvider(FloorDecoration.canvasWidth, canvasHeight, this.canvas); // L: 268
		}

		this.isCanvasInvalid = false; // L: 270
		this.field485 = PacketWriter.currentTimeMillis(); // L: 271
	} // L: 272

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "395568671"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 275
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 276
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 277
				if (var1.endsWith("127.0.0.1")) { // L: 278
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 279
					}

					if (var1.endsWith("192.168.1.")) { // L: 280
						return true;
					} else {
						this.error("invalidhost"); // L: 281
						return false; // L: 282
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-152433822"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = PacketWriter.currentTimeMillis(); // L: 326
		long var3 = clientTickTimes[FontName.clientTickTimeIdx]; // L: 327
		clientTickTimes[FontName.clientTickTimeIdx] = var1; // L: 328
		FontName.clientTickTimeIdx = FontName.clientTickTimeIdx + 1 & 31; // L: 329
		if (var3 != 0L && var1 > var3) { // L: 330
		}

		synchronized(this) { // L: 331
			hasFocus = volatileFocus; // L: 332
		} // L: 333

		this.doCycle(); // L: 334
	} // L: 335

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1567053941"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 338
		long var2 = PacketWriter.currentTimeMillis(); // L: 339
		long var4 = graphicsTickTimes[BoundaryObject.graphicsTickTimeIdx]; // L: 340
		graphicsTickTimes[BoundaryObject.graphicsTickTimeIdx] = var2; // L: 341
		BoundaryObject.graphicsTickTimeIdx = BoundaryObject.graphicsTickTimeIdx + 1 & 31; // L: 342
		if (var4 != 0L && var2 > var4) { // L: 343
			int var6 = (int)(var2 - var4); // L: 344
			fps = ((var6 >> 1) + 32000) / var6; // L: 345
		}

		if (++field477 - 1 > 50) { // L: 347
			field477 -= 50; // L: 348
			this.field481 = true; // L: 349
			this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight); // L: 350
			this.canvas.setVisible(true); // L: 351
			if (var1 == this.frame) { // L: 352
				Insets var7 = this.frame.getInsets(); // L: 353
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 354
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 356
			}
		}

		if (this.isCanvasInvalid) { // L: 358
			this.replaceCanvas();
		}

		this.method990(); // L: 359
		this.draw(this.field481); // L: 360
		if (this.field481) { // L: 361
			this.clearBackground();
		}

		this.field481 = false; // L: 362
	} // L: 363

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "428970843"
	)
	final void method990() {
		Bounds var1 = this.getFrameContentBounds(); // L: 366
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 367
			this.resizeCanvas(); // L: 368
			this.resizeCanvasNextFrame = false; // L: 369
		}

	} // L: 371

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-650969456"
	)
	final void method991() {
		this.resizeCanvasNextFrame = true; // L: 374
	} // L: 375

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-181155812"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 378
			isKilled = true; // L: 379

			try {
				this.canvas.removeFocusListener(this); // L: 381
			} catch (Exception var5) { // L: 383
			}

			try {
				this.kill0(); // L: 385
			} catch (Exception var4) { // L: 387
			}

			if (this.frame != null) { // L: 388
				try {
					System.exit(0); // L: 390
				} catch (Throwable var3) { // L: 392
				}
			}

			if (taskHandler != null) { // L: 394
				try {
					taskHandler.close(); // L: 396
				} catch (Exception var2) { // L: 398
				}
			}

			this.vmethod1761(); // L: 400
		}
	} // L: 401

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1974240025"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-720509728"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-63"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-645621446"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "577795912"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 468
			if (class278.fontHelvetica13 == null) { // L: 469
				class278.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 470
				ApproximateRouteStrategy.loginScreenFontMetrics = this.canvas.getFontMetrics(class278.fontHelvetica13); // L: 471
			}

			if (var3) { // L: 473
				var4.setColor(Color.black); // L: 474
				var4.fillRect(0, 0, FloorDecoration.canvasWidth, canvasHeight); // L: 475
			}

			Color var5 = new Color(140, 17, 17); // L: 477

			try {
				if (PacketBuffer.field3725 == null) { // L: 479
					PacketBuffer.field3725 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = PacketBuffer.field3725.getGraphics(); // L: 480
				var6.setColor(var5); // L: 481
				var6.drawRect(0, 0, 303, 33); // L: 482
				var6.fillRect(2, 2, var1 * 3, 30); // L: 483
				var6.setColor(Color.black); // L: 484
				var6.drawRect(1, 1, 301, 31); // L: 485
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 486
				var6.setFont(class278.fontHelvetica13); // L: 487
				var6.setColor(Color.white); // L: 488
				var6.drawString(var2, (304 - ApproximateRouteStrategy.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 489
				var4.drawImage(PacketBuffer.field3725, FloorDecoration.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null); // L: 490
			} catch (Exception var9) { // L: 492
				int var7 = FloorDecoration.canvasWidth / 2 - 152; // L: 493
				int var8 = canvasHeight / 2 - 18; // L: 494
				var4.setColor(var5); // L: 495
				var4.drawRect(var7, var8, 303, 33); // L: 496
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 497
				var4.setColor(Color.black); // L: 498
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 499
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 500
				var4.setFont(class278.fontHelvetica13); // L: 501
				var4.setColor(Color.white); // L: 502
				var4.drawString(var2, var7 + (304 - ApproximateRouteStrategy.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 503
			}
		} catch (Exception var10) { // L: 506
			this.canvas.repaint(); // L: 507
		}

	} // L: 509

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	protected final void method1002() {
		PacketBuffer.field3725 = null; // L: 512
		class278.fontHelvetica13 = null; // L: 513
		ApproximateRouteStrategy.loginScreenFontMetrics = null; // L: 514
	} // L: 515

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1560488333"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 518
			this.hasErrored = true; // L: 519
			System.out.println("error_game_" + var1); // L: 520

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 522
			} catch (Exception var3) { // L: 524
			}

		}
	} // L: 525

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1926936525"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 528
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Llr;",
		garbageValue = "-1116469540"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 533
		int var2 = Math.max(var1.getWidth(), this.field475); // L: 534
		int var3 = Math.max(var1.getHeight(), this.field476); // L: 535
		if (this.frame != null) { // L: 536
			Insets var4 = this.frame.getInsets(); // L: 537
			var2 -= var4.right + var4.left; // L: 538
			var3 -= var4.top + var4.bottom; // L: 539
		}

		return new Bounds(var2, var3); // L: 541
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 545
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	protected abstract void vmethod1761();

	public final void destroy() {
		if (this == gameShell && !isKilled) { // L: 421
			stopTimeMs = PacketWriter.currentTimeMillis(); // L: 422
			class227.sleepExact(5000L); // L: 423
			this.kill(); // L: 424
		}
	} // L: 425

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) { // L: 432
			this.field481 = true; // L: 433
			if (PacketWriter.currentTimeMillis() - this.field485 > 1000L) { // L: 434
				Rectangle var2 = var1.getClipBounds(); // L: 435
				if (var2 == null || var2.width >= FloorDecoration.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true; // L: 436
				}
			}

		}
	} // L: 438

	public final void windowClosed(WindowEvent var1) {
	} // L: 450

	public final void start() {
		if (this == gameShell && !isKilled) { // L: 411
			stopTimeMs = 0L; // L: 412
		}
	} // L: 413

	public final void update(Graphics var1) {
		this.paint(var1); // L: 428
	} // L: 429

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 446
	} // L: 447

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 453
	} // L: 454

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 456

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 457

	public final void windowIconified(WindowEvent var1) {
	} // L: 458

	public final void windowOpened(WindowEvent var1) {
	} // L: 459

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 441
		this.field481 = true; // L: 442
	} // L: 443

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 287
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 288
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 289
					String var2 = TaskHandler.javaVersion; // L: 290
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 291
						this.error("wrongjava"); // L: 292
						return; // L: 293
					}

					if (var2.startsWith("1.6.0_")) { // L: 295
						int var3;
						for (var3 = 6; var3 < var2.length() && class1.isDigit(var2.charAt(var3)); ++var3) { // L: 296 297
						}

						String var4 = var2.substring(6, var3); // L: 298
						if (World.isNumber(var4) && GrandExchangeOfferTotalQuantityComparator.parseInt(var4) < 10) { // L: 299
							this.error("wrongjava"); // L: 300
							return; // L: 301
						}
					}

					fiveOrOne = 5; // L: 304
				}
			}

			this.setFocusCycleRoot(true); // L: 307
			this.addCanvas(); // L: 308
			this.setUp(); // L: 309
			AbstractWorldMapIcon.clock = ModeWhere.method3761(); // L: 310

			while (stopTimeMs == 0L || PacketWriter.currentTimeMillis() < stopTimeMs) { // L: 311
				class58.gameCyclesToDo = AbstractWorldMapIcon.clock.wait(cycleDurationMillis, fiveOrOne); // L: 312

				for (int var5 = 0; var5 < class58.gameCyclesToDo; ++var5) { // L: 313
					this.clientTick();
				}

				this.graphicsTick(); // L: 314
				this.post(this.canvas); // L: 315
			}
		} catch (Exception var6) { // L: 318
			Decimator.RunException_sendStackTrace((String)null, var6); // L: 319
			this.error("crash"); // L: 320
		}

		this.kill(); // L: 322
	} // L: 323

	public final void windowActivated(WindowEvent var1) {
	} // L: 449

	public final void stop() {
		if (this == gameShell && !isKilled) { // L: 416
			stopTimeMs = PacketWriter.currentTimeMillis() + 4000L; // L: 417
		}
	} // L: 418

	public abstract void init();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public static int method996(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 79 80 83
			var2 = var2 << 1 | var0 & 1; // L: 81
			var0 >>>= 1; // L: 82
		}

		return var2; // L: 85
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-1245222841"
	)
	public static int method1108(byte[] var0, int var1) {
		int var3 = -1; // L: 47

		for (int var4 = 0; var4 < var1; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 54
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	static void method1109() {
		if (ModelData0.field1901 != null) { // L: 10904
			Client.field946 = Client.cycle; // L: 10905
			ModelData0.field1901.method4414(); // L: 10906

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 10907
				if (Client.players[var0] != null) { // L: 10908
					ModelData0.field1901.method4423((Client.players[var0].x >> 7) + WorldMapManager.baseX, (Client.players[var0].y >> 7) + WorldMapLabel.baseY); // L: 10909
				}
			}
		}

	} // L: 10913
}
