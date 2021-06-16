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

@ObfuscatedName("aa")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1592553527
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 8033536561469626209L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("o")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1667530929
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -897639339
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -71568651
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("t")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 403418391
	)
	static int field341;
	@ObfuscatedName("ay")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 735532951630652423L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2068701588192565283L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("m")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1593755803
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1016616117
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -555916595
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1657620013
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1863798935
	)
	int field334;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 333844793
	)
	int field328;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 6136823
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 290386939
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("az")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ap")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ag")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ae")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ao")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -109758639681671179L
	)
	volatile long field348;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
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
		field341 = 500; // L: 73
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
		this.field348 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		BufferedNetSocket.method5960(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2123531727"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method582();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2062739769"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				class18.method272(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lei;",
		garbageValue = "6"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272269884"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-476290304"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1189108596"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		NetCache.method5177(); // L: 127
		SoundCache.method932(this.canvas); // L: 128
	} // L: 129

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		PacketBufferNode.method4497(this.canvas); // L: 132
	} // L: 133

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 136
		if (var1 != null) { // L: 137
			Bounds var2 = this.getFrameContentBounds(); // L: 138
			this.contentWidth = Math.max(var2.highX, this.field334); // L: 139
			this.contentHeight = Math.max(var2.highY, this.field328); // L: 140
			if (this.contentWidth <= 0) { // L: 141
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 142
				this.contentHeight = 1;
			}

			AttackOption.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 143
			class0.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 144
			this.canvasX = (this.contentWidth - AttackOption.canvasWidth) / 2; // L: 145
			this.canvasY = 0; // L: 146
			this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight); // L: 147
			AbstractWorldMapData.rasterProvider = new RasterProvider(AttackOption.canvasWidth, class0.canvasHeight, this.canvas); // L: 148
			if (var1 == this.frame) { // L: 149
				Insets var3 = this.frame.getInsets(); // L: 150
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 151
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 153
			}

			this.fullRedraw = true; // L: 154
			this.resizeGame(); // L: 155
		}
	} // L: 156

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 161
		int var2 = this.canvasY; // L: 162
		int var3 = this.contentWidth - AttackOption.canvasWidth - var1; // L: 163
		int var4 = this.contentHeight - class0.canvasHeight - var2; // L: 164
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 165
			try {
				Container var5 = this.container(); // L: 167
				int var6 = 0; // L: 168
				int var7 = 0; // L: 169
				if (var5 == this.frame) { // L: 170
					Insets var8 = this.frame.getInsets(); // L: 171
					var6 = var8.left; // L: 172
					var7 = var8.top; // L: 173
				}

				Graphics var10 = var5.getGraphics(); // L: 175
				var10.setColor(Color.black); // L: 176
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 177
				}

				if (var2 > 0) { // L: 178
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 179
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 180
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-4788971"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		class18.method275(this.canvas); // L: 187
		java.awt.Canvas var1 = this.canvas; // L: 188
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 190
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 191
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 192
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 193
		if (this.mouseWheelHandler != null) { // L: 195
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 196
		SoundCache.method932(this.canvas); // L: 197
		PacketBufferNode.method4497(this.canvas); // L: 198
		if (this.mouseWheelHandler != null) { // L: 199
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method582(); // L: 200
	} // L: 201

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-812079878"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 205
				++GameEngine_redundantStartThreadCount; // L: 206
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 207
					this.error("alreadyloaded"); // L: 208
					return; // L: 209
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 211
				return; // L: 212
			}

			gameEngine = this; // L: 214
			AttackOption.canvasWidth = var1; // L: 215
			class0.canvasHeight = var2; // L: 216
			RunException.RunException_revision = var3; // L: 217
			RunException.RunException_applet = this; // L: 218
			if (taskHandler == null) { // L: 219
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 220
		} catch (Exception var5) { // L: 222
			FriendsChat.RunException_sendStackTrace((String)null, var5); // L: 223
			this.error("crash"); // L: 224
		}

	} // L: 226

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087382687"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 229
		if (this.canvas != null) { // L: 230
			this.canvas.removeFocusListener(this); // L: 231
			var1.remove(this.canvas); // L: 232
		}

		AttackOption.canvasWidth = Math.max(var1.getWidth(), this.field334); // L: 234
		class0.canvasHeight = Math.max(var1.getHeight(), this.field328); // L: 235
		Insets var2;
		if (this.frame != null) { // L: 236
			var2 = this.frame.getInsets(); // L: 237
			AttackOption.canvasWidth -= var2.left + var2.right; // L: 238
			class0.canvasHeight -= var2.top + var2.bottom; // L: 239
		}

		this.canvas = new Canvas(this); // L: 241
		var1.setBackground(Color.BLACK); // L: 242
		var1.setLayout((LayoutManager)null); // L: 243
		var1.add(this.canvas); // L: 244
		this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight); // L: 245
		this.canvas.setVisible(true); // L: 246
		this.canvas.setBackground(Color.BLACK); // L: 247
		if (var1 == this.frame) { // L: 248
			var2 = this.frame.getInsets(); // L: 249
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 250
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 252
		}

		this.canvas.addFocusListener(this); // L: 253
		this.canvas.requestFocus(); // L: 254
		this.fullRedraw = true; // L: 255
		if (AbstractWorldMapData.rasterProvider != null && AttackOption.canvasWidth == AbstractWorldMapData.rasterProvider.width && class0.canvasHeight == AbstractWorldMapData.rasterProvider.height) { // L: 256
			((RasterProvider)AbstractWorldMapData.rasterProvider).setComponent(this.canvas); // L: 257
			AbstractWorldMapData.rasterProvider.drawFull(0, 0); // L: 258
		} else {
			AbstractWorldMapData.rasterProvider = new RasterProvider(AttackOption.canvasWidth, class0.canvasHeight, this.canvas); // L: 261
		}

		this.isCanvasInvalid = false; // L: 263
		this.field348 = ClientPacket.currentTimeMillis(); // L: 264
	} // L: 265

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1590867757"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 268
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 269
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 270
				if (var1.endsWith("127.0.0.1")) { // L: 271
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 272
					}

					if (var1.endsWith("192.168.1.")) { // L: 273
						return true;
					} else {
						this.error("invalidhost"); // L: 274
						return false; // L: 275
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ClientPacket.currentTimeMillis(); // L: 328
		long var3 = clientTickTimes[CollisionMap.clientTickTimeIdx]; // L: 329
		clientTickTimes[CollisionMap.clientTickTimeIdx] = var1; // L: 330
		CollisionMap.clientTickTimeIdx = CollisionMap.clientTickTimeIdx + 1 & 31; // L: 331
		if (var3 != 0L && var1 > var3) { // L: 332
		}

		synchronized(this) { // L: 333
			class397.hasFocus = volatileFocus; // L: 334
		} // L: 335

		this.doCycle(); // L: 336
	} // L: 337

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1414104897"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 340
		long var2 = ClientPacket.currentTimeMillis(); // L: 341
		long var4 = graphicsTickTimes[ReflectionCheck.graphicsTickTimeIdx]; // L: 342
		graphicsTickTimes[ReflectionCheck.graphicsTickTimeIdx] = var2; // L: 343
		ReflectionCheck.graphicsTickTimeIdx = ReflectionCheck.graphicsTickTimeIdx + 1 & 31; // L: 344
		if (0L != var4 && var2 > var4) { // L: 345
			int var6 = (int)(var2 - var4); // L: 346
			fps = ((var6 >> 1) + 32000) / var6; // L: 347
		}

		if (++field341 - 1 > 50) { // L: 349
			field341 -= 50; // L: 350
			this.fullRedraw = true; // L: 351
			this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight); // L: 352
			this.canvas.setVisible(true); // L: 353
			if (var1 == this.frame) { // L: 354
				Insets var7 = this.frame.getInsets(); // L: 355
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 356
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 358
			}
		}

		if (this.isCanvasInvalid) { // L: 360
			this.replaceCanvas();
		}

		this.method581(); // L: 361
		this.draw(this.fullRedraw); // L: 362
		if (this.fullRedraw) { // L: 363
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 364
	} // L: 365

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179024739"
	)
	final void method581() {
		Bounds var1 = this.getFrameContentBounds(); // L: 368
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 369
			this.resizeCanvas(); // L: 370
			this.resizeCanvasNextFrame = false; // L: 371
		}

	} // L: 373

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1411086569"
	)
	final void method582() {
		this.resizeCanvasNextFrame = true; // L: 376
	} // L: 377

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781774601"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 380
			isKilled = true; // L: 381

			try {
				this.canvas.removeFocusListener(this); // L: 383
			} catch (Exception var5) { // L: 385
			}

			try {
				this.kill0(); // L: 387
			} catch (Exception var4) { // L: 389
			}

			if (this.frame != null) { // L: 390
				try {
					System.exit(0); // L: 392
				} catch (Throwable var3) { // L: 394
				}
			}

			if (taskHandler != null) { // L: 396
				try {
					taskHandler.close(); // L: 398
				} catch (Exception var2) { // L: 400
				}
			}

			this.vmethod1278(); // L: 402
		}
	} // L: 403

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587549695"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087654500"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "49"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1785168903"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1399625911"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 470
			if (class13.fontHelvetica13 == null) { // L: 471
				class13.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 472
				class265.loginScreenFontMetrics = this.canvas.getFontMetrics(class13.fontHelvetica13); // L: 473
			}

			if (var3) { // L: 475
				var4.setColor(Color.black); // L: 476
				var4.fillRect(0, 0, AttackOption.canvasWidth, class0.canvasHeight); // L: 477
			}

			Color var5 = new Color(140, 17, 17); // L: 479

			try {
				if (MilliClock.field1527 == null) { // L: 481
					MilliClock.field1527 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = MilliClock.field1527.getGraphics(); // L: 482
				var6.setColor(var5); // L: 483
				var6.drawRect(0, 0, 303, 33); // L: 484
				var6.fillRect(2, 2, var1 * 3, 30); // L: 485
				var6.setColor(Color.black); // L: 486
				var6.drawRect(1, 1, 301, 31); // L: 487
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 488
				var6.setFont(class13.fontHelvetica13); // L: 489
				var6.setColor(Color.white); // L: 490
				var6.drawString(var2, (304 - class265.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 491
				var4.drawImage(MilliClock.field1527, AttackOption.canvasWidth / 2 - 152, class0.canvasHeight / 2 - 18, (ImageObserver)null); // L: 492
			} catch (Exception var9) { // L: 494
				int var7 = AttackOption.canvasWidth / 2 - 152; // L: 495
				int var8 = class0.canvasHeight / 2 - 18; // L: 496
				var4.setColor(var5); // L: 497
				var4.drawRect(var7, var8, 303, 33); // L: 498
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 499
				var4.setColor(Color.black); // L: 500
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 501
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 502
				var4.setFont(class13.fontHelvetica13); // L: 503
				var4.setColor(Color.white); // L: 504
				var4.drawString(var2, var7 + (304 - class265.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 505
			}
		} catch (Exception var10) { // L: 508
			this.canvas.repaint(); // L: 509
		}

	} // L: 511

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1903578766"
	)
	protected final void method672() {
		MilliClock.field1527 = null; // L: 514
		class13.fontHelvetica13 = null; // L: 515
		class265.loginScreenFontMetrics = null; // L: 516
	} // L: 517

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1320809291"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 520
			this.hasErrored = true; // L: 521
			System.out.println("error_game_" + var1); // L: 522

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 524
			} catch (Exception var3) { // L: 526
			}

		}
	} // L: 527

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "1"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 530
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Llw;",
		garbageValue = "-6"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 535
		int var2 = Math.max(var1.getWidth(), this.field334); // L: 536
		int var3 = Math.max(var1.getHeight(), this.field328); // L: 537
		if (this.frame != null) { // L: 538
			Insets var4 = this.frame.getInsets(); // L: 539
			var2 -= var4.right + var4.left; // L: 540
			var3 -= var4.bottom + var4.top; // L: 541
		}

		return new Bounds(var2, var3); // L: 543
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-969524667"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 547
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888551887"
	)
	protected abstract void vmethod1278();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 434
			this.fullRedraw = true; // L: 435
			if (ClientPacket.currentTimeMillis() - this.field348 > 1000L) { // L: 436
				Rectangle var2 = var1.getClipBounds(); // L: 437
				if (var2 == null || var2.width >= AttackOption.canvasWidth && var2.height >= class0.canvasHeight) {
					this.isCanvasInvalid = true; // L: 438
				}
			}

		}
	} // L: 440

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 423
			stopTimeMs = ClientPacket.currentTimeMillis(); // L: 424
			class18.method272(5000L); // L: 425
			this.kill(); // L: 426
		}
	} // L: 427

	public abstract void init();

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 280
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 281
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 282
					String var2 = TaskHandler.javaVersion; // L: 283
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 284
						this.error("wrongjava"); // L: 285
						return; // L: 286
					}

					if (var2.startsWith("1.6.0_")) { // L: 288
						int var3;
						for (var3 = 6; var3 < var2.length() && class105.isDigit(var2.charAt(var3)); ++var3) { // L: 289 290
						}

						String var4 = var2.substring(6, var3); // L: 291
						if (Varps.isNumber(var4) && FontName.method6335(var4) < 10) { // L: 292
							this.error("wrongjava"); // L: 293
							return; // L: 294
						}
					}

					fiveOrOne = 5; // L: 297
				}
			}

			this.setFocusCycleRoot(true); // L: 300
			this.addCanvas(); // L: 301
			this.setUp(); // L: 302

			Object var8;
			try {
				var8 = new NanoClock(); // L: 306
			} catch (Throwable var6) { // L: 308
				var8 = new MilliClock(); // L: 309
			}

			class160.clock = (Clock)var8; // L: 312

			while (0L == stopTimeMs || ClientPacket.currentTimeMillis() < stopTimeMs) { // L: 313
				class372.gameCyclesToDo = class160.clock.wait(cycleDurationMillis, fiveOrOne); // L: 314

				for (int var5 = 0; var5 < class372.gameCyclesToDo; ++var5) { // L: 315
					this.clientTick();
				}

				this.graphicsTick(); // L: 316
				this.post(this.canvas); // L: 317
			}
		} catch (Exception var7) { // L: 320
			FriendsChat.RunException_sendStackTrace((String)null, var7); // L: 321
			this.error("crash"); // L: 322
		}

		this.kill(); // L: 324
	} // L: 325

	public final void update(Graphics var1) {
		this.paint(var1); // L: 430
	} // L: 431

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 413
			stopTimeMs = 0L; // L: 414
		}
	} // L: 415

	public final void windowActivated(WindowEvent var1) {
	} // L: 451

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 455
	} // L: 456

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 459

	public final void windowOpened(WindowEvent var1) {
	} // L: 461

	public final void windowClosed(WindowEvent var1) {
	} // L: 452

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 458

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 448
	} // L: 449

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 418
			stopTimeMs = ClientPacket.currentTimeMillis() + 4000L; // L: 419
		}
	} // L: 420

	public final void windowIconified(WindowEvent var1) {
	} // L: 460

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 443
		this.fullRedraw = true; // L: 444
	} // L: 445

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1582150364"
	)
	static long method716(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1255982290"
	)
	static final boolean method717() {
		return Client.isMenuOpen; // L: 7756
	}
}
