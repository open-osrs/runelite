import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("z")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("r")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("u")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lqt;IZI)V",
		garbageValue = "-15216320"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ZI)V",
		garbageValue = "-681546343"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method7752();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-513053480"
	)
	static final int method5082(long var0, String var2) {
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

		var4.encryptRsa(class65.field865, class65.field868); // L: 54
		var5.writeByte(10); // L: 55

		for (var7 = 0; var7 < 3; ++var7) { // L: 56
			var5.writeInt(var3.nextInt()); // L: 57
		}

		var5.writeLong(var3.nextLong()); // L: 59
		var5.writeLongMedium(var3.nextLong()); // L: 60
		if (Client.randomDatData != null) { // L: 62
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 63
		} else {
			byte[] var20 = ModeWhere.method6082(); // L: 66
			var5.writeBytes(var20, 0, var20.length); // L: 67
		}

		var5.writeLong(var3.nextLong()); // L: 69
		var5.encryptRsa(class65.field865, class65.field868); // L: 70
		var7 = ScriptEvent.stringCp1252NullTerminatedByteSize(var2); // L: 71
		if (var7 % 8 != 0) { // L: 72
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7); // L: 73
		var8.writeStringCp1252NullTerminated(var2); // L: 74
		var8.offset = var7; // L: 75
		var8.xteaEncryptAll(var6); // L: 76
		Buffer var9 = new Buffer(var4.offset + var5.offset + var8.offset + 5); // L: 77
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
			var14.append(class341.field4146[var16 >>> 2]); // L: 94
			if (var15 < var13 - 1) { // L: 95
				var17 = var11[var15 + 1] & 255; // L: 96
				var14.append(class341.field4146[(var16 & 3) << 4 | var17 >>> 4]); // L: 97
				if (var15 < var13 - 2) { // L: 98
					int var18 = var11[var15 + 2] & 255; // L: 99
					var14.append(class341.field4146[(var17 & 15) << 2 | var18 >>> 6]).append(class341.field4146[var18 & 63]); // L: 100
				} else {
					var14.append(class341.field4146[(var17 & 15) << 2]).append("="); // L: 102
				}
			} else {
				var14.append(class341.field4146[(var16 & 3) << 4]).append("=="); // L: 104
			}
		}

		String var12 = var14.toString(); // L: 106
		var12 = var12; // L: 110

		try {
			URL var21 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws"); // L: 112
			URLConnection var27 = var21.openConnection(); // L: 113
			var27.setDoInput(true); // L: 114
			var27.setDoOutput(true); // L: 115
			var27.setConnectTimeout(5000); // L: 116
			OutputStreamWriter var22 = new OutputStreamWriter(var27.getOutputStream()); // L: 117
			var22.write("data2=" + GrandExchangeOfferOwnWorldComparator.method1097(var12) + "&dest=" + GrandExchangeOfferOwnWorldComparator.method1097("passwordchoice.ws")); // L: 118
			var22.flush(); // L: 119
			InputStream var23 = var27.getInputStream(); // L: 120
			var9 = new Buffer(new byte[1000]); // L: 121

			do {
				var17 = var23.read(var9.array, var9.offset, 1000 - var9.offset); // L: 123
				if (var17 == -1) { // L: 124
					var22.close(); // L: 130
					var23.close(); // L: 131
					String var24 = new String(var9.array); // L: 132
					if (var24.startsWith("OFFLINE")) { // L: 133
						return 4; // L: 134
					} else if (var24.startsWith("WRONG")) { // L: 136
						return 7; // L: 137
					} else if (var24.startsWith("RELOAD")) { // L: 139
						return 3; // L: 140
					} else if (var24.startsWith("Not permitted for social network accounts.")) { // L: 142
						return 6; // L: 143
					} else {
						var9.xteaDecryptAll(var6); // L: 145

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) { // L: 146
							--var9.offset; // L: 147
						}

						var24 = new String(var9.array, 0, var9.offset); // L: 149
						boolean var28;
						if (var24 == null) { // L: 152
							var28 = false; // L: 153
						} else {
							label107: {
								try {
									new URL(var24);
								} catch (MalformedURLException var25) { // L: 159
									var28 = false; // L: 160
									break label107; // L: 161
								}

								var28 = true; // L: 163
							}
						}

						if (var28) { // L: 165
							class258.openURL(var24, true, false); // L: 166
							return 2; // L: 167
						} else {
							return 5; // L: 169
						}
					}
				}

				var9.offset += var17; // L: 125
			} while(var9.offset < 1000); // L: 126

			return 5; // L: 127
		} catch (Throwable var26) { // L: 171
			var26.printStackTrace(); // L: 172
			return 5; // L: 173
		}
	}
}
