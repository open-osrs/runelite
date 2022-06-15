import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static class325 field1362;
	@ObfuscatedName("c")
	final Thread field1363;
	@ObfuscatedName("v")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("q")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1046925001
	)
	int field1360;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 16
		this.field1363 = new Thread(this); // L: 20
		this.field1363.setPriority(1); // L: 21
		this.field1363.start(); // L: 22
		this.field1360 = var1; // L: 23
	} // L: 24

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "1538294108"
	)
	abstract void vmethod2537(UrlRequest var1) throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "123786888"
	)
	void method2520(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 52
		var1.setReadTimeout(5000); // L: 53
		var1.setUseCaches(false); // L: 54
		var1.setRequestProperty("Connection", "close"); // L: 55
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1360); // L: 56
	} // L: 57

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lct;I)V",
		garbageValue = "2137871662"
	)
	void method2522(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 60

		try {
			int var5 = var1.getContentLength(); // L: 63
			var3 = new DataInputStream(var1.getInputStream()); // L: 64
			byte[] var4;
			if (var5 >= 0) { // L: 65
				var4 = new byte[var5]; // L: 66
				var3.readFully(var4); // L: 67
			} else {
				var4 = new byte[0]; // L: 70
				byte[] var6 = class292.ByteArrayPool_getArray(5000); // L: 71

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 72 73 77
					var8 = new byte[var4.length + var7]; // L: 74
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 75
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 76
				}

				class93.ByteArrayPool_release(var6); // L: 79
			}

			var2.response0 = var4; // L: 81
		} catch (IOException var10) { // L: 83
		}

		if (var3 != null) { // L: 84
			try {
				var3.close(); // L: 86
			} catch (IOException var9) { // L: 88
			}
		}

	} // L: 90

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lct;",
		garbageValue = "-682839730"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 93
		synchronized(this) { // L: 94
			this.requests.add(var2); // L: 95
			this.notify(); // L: 96
			return var2; // L: 98
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "90163766"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 102

		try {
			synchronized(this) { // L: 104
				this.notify(); // L: 105
			} // L: 106

			this.field1363.join(); // L: 107
		} catch (InterruptedException var4) { // L: 109
		}

	} // L: 110

	public void run() {
		while (!this.isClosed) { // L: 28
			try {
				UrlRequest var1;
				synchronized(this) { // L: 31
					var1 = (UrlRequest)this.requests.poll(); // L: 32
					if (var1 == null) { // L: 33
						try {
							this.wait(); // L: 35
						} catch (InterruptedException var5) { // L: 37
						}
						continue;
					}
				}

				this.vmethod2537(var1); // L: 41
			} catch (Exception var7) { // L: 43
				class249.RunException_sendStackTrace((String)null, var7); // L: 44
			}
		}

	} // L: 47

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	static final void method2536() {
		int[] var0 = Players.Players_indices; // L: 3896

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3897
			Player var4 = Client.players[var0[var1]]; // L: 3898
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3899
				--var4.overheadTextCyclesRemaining; // L: 3900
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3901
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3904
			int var2 = Client.npcIndices[var1]; // L: 3905
			NPC var3 = Client.npcs[var2]; // L: 3906
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3907
				--var3.overheadTextCyclesRemaining; // L: 3908
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3909
					var3.overheadText = null;
				}
			}
		}

	} // L: 3912
}
