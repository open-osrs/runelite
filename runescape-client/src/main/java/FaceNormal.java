import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -552913965
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1122069433
	)
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -256548507
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([Lgt;II)Lgt;",
		garbageValue = "-707018179"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enumerated var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "223741723"
	)
	static String method3392() {
		return NetSocket.clientPreferences.hideUsername ? WorldMapRegion.method613(Login.Login_username) : Login.Login_username;
	}
}
