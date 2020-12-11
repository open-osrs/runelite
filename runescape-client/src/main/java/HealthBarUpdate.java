import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 942035737
	)
	@Export("musicTrackGroupId")
	static int musicTrackGroupId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1928856017
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 187911795
	)
	@Export("health")
	int health;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1933333849
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -280255585
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2048204816"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lie;",
		garbageValue = "-68"
	)
	public static HealthBarDefinition method1826(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = class225.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "307117656"
	)
	static int method1823(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3259
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Z",
		garbageValue = "-1439133446"
	)
	static final boolean method1825(Widget var0) {
		int var1 = var0.contentType; // L: 10843
		if (var1 == 205) { // L: 10844
			Client.logoutTimer = 250; // L: 10845
			return true; // L: 10846
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 10848
				var2 = (var1 - 300) / 2; // L: 10849
				var3 = var1 & 1; // L: 10850
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 10851
			}

			if (var1 >= 314 && var1 <= 323) { // L: 10853
				var2 = (var1 - 314) / 2; // L: 10854
				var3 = var1 & 1; // L: 10855
				Client.playerAppearance.method4043(var2, var3 == 1); // L: 10856
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 10858
			}

			if (var1 == 325) { // L: 10859
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 10860
				PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 10862
				Client.playerAppearance.write(var4.packetBuffer); // L: 10863
				Client.packetWriter.addNode(var4); // L: 10864
				return true; // L: 10865
			} else {
				return false; // L: 10867
			}
		}
	}
}
