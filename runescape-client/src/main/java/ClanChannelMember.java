import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("g")
	static int[][][] field1504;
	@ObfuscatedName("c")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1187334187
	)
	@Export("world")
	public int world;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILpi;B)Lfe;",
		garbageValue = "-47"
	)
	public static class160 method2777(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class160 var5 = new class160(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1732 != null && var7.length == var5.field1732.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1732[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.field1738 != null && var7.length == var5.field1738.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1738[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1180078382"
	)
	public static int method2778(CharSequence var0) {
		return MusicPatchNode.method5293(var0, 10, true);
	}
}
