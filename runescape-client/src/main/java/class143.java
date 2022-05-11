import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class143 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -5075875744694294941L
	)
	long field1679;
	@ObfuscatedName("q")
	String field1680;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -130404941
	)
	int field1678;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class143(class131 var1) {
		this.this$0 = var1;
		this.field1679 = -1L;
		this.field1680 = null;
		this.field1678 = 0;
	} // L: 97

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1679 = var1.readLong();
		}

		this.field1680 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1678 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2888(this.field1679, this.field1680, this.field1678); // L: 109
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-1230431234"
	)
	static final int method2972(long var0, String var2) {
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

		var4.encryptRsa(class65.field854, class65.field862); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		IntHashTable.method8124(var5); // L: 61
		var5.writeLong(var3.nextLong()); // L: 62
		var5.encryptRsa(class65.field854, class65.field862); // L: 63
		var7 = class392.stringCp1252NullTerminatedByteSize(var2); // L: 64
		if (var7 % 8 != 0) { // L: 65
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
		String var10 = class119.method2745(var9.array); // L: 78

		try {
			URL var11 = new URL(WorldMapData_1.method4707("services", false) + "m=accountappeal/login.ws"); // L: 80
			URLConnection var12 = var11.openConnection(); // L: 81
			var12.setDoInput(true); // L: 82
			var12.setDoOutput(true); // L: 83
			var12.setConnectTimeout(5000); // L: 84
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + UserComparator6.method2619(var10) + "&dest=" + UserComparator6.method2619("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]); // L: 89

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var18 = new String(var9.array);
					if (var18.startsWith("OFFLINE")) { // L: 101
						return 4;
					} else if (var18.startsWith("WRONG")) {
						return 7; // L: 105
					} else if (var18.startsWith("RELOAD")) { // L: 107
						return 3; // L: 108
					} else if (var18.startsWith("Not permitted for social network accounts.")) { // L: 110
						return 6; // L: 111
					} else {
						var9.xteaDecryptAll(var6); // L: 113

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 114
							--var9.offset; // L: 115
						}

						var18 = new String(var9.array, 0, var9.offset); // L: 117
						boolean var16;
						if (var18 == null) { // L: 120
							var16 = false; // L: 121
						} else {
							label83: {
								try {
									new URL(var18);
								} catch (MalformedURLException var19) { // L: 127
									var16 = false; // L: 128
									break label83; // L: 129
								}

								var16 = true; // L: 131
							}
						}

						if (var16) { // L: 133
							ScriptEvent.openURL(var18, true, false); // L: 134
							return 2; // L: 135
						} else {
							return 5; // L: 137
						}
					}
				}

				var9.offset += var15; // L: 93
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var20) { // L: 139
			var20.printStackTrace(); // L: 140
			return 5; // L: 141
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-53"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 85
		if (var0 < 0 || var0 >= 65536) { // L: 86
			var0 >>>= 16; // L: 87
			var1 += 16; // L: 88
		}

		if (var0 >= 256) { // L: 90
			var0 >>>= 8; // L: 91
			var1 += 8; // L: 92
		}

		if (var0 >= 16) { // L: 94
			var0 >>>= 4; // L: 95
			var1 += 4; // L: 96
		}

		if (var0 >= 4) { // L: 98
			var0 >>>= 2; // L: 99
			var1 += 2; // L: 100
		}

		if (var0 >= 1) { // L: 102
			var0 >>>= 1; // L: 103
			++var1; // L: 104
		}

		return var0 + var1; // L: 106
	}
}
