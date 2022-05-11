import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pi")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	static ClanSettings field4583;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 957028551
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("p")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2051101893"
	)
	static void method7230(int var0) {
	} // L: 32

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpi;",
		garbageValue = "-1328353728"
	)
	public static FontName[] method7232() {
		return new FontName[]{FontName_plain11, FontName_verdana13, FontName_bold12, FontName_verdana15, FontName_verdana11, FontName_plain12}; // L: 16
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "25"
	)
	public static int method7228(int var0) {
		--var0; // L: 75
		var0 |= var0 >>> 1; // L: 76
		var0 |= var0 >>> 2; // L: 77
		var0 |= var0 >>> 4; // L: 78
		var0 |= var0 >>> 8; // L: 79
		var0 |= var0 >>> 16; // L: 80
		return var0 + 1; // L: 81
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "2124893336"
	)
	static int method7231(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3525
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3526
			return 1; // L: 3527
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3529
			class12.Interpreter_intStackSize -= 3; // L: 3530
			Client.publicChatMode = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3531
			class21.privateChatMode = class116.method2686(Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]); // L: 3532
			if (class21.privateChatMode == null) { // L: 3533
				class21.privateChatMode = PrivateChatMode.field4794;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 2]; // L: 3534
			PacketBufferNode var13 = WallDecoration.getPacketBufferNode(ClientPacket.field3052, Client.packetWriter.isaacCipher); // L: 3536
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3537
			var13.packetBuffer.writeByte(class21.privateChatMode.field4796); // L: 3538
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3539
			Client.packetWriter.addNode(var13); // L: 3540
			return 1; // L: 3541
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3543
				var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3544
				class12.Interpreter_intStackSize -= 2; // L: 3545
				var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3546
				var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3547
				var6 = WallDecoration.getPacketBufferNode(ClientPacket.field3039, Client.packetWriter.isaacCipher); // L: 3549
				var6.packetBuffer.writeByte(class392.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3550
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3551
				var6.packetBuffer.writeByte(var7 - 1); // L: 3552
				var6.packetBuffer.writeByte(var9); // L: 3553
				Client.packetWriter.addNode(var6); // L: 3554
				return 1; // L: 3555
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3557
					class12.Interpreter_intStackSize -= 2; // L: 3558
					var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3559
					var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3560
					var5 = class175.Messages_getByChannelAndID(var3, var7); // L: 3561
					if (var5 != null) { // L: 3562
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.count; // L: 3563
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.cycle; // L: 3564
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3565
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3566
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3567
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3568
					} else {
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3571
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3572
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3573
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3574
						Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3575
						Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3576
					}

					return 1; // L: 3578
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3580
						var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3581
						var4 = class12.Messages_getMessage(var3); // L: 3582
						if (var4 != null) { // L: 3583
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.type; // L: 3584
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.cycle; // L: 3585
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3586
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3587
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3588
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3589
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3592
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3593
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3594
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3595
							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3596
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3597
						}

						return 1; // L: 3599
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3601
						if (class21.privateChatMode == null) { // L: 3602
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class21.privateChatMode.field4796; // L: 3603
						}

						return 1; // L: 3604
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3606
							var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3607
							var7 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3608
							var12 = GrandExchangeOfferNameComparator.method5784(var7, var8, class263.clientLanguage, -1); // L: 3609
							Client.packetWriter.addNode(var12); // L: 3610
							return 1; // L: 3611
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3613
							class9.Interpreter_stringStackSize -= 2; // L: 3614
							var8 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize]; // L: 3615
							String var11 = Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize + 1]; // L: 3616
							var12 = WallDecoration.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 3618
							var12.packetBuffer.writeShort(0); // L: 3619
							int var10 = var12.packetBuffer.offset; // L: 3620
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3621
							User.method6525(var12.packetBuffer, var11); // L: 3622
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3623
							Client.packetWriter.addNode(var12); // L: 3624
							return 1; // L: 3625
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3627
							var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3628
							class12.Interpreter_intStackSize -= 2; // L: 3629
							var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3630
							var9 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3631
							var6 = GrandExchangeOfferNameComparator.method5784(var7, var8, class263.clientLanguage, var9); // L: 3632
							Client.packetWriter.addNode(var6); // L: 3633
							return 1; // L: 3634
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3636
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3643
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3644
								return 1; // L: 3645
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3647
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3648
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class92.Messages_getHistorySize(var3); // L: 3649
								return 1; // L: 3650
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3652
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3653
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = class4.Messages_getLastChatID(var3); // L: 3654
								return 1; // L: 3655
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3657
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3658
								Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = PendingSpawn.method2163(var3); // L: 3659
								return 1; // L: 3660
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3662
								var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3663
								UrlRequester.doCheat(var8); // L: 3664
								return 1; // L: 3665
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3667
								Client.field549 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3668
								return 1; // L: 3669
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3671
								Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = Client.field549; // L: 3672
								return 1; // L: 3673
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3675
								var8 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 3676
								System.out.println(var8); // L: 3677
								return 1; // L: 3678
							} else if (var0 == 5024) { // L: 3680
								--class12.Interpreter_intStackSize; // L: 3681
								return 1; // L: 3682
							} else if (var0 == 5025) { // L: 3684
								++class12.Interpreter_intStackSize; // L: 3685
								return 1; // L: 3686
							} else if (var0 == 5030) { // L: 3688
								class12.Interpreter_intStackSize -= 2; // L: 3689
								var3 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize]; // L: 3690
								var7 = Interpreter.Interpreter_intStack[class12.Interpreter_intStackSize + 1]; // L: 3691
								var5 = class175.Messages_getByChannelAndID(var3, var7); // L: 3692
								if (var5 != null) { // L: 3693
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.count; // L: 3694
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.cycle; // L: 3695
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3696
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3697
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3698
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3699
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3700
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3701
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3704
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3705
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3706
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3707
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3708
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3709
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3710
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3711
								}

								return 1; // L: 3713
							} else if (var0 == 5031) { // L: 3715
								var3 = Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]; // L: 3716
								var4 = class12.Messages_getMessage(var3); // L: 3717
								if (var4 != null) { // L: 3718
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.type; // L: 3719
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.cycle; // L: 3720
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3721
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3722
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3723
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3724
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3725
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3726
								} else {
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 3729
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3730
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3731
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3732
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3733
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3734
									Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 3735
									Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 3736
								}

								return 1; // L: 3738
							} else {
								return 2; // L: 3740
							}
						} else {
							if (ModelData0.localPlayer != null && ModelData0.localPlayer.username != null) { // L: 3638
								var8 = ModelData0.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3639
							}

							Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var8; // L: 3640
							return 1; // L: 3641
						}
					}
				}
			}
		}
	}
}
