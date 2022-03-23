import java.awt.Desktop;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("x")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ab")
	static Image field56;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -1629123777
	)
	@Export("menuWidth")
	static int menuWidth;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lj;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 303
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 312
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field65 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 318
		} catch (CertificateException var7) { // L: 320
			throw new IOException(var7); // L: 321
		}
	} // L: 323

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 327
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZS)V",
		garbageValue = "18142"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 47
				} catch (Exception var4) { // L: 29
				}
			}

			if (class29.field169.startsWith("win")) { // L: 31
				LoginScreenAnimation.method2247(var0, 0); // L: 33
			} else if (class29.field169.startsWith("mac")) { // L: 37
				class154.method3128(var0, 1, "openjs"); // L: 38
			} else {
				LoginScreenAnimation.method2247(var0, 2); // L: 41
			}
		} else {
			LoginScreenAnimation.method2247(var0, 3); // L: 44
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V",
		garbageValue = "-710158938"
	)
	static void method116(Float var0, Float var1) {
		var1 = 1.0F - var1; // L: 305
		if (var0 < 0.0F) { // L: 306
			var0 = 0.0F;
		}

		if (var1 < 0.0F) { // L: 307
			var1 = 0.0F;
		}

		if (var0 > 1.0F || var1 > 1.0F) { // L: 308
			float var2 = (float)((double)(var0 * (var0 - 2.0F + var1)) + (double)var1 * ((double)var1 - 2.0D) + 1.0D); // L: 309
			if (class114.field1396 + var2 > 0.0F) { // L: 310
				class144.method3022(var0, var1); // L: 311
			}
		}

		var1 = 1.0F - var1; // L: 314
	} // L: 315

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1930297149"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = FriendSystem.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5510
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 5511
			var7 = FriendSystem.scene.getObjectFlags(var0, var1, var2, var5); // L: 5512
			var8 = var7 >> 6 & 3; // L: 5513
			var9 = var7 & 31; // L: 5514
			var10 = var3; // L: 5515
			if (class162.method3274(var5)) { // L: 5516
				var10 = var4;
			}

			int[] var11 = MusicPatchNode2.sceneMinimapSprite.pixels; // L: 5517
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5518
			var13 = class121.Entity_unpackID(var5); // L: 5519
			ObjectComposition var14 = class116.getObjectDefinition(var13); // L: 5520
			if (var14.mapSceneId != -1) { // L: 5521
				IndexedSprite var15 = Message.mapSceneSprites[var14.mapSceneId]; // L: 5522
				if (var15 != null) { // L: 5523
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5524
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5525
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 5526
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5530
					if (var8 == 0) { // L: 5531
						var11[var12] = var10; // L: 5532
						var11[var12 + 512] = var10; // L: 5533
						var11[var12 + 1024] = var10; // L: 5534
						var11[var12 + 1536] = var10; // L: 5535
					} else if (var8 == 1) { // L: 5537
						var11[var12] = var10; // L: 5538
						var11[var12 + 1] = var10; // L: 5539
						var11[var12 + 2] = var10; // L: 5540
						var11[var12 + 3] = var10; // L: 5541
					} else if (var8 == 2) { // L: 5543
						var11[var12 + 3] = var10; // L: 5544
						var11[var12 + 512 + 3] = var10; // L: 5545
						var11[var12 + 1024 + 3] = var10; // L: 5546
						var11[var12 + 1536 + 3] = var10; // L: 5547
					} else if (var8 == 3) { // L: 5549
						var11[var12 + 1536] = var10; // L: 5550
						var11[var12 + 1536 + 1] = var10; // L: 5551
						var11[var12 + 1536 + 2] = var10; // L: 5552
						var11[var12 + 1536 + 3] = var10; // L: 5553
					}
				}

				if (var9 == 3) { // L: 5556
					if (var8 == 0) { // L: 5557
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5558
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5559
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5560
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5562
					if (var8 == 3) { // L: 5563
						var11[var12] = var10; // L: 5564
						var11[var12 + 512] = var10; // L: 5565
						var11[var12 + 1024] = var10; // L: 5566
						var11[var12 + 1536] = var10; // L: 5567
					} else if (var8 == 0) { // L: 5569
						var11[var12] = var10; // L: 5570
						var11[var12 + 1] = var10; // L: 5571
						var11[var12 + 2] = var10; // L: 5572
						var11[var12 + 3] = var10; // L: 5573
					} else if (var8 == 1) { // L: 5575
						var11[var12 + 3] = var10; // L: 5576
						var11[var12 + 512 + 3] = var10; // L: 5577
						var11[var12 + 1024 + 3] = var10; // L: 5578
						var11[var12 + 1536 + 3] = var10; // L: 5579
					} else if (var8 == 2) { // L: 5581
						var11[var12 + 1536] = var10; // L: 5582
						var11[var12 + 1536 + 1] = var10; // L: 5583
						var11[var12 + 1536 + 2] = var10; // L: 5584
						var11[var12 + 1536 + 3] = var10; // L: 5585
					}
				}
			}
		}

		var5 = FriendSystem.scene.getGameObjectTag(var0, var1, var2); // L: 5590
		if (var5 != 0L) { // L: 5591
			var7 = FriendSystem.scene.getObjectFlags(var0, var1, var2, var5); // L: 5592
			var8 = var7 >> 6 & 3; // L: 5593
			var9 = var7 & 31; // L: 5594
			var10 = class121.Entity_unpackID(var5); // L: 5595
			ObjectComposition var24 = class116.getObjectDefinition(var10); // L: 5596
			int var19;
			if (var24.mapSceneId != -1) { // L: 5597
				IndexedSprite var20 = Message.mapSceneSprites[var24.mapSceneId]; // L: 5598
				if (var20 != null) { // L: 5599
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5600
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5601
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 5602
				}
			} else if (var9 == 9) { // L: 5605
				var12 = 15658734; // L: 5606
				if (class162.method3274(var5)) { // L: 5607
					var12 = 15597568;
				}

				int[] var18 = MusicPatchNode2.sceneMinimapSprite.pixels; // L: 5608
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5609
				if (var8 != 0 && var8 != 2) { // L: 5610
					var18[var19] = var12; // L: 5617
					var18[var19 + 1 + 512] = var12; // L: 5618
					var18[var19 + 1024 + 2] = var12; // L: 5619
					var18[var19 + 1536 + 3] = var12; // L: 5620
				} else {
					var18[var19 + 1536] = var12; // L: 5611
					var18[var19 + 1 + 1024] = var12; // L: 5612
					var18[var19 + 512 + 2] = var12; // L: 5613
					var18[var19 + 3] = var12; // L: 5614
				}
			}
		}

		var5 = FriendSystem.scene.getFloorDecorationTag(var0, var1, var2); // L: 5624
		if (0L != var5) { // L: 5625
			var7 = class121.Entity_unpackID(var5); // L: 5626
			ObjectComposition var21 = class116.getObjectDefinition(var7); // L: 5627
			if (var21.mapSceneId != -1) { // L: 5628
				IndexedSprite var22 = Message.mapSceneSprites[var21.mapSceneId]; // L: 5629
				if (var22 != null) { // L: 5630
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5631
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5632
					var22.drawAt(var1 * 4 + var10 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 5633
				}
			}
		}

	} // L: 5637

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1139609562"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (MusicPatchNode2.loadInterface(var0)) { // L: 9590
			ClanSettings.field1622 = null; // L: 9597
			InterfaceParent.drawInterface(EnumComposition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9598
			if (ClanSettings.field1622 != null) { // L: 9599
				InterfaceParent.drawInterface(ClanSettings.field1622, -1412584499, var1, var2, var3, var4, NPC.field1253, Projectile.field944, var7); // L: 9600
				ClanSettings.field1622 = null; // L: 9601
			}

		} else {
			if (var7 != -1) { // L: 9591
				Client.field564[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9593
					Client.field564[var8] = true;
				}
			}

		}
	} // L: 9595 9603

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;I)Ljava/lang/String;",
		garbageValue = "1166958975"
	)
	static String method114(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10106
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10107
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10109
					if (var3 == -1) { // L: 10110
						break;
					}

					var0 = var0.substring(0, var3) + NPC.method2367(WorldMapAreaData.method5086(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10111
				}
			}
		}

		return var0; // L: 10115
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "831054462"
	)
	static void method115() {
		if (Client.oculusOrbState == 1) { // L: 11911
			Client.field602 = true; // L: 11912
		}

	} // L: 11914
}
