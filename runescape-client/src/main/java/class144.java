import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public abstract class class144 extends Node {
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	class144() {
	} // L: 49

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	abstract void vmethod3037(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	abstract void vmethod3032(ClanChannel var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcr;B)V",
		garbageValue = "64"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class10.runScript(var0, 500000, 475000); // L: 108
	} // L: 109

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ZLpc;I)V",
		garbageValue = "1354871323"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5556
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5557
			int var2 = var1.method7576(); // L: 5558
			var3 = var1.readUnsignedShort(); // L: 5559
			var4 = var1.readUnsignedShort(); // L: 5560
			class138.xteaKeys = new int[var4][4]; // L: 5561

			for (var5 = 0; var5 < var4; ++var5) { // L: 5562
				for (var6 = 0; var6 < 4; ++var6) { // L: 5563
					class138.xteaKeys[var5][var6] = var1.readInt(); // L: 5564
				}
			}

			class241.regions = new int[var4]; // L: 5567
			class83.regionMapArchiveIds = new int[var4]; // L: 5568
			class17.regionLandArchiveIds = new int[var4]; // L: 5569
			InterfaceParent.regionLandArchives = new byte[var4][]; // L: 5570
			FloorUnderlayDefinition.regionMapArchives = new byte[var4][]; // L: 5571
			boolean var16 = false; // L: 5572
			if (Client.field493) { // L: 5573
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 5574
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 5575
					var16 = true;
				}
			}

			var4 = 0; // L: 5577

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5578
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 5579
					var8 = var7 + (var6 << 8); // L: 5580
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5581
						class241.regions[var4] = var8; // L: 5582
						class83.regionMapArchiveIds[var4] = Message.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5583
						class17.regionLandArchiveIds[var4] = Message.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5584
						++var4; // L: 5585
					}
				}
			}

			class329.method5875(var3, var2, true); // L: 5588
		} else {
			boolean var15 = var1.method7546() == 1; // L: 5591
			var3 = var1.method7554(); // L: 5592
			var4 = var1.method7554(); // L: 5593
			var5 = var1.readUnsignedShort(); // L: 5594
			var1.importIndex(); // L: 5595

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5596
				for (var7 = 0; var7 < 13; ++var7) { // L: 5597
					for (var8 = 0; var8 < 13; ++var8) { // L: 5598
						var9 = var1.readBits(1); // L: 5599
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5600
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5601
						}
					}
				}
			}

			var1.exportIndex(); // L: 5605
			class138.xteaKeys = new int[var5][4]; // L: 5606

			for (var6 = 0; var6 < var5; ++var6) { // L: 5607
				for (var7 = 0; var7 < 4; ++var7) { // L: 5608
					class138.xteaKeys[var6][var7] = var1.readInt(); // L: 5609
				}
			}

			class241.regions = new int[var5]; // L: 5612
			class83.regionMapArchiveIds = new int[var5]; // L: 5613
			class17.regionLandArchiveIds = new int[var5]; // L: 5614
			InterfaceParent.regionLandArchives = new byte[var5][]; // L: 5615
			FloorUnderlayDefinition.regionMapArchives = new byte[var5][]; // L: 5616
			var5 = 0; // L: 5617

			for (var6 = 0; var6 < 4; ++var6) { // L: 5618
				for (var7 = 0; var7 < 13; ++var7) { // L: 5619
					for (var8 = 0; var8 < 13; ++var8) { // L: 5620
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5621
						if (var9 != -1) { // L: 5622
							int var10 = var9 >> 14 & 1023; // L: 5623
							int var11 = var9 >> 3 & 2047; // L: 5624
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5625

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5626
								if (class241.regions[var13] == var12) {
									var12 = -1; // L: 5627
									break; // L: 5628
								}
							}

							if (var12 != -1) { // L: 5630
								class241.regions[var5] = var12; // L: 5631
								var13 = var12 >> 8 & 255; // L: 5632
								int var14 = var12 & 255; // L: 5633
								class83.regionMapArchiveIds[var5] = Message.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5634
								class17.regionLandArchiveIds[var5] = Message.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5635
								++var5; // L: 5636
							}
						}
					}
				}
			}

			class329.method5875(var3, var4, !var15); // L: 5642
		}

	} // L: 5644
}
