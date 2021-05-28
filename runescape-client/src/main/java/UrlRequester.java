import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("do")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("e")
	static int[][][] field1419;
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("n")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("f")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Ldf;",
		garbageValue = "-1811269491"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) { // L: 72
			this.requests.add(var2); // L: 73
			this.notify(); // L: 74
			return var2; // L: 76
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279229859"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 80

		try {
			synchronized(this) { // L: 82
				this.notify(); // L: 83
			} // L: 84

			this.thread.join(); // L: 85
		} catch (InterruptedException var4) { // L: 87
		}

	} // L: 88

	public void run() {
		while (!this.isClosed) { // L: 24
			try {
				UrlRequest var1;
				synchronized(this) { // L: 27
					var1 = (UrlRequest)this.requests.poll(); // L: 28
					if (var1 == null) { // L: 29
						try {
							this.wait(); // L: 31
						} catch (InterruptedException var13) { // L: 33
						}
						continue;
					}
				}

				DataInputStream var2 = null; // L: 37
				URLConnection var3 = null; // L: 38

				try {
					var3 = var1.url.openConnection(); // L: 40
					var3.setConnectTimeout(5000); // L: 41
					var3.setReadTimeout(5000); // L: 42
					var3.setUseCaches(false); // L: 43
					var3.setRequestProperty("Connection", "close"); // L: 44
					int var7 = var3.getContentLength(); // L: 45
					if (var7 >= 0) { // L: 46
						byte[] var5 = new byte[var7]; // L: 47
						var2 = new DataInputStream(var3.getInputStream()); // L: 48
						var2.readFully(var5); // L: 49
						var1.response0 = var5; // L: 50
					}

					var1.isDone0 = true; // L: 52
				} catch (IOException var14) { // L: 54
					var1.isDone0 = true; // L: 55
				} finally {
					if (var2 != null) { // L: 58
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 59
						((HttpURLConnection)var3).disconnect(); // L: 60
					}

				}
			} catch (Exception var17) { // L: 64
				class266.RunException_sendStackTrace((String)null, var17); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1175355119"
	)
	static int method2420(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3519
			class44.Interpreter_intStackSize -= 2; // L: 3520
			Client.field894 = (short)class43.method436(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]); // L: 3521
			if (Client.field894 <= 0) { // L: 3522
				Client.field894 = 256;
			}

			Client.field895 = (short)class43.method436(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 3523
			if (Client.field895 <= 0) { // L: 3524
				Client.field895 = 256;
			}

			return 1; // L: 3525
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3527
			class44.Interpreter_intStackSize -= 2; // L: 3528
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3529
			if (Client.zoomHeight <= 0) { // L: 3530
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3531
			if (Client.zoomWidth <= 0) { // L: 3532
				Client.zoomWidth = 320;
			}

			return 1; // L: 3533
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3535
			class44.Interpreter_intStackSize -= 4; // L: 3536
			Client.field909 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3537
			if (Client.field909 <= 0) { // L: 3538
				Client.field909 = 1;
			}

			Client.field828 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3539
			if (Client.field828 <= 0) { // L: 3540
				Client.field828 = 32767;
			} else if (Client.field828 < Client.field909) { // L: 3541
				Client.field828 = Client.field909;
			}

			Client.field900 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 3542
			if (Client.field900 <= 0) { // L: 3543
				Client.field900 = 1;
			}

			Client.field901 = (short)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 3544
			if (Client.field901 <= 0) { // L: 3545
				Client.field901 = 32767;
			} else if (Client.field901 < Client.field900) { // L: 3546
				Client.field901 = Client.field900;
			}

			return 1; // L: 3547
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3549
			if (Client.viewportWidget != null) { // L: 3550
				setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3551
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3552
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3553
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3556
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3557
			}

			return 1; // L: 3559
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3561
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3562
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3563
			return 1; // L: 3564
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3566
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator9.method2467(Client.field894); // L: 3567
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = UserComparator9.method2467(Client.field895); // L: 3568
			return 1; // L: 3569
		} else if (var0 == 6220) { // L: 3571
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3572
			return 1; // L: 3573
		} else if (var0 == 6221) { // L: 3575
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3576
			return 1; // L: 3577
		} else if (var0 == 6222) { // L: 3579
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class32.canvasWidth; // L: 3580
			return 1; // L: 3581
		} else if (var0 == 6223) { // L: 3583
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ReflectionCheck.canvasHeight; // L: 3584
			return 1; // L: 3585
		} else {
			return 2; // L: 3587
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1159694527"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4289
			var2 = 1;
		}

		if (var3 < 1) { // L: 4290
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4291
		int var6;
		if (var5 < 0) { // L: 4293
			var6 = Client.field894;
		} else if (var5 >= 100) { // L: 4294
			var6 = Client.field895;
		} else {
			var6 = (Client.field895 - Client.field894) * var5 / 100 + Client.field894; // L: 4295
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4296
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field900) { // L: 4297
			var10 = Client.field900; // L: 4298
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4299
			if (var6 > Client.field828) { // L: 4300
				var6 = Client.field828; // L: 4301
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4302
				var9 = (var2 - var8) / 2; // L: 4303
				if (var4) { // L: 4304
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4305
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4306
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4307
				}

				var0 += var9; // L: 4309
				var2 -= var9 * 2; // L: 4310
			}
		} else if (var7 > Client.field901) { // L: 4313
			var10 = Client.field901; // L: 4314
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4315
			if (var6 < Client.field909) { // L: 4316
				var6 = Client.field909; // L: 4317
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4318
				var9 = (var3 - var8) / 2; // L: 4319
				if (var4) { // L: 4320
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4321
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4322
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4323
				}

				var1 += var9; // L: 4325
				var3 -= var9 * 2; // L: 4326
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4329
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4330
			class17.method209(var2, var3); // L: 4331
		}

		Client.viewportOffsetX = var0; // L: 4333
		Client.viewportOffsetY = var1; // L: 4334
		Client.viewportWidth = var2; // L: 4335
		Client.viewportHeight = var3; // L: 4336
	} // L: 4337
}
