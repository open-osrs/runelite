import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1947644497
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -724242769
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1400111239
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1382865909
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -119640959
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1117734401
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1105910093
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 36977951
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2062636297
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -274522163
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1864837189
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1783869469
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1537573725
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1637940697
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "206142404"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2136306285"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "634207470"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lij;",
		garbageValue = "43"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "342058266"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-455189067"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1412481082"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lni;",
		garbageValue = "2108121521"
	)
	public static class376 method3597(int var0) {
		int var1 = class374.field4154[var0];
		if (var1 == 1) {
			return class376.field4163;
		} else if (var1 == 2) {
			return class376.field4164;
		} else {
			return var1 == 3 ? class376.field4159 : null;
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1217280037"
	)
	static final void method3580() {
		if (Client.logoutTimer > 0) {
			class144.logOut();
		} else {
			Client.timer.method5658();
			class16.updateGameState(40);
			Client.field644 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
