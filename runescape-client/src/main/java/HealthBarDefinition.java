import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1531205989
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 2070758947
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1307904599
	)
	public int field1597;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1927234279
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 114451643
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2139429703
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1992705999
	)
	public int field1593;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1827284877
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1214012917
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1527087545
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -630601597
	)
	@Export("width")
	public int width;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1019196477
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1593 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-50"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1755851989"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) { // L: 44
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method6464();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method6464();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "2025527166"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = Friend.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 60
				if (var1 != null) { // L: 61
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "579958180"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels) HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = Friend.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 70
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 71
				}

				return var1; // L: 73
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lha;Loy;I)Lhm;",
		garbageValue = "-1113207713"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = Clock.method2590(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}
}
