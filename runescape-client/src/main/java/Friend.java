import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("i")
	boolean field3942;
	@ObfuscatedName("w")
	boolean field3941;

	Friend() {
	} // L: 9

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)I",
		garbageValue = "-1418759266"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field3942 && !var1.field3942) { // L: 16
			return -1;
		} else if (!this.field3942 && var1.field3942) { // L: 17
			return 1;
		} else if (this.field3941 && !var1.field3941) { // L: 18
			return -1;
		} else if (!this.field3941 && var1.field3941) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "-1073614160"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1293240706"
	)
	static void method6057(int var0, int var1) {
		if (class408.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 4098
			Archive var2 = AbstractWorldMapIcon.archive11; // L: 4099
			int var3 = class408.clientPreferences.musicVolume; // L: 4100
			class247.musicPlayerStatus = 1; // L: 4102
			class128.musicTrackArchive = var2; // L: 4103
			FillMode.musicTrackGroupId = var0; // L: 4104
			ArchiveDiskActionHandler.musicTrackFileId = 0; // L: 4105
			class247.musicTrackVolume = var3; // L: 4106
			SecureRandomCallable.musicTrackBoolean = false; // L: 4107
			class247.pcmSampleLength = 10000; // L: 4108
			Client.field710 = true; // L: 4110
		}

	} // L: 4112
}
