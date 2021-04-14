import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1980734893
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -429442875
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2006264172"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method4440(var1) || this.archive.method4458(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-237450232"
	)
	static IndexedSprite method2076() {
		IndexedSprite var0 = new IndexedSprite(); // L: 203
		var0.width = class395.SpriteBuffer_spriteWidth; // L: 204
		var0.height = class395.SpriteBuffer_spriteHeight; // L: 205
		var0.xOffset = class0.SpriteBuffer_xOffsets[0]; // L: 206
		var0.yOffset = Interpreter.SpriteBuffer_yOffsets[0]; // L: 207
		var0.subWidth = class395.SpriteBuffer_spriteWidths[0]; // L: 208
		var0.subHeight = class157.SpriteBuffer_spriteHeights[0]; // L: 209
		var0.palette = Varps.SpriteBuffer_spritePalette; // L: 210
		var0.pixels = class223.SpriteBuffer_pixels[0]; // L: 211
		WorldMapDecorationType.method4370(); // L: 212
		return var0; // L: 213
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-231921181"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11522
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher); // L: 11524
			var1.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var0)); // L: 11525
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11526
			Client.packetWriter.addNode(var1); // L: 11527
		}
	} // L: 11528
}
