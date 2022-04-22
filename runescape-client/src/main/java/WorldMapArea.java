import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1619651077
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("i")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -988816927
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 865751719
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1477331149
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -194565457
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1241290265
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 702405047
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("r")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("p")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0; // L: 16
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0; // L: 18
		this.isMain = false; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "61"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte(); // L: 28
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Lhs;",
		garbageValue = "-156804208"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)MusicPatchPcmStream.findEnumerated(WorldMapSectionType.method4305(), var2); // L: 41
		Object var4 = null; // L: 42
		switch(var3.type) { // L: 43
		case 0:
			var4 = new class204(); // L: 48
			break; // L: 49
		case 1:
			var4 = new WorldMapSection0(); // L: 51
			break; // L: 52
		case 2:
			var4 = new WorldMapSection1(); // L: 45
			break;
		case 3:
			var4 = new WorldMapSection2(); // L: 54
			break; // L: 55
		default:
			throw new IllegalStateException(""); // L: 57
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1632482006"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "87299869"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 76
		int var4 = var2 / 64; // L: 77
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 78
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 79
				Iterator var5 = this.sections.iterator(); // L: 80

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 88
					}

					var6 = (WorldMapSection)var5.next(); // L: 81
				} while(!var6.containsPosition(var1, var2)); // L: 83

				return true; // L: 84
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1977712276"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lks;",
		garbageValue = "32"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 104

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 112
			}

			var4 = (WorldMapSection)var3.next(); // L: 105
		} while(!var4.containsPosition(var1, var2)); // L: 107

		return var4.coord(var1, var2); // L: 108
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1245875017"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605690613"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-616797466"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2076460427"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-14972"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1206801353"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1480409778"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-916655253"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1639961591"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1377567233"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2107638017"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "622710860"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-27476"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "2133331168"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1973093508"
	)
	static File method4036(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 123
		class28.JagexCache_locationFile = new File(NetSocket.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 124
		String var4 = null; // L: 125
		String var5 = null; // L: 126
		boolean var6 = false; // L: 127
		File var22;
		if (class28.JagexCache_locationFile.exists()) { // L: 128
			try {
				AccessFile var7 = new AccessFile(class28.JagexCache_locationFile, "rw", 10000L); // L: 131

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 132 133 136
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 134
					if (var9 == -1) { // L: 135
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 138
				var9 = var8.readUnsignedByte(); // L: 139
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 140
				}

				int var10 = 0; // L: 141
				if (var9 > 1) { // L: 142
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 143
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 144
					if (var10 == 1) { // L: 145
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 148
					if (var10 == 1) { // L: 149
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 151
			} catch (IOException var20) { // L: 153
				var20.printStackTrace(); // L: 154
			}

			if (var4 != null) { // L: 156
				var22 = new File(var4); // L: 157
				if (!var22.exists()) { // L: 158
					var4 = null; // L: 159
				}
			}

			if (var4 != null) { // L: 162
				var22 = new File(var4, "test.dat"); // L: 163
				if (!AbstractWorldMapIcon.method4405(var22, true)) { // L: 164
					var4 = null; // L: 165
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 169
			label125:
			for (int var15 = 0; var15 < class216.cacheSubPaths.length; ++var15) { // L: 170
				for (int var16 = 0; var16 < ItemContainer.cacheParentPaths.length; ++var16) { // L: 171
					File var17 = new File(ItemContainer.cacheParentPaths[var16] + class216.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 172
					if (var17.exists() && AbstractWorldMapIcon.method4405(new File(var17, "test.dat"), true)) { // L: 173 174
						var4 = var17.toString(); // L: 175
						var6 = true; // L: 176
						break label125; // L: 177
					}
				}
			}
		}

		if (var4 == null) { // L: 183
			var4 = NetSocket.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 184
			var6 = true; // L: 185
		}

		if (var5 != null) { // L: 187
			File var21 = new File(var5); // L: 188
			var22 = new File(var4); // L: 189

			try {
				File[] var23 = var21.listFiles(); // L: 191
				File[] var18 = var23; // L: 193

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 194
					File var12 = var18[var11];
					File var13 = new File(var22, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			class16.method194(new File(var4), (File)null);
		}

		return new File(var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1294916560"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 195
		var1.offset = var0.length - 2; // L: 196
		class451.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 197
		class451.SpriteBuffer_xOffsets = new int[class451.SpriteBuffer_spriteCount]; // L: 198
		class271.SpriteBuffer_yOffsets = new int[class451.SpriteBuffer_spriteCount]; // L: 199
		class451.SpriteBuffer_spriteWidths = new int[class451.SpriteBuffer_spriteCount]; // L: 200
		class451.SpriteBuffer_spriteHeights = new int[class451.SpriteBuffer_spriteCount]; // L: 201
		FriendLoginUpdate.SpriteBuffer_pixels = new byte[class451.SpriteBuffer_spriteCount][]; // L: 202
		var1.offset = var0.length - 7 - class451.SpriteBuffer_spriteCount * 8; // L: 203
		class451.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 204
		class451.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 205
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 206

		int var3;
		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 207
			class451.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 208
			class271.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 209
			class451.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 210
			class451.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class451.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 211
		NetFileRequest.SpriteBuffer_spritePalette = new int[var2]; // L: 212

		for (var3 = 1; var3 < var2; ++var3) { // L: 213
			NetFileRequest.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 214
			if (NetFileRequest.SpriteBuffer_spritePalette[var3] == 0) { // L: 215
				NetFileRequest.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 217

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 218
			int var4 = class451.SpriteBuffer_spriteWidths[var3]; // L: 219
			int var5 = class451.SpriteBuffer_spriteHeights[var3]; // L: 220
			int var6 = var4 * var5; // L: 221
			byte[] var7 = new byte[var6]; // L: 222
			FriendLoginUpdate.SpriteBuffer_pixels[var3] = var7; // L: 223
			int var8 = var1.readUnsignedByte(); // L: 224
			int var9;
			if (var8 == 0) { // L: 225
				for (var9 = 0; var9 < var6; ++var9) { // L: 226
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 228
				for (var9 = 0; var9 < var4; ++var9) { // L: 229
					for (int var10 = 0; var10 < var5; ++var10) { // L: 230
						var7[var9 + var10 * var4] = var1.readByte(); // L: 231
					}
				}
			}
		}

	} // L: 236
}
