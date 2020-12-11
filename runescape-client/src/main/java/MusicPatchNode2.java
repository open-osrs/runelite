import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("h")
	byte[] field2411;
	@ObfuscatedName("v")
	byte[] field2412;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1761129663
	)
	int field2410;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1532426433
	)
	int field2417;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1235995601
	)
	int field2413;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1053337205
	)
	int field2414;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 196885279
	)
	int field2415;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -540093809
	)
	int field2416;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -180969663
	)
	int field2409;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;S)I",
		garbageValue = "765"
	)
	static final int method3724(long var0, String var2) {
		Random var3 = new Random(); // L: 35
		Buffer var4 = new Buffer(128); // L: 36
		Buffer var5 = new Buffer(128); // L: 37
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 38 39 40 41 42
		var4.writeByte(10); // L: 43

		int var7;
		for (var7 = 0; var7 < 4; ++var7) { // L: 44
			var4.writeInt(var3.nextInt()); // L: 45
		}

		var4.writeInt(var6[0]); // L: 47
		var4.writeInt(var6[1]); // L: 48
		var4.writeLong(var0); // L: 49
		var4.writeLong(0L); // L: 50

		for (var7 = 0; var7 < 4; ++var7) { // L: 51
			var4.writeInt(var3.nextInt()); // L: 52
		}

		var4.encryptRsa(class89.field1147, class89.field1142); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		FileSystem.method3573(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class89.field1147, class89.field1142);
		var7 = FloorDecoration.stringCp1252NullTerminatedByteSize(var2); // L: 64
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 66
		var8.writeStringCp1252NullTerminated(var2); // L: 67
		var8.offset = var7; // L: 68
		var8.xteaEncryptAll(var6); // L: 69
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5); // L: 70
		var9.writeByte(2); // L: 71
		var9.writeByte(var4.offset); // L: 72
		var9.writeBytes(var4.array, 0, var4.offset); // L: 73
		var9.writeByte(var5.offset); // L: 74
		var9.writeBytes(var5.array, 0, var5.offset); // L: 75
		var9.writeShort(var8.offset); // L: 76
		var9.writeBytes(var8.array, 0, var8.offset); // L: 77
		byte[] var11 = var9.array; // L: 79
		String var10 = ArchiveLoader.method1229(var11, 0, var11.length); // L: 81
		String var12 = var10; // L: 83

		try {
			URL var13 = new URL(AbstractWorldMapIcon.method632("services", false) + "m=accountappeal/login.ws"); // L: 85
			URLConnection var14 = var13.openConnection(); // L: 86
			var14.setDoInput(true); // L: 87
			var14.setDoOutput(true); // L: 88
			var14.setConnectTimeout(5000); // L: 89
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 90
			var15.write("data2=" + BoundaryObject.method3343(var12) + "&dest=" + BoundaryObject.method3343("passwordchoice.ws")); // L: 91
			var15.flush(); // L: 92
			InputStream var16 = var14.getInputStream(); // L: 93
			var9 = new Buffer(new byte[1000]); // L: 94

			do {
				int var17 = var16.read(var9.array, var9.offset, 1000 - var9.offset); // L: 96
				if (var17 == -1) { // L: 97
					var15.close(); // L: 103
					var16.close(); // L: 104
					String var20 = new String(var9.array); // L: 105
					if (var20.startsWith("OFFLINE")) { // L: 106
						return 4; // L: 107
					} else if (var20.startsWith("WRONG")) { // L: 109
						return 7; // L: 110
					} else if (var20.startsWith("RELOAD")) { // L: 112
						return 3; // L: 113
					} else if (var20.startsWith("Not permitted for social network accounts.")) { // L: 115
						return 6; // L: 116
					} else {
						var9.xteaDecryptAll(var6); // L: 118

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 119
							--var9.offset; // L: 120
						}

						var20 = new String(var9.array, 0, var9.offset); // L: 122
						boolean var18;
						if (var20 == null) { // L: 125
							var18 = false; // L: 126
						} else {
							label85: {
								try {
									new URL(var20);
								} catch (MalformedURLException var21) { // L: 132
									var18 = false; // L: 133
									break label85; // L: 134
								}

								var18 = true; // L: 136
							}
						}

						if (var18) { // L: 138
							AttackOption.openURL(var20, true, false); // L: 139
							return 2; // L: 140
						} else {
							return 5; // L: 142
						}
					}
				}

				var9.offset += var17; // L: 98
			} while(var9.offset < 1000); // L: 99

			return 5; // L: 100
		} catch (Throwable var22) { // L: 144
			var22.printStackTrace(); // L: 145
			return 5; // L: 146
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-94"
	)
	public static int method3723(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 59 60 63
			var2 = var2 << 1 | var0 & 1; // L: 61
			var0 >>>= 1; // L: 62
		}

		return var2; // L: 65
	}
}
