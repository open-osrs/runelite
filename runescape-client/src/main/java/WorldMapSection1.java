import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("in")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1030373785
	)
	static int field2898;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1054024445
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 268591679
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1612610403
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -462292543
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1693287799
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1403534241
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;I)V",
		garbageValue = "-1792723155"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-41287528"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Lkd;",
		garbageValue = "289851355"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-113194936"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "38"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1032077651"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "53"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 215
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 216
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 219
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20733"
	)
	static final void method4839() {
		if (Decimator.ClanChat_inClanChat) { // L: 3827
			if (PcmPlayer.friendsChat != null) { // L: 3828
				PcmPlayer.friendsChat.sort(); // L: 3829
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3832
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3833
				var1.clearIsInFriendsChat(); // L: 3834
			}

			Decimator.ClanChat_inClanChat = false; // L: 3837
		}

	} // L: 3839
}
