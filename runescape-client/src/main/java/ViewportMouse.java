import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("c")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 953565199
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 573466939
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("f")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1554423405
	)
	static int field2588;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1684293485
	)
	static int field2589;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 285393075
	)
	static int field2590;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 435239719
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("u")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1467826843
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 863753987
	)
	@Export("menuY")
	static int menuY;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1768529211"
	)
	static int method4514(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1041
			var0 -= 1000; // L: 1042
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1043
		} else {
			var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 1045
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1046
		int[] var5 = null; // L: 1047
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1048
			int var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1049
			if (var6 > 0) { // L: 1050
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]) { // L: 1051 1052
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1054
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 1056

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 1057
			if (var4.charAt(var7 - 1) == 's') { // L: 1058
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 1059
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 1061
		if (var7 != -1) { // L: 1062
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 1063
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 1064
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1065
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1066
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1067
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1068
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1069
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1070
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1071
			var3.onVarTransmit = var8; // L: 1072
			var3.varTransmitTriggers = var5; // L: 1073
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1075
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1076
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1077
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1078
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1079
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1080
			var3.onInvTransmit = var8; // L: 1081
			var3.invTransmitTriggers = var5; // L: 1082
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1084
			var3.onStatTransmit = var8; // L: 1085
			var3.statTransmitTriggers = var5; // L: 1086
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1088
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1089
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1090
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1091
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1092
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1093
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1094
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1095
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1096
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1097
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1098
			var3.field3494 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1099
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1100
			var3.field3365 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1101
			var3.field3353 = var8;
		} else if (var0 == 1430) {
			var3.field3516 = var8; // L: 1102
		} else if (var0 == 1431) { // L: 1103
			var3.field3513 = var8;
		} else {
			if (var0 != 1434) { // L: 1104
				return 2; // L: 1105
			}

			var3.field3495 = var8;
		}

		var3.hasListener = true; // L: 1106
		return 1; // L: 1107
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3487029"
	)
	@Export("load")
	static void load() {
		int var26;
		if (Client.titleLoadingStage == 0) { // L: 1657
			class356.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1658

			for (var26 = 0; var26 < 4; ++var26) { // L: 1659
				Client.collisionMaps[var26] = new CollisionMap(104, 104);
			}

			FloorUnderlayDefinition.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1660
			Login.Login_loadingText = "Starting game engine..."; // L: 1661
			Login.Login_loadingPercent = 5; // L: 1662
			Client.titleLoadingStage = 20; // L: 1663
		} else if (Client.titleLoadingStage == 20) { // L: 1666
			Login.Login_loadingText = "Prepared visibility map"; // L: 1667
			Login.Login_loadingPercent = 10; // L: 1668
			Client.titleLoadingStage = 30; // L: 1669
		} else if (Client.titleLoadingStage == 30) { // L: 1672
			Varcs.archive5 = ModeWhere.newArchive(0, false, true, true, false); // L: 1673
			WorldMapEvent.field2882 = ModeWhere.newArchive(1, false, true, true, false); // L: 1674
			class140.archive2 = ModeWhere.newArchive(2, true, false, true, false); // L: 1675
			class341.archive7 = ModeWhere.newArchive(3, false, true, true, false); // L: 1676
			Client.archive4 = ModeWhere.newArchive(4, false, true, true, false); // L: 1677
			WorldMapSectionType.archive9 = ModeWhere.newArchive(5, true, true, true, false); // L: 1678
			class121.archive6 = ModeWhere.newArchive(6, true, true, true, false); // L: 1679
			class10.archive11 = ModeWhere.newArchive(7, false, true, true, false); // L: 1680
			class304.archive8 = ModeWhere.newArchive(8, false, true, true, false); // L: 1681
			Language.field4098 = ModeWhere.newArchive(9, false, true, true, false); // L: 1682
			ApproximateRouteStrategy.archive10 = ModeWhere.newArchive(10, false, true, true, false); // L: 1683
			UserComparator7.field1383 = ModeWhere.newArchive(11, false, true, true, false); // L: 1684
			class267.archive12 = ModeWhere.newArchive(12, false, true, true, false); // L: 1685
			AbstractByteArrayCopier.archive13 = ModeWhere.newArchive(13, true, false, true, false); // L: 1686
			WorldMapSprite.archive14 = ModeWhere.newArchive(14, false, true, true, false); // L: 1687
			class67.archive15 = ModeWhere.newArchive(15, false, true, true, false); // L: 1688
			class6.archive17 = ModeWhere.newArchive(17, true, true, true, false); // L: 1689
			AbstractUserComparator.archive18 = ModeWhere.newArchive(18, false, true, true, false); // L: 1690
			MouseHandler.archive19 = ModeWhere.newArchive(19, false, true, true, false); // L: 1691
			class4.archive20 = ModeWhere.newArchive(20, false, true, true, false); // L: 1692
			class132.field1588 = ModeWhere.newArchive(21, false, true, true, true); // L: 1693
			Login.Login_loadingText = "Connecting to update server"; // L: 1694
			Login.Login_loadingPercent = 20; // L: 1695
			Client.titleLoadingStage = 40; // L: 1696
		} else if (Client.titleLoadingStage != 40) { // L: 1699
			Archive var20;
			Archive var21;
			Archive var22;
			if (Client.titleLoadingStage == 45) { // L: 1747
				KitDefinition.method3438(22050, !Client.isLowDetail, 2); // L: 1748
				MidiPcmStream var25 = new MidiPcmStream(); // L: 1749
				var25.method5304(9, 128); // L: 1750
				AttackOption.pcmPlayer0 = BufferedNetSocket.method6849(GameEngine.taskHandler, 0, 22050); // L: 1751
				AttackOption.pcmPlayer0.setStream(var25); // L: 1752
				var20 = class67.archive15; // L: 1753
				var21 = WorldMapSprite.archive14; // L: 1754
				var22 = Client.archive4; // L: 1755
				class272.musicPatchesArchive = var20; // L: 1757
				class272.musicSamplesArchive = var21; // L: 1758
				class28.soundEffectsArchive = var22; // L: 1759
				class272.midiPcmStream = var25; // L: 1760
				class238.pcmPlayer1 = BufferedNetSocket.method6849(GameEngine.taskHandler, 1, 2048); // L: 1762
				class21.pcmStreamMixer = new PcmStreamMixer(); // L: 1763
				class238.pcmPlayer1.setStream(class21.pcmStreamMixer); // L: 1764
				WorldMapRegion.decimator = new Decimator(22050, PcmPlayer.field287); // L: 1765
				Login.Login_loadingText = "Prepared sound engine"; // L: 1766
				Login.Login_loadingPercent = 35; // L: 1767
				Client.titleLoadingStage = 50; // L: 1768
				class272.WorldMapElement_fonts = new Fonts(class304.archive8, AbstractByteArrayCopier.archive13); // L: 1769
			} else if (Client.titleLoadingStage == 50) { // L: 1772
				var26 = FontName.method7382().length; // L: 1773
				Client.fontsMap = class272.WorldMapElement_fonts.createMap(FontName.method7382()); // L: 1774
				if (Client.fontsMap.size() < var26) { // L: 1775
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%"; // L: 1776
					Login.Login_loadingPercent = 40; // L: 1777
				} else {
					MouseHandler.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1780
					DevicePcmPlayerProvider.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1781
					TileItem.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1782
					Occluder.platformInfo = Client.platformInfoProvider.get(); // L: 1783
					Login.Login_loadingText = "Loaded fonts"; // L: 1784
					Login.Login_loadingPercent = 40; // L: 1785
					Client.titleLoadingStage = 60; // L: 1786
				}
			} else {
				int var1;
				if (Client.titleLoadingStage == 60) { // L: 1789
					var26 = HealthBarUpdate.method2203(ApproximateRouteStrategy.archive10, class304.archive8); // L: 1790
					var1 = Login.field924.length + Login.field916.length; // L: 1793
					if (var26 < var1) { // L: 1796
						Login.Login_loadingText = "Loading title screen - " + var26 * 100 / var1 + "%"; // L: 1797
						Login.Login_loadingPercent = 50; // L: 1798
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1801
						Login.Login_loadingPercent = 50; // L: 1802
						HealthBarUpdate.updateGameState(5); // L: 1803
						Client.titleLoadingStage = 70; // L: 1804
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1807
					if (!class140.archive2.isFullyLoaded()) { // L: 1808
						Login.Login_loadingText = "Loading config - " + class140.archive2.loadPercent() + "%"; // L: 1809
						Login.Login_loadingPercent = 60; // L: 1810
					} else if (!class132.field1588.isFullyLoaded()) { // L: 1813
						Login.Login_loadingText = "Loading config - " + (80 + class267.archive12.loadPercent() / 6) + "%"; // L: 1814
						Login.Login_loadingPercent = 60; // L: 1815
					} else {
						class146.method3082(class140.archive2); // L: 1818
						Archive var24 = class140.archive2; // L: 1819
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var24; // L: 1821
						var20 = class140.archive2; // L: 1823
						var21 = class10.archive11; // L: 1824
						KitDefinition.KitDefinition_archive = var20; // L: 1826
						KitDefinition.KitDefinition_modelsArchive = var21; // L: 1827
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1828
						PacketWriter.method2517(class140.archive2, class10.archive11, Client.isLowDetail); // L: 1830
						var22 = class140.archive2; // L: 1831
						Archive var23 = class10.archive11; // L: 1832
						NPCComposition.NpcDefinition_archive = var22; // L: 1834
						NPCComposition.NpcDefinition_modelArchive = var23; // L: 1835
						GrandExchangeOfferNameComparator.method5979(class140.archive2); // L: 1837
						class114.method2636(class140.archive2, class10.archive11, Client.isMembersWorld, MouseHandler.fontPlain11); // L: 1838
						SoundCache.method762(class140.archive2, Varcs.archive5, WorldMapEvent.field2882); // L: 1839
						Archive var5 = class140.archive2; // L: 1840
						Archive var6 = class10.archive11; // L: 1841
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var5; // L: 1843
						class147.SpotAnimationDefinition_modelArchive = var6; // L: 1844
						Archive var7 = class140.archive2; // L: 1846
						VarbitComposition.VarbitDefinition_archive = var7; // L: 1848
						Archive var8 = class140.archive2; // L: 1850
						VarpDefinition.VarpDefinition_archive = var8; // L: 1852
						VarpDefinition.field1822 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1853
						Archive var9 = class341.archive7; // L: 1855
						Archive var10 = class10.archive11; // L: 1856
						Archive var11 = class304.archive8; // L: 1857
						Archive var12 = AbstractByteArrayCopier.archive13; // L: 1858
						MusicPatchPcmStream.Widget_archive = var9; // L: 1860
						class126.Widget_modelsArchive = var10; // L: 1861
						StructComposition.Widget_spritesArchive = var11; // L: 1862
						MilliClock.Widget_fontsArchive = var12; // L: 1863
						SoundCache.Widget_interfaceComponents = new Widget[MusicPatchPcmStream.Widget_archive.getGroupCount()][]; // L: 1864
						class228.Widget_loadedInterfaces = new boolean[MusicPatchPcmStream.Widget_archive.getGroupCount()]; // L: 1865
						LoginScreenAnimation.method2233(class140.archive2); // L: 1867
						WorldMapSection0.method4936(class140.archive2); // L: 1868
						WorldMapLabel.method5000(class140.archive2); // L: 1869
						Renderable.method4342(class140.archive2); // L: 1870
						Archive var13 = class140.archive2; // L: 1871
						ParamComposition.ParamDefinition_archive = var13; // L: 1873
						class138.method2948(class140.archive2); // L: 1875
						class116.method2700(class140.archive2); // L: 1876
						AbstractWorldMapData.HitSplatDefinition_cachedSprites = new class427(class285.field3313, 54, class134.clientLanguage, class140.archive2); // L: 1877
						ModeWhere.HitSplatDefinition_cached = new class427(class285.field3313, 47, class134.clientLanguage, class140.archive2); // L: 1878
						class308.varcs = new Varcs(); // L: 1879
						Archive var14 = class140.archive2; // L: 1880
						Archive var15 = class304.archive8; // L: 1881
						Archive var16 = AbstractByteArrayCopier.archive13; // L: 1882
						HitSplatDefinition.HitSplatDefinition_archive = var14; // L: 1884
						HitSplatDefinition.field2017 = var15; // L: 1885
						class4.HitSplatDefinition_fontsArchive = var16; // L: 1886
						Archive var17 = class140.archive2; // L: 1888
						Archive var18 = class304.archive8; // L: 1889
						HealthBarDefinition.HealthBarDefinition_archive = var17; // L: 1891
						HealthBarDefinition.field1877 = var18; // L: 1892
						class115.method2691(class140.archive2, class304.archive8); // L: 1894
						Login.Login_loadingText = "Loaded config"; // L: 1895
						Login.Login_loadingPercent = 60; // L: 1896
						Client.titleLoadingStage = 80; // L: 1897
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1900
					var26 = 0; // L: 1901
					if (class267.compass == null) { // L: 1902
						class267.compass = class7.SpriteBuffer_getSprite(class304.archive8, LoginScreenAnimation.spriteIds.compass, 0);
					} else {
						++var26; // L: 1903
					}

					if (class344.redHintArrowSprite == null) { // L: 1904
						class344.redHintArrowSprite = class7.SpriteBuffer_getSprite(class304.archive8, LoginScreenAnimation.spriteIds.field4367, 0);
					} else {
						++var26; // L: 1905
					}

					if (class13.mapSceneSprites == null) { // L: 1906
						class13.mapSceneSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.mapScenes, 0);
					} else {
						++var26; // L: 1907
					}

					if (Message.headIconPkSprites == null) { // L: 1908
						Message.headIconPkSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.headIconsPk, 0);
					} else {
						++var26; // L: 1909
					}

					if (class28.headIconPrayerSprites == null) { // L: 1910
						class28.headIconPrayerSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4374, 0);
					} else {
						++var26; // L: 1911
					}

					if (UserComparator4.headIconHintSprites == null) { // L: 1912
						UserComparator4.headIconHintSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4373, 0);
					} else {
						++var26; // L: 1913
					}

					if (DynamicObject.mapMarkerSprites == null) { // L: 1914
						DynamicObject.mapMarkerSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4372, 0);
					} else {
						++var26; // L: 1915
					}

					if (BuddyRankComparator.crossSprites == null) { // L: 1916
						BuddyRankComparator.crossSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4368, 0);
					} else {
						++var26; // L: 1917
					}

					if (class9.mapDotSprites == null) { // L: 1918
						class9.mapDotSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4371, 0);
					} else {
						++var26; // L: 1919
					}

					if (class126.scrollBarSprites == null) { // L: 1920
						class126.scrollBarSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.field4375, 0);
					} else {
						++var26; // L: 1921
					}

					if (ClientPreferences.modIconSprites == null) { // L: 1922
						ClientPreferences.modIconSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.field4376, 0);
					} else {
						++var26; // L: 1923
					}

					if (var26 < 11) { // L: 1924
						Login.Login_loadingText = "Loading sprites - " + var26 * 100 / 12 + "%"; // L: 1925
						Login.Login_loadingPercent = 70; // L: 1926
					} else {
						AbstractFont.AbstractFont_modIconSprites = ClientPreferences.modIconSprites; // L: 1929
						class344.redHintArrowSprite.normalize(); // L: 1930
						var1 = (int)(Math.random() * 21.0D) - 10; // L: 1931
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1932
						int var3 = (int)(Math.random() * 21.0D) - 10; // L: 1933
						int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1934
						class13.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4); // L: 1935
						Login.Login_loadingText = "Loaded sprites"; // L: 1936
						Login.Login_loadingPercent = 70; // L: 1937
						Client.titleLoadingStage = 90; // L: 1938
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1941
					if (!Language.field4098.isFullyLoaded()) { // L: 1942
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1943
						Login.Login_loadingPercent = 90; // L: 1944
					} else {
						class12.textureProvider = new TextureProvider(Language.field4098, class304.archive8, 20, class19.clientPreferences.method2254(), Client.isLowDetail ? 64 : 128); // L: 1947
						Rasterizer3D.Rasterizer3D_setTextureLoader(class12.textureProvider); // L: 1948
						Rasterizer3D.Rasterizer3D_setBrightness(class19.clientPreferences.method2254()); // L: 1949
						Client.titleLoadingStage = 100; // L: 1950
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1953
					var26 = class12.textureProvider.getLoadedPercentage(); // L: 1954
					if (var26 < 100) { // L: 1955
						Login.Login_loadingText = "Loading textures - " + var26 + "%"; // L: 1956
						Login.Login_loadingPercent = 90; // L: 1957
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1960
						Login.Login_loadingPercent = 90; // L: 1961
						Client.titleLoadingStage = 110; // L: 1962
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1965
					ItemLayer.mouseRecorder = new MouseRecorder(); // L: 1966
					GameEngine.taskHandler.newThreadTask(ItemLayer.mouseRecorder, 10); // L: 1967
					Login.Login_loadingText = "Loaded input handler"; // L: 1968
					Login.Login_loadingPercent = 92; // L: 1969
					Client.titleLoadingStage = 120; // L: 1970
				} else if (Client.titleLoadingStage == 120) { // L: 1973
					if (!ApproximateRouteStrategy.archive10.tryLoadFileByNames("huffman", "")) { // L: 1974
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1975
						Login.Login_loadingPercent = 94; // L: 1976
					} else {
						Huffman var0 = new Huffman(ApproximateRouteStrategy.archive10.takeFileByNames("huffman", "")); // L: 1979
						class281.huffman = var0; // L: 1981
						Login.Login_loadingText = "Loaded wordpack"; // L: 1983
						Login.Login_loadingPercent = 94; // L: 1984
						Client.titleLoadingStage = 130; // L: 1985
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1988
					if (!class341.archive7.isFullyLoaded()) { // L: 1989
						Login.Login_loadingText = "Loading interfaces - " + class341.archive7.loadPercent() * 4 / 5 + "%"; // L: 1990
						Login.Login_loadingPercent = 96; // L: 1991
					} else if (!class267.archive12.isFullyLoaded()) { // L: 1994
						Login.Login_loadingText = "Loading interfaces - " + (80 + class267.archive12.loadPercent() / 6) + "%"; // L: 1995
						Login.Login_loadingPercent = 96; // L: 1996
					} else if (!AbstractByteArrayCopier.archive13.isFullyLoaded()) { // L: 1999
						Login.Login_loadingText = "Loading interfaces - " + (96 + AbstractByteArrayCopier.archive13.loadPercent() / 50) + "%"; // L: 2000
						Login.Login_loadingPercent = 96; // L: 2001
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2004
						Login.Login_loadingPercent = 98; // L: 2005
						Client.titleLoadingStage = 140; // L: 2006
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2009
					Login.Login_loadingPercent = 100; // L: 2010
					if (!MouseHandler.archive19.tryLoadGroupByName(WorldMapCacheName.field2867.name)) { // L: 2011
						Login.Login_loadingText = "Loading world map - " + MouseHandler.archive19.groupLoadPercentByName(WorldMapCacheName.field2867.name) / 10 + "%"; // L: 2012
					} else {
						if (class121.worldMap == null) { // L: 2015
							class121.worldMap = new WorldMap(); // L: 2016
							class121.worldMap.init(MouseHandler.archive19, AbstractUserComparator.archive18, class4.archive20, TileItem.fontBold12, Client.fontsMap, class13.mapSceneSprites); // L: 2017
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2019
						Client.titleLoadingStage = 150; // L: 2020
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2023
					HealthBarUpdate.updateGameState(10); // L: 2024
				}
			}
		} else {
			byte var19 = 0; // L: 1700
			var26 = var19 + Varcs.archive5.percentage() * 4 / 100; // L: 1701
			var26 += WorldMapEvent.field2882.percentage() * 4 / 100; // L: 1702
			var26 += class140.archive2.percentage() * 2 / 100; // L: 1703
			var26 += class341.archive7.percentage() * 2 / 100; // L: 1704
			var26 += Client.archive4.percentage() * 6 / 100; // L: 1705
			var26 += WorldMapSectionType.archive9.percentage() * 4 / 100; // L: 1706
			var26 += class121.archive6.percentage() * 2 / 100; // L: 1707
			var26 += class10.archive11.percentage() * 55 / 100; // L: 1708
			var26 += class304.archive8.percentage() * 2 / 100; // L: 1709
			var26 += Language.field4098.percentage() * 2 / 100; // L: 1710
			var26 += ApproximateRouteStrategy.archive10.percentage() * 2 / 100; // L: 1711
			var26 += UserComparator7.field1383.percentage() * 2 / 100; // L: 1712
			var26 += class267.archive12.percentage() * 2 / 100; // L: 1713
			var26 += AbstractByteArrayCopier.archive13.percentage() * 2 / 100; // L: 1714
			var26 += WorldMapSprite.archive14.percentage() * 2 / 100; // L: 1715
			var26 += class67.archive15.percentage() * 2 / 100; // L: 1716
			var26 += MouseHandler.archive19.percentage() / 100; // L: 1717
			var26 += AbstractUserComparator.archive18.percentage() / 100; // L: 1718
			var26 += class4.archive20.percentage() / 100; // L: 1719
			var26 += class132.field1588.percentage() / 100; // L: 1720
			var26 += class6.archive17.method5795() && class6.archive17.isFullyLoaded() ? 1 : 0; // L: 1721
			if (var26 != 100) { // L: 1722
				if (var26 != 0) { // L: 1723
					Login.Login_loadingText = "Checking for updates - " + var26 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1724
			} else {
				HealthBarUpdate.method2202(Varcs.archive5, "Animations"); // L: 1727
				HealthBarUpdate.method2202(WorldMapEvent.field2882, "Skeletons"); // L: 1728
				HealthBarUpdate.method2202(Client.archive4, "Sound FX"); // L: 1729
				HealthBarUpdate.method2202(WorldMapSectionType.archive9, "Maps"); // L: 1730
				HealthBarUpdate.method2202(class121.archive6, "Music Tracks"); // L: 1731
				HealthBarUpdate.method2202(class10.archive11, "Models"); // L: 1732
				HealthBarUpdate.method2202(class304.archive8, "Sprites"); // L: 1733
				HealthBarUpdate.method2202(UserComparator7.field1383, "Music Jingles"); // L: 1734
				HealthBarUpdate.method2202(WorldMapSprite.archive14, "Music Samples"); // L: 1735
				HealthBarUpdate.method2202(class67.archive15, "Music Patches"); // L: 1736
				HealthBarUpdate.method2202(MouseHandler.archive19, "World Map"); // L: 1737
				HealthBarUpdate.method2202(AbstractUserComparator.archive18, "World Map Geography"); // L: 1738
				HealthBarUpdate.method2202(class4.archive20, "World Map Ground"); // L: 1739
				LoginScreenAnimation.spriteIds = new GraphicsDefaults(); // L: 1740
				LoginScreenAnimation.spriteIds.decode(class6.archive17); // L: 1741
				Login.Login_loadingText = "Loaded update list"; // L: 1742
				Login.Login_loadingPercent = 30; // L: 1743
				Client.titleLoadingStage = 45; // L: 1744
			}
		}
	} // L: 1664 1670 1697 1725 1745 1770 1778 1787 1799 1805 1811 1816 1898 1927 1939 1945 1951 1958 1963 1971 1977 1986 1992 1997 2002 2007 2013 2021 2025 2027
}
