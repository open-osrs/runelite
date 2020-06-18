import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lkn;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("m")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkx;Lkx;I)I",
		garbageValue = "239506152"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)[Lgx;",
		garbageValue = "-1951189301"
	)
	static LoginPacket[] method3512() {
		return new LoginPacket[]{LoginPacket.field2346, LoginPacket.field2347, LoginPacket.field2345, LoginPacket.field2350, LoginPacket.field2352, LoginPacket.field2348};
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "17173130"
	)
	public static void method3509() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lic;IIIZB)V",
		garbageValue = "18"
	)
	public static void method3513(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class206.field2439 = 1;
		Huffman.musicTrackArchive = var0;
		class206.musicTrackGroupId = var1;
		MilliClock.musicTrackFileId = var2;
		class206.musicTrackVolume = var3;
		class336.musicTrackBoolean = var4;
		class206.field2442 = 10000;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "41"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field743) {
			class89.method2161();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Client.musicVolume != 0 && !Client.field743) {
			MenuAction.playMusicTrack(2, UserComparator7.archive6, var0, 0, Client.musicVolume, false);
		}

		Client.currentTrackGroupId = var0;
	}
}
