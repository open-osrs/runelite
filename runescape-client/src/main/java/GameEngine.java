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

@ObfuscatedName("aw")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 915941483
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -2593658155731261435L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("l")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1637749829
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1340526085
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -871728399
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("j")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("s")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("au")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1673260223
	)
	static int field192;
	@ObfuscatedName("am")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -3214398047383872977L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 2946912833293583083L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static class391 field205;
	@ObfuscatedName("n")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1020947567
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1131645475
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -976425917
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1664726751
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 31638833
	)
	int field177;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1090157949
	)
	int field187;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1992376427
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -284047095
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("aw")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ar")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ae")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ad")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -8844499073377564733L
	)
	volatile long field197;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ah")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field192 = 500; // L: 73
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
		this.field197 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class125.method2804(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-426630363"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method469();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "478240082"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				GrandExchangeOfferTotalQuantityComparator.method6007(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;",
		garbageValue = "-1404787408"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	protected void method535(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (ChatChannel.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 128
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 129
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 130
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 131
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 132
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 133
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 134
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 135
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 136
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 137
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 138
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 139
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 140
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 143
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 144
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 145
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 146
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 147
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 148
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 149
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 150
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 151
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 152
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 153
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 154
		}

		java.awt.Canvas var1 = this.canvas; // L: 157
		var1.setFocusTraversalKeysEnabled(false); // L: 159
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 160
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 161
	} // L: 163

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1582400139"
	)
	protected final void method534() {
		UserComparator7.method2584(this.canvas); // L: 166
	} // L: 167

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-20103"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 170
		if (var1 != null) { // L: 171
			Bounds var2 = this.getFrameContentBounds(); // L: 172
			this.contentWidth = Math.max(var2.highX, this.field177); // L: 173
			this.contentHeight = Math.max(var2.highY, this.field187); // L: 174
			if (this.contentWidth <= 0) { // L: 175
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 176
				this.contentHeight = 1;
			}

			class4.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 177
			class309.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 178
			this.canvasX = (this.contentWidth - class4.canvasWidth) / 2; // L: 179
			this.canvasY = 0; // L: 180
			this.canvas.setSize(class4.canvasWidth, class309.canvasHeight); // L: 181
			SpotAnimationDefinition.rasterProvider = new RasterProvider(class4.canvasWidth, class309.canvasHeight, this.canvas); // L: 182
			if (var1 == this.frame) { // L: 183
				Insets var3 = this.frame.getInsets(); // L: 184
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 185
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 187
			}

			this.fullRedraw = true; // L: 188
			this.resizeGame(); // L: 189
		}
	} // L: 190

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 195
		int var2 = this.canvasY; // L: 196
		int var3 = this.contentWidth - class4.canvasWidth - var1; // L: 197
		int var4 = this.contentHeight - class309.canvasHeight - var2; // L: 198
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 199
			try {
				Container var5 = this.container(); // L: 201
				int var6 = 0; // L: 202
				int var7 = 0; // L: 203
				if (var5 == this.frame) { // L: 204
					Insets var8 = this.frame.getInsets(); // L: 205
					var6 = var8.left; // L: 206
					var7 = var8.top; // L: 207
				}

				Graphics var10 = var5.getGraphics(); // L: 209
				var10.setColor(Color.black); // L: 210
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 211
				}

				if (var2 > 0) { // L: 212
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 213
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 214
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 216
			}
		}

	} // L: 218

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		CollisionMap.method3852(this.canvas); // L: 221
		java.awt.Canvas var1 = this.canvas; // L: 222
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 224
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 225
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 226
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 227
		if (this.mouseWheelHandler != null) { // L: 229
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 230
		java.awt.Canvas var2 = this.canvas; // L: 231
		var2.setFocusTraversalKeysEnabled(false); // L: 233
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 234
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 235
		UserComparator7.method2584(this.canvas); // L: 237
		if (this.mouseWheelHandler != null) { // L: 238
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method469(); // L: 239
	} // L: 240

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2101804155"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 244
				++GameEngine_redundantStartThreadCount; // L: 245
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 246
					this.error("alreadyloaded"); // L: 247
					return; // L: 248
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 250
				return; // L: 251
			}

			gameEngine = this; // L: 253
			class4.canvasWidth = var1; // L: 254
			class309.canvasHeight = var2; // L: 255
			RunException.RunException_revision = var3; // L: 256
			RunException.RunException_applet = this; // L: 257
			if (class434.taskHandler == null) { // L: 258
				class434.taskHandler = new TaskHandler();
			}

			class434.taskHandler.newThreadTask(this, 1); // L: 259
		} catch (Exception var5) { // L: 261
			class301.RunException_sendStackTrace((String)null, var5); // L: 262
			this.error("crash"); // L: 263
		}

	} // L: 265

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 268
		if (this.canvas != null) { // L: 269
			this.canvas.removeFocusListener(this); // L: 270
			var1.remove(this.canvas); // L: 271
		}

		class4.canvasWidth = Math.max(var1.getWidth(), this.field177); // L: 273
		class309.canvasHeight = Math.max(var1.getHeight(), this.field187); // L: 274
		Insets var2;
		if (this.frame != null) { // L: 275
			var2 = this.frame.getInsets(); // L: 276
			class4.canvasWidth -= var2.right + var2.left; // L: 277
			class309.canvasHeight -= var2.top + var2.bottom; // L: 278
		}

		this.canvas = new Canvas(this); // L: 280
		var1.setBackground(Color.BLACK); // L: 281
		var1.setLayout((LayoutManager)null); // L: 282
		var1.add(this.canvas); // L: 283
		this.canvas.setSize(class4.canvasWidth, class309.canvasHeight); // L: 284
		this.canvas.setVisible(true); // L: 285
		this.canvas.setBackground(Color.BLACK); // L: 286
		if (var1 == this.frame) { // L: 287
			var2 = this.frame.getInsets(); // L: 288
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 289
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 291
		}

		this.canvas.addFocusListener(this); // L: 292
		this.canvas.requestFocus(); // L: 293
		this.fullRedraw = true; // L: 294
		if (SpotAnimationDefinition.rasterProvider != null && class4.canvasWidth == SpotAnimationDefinition.rasterProvider.width && class309.canvasHeight == SpotAnimationDefinition.rasterProvider.height) { // L: 295
			((RasterProvider)SpotAnimationDefinition.rasterProvider).setComponent(this.canvas); // L: 296
			SpotAnimationDefinition.rasterProvider.drawFull(0, 0); // L: 297
		} else {
			SpotAnimationDefinition.rasterProvider = new RasterProvider(class4.canvasWidth, class309.canvasHeight, this.canvas); // L: 300
		}

		this.isCanvasInvalid = false; // L: 302
		this.field197 = WorldMapSprite.method4989(); // L: 303
	} // L: 304

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 307
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 308
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 309
				if (var1.endsWith("127.0.0.1")) { // L: 310
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 311
					}

					if (var1.endsWith("192.168.1.")) { // L: 312
						return true;
					} else {
						this.error("invalidhost"); // L: 313
						return false; // L: 314
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "858052670"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = WorldMapSprite.method4989(); // L: 358
		long var3 = clientTickTimes[class82.field1071]; // L: 359
		clientTickTimes[class82.field1071] = var1; // L: 360
		class82.field1071 = class82.field1071 + 1 & 31; // L: 361
		if (0L != var3 && var1 > var3) { // L: 362
		}

		synchronized(this) { // L: 363
			Varps.hasFocus = volatileFocus; // L: 364
		} // L: 365

		this.doCycle(); // L: 366
	} // L: 367

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1307738586"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 370
		long var2 = WorldMapSprite.method4989(); // L: 371
		long var4 = graphicsTickTimes[BufferedNetSocket.field4286]; // L: 372
		graphicsTickTimes[BufferedNetSocket.field4286] = var2; // L: 373
		BufferedNetSocket.field4286 = BufferedNetSocket.field4286 + 1 & 31; // L: 374
		if (var4 != 0L && var2 > var4) { // L: 375
			int var6 = (int)(var2 - var4); // L: 376
			fps = ((var6 >> 1) + 32000) / var6; // L: 377
		}

		if (++field192 - 1 > 50) { // L: 379
			field192 -= 50; // L: 380
			this.fullRedraw = true; // L: 381
			this.canvas.setSize(class4.canvasWidth, class309.canvasHeight); // L: 382
			this.canvas.setVisible(true); // L: 383
			if (var1 == this.frame) { // L: 384
				Insets var7 = this.frame.getInsets(); // L: 385
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 386
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 388
			}
		}

		if (this.isCanvasInvalid) { // L: 390
			this.replaceCanvas();
		}

		this.method468(); // L: 391
		this.draw(this.fullRedraw); // L: 392
		if (this.fullRedraw) { // L: 393
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 394
	} // L: 395

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204191070"
	)
	final void method468() {
		Bounds var1 = this.getFrameContentBounds(); // L: 398
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 399
			this.resizeCanvas(); // L: 400
			this.resizeCanvasNextFrame = false; // L: 401
		}

	} // L: 403

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1470362606"
	)
	final void method469() {
		this.resizeCanvasNextFrame = true; // L: 406
	} // L: 407

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1753011645"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 410
			isKilled = true; // L: 411

			try {
				this.canvas.removeFocusListener(this); // L: 413
			} catch (Exception var5) { // L: 415
			}

			try {
				this.kill0(); // L: 417
			} catch (Exception var4) { // L: 419
			}

			if (this.frame != null) { // L: 420
				try {
					System.exit(0); // L: 422
				} catch (Throwable var3) { // L: 424
				}
			}

			if (class434.taskHandler != null) { // L: 426
				try {
					class434.taskHandler.close(); // L: 428
				} catch (Exception var2) { // L: 430
				}
			}

			this.vmethod1135(); // L: 432
		}
	} // L: 433

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1683905481"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2114912088"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1473189085"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 519
			if (fontHelvetica13 == null) { // L: 520
				fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 521
				class241.loginScreenFontMetrics = this.canvas.getFontMetrics(fontHelvetica13); // L: 522
			}

			if (var3) { // L: 524
				var4.setColor(Color.black); // L: 525
				var4.fillRect(0, 0, class4.canvasWidth, class309.canvasHeight); // L: 526
			}

			Color var5 = new Color(140, 17, 17); // L: 528

			try {
				if (class11.field56 == null) { // L: 530
					class11.field56 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class11.field56.getGraphics(); // L: 531
				var6.setColor(var5); // L: 532
				var6.drawRect(0, 0, 303, 33); // L: 533
				var6.fillRect(2, 2, var1 * 3, 30); // L: 534
				var6.setColor(Color.black); // L: 535
				var6.drawRect(1, 1, 301, 31); // L: 536
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 537
				var6.setFont(fontHelvetica13); // L: 538
				var6.setColor(Color.white); // L: 539
				var6.drawString(var2, (304 - class241.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 540
				var4.drawImage(class11.field56, class4.canvasWidth / 2 - 152, class309.canvasHeight / 2 - 18, (ImageObserver)null); // L: 541
			} catch (Exception var9) { // L: 543
				int var7 = class4.canvasWidth / 2 - 152; // L: 544
				int var8 = class309.canvasHeight / 2 - 18; // L: 545
				var4.setColor(var5); // L: 546
				var4.drawRect(var7, var8, 303, 33); // L: 547
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 548
				var4.setColor(Color.black); // L: 549
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 550
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 551
				var4.setFont(fontHelvetica13); // L: 552
				var4.setColor(Color.white); // L: 553
				var4.drawString(var2, var7 + (304 - class241.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 554
			}
		} catch (Exception var10) { // L: 557
			this.canvas.repaint(); // L: 558
		}

	} // L: 560

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1566808200"
	)
	protected final void method481() {
		class11.field56 = null; // L: 563
		fontHelvetica13 = null; // L: 564
		class241.loginScreenFontMetrics = null; // L: 565
	} // L: 566

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-314865656"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-394881039"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 579
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lnm;",
		garbageValue = "1930493271"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 584
		int var2 = Math.max(var1.getWidth(), this.field177); // L: 585
		int var3 = Math.max(var1.getHeight(), this.field187); // L: 586
		if (this.frame != null) { // L: 587
			Insets var4 = this.frame.getInsets(); // L: 588
			var2 -= var4.right + var4.left; // L: 589
			var3 -= var4.top + var4.bottom; // L: 590
		}

		return new Bounds(var2, var3); // L: 592
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1758582880"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 596
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	protected abstract void vmethod1135();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 469
			this.fullRedraw = true; // L: 470
			if (WorldMapSprite.method4989() - this.field197 > 1000L) { // L: 471
				Rectangle var2 = var1.getClipBounds(); // L: 472
				if (var2 == null || var2.width >= class4.canvasWidth && var2.height >= class309.canvasHeight) {
					this.isCanvasInvalid = true; // L: 473
				}
			}

		}
	} // L: 475

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 456
			stopTimeMs = WorldMapSprite.method4989(); // L: 457
			GrandExchangeOfferTotalQuantityComparator.method6007(5000L); // L: 458
			this.kill(); // L: 459
		}
	} // L: 460

	public void run() {
		try {
			if (ChatChannel.javaVendor != null) { // L: 319
				String var1 = ChatChannel.javaVendor.toLowerCase(); // L: 320
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 321
					String var2 = TaskHandler.javaVersion; // L: 322
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 323
						this.error("wrongjava"); // L: 324
						return; // L: 325
					}

					if (var2.startsWith("1.6.0_")) { // L: 327
						int var3;
						for (var3 = 6; var3 < var2.length() && class117.isDigit(var2.charAt(var3)); ++var3) { // L: 328 329
						}

						String var4 = var2.substring(6, var3); // L: 330
						if (class20.isNumber(var4) && class16.method217(var4) < 10) { // L: 331
							this.error("wrongjava"); // L: 332
							return; // L: 333
						}
					}

					fiveOrOne = 5; // L: 336
				}
			}

			this.setFocusCycleRoot(true); // L: 339
			this.addCanvas(); // L: 340
			this.setUp(); // L: 341
			class4.clock = UserComparator5.method2592(); // L: 342

			while (stopTimeMs == 0L || WorldMapSprite.method4989() < stopTimeMs) { // L: 343
				class134.gameCyclesToDo = class4.clock.wait(cycleDurationMillis, fiveOrOne); // L: 344

				for (int var5 = 0; var5 < class134.gameCyclesToDo; ++var5) { // L: 345
					this.clientTick();
				}

				this.graphicsTick(); // L: 346
				this.post(this.canvas); // L: 347
			}
		} catch (Exception var6) { // L: 350
			class301.RunException_sendStackTrace((String)null, var6); // L: 351
			this.error("crash"); // L: 352
		}

		this.kill(); // L: 354
	} // L: 355

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 485
	} // L: 486

	public final void update(Graphics var1) {
		this.paint(var1); // L: 464
	} // L: 465

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 479
		this.fullRedraw = true; // L: 480
	} // L: 481

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 450
			stopTimeMs = WorldMapSprite.method4989() + 4000L; // L: 451
		}
	} // L: 452

	public final void windowActivated(WindowEvent var1) {
	} // L: 489

	public final void windowClosed(WindowEvent var1) {
	} // L: 492

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 500

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 503

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 496
	} // L: 497

	public final void windowIconified(WindowEvent var1) {
	} // L: 506

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 444
			stopTimeMs = 0L; // L: 445
		}
	} // L: 446

	public final void windowOpened(WindowEvent var1) {
	} // L: 509

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgj;",
		garbageValue = "1098154706"
	)
	public static HitSplatDefinition method589(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CLlp;I)C",
		garbageValue = "705203472"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 93
			if (var0 >= 192 && var0 <= 198) { // L: 94
				return 'A';
			}

			if (var0 == 199) { // L: 95
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 96
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 97
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 98
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 99
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 100
				return 'U';
			}

			if (var0 == 221) { // L: 101
				return 'Y';
			}

			if (var0 == 223) { // L: 102
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 103
				return 'a';
			}

			if (var0 == 231) { // L: 104
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 105
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 106
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 107
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 108
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 109
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 110
				return 'y';
			}
		}

		if (var0 == 338) { // L: 112
			return 'O';
		} else if (var0 == 339) { // L: 113
			return 'o';
		} else if (var0 == 376) { // L: 114
			return 'Y';
		} else {
			return var0; // L: 115
		}
	}
}
