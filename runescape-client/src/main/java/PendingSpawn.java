import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -670628763
	)
	static int field1204;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2028305435
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1822340223
	)
	@Export("type")
	int type;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1106916281
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1868314049
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 951386477
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1193434187
	)
	int field1199;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -169637557
	)
	int field1203;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1882420351
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2081507135
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -228507891
	)
	int field1196;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 355878997
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1991837151
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-1496983965"
	)
	static final int method2180(long var0, String var2) {
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

		var4.encryptRsa(class80.field972, class80.field973); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		if (Client.randomDatData != null) { // L: 62
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 63
		} else {
			byte[] var19 = DynamicObject.method2030(); // L: 66
			var5.writeBytes(var19, 0, var19.length); // L: 67
		}

		var5.writeLong(var3.nextLong()); // L: 69
		var5.encryptRsa(class80.field972, class80.field973); // L: 70
		var7 = class4.stringCp1252NullTerminatedByteSize(var2); // L: 71
		if (var7 % 8 != 0) { // L: 72
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 73
		var8.writeStringCp1252NullTerminated(var2); // L: 74
		var8.offset = var7; // L: 75
		var8.xteaEncryptAll(var6); // L: 76
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5); // L: 77
		var9.writeByte(2); // L: 78
		var9.writeByte(var4.offset); // L: 79
		var9.writeBytes(var4.array, 0, var4.offset); // L: 80
		var9.writeByte(var5.offset); // L: 81
		var9.writeBytes(var5.array, 0, var5.offset); // L: 82
		var9.writeShort(var8.offset); // L: 83
		var9.writeBytes(var8.array, 0, var8.offset); // L: 84
		byte[] var11 = var9.array; // L: 86
		int var13 = var11.length; // L: 89
		StringBuilder var14 = new StringBuilder(); // L: 91

		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) { // L: 92
			int var16 = var11[var15] & 255; // L: 93
			var14.append(class302.field3770[var16 >>> 2]); // L: 94
			if (var15 < var13 - 1) { // L: 95
				var17 = var11[var15 + 1] & 255; // L: 96
				var14.append(class302.field3770[(var16 & 3) << 4 | var17 >>> 4]); // L: 97
				if (var15 < var13 - 2) { // L: 98
					int var18 = var11[var15 + 2] & 255; // L: 99
					var14.append(class302.field3770[(var17 & 15) << 2 | var18 >>> 6]).append(class302.field3770[var18 & 63]); // L: 100
				} else {
					var14.append(class302.field3770[(var17 & 15) << 2]).append("="); // L: 102
				}
			} else {
				var14.append(class302.field3770[(var16 & 3) << 4]).append("=="); // L: 104
			}
		}

		String var12 = var14.toString(); // L: 106
		var12 = var12; // L: 110

		try {
			URL var20 = new URL(class4.method57("services", false) + "m=accountappeal/login.ws"); // L: 112
			URLConnection var25 = var20.openConnection(); // L: 113
			var25.setDoInput(true);
			var25.setDoOutput(true); // L: 115
			var25.setConnectTimeout(5000);
			OutputStreamWriter var21 = new OutputStreamWriter(var25.getOutputStream()); // L: 117
			var21.write("data2=" + class368.method6299(var12) + "&dest=" + class368.method6299("passwordchoice.ws")); // L: 118
			var21.flush();
			InputStream var22 = var25.getInputStream();
			var9 = new Buffer(new byte[1000]); // L: 121

			do {
				var17 = var22.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var21.close();
					var22.close();
					String var23 = new String(var9.array);
					if (var23.startsWith("OFFLINE")) {
						return 4;
					} else if (var23.startsWith("WRONG")) {
						return 7; // L: 137
					} else if (var23.startsWith("RELOAD")) { // L: 139
						return 3;
					} else if (var23.startsWith("Not permitted for social network accounts.")) { // L: 142
						return 6; // L: 143
					} else {
						var9.xteaDecryptAll(var6); // L: 145

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 146
							--var9.offset; // L: 147
						}

						var23 = new String(var9.array, 0, var9.offset); // L: 149
						if (class23.method308(var23)) { // L: 150
							Interpreter.openURL(var23, true, false); // L: 151
							return 2; // L: 152
						} else {
							return 5; // L: 154
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var24) { // L: 156
			var24.printStackTrace(); // L: 157
			return 5; // L: 158
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "11371461"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 114
			int var3 = var0; // L: 116
			String var2;
			if (var1 && var0 >= 0) { // L: 119
				int var4 = 2; // L: 123

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 124 125 127
					var5 /= 10; // L: 126
				}

				char[] var6 = new char[var4]; // L: 129
				var6[0] = '+'; // L: 130

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 131
					int var8 = var3; // L: 132
					var3 /= 10; // L: 133
					int var9 = var8 - var3 * 10; // L: 134
					if (var9 >= 10) { // L: 135
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 136
					}
				}

				var2 = new String(var6); // L: 138
			} else {
				var2 = Integer.toString(var0, 10); // L: 120
			}

			return var2; // L: 140
		} else {
			return Integer.toString(var0);
		}
	}
}
