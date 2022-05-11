import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1414295177
	)
	static int field4323;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 9

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "434999779"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Lqv;",
		garbageValue = "32"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2016669072"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1824467120"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqv;Lqv;I)V",
		garbageValue = "-2084414447"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	public static int method6525(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 35
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class282.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llp;IIB)Z",
		garbageValue = "94"
	)
	public static boolean method6514(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 165
		if (var3 == null) { // L: 166
			return false;
		} else {
			RouteStrategy.SpriteBuffer_decode(var3); // L: 167
			return true; // L: 168
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-2040403661"
	)
	static final void method6523(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 5505
		if (var8 < 0) { // L: 5506
			var8 = 0;
		} else if (var8 > 100) { // L: 5507
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 5508
		int var7 = var5 * var9 / 256; // L: 5509
		var8 = 2048 - var3 & 2047; // L: 5512
		var9 = 2048 - var4 & 2047; // L: 5513
		int var10 = 0; // L: 5514
		int var11 = 0; // L: 5515
		int var12 = var7; // L: 5516
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 5517
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5518
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5519
			var15 = var11 * var14 - var13 * var7 >> 16; // L: 5520
			var12 = var13 * var11 + var14 * var7 >> 16; // L: 5521
			var11 = var15; // L: 5522
		}

		if (var9 != 0) { // L: 5524
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 5525
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 5526
			var15 = var14 * var10 + var12 * var13 >> 16; // L: 5527
			var12 = var14 * var12 - var13 * var10 >> 16; // L: 5528
			var10 = var15; // L: 5529
		}

		if (Client.isCameraLocked) { // L: 5531
			class271.field3221 = var0 - var10; // L: 5532
			Message.field469 = var1 - var11; // L: 5533
			NPC.field1262 = var2 - var12; // L: 5534
			Interpreter.field838 = var3; // L: 5535
			Timer.field4239 = var4; // L: 5536
		} else {
			class343.cameraX = var0 - var10; // L: 5539
			class295.cameraY = var1 - var11; // L: 5540
			FaceNormal.cameraZ = var2 - var12; // L: 5541
			GameEngine.cameraPitch = var3; // L: 5542
			StudioGame.cameraYaw = var4; // L: 5543
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (HorizontalAlignment.oculusOrbFocalPointX >> 7 != ModelData0.localPlayer.x >> 7 || class28.oculusOrbFocalPointY >> 7 != ModelData0.localPlayer.y >> 7)) { // L: 5545 5546
			var13 = ModelData0.localPlayer.plane; // L: 5547
			var14 = (HorizontalAlignment.oculusOrbFocalPointX >> 7) + SecureRandomCallable.baseX; // L: 5548
			var15 = (class28.oculusOrbFocalPointY >> 7) + GrandExchangeOfferOwnWorldComparator.baseY; // L: 5549
			class123.method2781(var14, var15, var13, true); // L: 5550
		}

	} // L: 5553
}
