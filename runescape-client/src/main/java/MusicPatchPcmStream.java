import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lid;[IIIIB)V",
		garbageValue = "0"
	)
	void method4816(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2929[var1.field2970] & 4) != 0 && var1.field2985 < 0) {
			int var6 = this.superStream.field2924[var1.field2970] / class276.field3287;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2988) / var6;
				if (var7 > var4) {
					var1.field2988 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2988 += var7 * var6 - 1048576;
				int var8 = class276.field3287 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2925[var1.field2970] == 0) {
					var1.stream = RawPcmStream.method798(var1.rawSound, var10.method859(), var10.method804(), var10.method805());
				} else {
					var1.stream = RawPcmStream.method798(var1.rawSound, var10.method859(), 0, var10.method805());
					this.superStream.method4632(var1, var1.patch.field2949[var1.field2986] < 0);
					var1.stream.method799(var8, var10.method804());
				}

				if (var1.patch.field2949[var1.field2986] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method811(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method815()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lid;II)V",
		garbageValue = "630367829"
	)
	void method4817(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2929[var1.field2970] & 4) != 0 && var1.field2985 < 0) {
			int var3 = this.superStream.field2924[var1.field2970] / class276.field3287;
			int var4 = (var3 + 1048575 - var1.field2988) / var3;
			var1.field2988 = var3 * var2 + var1.field2988 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2925[var1.field2970] == 0) {
					var1.stream = RawPcmStream.method798(var1.rawSound, var1.stream.method859(), var1.stream.method804(), var1.stream.method805());
				} else {
					var1.stream = RawPcmStream.method798(var1.rawSound, var1.stream.method859(), 0, var1.stream.method805());
					this.superStream.method4632(var1, var1.patch.field2949[var1.field2986] < 0);
				}

				if (var1.patch.field2949[var1.field2986] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2988 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lap;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("a")
	protected int vmethod4836() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4651(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2982) {
						this.method4816(var6, var1, var4, var5, var4 + var5);
						var6.field2982 -= var5;
						break;
					}

					this.method4816(var6, var1, var4, var6.field2982, var5 + var4);
					var4 += var6.field2982;
					var5 -= var6.field2982;
				} while(!this.superStream.method4668(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("l")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4651(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2982) {
						this.method4817(var3, var2);
						var3.field2982 -= var2;
						break;
					}

					this.method4817(var3, var3.field2982);
					var2 -= var3.field2982;
				} while(!this.superStream.method4668(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "1"
	)
	static int method4837(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (AttackOption.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
				class317.field3858 = AttackOption.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					class317.field3858 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class317.field3858.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1448;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1456;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1457;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1458;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class317.field3858.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class317.field3858.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class240.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.method2556(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1467;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.method2555(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = class317.field3858.getSortedMembers()[Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class240.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					SoundSystem.method778(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1464[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class240.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
						AttackOption.method2253(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class317.field3858.field1465[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (WorldMapSectionType.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
							KeyHandler.field146 = WorldMapSectionType.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
							KeyHandler.field146 = Client.currentClanChannels[var3];
							ApproximateRouteStrategy.field466 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = KeyHandler.field146.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = KeyHandler.field146.field1513;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = KeyHandler.field146.field1518;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = KeyHandler.field146.method2677();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)KeyHandler.field146.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((ClanChannelMember)KeyHandler.field146.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((ClanChannelMember)KeyHandler.field146.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						class361.method6282(ApproximateRouteStrategy.field466, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = KeyHandler.field146.method2674(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = KeyHandler.field146.getSortedMembers()[Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class117.field1388 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
