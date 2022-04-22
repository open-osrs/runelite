import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
public class class151 extends class144 {
	@ObfuscatedName("v")
	String field1678;
	@ObfuscatedName("c")
	byte field1677;
	@ObfuscatedName("i")
	byte field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class151(class145 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "23"
	)
	void vmethod3152(Buffer var1) {
		this.field1678 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1678 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1677 = var1.readByte(); // L: 161
			this.field1676 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1764669808"
	)
	void vmethod3153(ClanChannel var1) {
		var1.name = this.field1678; // L: 167
		if (this.field1678 != null) { // L: 168
			var1.field1654 = this.field1677; // L: 169
			var1.field1659 = this.field1676; // L: 170
		}

	} // L: 172

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "-462688597"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpz;I)V",
		garbageValue = "960704527"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class54.reflectionChecks.last(); // L: 35
		if (var1 != null) { // L: 36
			int var2 = var0.offset; // L: 37
			var0.writeInt(var1.id); // L: 38

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 39
				if (var1.creationErrors[var3] != 0) { // L: 40
					var0.writeByte(var1.creationErrors[var3]); // L: 41
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 45
						Field var5;
						int var6;
						if (var4 == 0) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							var6 = Reflection.getInt(var5, (Object)null); // L: 48
							var0.writeByte(0); // L: 49
							var0.writeInt(var6); // L: 50
						} else if (var4 == 1) { // L: 52
							var5 = var1.fields[var3]; // L: 53
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 54
							var0.writeByte(0); // L: 55
						} else if (var4 == 2) { // L: 57
							var5 = var1.fields[var3]; // L: 58
							var6 = var5.getModifiers(); // L: 59
							var0.writeByte(0); // L: 60
							var0.writeInt(var6); // L: 61
						}

						Method var25;
						if (var4 != 3) { // L: 63
							if (var4 == 4) { // L: 83
								var25 = var1.methods[var3]; // L: 84
								var6 = var25.getModifiers(); // L: 85
								var0.writeByte(0); // L: 86
								var0.writeInt(var6); // L: 87
							}
						} else {
							var25 = var1.methods[var3]; // L: 64
							byte[][] var10 = var1.arguments[var3]; // L: 65
							Object[] var7 = new Object[var10.length]; // L: 66

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 67
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 68
								var7[var8] = var9.readObject(); // L: 69
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 71
							if (var11 == null) { // L: 72
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 73
								var0.writeByte(1); // L: 74
								var0.writeLong(((Number)var11).longValue()); // L: 75
							} else if (var11 instanceof String) { // L: 77
								var0.writeByte(2); // L: 78
								var0.writeStringCp1252NullTerminated((String)var11); // L: 79
							} else {
								var0.writeByte(4); // L: 81
							}
						}
					} catch (ClassNotFoundException var13) { // L: 90
						var0.writeByte(-10); // L: 91
					} catch (InvalidClassException var14) { // L: 93
						var0.writeByte(-11); // L: 94
					} catch (StreamCorruptedException var15) { // L: 96
						var0.writeByte(-12); // L: 97
					} catch (OptionalDataException var16) { // L: 99
						var0.writeByte(-13); // L: 100
					} catch (IllegalAccessException var17) { // L: 102
						var0.writeByte(-14); // L: 103
					} catch (IllegalArgumentException var18) { // L: 105
						var0.writeByte(-15); // L: 106
					} catch (InvocationTargetException var19) { // L: 108
						var0.writeByte(-16); // L: 109
					} catch (SecurityException var20) { // L: 111
						var0.writeByte(-17); // L: 112
					} catch (IOException var21) { // L: 114
						var0.writeByte(-18); // L: 115
					} catch (NullPointerException var22) { // L: 117
						var0.writeByte(-19); // L: 118
					} catch (Exception var23) { // L: 120
						var0.writeByte(-20); // L: 121
					} catch (Throwable var24) { // L: 123
						var0.writeByte(-21); // L: 124
					}
				}
			}

			var0.writeCrc(var2); // L: 127
			var1.remove(); // L: 128
		}
	} // L: 129

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1004666991"
	)
	static int method3159(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3525
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3526
			return 1; // L: 3527
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3529
			Interpreter.Interpreter_intStackSize -= 3; // L: 3530
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3531
			GameEngine.privateChatMode = class166.method3343(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3532
			if (GameEngine.privateChatMode == null) { // L: 3533
				GameEngine.privateChatMode = PrivateChatMode.field4739;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3534
			PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher); // L: 3536
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3537
			var13.packetBuffer.writeByte(GameEngine.privateChatMode.field4740); // L: 3538
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3539
			Client.packetWriter.addNode(var13); // L: 3540
			return 1; // L: 3541
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3543
				var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3544
				Interpreter.Interpreter_intStackSize -= 2; // L: 3545
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3546
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3547
				var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher); // L: 3549
				var6.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3550
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3551
				var6.packetBuffer.writeByte(var7 - 1); // L: 3552
				var6.packetBuffer.writeByte(var9); // L: 3553
				Client.packetWriter.addNode(var6); // L: 3554
				return 1; // L: 3555
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3557
					Interpreter.Interpreter_intStackSize -= 2; // L: 3558
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3559
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3560
					var5 = class291.Messages_getByChannelAndID(var3, var7); // L: 3561
					if (var5 != null) { // L: 3562
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3563
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3564
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3565
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3566
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3567
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3568
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3571
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3572
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3573
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3574
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3575
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3576
					}

					return 1; // L: 3578
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3580
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3581
						var4 = TileItem.Messages_getMessage(var3); // L: 3582
						if (var4 != null) { // L: 3583
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3584
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3585
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3586
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3587
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3588
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3589
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3592
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3593
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3594
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3595
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3596
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3597
						}

						return 1; // L: 3599
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3601
						if (GameEngine.privateChatMode == null) { // L: 3602
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.privateChatMode.field4740; // L: 3603
						}

						return 1; // L: 3604
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3606
							var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3607
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3608
							var12 = BufferedSource.method6908(var7, var8, Skills.clientLanguage, -1); // L: 3609
							Client.packetWriter.addNode(var12); // L: 3610
							return 1; // L: 3611
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3613
							class122.Interpreter_stringStackSize -= 2; // L: 3614
							var8 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize]; // L: 3615
							String var11 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1]; // L: 3616
							var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher); // L: 3618
							var12.packetBuffer.writeShort(0); // L: 3619
							int var10 = var12.packetBuffer.offset; // L: 3620
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3621
							class282.method5489(var12.packetBuffer, var11); // L: 3622
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3623
							Client.packetWriter.addNode(var12); // L: 3624
							return 1; // L: 3625
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3627
							var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3628
							Interpreter.Interpreter_intStackSize -= 2; // L: 3629
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3630
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3631
							var6 = BufferedSource.method6908(var7, var8, Skills.clientLanguage, var9); // L: 3632
							Client.packetWriter.addNode(var6); // L: 3633
							return 1; // L: 3634
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3636
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3643
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3644
								return 1; // L: 3645
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3647
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3648
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HitSplatDefinition.Messages_getHistorySize(var3); // L: 3649
								return 1; // L: 3650
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3652
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3653
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.Messages_getLastChatID(var3); // L: 3654
								return 1; // L: 3655
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3657
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3658
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundCache.method779(var3); // L: 3659
								return 1; // L: 3660
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3662
								var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3663
								class420.doCheat(var8); // L: 3664
								return 1; // L: 3665
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3667
								Client.field728 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3668
								return 1; // L: 3669
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3671
								Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Client.field728; // L: 3672
								return 1; // L: 3673
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3675
								var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3676
								System.out.println(var8); // L: 3677
								return 1; // L: 3678
							} else if (var0 == 5024) { // L: 3680
								--Interpreter.Interpreter_intStackSize; // L: 3681
								return 1; // L: 3682
							} else if (var0 == 5025) { // L: 3684
								++Interpreter.Interpreter_intStackSize; // L: 3685
								return 1; // L: 3686
							} else if (var0 == 5030) { // L: 3688
								Interpreter.Interpreter_intStackSize -= 2; // L: 3689
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3690
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3691
								var5 = class291.Messages_getByChannelAndID(var3, var7); // L: 3692
								if (var5 != null) { // L: 3693
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 3694
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 3695
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3696
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3697
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3698
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3699
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3700
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3701
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3704
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3705
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3706
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3707
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3708
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3709
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3710
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3711
								}

								return 1; // L: 3713
							} else if (var0 == 5031) { // L: 3715
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3716
								var4 = TileItem.Messages_getMessage(var3); // L: 3717
								if (var4 != null) { // L: 3718
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 3719
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 3720
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3721
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3722
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3723
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3724
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3725
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3726
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3729
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3730
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3731
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3732
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3733
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3734
									Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3735
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3736
								}

								return 1; // L: 3738
							} else {
								return 2; // L: 3740
							}
						} else {
							if (GrandExchangeEvents.localPlayer != null && GrandExchangeEvents.localPlayer.username != null) { // L: 3638
								var8 = GrandExchangeEvents.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3639
							}

							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var8; // L: 3640
							return 1; // L: 3641
						}
					}
				}
			}
		}
	}
}
