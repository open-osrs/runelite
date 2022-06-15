import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@Deprecated
@ObfuscatedName("ck")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("t")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("q")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("f")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("j")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("e")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -7650990867349600243L
	)
	long field1321;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class140.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3400(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class140.archive2.method5806(15)) { // L: 50
			var2 = class140.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-480825511"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) { // L: 59
			this.unwrittenChanges = true;
		}

	} // L: 60

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-27"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1848287137"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1873976363"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1935222332"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "29"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "654985106"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZS)Lpn;",
		garbageValue = "-4151"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class67.getPreferencesFile("2", class285.field3313.name, var1); // L: 104
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += ScriptEvent.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var24 = new Buffer(var2); // L: 125
			var24.writeByte(2); // L: 126
			var24.writeShort(var3); // L: 127
			Iterator var25 = this.map.entrySet().iterator(); // L: 128

			while (var25.hasNext()) {
				Entry var13 = (Entry)var25.next(); // L: 129
				int var14 = (Integer)var13.getKey(); // L: 131
				if (this.intsPersistence[var14]) { // L: 132
					var24.writeShort(var14); // L: 133
					Object var8 = var13.getValue(); // L: 134
					class432 var9 = class432.method7561(var8.getClass()); // L: 135
					var24.writeByte(var9.field4655); // L: 136
					class428 var10 = class432.method7577(var8.getClass()); // L: 138
					var10.vmethod7583(var8, var24); // L: 139
				}
			}

			var1.write(var24.array, 0, var24.offset); // L: 144
		} catch (Exception var22) { // L: 146
		} finally {
			try {
				var1.close(); // L: 149
			} catch (Exception var21) { // L: 151
			}

		}

		this.unwrittenChanges = false; // L: 153
		this.field1321 = class115.method2692(); // L: 154
	} // L: 155

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32768"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 158

		label212: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 160

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 161 162 165
					var4 = var1.read(var2, var3, var2.length - var3); // L: 163
					if (var4 == -1) { // L: 164
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 167
				if (var14.array.length - var14.offset < 1) {
					return; // L: 168
				}

				int var15 = var14.readUnsignedByte(); // L: 169
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 171
						var16 = var14.readUnsignedShort(); // L: 172
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label212;
							}

							var8 = var14.readUnsignedShort(); // L: 174
							var9 = var14.readUnsignedByte(); // L: 175
							class432 var10 = (class432)Actor.findEnumerated(class432.method7566(), var9); // L: 176
							Object var11 = var10.method7565(var14); // L: 177
							if (this.intsPersistence[var8]) { // L: 178
								this.map.put(var8, var11); // L: 179
							}

							++var7; // L: 173
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 184

						for (var7 = 0; var7 < var16; ++var7) { // L: 185
							var8 = var14.readUnsignedShort(); // L: 186
							var9 = var14.readInt(); // L: 187
							if (this.intsPersistence[var8]) { // L: 188
								this.map.put(var8, var9); // L: 189
							}
						}

						var7 = var14.readUnsignedShort(); // L: 192
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label212;
							}

							var14.readUnsignedShort(); // L: 194
							var14.readStringCp1252NullTerminated(); // L: 195
							++var8; // L: 193
						}
					}
				}
			} catch (Exception var25) { // L: 199
				break label212;
			} finally {
				try {
					var1.close(); // L: 202
				} catch (Exception var24) { // L: 204
				}

			}

			return; // L: 170
		}

		this.unwrittenChanges = false; // L: 206
	} // L: 207

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1207260156"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1321 < class115.method2692() - 60000L) { // L: 210
			this.write(); // L: 211
		}

	} // L: 213

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1353615463"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 216
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "1566405601"
	)
	static boolean method2474(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 234
			int var3 = var2.read(); // L: 235
			var2.seek(0L); // L: 236
			var2.write(var3); // L: 237
			var2.seek(0L); // L: 238
			var2.close(); // L: 239
			if (var1) { // L: 240
				var0.delete();
			}

			return true; // L: 241
		} catch (Exception var4) { // L: 243
			return false; // L: 244
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-27"
	)
	static int method2475(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 622
		Widget var3;
		if (var0 >= 2000) { // L: 623
			var0 -= 1000; // L: 624
			var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 625
			var3 = class140.getWidget(var4); // L: 626
		} else {
			var3 = var2 ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget; // L: 628
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 629
			class446.Interpreter_intStackSize -= 2; // L: 630
			var3.scrollX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 631
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 632
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 633
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 634
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 635
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 636
				var3.scrollY = 0;
			}

			ChatChannel.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 640
			var3.color = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 641
			ChatChannel.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 645
			var3.fill = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 646
			ChatChannel.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 650
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 651
			ChatChannel.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 655
			var3.lineWid = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 656
			ChatChannel.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 660
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 661
			ChatChannel.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 665
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 666
			ChatChannel.invalidateWidget(var3); // L: 667
			return 1; // L: 668
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 670
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 671
			ChatChannel.invalidateWidget(var3); // L: 672
			return 1; // L: 673
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 675
			var3.modelType = 1; // L: 676
			var3.modelId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 677
			ChatChannel.invalidateWidget(var3); // L: 678
			return 1; // L: 679
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 681
			class446.Interpreter_intStackSize -= 6; // L: 682
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 683
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 684
			var3.modelAngleX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 685
			var3.modelAngleY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 686
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 4]; // L: 687
			var3.modelZoom = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 5]; // L: 688
			ChatChannel.invalidateWidget(var3); // L: 689
			return 1; // L: 690
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 692
				var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 693
				if (var8 != var3.sequenceId) { // L: 694
					var3.sequenceId = var8; // L: 695
					var3.modelFrame = 0; // L: 696
					var3.modelFrameCycle = 0; // L: 697
					ChatChannel.invalidateWidget(var3); // L: 698
				}

				return 1; // L: 700
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 702
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 703
				ChatChannel.invalidateWidget(var3); // L: 704
				return 1; // L: 705
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 707
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 708
				if (!var7.equals(var3.text)) { // L: 709
					var3.text = var7; // L: 710
					ChatChannel.invalidateWidget(var3); // L: 711
				}

				return 1; // L: 713
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 715
				var3.fontId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 716
				ChatChannel.invalidateWidget(var3); // L: 717
				return 1; // L: 718
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 720
				class446.Interpreter_intStackSize -= 3; // L: 721
				var3.textXAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 722
				var3.textYAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 723
				var3.textLineHeight = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 724
				ChatChannel.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 728
				var3.textShadowed = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 729
				ChatChannel.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 733
				var3.outline = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 734
				ChatChannel.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 738
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 739
				ChatChannel.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 743
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 744
				ChatChannel.invalidateWidget(var3); // L: 745
				return 1; // L: 746
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 748
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 749
				ChatChannel.invalidateWidget(var3); // L: 750
				return 1; // L: 751
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 753
				class446.Interpreter_intStackSize -= 2; // L: 754
				var3.scrollWidth = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 755
				var3.scrollHeight = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 756
				ChatChannel.invalidateWidget(var3); // L: 757
				if (var4 != -1 && var3.type == 0) { // L: 758
					BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 759
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 761
				class362.resumePauseWidget(var3.id, var3.childIndex); // L: 762
				Client.meslayerContinueWidget = var3; // L: 763
				ChatChannel.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1122) { // L: 767
				var3.spriteId = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 768
				ChatChannel.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 772
				var3.color2 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 773
				ChatChannel.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == 1124) { // L: 777
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 778
				ChatChannel.invalidateWidget(var3); // L: 779
				return 1; // L: 780
			} else if (var0 == 1125) { // L: 782
				var8 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 783
				FillMode var6 = (FillMode)Actor.findEnumerated(StudioGame.FillMode_values(), var8); // L: 784
				if (var6 != null) { // L: 785
					var3.fillMode = var6; // L: 786
					ChatChannel.invalidateWidget(var3); // L: 787
				}

				return 1; // L: 789
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 791
					var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 792
					var3.field3402 = var5; // L: 793
					return 1; // L: 794
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 796
					var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 797
					var3.modelTransparency = var5; // L: 798
					return 1; // L: 799
				} else if (var0 == 1128) { // L: 801
					class446.Interpreter_intStackSize -= 2; // L: 802
					return 1; // L: 803
				} else if (var0 == 1129) { // L: 805
					var3.field3405 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 806
					ChatChannel.invalidateWidget(var3); // L: 807
					return 1; // L: 808
				} else if (var0 == 1130) { // L: 810
					var3.method5619(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], class138.urlRequester, BoundaryObject.method4536()); // L: 811
					return 1; // L: 812
				} else if (var0 == 1131) { // L: 814
					class446.Interpreter_intStackSize -= 2; // L: 815
					var3.method5621(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 816
					return 1; // L: 817
				} else if (var0 == 1132) { // L: 819
					var3.method5622(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 820
					return 1; // L: 821
				} else {
					return 2; // L: 823
				}
			}
		}
	}
}
