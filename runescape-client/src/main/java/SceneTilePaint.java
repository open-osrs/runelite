import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1769216381
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -78289351
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -184307337
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1175452837
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 516518743
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("e")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1480522927
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-117"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 114
		int var4 = 0; // L: 115

		for (int var5 = 0; var5 < var2; ++var5) { // L: 116
			int var6 = var0[var5 + var1] & 255; // L: 117
			if (var6 != 0) { // L: 118
				if (var6 >= 128 && var6 < 160) { // L: 119
					char var7 = class340.cp1252AsciiExtension[var6 - 128]; // L: 120
					if (var7 == 0) { // L: 121
						var7 = '?';
					}

					var6 = var7; // L: 122
				}

				var3[var4++] = (char)var6; // L: 124
			}
		}

		return new String(var3, 0, var4); // L: 126
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "744577981"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5462
		int var4 = var1 >> 7; // L: 5463
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5464
			int var5 = var2; // L: 5465
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5466
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5467
			int var7 = var1 & 127; // L: 5468
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7; // L: 5469
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5470
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 5471
		} else {
			return 0;
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1779675406"
	)
	static final void method4530(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12276
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3113()) { // L: 12277
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12278
				PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 12279
				var4.packetBuffer.writeByte(4 + ScriptEvent.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12280
				var4.packetBuffer.writeByte(var0); // L: 12281
				var4.packetBuffer.writeShort(var1); // L: 12282
				var4.packetBuffer.writeBoolean(var2); // L: 12283
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12284
				Client.packetWriter.addNode(var4); // L: 12285
			}
		}
	} // L: 12286
}
