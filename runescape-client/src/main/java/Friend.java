import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("m")
	boolean field3655;
	@ObfuscatedName("o")
	boolean field3654;

	Friend() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkl;I)I",
		garbageValue = "-1139109616"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3655 && !var1.field3655) {
			return -1;
		} else if (!this.field3655 && var1.field3655) {
			return 1;
		} else if (this.field3654 && !var1.field3654) {
			return -1;
		} else if (!this.field3654 && var1.field3654) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)I",
		garbageValue = "334051838"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "-463373379"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			InvDefinition.method4523(var0.isMembersOnly());
		}

		class169.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class90.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		Client.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		WorldMapLabel.port3 = class90.port1;
	}
}
