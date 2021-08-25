import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
public enum class112 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1355(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1356(3, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1357(0, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1359(1, 3);

	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = 572418005
	)
	static int field1361;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2108357605
	)
	public final int field1360;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 221932759
	)
	@Export("id")
	final int id;

	class112(int var3, int var4) {
		this.field1360 = var3;
		this.id = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "347780124"
	)
	static int method2468(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class240.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
			class18.privateChatMode = FloorUnderlayDefinition.method3025(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
			if (class18.privateChatMode == null) {
				class18.privateChatMode = PrivateChatMode.field4395;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = FriendSystem.getPacketBufferNode(ClientPacket.field2686, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class18.privateChatMode.field4393);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				class240.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				var6 = FriendSystem.getPacketBufferNode(ClientPacket.field2744, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class240.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					var5 = DevicePcmPlayerProvider.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var4 = class9.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class18.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class18.privateChatMode.field4393;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
							var12 = class395.method6747(var7, var8, class323.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var12 = FriendSystem.getPacketBufferNode(ClientPacket.field2731, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							ByteArrayPool.method5814(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class240.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
							var6 = class395.method6747(var7, var8, class323.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = SoundSystem.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ParamComposition.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = VarbitComposition.method3027(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								WorldMapID.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field647 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field647;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--class240.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class240.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								class240.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
								var5 = DevicePcmPlayerProvider.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
								var4 = class9.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class129.localPlayer != null && class129.localPlayer.username != null) {
								var8 = class129.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
