import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iu")
public class class258 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-756933524"
	)
	static int method4516(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			VarcInt.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			Client.privateChatMode = class52.method840(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
			if (Client.privateChatMode == null) {
				Client.privateChatMode = PrivateChatMode.field3832;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			PacketBufferNode var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
			var18.packetBuffer.writeByte(Client.publicChatMode);
			var18.packetBuffer.writeByte(Client.privateChatMode.field3835);
			var18.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var18);
			return 1;
		} else {
			String var3;
			int var11;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				VarcInt.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
				int var12 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
				PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var3) + 2);
				var13.packetBuffer.writeStringCp1252NullTerminated(var3);
				var13.packetBuffer.writeByte(var11 - 1);
				var13.packetBuffer.writeByte(var12);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				int var10;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					VarcInt.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
					var11 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
					Message var16 = WallDecoration.Messages_getByChannelAndID(var10, var11);
					if (var16 != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.count;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.sender != null ? var16.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.prefix != null ? var16.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.text != null ? var16.text : "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var16.isFromFriend() ? 1 : (var16.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
					var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					Message var14 = class195.Messages_getMessage(var10);
					if (var14 != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.type;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.sender != null ? var14.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.prefix != null ? var14.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var14.text != null ? var14.text : "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.isFromFriend() ? 1 : (var14.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
					if (Client.privateChatMode == null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.privateChatMode.field3835;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
					var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					String var15 = var3.toLowerCase();
					byte var17 = 0;
					if (var15.startsWith("yellow:")) {
						var17 = 0;
						var3 = var3.substring("yellow:".length());
					} else if (var15.startsWith("red:")) {
						var17 = 1;
						var3 = var3.substring("red:".length());
					} else if (var15.startsWith("green:")) {
						var17 = 2;
						var3 = var3.substring("green:".length());
					} else if (var15.startsWith("cyan:")) {
						var17 = 3;
						var3 = var3.substring("cyan:".length());
					} else if (var15.startsWith("purple:")) {
						var17 = 4;
						var3 = var3.substring("purple:".length());
					} else if (var15.startsWith("white:")) {
						var17 = 5;
						var3 = var3.substring("white:".length());
					} else if (var15.startsWith("flash1:")) {
						var17 = 6;
						var3 = var3.substring("flash1:".length());
					} else if (var15.startsWith("flash2:")) {
						var17 = 7;
						var3 = var3.substring("flash2:".length());
					} else if (var15.startsWith("flash3:")) {
						var17 = 8;
						var3 = var3.substring("flash3:".length());
					} else if (var15.startsWith("glow1:")) {
						var17 = 9;
						var3 = var3.substring("glow1:".length());
					} else if (var15.startsWith("glow2:")) {
						var17 = 10;
						var3 = var3.substring("glow2:".length());
					} else if (var15.startsWith("glow3:")) {
						var17 = 11;
						var3 = var3.substring("glow3:".length());
					} else if (WorldMapScaleHandler.clientLanguage != Language.Language_EN) {
						if (var15.startsWith("yellow:")) {
							var17 = 0;
							var3 = var3.substring("yellow:".length());
						} else if (var15.startsWith("red:")) {
							var17 = 1;
							var3 = var3.substring("red:".length());
						} else if (var15.startsWith("green:")) {
							var17 = 2;
							var3 = var3.substring("green:".length());
						} else if (var15.startsWith("cyan:")) {
							var17 = 3;
							var3 = var3.substring("cyan:".length());
						} else if (var15.startsWith("purple:")) {
							var17 = 4;
							var3 = var3.substring("purple:".length());
						} else if (var15.startsWith("white:")) {
							var17 = 5;
							var3 = var3.substring("white:".length());
						} else if (var15.startsWith("flash1:")) {
							var17 = 6;
							var3 = var3.substring("flash1:".length());
						} else if (var15.startsWith("flash2:")) {
							var17 = 7;
							var3 = var3.substring("flash2:".length());
						} else if (var15.startsWith("flash3:")) {
							var17 = 8;
							var3 = var3.substring("flash3:".length());
						} else if (var15.startsWith("glow1:")) {
							var17 = 9;
							var3 = var3.substring("glow1:".length());
						} else if (var15.startsWith("glow2:")) {
							var17 = 10;
							var3 = var3.substring("glow2:".length());
						} else if (var15.startsWith("glow3:")) {
							var17 = 11;
							var3 = var3.substring("glow3:".length());
						}
					}

					var15 = var3.toLowerCase();
					byte var7 = 0;
					if (var15.startsWith("wave:")) {
						var7 = 1;
						var3 = var3.substring("wave:".length());
					} else if (var15.startsWith("wave2:")) {
						var7 = 2;
						var3 = var3.substring("wave2:".length());
					} else if (var15.startsWith("shake:")) {
						var7 = 3;
						var3 = var3.substring("shake:".length());
					} else if (var15.startsWith("scroll:")) {
						var7 = 4;
						var3 = var3.substring("scroll:".length());
					} else if (var15.startsWith("slide:")) {
						var7 = 5;
						var3 = var3.substring("slide:".length());
					} else if (Language.Language_EN != WorldMapScaleHandler.clientLanguage) {
						if (var15.startsWith("wave:")) {
							var7 = 1;
							var3 = var3.substring("wave:".length());
						} else if (var15.startsWith("wave2:")) {
							var7 = 2;
							var3 = var3.substring("wave2:".length());
						} else if (var15.startsWith("shake:")) {
							var7 = 3;
							var3 = var3.substring("shake:".length());
						} else if (var15.startsWith("scroll:")) {
							var7 = 4;
							var3 = var3.substring("scroll:".length());
						} else if (var15.startsWith("slide:")) {
							var7 = 5;
							var3 = var3.substring("slide:".length());
						}
					}

					PacketBufferNode var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					int var9 = var8.packetBuffer.offset;
					var8.packetBuffer.writeByte(var11);
					var8.packetBuffer.writeByte(var17);
					var8.packetBuffer.writeByte(var7);
					UrlRequester.method3383(var8.packetBuffer, var3);
					var8.packetBuffer.writeLengthByte(var8.packetBuffer.offset - var9);
					Client.packetWriter.addNode(var8);
					return 1;
				} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
					Interpreter.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
					String var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
					PacketBufferNode var5 = ItemContainer.getPacketBufferNode(ClientPacket.field2230, Client.packetWriter.isaacCipher);
					var5.packetBuffer.writeShort(0);
					int var6 = var5.packetBuffer.offset;
					var5.packetBuffer.writeStringCp1252NullTerminated(var3);
					UrlRequester.method3383(var5.packetBuffer, var4);
					var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var6);
					Client.packetWriter.addNode(var5);
					return 1;
				} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
					if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.tradeChatMode;
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Canvas.Messages_getHistorySize(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Calendar.Messages_getNextChatID(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class39.Messages_getLastChatID(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.DOCHEAT) {
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						SecureRandomCallable.doCheat(var3);
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
						Client.field871 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field871;
						return 1;
					} else if (var0 == ScriptOpcodes.DEBUGMES) {
						var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						System.out.println(var3);
						return 1;
					} else {
						return 2;
					}
				} else {
					if (PlayerAppearance.localPlayer != null && PlayerAppearance.localPlayer.username != null) {
						var3 = PlayerAppearance.localPlayer.username.getName();
					} else {
						var3 = "";
					}

					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
					return 1;
				}
			}
		}
	}
}
