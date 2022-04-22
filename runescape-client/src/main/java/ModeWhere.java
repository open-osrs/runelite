import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4069("", 0, new class327[]{class327.field4042}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4062("", 1, new class327[]{class327.field4043, class327.field4042}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4071("", 2, new class327[]{class327.field4043, class327.field4044, class327.field4042}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4065("", 3, new class327[]{class327.field4043}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4064("", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4066("", 5, new class327[]{class327.field4043, class327.field4042}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4079("", 6, new class327[]{class327.field4042}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4067("", 8, new class327[]{class327.field4043, class327.field4042}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4068("", 9, new class327[]{class327.field4043, class327.field4044}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4061("", 10, new class327[]{class327.field4043}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4070("", 11, new class327[]{class327.field4043}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4077("", 12, new class327[]{class327.field4043, class327.field4042}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	field4072("", 13, new class327[]{class327.field4043});

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static AbstractSocket field4073;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 426345527
	)
	@Export("id")
	final int id;
	@ObfuscatedName("d")
	final Set field4074;

	static {
		method6093(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llb;)V"
	)
	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4074 = new HashSet();
		this.id = var4; // L: 43
		class327[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class327 var8 = var6[var7]; // L: 47
			this.field4074.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field4074 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Llv;",
		garbageValue = "1573276751"
	)
	static ModeWhere[] method6093() {
		return new ModeWhere[]{field4079, field4068, field4070, field4061, field4064, field4069, field4072, field4066, field4065, field4067, field4077, field4071, field4062}; // L: 35
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lph;",
		garbageValue = "-16"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 247
		if (var3.exists()) { // L: 248
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 250
				return var10; // L: 251
			} catch (IOException var9) { // L: 253
			}
		}

		String var4 = ""; // L: 255
		if (WorldMapSection1.cacheGamebuild == 33) { // L: 256
			var4 = "_rc";
		} else if (WorldMapSection1.cacheGamebuild == 34) { // L: 257
			var4 = "_wip";
		}

		File var5 = new File(NetSocket.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 258
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 259
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 261
				return var6; // L: 262
			} catch (IOException var8) { // L: 264
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 267
			return var6; // L: 268
		} catch (IOException var7) { // L: 270
			throw new RuntimeException(); // L: 271
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "610665702"
	)
	static final void method6092() {
		class149.method3138("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 156
	} // L: 157

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)Z",
		garbageValue = "1543146245"
	)
	static final boolean method6100(Widget var0) {
		int var1 = var0.contentType; // L: 12192
		if (var1 == 205) { // L: 12193
			Client.logoutTimer = 250; // L: 12194
			return true; // L: 12195
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12197
				var2 = (var1 - 300) / 2; // L: 12198
				var3 = var1 & 1; // L: 12199
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12200
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12202
				var2 = (var1 - 314) / 2; // L: 12203
				var3 = var1 & 1; // L: 12204
				Client.playerAppearance.method5594(var2, var3 == 1); // L: 12205
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 12207
			}

			if (var1 == 325) { // L: 12208
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 12209
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 12211
				Client.playerAppearance.write(var4.packetBuffer); // L: 12212
				Client.packetWriter.addNode(var4); // L: 12213
				return true; // L: 12214
			} else {
				return false; // L: 12216
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1436846475"
	)
	static final void method6102() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12368
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12369
			var1.clearIsInFriendsChat(); // L: 12370
		}

	} // L: 12372

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	static void method6099(int var0) {
		if (var0 != Client.loginState) { // L: 12665
			Client.loginState = var0; // L: 12666
		}
	} // L: 12667
}
