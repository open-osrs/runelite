import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2133335865
	)
	@Export("pcmSampleLength")
	static int pcmSampleLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2029810381
	)
	static int field313;
	@ObfuscatedName("bd")
	static String field317;
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1765160595
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 526004841
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1672936937
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -73066687
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1072528651
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1416924829
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 24
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 54
		this.planes = var1.readUnsignedByte(); // L: 55
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-154945566"
	)
	@Export("postRead")
	void postRead() {
	} // L: 63

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1319638735"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		WorldMapRectangle.logOut(); // L: 2940
		switch(var0) { // L: 2941
		case 1:
			Login.loginIndex = 24; // L: 2950
			GameShell.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2951
			break;
		case 2:
			Messages.method2285(); // L: 2944
		}

	} // L: 2956

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-546925347"
	)
	static boolean method624(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 8551
	}

	@ObfuscatedName("kp")
	static final void method626(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 10642
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 10643
		ItemDefinition.ItemDefinition_cachedSprites.clear(); // L: 10645
		Timer.clientPreferences.field1057 = var0; // L: 10647
		GrandExchangeOffer.savePreferences(); // L: 10648
	} // L: 10649

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "71"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11102
		short[] var2 = new short[16]; // L: 11103
		int var3 = 0; // L: 11104

		for (int var4 = 0; var4 < Varcs.ItemDefinition_fileCount; ++var4) { // L: 11105
			ItemDefinition var9 = SecureRandomCallable.ItemDefinition_get(var4); // L: 11106
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11107 11108 11109
				if (var3 >= 250) { // L: 11110
					PacketBufferNode.foundItemIdCount = -1; // L: 11111
					UrlRequest.foundItemIds = null; // L: 11112
					return; // L: 11113
				}

				if (var3 >= var2.length) { // L: 11115
					short[] var6 = new short[var2.length * 2]; // L: 11116

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11117
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11118
				}

				var2[var3++] = (short)var4; // L: 11120
			}
		}

		UrlRequest.foundItemIds = var2; // L: 11122
		NetCache.foundItemIndex = 0; // L: 11123
		PacketBufferNode.foundItemIdCount = var3; // L: 11124
		String[] var8 = new String[PacketBufferNode.foundItemIdCount]; // L: 11125

		for (int var5 = 0; var5 < PacketBufferNode.foundItemIdCount; ++var5) { // L: 11126
			var8[var5] = SecureRandomCallable.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = UrlRequest.foundItemIds; // L: 11127
		class89.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 11129
	} // L: 11131
}
