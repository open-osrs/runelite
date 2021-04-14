import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		longValue = 6142810320644924851L
	)
	static long field1272;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		longValue = 4363745212267804777L
	)
	static long field1277;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1723297803
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -802786453
	)
	@Export("health")
	int health;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1934136823
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1369623823
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2137849778"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1311777255"
	)
	static final void method2180(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 182
		class69.addGameMessage(30, "", var1); // L: 184
	} // L: 186

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-481083146"
	)
	static final void method2181() {
		if (Client.logoutTimer > 0) { // L: 2438
			class23.logOut(); // L: 2439
		} else {
			Client.timer.method5578(); // L: 2442
			class20.updateGameState(40); // L: 2443
			Client.field686 = Client.packetWriter.getSocket(); // L: 2444
			Client.packetWriter.removeSocket(); // L: 2445
		}
	} // L: 2440 2446

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "59"
	)
	static void method2175(int var0, int var1) {
		if (Login.clientPreferences.musicVolume != 0 && var0 != -1) { // L: 3103
			PacketBufferNode.method3898(class10.archive11, var0, 0, Login.clientPreferences.musicVolume, false); // L: 3104
			Client.field842 = true; // L: 3105
		}

	} // L: 3107
}
