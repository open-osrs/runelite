import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;I)I",
		garbageValue = "1277014918"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1595429629"
	)
	static void method2495() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 126
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 127
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 130
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 131
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 132
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 135
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 136
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 143
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIIIIII)V",
		garbageValue = "-608728692"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -Skills.method5471(var4 + 932731 + var2, var5 + 556238 + var3) * 8; // L: 174
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 186
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					Tiles.field998[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break;
				}

				if (var7 <= 49) { // L: 206
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 209

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	static final void method2494() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 3786
			int var1 = Client.npcIndices[var0]; // L: 3787
			NPC var2 = Client.npcs[var1]; // L: 3788
			if (var2 != null) { // L: 3789
				class334.updateActorSequence(var2, var2.definition.size); // L: 3790
			}
		}

	} // L: 3793
}
