import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field1239;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llr;Llr;I)I",
		garbageValue = "1892069062"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjy;IIIZB)V",
		garbageValue = "45"
	)
	public static void method2162(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class234.musicPlayerStatus = 1;
		class234.musicTrackArchive = var1;
		class234.musicTrackGroupId = var2;
		UserComparator6.musicTrackFileId = var3;
		HorizontalAlignment.musicTrackVolume = var4;
		EnumComposition.musicTrackBoolean = var5;
		ClanChannel.pcmSampleLength = var0;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Ljs;",
		garbageValue = "-1802786302"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, FriendsChat.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class307.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1210824872"
	)
	static String method2167(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (SpotAnimationDefinition.field1660 != null) {
			var3 = "/p=" + SpotAnimationDefinition.field1660;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + GrandExchangeOfferWorldComparator.clientLanguage + "/a=" + class407.field4313 + var3 + "/";
	}
}
