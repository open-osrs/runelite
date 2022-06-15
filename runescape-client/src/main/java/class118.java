import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
public class class118 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1481;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1477;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1478;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1479;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1480;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class118 field1484;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -451186485
	)
	final int field1482;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1492168119
	)
	final int field1483;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1225507013
	)
	final int field1486;

	static {
		field1481 = new class118(0, 0, (String)null, 0); // L: 14
		field1477 = new class118(1, 1, (String)null, 9); // L: 15
		field1478 = new class118(2, 2, (String)null, 3); // L: 16
		field1479 = new class118(3, 3, (String)null, 6); // L: 17
		field1480 = new class118(4, 4, (String)null, 1); // L: 18
		field1484 = new class118(5, 5, (String)null, 3); // L: 19
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1482 = var1; // L: 25
		this.field1483 = var2; // L: 26
		this.field1486 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1483; // L: 46
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129901712"
	)
	int method2736() {
		return this.field1486; // L: 41
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-533774728"
	)
	static void method2738() {
		if (class136.loadWorlds()) { // L: 1924
			Login.worldSelectOpen = true; // L: 1925
			Login.worldSelectPage = 0; // L: 1926
			Login.worldSelectPagesCount = 0; // L: 1927
		}

	} // L: 1929

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-81"
	)
	static int method2742(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3535
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3536
			return 1; // L: 3537
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3539
			class446.Interpreter_intStackSize -= 3; // L: 3540
			Client.publicChatMode = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3541
			class339.privateChatMode = Ignored.method6780(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 3542
			if (class339.privateChatMode == null) { // L: 3543
				class339.privateChatMode = PrivateChatMode.field4817;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 3544
			PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher); // L: 3546
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3547
			var13.packetBuffer.writeByte(class339.privateChatMode.field4820); // L: 3548
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3549
			Client.packetWriter.addNode(var13); // L: 3550
			return 1; // L: 3551
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3553
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3554
				class446.Interpreter_intStackSize -= 2; // L: 3555
				var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3556
				var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3557
				var6 = EnumComposition.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher); // L: 3559
				var6.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3560
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3561
				var6.packetBuffer.writeByte(var7 - 1); // L: 3562
				var6.packetBuffer.writeByte(var9); // L: 3563
				Client.packetWriter.addNode(var6); // L: 3564
				return 1; // L: 3565
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3567
					class446.Interpreter_intStackSize -= 2; // L: 3568
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3569
					var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3570
					var5 = class18.Messages_getByChannelAndID(var3, var7); // L: 3571
					if (var5 != null) { // L: 3572
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.count; // L: 3573
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.cycle; // L: 3574
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3575
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3576
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3577
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3578
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3581
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3582
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3583
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3584
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3585
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3586
					}

					return 1; // L: 3588
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3590
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3591
						var4 = UserComparator7.Messages_getMessage(var3); // L: 3592
						if (var4 != null) { // L: 3593
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.type; // L: 3594
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.cycle; // L: 3595
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3596
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3597
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3598
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3599
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3602
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3603
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3604
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3605
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3606
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3607
						}

						return 1; // L: 3609
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3611
						if (class339.privateChatMode == null) { // L: 3612
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class339.privateChatMode.field4820; // L: 3613
						}

						return 1; // L: 3614
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3616
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3617
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3618
							var12 = PlayerComposition.method5600(var7, var8, class134.clientLanguage, -1); // L: 3619
							Client.packetWriter.addNode(var12); // L: 3620
							return 1; // L: 3621
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3623
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3624
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3625
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3626
							var12 = EnumComposition.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher); // L: 3628
							var12.packetBuffer.writeShort(0); // L: 3629
							int var10 = var12.packetBuffer.offset; // L: 3630
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3631
							PcmPlayer.method720(var12.packetBuffer, var11); // L: 3632
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3633
							Client.packetWriter.addNode(var12); // L: 3634
							return 1; // L: 3635
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3637
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3638
							class446.Interpreter_intStackSize -= 2; // L: 3639
							var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3640
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3641
							var6 = PlayerComposition.method5600(var7, var8, class134.clientLanguage, var9); // L: 3642
							Client.packetWriter.addNode(var6); // L: 3643
							return 1; // L: 3644
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3646
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3653
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3654
								return 1; // L: 3655
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3657
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3658
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ClanChannelMember.Messages_getHistorySize(var3); // L: 3659
								return 1; // L: 3660
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3662
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3663
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = DirectByteArrayCopier.Messages_getLastChatID(var3); // L: 3664
								return 1; // L: 3665
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3667
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3668
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.method305(var3); // L: 3669
								return 1; // L: 3670
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3672
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3673
								class115.doCheat(var8); // L: 3674
								return 1; // L: 3675
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3677
								Client.field716 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3678
								return 1; // L: 3679
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3681
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field716; // L: 3682
								return 1; // L: 3683
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3685
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3686
								System.out.println(var8); // L: 3687
								return 1; // L: 3688
							} else if (var0 == 5024) { // L: 3690
								--class446.Interpreter_intStackSize; // L: 3691
								return 1; // L: 3692
							} else if (var0 == 5025) { // L: 3694
								++class446.Interpreter_intStackSize; // L: 3695
								return 1; // L: 3696
							} else if (var0 == 5030) { // L: 3698
								class446.Interpreter_intStackSize -= 2; // L: 3699
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3700
								var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3701
								var5 = class18.Messages_getByChannelAndID(var3, var7); // L: 3702
								if (var5 != null) { // L: 3703
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.count; // L: 3704
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.cycle; // L: 3705
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3706
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3707
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3708
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3709
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3710
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3711
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3714
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3715
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3716
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3717
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3718
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3719
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3720
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3721
								}

								return 1; // L: 3723
							} else if (var0 == 5031) { // L: 3725
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3726
								var4 = UserComparator7.Messages_getMessage(var3); // L: 3727
								if (var4 != null) { // L: 3728
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.type; // L: 3729
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.cycle; // L: 3730
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3731
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3732
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3733
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3734
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3735
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3736
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 3739
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3740
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3741
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3742
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3743
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3744
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3745
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 3746
								}

								return 1; // L: 3748
							} else {
								return 2; // L: 3750
							}
						} else {
							if (class101.localPlayer != null && class101.localPlayer.username != null) { // L: 3648
								var8 = class101.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3649
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8; // L: 3650
							return 1; // L: 3651
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-58"
	)
	static int method2744(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3799
			class446.Interpreter_intStackSize -= 2; // L: 3800
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 3801
			int var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 3802
			if (!Client.isCameraLocked) { // L: 3803
				Client.camAngleX = var3; // L: 3804
				Client.camAngleY = var4; // L: 3805
			}

			return 1; // L: 3807
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3809
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3810
			return 1; // L: 3811
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3813
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3814
			return 1; // L: 3815
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3817
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 3818
			if (var3 < 0) { // L: 3819
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3820
			return 1; // L: 3821
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3823
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3824
			return 1; // L: 3825
		} else {
			return 2; // L: 3827
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Lkb;IIIZB)V",
		garbageValue = "84"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10669
			Widget var6 = var0[var5]; // L: 10670
			if (var6 != null && var6.parentId == var1) { // L: 10671 10672
				Decimator.alignWidgetSize(var6, var2, var3, var4); // L: 10673
				class240.alignWidgetPosition(var6, var2, var3); // L: 10674
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10675
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10676
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 10677
				}

				if (var6.scrollY < 0) { // L: 10678
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10679
					BufferedNetSocket.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10681
}
