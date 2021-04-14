import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class18 extends class14 {
	@ObfuscatedName("gq")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -1941852289
	)
	static int field145;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1821299355
	)
	int field140;
	@ObfuscatedName("o")
	boolean field141;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field140 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field140 = var1.readUnsignedShort(); // L: 184
		this.field141 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method153(this.field140, this.field141); // L: 189
	} // L: 190

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;I)Z",
		garbageValue = "1246242383"
	)
	public static boolean method280(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false;
		} else {
			class370.WorldMapElement_count = var0.getGroupFileCount(35);
			GrandExchangeOfferNameComparator.WorldMapElement_cached = new WorldMapElement[class370.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < class370.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				GrandExchangeOfferNameComparator.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].method4907(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-608674034"
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
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	static void method282() {
		Login.Login_username = Login.Login_username.trim(); // L: 700
		if (Login.Login_username.length() == 0) { // L: 701
			class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 702
		} else {
			long var1 = ObjectSound.method1798(); // L: 706
			int var0;
			if (0L == var1) { // L: 707
				var0 = 5;
			} else {
				var0 = class19.method297(var1, Login.Login_username); // L: 708
			}

			switch(var0) { // L: 709
			case 2:
				class9.setLoginResponseString(Strings.field2961, Strings.field2955, Strings.field3183); // L: 711
				Login.loginIndex = 6; // L: 712
				break;
			case 3:
				class9.setLoginResponseString("", "Error connecting to server.", ""); // L: 721
				break; // L: 722
			case 4:
				class9.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 715
				break; // L: 716
			case 5:
				class9.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 718
				break; // L: 719
			case 6:
				class9.setLoginResponseString("", "Error connecting to server.", ""); // L: 727
				break;
			case 7:
				class9.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 724
			}

		}
	} // L: 703 730

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	static void method283() {
		if (WorldMapAreaData.loadWorlds()) { // L: 1383
			Login.worldSelectOpen = true; // L: 1384
			Login.worldSelectPage = 0; // L: 1385
			Login.worldSelectPagesCount = 0; // L: 1386
		}

	} // L: 1388
}
