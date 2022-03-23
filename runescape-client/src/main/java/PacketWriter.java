import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 750825519
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1694781515
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1328;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1137458333
	)
	int field1326;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1022499315
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	ServerPacket field1320;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	ServerPacket field1329;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	ServerPacket field1331;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0;
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1328 = true; // L: 22
		this.field1326 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1824965765"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljt;B)V",
		garbageValue = "121"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnj;B)V",
		garbageValue = "33"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2133508090"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Lnj;",
		garbageValue = "2"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1183406666"
	)
	public static Object method2511(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-801712084"
	)
	public static void method2485() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 159
	} // L: 160

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method2489() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2354
		BuddyRankComparator.mouseRecorder.index = 0; // L: 2355
		Varps.hasFocus = true; // L: 2356
		Client.hadFocus = true; // L: 2357
		Client.field718 = -1L; // L: 2358
		class33.reflectionChecks = new IterableNodeDeque(); // L: 2360
		Client.packetWriter.clearBuffer(); // L: 2362
		Client.packetWriter.packetBuffer.offset = 0; // L: 2363
		Client.packetWriter.serverPacket = null; // L: 2364
		Client.packetWriter.field1320 = null; // L: 2365
		Client.packetWriter.field1329 = null; // L: 2366
		Client.packetWriter.field1331 = null; // L: 2367
		Client.packetWriter.serverPacketLength = 0; // L: 2368
		Client.packetWriter.field1326 = 0; // L: 2369
		Client.rebootTimer = 0; // L: 2370
		Client.logoutTimer = 0; // L: 2371
		Client.hintArrowType = 0; // L: 2372
		class268.method5228(); // L: 2373
		ItemComposition.method3764(0); // L: 2374
		NetCache.method5988(); // L: 2375
		Client.isItemSelected = 0; // L: 2376
		Client.isSpellSelected = false; // L: 2377
		Client.soundEffectCount = 0; // L: 2378
		Client.camAngleY = 0; // L: 2379
		Client.oculusOrbState = 0; // L: 2380
		class340.field4109 = null; // L: 2381
		Client.minimapState = 0; // L: 2382
		Client.field721 = -1; // L: 2383
		Client.destinationX = 0; // L: 2384
		Client.destinationY = 0; // L: 2385
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2386
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2387
		Client.npcCount = 0; // L: 2388
		Players.Players_count = 0; // L: 2390

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2391
			Players.field1289[var0] = null; // L: 2392
			Players.field1285[var0] = class193.field2193; // L: 2393
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2396
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2397
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2398
		Client.projectiles.clear(); // L: 2399
		Client.graphicsObjects.clear(); // L: 2400

		for (var0 = 0; var0 < 4; ++var0) { // L: 2401
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2402
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2403
					Client.groundItems[var0][var4][var2] = null; // L: 2404
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2408
		class155.friendSystem.clear(); // L: 2409

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) { // L: 2410
			VarpDefinition var1 = SoundCache.VarpDefinition_get(var0); // L: 2411
			if (var1 != null) { // L: 2412
				Varps.Varps_temp[var0] = 0; // L: 2413
				Varps.Varps_main[var0] = 0; // L: 2414
			}
		}

		JagexCache.varcs.clearTransient(); // L: 2417
		Client.followerIndex = -1; // L: 2418
		if (Client.rootInterface != -1) { // L: 2419
			WorldMapID.method5000(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2420
			class20.closeInterface(var3, true); // L: 2421
		}

		Client.rootInterface = -1; // L: 2423
		Client.interfaceParents = new NodeHashTable(8); // L: 2424
		Client.meslayerContinueWidget = null; // L: 2425
		class268.method5228(); // L: 2426
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2427

		for (var0 = 0; var0 < 8; ++var0) { // L: 2428
			Client.playerMenuActions[var0] = null; // L: 2429
			Client.playerOptionsPriorities[var0] = false; // L: 2430
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2433
		Client.isLoading = true; // L: 2435

		for (var0 = 0; var0 < 100; ++var0) { // L: 2436
			Client.field564[var0] = true;
		}

		class17.method228(); // L: 2437
		class230.friendsChat = null; // L: 2438
		class134.guestClanSettings = null; // L: 2439
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2440
		class83.guestClanChannel = null; // L: 2441
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2442

		for (var0 = 0; var0 < 8; ++var0) { // L: 2443
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		ReflectionCheck.grandExchangeEvents = null; // L: 2444
	} // L: 2445

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Z",
		garbageValue = "27"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10275
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10276
				int var2 = WorldMapAreaData.method5086(var0, var1); // L: 10277
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10278
				if (var0.cs1Comparisons[var1] == 2) { // L: 10279
					if (var2 >= var3) { // L: 10280
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10282
					if (var2 <= var3) { // L: 10283
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10285
					if (var2 == var3) { // L: 10286
						return false;
					}
				} else if (var2 != var3) { // L: 10288
					return false;
				}
			}

			return true; // L: 10290
		}
	}
}
