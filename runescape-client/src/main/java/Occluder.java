import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1913259521
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -743836359
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1643298167
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1894194977
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -741467087
	)
	@Export("type")
	int type;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 360875993
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1324054405
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1977577685
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 690008559
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 638283975
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1747045819
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1792742847
	)
	int field2470;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 963802065
	)
	int field2472;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1423983461
	)
	int field2466;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 942298147
	)
	int field2467;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -740983489
	)
	int field2468;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 336673989
	)
	int field2462;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 680765335
	)
	int field2473;

	Occluder() {
	} // L: 23

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-49313522"
	)
	static final void method4354() {
		PacketBufferNode var0 = EnumComposition.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 11980
		Client.packetWriter.addNode(var0); // L: 11981
		Interpreter.field842 = true; // L: 11982

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11983
			if (var1.type == 0 || var1.type == 3) { // L: 11984
				MusicPatchPcmStream.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11986
			ChatChannel.invalidateWidget(Client.meslayerContinueWidget); // L: 11987
			Client.meslayerContinueWidget = null; // L: 11988
		}

		Interpreter.field842 = false; // L: 11990
	} // L: 11991
}
