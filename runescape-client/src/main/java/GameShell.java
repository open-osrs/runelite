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

@ObfuscatedName("ba")
@Implements("GameShell")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("gameShell")
	static GameShell gameShell;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1935036079
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -3572078124580925775L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("z")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2072686187
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1928791623
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1333363833
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1701309635
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("n")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("r")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1541130703
	)
	static int field495;
	@ObfuscatedName("aa")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5754023503736299787L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7246664469956592727L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("gk")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1206716707
	)
	static int field466;
	@ObfuscatedName("q")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1942490897
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -12097029
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -56321895
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 314779351
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1023535157
	)
	int field482;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1830509
	)
	int field483;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1518889003
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -963306765
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ar")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ay")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ah")
	volatile boolean field488;
	@ObfuscatedName("au")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ai")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 641067398817964123L
	)
	volatile long field492;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("am")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameShell = null;
		GameShell_redundantStartThreadCount = 0;
		stopTimeMs = 0L; // L: 44
		isKilled = false;
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field495 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameShell() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field488 = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field492 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class69.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "8156"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method1023();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1268616662"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				WorldMapSection3.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lfq;",
		garbageValue = "1414879636"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067503658"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1423011731"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		GrandExchangeOfferNameComparator.method228(); // L: 130
		VertexNormal.method3136(this.canvas); // L: 131
	} // L: 132

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "932982288"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		TextureProvider.method2899(this.canvas); // L: 135
	} // L: 136

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 139
		if (var1 != null) { // L: 140
			Bounds var2 = this.getFrameContentBounds(); // L: 141
			this.contentWidth = Math.max(var2.highX, this.field482); // L: 142
			this.contentHeight = Math.max(var2.highY, this.field483); // L: 143
			if (this.contentWidth <= 0) { // L: 144
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 145
				this.contentHeight = 1;
			}

			ItemContainer.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 146
			HealthBar.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 147
			this.canvasX = (this.contentWidth - ItemContainer.canvasWidth) / 2; // L: 148
			this.canvasY = 0; // L: 149
			this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight); // L: 150
			class22.rasterProvider = new RasterProvider(ItemContainer.canvasWidth, HealthBar.canvasHeight, this.canvas); // L: 151
			if (var1 == this.frame) { // L: 152
				Insets var3 = this.frame.getInsets(); // L: 153
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 154
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 156
			}

			this.field488 = true; // L: 157
			this.resizeGame(); // L: 158
		}
	} // L: 159

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977357922"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136821254"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 164
		int var2 = this.canvasY; // L: 165
		int var3 = this.contentWidth - ItemContainer.canvasWidth - var1; // L: 166
		int var4 = this.contentHeight - HealthBar.canvasHeight - var2; // L: 167
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1457891067"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 190
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 192
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 193
		KeyHandler.field423 = -1; // L: 194
		java.awt.Canvas var2 = this.canvas; // L: 196
		var2.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 198
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 199
		var2.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 200
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 201
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas); // L: 203
		}

		this.addCanvas(); // L: 204
		VertexNormal.method3136(this.canvas); // L: 205
		TextureProvider.method2899(this.canvas); // L: 206
		if (this.mouseWheelHandler != null) { // L: 207
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method1023(); // L: 208
	} // L: 209

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1788157665"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameShell != null) { // L: 213
				++GameShell_redundantStartThreadCount; // L: 214
				if (GameShell_redundantStartThreadCount >= 3) { // L: 215
					this.error("alreadyloaded"); // L: 216
					return; // L: 217
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 219
				return; // L: 220
			}

			gameShell = this; // L: 222
			ItemContainer.canvasWidth = var1; // L: 223
			HealthBar.canvasHeight = var2; // L: 224
			RunException.RunException_revision = var3; // L: 225
			RunException.RunException_applet = this; // L: 226
			if (taskHandler == null) { // L: 227
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 228
		} catch (Exception var5) { // L: 230
			PacketWriter.RunException_sendStackTrace((String)null, var5); // L: 231
			this.error("crash"); // L: 232
		}

	} // L: 234

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1769153010"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 237
		if (this.canvas != null) { // L: 238
			this.canvas.removeFocusListener(this); // L: 239
			var1.remove(this.canvas); // L: 240
		}

		ItemContainer.canvasWidth = Math.max(var1.getWidth(), this.field482); // L: 242
		HealthBar.canvasHeight = Math.max(var1.getHeight(), this.field483); // L: 243
		Insets var2;
		if (this.frame != null) { // L: 244
			var2 = this.frame.getInsets(); // L: 245
			ItemContainer.canvasWidth -= var2.left + var2.right; // L: 246
			HealthBar.canvasHeight -= var2.bottom + var2.top; // L: 247
		}

		this.canvas = new Canvas(this); // L: 249
		var1.setBackground(Color.BLACK); // L: 250
		var1.setLayout((LayoutManager)null); // L: 251
		var1.add(this.canvas); // L: 252
		this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight); // L: 253
		this.canvas.setVisible(true); // L: 254
		this.canvas.setBackground(Color.BLACK); // L: 255
		if (var1 == this.frame) { // L: 256
			var2 = this.frame.getInsets(); // L: 257
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 258
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 260
		}

		this.canvas.addFocusListener(this); // L: 261
		this.canvas.requestFocus(); // L: 262
		this.field488 = true; // L: 263
		if (class22.rasterProvider != null && ItemContainer.canvasWidth == class22.rasterProvider.width && HealthBar.canvasHeight == class22.rasterProvider.height) { // L: 264
			((RasterProvider)class22.rasterProvider).setComponent(this.canvas); // L: 265
			class22.rasterProvider.drawFull(0, 0); // L: 266
		} else {
			class22.rasterProvider = new RasterProvider(ItemContainer.canvasWidth, HealthBar.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field492 = User.currentTimeMillis();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-25"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-840084713"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = User.currentTimeMillis(); // L: 327
		long var3 = clientTickTimes[class7.clientTickTimeIdx]; // L: 328
		clientTickTimes[class7.clientTickTimeIdx] = var1; // L: 329
		class7.clientTickTimeIdx = class7.clientTickTimeIdx + 1 & 31; // L: 330
		if (var3 != 0L && var1 > var3) { // L: 331
		}

		synchronized(this) { // L: 332
			class8.hasFocus = volatileFocus; // L: 333
		} // L: 334

		this.doCycle(); // L: 335
	} // L: 336

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 339
		long var2 = User.currentTimeMillis(); // L: 340
		long var4 = graphicsTickTimes[GraphicsDefaults.graphicsTickTimeIdx]; // L: 341
		graphicsTickTimes[GraphicsDefaults.graphicsTickTimeIdx] = var2; // L: 342
		GraphicsDefaults.graphicsTickTimeIdx = GraphicsDefaults.graphicsTickTimeIdx + 1 & 31; // L: 343
		if (0L != var4 && var2 > var4) { // L: 344
			int var6 = (int)(var2 - var4); // L: 345
			fps = ((var6 >> 1) + 32000) / var6; // L: 346
		}

		if (++field495 - 1 > 50) { // L: 348
			field495 -= 50; // L: 349
			this.field488 = true; // L: 350
			this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight); // L: 351
			this.canvas.setVisible(true); // L: 352
			if (var1 == this.frame) { // L: 353
				Insets var7 = this.frame.getInsets(); // L: 354
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 355
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 357
			}
		}

		if (this.isCanvasInvalid) { // L: 359
			this.replaceCanvas();
		}

		this.method1022(); // L: 360
		this.draw(this.field488); // L: 361
		if (this.field488) { // L: 362
			this.clearBackground();
		}

		this.field488 = false; // L: 363
	} // L: 364

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1244527776"
	)
	final void method1022() {
		Bounds var1 = this.getFrameContentBounds(); // L: 367
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 368
			this.resizeCanvas(); // L: 369
			this.resizeCanvasNextFrame = false; // L: 370
		}

	} // L: 372

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	final void method1023() {
		this.resizeCanvasNextFrame = true; // L: 375
	} // L: 376

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2057674106"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 379
			isKilled = true; // L: 380

			try {
				this.canvas.removeFocusListener(this); // L: 382
			} catch (Exception var5) { // L: 384
			}

			try {
				this.kill0(); // L: 386
			} catch (Exception var4) { // L: 388
			}

			if (this.frame != null) { // L: 389
				try {
					System.exit(0); // L: 391
				} catch (Throwable var3) { // L: 393
				}
			}

			if (taskHandler != null) { // L: 395
				try {
					taskHandler.close(); // L: 397
				} catch (Exception var2) { // L: 399
				}
			}

			this.vmethod1384(); // L: 401
		}
	} // L: 402

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1060461771"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1100660042"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1812204618"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "45"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 469
			if (ViewportMouse.fontHelvetica13 == null) { // L: 470
				ViewportMouse.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 471
				class52.loginScreenFontMetrics = this.canvas.getFontMetrics(ViewportMouse.fontHelvetica13); // L: 472
			}

			if (var3) { // L: 474
				var4.setColor(Color.black); // L: 475
				var4.fillRect(0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight); // L: 476
			}

			Color var5 = new Color(140, 17, 17); // L: 478

			try {
				if (class231.field2779 == null) { // L: 480
					class231.field2779 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class231.field2779.getGraphics(); // L: 481
				var6.setColor(var5); // L: 482
				var6.drawRect(0, 0, 303, 33); // L: 483
				var6.fillRect(2, 2, var1 * 3, 30); // L: 484
				var6.setColor(Color.black); // L: 485
				var6.drawRect(1, 1, 301, 31); // L: 486
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 487
				var6.setFont(ViewportMouse.fontHelvetica13); // L: 488
				var6.setColor(Color.white); // L: 489
				var6.drawString(var2, (304 - class52.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 490
				var4.drawImage(class231.field2779, ItemContainer.canvasWidth / 2 - 152, HealthBar.canvasHeight / 2 - 18, (ImageObserver)null); // L: 491
			} catch (Exception var9) { // L: 493
				int var7 = ItemContainer.canvasWidth / 2 - 152; // L: 494
				int var8 = HealthBar.canvasHeight / 2 - 18; // L: 495
				var4.setColor(var5); // L: 496
				var4.drawRect(var7, var8, 303, 33); // L: 497
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 498
				var4.setColor(Color.black); // L: 499
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 500
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 501
				var4.setFont(ViewportMouse.fontHelvetica13); // L: 502
				var4.setColor(Color.white); // L: 503
				var4.drawString(var2, var7 + (304 - class52.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 504
			}
		} catch (Exception var10) { // L: 507
			this.canvas.repaint(); // L: 508
		}

	} // L: 510

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	protected final void method1112() {
		class231.field2779 = null; // L: 513
		ViewportMouse.fontHelvetica13 = null; // L: 514
		class52.loginScreenFontMetrics = null; // L: 515
	} // L: 516

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1007402931"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 519
			this.hasErrored = true; // L: 520
			System.out.println("error_game_" + var1); // L: 521

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 523
			} catch (Exception var3) { // L: 525
			}

		}
	} // L: 526

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "1"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 529
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Llw;",
		garbageValue = "-50"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 534
		int var2 = Math.max(var1.getWidth(), this.field482); // L: 535
		int var3 = Math.max(var1.getHeight(), this.field483); // L: 536
		if (this.frame != null) { // L: 537
			Insets var4 = this.frame.getInsets(); // L: 538
			var2 -= var4.left + var4.right; // L: 539
			var3 -= var4.top + var4.bottom; // L: 540
		}

		return new Bounds(var2, var3); // L: 542
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1525003630"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 546
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	protected abstract void vmethod1384();

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) { // L: 433
			this.field488 = true; // L: 434
			if (User.currentTimeMillis() - this.field492 > 1000L) { // L: 435
				Rectangle var2 = var1.getClipBounds(); // L: 436
				if (var2 == null || var2.width >= ItemContainer.canvasWidth && var2.height >= HealthBar.canvasHeight) {
					this.isCanvasInvalid = true; // L: 437
				}
			}

		}
	} // L: 439

	public final void destroy() {
		if (this == gameShell && !isKilled) { // L: 422
			stopTimeMs = User.currentTimeMillis(); // L: 423
			WorldMapSection3.sleepExact(5000L); // L: 424
			this.kill(); // L: 425
		}
	} // L: 426

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 288
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 289
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 290
					String var2 = TaskHandler.javaVersion; // L: 291
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 292
						this.error("wrongjava"); // L: 293
						return; // L: 294
					}

					if (var2.startsWith("1.6.0_")) { // L: 296
						int var3;
						for (var3 = 6; var3 < var2.length() && class1.isDigit(var2.charAt(var3)); ++var3) { // L: 297 298
						}

						String var4 = var2.substring(6, var3); // L: 299
						if (class195.isNumber(var4) && ObjectSound.parseInt(var4) < 10) { // L: 300
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
			UserComparator3.clock = Actor.method1864(); // L: 311

			while (0L == stopTimeMs || User.currentTimeMillis() < stopTimeMs) { // L: 312
				gameCyclesToDo = UserComparator3.clock.wait(cycleDurationMillis, fiveOrOne); // L: 313

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 314
					this.clientTick();
				}

				this.graphicsTick(); // L: 315
				this.post(this.canvas); // L: 316
			}
		} catch (Exception var6) { // L: 319
			PacketWriter.RunException_sendStackTrace((String)null, var6); // L: 320
			this.error("crash"); // L: 321
		}

		this.kill(); // L: 323
	} // L: 324

	public final void windowIconified(WindowEvent var1) {
	} // L: 459

	public final void stop() {
		if (this == gameShell && !isKilled) { // L: 417
			stopTimeMs = User.currentTimeMillis() + 4000L; // L: 418
		}
	} // L: 419

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 442
		this.field488 = true; // L: 443
	} // L: 444

	public final void update(Graphics var1) {
		this.paint(var1); // L: 429
	} // L: 430

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 447
	} // L: 448

	public final void windowOpened(WindowEvent var1) {
	} // L: 460

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	} // L: 450

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 458

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 454
	} // L: 455

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 457

	public final void windowClosed(WindowEvent var1) {
	} // L: 451

	public final void start() {
		if (this == gameShell && !isKilled) { // L: 412
			stopTimeMs = 0L; // L: 413
		}
	} // L: 414

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-516507127"
	)
	public static int method1072(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 35
			var2 = var0; // L: 36
			var0 = var1; // L: 37
			var1 = var2; // L: 38
		}

		while (var1 != 0) { // L: 40
			var2 = var0 % var1; // L: 41
			var0 = var1; // L: 42
			var1 = var2; // L: 43
		}

		return var0; // L: 45
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1950130429"
	)
	static final void method1138(String var0, int var1) {
		PacketBufferNode var2 = class4.getPacketBufferNode(ClientPacket.field2234, Client.packetWriter.isaacCipher); // L: 268
		var2.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 269
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 270
		var2.packetBuffer.method5664(var1); // L: 271
		Client.packetWriter.addNode(var2); // L: 272
	} // L: 273
}
