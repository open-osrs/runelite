import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class141 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -945029977
	)
	int field1629;
	@ObfuscatedName("o")
	byte field1626;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -292002615
	)
	int field1627;
	@ObfuscatedName("g")
	String field1628;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1629 = -1;
	} // L: 130

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	void vmethod3096(Buffer var1) {
		var1.readUnsignedByte();
		this.field1629 = var1.readUnsignedShort(); // L: 134
		this.field1626 = var1.readByte(); // L: 135
		this.field1627 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1628 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1629); // L: 143
		var2.rank = this.field1626; // L: 144
		var2.world = this.field1627; // L: 145
		var2.username = new Username(this.field1628); // L: 146
	} // L: 147

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "29"
	)
	static final int method2990(long var0, String var2) {
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

		var4.encryptRsa(class65.field861, class65.field862); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		if (Client.randomDatData != null) { // L: 62
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 63
		} else {
			byte[] var16 = class67.method1878(); // L: 66
			var5.writeBytes(var16, 0, var16.length); // L: 67
		}

		var5.writeLong(var3.nextLong()); // L: 69
		var5.encryptRsa(class65.field861, class65.field862); // L: 70
		var7 = ItemLayer.stringCp1252NullTerminatedByteSize(var2); // L: 71
		if (var7 % 8 != 0) { // L: 72
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 73
		var8.writeStringCp1252NullTerminated(var2); // L: 74
		var8.offset = var7; // L: 75
		var8.xteaEncryptAll(var6); // L: 76
		Buffer var9 = new Buffer(var8.offset + var4.offset + var5.offset + 5); // L: 77
		var9.writeByte(2); // L: 78
		var9.writeByte(var4.offset); // L: 79
		var9.writeBytes(var4.array, 0, var4.offset); // L: 80
		var9.writeByte(var5.offset); // L: 81
		var9.writeBytes(var5.array, 0, var5.offset); // L: 82
		var9.writeShort(var8.offset); // L: 83
		var9.writeBytes(var8.array, 0, var8.offset); // L: 84
		String var10 = class29.method425(var9.array); // L: 85

		try {
			URL var11 = new URL(class129.method2849("services", false) + "m=accountappeal/login.ws"); // L: 87
			URLConnection var12 = var11.openConnection(); // L: 88
			var12.setDoInput(true); // L: 89
			var12.setDoOutput(true); // L: 90
			var12.setConnectTimeout(5000); // L: 91
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 92
			var13.write("data2=" + class126.method2817(var10) + "&dest=" + class126.method2817("passwordchoice.ws")); // L: 93
			var13.flush(); // L: 94
			InputStream var14 = var12.getInputStream(); // L: 95
			var9 = new Buffer(new byte[1000]); // L: 96

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset); // L: 98
				if (var15 == -1) { // L: 99
					var13.close(); // L: 105
					var14.close(); // L: 106
					String var17 = new String(var9.array); // L: 107
					if (var17.startsWith("OFFLINE")) { // L: 108
						return 4; // L: 109
					} else if (var17.startsWith("WRONG")) { // L: 111
						return 7; // L: 112
					} else if (var17.startsWith("RELOAD")) { // L: 114
						return 3; // L: 115
					} else if (var17.startsWith("Not permitted for social network accounts.")) { // L: 117
						return 6; // L: 118
					} else {
						var9.xteaDecryptAll(var6); // L: 120

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 121
							--var9.offset; // L: 122
						}

						var17 = new String(var9.array, 0, var9.offset); // L: 124
						if (Login.method1945(var17)) { // L: 125
							class11.openURL(var17, true, false); // L: 126
							return 2; // L: 127
						} else {
							return 5; // L: 129
						}
					}
				}

				var9.offset += var15; // L: 100
			} while(var9.offset < 1000); // L: 101

			return 5; // L: 102
		} catch (Throwable var18) { // L: 131
			var18.printStackTrace(); // L: 132
			return 5; // L: 133
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812294948"
	)
	public static void method2995() {
		StructComposition.StructDefinition_cached.clear(); // L: 57
	} // L: 58
}
