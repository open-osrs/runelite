import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jr")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lju;[IIIII)V",
		garbageValue = "710104322"
	)
	void method5470(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3200[var1.field3240] & 4) != 0 && var1.field3253 < 0) { // L: 73
			int var6 = this.superStream.field3202[var1.field3240] / SecureRandomFuture.field949; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3239) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3239 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3239 += var7 * var6 - 1048576; // L: 81
				int var8 = SecureRandomFuture.field949 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3190[var1.field3240] == 0) { // L: 86
					var1.stream = RawPcmStream.method924(var1.rawSound, var10.method838(), var10.method865(), var10.method822()); // L: 87
				} else {
					var1.stream = RawPcmStream.method924(var1.rawSound, var10.method838(), 0, var10.method822()); // L: 90
					this.superStream.method5285(var1, var1.patch.field3228[var1.field3244] < 0); // L: 91
					var1.stream.method826(var8, var10.method865()); // L: 92
				}

				if (var1.patch.field3228[var1.field3244] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method828(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method832()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lju;IB)V",
		garbageValue = "0"
	)
	void method5471(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3200[var1.field3240] & 4) != 0 && var1.field3253 < 0) { // L: 105
			int var3 = this.superStream.field3202[var1.field3240] / SecureRandomFuture.field949; // L: 106
			int var4 = (var3 + 1048575 - var1.field3239) / var3; // L: 107
			var1.field3239 = var3 * var2 + var1.field3239 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3190[var1.field3240] == 0) { // L: 110
					var1.stream = RawPcmStream.method924(var1.rawSound, var1.stream.method838(), var1.stream.method865(), var1.stream.method822()); // L: 111
				} else {
					var1.stream = RawPcmStream.method924(var1.rawSound, var1.stream.method838(), 0, var1.stream.method822()); // L: 114
					this.superStream.method5285(var1, var1.patch.field3228[var1.field3244] < 0); // L: 115
				}

				if (var1.patch.field3228[var1.field3244] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3239 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("f")
	protected int vmethod5476() {
		return 0; // L: 34
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5307(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3256) { // L: 45
						this.method5470(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3256 -= var5; // L: 52
						break;
					}

					this.method5470(var6, var1, var4, var6.field3256, var5 + var4); // L: 46
					var4 += var6.field3256; // L: 47
					var5 -= var6.field3256; // L: 48
				} while(!this.superStream.method5396(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("k")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5307(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3256) { // L: 62
						this.method5471(var3, var2); // L: 67
						var3.field3256 -= var2; // L: 68
						break;
					}

					this.method5471(var3, var3.field3256); // L: 63
					var2 -= var3.field3256; // L: 64
				} while(!this.superStream.method5396(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "96"
	)
	static int method5485(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2710
			if (class134.guestClanSettings != null) { // L: 2711
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 2712
				class129.field1535 = class134.guestClanSettings; // L: 2713
			} else {
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2715
			}

			return 1; // L: 2716
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2718
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2719
				if (Client.currentClanSettings[var3] != null) { // L: 2720
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 2721
					class129.field1535 = Client.currentClanSettings[var3]; // L: 2722
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2724
				}

				return 1; // L: 2725
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2727
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class129.field1535.name; // L: 2728
				return 1; // L: 2729
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2731
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.allowGuests ? 1 : 0; // L: 2732
				return 1; // L: 2733
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2735
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1602; // L: 2736
				return 1; // L: 2737
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2739
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1603; // L: 2740
				return 1; // L: 2741
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2743
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1604; // L: 2744
				return 1; // L: 2745
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2747
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1613; // L: 2748
				return 1; // L: 2749
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2751
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.memberCount; // L: 2752
				return 1; // L: 2753
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2755
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2756
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class129.field1535.memberNames[var3]; // L: 2757
				return 1; // L: 2758
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2760
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2761
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.memberRanks[var3]; // L: 2762
				return 1; // L: 2763
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2765
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.bannedMemberCount; // L: 2766
				return 1; // L: 2767
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2769
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2770
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class129.field1535.bannedMemberNames[var3]; // L: 2771
				return 1; // L: 2772
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2774
					class295.Interpreter_intStackSize -= 3; // L: 2775
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2776
					var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2777
					var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 2778
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.method2915(var3, var6, var5); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2782
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.currentOwner; // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2786
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1614; // L: 2787
					return 1; // L: 2788
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2790
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.method2979(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]); // L: 2791
					return 1; // L: 2792
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2794
					Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = class129.field1535.getSortedMembers()[Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]]; // L: 2795
					return 1; // L: 2796
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2798
					class295.Interpreter_intStackSize -= 2; // L: 2799
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2800
					var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 2801
					UrlRequest.method2555(var6, var3); // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2805
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2806
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1611[var3]; // L: 2807
					return 1; // L: 2808
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2810
						class295.Interpreter_intStackSize -= 3; // L: 2811
						var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 2812
						boolean var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1; // L: 2813
						var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 2814
						class147.method3051(var5, var3, var4); // L: 2815
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2817
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2818
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class129.field1535.field1600[var3] ? 1 : 0; // L: 2819
						return 1; // L: 2820
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2822
						if (class83.guestClanChannel != null) { // L: 2823
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 2824
							UrlRequest.field1344 = class83.guestClanChannel; // L: 2825
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2827
						}

						return 1; // L: 2828
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2830
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2831
						if (Client.currentClanChannels[var3] != null) { // L: 2832
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 2833
							UrlRequest.field1344 = Client.currentClanChannels[var3]; // L: 2834
							class307.field3588 = var3; // L: 2835
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 2837
						}

						return 1; // L: 2838
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2840
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = UrlRequest.field1344.name; // L: 2841
						return 1; // L: 2842
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2844
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.field1669; // L: 2845
						return 1; // L: 2846
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2848
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.field1666; // L: 2849
						return 1; // L: 2850
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2852
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.method3056(); // L: 2853
						return 1; // L: 2854
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2856
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2857
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ((ClanChannelMember)UrlRequest.field1344.members.get(var3)).username.getName(); // L: 2858
						return 1; // L: 2859
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2861
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2862
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = ((ClanChannelMember)UrlRequest.field1344.members.get(var3)).rank; // L: 2863
						return 1; // L: 2864
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2866
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2867
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = ((ClanChannelMember)UrlRequest.field1344.members.get(var3)).world; // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2871
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 2872
						class19.method307(class307.field3588, var3); // L: 2873
						return 1; // L: 2874
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2876
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.method3057(Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]); // L: 2877
						return 1; // L: 2878
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2880
						Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1] = UrlRequest.field1344.getSortedMembers()[Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize - 1]]; // L: 2881
						return 1; // L: 2882
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2884
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = GameEngine.field205 != null ? 1 : 0; // L: 2885
						return 1; // L: 2886
					} else {
						return 2; // L: 2888
					}
				}
			}
		}
	}
}
