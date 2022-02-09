import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class10 {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("c")
	HttpsURLConnection field68;
	@ObfuscatedName("l")
	final Map field61;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	class382 field66;
	@ObfuscatedName("e")
	Map field63;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class9 field67;
	@ObfuscatedName("o")
	boolean field65;
	@ObfuscatedName("i")
	boolean field64;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1912735681
	)
	int field60;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;La;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field65 = false;
		this.field64 = false;
		this.field60 = 300000;
		if (!var2.method68()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method75());
		} else {
			this.field68 = (HttpsURLConnection)var1.openConnection();
			this.field68.setSSLSocketFactory(new class15());
			this.field67 = var2;
			this.field61 = new HashMap();
			this.field63 = new HashMap();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-860651608"
	)
	public void method85(String var1, String var2) {
		if (!this.field65) { // L: 34
			this.field61.put(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1858534087"
	)
	String method98() {
		ArrayList var1 = new ArrayList(this.field63.entrySet());
		Collections.sort(var1, new class18(this)); // L: 40
		StringBuilder var2 = new StringBuilder(); // L: 53
		Iterator var3 = var1.iterator(); // L: 54

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 55
			if (var2.length() > 0) { // L: 57
				var2.append(",");
			}

			var2.append(((class381)var4.getKey()).method6812()); // L: 58
			float var5 = (Float)var4.getValue(); // L: 59
			if (var5 < 1.0F) { // L: 60
				String var6 = Float.toString(var5).substring(0, 4); // L: 61
				var2.append(";q=" + var6); // L: 62
			}
		}

		return var2.toString(); // L: 66
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2080769"
	)
	void method86() throws ProtocolException {
		if (!this.field65) { // L: 70
			this.field68.setRequestMethod(this.field67.method75()); // L: 71
			if (!this.field63.isEmpty()) { // L: 72
				this.field61.put("Accept", this.method98());
			}

			Iterator var1 = this.field61.entrySet().iterator(); // L: 73

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 74
				this.field68.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 76
			}

			if (this.field67.method70() && this.field66 != null) { // L: 79
				this.field68.setDoOutput(true); // L: 80
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 81

				try {
					var13.write(this.field66.method6817((byte)32)); // L: 83
					var13.writeTo(this.field68.getOutputStream()); // L: 84
				} catch (IOException var11) { // L: 86
					var11.printStackTrace(); // L: 87
				} finally {
					if (var13 != null) { // L: 90
						try {
							var13.close(); // L: 92
						} catch (IOException var10) { // L: 94
							var10.printStackTrace(); // L: 95
						}
					}

				}
			}

			this.field68.setConnectTimeout(this.field60); // L: 100
			this.field68.setInstanceFollowRedirects(this.field64); // L: 101
			this.field65 = true; // L: 102
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1109890756"
	)
	boolean method96() throws IOException, SocketTimeoutException {
		if (!this.field65) {
			this.method86();
		}

		this.field68.connect();
		return this.field68.getResponseCode() == -1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lg;",
		garbageValue = "269406108"
	)
	class21 method99() {
		try {
			if (!this.field65 || this.field68.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 116
			this.field68.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null; // L: 120

		class21 var3;
		try {
			var1 = new class21(this.field68); // L: 122
			return var1; // L: 130
		} catch (IOException var8) { // L: 124
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 125
		} finally {
			this.field68.disconnect(); // L: 128
		}

		return var3;
	}

	@ObfuscatedName("c")
	public static final int method101(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-5"
	)
	public static boolean method87(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpt;",
		garbageValue = "1676613528"
	)
	static SpritePixels[] method104() {
		SpritePixels[] var0 = new SpritePixels[class434.SpriteBuffer_spriteCount]; // L: 103

		for (int var1 = 0; var1 < class434.SpriteBuffer_spriteCount; ++var1) { // L: 104
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 105
			var2.width = class434.SpriteBuffer_spriteWidth; // L: 106
			var2.height = class434.SpriteBuffer_spriteHeight; // L: 107
			var2.xOffset = class434.SpriteBuffer_xOffsets[var1]; // L: 108
			var2.yOffset = class434.SpriteBuffer_yOffsets[var1]; // L: 109
			var2.subWidth = class434.SpriteBuffer_spriteWidths[var1]; // L: 110
			var2.subHeight = Fonts.SpriteBuffer_spriteHeights[var1]; // L: 111
			int var3 = var2.subWidth * var2.subHeight; // L: 112
			byte[] var4 = WorldMapLabelSize.SpriteBuffer_pixels[var1]; // L: 113
			var2.pixels = new int[var3]; // L: 114

			for (int var5 = 0; var5 < var3; ++var5) { // L: 115
				var2.pixels[var5] = HealthBarUpdate.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		Canvas.method365(); // L: 117
		return var0; // L: 118
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "15"
	)
	static final int method103(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 965
		int var4 = var0 & var2 - 1; // L: 966
		int var5 = var1 / var2; // L: 967
		int var6 = var1 & var2 - 1; // L: 968
		int var7 = class117.method2653(var3, var5); // L: 969
		int var8 = class117.method2653(var3 + 1, var5); // L: 970
		int var9 = class117.method2653(var3, var5 + 1); // L: 971
		int var10 = class117.method2653(var3 + 1, var5 + 1); // L: 972
		int var11 = WorldMapRegion.method4495(var7, var8, var4, var2); // L: 973
		int var12 = WorldMapRegion.method4495(var9, var10, var4, var2); // L: 974
		return WorldMapRegion.method4495(var11, var12, var6, var2); // L: 975
	}
}
