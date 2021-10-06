import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gs")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 26129547
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -867337437
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 847593195
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -308984415
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 276591907
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1307815303
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1009384651
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1044972979
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1528547923
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 493876669
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1984300227
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1261005687
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 998230359
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1441950703
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I)V",
		garbageValue = "2018229058"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-964071790"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "381612084"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "88"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Lic;",
		garbageValue = "2033247854"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "4"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1980100595"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "582127125"
	)
	static final void method3824(String var0) {
		PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class113.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "-1293981201"
	)
	static int method3826(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class114.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
				ModeWhere.field3804 = class114.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
					ModeWhere.field3804 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = ModeWhere.field3804.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1450;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1452;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1459;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1466;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = ModeWhere.field3804.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = ModeWhere.field3804.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.method2585(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1451;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.method2584(Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					PacketWriter.method2375(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1460[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
						class111.method2467(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ModeWhere.field3804.field1461[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (GrandExchangeOfferNameComparator.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							BuddyRankComparator.field1347 = GrandExchangeOfferNameComparator.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							BuddyRankComparator.field1347 = Client.currentClanChannels[var3];
							PacketWriter.field1285 = var3;
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = BuddyRankComparator.field1347.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = BuddyRankComparator.field1347.field1512;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = BuddyRankComparator.field1347.field1517;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = BuddyRankComparator.field1347.method2729();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = ((ClanChannelMember)BuddyRankComparator.field1347.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ((ClanChannelMember)BuddyRankComparator.field1347.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ((ClanChannelMember)BuddyRankComparator.field1347.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						class275.method5121(PacketWriter.field1285, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = BuddyRankComparator.field1347.method2739(Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = BuddyRankComparator.field1347.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Coord.field3013 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "84538647"
	)
	static int method3827(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class54.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3 + class14.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					long var13 = ((long)var10 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class54.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = MidiPcmStream.method4815(MusicPatchPcmStream.compareStrings(Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1], ReflectionCheck.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							var11 = class54.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							var11 = class54.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class54.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3 + (char)var9;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = KeyHandler.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class133.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class65.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class54.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class54.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class54.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class54.Interpreter_stringStackSize + 1];
					if (class67.localPlayer.appearance != null && class67.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "33887552"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
