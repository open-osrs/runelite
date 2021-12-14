import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fq")
public class class167 {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = 2133081727
	)
	static int field1811;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1655093891
	)
	static int field1813;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "1"
	)
	static int method3269(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++IsaacCipher.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--IsaacCipher.Interpreter_intStackSize;
			--class13.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "553813410"
	)
	static int method3270(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			IsaacCipher.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
			Projectile.privateChatMode = WorldMapData_0.method4353(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
			if (Projectile.privateChatMode == null) {
				Projectile.privateChatMode = PrivateChatMode.field4596;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2855, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(Projectile.privateChatMode.field4597);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				IsaacCipher.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var6 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2851, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					var5 = ItemComposition.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var4 = class139.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (Projectile.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Projectile.privateChatMode.field4597;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
							var12 = BufferedSource.method6527(var7, var8, ScriptFrame.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class13.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
							var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2849, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class370.method6755(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							IsaacCipher.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
							var6 = BufferedSource.method6527(var7, var8, ScriptFrame.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = PlayerComposition.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = VertexNormal.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Actor.method2233(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
								RouteStrategy.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field645 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Client.field645;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--IsaacCipher.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++IsaacCipher.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								IsaacCipher.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
								var5 = ItemComposition.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
								var4 = class139.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class340.localPlayer != null && class340.localPlayer.username != null) {
								var8 = class340.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
