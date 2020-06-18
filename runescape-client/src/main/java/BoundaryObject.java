import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 175264999
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 782033861
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1104746355
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -742181125
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1690066511
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("entity2")
	public Entity entity2;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 3086546930439306913L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 485971219
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1351583068"
	)
	static void method3390() {
		Tiles.field530 = null;
		Tiles.field524 = null;
		Tiles.field525 = null;
		WorldMapLabel.field269 = null;
		HealthBarUpdate.field1031 = null;
		class171.field2036 = null;
		Tiles.field526 = null;
		BuddyRankComparator.Tiles_hue = null;
		GrandExchangeOfferAgeComparator.Tiles_saturation = null;
		TextureProvider.Tiles_lightness = null;
		class237.Tiles_hueMultiplier = null;
		WorldMapRectangle.field198 = null;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-1547224129"
	)
	static final void method3389(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field718; ++var1) {
			int var2 = Client.field719[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			int var6;
			int var7;
			if ((var4 & 128) != 0) {
				var5 = var0.method5755();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method5746();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = NetSocket.SequenceDefinition_get(var5).field3561;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1000 = 0;
					}

					if (var7 == 2) {
						var3.field1000 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || NetSocket.SequenceDefinition_get(var5).field3543 >= NetSocket.SequenceDefinition_get(var3.sequence).field3543) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1000 = 0;
					var3.field1023 = var3.pathLength;
				}
			}

			int var8;
			if ((var4 & 16) != 0) {
				var5 = var0.readUnsignedShort();
				var6 = var0.method5755();
				var7 = var3.x - (var5 - class182.baseX - class182.baseX) * 64;
				var8 = var3.y - (var6 - SecureRandomFuture.baseY - SecureRandomFuture.baseY) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field992 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 2) != 0) {
				var3.field995 = var0.method5751();
				var3.field1008 = var0.readByte();
				var3.field1007 = var0.readByte();
				var3.field1009 = var0.method5751();
				var3.field966 = var0.method5757() + Client.cycle;
				var3.field1011 = var0.method5755() + Client.cycle;
				var3.field1006 = var0.readUnsignedShort();
				var3.pathLength = 1;
				var3.field1023 = 0;
				var3.field995 += var3.pathX[0];
				var3.field1008 += var3.pathY[0];
				var3.field1007 += var3.pathX[0];
				var3.field1009 += var3.pathY[0];
			}

			if ((var4 & 1) != 0) {
				var5 = var0.method5748();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = var9 > 0 ? var0.readUnsignedByte() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 32) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 4) != 0) {
				var3.definition = StudioGame.getNpcDefinition(var0.method5757());
				var3.field967 = var3.definition.size;
				var3.field1017 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 8) != 0) {
				var3.targetIndex = var0.readUnsignedShort();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 64) != 0) {
				var3.spotAnimation = var0.method5757();
				var5 = var0.method5767();
				var3.field1005 = var5 >> 16;
				var3.field987 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field987 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}
		}

	}
}
