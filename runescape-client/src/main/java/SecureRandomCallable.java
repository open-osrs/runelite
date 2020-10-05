import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return BoundaryObject.method3387(); // L: 45
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhq;",
		garbageValue = "105"
	)
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = TileItem.getWidget(var0); // L: 196
		if (var1 == -1) { // L: 197
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 198 199
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2101058473"
	)
	static void method1204(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 306
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 307
		if (var4 != null) { // L: 308
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 309
		}
	} // L: 310

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "207665946"
	)
	static int method1200(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 945
			var0 -= 1000; // L: 946
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 947
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12; // L: 949
		}

		String var4 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 950
		int[] var5 = null; // L: 951
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 952
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 953
			if (var6 > 0) { // L: 954
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 955 956
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 958
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 960

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 961
			if (var4.charAt(var7 - 1) == 's') { // L: 962
				var8[var7] = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 963
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 965
		if (var7 != -1) { // L: 966
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 967
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 968
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 969
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 970
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 971
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 972
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 973
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 974
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 975
			var3.onVarTransmit = var8; // L: 976
			var3.varTransmitTriggers = var5; // L: 977
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 979
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 980
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 981
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 982
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 983
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 984
			var3.onInvTransmit = var8; // L: 985
			var3.invTransmitTriggers = var5; // L: 986
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 988
			var3.onStatTransmit = var8; // L: 989
			var3.statTransmitTriggers = var5; // L: 990
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8; // L: 992
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 993
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 994
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 995
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 996
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 997
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 998
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 999
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1000
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1001
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1002
			var3.field2722 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) { // L: 1003
				return 2; // L: 1004
			}

			var3.onResize = var8;
		}

		var3.hasListener = true; // L: 1005
		return 1; // L: 1006
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "19136770"
	)
	public static void method1203() {
		Widget.Widget_cachedSprites.clear(); // L: 688
		Widget.Widget_cachedModels.clear(); // L: 689
		Widget.Widget_cachedFonts.clear(); // L: 690
		Widget.Widget_cachedSpriteMasks.clear(); // L: 691
	} // L: 692

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-990196444"
	)
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 7255
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 7256
			Client.mouseCrossX = var6; // L: 7676
			Client.mouseCrossY = var7; // L: 7677
			Client.mouseCrossColor = 2; // L: 7678
			Client.mouseCrossState = 0; // L: 7679
			Client.destinationX = var0; // L: 7680
			Client.destinationY = var1; // L: 7681
			var8 = Client.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher); // L: 7683
			var8.packetBuffer.writeShort(var3); // L: 7684
			var8.packetBuffer.method5665(GrandExchangeOfferUnitPriceComparator.selectedItemSlot); // L: 7685
			var8.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7686
			var8.packetBuffer.writeShort(WorldMapLabel.baseY + var1); // L: 7687
			var8.packetBuffer.method5663(class105.selectedItemWidget); // L: 7688
			var8.packetBuffer.method5665(var0 + WorldMapManager.baseX); // L: 7689
			var8.packetBuffer.method5665(Script.selectedItemId); // L: 7690
			Client.packetWriter.addNode(var8); // L: 7691
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 7311
			Client.mouseCrossY = var7; // L: 7312
			Client.mouseCrossColor = 2; // L: 7313
			Client.mouseCrossState = 0; // L: 7314
			Client.destinationX = var0; // L: 7315
			Client.destinationY = var1; // L: 7316
			var8 = Client.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher); // L: 7318
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7319
			var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 7320
			var8.packetBuffer.method5653(var0 + WorldMapManager.baseX); // L: 7321
			var8.packetBuffer.method5654(var3); // L: 7322
			var8.packetBuffer.method5663(class232.selectedSpellWidget); // L: 7323
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 7324
			Client.packetWriter.addNode(var8); // L: 7325
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 7650
			Client.mouseCrossY = var7; // L: 7651
			Client.mouseCrossColor = 2; // L: 7652
			Client.mouseCrossState = 0; // L: 7653
			Client.destinationX = var0; // L: 7654
			Client.destinationY = var1; // L: 7655
			var8 = Client.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher); // L: 7657
			var8.packetBuffer.writeShort(WorldMapLabel.baseY + var1); // L: 7658
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7659
			var8.packetBuffer.method5665(var0 + WorldMapManager.baseX); // L: 7660
			var8.packetBuffer.method5653(var3); // L: 7661
			Client.packetWriter.addNode(var8); // L: 7662
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 7388
			Client.mouseCrossY = var7; // L: 7389
			Client.mouseCrossColor = 2; // L: 7390
			Client.mouseCrossState = 0; // L: 7391
			Client.destinationX = var0; // L: 7392
			Client.destinationY = var1; // L: 7393
			var8 = Client.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 7395
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7396
			var8.packetBuffer.method5654(var3); // L: 7397
			var8.packetBuffer.method5654(var0 + WorldMapManager.baseX); // L: 7398
			var8.packetBuffer.method5665(WorldMapLabel.baseY + var1); // L: 7399
			Client.packetWriter.addNode(var8); // L: 7400
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 7744
			Client.mouseCrossY = var7; // L: 7745
			Client.mouseCrossColor = 2; // L: 7746
			Client.mouseCrossState = 0; // L: 7747
			Client.destinationX = var0; // L: 7748
			Client.destinationY = var1; // L: 7749
			var8 = Client.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher); // L: 7751
			var8.packetBuffer.method5665(WorldMapLabel.baseY + var1); // L: 7752
			var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7753
			var8.packetBuffer.method5653(var3); // L: 7754
			var8.packetBuffer.method5653(var0 + WorldMapManager.baseX); // L: 7755
			Client.packetWriter.addNode(var8); // L: 7756
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8007
			Client.mouseCrossY = var7; // L: 8008
			Client.mouseCrossColor = 2; // L: 8009
			Client.mouseCrossState = 0; // L: 8010
			Client.destinationX = var0; // L: 8011
			Client.destinationY = var1; // L: 8012
			var8 = Client.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher); // L: 8014
			var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 8015
			var8.packetBuffer.method5665(var3); // L: 8016
			var8.packetBuffer.method5653(var0 + WorldMapManager.baseX); // L: 8017
			var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8018
			Client.packetWriter.addNode(var8); // L: 8019
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 7537
				if (var13 != null) { // L: 7538
					Client.mouseCrossX = var6; // L: 7539
					Client.mouseCrossY = var7; // L: 7540
					Client.mouseCrossColor = 2; // L: 7541
					Client.mouseCrossState = 0; // L: 7542
					Client.destinationX = var0; // L: 7543
					Client.destinationY = var1; // L: 7544
					var9 = Client.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 7546
					var9.packetBuffer.writeShort(var3); // L: 7547
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7548
					var9.packetBuffer.writeInt(class105.selectedItemWidget); // L: 7549
					var9.packetBuffer.writeShort(GrandExchangeOfferUnitPriceComparator.selectedItemSlot); // L: 7550
					var9.packetBuffer.writeShort(Script.selectedItemId); // L: 7551
					Client.packetWriter.addNode(var9); // L: 7552
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 7778
				if (var13 != null) { // L: 7779
					Client.mouseCrossX = var6; // L: 7780
					Client.mouseCrossY = var7; // L: 7781
					Client.mouseCrossColor = 2; // L: 7782
					Client.mouseCrossState = 0; // L: 7783
					Client.destinationX = var0; // L: 7784
					Client.destinationY = var1; // L: 7785
					var9 = Client.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher); // L: 7787
					var9.packetBuffer.writeShortLE(class232.selectedSpellWidget); // L: 7788
					var9.packetBuffer.writeShort(var3); // L: 7789
					var9.packetBuffer.method5653(Client.selectedSpellChildIndex); // L: 7790
					var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7791
					Client.packetWriter.addNode(var9); // L: 7792
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 7372
				if (var13 != null) { // L: 7373
					Client.mouseCrossX = var6; // L: 7374
					Client.mouseCrossY = var7; // L: 7375
					Client.mouseCrossColor = 2; // L: 7376
					Client.mouseCrossState = 0; // L: 7377
					Client.destinationX = var0; // L: 7378
					Client.destinationY = var1; // L: 7379
					var9 = Client.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher); // L: 7381
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7382
					var9.packetBuffer.method5653(var3); // L: 7383
					Client.packetWriter.addNode(var9); // L: 7384
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 7981
				if (var13 != null) { // L: 7982
					Client.mouseCrossX = var6; // L: 7983
					Client.mouseCrossY = var7; // L: 7984
					Client.mouseCrossColor = 2; // L: 7985
					Client.mouseCrossState = 0; // L: 7986
					Client.destinationX = var0; // L: 7987
					Client.destinationY = var1; // L: 7988
					var9 = Client.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher); // L: 7990
					var9.packetBuffer.writeShort(var3); // L: 7991
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7992
					Client.packetWriter.addNode(var9); // L: 7993
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 7728
				if (var13 != null) { // L: 7729
					Client.mouseCrossX = var6; // L: 7730
					Client.mouseCrossY = var7; // L: 7731
					Client.mouseCrossColor = 2; // L: 7732
					Client.mouseCrossState = 0; // L: 7733
					Client.destinationX = var0; // L: 7734
					Client.destinationY = var1; // L: 7735
					var9 = Client.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher); // L: 7737
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7738
					var9.packetBuffer.method5654(var3); // L: 7739
					Client.packetWriter.addNode(var9); // L: 7740
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 7419
				if (var13 != null) { // L: 7420
					Client.mouseCrossX = var6; // L: 7421
					Client.mouseCrossY = var7; // L: 7422
					Client.mouseCrossColor = 2; // L: 7423
					Client.mouseCrossState = 0; // L: 7424
					Client.destinationX = var0; // L: 7425
					Client.destinationY = var1; // L: 7426
					var9 = Client.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher); // L: 7428
					var9.packetBuffer.method5665(var3); // L: 7429
					var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7430
					Client.packetWriter.addNode(var9); // L: 7431
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 7712
				if (var13 != null) { // L: 7713
					Client.mouseCrossX = var6; // L: 7714
					Client.mouseCrossY = var7; // L: 7715
					Client.mouseCrossColor = 2; // L: 7716
					Client.mouseCrossState = 0; // L: 7717
					Client.destinationX = var0; // L: 7718
					Client.destinationY = var1; // L: 7719
					var9 = Client.getPacketBufferNode(ClientPacket.field2347, Client.packetWriter.isaacCipher); // L: 7721
					var9.packetBuffer.method5665(var3); // L: 7722
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7723
					Client.packetWriter.addNode(var9); // L: 7724
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 7759
					if (var15 != null) { // L: 7760
						Client.mouseCrossX = var6; // L: 7761
						Client.mouseCrossY = var7; // L: 7762
						Client.mouseCrossColor = 2; // L: 7763
						Client.mouseCrossState = 0; // L: 7764
						Client.destinationX = var0; // L: 7765
						Client.destinationY = var1; // L: 7766
						var9 = Client.getPacketBufferNode(ClientPacket.field2302, Client.packetWriter.isaacCipher); // L: 7768
						var9.packetBuffer.method5653(GrandExchangeOfferUnitPriceComparator.selectedItemSlot); // L: 7769
						var9.packetBuffer.writeShort(Script.selectedItemId); // L: 7770
						var9.packetBuffer.method5654(var3); // L: 7771
						var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7772
						var9.packetBuffer.writeInt(class105.selectedItemWidget); // L: 7773
						Client.packetWriter.addNode(var9); // L: 7774
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 7694
					if (var15 != null) { // L: 7695
						Client.mouseCrossX = var6; // L: 7696
						Client.mouseCrossY = var7; // L: 7697
						Client.mouseCrossColor = 2; // L: 7698
						Client.mouseCrossState = 0; // L: 7699
						Client.destinationX = var0; // L: 7700
						Client.destinationY = var1; // L: 7701
						var9 = Client.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher); // L: 7703
						var9.packetBuffer.method5663(class232.selectedSpellWidget); // L: 7704
						var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7705
						var9.packetBuffer.method5654(var3); // L: 7706
						var9.packetBuffer.method5654(Client.selectedSpellChildIndex); // L: 7707
						Client.packetWriter.addNode(var9); // L: 7708
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 7838
					Client.mouseCrossY = var7; // L: 7839
					Client.mouseCrossColor = 2; // L: 7840
					Client.mouseCrossState = 0; // L: 7841
					Client.destinationX = var0; // L: 7842
					Client.destinationY = var1; // L: 7843
					var8 = Client.getPacketBufferNode(ClientPacket.field2348, Client.packetWriter.isaacCipher); // L: 7845
					var8.packetBuffer.writeShort(WorldMapLabel.baseY + var1); // L: 7846
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7847
					var8.packetBuffer.method5653(Script.selectedItemId); // L: 7848
					var8.packetBuffer.writeShort(var3); // L: 7849
					var8.packetBuffer.method5654(GrandExchangeOfferUnitPriceComparator.selectedItemSlot); // L: 7850
					var8.packetBuffer.writeInt(class105.selectedItemWidget); // L: 7851
					var8.packetBuffer.writeShort(var0 + WorldMapManager.baseX); // L: 7852
					Client.packetWriter.addNode(var8); // L: 7853
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 7593
					Client.mouseCrossY = var7; // L: 7594
					Client.mouseCrossColor = 2; // L: 7595
					Client.mouseCrossState = 0; // L: 7596
					Client.destinationX = var0; // L: 7597
					Client.destinationY = var1; // L: 7598
					var8 = Client.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher); // L: 7600
					var8.packetBuffer.writeShortLE(class232.selectedSpellWidget); // L: 7601
					var8.packetBuffer.method5653(WorldMapLabel.baseY + var1); // L: 7602
					var8.packetBuffer.method5665(Client.selectedSpellChildIndex); // L: 7603
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7604
					var8.packetBuffer.writeShort(var3); // L: 7605
					var8.packetBuffer.method5653(var0 + WorldMapManager.baseX); // L: 7606
					Client.packetWriter.addNode(var8); // L: 7607
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 7918
					Client.mouseCrossY = var7; // L: 7919
					Client.mouseCrossColor = 2; // L: 7920
					Client.mouseCrossState = 0; // L: 7921
					Client.destinationX = var0; // L: 7922
					Client.destinationY = var1; // L: 7923
					var8 = Client.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher); // L: 7925
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7926
					var8.packetBuffer.method5653(var3); // L: 7927
					var8.packetBuffer.method5665(WorldMapLabel.baseY + var1); // L: 7928
					var8.packetBuffer.method5654(var0 + WorldMapManager.baseX); // L: 7929
					Client.packetWriter.addNode(var8); // L: 7930
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 7903
					Client.mouseCrossY = var7; // L: 7904
					Client.mouseCrossColor = 2; // L: 7905
					Client.mouseCrossState = 0; // L: 7906
					Client.destinationX = var0; // L: 7907
					Client.destinationY = var1; // L: 7908
					var8 = Client.getPacketBufferNode(ClientPacket.field2346, Client.packetWriter.isaacCipher); // L: 7910
					var8.packetBuffer.writeShort(var3); // L: 7911
					var8.packetBuffer.method5654(var0 + WorldMapManager.baseX); // L: 7912
					var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 7913
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7914
					Client.packetWriter.addNode(var8); // L: 7915
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 7328
					Client.mouseCrossY = var7; // L: 7329
					Client.mouseCrossColor = 2; // L: 7330
					Client.mouseCrossState = 0; // L: 7331
					Client.destinationX = var0; // L: 7332
					Client.destinationY = var1; // L: 7333
					var8 = Client.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher); // L: 7335
					var8.packetBuffer.method5654(var3); // L: 7336
					var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 7337
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7338
					var8.packetBuffer.method5665(var0 + WorldMapManager.baseX); // L: 7339
					Client.packetWriter.addNode(var8); // L: 7340
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 7888
					Client.mouseCrossY = var7; // L: 7889
					Client.mouseCrossColor = 2; // L: 7890
					Client.mouseCrossState = 0; // L: 7891
					Client.destinationX = var0; // L: 7892
					Client.destinationY = var1; // L: 7893
					var8 = Client.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher); // L: 7895
					var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7896
					var8.packetBuffer.method5654(var3); // L: 7897
					var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 7898
					var8.packetBuffer.method5653(var0 + WorldMapManager.baseX); // L: 7899
					Client.packetWriter.addNode(var8); // L: 7900
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 7268
					Client.mouseCrossY = var7; // L: 7269
					Client.mouseCrossColor = 2; // L: 7270
					Client.mouseCrossState = 0; // L: 7271
					Client.destinationX = var0; // L: 7272
					Client.destinationY = var1; // L: 7273
					var8 = Client.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher); // L: 7275
					var8.packetBuffer.method5653(var3); // L: 7276
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7277
					var8.packetBuffer.method5665(WorldMapLabel.baseY + var1); // L: 7278
					var8.packetBuffer.method5665(var0 + WorldMapManager.baseX); // L: 7279
					Client.packetWriter.addNode(var8); // L: 7280
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 7486
						ScriptEvent.scene.setViewportWalking(); // L: 7487
					} else {
						ScriptEvent.scene.menuOpen(Huffman.Client_plane, var0, var1, true); // L: 7490
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = TileItem.getWidget(var1); // L: 7665
						boolean var12 = true; // L: 7666
						if (var16.contentType > 0) { // L: 7667
							var12 = class4.method60(var16);
						}

						if (var12) { // L: 7668
							var11 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher); // L: 7670
							var11.packetBuffer.writeInt(var1); // L: 7671
							Client.packetWriter.addNode(var11); // L: 7672
						}
					} else {
						if (var2 == 25) {
							var16 = getWidgetChild(var1, var0); // L: 7570
							if (var16 != null) { // L: 7571
								class22.Widget_runOnTargetLeave(); // L: 7572
								User.selectSpell(var1, var0, GrandExchangeOfferTotalQuantityComparator.Widget_unpackTargetMask(WorldMapIcon_0.getWidgetFlags(var16)), var16.itemId); // L: 7573
								Client.isItemSelected = 0; // L: 7574
								Client.selectedSpellActionName = SpriteMask.Widget_getSpellActionName(var16); // L: 7575
								if (Client.selectedSpellActionName == null) { // L: 7576
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 7577
									Client.selectedSpellName = var16.dataText + WorldMapAreaData.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = WorldMapAreaData.colorStartTag(65280) + var16.spellName + WorldMapAreaData.colorStartTag(16777215); // L: 7578
								}
							}

							return; // L: 7580
						}

						if (var2 == 26) {
							ItemContainer.method1213(); // L: 7308
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher); // L: 7447
								var8.packetBuffer.writeInt(var1); // L: 7448
								Client.packetWriter.addNode(var8); // L: 7449
								var14 = TileItem.getWidget(var1); // L: 7450
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 7451
									var10 = var14.cs1Instructions[0][1]; // L: 7452
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 7453
									Clock.changeGameOptions(var10); // L: 7454
								}
							} else if (var2 == 29) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher); // L: 7825
								var8.packetBuffer.writeInt(var1); // L: 7826
								Client.packetWriter.addNode(var8); // L: 7827
								var14 = TileItem.getWidget(var1); // L: 7828
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 7829
									var10 = var14.cs1Instructions[0][1]; // L: 7830
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 7831
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 7832
										Clock.changeGameOptions(var10); // L: 7833
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 7610
									AbstractSocket.resumePauseWidget(var1, var0); // L: 7611
									Client.meslayerContinueWidget = getWidgetChild(var1, var0); // L: 7612
									class52.invalidateWidget(Client.meslayerContinueWidget); // L: 7613
								}
							} else if (var2 == 31) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher); // L: 7295
								var8.packetBuffer.method5654(var3); // L: 7296
								var8.packetBuffer.writeShortLE(class105.selectedItemWidget); // L: 7297
								var8.packetBuffer.method5665(var0); // L: 7298
								var8.packetBuffer.method5665(Script.selectedItemId); // L: 7299
								var8.packetBuffer.writeShortLE(var1); // L: 7300
								var8.packetBuffer.writeShort(GrandExchangeOfferUnitPriceComparator.selectedItemSlot); // L: 7301
								Client.packetWriter.addNode(var8); // L: 7302
								Client.field782 = 0; // L: 7303
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7304
								Client.field944 = var0; // L: 7305
							} else if (var2 == 32) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2335, Client.packetWriter.isaacCipher); // L: 7934
								var8.packetBuffer.method5653(var3); // L: 7935
								var8.packetBuffer.writeShortLE(class232.selectedSpellWidget); // L: 7936
								var8.packetBuffer.method5653(Client.selectedSpellChildIndex); // L: 7937
								var8.packetBuffer.writeInt(var1); // L: 7938
								var8.packetBuffer.writeShort(var0); // L: 7939
								Client.packetWriter.addNode(var8); // L: 7940
								Client.field782 = 0; // L: 7941
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7942
								Client.field944 = var0; // L: 7943
							} else if (var2 == 33) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher); // L: 7857
								var8.packetBuffer.method5665(var0); // L: 7858
								var8.packetBuffer.method5653(var3); // L: 7859
								var8.packetBuffer.writeShortLE(var1); // L: 7860
								Client.packetWriter.addNode(var8); // L: 7861
								Client.field782 = 0; // L: 7862
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7863
								Client.field944 = var0; // L: 7864
							} else if (var2 == 34) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher); // L: 7258
								var8.packetBuffer.method5662(var1); // L: 7259
								var8.packetBuffer.method5653(var0); // L: 7260
								var8.packetBuffer.method5654(var3); // L: 7261
								Client.packetWriter.addNode(var8); // L: 7262
								Client.field782 = 0; // L: 7263
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7264
								Client.field944 = var0; // L: 7265
							} else if (var2 == 35) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher); // L: 7476
								var8.packetBuffer.method5654(var3); // L: 7477
								var8.packetBuffer.writeShortLE(var1); // L: 7478
								var8.packetBuffer.method5653(var0); // L: 7479
								Client.packetWriter.addNode(var8); // L: 7480
								Client.field782 = 0; // L: 7481
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7482
								Client.field944 = var0; // L: 7483
							} else if (var2 == 36) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher); // L: 8023
								var8.packetBuffer.writeShort(var0); // L: 8024
								var8.packetBuffer.writeShort(var3); // L: 8025
								var8.packetBuffer.method5663(var1); // L: 8026
								Client.packetWriter.addNode(var8); // L: 8027
								Client.field782 = 0; // L: 8028
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 8029
								Client.field944 = var0; // L: 8030
							} else if (var2 == 37) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2331, Client.packetWriter.isaacCipher); // L: 7436
								var8.packetBuffer.method5653(var3); // L: 7437
								var8.packetBuffer.writeShort(var0); // L: 7438
								var8.packetBuffer.writeShortLE(var1); // L: 7439
								Client.packetWriter.addNode(var8); // L: 7440
								Client.field782 = 0; // L: 7441
								GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7442
								Client.field944 = var0; // L: 7443
							} else {
								if (var2 == 38) {
									class22.Widget_runOnTargetLeave(); // L: 7812
									var16 = TileItem.getWidget(var1); // L: 7813
									Client.isItemSelected = 1; // L: 7814
									GrandExchangeOfferUnitPriceComparator.selectedItemSlot = var0; // L: 7815
									class105.selectedItemWidget = var1; // L: 7816
									Script.selectedItemId = var3; // L: 7817
									class52.invalidateWidget(var16); // L: 7818
									Client.selectedItemName = WorldMapAreaData.colorStartTag(16748608) + GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).name + WorldMapAreaData.colorStartTag(16777215); // L: 7819
									if (Client.selectedItemName == null) { // L: 7820
										Client.selectedItemName = "null";
									}

									return; // L: 7821
								}

								if (var2 == 39) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher); // L: 7284
									var8.packetBuffer.writeInt(var1); // L: 7285
									var8.packetBuffer.method5654(var0); // L: 7286
									var8.packetBuffer.method5654(var3); // L: 7287
									Client.packetWriter.addNode(var8); // L: 7288
									Client.field782 = 0; // L: 7289
									GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7290
									Client.field944 = var0; // L: 7291
								} else if (var2 == 40) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher); // L: 7618
									var8.packetBuffer.method5653(var0); // L: 7619
									var8.packetBuffer.method5653(var3); // L: 7620
									var8.packetBuffer.method5663(var1); // L: 7621
									Client.packetWriter.addNode(var8); // L: 7622
									Client.field782 = 0; // L: 7623
									GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7624
									Client.field944 = var0; // L: 7625
								} else if (var2 == 41) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2340, Client.packetWriter.isaacCipher); // L: 7640
									var8.packetBuffer.writeShortLE(var1); // L: 7641
									var8.packetBuffer.writeShort(var3); // L: 7642
									var8.packetBuffer.writeShort(var0); // L: 7643
									Client.packetWriter.addNode(var8); // L: 7644
									Client.field782 = 0; // L: 7645
									GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7646
									Client.field944 = var0; // L: 7647
								} else if (var2 == 42) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2337, Client.packetWriter.isaacCipher); // L: 7629
									var8.packetBuffer.method5665(var3); // L: 7630
									var8.packetBuffer.writeShort(var0); // L: 7631
									var8.packetBuffer.method5662(var1); // L: 7632
									Client.packetWriter.addNode(var8); // L: 7633
									Client.field782 = 0; // L: 7634
									GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7635
									Client.field944 = var0; // L: 7636
								} else if (var2 == 43) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher); // L: 7527
									var8.packetBuffer.method5653(var0); // L: 7528
									var8.packetBuffer.method5654(var3); // L: 7529
									var8.packetBuffer.method5663(var1); // L: 7530
									Client.packetWriter.addNode(var8); // L: 7531
									Client.field782 = 0; // L: 7532
									GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7533
									Client.field944 = var0; // L: 7534
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 7965
									if (var15 != null) { // L: 7966
										Client.mouseCrossX = var6; // L: 7967
										Client.mouseCrossY = var7; // L: 7968
										Client.mouseCrossColor = 2; // L: 7969
										Client.mouseCrossState = 0; // L: 7970
										Client.destinationX = var0; // L: 7971
										Client.destinationY = var1; // L: 7972
										var9 = Client.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher); // L: 7974
										var9.packetBuffer.method5665(var3); // L: 7975
										var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7976
										Client.packetWriter.addNode(var9); // L: 7977
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 7796
									if (var15 != null) { // L: 7797
										Client.mouseCrossX = var6; // L: 7798
										Client.mouseCrossY = var7; // L: 7799
										Client.mouseCrossColor = 2; // L: 7800
										Client.mouseCrossState = 0; // L: 7801
										Client.destinationX = var0; // L: 7802
										Client.destinationY = var1; // L: 7803
										var9 = Client.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher); // L: 7805
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7806
										var9.packetBuffer.method5665(var3); // L: 7807
										Client.packetWriter.addNode(var9); // L: 7808
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 7510
									if (var15 != null) { // L: 7511
										Client.mouseCrossX = var6; // L: 7512
										Client.mouseCrossY = var7; // L: 7513
										Client.mouseCrossColor = 2; // L: 7514
										Client.mouseCrossState = 0; // L: 7515
										Client.destinationX = var0; // L: 7516
										Client.destinationY = var1; // L: 7517
										var9 = Client.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher); // L: 7519
										var9.packetBuffer.method5654(var3); // L: 7520
										var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7521
										Client.packetWriter.addNode(var9); // L: 7522
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8033
									if (var15 != null) { // L: 8034
										Client.mouseCrossX = var6; // L: 8035
										Client.mouseCrossY = var7; // L: 8036
										Client.mouseCrossColor = 2; // L: 8037
										Client.mouseCrossState = 0; // L: 8038
										Client.destinationX = var0; // L: 8039
										Client.destinationY = var1; // L: 8040
										var9 = Client.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher); // L: 8042
										var9.packetBuffer.method5653(var3); // L: 8043
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8044
										Client.packetWriter.addNode(var9); // L: 8045
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 7946
									if (var15 != null) { // L: 7947
										Client.mouseCrossX = var6; // L: 7948
										Client.mouseCrossY = var7; // L: 7949
										Client.mouseCrossColor = 2; // L: 7950
										Client.mouseCrossState = 0; // L: 7951
										Client.destinationX = var0; // L: 7952
										Client.destinationY = var1; // L: 7953
										var9 = Client.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher); // L: 7955
										var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7956
										var9.packetBuffer.method5665(var3); // L: 7957
										Client.packetWriter.addNode(var9); // L: 7958
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 7343
									if (var15 != null) { // L: 7344
										Client.mouseCrossX = var6; // L: 7345
										Client.mouseCrossY = var7; // L: 7346
										Client.mouseCrossColor = 2; // L: 7347
										Client.mouseCrossState = 0; // L: 7348
										Client.destinationX = var0; // L: 7349
										Client.destinationY = var1; // L: 7350
										var9 = Client.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher); // L: 7352
										var9.packetBuffer.method5665(var3); // L: 7353
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7354
										Client.packetWriter.addNode(var9); // L: 7355
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 7494
									if (var15 != null) { // L: 7495
										Client.mouseCrossX = var6; // L: 7496
										Client.mouseCrossY = var7; // L: 7497
										Client.mouseCrossColor = 2; // L: 7498
										Client.mouseCrossState = 0; // L: 7499
										Client.destinationX = var0; // L: 7500
										Client.destinationY = var1; // L: 7501
										var9 = Client.getPacketBufferNode(ClientPacket.field2343, Client.packetWriter.isaacCipher); // L: 7503
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7504
										var9.packetBuffer.method5654(var3); // L: 7505
										Client.packetWriter.addNode(var9); // L: 7506
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 7403
									if (var15 != null) { // L: 7404
										Client.mouseCrossX = var6; // L: 7405
										Client.mouseCrossY = var7; // L: 7406
										Client.mouseCrossColor = 2; // L: 7407
										Client.mouseCrossState = 0; // L: 7408
										Client.destinationX = var0; // L: 7409
										Client.destinationY = var1; // L: 7410
										var9 = Client.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher); // L: 7412
										var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7413
										var9.packetBuffer.writeShort(var3); // L: 7414
										Client.packetWriter.addNode(var9); // L: 7415
									}
								} else {
									label642: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = getWidgetChild(var1, var0); // L: 7556
												if (var16 != null) { // L: 7557
													var9 = Client.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher); // L: 7559
													var9.packetBuffer.method5662(class232.selectedSpellWidget); // L: 7560
													var9.packetBuffer.method5665(Client.selectedSpellChildIndex); // L: 7561
													var9.packetBuffer.method5654(var16.itemId); // L: 7562
													var9.packetBuffer.writeShortLE(var1); // L: 7563
													var9.packetBuffer.method5665(Client.field834); // L: 7564
													var9.packetBuffer.method5653(var0); // L: 7565
													Client.packetWriter.addNode(var9); // L: 7566
												}
												break label642;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 7867
												Client.mouseCrossY = var7; // L: 7868
												Client.mouseCrossColor = 2; // L: 7869
												Client.mouseCrossState = 0; // L: 7870
												Client.destinationX = var0; // L: 7871
												Client.destinationY = var1; // L: 7872
												var8 = Client.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher); // L: 7874
												var8.packetBuffer.method5654(WorldMapLabel.baseY + var1); // L: 7875
												var8.packetBuffer.method5654(var0 + WorldMapManager.baseX); // L: 7876
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 7877
												var8.packetBuffer.method5665(var3); // L: 7878
												Client.packetWriter.addNode(var8); // L: 7879
												break label642;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 7997
												Client.mouseCrossY = var7; // L: 7998
												Client.mouseCrossColor = 2; // L: 7999
												Client.mouseCrossState = 0; // L: 8000
												var8 = Client.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher); // L: 8002
												var8.packetBuffer.method5653(var3); // L: 8003
												Client.packetWriter.addNode(var8); // L: 8004
												break label642;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 7458
												Client.mouseCrossY = var7; // L: 7459
												Client.mouseCrossColor = 2; // L: 7460
												Client.mouseCrossState = 0; // L: 7461
												var13 = Client.npcs[var3]; // L: 7462
												if (var13 != null) { // L: 7463
													NPCDefinition var17 = var13.definition; // L: 7464
													if (var17.transforms != null) { // L: 7465
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 7466
														var11 = Client.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher); // L: 7468
														var11.packetBuffer.method5654(var17.id); // L: 7469
														Client.packetWriter.addNode(var11); // L: 7470
													}
												}
												break label642;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 7583
												Client.mouseCrossY = var7; // L: 7584
												Client.mouseCrossColor = 2; // L: 7585
												Client.mouseCrossState = 0; // L: 7586
												var8 = Client.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher); // L: 7588
												var8.packetBuffer.method5654(var3); // L: 7589
												Client.packetWriter.addNode(var8); // L: 7590
												break label642;
											}

											if (var2 == 1005) {
												var16 = TileItem.getWidget(var1); // L: 7359
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 7360
													WorldMapRectangle.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).name);
												} else {
													var9 = Client.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher); // L: 7363
													var9.packetBuffer.method5654(var3); // L: 7364
													Client.packetWriter.addNode(var9); // L: 7365
												}

												Client.field782 = 0; // L: 7367
												GrandExchangeEvent.field79 = TileItem.getWidget(var1); // L: 7368
												Client.field944 = var0; // L: 7369
												break label642;
											}

											if (var2 != 1007) {
												if (var2 == 1011 || var2 == 1010 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
													Message.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 7962
												}
												break label642;
											}
										}

										var16 = getWidgetChild(var1, var0); // L: 7882
										if (var16 != null) { // L: 7883
											UserComparator8.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 7884
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8048
			Client.isItemSelected = 0; // L: 8049
			class52.invalidateWidget(TileItem.getWidget(class105.selectedItemWidget)); // L: 8050
		}

		if (Client.isSpellSelected) { // L: 8052
			class22.Widget_runOnTargetLeave();
		}

		if (GrandExchangeEvent.field79 != null && Client.field782 == 0) { // L: 8053
			class52.invalidateWidget(GrandExchangeEvent.field79);
		}

	} // L: 8054

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "460315375"
	)
	static String method1202(String var0) {
		PlayerType[] var1 = ApproximateRouteStrategy.PlayerType_values(); // L: 10887

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 10888
			PlayerType var3 = var1[var2]; // L: 10889
			if (var3.modIcon != -1 && var0.startsWith(WorldMapScaleHandler.method824(var3.modIcon))) { // L: 10891 10892
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 10893
				break;
			}
		}

		return var0; // L: 10900
	}
}
