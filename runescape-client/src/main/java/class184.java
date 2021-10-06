import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class184 implements WorldMapSection {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1718096021
	)
	int field2090;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1348333705
	)
	int field2091;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -5504601
	)
	int field2092;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 820070789
	)
	int field2093;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1959067269
	)
	int field2098;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 770443607
	)
	int field2095;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -154578139
	)
	int field2096;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1435895249
	)
	int field2097;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1827923729
	)
	int field2100;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1128738871
	)
	int field2099;

	class184() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "2018229058"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2098) {
			var1.regionLowX = this.field2098;
		}

		if (var1.regionHighX < this.field2098) {
			var1.regionHighX = this.field2098;
		}

		if (var1.regionLowY > this.field2095) {
			var1.regionLowY = this.field2095;
		}

		if (var1.regionHighY < this.field2095) {
			var1.regionHighY = this.field2095;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-964071790"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2090 && var1 < this.field2090 + this.field2091) {
			return var2 >= (this.field2092 << 6) + (this.field2096 << 3) && var2 <= (this.field2092 << 6) + (this.field2096 << 3) + 7 && var3 >= (this.field2093 << 6) + (this.field2097 << 3) && var3 <= (this.field2093 << 6) + (this.field2097 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "381612084"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2098 << 6) + (this.field2100 << 3) && var1 <= (this.field2098 << 6) + (this.field2100 << 3) + 7 && var2 >= (this.field2095 << 6) + (this.field2099 << 3) && var2 <= (this.field2095 << 6) + (this.field2099 << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "88"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2098 * 64 - this.field2092 * 64) + (this.field2100 * 8 - this.field2096 * 8), var3 + (this.field2095 * 64 - this.field2093 * 64) + (this.field2099 * 8 - this.field2097 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lic;",
		garbageValue = "2033247854"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2092 * 64 - this.field2098 * 64 + (this.field2096 * 8 - this.field2100 * 8) + var1;
			int var4 = var2 + (this.field2093 * 64 - this.field2095 * 64) + (this.field2097 * 8 - this.field2099 * 8);
			return new Coord(this.field2090, var3, var4);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "4"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2090 = var1.readUnsignedByte();
		this.field2091 = var1.readUnsignedByte();
		this.field2092 = var1.readUnsignedShort();
		this.field2096 = var1.readUnsignedByte();
		this.field2093 = var1.readUnsignedShort();
		this.field2097 = var1.readUnsignedByte();
		this.field2098 = var1.readUnsignedShort();
		this.field2100 = var1.readUnsignedByte();
		this.field2095 = var1.readUnsignedShort();
		this.field2099 = var1.readUnsignedByte();
		this.method3765();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3765() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "1"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class386.World_worlds[var6];
			class386.World_worlds[var6] = class386.World_worlds[var1];
			class386.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (Decimator.method1024(class386.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class386.World_worlds[var9];
					class386.World_worlds[var9] = class386.World_worlds[var7];
					class386.World_worlds[var7++] = var10;
				}
			}

			class386.World_worlds[var1] = class386.World_worlds[var7];
			class386.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-3304"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapDecorationType.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
