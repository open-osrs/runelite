import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-776394962"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1048639306"
	)
	static int method3558(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-878017920"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L); // L: 34
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "18"
	)
	static int method3557(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1535987208"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1676
			if (Client.gameState == 0) { // L: 1677
				ByteArrayPool.client.method1112();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1678
				Client.loginState = 0; // L: 1679
				Client.field947 = 0; // L: 1680
				Client.field715 = 0; // L: 1681
				Client.timer.method5153(var0); // L: 1682
				if (var0 != 20) { // L: 1683
					Message.method1314(false);
				}
			}

			if (var0 != 20 && var0 != 40 && MouseRecorder.field615 != null) { // L: 1685 1686
				MouseRecorder.field615.close(); // L: 1687
				MouseRecorder.field615 = null; // L: 1688
			}

			if (Client.gameState == 25) { // L: 1691
				Client.field722 = 0; // L: 1692
				Client.field734 = 0; // L: 1693
				Client.field735 = 1; // L: 1694
				Client.field848 = 0; // L: 1695
				Client.field737 = 1; // L: 1696
			}

			if (var0 != 5 && var0 != 10) { // L: 1698
				if (var0 == 20) { // L: 1701
					HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1702
				} else if (var0 == 11) { // L: 1704
					HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, false, 4); // L: 1705
				} else if (Login.clearLoginScreen) { // L: 1708
					Tiles.titleboxSprite = null; // L: 1709
					Login.titlebuttonSprite = null; // L: 1710
					class278.runesSprite = null; // L: 1711
					Login.leftTitleSprite = null; // L: 1712
					Login.rightTitleSprite = null; // L: 1713
					SecureRandomFuture.logoSprite = null; // L: 1714
					DefaultsGroup.title_muteSprite = null; // L: 1715
					Login.options_buttons_0Sprite = null; // L: 1716
					Login.options_buttons_2Sprite = null; // L: 1717
					EnumDefinition.worldSelectBackSprites = null; // L: 1718
					FaceNormal.worldSelectFlagSprites = null; // L: 1719
					class301.worldSelectArrows = null; // L: 1720
					GameObject.worldSelectStars = null; // L: 1721
					MouseHandler.field523 = null; // L: 1722
					Login.loginScreenRunesAnimation.method1917(); // L: 1723
					VertexNormal.method3133(2); // L: 1724
					WorldMapSection0.method323(true); // L: 1725
					Login.clearLoginScreen = false; // L: 1726
				}
			} else {
				HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, true, 0); // L: 1699
			}

			Client.gameState = var0; // L: 1728
		}
	} // L: 1729
}
