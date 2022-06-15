import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 793464983
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 834997317
	)
	static int field1212;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1144016037
	)
	static int field1206;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1062197261
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1440518285
	)
	@Export("health")
	int health;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 878626357
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1008759007
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-384341292"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4;
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;B)I",
		garbageValue = "-1"
	)
	static int method2203(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 159
		String[] var3 = Login.field924; // L: 161

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 162
			var5 = var3[var4]; // L: 163
			if (var0.tryLoadFileByNames(var5, "")) { // L: 165
				++var2;
			}
		}

		var3 = Login.field916; // L: 170

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 171
			var5 = var3[var4]; // L: 172
			if (var1.tryLoadFileByNames(var5, "")) { // L: 174
				++var2;
			}
		}

		return var2; // L: 178
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "329398587"
	)
	public static int method2199(int var0) {
		return var0 >>> 4 & class438.field4683; // L: 22
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1918682655"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1248
			if (Client.gameState == 0) { // L: 1249
				class353.client.method410();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1250
				HitSplatDefinition.method3624(0); // L: 1251
				Client.field512 = 0; // L: 1252
				Client.field609 = 0; // L: 1253
				Client.timer.method6528(var0); // L: 1254
				if (var0 != 20) { // L: 1255
					TriBool.method6791(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Message.field461 != null) { // L: 1257 1258
				Message.field461.close(); // L: 1259
				Message.field461 = null; // L: 1260
			}

			if (Client.gameState == 25) { // L: 1263
				Client.field549 = 0; // L: 1264
				Client.field694 = 0; // L: 1265
				Client.field546 = 1; // L: 1266
				Client.field547 = 0; // L: 1267
				Client.field548 = 1; // L: 1268
			}

			if (var0 != 5 && var0 != 10) { // L: 1270
				if (var0 == 20) { // L: 1278
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1279
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, var3); // L: 1280
				} else if (var0 == 11) { // L: 1282
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, 4); // L: 1283
				} else if (var0 == 50) { // L: 1285
					class101.setLoginResponseString("", "Updating date of birth...", ""); // L: 1286
					ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, false, 7); // L: 1287
				} else if (Login.clearLoginScreen) { // L: 1290
					class4.titleboxSprite = null; // L: 1291
					class6.titlebuttonSprite = null; // L: 1292
					AbstractByteArrayCopier.runesSprite = null; // L: 1293
					class16.leftTitleSprite = null; // L: 1294
					Login.rightTitleSprite = null; // L: 1295
					Login.logoSprite = null; // L: 1296
					class145.title_muteSprite = null; // L: 1297
					class345.options_buttons_0Sprite = null; // L: 1298
					class228.options_buttons_2Sprite = null; // L: 1299
					ScriptFrame.worldSelectBackSprites = null; // L: 1300
					class126.worldSelectFlagSprites = null; // L: 1301
					FriendSystem.worldSelectArrows = null; // L: 1302
					class220.worldSelectStars = null; // L: 1303
					UserComparator5.field1385 = null; // L: 1304
					Login.loginScreenRunesAnimation.method2209(); // L: 1305
					class272.musicPlayerStatus = 1; // L: 1307
					class272.musicTrackArchive = null; // L: 1308
					class272.musicTrackGroupId = -1; // L: 1309
					class151.musicTrackFileId = -1; // L: 1310
					class272.musicTrackVolume = 0; // L: 1311
					class11.musicTrackBoolean = false; // L: 1312
					class272.pcmSampleLength = 2; // L: 1313
					class115.method2693(true); // L: 1315
					Login.clearLoginScreen = false; // L: 1316
				}
			} else {
				boolean var1 = class19.clientPreferences.method2266() >= Client.field482; // L: 1273
				int var2 = var1 ? 0 : 12; // L: 1275
				ClanSettings.method3020(ApproximateRouteStrategy.archive10, class304.archive8, true, var2); // L: 1276
			}

			Client.gameState = var0; // L: 1318
		}
	} // L: 1319

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Llc;Ljava/lang/String;I)V",
		garbageValue = "1432577615"
	)
	static void method2202(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1628
		Client.archiveLoaders.add(var2); // L: 1629
		Client.field626 += var2.groupCount; // L: 1630
	} // L: 1631

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1636421425"
	)
	static void method2204() {
		if (Client.renderSelf) { // L: 4787
			ByteArrayPool.addPlayerToScene(class101.localPlayer, false); // L: 4788
		}

	} // L: 4790

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-12087"
	)
	static void method2205() {
		Client.packetWriter.addNode(EnumComposition.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher)); // L: 12418
		Client.oculusOrbState = 0; // L: 12419
	} // L: 12420
}
