import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("l")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;B)I",
		garbageValue = "16"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "7"
	)
	static final int method2413(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class65.field856, class65.field852);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var8 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var8);

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) {
				}

				if (var9 >= 24) {
					throw new IOException();
				}
			} catch (Exception var23) {
				for (int var10 = 0; var10 < 24; ++var10) {
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field856, class65.field852);
		var7 = class113.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var24 = new Buffer(var7);
		var24.writeStringCp1252NullTerminated(var2);
		var24.offset = var7;
		var24.xteaEncryptAll(var6);
		Buffer var18 = new Buffer(var5.offset + var4.offset + var24.offset + 5);
		var18.writeByte(2);
		var18.writeByte(var4.offset);
		var18.writeBytes(var4.array, 0, var4.offset);
		var18.writeByte(var5.offset);
		var18.writeBytes(var5.array, 0, var5.offset);
		var18.writeShort(var24.offset);
		var18.writeBytes(var24.array, 0, var24.offset);
		byte[] var11 = var18.array;
		String var20 = WallDecoration.method4580(var11, 0, var11.length);
		String var12 = var20;

		try {
			URL var13 = new URL(HitSplatDefinition.method3168("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + Language.method5476(var12) + "&dest=" + Language.method5476("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var18 = new Buffer(new byte[1000]);

			do {
				int var17 = var16.read(var18.array, var18.offset, 1000 - var18.offset);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var21 = new String(var18.array);
					if (var21.startsWith("OFFLINE")) {
						return 4;
					} else if (var21.startsWith("WRONG")) {
						return 7;
					} else if (var21.startsWith("RELOAD")) {
						return 3;
					} else if (var21.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var18.xteaDecryptAll(var6);

						while (var18.offset > 0 && var18.array[var18.offset - 1] == 0) {
							--var18.offset;
						}

						var21 = new String(var18.array, 0, var18.offset);
						if (GrandExchangeOffer.method5406(var21)) {
							LoginScreenAnimation.openURL(var21, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var18.offset += var17;
			} while(var18.offset < 1000);

			return 5;
		} catch (Throwable var22) {
			var22.printStackTrace();
			return 5;
		}
	}
}
