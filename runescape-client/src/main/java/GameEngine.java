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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 101195885
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 1041392062207193601L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("t")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -449593007
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 361879733
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2003926073
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1529824095
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("h")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1869136141
	)
	static int field191;
	@ObfuscatedName("e")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1200359535
	)
	static int field204;
	@ObfuscatedName("at")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5901538680007950845L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -3709786579924747147L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("s")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -484792125
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1903337841
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 523594845
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1957375435
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -193525917
	)
	int field197;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1511981227
	)
	int field195;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1719280099
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1219535973
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("am")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("az")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5964602634567771817L
	)
	volatile long field207;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aa")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("as")
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
		field204 = 500; // L: 73
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
		this.field207 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		class130.method2795(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-271494890"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method482();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "109"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				Bounds.method6608(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Leq;",
		garbageValue = "247241900"
	)
	@Export("mouseWheel")
	protected class154 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1865121079"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1085024846"
	)
	protected void method492(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1640324259"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class132.method2810(); // L: 127
		DevicePcmPlayerProvider.method393(this.canvas); // L: 128
	} // L: 129

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-150976467"
	)
	protected final void method472() {
		class136.method2839(this.canvas); // L: 132
	} // L: 133

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-740959937"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 136
		if (var1 != null) { // L: 137
			Bounds var2 = this.getFrameContentBounds(); // L: 138
			this.contentWidth = Math.max(var2.highX, this.field197); // L: 139
			this.contentHeight = Math.max(var2.highY, this.field195); // L: 140
			if (this.contentWidth <= 0) { // L: 141
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 142
				this.contentHeight = 1;
			}

			class186.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 143
			BoundaryObject.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 144
			this.canvasX = (this.contentWidth - class186.canvasWidth) / 2; // L: 145
			this.canvasY = 0; // L: 146
			this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight); // L: 147
			class19.rasterProvider = new RasterProvider(class186.canvasWidth, BoundaryObject.canvasHeight, this.canvas); // L: 148
			if (var1 == this.frame) { // L: 149
				Insets var3 = this.frame.getInsets(); // L: 150
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 151
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 153
			}

			this.fullRedraw = true; // L: 154
			this.resizeGame(); // L: 155
		}
	} // L: 156

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122855875"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990507849"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 161
		int var2 = this.canvasY; // L: 162
		int var3 = this.contentWidth - class186.canvasWidth - var1; // L: 163
		int var4 = this.contentHeight - BoundaryObject.canvasHeight - var2; // L: 164
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-168794893"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 187
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 189
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 190
		KeyHandler.field120 = -1; // L: 191
		GameBuild.method5494(this.canvas); // L: 193
		if (this.mouseWheelHandler != null) { // L: 194
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 195
		DevicePcmPlayerProvider.method393(this.canvas); // L: 196
		class136.method2839(this.canvas); // L: 197
		if (this.mouseWheelHandler != null) { // L: 198
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method482(); // L: 199
	} // L: 200

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2147483648"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 204
				++GameEngine_redundantStartThreadCount; // L: 205
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 206
					this.error("alreadyloaded"); // L: 207
					return; // L: 208
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 210
				return; // L: 211
			}

			gameEngine = this; // L: 213
			class186.canvasWidth = var1; // L: 214
			BoundaryObject.canvasHeight = var2; // L: 215
			RunException.RunException_revision = var3; // L: 216
			RunException.RunException_applet = this; // L: 217
			if (taskHandler == null) { // L: 218
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 219
		} catch (Exception var5) { // L: 221
			AccessFile.RunException_sendStackTrace((String)null, var5); // L: 222
			this.error("crash"); // L: 223
		}

	} // L: 225

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1171942510"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 228
		if (this.canvas != null) { // L: 229
			this.canvas.removeFocusListener(this); // L: 230
			var1.remove(this.canvas); // L: 231
		}

		class186.canvasWidth = Math.max(var1.getWidth(), this.field197); // L: 233
		BoundaryObject.canvasHeight = Math.max(var1.getHeight(), this.field195); // L: 234
		Insets var2;
		if (this.frame != null) { // L: 235
			var2 = this.frame.getInsets(); // L: 236
			class186.canvasWidth -= var2.right + var2.left; // L: 237
			BoundaryObject.canvasHeight -= var2.top + var2.bottom; // L: 238
		}

		this.canvas = new Canvas(this); // L: 240
		var1.setBackground(Color.BLACK); // L: 241
		var1.setLayout((LayoutManager)null); // L: 242
		var1.add(this.canvas); // L: 243
		this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight); // L: 244
		this.canvas.setVisible(true); // L: 245
		this.canvas.setBackground(Color.BLACK); // L: 246
		if (var1 == this.frame) { // L: 247
			var2 = this.frame.getInsets(); // L: 248
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 249
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 251
		}

		this.canvas.addFocusListener(this); // L: 252
		this.canvas.requestFocus(); // L: 253
		this.fullRedraw = true; // L: 254
		if (class19.rasterProvider != null && class186.canvasWidth == class19.rasterProvider.width && BoundaryObject.canvasHeight == class19.rasterProvider.height) { // L: 255
			((RasterProvider)class19.rasterProvider).setComponent(this.canvas); // L: 256
			class19.rasterProvider.drawFull(0, 0); // L: 257
		} else {
			class19.rasterProvider = new RasterProvider(class186.canvasWidth, BoundaryObject.canvasHeight, this.canvas); // L: 260
		}

		this.isCanvasInvalid = false; // L: 262
		this.field207 = Ignored.method6459(); // L: 263
	} // L: 264

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-426429067"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 267
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 268
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 269
				if (var1.endsWith("127.0.0.1")) { // L: 270
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') { // L: 271
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) { // L: 272
						return true;
					} else {
						this.error("invalidhost"); // L: 273
						return false; // L: 274
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Ignored.method6459(); // L: 327
		long var3 = clientTickTimes[ScriptFrame.field448]; // L: 328
		clientTickTimes[ScriptFrame.field448] = var1; // L: 329
		ScriptFrame.field448 = ScriptFrame.field448 + 1 & 31; // L: 330
		if (var3 != 0L && var1 > var3) { // L: 331
		}

		synchronized(this) { // L: 332
			World.hasFocus = volatileFocus; // L: 333
		} // L: 334

		this.doCycle(); // L: 335
	} // L: 336

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 339
		long var2 = Ignored.method6459(); // L: 340
		long var4 = graphicsTickTimes[field191]; // L: 341
		graphicsTickTimes[field191] = var2; // L: 342
		field191 = field191 + 1 & 31; // L: 343
		if (var4 != 0L && var2 > var4) { // L: 344
			int var6 = (int)(var2 - var4); // L: 345
			fps = ((var6 >> 1) + 32000) / var6; // L: 346
		}

		if (++field204 - 1 > 50) { // L: 348
			field204 -= 50; // L: 349
			this.fullRedraw = true; // L: 350
			this.canvas.setSize(class186.canvasWidth, BoundaryObject.canvasHeight); // L: 351
			this.canvas.setVisible(true); // L: 352
			if (var1 == this.frame) { // L: 353
				Insets var7 = this.frame.getInsets(); // L: 354
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 355
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 357
			}
		}

		if (this.isCanvasInvalid) { // L: 359
			this.replaceCanvas();
		}

		this.method594(); // L: 360
		this.draw(this.fullRedraw); // L: 361
		if (this.fullRedraw) { // L: 362
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 363
	} // L: 364

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862280135"
	)
	final void method594() {
		Bounds var1 = this.getFrameContentBounds(); // L: 367
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 368
			this.resizeCanvas(); // L: 369
			this.resizeCanvasNextFrame = false; // L: 370
		}

	} // L: 372

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	final void method482() {
		this.resizeCanvasNextFrame = true; // L: 375
	} // L: 376

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
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

			this.vmethod1151(); // L: 401
		}
	} // L: 402

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264122801"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24240"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "549681271"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665222357"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1887501266"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 488
			if (class131.fontHelvetica13 == null) { // L: 489
				class131.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 490
				class114.loginScreenFontMetrics = this.canvas.getFontMetrics(class131.fontHelvetica13); // L: 491
			}

			if (var3) { // L: 493
				var4.setColor(Color.black); // L: 494
				var4.fillRect(0, 0, class186.canvasWidth, BoundaryObject.canvasHeight); // L: 495
			}

			Color var5 = new Color(140, 17, 17); // L: 497

			try {
				if (class18.field97 == null) { // L: 499
					class18.field97 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class18.field97.getGraphics(); // L: 500
				var6.setColor(var5); // L: 501
				var6.drawRect(0, 0, 303, 33); // L: 502
				var6.fillRect(2, 2, var1 * 3, 30); // L: 503
				var6.setColor(Color.black); // L: 504
				var6.drawRect(1, 1, 301, 31); // L: 505
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 506
				var6.setFont(class131.fontHelvetica13); // L: 507
				var6.setColor(Color.white); // L: 508
				var6.drawString(var2, (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 509
				var4.drawImage(class18.field97, class186.canvasWidth / 2 - 152, BoundaryObject.canvasHeight / 2 - 18, (ImageObserver)null); // L: 510
			} catch (Exception var9) { // L: 512
				int var7 = class186.canvasWidth / 2 - 152; // L: 513
				int var8 = BoundaryObject.canvasHeight / 2 - 18; // L: 514
				var4.setColor(var5); // L: 515
				var4.drawRect(var7, var8, 303, 33); // L: 516
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 517
				var4.setColor(Color.black); // L: 518
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 519
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 520
				var4.setFont(class131.fontHelvetica13); // L: 521
				var4.setColor(Color.white); // L: 522
				var4.drawString(var2, var7 + (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 523
			}
		} catch (Exception var10) { // L: 526
			this.canvas.repaint(); // L: 527
		}

	} // L: 529

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	protected final void method498() {
		class18.field97 = null; // L: 532
		class131.fontHelvetica13 = null; // L: 533
		class114.loginScreenFontMetrics = null; // L: 534
	} // L: 535

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1493080137"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 538
			this.hasErrored = true; // L: 539
			System.out.println("error_game_" + var1); // L: 540

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 542
			} catch (Exception var3) { // L: 544
			}

		}
	} // L: 545

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-9231929"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 548
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "441270158"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 553
		int var2 = Math.max(var1.getWidth(), this.field197); // L: 554
		int var3 = Math.max(var1.getHeight(), this.field195); // L: 555
		if (this.frame != null) { // L: 556
			Insets var4 = this.frame.getInsets(); // L: 557
			var2 -= var4.left + var4.right; // L: 558
			var3 -= var4.top + var4.bottom; // L: 559
		}

		return new Bounds(var2, var3); // L: 561
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 565
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	protected abstract void vmethod1151();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 438
			this.fullRedraw = true; // L: 439
			if (Ignored.method6459() - this.field207 > 1000L) { // L: 440
				Rectangle var2 = var1.getClipBounds(); // L: 441
				if (var2 == null || var2.width >= class186.canvasWidth && var2.height >= BoundaryObject.canvasHeight) {
					this.isCanvasInvalid = true; // L: 442
				}
			}

		}
	} // L: 444

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 425
			stopTimeMs = Ignored.method6459(); // L: 426
			Bounds.method6608(5000L); // L: 427
			this.kill(); // L: 428
		}
	} // L: 429

	public final void windowClosed(WindowEvent var1) {
	} // L: 461

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 469

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 279
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 280
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 281
					String var2 = NPC.javaVersion; // L: 282
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 283
						this.error("wrongjava"); // L: 284
						return; // L: 285
					}

					if (var2.startsWith("1.6.0_")) { // L: 287
						int var3;
						for (var3 = 6; var3 < var2.length() && class277.isDigit(var2.charAt(var3)); ++var3) { // L: 288 289
						}

						String var4 = var2.substring(6, var3); // L: 290
						if (ClanSettings.isNumber(var4) && ClanChannelMember.method2778(var4) < 10) { // L: 291
							this.error("wrongjava"); // L: 292
							return; // L: 293
						}
					}

					fiveOrOne = 5; // L: 296
				}
			}

			this.setFocusCycleRoot(true); // L: 299
			this.addCanvas(); // L: 300
			this.setUp(); // L: 301

			Object var8;
			try {
				var8 = new NanoClock(); // L: 305
			} catch (Throwable var6) { // L: 307
				var8 = new MilliClock(); // L: 308
			}

			class91.clock = (Clock)var8; // L: 311

			while (0L == stopTimeMs || Ignored.method6459() < stopTimeMs) { // L: 312
				gameCyclesToDo = class91.clock.wait(cycleDurationMillis, fiveOrOne); // L: 313

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 314
					this.clientTick();
				}

				this.graphicsTick(); // L: 315
				this.post(this.canvas); // L: 316
			}
		} catch (Exception var7) { // L: 319
			AccessFile.RunException_sendStackTrace((String)null, var7); // L: 320
			this.error("crash"); // L: 321
		}

		this.kill(); // L: 323
	} // L: 324

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 419
			stopTimeMs = Ignored.method6459() + 4000L; // L: 420
		}
	} // L: 421

	public final void update(Graphics var1) {
		this.paint(var1); // L: 433
	} // L: 434

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 448
		this.fullRedraw = true; // L: 449
	} // L: 450

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 454
	} // L: 455

	public final void windowOpened(WindowEvent var1) {
	} // L: 478

	public final void windowActivated(WindowEvent var1) {
	} // L: 458

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 472

	public abstract void init();

	public final void windowIconified(WindowEvent var1) {
	} // L: 475

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 465
	} // L: 466

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 413
			stopTimeMs = 0L; // L: 414
		}
	} // L: 415

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1157157000"
	)
	@Export("getFile")
	public static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(class125.FileSystem_cacheDir, var0); // L: 25
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "15"
	)
	static int method581(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3908
			var3 = class20.Client_plane; // L: 3909
			int var15 = (class340.localPlayer.x >> 7) + class131.baseX; // L: 3910
			int var8 = (class340.localPlayer.y >> 7) + TileItem.baseY; // L: 3911
			WorldMapRectangle.getWorldMap().method6870(var3, var15, var8, true); // L: 3912
			return 1; // L: 3913
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3915
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3916
				String var16 = ""; // L: 3917
				var9 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 3918
				if (var9 != null) { // L: 3919
					var16 = var9.getExternalName(); // L: 3920
				}

				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var16; // L: 3922
				return 1; // L: 3923
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3925
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3926
				WorldMapRectangle.getWorldMap().setCurrentMapAreaId(var3); // L: 3927
				return 1; // L: 3928
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3930
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getZoomLevel(); // L: 3931
				return 1; // L: 3932
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3934
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3935
				WorldMapRectangle.getWorldMap().setZoomPercentage(var3); // L: 3936
				return 1; // L: 3937
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3939
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3940
				return 1; // L: 3941
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3943
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 3944
					WorldMapRectangle.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3945
					return 1; // L: 3946
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3948
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 3949
					WorldMapRectangle.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3950
					return 1; // L: 3951
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3953
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 3954
					WorldMapRectangle.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3955
					return 1; // L: 3956
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3958
					var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 3959
					WorldMapRectangle.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3960
					return 1; // L: 3961
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3963
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayX(); // L: 3964
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayY(); // L: 3965
					return 1; // L: 3966
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3968
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3969
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 3970
						if (var11 == null) { // L: 3971
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3972
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3975
						}

						return 1; // L: 3977
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3979
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3980
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 3981
						if (var11 == null) { // L: 3982
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3983
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3984
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3987
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3988
						}

						return 1; // L: 3990
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3992
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3993
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 3994
						if (var11 == null) { // L: 3995
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3996
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3997
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3998
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3999
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4002
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4003
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4004
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4005
						}

						return 1; // L: 4007
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4009
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4010
						var11 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 4011
						if (var11 == null) { // L: 4012
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4013
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4016
						}

						return 1; // L: 4018
					} else if (var0 == 6615) { // L: 4020
						var14 = WorldMapRectangle.getWorldMap().getDisplayCoord(); // L: 4021
						if (var14 == null) { // L: 4022
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4023
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4024
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var14.x; // L: 4027
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var14.y; // L: 4028
						}

						return 1; // L: 4030
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4032
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().currentMapAreaId(); // L: 4033
						return 1; // L: 4034
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4036
						var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 4037
						var11 = WorldMapRectangle.getWorldMap().getCurrentMapArea(); // L: 4038
						if (var11 == null) { // L: 4039
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4040
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4041
							return 1; // L: 4042
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4044
							if (var12 == null) { // L: 4045
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4046
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4047
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12[0]; // L: 4050
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var12[1]; // L: 4051
							}

							return 1; // L: 4053
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4055
							var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 4056
							var11 = WorldMapRectangle.getWorldMap().getCurrentMapArea(); // L: 4057
							if (var11 == null) { // L: 4058
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4059
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4060
								return 1; // L: 4061
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4063
								if (var5 == null) { // L: 4064
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4065
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.packed(); // L: 4068
								}

								return 1; // L: 4070
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4072
								IsaacCipher.Interpreter_intStackSize -= 2; // L: 4073
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4074
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 4075
								SoundCache.method831(var3, var10, false); // L: 4076
								return 1; // L: 4077
							} else if (var0 == 6620) { // L: 4079
								IsaacCipher.Interpreter_intStackSize -= 2; // L: 4080
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4081
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 4082
								SoundCache.method831(var3, var10, true); // L: 4083
								return 1; // L: 4084
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4086
								IsaacCipher.Interpreter_intStackSize -= 2; // L: 4087
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4088
								var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 4089
								var9 = WorldMapRectangle.getWorldMap().getMapArea(var3); // L: 4090
								if (var9 == null) { // L: 4091
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 4092
									return 1; // L: 4093
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4095
									return 1; // L: 4096
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4098
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayWith(); // L: 4099
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getDisplayHeight(); // L: 4100
								return 1; // L: 4101
							} else if (var0 == 6623) { // L: 4103
								var14 = new Coord(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 4104
								var11 = WorldMapRectangle.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4105
								if (var11 == null) { // L: 4106
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4107
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var11.getId(); // L: 4110
								}

								return 1; // L: 4112
							} else if (var0 == 6624) { // L: 4114
								WorldMapRectangle.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 4115
								return 1; // L: 4116
							} else if (var0 == 6625) { // L: 4118
								WorldMapRectangle.getWorldMap().resetMaxFlashCount(); // L: 4119
								return 1; // L: 4120
							} else if (var0 == 6626) { // L: 4122
								WorldMapRectangle.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 4123
								return 1; // L: 4124
							} else if (var0 == 6627) { // L: 4126
								WorldMapRectangle.getWorldMap().resetCyclesPerFlash(); // L: 4127
								return 1; // L: 4128
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4130
									var13 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 4131
									WorldMapRectangle.getWorldMap().setPerpetualFlash(var13); // L: 4132
									return 1; // L: 4133
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4135
									var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4136
									WorldMapRectangle.getWorldMap().flashElement(var3); // L: 4137
									return 1; // L: 4138
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4140
									var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4141
									WorldMapRectangle.getWorldMap().flashCategory(var3); // L: 4142
									return 1; // L: 4143
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4145
									WorldMapRectangle.getWorldMap().stopCurrentFlashes(); // L: 4146
									return 1; // L: 4147
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4149
									var13 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 4150
									WorldMapRectangle.getWorldMap().setElementsDisabled(var13); // L: 4151
									return 1; // L: 4152
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4154
										IsaacCipher.Interpreter_intStackSize -= 2; // L: 4155
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4156
										var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1; // L: 4157
										WorldMapRectangle.getWorldMap().disableElement(var3, var7); // L: 4158
										return 1; // L: 4159
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4161
										IsaacCipher.Interpreter_intStackSize -= 2; // L: 4162
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4163
										var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1; // L: 4164
										WorldMapRectangle.getWorldMap().setCategoryDisabled(var3, var7); // L: 4165
										return 1; // L: 4166
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4168
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4169
										return 1; // L: 4170
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4172
										var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4173
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4174
										return 1; // L: 4175
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4177
										var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4178
										Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapRectangle.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4179
										return 1; // L: 4180
									} else if (var0 == 6638) { // L: 4182
										IsaacCipher.Interpreter_intStackSize -= 2; // L: 4183
										var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 4184
										var10 = new Coord(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 4185
										var5 = WorldMapRectangle.getWorldMap().method6988(var3, var10); // L: 4186
										if (var5 == null) { // L: 4187
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4188
										} else {
											Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.packed(); // L: 4191
										}

										return 1; // L: 4193
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4195
											var6 = WorldMapRectangle.getWorldMap().iconStart(); // L: 4196
											if (var6 == null) { // L: 4197
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4198
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4199
											} else {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4202
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4203
											}

											return 1; // L: 4205
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4207
											var6 = WorldMapRectangle.getWorldMap().iconNext(); // L: 4208
											if (var6 == null) { // L: 4209
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4210
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4211
											} else {
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4214
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4215
											}

											return 1; // L: 4217
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4219
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4220
												var4 = class78.WorldMapElement_get(var3); // L: 4221
												if (var4.name == null) { // L: 4222
													Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 4223
												} else {
													Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.name; // L: 4226
												}

												return 1; // L: 4228
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4230
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4231
												var4 = class78.WorldMapElement_get(var3); // L: 4232
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.textSize; // L: 4233
												return 1; // L: 4234
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4236
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4237
												var4 = class78.WorldMapElement_get(var3); // L: 4238
												if (var4 == null) { // L: 4239
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4240
												} else {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.category; // L: 4243
												}

												return 1; // L: 4245
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4247
												var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 4248
												var4 = class78.WorldMapElement_get(var3); // L: 4249
												if (var4 == null) { // L: 4250
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4251
												} else {
													Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4254
												}

												return 1; // L: 4256
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4258
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.mapElement; // L: 4259
												return 1; // L: 4260
											} else if (var0 == 6698) { // L: 4262
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.coord1.packed(); // L: 4263
												return 1; // L: 4264
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4266
												Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = FileSystem.worldMapEvent.coord2.packed(); // L: 4267
												return 1; // L: 4268
											} else {
												return 2; // L: 4270
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
