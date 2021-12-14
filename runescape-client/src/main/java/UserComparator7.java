import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 1289611995135137433L
	)
	public static long field1319;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -427505933
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1941000053
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;I)I",
		garbageValue = "742897399"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1366394197"
	)
	static final int method2518() {
		if (SecureRandomFuture.clientPreferences.roofsHidden) {
			return class20.Client_plane;
		} else {
			int var0 = FaceNormal.getTileHeight(cameraX, UserComparator10.cameraZ, class20.Client_plane);
			return var0 - AbstractByteArrayCopier.cameraY < 800 && (Tiles.Tiles_renderFlags[class20.Client_plane][cameraX >> 7][UserComparator10.cameraZ >> 7] & 4) != 0 ? class20.Client_plane : 3;
		}
	}
}
