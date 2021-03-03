import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("n")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("v")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("e")
	static byte[][][] field2045;
	@ObfuscatedName("a")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("y")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("h")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1153020803"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join(); // L: 40
		} catch (InterruptedException var3) { // L: 42
		}

	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lfl;",
		garbageValue = "1365505014"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lfl;",
		garbageValue = "-1223563808"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfl;",
		garbageValue = "-1832147507"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) { // L: 48
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) { // L: 51
						var1 = this.current; // L: 52
						this.current = this.current.next; // L: 53
						if (this.current == null) { // L: 54
							this.task = null;
						}
						break;
					}

					try {
						this.wait(); // L: 58
					} catch (InterruptedException var8) { // L: 60
					}
				}
			}

			try {
				int var5 = var1.type; // L: 64
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3; // L: 73
				} else if (var5 == 4) { // L: 75
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream()); // L: 76
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lhz;I[B[BI)V",
		garbageValue = "-944892435"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2668 == null) { // L: 905
			if (var2 == null) { // L: 906
				return; // L: 912
			}

			var0.field2668 = new byte[11][]; // L: 907
			var0.field2669 = new byte[11][]; // L: 908
			var0.field2686 = new int[11]; // L: 909
			var0.field2599 = new int[11]; // L: 910
		}

		var0.field2668[var1] = var2; // L: 914
		if (var2 != null) {
			var0.field2667 = true; // L: 915
		} else {
			var0.field2667 = false; // L: 917

			for (int var4 = 0; var4 < var0.field2668.length; ++var4) { // L: 918
				if (var0.field2668[var4] != null) { // L: 919
					var0.field2667 = true; // L: 920
					break;
				}
			}
		}

		var0.field2669[var1] = var3; // L: 925
	} // L: 926

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Llm;",
		garbageValue = "1451657661"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 345
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 346
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38); // L: 347
		SpritePixels var8;
		if (!var5) { // L: 349
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 350
			if (var8 != null) { // L: 351
				return var8;
			}
		}

		ItemComposition var9 = class281.ItemDefinition_get(var0); // L: 353
		if (var1 > 1 && var9.countobj != null) { // L: 354
			int var10 = -1; // L: 355

			for (int var11 = 0; var11 < 10; ++var11) { // L: 356
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 357
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 359
				var9 = class281.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 361
		if (var19 == null) { // L: 362
			return null;
		} else {
			SpritePixels var20 = null; // L: 363
			if (var9.noteTemplate != -1) { // L: 364
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 365
				if (var20 == null) { // L: 366
					return null;
				}
			} else if (var9.notedId != -1) { // L: 368
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 369
				if (var20 == null) { // L: 370
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 372
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 373
				if (var20 == null) { // L: 374
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 376
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 377
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 378
			int[] var15 = new int[4]; // L: 379
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 380
			var8 = new SpritePixels(36, 32); // L: 381
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 382
			Rasterizer2D.Rasterizer2D_clear(); // L: 383
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 384
			Rasterizer3D.method3169(16, 16); // L: 385
			Rasterizer3D.field1777 = false; // L: 386
			if (var9.placeholderTemplate != -1) { // L: 387
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 388
			if (var5) { // L: 389
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) { // L: 390
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 391
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 392
			var19.calculateBoundsCylinder(); // L: 393
			var19.method3106(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 394
			if (var9.notedId != -1) { // L: 395
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 396
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 397
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 398
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 399
			if (var9.noteTemplate != -1) { // L: 400
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 401
				ItemComposition.ItemDefinition_fontPlain11.draw(SoundCache.inventoryQuantityFormat(var1), 0, 9, 16776960, 1); // L: 402
			}

			if (!var5) { // L: 404
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 405
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 406
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 407
			Rasterizer3D.field1777 = true; // L: 408
			return var8; // L: 409
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1388427542"
	)
	static final boolean method3673(int var0, int var1) {
		ObjectComposition var2 = WorldMapAreaData.getObjectDefinition(var0); // L: 595
		if (var1 == 11) { // L: 596
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 597
		}

		return var2.method4806(var1); // L: 598
	}
}
