import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -591382375
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1850182953
	)
	@Export("health")
	int health;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -733805573
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2105811825
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2090689234"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "60"
	)
	static boolean method1870(String var0) {
		if (var0 == null) { // L: 35
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "-736266811"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIIIIII)V",
		garbageValue = "1972730471"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 112
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 113

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 115
				if (var7 == 0) { // L: 116
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -Occluder.method3412(var4 + var2 + 932731, var3 + 556238 + var5) * 8; // L: 117
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 118
					}
					break;
				}

				if (var7 == 1) { // L: 121
					int var8 = var0.readUnsignedByte(); // L: 122
					if (var8 == 1) { // L: 123
						var8 = 0;
					}

					if (var1 == 0) { // L: 124
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 125
					}
					break;
				}

				if (var7 <= 49) { // L: 128
					NPC.field1161[var1][var2][var3] = var0.readByte(); // L: 129
					Tiles.field531[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 130
					UserComparator2.field3859[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 131
				} else if (var7 <= 81) { // L: 134
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 135
				} else {
					TileItem.field1273[var1][var2][var3] = (byte)(var7 - 81); // L: 138
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 143
				if (var7 == 0) { // L: 144
					break;
				}

				if (var7 == 1) { // L: 145
					var0.readUnsignedByte(); // L: 146
					break;
				}

				if (var7 <= 49) { // L: 149
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 152

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1201553018"
	)
	static final void method1869(String var0) {
		PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher); // L: 203
		var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0)); // L: 204
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 205
		Client.packetWriter.addNode(var1); // L: 206
	} // L: 207
}
