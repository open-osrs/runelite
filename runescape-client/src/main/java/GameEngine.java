import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
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

@ObfuscatedName("aj")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1340668149
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 5444631392140601951L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("a")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1364048335
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -443642851
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -266522013
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2010044877
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("t")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("n")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ap")
	static Image field201;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1165072175
	)
	static int field202;
	@ObfuscatedName("al")
	protected static String field206;
	@ObfuscatedName("ah")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -2931367862207381165L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -8675189738146457979L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -154619629
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("m")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1099544145
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1288492019
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -278167239
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1947120919
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1170303839
	)
	int field194;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 184457781
	)
	int field195;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1623859667
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 597778211
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("aj")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ae")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("az")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("au")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ak")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 4087711299063743833L
	)
	volatile long field205;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("aw")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field202 = 500; // L: 73
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
		this.field205 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		PcmPlayer.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2144318891"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method425();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-75"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				class241.method4815(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;",
		garbageValue = "709191033"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2000416889"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "103"
	)
	protected void method429(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-80802515"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 131
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 132
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 133
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 138
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 139
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 140
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 141
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 142
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 143
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 146
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 147
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 148
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 149
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 150
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 151
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 152
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 153
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 154
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 155
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 156
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 157
		}

		java.awt.Canvas var1 = this.canvas; // L: 160
		var1.setFocusTraversalKeysEnabled(false); // L: 162
		var1.addKeyListener(KeyHandler.KeyHandler_instance); // L: 163
		var1.addFocusListener(KeyHandler.KeyHandler_instance); // L: 164
	} // L: 166

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	protected final void method415() {
		InvDefinition.method3264(this.canvas); // L: 169
	} // L: 170

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 173
		if (var1 != null) { // L: 174
			Bounds var2 = this.getFrameContentBounds(); // L: 175
			this.contentWidth = Math.max(var2.highX, this.field194); // L: 176
			this.contentHeight = Math.max(var2.highY, this.field195); // L: 177
			if (this.contentWidth <= 0) { // L: 178
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 179
				this.contentHeight = 1;
			}

			GraphicsObject.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 180
			class433.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 181
			this.canvasX = (this.contentWidth - GraphicsObject.canvasWidth) / 2; // L: 182
			this.canvasY = 0; // L: 183
			this.canvas.setSize(GraphicsObject.canvasWidth, class433.canvasHeight); // L: 184
			DevicePcmPlayerProvider.rasterProvider = new RasterProvider(GraphicsObject.canvasWidth, class433.canvasHeight, this.canvas); // L: 185
			if (var1 == this.frame) { // L: 186
				Insets var3 = this.frame.getInsets(); // L: 187
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 188
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 190
			}

			this.fullRedraw = true; // L: 191
			this.resizeGame(); // L: 192
		}
	} // L: 193

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1437501286"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1331148766"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 198
		int var2 = this.canvasY; // L: 199
		int var3 = this.contentWidth - GraphicsObject.canvasWidth - var1; // L: 200
		int var4 = this.contentHeight - class433.canvasHeight - var2; // L: 201
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 202
			try {
				Container var5 = this.container(); // L: 204
				int var6 = 0; // L: 205
				int var7 = 0; // L: 206
				if (var5 == this.frame) { // L: 207
					Insets var8 = this.frame.getInsets(); // L: 208
					var6 = var8.left; // L: 209
					var7 = var8.top; // L: 210
				}

				Graphics var10 = var5.getGraphics(); // L: 212
				var10.setColor(Color.black); // L: 213
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 214
				}

				if (var2 > 0) { // L: 215
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 216
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 217
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 219
			}
		}

	} // L: 221

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 224
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 226
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 227
		KeyHandler.field135 = -1; // L: 228
		UserList.method6543(this.canvas); // L: 230
		if (this.mouseWheelHandler != null) { // L: 231
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 232
		java.awt.Canvas var2 = this.canvas; // L: 233
		var2.setFocusTraversalKeysEnabled(false); // L: 235
		var2.addKeyListener(KeyHandler.KeyHandler_instance); // L: 236
		var2.addFocusListener(KeyHandler.KeyHandler_instance); // L: 237
		InvDefinition.method3264(this.canvas); // L: 239
		if (this.mouseWheelHandler != null) { // L: 240
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method425(); // L: 241
	} // L: 242

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1913355803"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) { // L: 246
				++GameEngine_redundantStartThreadCount; // L: 247
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 248
					this.error("alreadyloaded"); // L: 249
					return; // L: 250
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 252
				return; // L: 253
			}

			gameEngine = this; // L: 255
			GraphicsObject.canvasWidth = var1; // L: 256
			class433.canvasHeight = var2; // L: 257
			class385.RunException_revision = var3; // L: 258
			RunException.RunException_applet = this; // L: 259
			if (taskHandler == null) { // L: 260
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 261
		} catch (Exception var5) { // L: 263
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var5); // L: 264
			this.error("crash"); // L: 265
		}

	} // L: 267

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1076329535"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 270
		if (this.canvas != null) { // L: 271
			this.canvas.removeFocusListener(this); // L: 272
			var1.remove(this.canvas); // L: 273
		}

		GraphicsObject.canvasWidth = Math.max(var1.getWidth(), this.field194); // L: 275
		class433.canvasHeight = Math.max(var1.getHeight(), this.field195); // L: 276
		Insets var2;
		if (this.frame != null) { // L: 277
			var2 = this.frame.getInsets(); // L: 278
			GraphicsObject.canvasWidth -= var2.left + var2.right; // L: 279
			class433.canvasHeight -= var2.bottom + var2.top; // L: 280
		}

		this.canvas = new Canvas(this); // L: 282
		var1.setBackground(Color.BLACK); // L: 283
		var1.setLayout((LayoutManager)null); // L: 284
		var1.add(this.canvas); // L: 285
		this.canvas.setSize(GraphicsObject.canvasWidth, class433.canvasHeight); // L: 286
		this.canvas.setVisible(true); // L: 287
		this.canvas.setBackground(Color.BLACK); // L: 288
		if (var1 == this.frame) { // L: 289
			var2 = this.frame.getInsets(); // L: 290
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 291
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 293
		}

		this.canvas.addFocusListener(this); // L: 294
		this.canvas.requestFocus(); // L: 295
		this.fullRedraw = true; // L: 296
		if (DevicePcmPlayerProvider.rasterProvider != null && GraphicsObject.canvasWidth == DevicePcmPlayerProvider.rasterProvider.width && class433.canvasHeight == DevicePcmPlayerProvider.rasterProvider.height) { // L: 297
			((RasterProvider)DevicePcmPlayerProvider.rasterProvider).setComponent(this.canvas); // L: 298
			DevicePcmPlayerProvider.rasterProvider.drawFull(0, 0); // L: 299
		} else {
			DevicePcmPlayerProvider.rasterProvider = new RasterProvider(GraphicsObject.canvasWidth, class433.canvasHeight, this.canvas); // L: 302
		}

		this.isCanvasInvalid = false; // L: 304
		this.field205 = class113.method2624(); // L: 305
	} // L: 306

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-35604355"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 309
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 310
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 311
				if (var1.endsWith("127.0.0.1")) { // L: 312
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 313
					}

					if (var1.endsWith("192.168.1.")) { // L: 314
						return true;
					} else {
						this.error("invalidhost"); // L: 315
						return false; // L: 316
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1177653109"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class113.method2624(); // L: 360
		long var3 = clientTickTimes[PlayerType.field3985]; // L: 361
		clientTickTimes[PlayerType.field3985] = var1; // L: 362
		PlayerType.field3985 = PlayerType.field3985 + 1 & 31; // L: 363
		if (0L != var3 && var1 > var3) { // L: 364
		}

		synchronized(this) { // L: 365
			WorldMapArea.hasFocus = volatileFocus; // L: 366
		} // L: 367

		this.doCycle(); // L: 368
	} // L: 369

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1883267877"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 372
		long var2 = class113.method2624(); // L: 373
		long var4 = graphicsTickTimes[ScriptFrame.field449]; // L: 374
		graphicsTickTimes[ScriptFrame.field449] = var2; // L: 375
		ScriptFrame.field449 = ScriptFrame.field449 + 1 & 31; // L: 376
		if (0L != var4 && var2 > var4) { // L: 377
			int var6 = (int)(var2 - var4); // L: 378
			fps = ((var6 >> 1) + 32000) / var6; // L: 379
		}

		if (++field202 - 1 > 50) { // L: 381
			field202 -= 50; // L: 382
			this.fullRedraw = true; // L: 383
			this.canvas.setSize(GraphicsObject.canvasWidth, class433.canvasHeight); // L: 384
			this.canvas.setVisible(true); // L: 385
			if (var1 == this.frame) { // L: 386
				Insets var7 = this.frame.getInsets(); // L: 387
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 388
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 390
			}
		}

		if (this.isCanvasInvalid) { // L: 392
			this.replaceCanvas();
		}

		this.method424(); // L: 393
		this.draw(this.fullRedraw); // L: 394
		if (this.fullRedraw) { // L: 395
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 396
	} // L: 397

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	final void method424() {
		Bounds var1 = this.getFrameContentBounds(); // L: 400
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 401
			this.resizeCanvas(); // L: 402
			this.resizeCanvasNextFrame = false; // L: 403
		}

	} // L: 405

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1201403905"
	)
	final void method425() {
		this.resizeCanvasNextFrame = true; // L: 408
	} // L: 409

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 412
			isKilled = true; // L: 413

			try {
				this.canvas.removeFocusListener(this); // L: 415
			} catch (Exception var5) { // L: 417
			}

			try {
				this.kill0(); // L: 419
			} catch (Exception var4) { // L: 421
			}

			if (this.frame != null) { // L: 422
				try {
					System.exit(0); // L: 424
				} catch (Throwable var3) { // L: 426
				}
			}

			if (taskHandler != null) { // L: 428
				try {
					taskHandler.close(); // L: 430
				} catch (Exception var2) { // L: 432
				}
			}

			this.vmethod1448(); // L: 434
		}
	} // L: 435

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1311"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-772264838"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-375798495"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "30"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 521
			if (class119.fontHelvetica13 == null) { // L: 522
				class119.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 523
				class135.loginScreenFontMetrics = this.canvas.getFontMetrics(class119.fontHelvetica13); // L: 524
			}

			if (var3) { // L: 526
				var4.setColor(Color.black); // L: 527
				var4.fillRect(0, 0, GraphicsObject.canvasWidth, class433.canvasHeight); // L: 528
			}

			Color var5 = new Color(140, 17, 17); // L: 530

			try {
				if (field201 == null) { // L: 532
					field201 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field201.getGraphics(); // L: 533
				var6.setColor(var5); // L: 534
				var6.drawRect(0, 0, 303, 33); // L: 535
				var6.fillRect(2, 2, var1 * 3, 30); // L: 536
				var6.setColor(Color.black); // L: 537
				var6.drawRect(1, 1, 301, 31); // L: 538
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 539
				var6.setFont(class119.fontHelvetica13); // L: 540
				var6.setColor(Color.white); // L: 541
				var6.drawString(var2, (304 - class135.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 542
				var4.drawImage(field201, GraphicsObject.canvasWidth / 2 - 152, class433.canvasHeight / 2 - 18, (ImageObserver)null); // L: 543
			} catch (Exception var9) { // L: 545
				int var7 = GraphicsObject.canvasWidth / 2 - 152; // L: 546
				int var8 = class433.canvasHeight / 2 - 18; // L: 547
				var4.setColor(var5); // L: 548
				var4.drawRect(var7, var8, 303, 33); // L: 549
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 550
				var4.setColor(Color.black); // L: 551
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 552
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 553
				var4.setFont(class119.fontHelvetica13); // L: 554
				var4.setColor(Color.white); // L: 555
				var4.drawString(var2, var7 + (304 - class135.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 556
			}
		} catch (Exception var10) { // L: 559
			this.canvas.repaint(); // L: 560
		}

	} // L: 562

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	protected final void method438() {
		field201 = null; // L: 565
		class119.fontHelvetica13 = null; // L: 566
		class135.loginScreenFontMetrics = null; // L: 567
	} // L: 568

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1946007584"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 571
			this.hasErrored = true; // L: 572
			System.out.println("error_game_" + var1); // L: 573

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 575
			} catch (Exception var3) { // L: 577
			}

		}
	} // L: 578

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "116"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 581
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lne;",
		garbageValue = "-836413334"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 586
		int var2 = Math.max(var1.getWidth(), this.field194); // L: 587
		int var3 = Math.max(var1.getHeight(), this.field195); // L: 588
		if (this.frame != null) { // L: 589
			Insets var4 = this.frame.getInsets(); // L: 590
			var2 -= var4.right + var4.left; // L: 591
			var3 -= var4.bottom + var4.top; // L: 592
		}

		return new Bounds(var2, var3); // L: 594
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2076672136"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 598
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	protected abstract void vmethod1448();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 458
			stopTimeMs = class113.method2624(); // L: 459
			class241.method4815(5000L); // L: 460
			this.kill(); // L: 461
		}
	} // L: 462

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 471
			this.fullRedraw = true; // L: 472
			if (class113.method2624() - this.field205 > 1000L) { // L: 473
				Rectangle var2 = var1.getClipBounds(); // L: 474
				if (var2 == null || var2.width >= GraphicsObject.canvasWidth && var2.height >= class433.canvasHeight) {
					this.isCanvasInvalid = true; // L: 475
				}
			}

		}
	} // L: 477

	public final void windowActivated(WindowEvent var1) {
	} // L: 491

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 321
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 322
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 323
					String var2 = TaskHandler.javaVersion; // L: 324
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 325
						this.error("wrongjava"); // L: 326
						return; // L: 327
					}

					if (var2.startsWith("1.6.0_")) { // L: 329
						int var3;
						for (var3 = 6; var3 < var2.length() && Coord.isDigit(var2.charAt(var3)); ++var3) { // L: 330 331
						}

						String var4 = var2.substring(6, var3); // L: 332
						if (NetFileRequest.isNumber(var4) && class92.method2373(var4) < 10) { // L: 333
							this.error("wrongjava"); // L: 334
							return; // L: 335
						}
					}

					fiveOrOne = 5; // L: 338
				}
			}

			this.setFocusCycleRoot(true); // L: 341
			this.addCanvas(); // L: 342
			this.setUp(); // L: 343
			UserComparator5.clock = class221.method4408(); // L: 344

			while (stopTimeMs == 0L || class113.method2624() < stopTimeMs) { // L: 345
				gameCyclesToDo = UserComparator5.clock.wait(cycleDurationMillis, fiveOrOne); // L: 346

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 347
					this.clientTick();
				}

				this.graphicsTick(); // L: 348
				this.post(this.canvas); // L: 349
			}
		} catch (Exception var6) { // L: 352
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var6); // L: 353
			this.error("crash"); // L: 354
		}

		this.kill(); // L: 356
	} // L: 357

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 452
			stopTimeMs = class113.method2624() + 4000L; // L: 453
		}
	} // L: 454

	public final void update(Graphics var1) {
		this.paint(var1); // L: 466
	} // L: 467

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 481
		this.fullRedraw = true; // L: 482
	} // L: 483

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 498
	} // L: 499

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 502

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 505

	public final void windowOpened(WindowEvent var1) {
	} // L: 511

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 487
	} // L: 488

	public final void windowClosed(WindowEvent var1) {
	} // L: 494

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 446
			stopTimeMs = 0L; // L: 447
		}
	} // L: 448

	public final void windowIconified(WindowEvent var1) {
	} // L: 508

	public abstract void init();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;Llp;I)V",
		garbageValue = "-1740830707"
	)
	public static void method505(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		ModelData0.field2654 = var1; // L: 47
		class1.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-24396542"
	)
	public static int method555(int var0) {
		return class402.field4444[var0 & 16383]; // L: 33
	}
}
