import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1145827779
	)
	int field2970;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	MusicPatchNode2 field2972;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1760015417
	)
	int field2971;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -967389441
	)
	int field2986;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1294952877
	)
	int field2973;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1778257623
	)
	int field2979;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 263964623
	)
	int field2975;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -614430191
	)
	int field2976;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -871521907
	)
	int field2977;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -105685889
	)
	int field2978;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -323480327
	)
	int field2987;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 252790825
	)
	int field2980;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -875778091
	)
	int field2985;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2005976257
	)
	int field2981;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1168824453
	)
	int field2983;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1881024645
	)
	int field2984;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2041811507
	)
	int field2982;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1634328239
	)
	int field2988;

	MusicPatchNode() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "290970770"
	)
	void method4850() {
		this.patch = null;
		this.rawSound = null;
		this.field2972 = null;
		this.stream = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loq;II)Z",
		garbageValue = "1821740156"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1246[var1] != null) {
					var11.read(Players.field1246[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1245[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - FloorOverlayDefinition.baseX, (var10 << 13) + var4 - class320.baseY);
				var11.field1074 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var7 + var6 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1415302167"
	)
	static int method4849(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field831 - 7.0D) * 256.0D);
	}
}
