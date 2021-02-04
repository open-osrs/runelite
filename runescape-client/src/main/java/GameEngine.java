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

@ObfuscatedName("bd")
@Implements("GameShell")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("gameShell")
	static GameEngine gameEngine;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 548418733
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -299301004563523829L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("n")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1522252181
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1346634793
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1771447701
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("i")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("a")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static Bounds field481;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 475129239
	)
	static int field471;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 2878224535020418697L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 6896252381737928241L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("p")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -421640867
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 654050171
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -153393077
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1458839985
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2092282905
	)
	int field464;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1103282921
	)
	int field467;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1546847555
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1533275397
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("as")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ae")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ac")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("aq")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ah")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 8455429718960757091L
	)
	volatile long field472;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("aw")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ap")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameShell_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field471 = 500; // L: 73
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
		this.field472 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		FaceNormal.method3344(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-387026818"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method985();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "136428180"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				class236.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;",
		garbageValue = "1655914874"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636889033"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1432423267"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "639866181"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		WorldMapIcon_1.method354(); // L: 127
		Messages.method2275(this.canvas); // L: 128
	} // L: 129

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas; // L: 132
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 134
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 135
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 136
	} // L: 138

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1383107169"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 141
		if (var1 != null) { // L: 142
			Bounds var2 = this.getFrameContentBounds(); // L: 143
			this.contentWidth = Math.max(var2.highX, this.field464); // L: 144
			this.contentHeight = Math.max(var2.highY, this.field467); // L: 145
			if (this.contentWidth <= 0) { // L: 146
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 147
				this.contentHeight = 1;
			}

			IgnoreList.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 148
			ModelData0.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 149
			this.canvasX = (this.contentWidth - IgnoreList.canvasWidth) / 2; // L: 150
			this.canvasY = 0; // L: 151
			this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight); // L: 152
			WorldMapIcon_0.rasterProvider = new RasterProvider(IgnoreList.canvasWidth, ModelData0.canvasHeight, this.canvas); // L: 153
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "312942940"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111621500"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 166
		int var2 = this.canvasY; // L: 167
		int var3 = this.contentWidth - IgnoreList.canvasWidth - var1; // L: 168
		int var4 = this.contentHeight - ModelData0.canvasHeight - var2; // L: 169
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2006885359"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 192
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 194
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 195
		KeyHandler.field410 = -1; // L: 196
		java.awt.Canvas var2 = this.canvas; // L: 198
		var2.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 200
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 201
		var2.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 202
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 203
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas); // L: 205
		}

		this.addCanvas(); // L: 206
		Messages.method2275(this.canvas); // L: 207
		java.awt.Canvas var3 = this.canvas; // L: 208
		var3.addMouseListener(MouseHandler.MouseHandler_instance); // L: 210
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 211
		var3.addFocusListener(MouseHandler.MouseHandler_instance); // L: 212
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas); // L: 214
		}

		this.method985(); // L: 215
	} // L: 216

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-108"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 220
				++GameShell_redundantStartThreadCount; // L: 221
				if (GameShell_redundantStartThreadCount >= 3) { // L: 222
					this.error("alreadyloaded"); // L: 223
					return; // L: 224
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 226
				return; // L: 227
			}

			gameEngine = this; // L: 229
			IgnoreList.canvasWidth = var1; // L: 230
			ModelData0.canvasHeight = var2; // L: 231
			RunException.RunException_revision = var3; // L: 232
			RunException.RunException_applet = this; // L: 233
			if (taskHandler == null) { // L: 234
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 235
		} catch (Exception var5) { // L: 237
			PlayerComposition.RunException_sendStackTrace((String)null, var5); // L: 238
			this.error("crash"); // L: 239
		}

	} // L: 241

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254255664"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 244
		if (this.canvas != null) { // L: 245
			this.canvas.removeFocusListener(this); // L: 246
			var1.remove(this.canvas); // L: 247
		}

		IgnoreList.canvasWidth = Math.max(var1.getWidth(), this.field464); // L: 249
		ModelData0.canvasHeight = Math.max(var1.getHeight(), this.field467); // L: 250
		Insets var2;
		if (this.frame != null) { // L: 251
			var2 = this.frame.getInsets(); // L: 252
			IgnoreList.canvasWidth -= var2.left + var2.right; // L: 253
			ModelData0.canvasHeight -= var2.bottom + var2.top; // L: 254
		}

		this.canvas = new Canvas(this); // L: 256
		var1.setBackground(Color.BLACK); // L: 257
		var1.setLayout((LayoutManager)null); // L: 258
		var1.add(this.canvas); // L: 259
		this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight); // L: 260
		this.canvas.setVisible(true); // L: 261
		this.canvas.setBackground(Color.BLACK); // L: 262
		if (var1 == this.frame) { // L: 263
			var2 = this.frame.getInsets(); // L: 264
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 265
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 267
		}

		this.canvas.addFocusListener(this); // L: 268
		this.canvas.requestFocus(); // L: 269
		this.fullRedraw = true; // L: 270
		if (WorldMapIcon_0.rasterProvider != null && IgnoreList.canvasWidth == WorldMapIcon_0.rasterProvider.width && ModelData0.canvasHeight == WorldMapIcon_0.rasterProvider.height) { // L: 271
			((RasterProvider)WorldMapIcon_0.rasterProvider).setComponent(this.canvas); // L: 272
			WorldMapIcon_0.rasterProvider.drawFull(0, 0); // L: 273
		} else {
			WorldMapIcon_0.rasterProvider = new RasterProvider(IgnoreList.canvasWidth, ModelData0.canvasHeight, this.canvas); // L: 276
		}

		this.isCanvasInvalid = false; // L: 278
		this.field472 = class298.currentTimeMillis(); // L: 279
	} // L: 280

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-206373344"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 283
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 284
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 285
				if (var1.endsWith("127.0.0.1")) { // L: 286
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 287
					}

					if (var1.endsWith("192.168.1.")) { // L: 288
						return true;
					} else {
						this.error("invalidhost"); // L: 289
						return false; // L: 290
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "176376535"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class298.currentTimeMillis(); // L: 343
		long var3 = clientTickTimes[Varcs.clientTickTimeIdx]; // L: 344
		clientTickTimes[Varcs.clientTickTimeIdx] = var1; // L: 345
		Varcs.clientTickTimeIdx = Varcs.clientTickTimeIdx + 1 & 31; // L: 346
		if (var3 != 0L && var1 > var3) { // L: 347
		}

		synchronized(this) { // L: 348
			ScriptEvent.hasFocus = volatileFocus; // L: 349
		} // L: 350

		this.doCycle(); // L: 351
	} // L: 352

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055112654"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 355
		long var2 = class298.currentTimeMillis(); // L: 356
		long var4 = graphicsTickTimes[PacketWriter.graphicsTickTimeIdx]; // L: 357
		graphicsTickTimes[PacketWriter.graphicsTickTimeIdx] = var2; // L: 358
		PacketWriter.graphicsTickTimeIdx = PacketWriter.graphicsTickTimeIdx + 1 & 31; // L: 359
		if (0L != var4 && var2 > var4) { // L: 360
			int var6 = (int)(var2 - var4); // L: 361
			fps = ((var6 >> 1) + 32000) / var6; // L: 362
		}

		if (++field471 - 1 > 50) { // L: 364
			field471 -= 50; // L: 365
			this.fullRedraw = true; // L: 366
			this.canvas.setSize(IgnoreList.canvasWidth, ModelData0.canvasHeight); // L: 367
			this.canvas.setVisible(true); // L: 368
			if (var1 == this.frame) { // L: 369
				Insets var7 = this.frame.getInsets(); // L: 370
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 371
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 373
			}
		}

		if (this.isCanvasInvalid) { // L: 375
			this.replaceCanvas();
		}

		this.method984(); // L: 376
		this.draw(this.fullRedraw); // L: 377
		if (this.fullRedraw) { // L: 378
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 379
	} // L: 380

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	final void method984() {
		Bounds var1 = this.getFrameContentBounds(); // L: 383
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 384
			this.resizeCanvas(); // L: 385
			this.resizeCanvasNextFrame = false; // L: 386
		}

	} // L: 388

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "287076222"
	)
	final void method985() {
		this.resizeCanvasNextFrame = true; // L: 391
	} // L: 392

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "646391246"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 395
			isKilled = true; // L: 396

			try {
				this.canvas.removeFocusListener(this); // L: 398
			} catch (Exception var5) { // L: 400
			}

			try {
				this.kill0(); // L: 402
			} catch (Exception var4) { // L: 404
			}

			if (this.frame != null) { // L: 405
				try {
					System.exit(0); // L: 407
				} catch (Throwable var3) { // L: 409
				}
			}

			if (taskHandler != null) { // L: 411
				try {
					taskHandler.close(); // L: 413
				} catch (Exception var2) { // L: 415
				}
			}

			this.vmethod1777(); // L: 417
		}
	} // L: 418

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1376035132"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-20163413"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6923156"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1645109532"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 485
			if (GrandExchangeEvent.fontHelvetica13 == null) { // L: 486
				GrandExchangeEvent.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 487
				ViewportMouse.loginScreenFontMetrics = this.canvas.getFontMetrics(GrandExchangeEvent.fontHelvetica13); // L: 488
			}

			if (var3) { // L: 490
				var4.setColor(Color.black); // L: 491
				var4.fillRect(0, 0, IgnoreList.canvasWidth, ModelData0.canvasHeight); // L: 492
			}

			Color var5 = new Color(140, 17, 17); // L: 494

			try {
				if (Canvas.field425 == null) { // L: 496
					Canvas.field425 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = Canvas.field425.getGraphics(); // L: 497
				var6.setColor(var5); // L: 498
				var6.drawRect(0, 0, 303, 33); // L: 499
				var6.fillRect(2, 2, var1 * 3, 30); // L: 500
				var6.setColor(Color.black); // L: 501
				var6.drawRect(1, 1, 301, 31); // L: 502
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 503
				var6.setFont(GrandExchangeEvent.fontHelvetica13); // L: 504
				var6.setColor(Color.white); // L: 505
				var6.drawString(var2, (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 506
				var4.drawImage(Canvas.field425, IgnoreList.canvasWidth / 2 - 152, ModelData0.canvasHeight / 2 - 18, (ImageObserver)null); // L: 507
			} catch (Exception var9) { // L: 509
				int var7 = IgnoreList.canvasWidth / 2 - 152; // L: 510
				int var8 = ModelData0.canvasHeight / 2 - 18; // L: 511
				var4.setColor(var5); // L: 512
				var4.drawRect(var7, var8, 303, 33); // L: 513
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 514
				var4.setColor(Color.black); // L: 515
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 516
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 517
				var4.setFont(GrandExchangeEvent.fontHelvetica13); // L: 518
				var4.setColor(Color.white); // L: 519
				var4.drawString(var2, var7 + (304 - ViewportMouse.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 520
			}
		} catch (Exception var10) { // L: 523
			this.canvas.repaint(); // L: 524
		}

	} // L: 526

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779228195"
	)
	protected final void method1050() {
		Canvas.field425 = null; // L: 529
		GrandExchangeEvent.fontHelvetica13 = null; // L: 530
		ViewportMouse.loginScreenFontMetrics = null; // L: 531
	} // L: 532

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2134570011"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 535
			this.hasErrored = true; // L: 536
			System.out.println("error_game_" + var1); // L: 537

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 539
			} catch (Exception var3) { // L: 541
			}

		}
	} // L: 542

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/Container;",
		garbageValue = "-16488"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 545
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "-2080787573"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 550
		int var2 = Math.max(var1.getWidth(), this.field464); // L: 551
		int var3 = Math.max(var1.getHeight(), this.field467); // L: 552
		if (this.frame != null) { // L: 553
			Insets var4 = this.frame.getInsets(); // L: 554
			var2 -= var4.right + var4.left; // L: 555
			var3 -= var4.bottom + var4.top; // L: 556
		}

		return new Bounds(var2, var3); // L: 558
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-418919904"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 562
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	protected abstract void vmethod1777();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 449
			this.fullRedraw = true; // L: 450
			if (class298.currentTimeMillis() - this.field472 > 1000L) { // L: 451
				Rectangle var2 = var1.getClipBounds(); // L: 452
				if (var2 == null || var2.width >= IgnoreList.canvasWidth && var2.height >= ModelData0.canvasHeight) {
					this.isCanvasInvalid = true; // L: 453
				}
			}

		}
	} // L: 455

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 438
			stopTimeMs = class298.currentTimeMillis(); // L: 439
			class236.sleepExact(5000L); // L: 440
			this.kill(); // L: 441
		}
	} // L: 442

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 458
		this.fullRedraw = true; // L: 459
	} // L: 460

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 463
	} // L: 464

	public final void windowClosed(WindowEvent var1) {
	} // L: 467

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 470
	} // L: 471

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 473

	public final void windowIconified(WindowEvent var1) {
	} // L: 475

	public final void windowOpened(WindowEvent var1) {
	} // L: 476

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 433
			stopTimeMs = class298.currentTimeMillis() + 4000L; // L: 434
		}
	} // L: 435

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 428
			stopTimeMs = 0L; // L: 429
		}
	} // L: 430

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 295
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 296
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 297
					String var2 = TaskHandler.javaVersion; // L: 298
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 299
						this.error("wrongjava"); // L: 300
						return; // L: 301
					}

					if (var2.startsWith("1.6.0_")) { // L: 303
						int var3;
						for (var3 = 6; var3 < var2.length() && class39.isDigit(var2.charAt(var3)); ++var3) { // L: 304 305
						}

						String var4 = var2.substring(6, var3); // L: 306
						if (ArchiveDiskAction.isNumber(var4) && class279.parseInt(var4) < 10) { // L: 307
							this.error("wrongjava"); // L: 308
							return; // L: 309
						}
					}

					fiveOrOne = 5; // L: 312
				}
			}

			this.setFocusCycleRoot(true); // L: 315
			this.addCanvas(); // L: 316
			this.setUp(); // L: 317

			Object var8;
			try {
				var8 = new NanoClock(); // L: 321
			} catch (Throwable var6) { // L: 323
				var8 = new MilliClock(); // L: 324
			}

			class225.clock = (Clock)var8; // L: 327

			while (stopTimeMs == 0L || class298.currentTimeMillis() < stopTimeMs) { // L: 328
				class8.gameCyclesToDo = class225.clock.wait(cycleDurationMillis, fiveOrOne); // L: 329

				for (int var5 = 0; var5 < class8.gameCyclesToDo; ++var5) { // L: 330
					this.clientTick();
				}

				this.graphicsTick(); // L: 331
				this.post(this.canvas); // L: 332
			}
		} catch (Exception var7) { // L: 335
			PlayerComposition.RunException_sendStackTrace((String)null, var7); // L: 336
			this.error("crash"); // L: 337
		}

		this.kill(); // L: 339
	} // L: 340

	public final void windowActivated(WindowEvent var1) {
	} // L: 466

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 474

	public final void update(Graphics var1) {
		this.paint(var1); // L: 445
	} // L: 446

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1024924303"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1483
		Login.Login_response2 = var1; // L: 1484
		Login.Login_response3 = var2; // L: 1485
	} // L: 1486
}
