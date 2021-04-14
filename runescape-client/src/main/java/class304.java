import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public final class class304 {
	@ObfuscatedName("f")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("o")
	static long[] field3761;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field3761 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field3761.length; ++var0) { // L: 8
			field3761[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1745033175"
	)
	static void method5536() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2181
		Language.mouseRecorder.index = 0; // L: 2182
		GrandExchangeOfferAgeComparator.hasFocus = true; // L: 2183
		Client.hadFocus = true; // L: 2184
		Client.field678 = -1L; // L: 2185
		class69.reflectionChecks = new IterableNodeDeque(); // L: 2187
		Client.packetWriter.clearBuffer(); // L: 2189
		Client.packetWriter.packetBuffer.offset = 0; // L: 2190
		Client.packetWriter.serverPacket = null; // L: 2191
		Client.packetWriter.field1381 = null; // L: 2192
		Client.packetWriter.field1392 = null; // L: 2193
		Client.packetWriter.field1393 = null; // L: 2194
		Client.packetWriter.serverPacketLength = 0; // L: 2195
		Client.packetWriter.field1391 = 0; // L: 2196
		Client.rebootTimer = 0; // L: 2197
		Client.logoutTimer = 0; // L: 2198
		Client.hintArrowType = 0; // L: 2199
		Client.menuOptionsCount = 0; // L: 2201
		Client.isMenuOpen = false; // L: 2202
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2205
		Script.method2010(); // L: 2207
		Client.isItemSelected = 0; // L: 2208
		Client.isSpellSelected = false; // L: 2209
		Client.soundEffectCount = 0; // L: 2210
		Client.camAngleY = 0; // L: 2211
		Client.oculusOrbState = 0; // L: 2212
		class105.field1331 = null; // L: 2213
		Client.minimapState = 0; // L: 2214
		Client.field833 = -1; // L: 2215
		Client.destinationX = 0; // L: 2216
		Client.destinationY = 0; // L: 2217
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2218
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2219
		Client.npcCount = 0; // L: 2220
		TaskHandler.method2524(); // L: 2221

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2222
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2223
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2224
		Client.projectiles.clear(); // L: 2225
		Client.graphicsObjects.clear(); // L: 2226

		for (var0 = 0; var0 < 4; ++var0) { // L: 2227
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2228
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2229
					Client.groundItems[var0][var4][var2] = null; // L: 2230
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2234
		class13.friendSystem.clear(); // L: 2235

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) { // L: 2236
			VarpDefinition var1 = class303.VarpDefinition_get(var0); // L: 2237
			if (var1 != null) { // L: 2238
				Varps.Varps_temp[var0] = 0; // L: 2239
				Varps.Varps_main[var0] = 0; // L: 2240
			}
		}

		TextureProvider.varcs.clearTransient(); // L: 2243
		Client.followerIndex = -1; // L: 2244
		if (Client.rootInterface != -1) { // L: 2245
			WorldMapRegion.method2929(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2246
			WorldMapData_1.closeInterface(var3, true); // L: 2247
		}

		Client.rootInterface = -1; // L: 2249
		Client.interfaceParents = new NodeHashTable(8); // L: 2250
		Client.meslayerContinueWidget = null; // L: 2251
		Client.menuOptionsCount = 0; // L: 2253
		Client.isMenuOpen = false; // L: 2254
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2256

		for (var0 = 0; var0 < 8; ++var0) { // L: 2257
			Client.playerMenuActions[var0] = null; // L: 2258
			Client.playerOptionsPriorities[var0] = false; // L: 2259
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2262
		Client.isLoading = true; // L: 2264

		for (var0 = 0; var0 < 100; ++var0) { // L: 2265
			Client.field811[var0] = true;
		}

		ItemContainer.method2093(); // L: 2266
		InterfaceParent.clanChat = null; // L: 2267
		ObjectSound.field928 = null; // L: 2268
		Arrays.fill(Client.field831, (Object)null); // L: 2269
		IsaacCipher.field4266 = null; // L: 2270
		Arrays.fill(Client.field820, (Object)null); // L: 2271

		for (var0 = 0; var0 < 8; ++var0) { // L: 2272
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		Calendar.grandExchangeEvents = null; // L: 2273
	} // L: 2274
}
