import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static AbstractArchive field1806;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1092173993
	)
	public int field1809;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1407785135
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 831494047
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1486958543
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 11578163
	)
	public int field1814;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 741311809
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 278570643
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1893029459
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2065890545
	)
	@Export("width")
	public int width;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -661758629
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1;
		this.field1814 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	} // L: 29

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 48
			if (var2 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var2); // L: 50
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "2132103547"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort(); // L: 56
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) { // L: 61
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte(); // L: 63
		} else if (var2 == 7) { // L: 65
			this.frontSpriteID = var1.method7352();
		} else if (var2 == 8) { // L: 66
			this.backSpriteID = var1.method7352();
		} else if (var2 == 11) { // L: 67
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 71

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "1989731460"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) { // L: 76
				return var1;
			} else {
				var1 = class126.SpriteBuffer_getSprite(field1806, this.frontSpriteID, 0); // L: 77
				if (var1 != null) { // L: 78
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lpt;",
		garbageValue = "620286670"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = class126.SpriteBuffer_getSprite(field1806, this.backSpriteID, 0); // L: 87
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 88
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lft;",
		garbageValue = "0"
	)
	public static VarcInt method3244(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method3202(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3246() {
		ParamComposition.ParamDefinition_cached.clear(); // L: 68
	} // L: 69

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1677454139"
	)
	static final void method3225(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 11970
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2982()) { // L: 11971
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11972
				PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2880, Client.packetWriter.isaacCipher); // L: 11973
				var4.packetBuffer.writeByte(4 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 11974
				var4.packetBuffer.writeByte(var0); // L: 11975
				var4.packetBuffer.writeShort(var1); // L: 11976
				var4.packetBuffer.writeBoolean(var2); // L: 11977
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 11978
				Client.packetWriter.addNode(var4); // L: 11979
			}
		}
	} // L: 11980
}
