import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("u")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lq;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lq;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 305
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 309
			LinkedList var3 = new LinkedList(); // L: 310
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 312

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 313
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 314
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 316
			}

			this.this$2.this$1.field71 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 320
		} catch (CertificateException var7) { // L: 322
			throw new IOException(var7); // L: 323
		}
	} // L: 325

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 329
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZS)I",
		garbageValue = "2225"
	)
	static int method110(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 429
			return class120.method2698(var0, var1, var2);
		} else if (var0 < 1100) { // L: 430
			return WorldMapSection0.method4714(var0, var1, var2);
		} else if (var0 < 1200) { // L: 431
			return class1.method4(var0, var1, var2);
		} else if (var0 < 1300) { // L: 432
			return class20.method289(var0, var1, var2);
		} else if (var0 < 1400) { // L: 433
			return Tiles.method2052(var0, var1, var2);
		} else if (var0 < 1500) { // L: 434
			return GrandExchangeOfferAgeComparator.method5707(var0, var1, var2);
		} else if (var0 < 1600) { // L: 435
			return ScriptFrame.method1077(var0, var1, var2);
		} else if (var0 < 1700) { // L: 436
			return Canvas.method364(var0, var1, var2);
		} else if (var0 < 1800) { // L: 437
			return class282.method5358(var0, var1, var2);
		} else if (var0 < 1900) { // L: 438
			return WorldMapLabelSize.method4322(var0, var1, var2);
		} else if (var0 < 2000) { // L: 439
			return ClanChannelMember.method2772(var0, var1, var2);
		} else if (var0 < 2100) { // L: 440
			return WorldMapSection0.method4714(var0, var1, var2);
		} else if (var0 < 2200) { // L: 441
			return class1.method4(var0, var1, var2);
		} else if (var0 < 2300) { // L: 442
			return class20.method289(var0, var1, var2);
		} else if (var0 < 2400) { // L: 443
			return Tiles.method2052(var0, var1, var2);
		} else if (var0 < 2500) { // L: 444
			return GrandExchangeOfferAgeComparator.method5707(var0, var1, var2);
		} else if (var0 < 2600) { // L: 445
			return class21.method292(var0, var1, var2);
		} else if (var0 < 2700) { // L: 446
			return GrandExchangeOfferOwnWorldComparator.method1115(var0, var1, var2);
		} else if (var0 < 2800) { // L: 447
			return FriendsList.method6283(var0, var1, var2);
		} else if (var0 < 2900) { // L: 448
			return class131.method2795(var0, var1, var2);
		} else if (var0 < 3000) { // L: 449
			return ClanChannelMember.method2772(var0, var1, var2);
		} else if (var0 < 3200) { // L: 450
			return class115.method2637(var0, var1, var2);
		} else if (var0 < 3300) { // L: 451
			return Client.method1630(var0, var1, var2);
		} else if (var0 < 3400) { // L: 452
			return class317.method5768(var0, var1, var2);
		} else if (var0 < 3500) { // L: 453
			return ParamComposition.method3370(var0, var1, var2);
		} else if (var0 < 3600) { // L: 454
			return Skeleton.method3893(var0, var1, var2);
		} else if (var0 < 3700) { // L: 455
			return Actor.method2176(var0, var1, var2);
		} else if (var0 < 3800) { // L: 456
			return class21.method303(var0, var1, var2);
		} else if (var0 < 3900) { // L: 457
			return GrandExchangeOfferWorldComparator.method5724(var0, var1, var2);
		} else if (var0 < 4000) { // L: 458
			return class141.method2944(var0, var1, var2);
		} else if (var0 < 4100) {
			return ReflectionCheck.method629(var0, var1, var2); // L: 459
		} else if (var0 < 4200) { // L: 460
			return ItemComposition.method3572(var0, var1, var2);
		} else if (var0 < 4300) { // L: 461
			return Skills.method5476(var0, var1, var2);
		} else if (var0 < 5100) { // L: 462
			return ClanChannelMember.method2771(var0, var1, var2);
		} else if (var0 < 5400) { // L: 463
			return ClientPacket.method4976(var0, var1, var2);
		} else if (var0 < 5600) { // L: 464
			return class185.method3686(var0, var1, var2);
		} else if (var0 < 5700) { // L: 465
			return WorldMapData_1.method4635(var0, var1, var2);
		} else if (var0 < 6300) { // L: 466
			return class16.method203(var0, var1, var2);
		} else if (var0 < 6600) { // L: 467
			return Players.method2305(var0, var1, var2);
		} else if (var0 < 6700) { // L: 468
			return class160.method3129(var0, var1, var2);
		} else if (var0 < 6800) { // L: 469
			return WorldMapID.method4767(var0, var1, var2);
		} else if (var0 < 6900) { // L: 470
			return class334.method6130(var0, var1, var2);
		} else if (var0 < 7000) { // L: 471
			return FriendLoginUpdate.method6332(var0, var1, var2);
		} else if (var0 < 7100) { // L: 472
			return WorldMapCacheName.method4830(var0, var1, var2);
		} else if (var0 < 7200) { // L: 473
			return MusicPatch.method5236(var0, var1, var2);
		} else if (var0 < 7300) {
			return class117.method2655(var0, var1, var2); // L: 474
		} else {
			return var0 < 7500 ? MusicPatchNode.method5277(var0, var1, var2) : 2; // L: 475 476
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIII)V",
		garbageValue = "1741316466"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3341 == null) { // L: 996
			throw new RuntimeException(); // L: 997
		} else {
			var0.field3341[var1] = var2; // L: 999
			var0.field3342[var1] = var3; // L: 1000
		}
	} // L: 1001

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "9"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ArchiveLoader.insertMenuItem(var0, var1, var2, var3, var4, var5, false); // L: 9337
	} // L: 9338

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ljz;III)V",
		garbageValue = "-744040878"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11257
			if (var0 != null) { // L: 11259
				Widget var5 = var0; // L: 11263
				int var6 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var0)); // L: 11265
				Widget var4;
				int var7;
				if (var6 == 0) { // L: 11266
					var4 = null; // L: 11267
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5; // L: 11277
							break;
						}

						var5 = class130.getWidget(var5.parentId); // L: 11271
						if (var5 == null) { // L: 11272
							var4 = null; // L: 11273
							break; // L: 11274
						}

						++var7; // L: 11270
					}
				}

				Widget var8 = var4; // L: 11279
				if (var4 == null) { // L: 11280
					var8 = var0.parent;
				}

				if (var8 != null) { // L: 11283
					Client.clickedWidget = var0; // L: 11287
					var5 = var0; // L: 11291
					var6 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var0)); // L: 11293
					if (var6 == 0) { // L: 11294
						var4 = null; // L: 11295
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5; // L: 11305
								break;
							}

							var5 = class130.getWidget(var5.parentId); // L: 11299
							if (var5 == null) { // L: 11300
								var4 = null; // L: 11301
								break; // L: 11302
							}

							++var7; // L: 11298
						}
					}

					var8 = var4; // L: 11307
					if (var4 == null) { // L: 11308
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8; // L: 11311
					Client.widgetClickX = var1; // L: 11312
					Client.widgetClickY = var2; // L: 11313
					ByteArrayPool.widgetDragDuration = 0; // L: 11314
					Client.isDraggingWidget = false; // L: 11315
					int var9 = Client.menuOptionsCount - 1; // L: 11318
					if (var9 != -1) { // L: 11321
						GrandExchangeEvents.tempMenuAction = new MenuAction(); // L: 11322
						GrandExchangeEvents.tempMenuAction.param0 = Client.menuArguments1[var9]; // L: 11323
						GrandExchangeEvents.tempMenuAction.param1 = Client.menuArguments2[var9]; // L: 11324
						GrandExchangeEvents.tempMenuAction.opcode = Client.menuOpcodes[var9]; // L: 11325
						GrandExchangeEvents.tempMenuAction.identifier = Client.menuIdentifiers[var9]; // L: 11326
						GrandExchangeEvents.tempMenuAction.action = Client.menuActions[var9]; // L: 11327
					}

					return; // L: 11329
				}
			}

		}
	} // L: 11285
}
