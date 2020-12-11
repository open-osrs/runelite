import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -863739849
	)
	static int field1963;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("compass")
	static Sprite compass;
	@ObfuscatedName("h")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("v")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("x")
	@Export("requests")
	Queue requests;

	public UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lei;",
		garbageValue = "-1941564889"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 71
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
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
					var3 = var1.url.openConnection();
					var3.setConnectTimeout(5000); // L: 41
					var3.setReadTimeout(5000); // L: 42
					var3.setUseCaches(false);
					var3.setRequestProperty("Connection", "close");
					int var7 = var3.getContentLength(); // L: 45
					if (var7 >= 0) { // L: 46
						byte[] var5 = new byte[var7];
						var2 = new DataInputStream(var3.getInputStream());
						var2.readFully(var5); // L: 49
						var1.response0 = var5; // L: 50
					}

					var1.isDone0 = true;
				} catch (IOException var14) { // L: 54
					var1.isDone0 = true;
				} finally {
					if (var2 != null) { // L: 58
						var2.close();
					}

					if (var3 != null && var3 instanceof HttpURLConnection) { // L: 59
						((HttpURLConnection)var3).disconnect();
					}

				}
			} catch (Exception var17) {
				PlayerAppearance.RunException_sendStackTrace((String)null, var17);
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Lgd;II)Lgd;",
		garbageValue = "-933292802"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enumerated var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgi;I)I",
		garbageValue = "-530251547"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101; // L: 65
			} else if (var10 == 223) { // L: 68
				var12 = 115; // L: 69
			} else if (var10 == 338) { // L: 72
				var12 = 69; // L: 73
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = UserComparator5.standardizeChar(var9, var2);
			var10 = UserComparator5.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) { // L: 88
					return WorldMapAreaData.lowercaseChar(var9, var2) - WorldMapAreaData.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6); // L: 99
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var18 != var20) {
					return WorldMapAreaData.lowercaseChar(var18, var2) - WorldMapAreaData.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var20 != var13) { // L: 111
					return WorldMapAreaData.lowercaseChar(var20, var2) - WorldMapAreaData.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Ljava/lang/String;I)I",
		garbageValue = "-1031927437"
	)
	public static int method3383(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = Projectile.method2171(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class219.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	public static void method3381() {
		try {
			if (class206.musicPlayerStatus == 1) { // L: 74
				int var0 = class206.midiPcmStream.method3816(); // L: 75
				if (var0 > 0 && class206.midiPcmStream.isReady()) { // L: 76
					var0 -= WorldMapSection1.pcmSampleLength; // L: 77
					if (var0 < 0) { // L: 78
						var0 = 0;
					}

					class206.midiPcmStream.setPcmStreamVolume(var0); // L: 79
					return; // L: 80
				}

				class206.midiPcmStream.clear(); // L: 82
				class206.midiPcmStream.removeAll(); // L: 83
				if (Varps.musicTrackArchive != null) { // L: 84
					class206.musicPlayerStatus = 2;
				} else {
					class206.musicPlayerStatus = 0; // L: 85
				}

				FileSystem.musicTrack = null; // L: 86
				class206.soundCache = null; // L: 87
			}
		} catch (Exception var2) { // L: 90
			var2.printStackTrace(); // L: 91
			class206.midiPcmStream.clear(); // L: 92
			class206.musicPlayerStatus = 0; // L: 93
			FileSystem.musicTrack = null; // L: 94
			class206.soundCache = null; // L: 95
			Varps.musicTrackArchive = null; // L: 96
		}

	} // L: 98
}
