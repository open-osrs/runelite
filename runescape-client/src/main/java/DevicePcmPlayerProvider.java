import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("t")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -637981437
	)
	static int field146;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 798256057
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive14")
	static Archive archive14;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lao;",
		garbageValue = "-1472980183"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lda;",
		garbageValue = "-1114679532"
	)
	static class123[] method383() {
		return new class123[]{class123.field1505, class123.field1494, class123.field1495, class123.field1496, class123.field1497, class123.field1498, class123.field1493, class123.field1500, class123.field1501}; // L: 97
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "1263905668"
	)
	static int method384(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3525
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3526
			return 1; // L: 3527
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3529
			class295.Interpreter_intStackSize -= 3; // L: 3530
			Client.publicChatMode = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3531
			Varps.privateChatMode = class83.method2124(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 3532
			if (Varps.privateChatMode == null) { // L: 3533
				Varps.privateChatMode = PrivateChatMode.field4738;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3534
			PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher); // L: 3536
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3537
			var13.packetBuffer.writeByte(Varps.privateChatMode.field4737); // L: 3538
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3539
			Client.packetWriter.addNode(var13); // L: 3540
			return 1; // L: 3541
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3543
				var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3544
				class295.Interpreter_intStackSize -= 2; // L: 3545
				var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3546
				var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3547
				var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher); // L: 3549
				var6.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3550
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3551
				var6.packetBuffer.writeByte(var7 - 1); // L: 3552
				var6.packetBuffer.writeByte(var9); // L: 3553
				Client.packetWriter.addNode(var6); // L: 3554
				return 1; // L: 3555
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3557
					class295.Interpreter_intStackSize -= 2; // L: 3558
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3559
					var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3560
					var5 = Tiles.Messages_getByChannelAndID(var3, var7); // L: 3561
					if (var5 != null) { // L: 3562
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.count; // L: 3563
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.cycle; // L: 3564
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3565
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3566
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3567
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3568
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3571
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3572
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3573
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3574
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3575
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3576
					}

					return 1; // L: 3578
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3580
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3581
						var4 = Strings.Messages_getMessage(var3); // L: 3582
						if (var4 != null) { // L: 3583
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.type; // L: 3584
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.cycle; // L: 3585
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3586
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3587
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3588
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3589
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3592
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3593
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3594
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3595
							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3596
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3597
						}

						return 1; // L: 3599
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3601
						if (Varps.privateChatMode == null) { // L: 3602
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Varps.privateChatMode.field4737; // L: 3603
						}

						return 1; // L: 3604
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3606
							var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3607
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3608
							var12 = class388.method7151(var7, var8, FriendSystem.clientLanguage, -1); // L: 3609
							Client.packetWriter.addNode(var12); // L: 3610
							return 1; // L: 3611
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3613
							ChatChannel.Interpreter_stringStackSize -= 2; // L: 3614
							var8 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize]; // L: 3615
							String var11 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1]; // L: 3616
							var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher); // L: 3618
							var12.packetBuffer.writeShort(0); // L: 3619
							int var10 = var12.packetBuffer.offset; // L: 3620
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3621
							WorldMapIcon_0.method4900(var12.packetBuffer, var11); // L: 3622
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3623
							Client.packetWriter.addNode(var12); // L: 3624
							return 1; // L: 3625
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3627
							var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3628
							class295.Interpreter_intStackSize -= 2; // L: 3629
							var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3630
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3631
							var6 = class388.method7151(var7, var8, FriendSystem.clientLanguage, var9); // L: 3632
							Client.packetWriter.addNode(var6); // L: 3633
							return 1; // L: 3634
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3636
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3643
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3644
								return 1; // L: 3645
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3647
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3648
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Message.Messages_getHistorySize(var3); // L: 3649
								return 1; // L: 3650
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3652
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3653
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class18.Messages_getLastChatID(var3); // L: 3654
								return 1; // L: 3655
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3657
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3658
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = WorldMapSectionType.method4942(var3); // L: 3659
								return 1; // L: 3660
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3662
								var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3663
								class9.doCheat(var8); // L: 3664
								return 1; // L: 3665
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3667
								Client.field712 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3668
								return 1; // L: 3669
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3671
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = Client.field712; // L: 3672
								return 1; // L: 3673
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3675
								var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3676
								System.out.println(var8); // L: 3677
								return 1; // L: 3678
							} else if (var0 == 5024) { // L: 3680
								--class295.Interpreter_intStackSize; // L: 3681
								return 1; // L: 3682
							} else if (var0 == 5025) { // L: 3684
								++class295.Interpreter_intStackSize; // L: 3685
								return 1; // L: 3686
							} else if (var0 == 5030) { // L: 3688
								class295.Interpreter_intStackSize -= 2; // L: 3689
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3690
								var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3691
								var5 = Tiles.Messages_getByChannelAndID(var3, var7); // L: 3692
								if (var5 != null) { // L: 3693
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.count; // L: 3694
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.cycle; // L: 3695
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3696
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3697
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3698
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3699
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3700
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3701
								} else {
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3704
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3705
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3706
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3707
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3708
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3709
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3710
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3711
								}

								return 1; // L: 3713
							} else if (var0 == 5031) { // L: 3715
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3716
								var4 = Strings.Messages_getMessage(var3); // L: 3717
								if (var4 != null) { // L: 3718
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.type; // L: 3719
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.cycle; // L: 3720
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3721
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3722
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3723
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3724
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3725
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3726
								} else {
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3729
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3730
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3731
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3732
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3733
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3734
									Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3735
									Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3736
								}

								return 1; // L: 3738
							} else {
								return 2; // L: 3740
							}
						} else {
							if (class19.localPlayer != null && class19.localPlayer.username != null) { // L: 3638
								var8 = class19.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3639
							}

							Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var8; // L: 3640
							return 1; // L: 3641
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "632699476"
	)
	static int method385(int var0) {
		return var0 * 3 + 600; // L: 1377
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Lkn;",
		garbageValue = "2084106709"
	)
	static Widget method381(Widget var0) {
		Widget var1 = UserComparator3.method2601(var0); // L: 11271
		if (var1 == null) {
			var1 = var0.parent; // L: 11272
		}

		return var1; // L: 11273
	}
}
