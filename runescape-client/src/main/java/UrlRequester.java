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

@ObfuscatedName("cq")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("c")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("b")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("p")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList(); // L: 15
		this.thread = new Thread(this); // L: 18
		this.thread.setPriority(1); // L: 19
		this.thread.start(); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lcf;",
		garbageValue = "-1357643641"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 72
		synchronized(this) { // L: 73
			this.requests.add(var2); // L: 74
			this.notify(); // L: 75
			return var2; // L: 77
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "397818236"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 81

		try {
			synchronized(this) { // L: 83
				this.notify(); // L: 84
			} // L: 85

			this.thread.join(); // L: 86
		} catch (InterruptedException var4) { // L: 88
		}

	} // L: 89

	public void run() {
		while (!this.isClosed) { // L: 25
			try {
				UrlRequest var1;
				synchronized(this) { // L: 28
					var1 = (UrlRequest)this.requests.poll(); // L: 29
					if (var1 == null) { // L: 30
						try {
							this.wait(); // L: 32
						} catch (InterruptedException var13) { // L: 34
						}
						continue;
					}
				}

				DataInputStream var2 = null; // L: 38
				URLConnection var3 = null; // L: 39

				try {
					var3 = var1.url.openConnection(); // L: 41
					var3.setConnectTimeout(5000); // L: 42
					var3.setReadTimeout(5000); // L: 43
					var3.setUseCaches(false); // L: 44
					var3.setRequestProperty("Connection", "close"); // L: 45
					int var7 = var3.getContentLength(); // L: 46
					if (var7 >= 0) { // L: 47
						byte[] var5 = new byte[var7]; // L: 48
						var2 = new DataInputStream(var3.getInputStream()); // L: 49
						var2.readFully(var5); // L: 50
						var1.response0 = var5; // L: 51
					}

					var1.isDone0 = true; // L: 53
				} catch (IOException var14) { // L: 55
					var1.isDone0 = true; // L: 56
				} finally {
					if (var2 != null) { // L: 59
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 60
						((HttpURLConnection)var3).disconnect(); // L: 61
					}

				}
			} catch (Exception var17) { // L: 65
				AccessFile.RunException_sendStackTrace((String)null, var17); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-33577073"
	)
	static int method2486(int var0, Script var1, boolean var2) {
		Widget var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1293
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1294
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1295
			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1298
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1302
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1306
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1310
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1314
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1318
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1322
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1326
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1327
			return 1; // L: 1328
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1330
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1331
			return 1; // L: 1332
		} else if (var0 == 2610) { // L: 1334
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1338
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color; // L: 1339
			return 1; // L: 1340
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1342
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.color2; // L: 1343
			return 1; // L: 1344
		} else if (var0 == 2613) { // L: 1346
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1350
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1351
			return 1; // L: 1352
		} else if (var0 != 2615 && var0 != 2616) { // L: 1354
			return 2; // L: 1358
		} else {
			++IsaacCipher.Interpreter_intStackSize; // L: 1355
			return 1; // L: 1356
		}
	}
}
