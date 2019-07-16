import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
	@ObfuscatedName("c")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -1516124929
	)
	static int field1071;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1052834531
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1971304641
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1483447179
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1875803617
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 284566685
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1513010233
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1383826035
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1526007343
	)
	@Export("chunkHighX")
	int chunkHighX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -890169045
	)
	@Export("chunkHighY")
	int chunkHighY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1797724181
	)
	@Export("chunkLowX")
	int chunkLowX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 325777555
	)
	@Export("chunkLowY")
	int chunkLowY;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lag;I)V",
		garbageValue = "1384899025"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea area) {
		if (area.regionLowX > this.regionLowX) {
			area.regionLowX = this.regionLowX;
		}

		if (area.regionHighX < this.regionLowX) {
			area.regionHighX = this.regionLowX;
		}

		if (area.regionLowY > this.regionLowY) {
			area.regionLowY = this.regionLowY;
		}

		if (area.regionHighY < this.regionLowY) {
			area.regionHighY = this.regionLowY;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "93"
	)
	@Export("containsCoord")
	public boolean containsCoord(int plane, int x, int y) {
		return plane >= this.minPlane && plane < this.minPlane + this.planes ? x >= (this.regionHighX << 6) + (this.chunkHighX << 3) && x <= (this.regionHighX << 6) + (this.chunkHighX << 3) + 7 && y >= (this.regionHighY << 6) + (this.chunkHighY << 3) && y <= (this.regionHighY << 6) + (this.chunkHighY << 3) + 7 : false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "4"
	)
	@Export("containsPosition")
	public boolean containsPosition(int x, int y) {
		return x >= (this.regionLowX << 6) + (this.chunkLowX << 3) && x <= (this.regionLowX << 6) + (this.chunkLowX << 3) + 7 && y >= (this.regionLowY << 6) + (this.chunkLowY << 3) && y <= (this.regionLowY << 6) + (this.chunkLowY << 3) + 7;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "1545934424"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int plane, int x, int y) {
		if (!this.containsCoord(plane, x, y)) {
			return null;
		}
		int[] var4 = new int[]{this.regionLowX * 64 - this.regionHighX * 64 + x + (this.chunkLowX * 8 - this.chunkHighX * 8), y + (this.regionLowY * 64 - this.regionHighY * 64) + (this.chunkLowY * 8 - this.chunkHighY * 8)};
		return var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)Lhu;",
		garbageValue = "-1916486802"
	)
	@Export("coord")
	public Coord coord(int x, int y) {
		if (!this.containsPosition(x, y)) {
			return null;
		}
		int var3 = this.regionHighX * 64 - this.regionLowX * 64 + (this.chunkHighX * 8 - this.chunkLowX * 8) + x;
		int var4 = this.regionHighY * 64 - this.regionLowY * 64 + y + (this.chunkHighY * 8 - this.chunkLowY * 8);
		return new Coord(this.minPlane, var3, var4);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lgr;B)V",
		garbageValue = "-113"
	)
	@Export("read")
	public void read(Buffer buffer) {
		this.minPlane = buffer.readUnsignedByte();
		this.planes = buffer.readUnsignedByte();
		this.regionHighX = buffer.readUnsignedShort();
		this.chunkHighX = buffer.readUnsignedByte();
		this.regionHighY = buffer.readUnsignedShort();
		this.chunkHighY = buffer.readUnsignedByte();
		this.regionLowX = buffer.readUnsignedShort();
		this.chunkLowX = buffer.readUnsignedByte();
		this.regionLowY = buffer.readUnsignedShort();
		this.chunkLowY = buffer.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2026323437"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lim;",
		garbageValue = "-205156540"
	)
	@Export("getKitDefinition")
	public static KitDefinition getKitDefinition(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
		var1 = new KitDefinition();
		if (var2 != null) {
			var1.decode(new Buffer(var2));
		}

		KitDefinition.KitDefinition_cached.put(var1, (long)var0);
		return var1;
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2142100332"
	)
	static void method808() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		Projectile.mouseRecorder.index = 0;
		class230.field1138 = true;
		Client.field166 = true;
		Client.field126 = -1L;
		PendingSpawn.method1694();
		Client.packetWriter.method239();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field676 = null;
		Client.packetWriter.field677 = null;
		Client.packetWriter.field678 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field674 = 0;
		Client.rebootTimer = 0;
		Client.field175 = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		MouseHandler.MouseHandler_idleCycles = 0;
		GroundItem.method2094();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		ClientParameter.field3645 = null;
		Client.minimapState = 0;
		Client.field125 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field733[var0] = null;
			Players.field732[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var1 = 0; var1 < 104; ++var1) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var1][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		WorldMapArea.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var3 = SecureRandomCallable.method1140(var0);
			if (var3 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		class196.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			AbstractByteArrayCopier.unloadInterface(Client.rootInterface);
		}

		for (InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.first(); var4 != null; var4 = (InterfaceParent)Client.interfaceParents.next()) {
			MenuAction.closeInterface(var4, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.field127 = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		SpriteMask.method4389();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field100[var0] = true;
		}

		AbstractByteArrayCopier.method4024();
		PacketWriter.clanChat = null;

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		FloorDecoration.grandExchangeEvents = null;
	}
}
