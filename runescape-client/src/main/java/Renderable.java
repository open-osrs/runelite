import java.awt.Component;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -268241925
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("co")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Lln;Lln;I)V",
		garbageValue = "2037776497"
	)
	public static void method4917(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		Widget.Widget_archive = var0; // L: 220
		class162.Widget_modelsArchive = var1; // L: 221
		SoundCache.Widget_spritesArchive = var2; // L: 222
		class17.Widget_fontsArchive = var3; // L: 223
		Widget.Widget_interfaceComponents = new Widget[Widget.Widget_archive.getGroupCount()][]; // L: 224
		WorldMapSectionType.Widget_loadedInterfaces = new boolean[Widget.Widget_archive.getGroupCount()]; // L: 225
	} // L: 226

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "39"
	)
	static void method4928(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 155
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 156
		KeyHandler.field128 = -1; // L: 157
	} // L: 158

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1452098348"
	)
	public static void method4926(int var0, int var1) {
		VarbitComposition var2 = UserComparator6.method2643(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1929107749"
	)
	static void method4925() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2613
		class120.mouseRecorder.index = 0; // L: 2614
		Varcs.hasFocus = true; // L: 2615
		Client.hadFocus = true; // L: 2616
		Client.field585 = -1L; // L: 2617
		UrlRequest.method2564(); // L: 2618
		Client.packetWriter.clearBuffer(); // L: 2619
		Client.packetWriter.packetBuffer.offset = 0; // L: 2620
		Client.packetWriter.serverPacket = null; // L: 2621
		Client.packetWriter.field1324 = null; // L: 2622
		Client.packetWriter.field1325 = null; // L: 2623
		Client.packetWriter.field1313 = null; // L: 2624
		Client.packetWriter.serverPacketLength = 0; // L: 2625
		Client.packetWriter.field1322 = 0; // L: 2626
		Client.rebootTimer = 0; // L: 2627
		Client.logoutTimer = 0; // L: 2628
		Client.hintArrowType = 0; // L: 2629
		Client.menuOptionsCount = 0; // L: 2631
		Client.isMenuOpen = false; // L: 2632
		ClientPacket.method5176(0); // L: 2634
		Actor.method2177(); // L: 2635
		Client.isItemSelected = 0; // L: 2636
		Client.isSpellSelected = false; // L: 2637
		Client.soundEffectCount = 0; // L: 2638
		Client.camAngleY = 0; // L: 2639
		Client.oculusOrbState = 0; // L: 2640
		VarcInt.field1841 = null; // L: 2641
		Client.minimapState = 0; // L: 2642
		Client.field714 = -1; // L: 2643
		Client.destinationX = 0; // L: 2644
		Client.destinationY = 0; // L: 2645
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2646
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2647
		Client.npcCount = 0; // L: 2648
		Players.Players_count = 0; // L: 2650

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2651
			Players.field1276[var0] = null; // L: 2652
			Players.field1286[var0] = class193.field2185; // L: 2653
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 2656
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2657
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2658
		Client.projectiles.clear(); // L: 2659
		Client.graphicsObjects.clear(); // L: 2660

		int var2;
		for (var0 = 0; var0 < 4; ++var0) { // L: 2661
			for (int var1 = 0; var1 < 104; ++var1) { // L: 2662
				for (var2 = 0; var2 < 104; ++var2) { // L: 2663
					Client.groundItems[var0][var1][var2] = null; // L: 2664
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2668
		Decimator.friendSystem.clear(); // L: 2669

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) { // L: 2670
			VarpDefinition var4 = class134.VarpDefinition_get(var0); // L: 2671
			if (var4 != null) { // L: 2672
				Varps.Varps_temp[var0] = 0; // L: 2673
				Varps.Varps_main[var0] = 0; // L: 2674
			}
		}

		class160.varcs.clearTransient(); // L: 2677
		Client.followerIndex = -1; // L: 2678
		if (Client.rootInterface != -1) { // L: 2679
			var0 = Client.rootInterface; // L: 2680
			if (var0 != -1 && WorldMapSectionType.Widget_loadedInterfaces[var0]) { // L: 2682 2683
				Widget.Widget_archive.clearFilesGroup(var0); // L: 2684
				if (Widget.Widget_interfaceComponents[var0] != null) { // L: 2685
					boolean var5 = true; // L: 2686

					for (var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) { // L: 2687
						if (Widget.Widget_interfaceComponents[var0][var2] != null) { // L: 2688
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) { // L: 2689
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var5 = false; // L: 2690
							}
						}
					}

					if (var5) { // L: 2693
						Widget.Widget_interfaceComponents[var0] = null;
					}

					WorldMapSectionType.Widget_loadedInterfaces[var0] = false; // L: 2694
				}
			}
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2697
			Script.closeInterface(var3, true); // L: 2698
		}

		Client.rootInterface = -1; // L: 2700
		Client.interfaceParents = new NodeHashTable(8); // L: 2701
		Client.meslayerContinueWidget = null; // L: 2702
		Client.menuOptionsCount = 0; // L: 2704
		Client.isMenuOpen = false; // L: 2705
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2707

		for (var0 = 0; var0 < 8; ++var0) { // L: 2708
			Client.playerMenuActions[var0] = null; // L: 2709
			Client.playerOptionsPriorities[var0] = false; // L: 2710
		}

		UserComparator10.method2622(); // L: 2712
		Client.isLoading = true; // L: 2713

		for (var0 = 0; var0 < 100; ++var0) { // L: 2714
			Client.field715[var0] = true;
		}

		class4.method17(); // L: 2715
		ClientPacket.friendsChat = null; // L: 2716
		class154.guestClanSettings = null; // L: 2717
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2718
		class21.guestClanChannel = null; // L: 2719
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2720

		for (var0 = 0; var0 < 8; ++var0) { // L: 2721
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class83.grandExchangeEvents = null; // L: 2722
	} // L: 2723

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2093926598"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ItemComposition.getWidgetChild(var0, var1); // L: 9650
		if (var4 != null && var4.onTargetEnter != null) { // L: 9651
			ScriptEvent var5 = new ScriptEvent(); // L: 9652
			var5.widget = var4; // L: 9653
			var5.args = var4.onTargetEnter; // L: 9654
			ClanSettings.runScriptEvent(var5); // L: 9655
		}

		Client.selectedSpellItemId = var3; // L: 9657
		Client.isSpellSelected = true; // L: 9658
		Timer.selectedSpellWidget = var0; // L: 9659
		Client.selectedSpellChildIndex = var1; // L: 9660
		class17.selectedSpellFlags = var2; // L: 9661
		class346.invalidateWidget(var4); // L: 9662
	} // L: 9663
}
