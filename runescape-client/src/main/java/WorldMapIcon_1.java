import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1692545293
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1380082375
	)
	@Export("element")
	int element;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1584169743
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -853528965
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lju;Lju;ILhw;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1162816642"
	)
	@Export("init")
	void init() {
		this.element = class148.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class78.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class78.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1255702565"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhm;",
		garbageValue = "-577826789"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21504"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1225820190"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Lbb;III)V",
		garbageValue = "-77644822"
	)
	static final void method4385(MenuAction var0, int var1, int var2) {
		Decimator.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2); // L: 9015
	} // L: 9016

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1016164207"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2857, Client.packetWriter.isaacCipher); // L: 12504
		var0.packetBuffer.writeByte(0); // L: 12505
		Client.packetWriter.addNode(var0); // L: 12506
	} // L: 12507
}
