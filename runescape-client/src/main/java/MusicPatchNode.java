import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class MusicPatchNode extends Node {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2053658771
	)
	int field2484;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	MusicPatch patch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	RawSound rawSound;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	MusicPatchNode2 field2472;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 227260251
	)
	int field2473;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -648254967
	)
	int field2474;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 479011763
	)
	int field2475;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2012218471
	)
	int field2481;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1638523819
	)
	int field2477;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -585277595
	)
	int field2487;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 3127069
	)
	int field2479;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1851085
	)
	int field2480;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2137879269
	)
	int field2478;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 310302327
	)
	int field2482;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -308754063
	)
	int field2483;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1275885009
	)
	int field2489;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 586999213
	)
	int field2485;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1374963465
	)
	int field2469;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	RawPcmStream stream;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 993070793
	)
	int field2488;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -178085679
	)
	int field2486;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10823"
	)
	void method3926() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2472 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljd;",
		garbageValue = "-111"
	)
	public static HitSplatDefinition method3929(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-27"
	)
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 10695
			PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 10697
			var1.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0)); // L: 10698
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 10699
			Client.packetWriter.addNode(var1); // L: 10700
		}
	} // L: 10701
}
