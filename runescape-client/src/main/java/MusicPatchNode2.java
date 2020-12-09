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
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;S)I",
		garbageValue = "765"
	)
	static final int method3724(long var0, String var2) {
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

		var4.encryptRsa(class89.field1147, class89.field1142);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		FileSystem.method3573(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class89.field1147, class89.field1142);
		var7 = FloorDecoration.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		String var10 = ArchiveLoader.method1229(var11, 0, var11.length);
		String var12 = var10;

		try {
			URL var13 = new URL(AbstractWorldMapIcon.method632("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + BoundaryObject.method3343(var12) + "&dest=" + BoundaryObject.method3343("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var17 = var16.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var20 = new String(var9.array);
					if (var20.startsWith("OFFLINE")) {
						return 4;
					} else if (var20.startsWith("WRONG")) {
						return 7;
					} else if (var20.startsWith("RELOAD")) {
						return 3;
					} else if (var20.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var20 = new String(var9.array, 0, var9.offset);
						boolean var18;
						if (var20 == null) {
							var18 = false;
						} else {
							label85: {
								try {
									new URL(var20);
								} catch (MalformedURLException var21) {
									var18 = false;
									break label85;
								}

								var18 = true;
							}
						}

						if (var18) {
							AttackOption.openURL(var20, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var22) {
			var22.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-94"
	)
	public static int method3723(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
