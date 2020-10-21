import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class9 {
	@ObfuscatedName("f")
	ExecutorService field44;
	@ObfuscatedName("b")
	Future field41;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	final Buffer field43;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class12 field40;

	@ObfuscatedSignature(
		descriptor = "(Lkb;Ln;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field44 = Executors.newSingleThreadExecutor(); // L: 10
		this.field43 = var1;
		this.field40 = var2;
		this.method129(); // L: 18
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "208933439"
	)
	public boolean method120() {
		return this.field41.isDone();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1441030159"
	)
	public void method121() {
		this.field44.shutdown();
		this.field44 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "590307722"
	)
	public Buffer method122() {
		try {
			return (Buffer)this.field41.get();
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106026130"
	)
	void method129() {
		this.field41 = this.field44.submit(new class8(this, this.field43, this.field40)); // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-47"
	)
	static final boolean method124(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (class3.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class349.field4075; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class349.field4073; // L: 26

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true; // L: 29
				}
			}

			return false; // L: 32
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lks;IS)Z",
		garbageValue = "21881"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 541
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 542
			if (var0.readBits(1) != 0) { // L: 543
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 544
			var4 = var0.readBits(13); // L: 545
			boolean var12 = var0.readBits(1) == 1; // L: 546
			if (var12) { // L: 547
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 548
				throw new RuntimeException(); // L: 549
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 551
				var11.index = var1; // L: 552
				if (Players.field1284[var1] != null) { // L: 553
					var11.read(Players.field1284[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 554
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 555
				var7 = Players.Players_regions[var1]; // L: 556
				var8 = var7 >> 28; // L: 557
				var9 = var7 >> 14 & 255; // L: 558
				var10 = var7 & 255; // L: 559
				var11.pathTraversed[0] = Players.field1295[var1]; // L: 560
				var11.plane = (byte)var8; // L: 561
				var11.resetPath((var9 << 13) + var3 - FloorDecoration.baseX, (var10 << 13) + var4 - WorldMapData_0.baseY); // L: 562
				var11.field664 = false; // L: 563
				return true; // L: 564
			}
		} else if (var2 == 1) { // L: 566
			var3 = var0.readBits(2); // L: 567
			var4 = Players.Players_regions[var1]; // L: 568
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 569
			return false; // L: 570
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 572
				var3 = var0.readBits(5); // L: 573
				var4 = var3 >> 3; // L: 574
				var5 = var3 & 7; // L: 575
				var6 = Players.Players_regions[var1]; // L: 576
				var7 = (var6 >> 28) + var4 & 3; // L: 577
				var8 = var6 >> 14 & 255; // L: 578
				var9 = var6 & 255; // L: 579
				if (var5 == 0) { // L: 580
					--var8; // L: 581
					--var9; // L: 582
				}

				if (var5 == 1) { // L: 584
					--var9;
				}

				if (var5 == 2) { // L: 585
					++var8; // L: 586
					--var9; // L: 587
				}

				if (var5 == 3) { // L: 589
					--var8;
				}

				if (var5 == 4) { // L: 590
					++var8;
				}

				if (var5 == 5) { // L: 591
					--var8; // L: 592
					++var9; // L: 593
				}

				if (var5 == 6) { // L: 595
					++var9;
				}

				if (var5 == 7) { // L: 596
					++var8; // L: 597
					++var9; // L: 598
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 600
				return false; // L: 601
			} else {
				var3 = var0.readBits(18); // L: 603
				var4 = var3 >> 16; // L: 604
				var5 = var3 >> 8 & 255; // L: 605
				var6 = var3 & 255; // L: 606
				var7 = Players.Players_regions[var1]; // L: 607
				var8 = (var7 >> 28) + var4 & 3; // L: 608
				var9 = var5 + (var7 >> 14) & 255; // L: 609
				var10 = var6 + var7 & 255; // L: 610
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 611
				return false; // L: 612
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1826644624"
	)
	static void method132() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromIgnored(); // L: 64
		}

	} // L: 67

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lht;III)V",
		garbageValue = "549022721"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3627
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3628
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3629
				if (var3 == null) { // L: 3630
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3631
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3632
				if (var3.contains(var4, var5)) { // L: 3633
					var4 -= var3.width / 2; // L: 3634
					var5 -= var3.height / 2; // L: 3635
					int var6 = Client.camAngleY & 2047; // L: 3636
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3637
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3638
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 3639
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3640
					int var11 = var9 + PlayerType.localPlayer.x >> 7; // L: 3641
					int var12 = PlayerType.localPlayer.y - var10 >> 7; // L: 3642
					PacketBufferNode var13 = class4.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher); // L: 3644
					var13.packetBuffer.writeByte(18); // L: 3645
					var13.packetBuffer.method5674(var11 + FloorDecoration.baseX); // L: 3646
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3647
					var13.packetBuffer.writeShortLE(var12 + WorldMapData_0.baseY); // L: 3648
					var13.packetBuffer.writeByte(var4); // L: 3649
					var13.packetBuffer.writeByte(var5); // L: 3650
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3651
					var13.packetBuffer.writeByte(57); // L: 3652
					var13.packetBuffer.writeByte(0); // L: 3653
					var13.packetBuffer.writeByte(0); // L: 3654
					var13.packetBuffer.writeByte(89); // L: 3655
					var13.packetBuffer.writeShort(PlayerType.localPlayer.x); // L: 3656
					var13.packetBuffer.writeShort(PlayerType.localPlayer.y); // L: 3657
					var13.packetBuffer.writeByte(63); // L: 3658
					Client.packetWriter.addNode(var13); // L: 3659
					Client.destinationX = var11; // L: 3660
					Client.destinationY = var12; // L: 3661
				}
			}

		}
	} // L: 3664
}
