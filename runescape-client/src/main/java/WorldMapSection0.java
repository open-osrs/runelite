import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1900849309
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1837492707
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1798651577
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 921187823
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -131099529
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2025421843
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1814738027
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1792733085
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1592563299
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1478309445
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 908411651
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1036645465
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1518275853
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -246372361
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 53
			return null; // L: 54
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 62
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 65
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 66
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087257379"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "717728742"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ViewportMouse.archive12.takeFile(var0, 0); // L: 27
			if (var2 == null) { // L: 28
				return null; // L: 29
			} else {
				var1 = ClientPacket.newScript(var2); // L: 31
				Script.Script_cached.put(var1, (long)var0); // L: 32
				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lll;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-111"
	)
	static String method307(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : (String)var3.obj; // L: 35 36
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1132603315"
	)
	public static void method323(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 193
			try {
				Buffer var1 = new Buffer(4); // L: 195
				var1.writeByte(var0 ? 2 : 3); // L: 196
				var1.writeMedium(0); // L: 197
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 198
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 202
				} catch (Exception var3) { // L: 204
				}

				++NetCache.NetCache_ioExceptions; // L: 205
				NetCache.NetCache_socket = null; // L: 206
			}

		}
	} // L: 208

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public static String method328(String var0) {
		int var1 = var0.length(); // L: 155
		char[] var2 = new char[var1]; // L: 156
		byte var3 = 2; // L: 157

		for (int var4 = 0; var4 < var1; ++var4) { // L: 158
			char var5 = var0.charAt(var4); // L: 159
			if (var3 == 0) { // L: 160
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 161
				var5 = WorldMapSection2.method426(var5);
			}

			if (Character.isLetter(var5)) { // L: 162
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 163
				if (Character.isSpaceChar(var5)) { // L: 164
					if (var3 != 2) { // L: 165
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 167
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 168
		}

		return new String(var2); // L: 170
	}
}
