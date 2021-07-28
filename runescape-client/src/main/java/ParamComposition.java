import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("v")
	@Export("type")
	char type;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1130811289
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("l")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("n")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1647654534"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "-29"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "117273519"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class303.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1900827115"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1827241035"
	)
	static final int method2925(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lfz;IIII)V",
		garbageValue = "-16711936"
	)
	static void method2926(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Decimator.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lbb;III)V",
		garbageValue = "2001750026"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = World.SequenceDefinition_get(var1).field1875;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1056 = 0;
			}

			if (var3 == 2) {
				var0.field1056 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || World.SequenceDefinition_get(var1).field1863 >= World.SequenceDefinition_get(var0.sequence).field1863) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1056 = 0;
			var0.field1066 = var0.pathLength;
		}

	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(ZLnu;B)V",
		garbageValue = "-60"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field528 = 0;
		Client.field500 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field627[++Client.field528 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var16 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var16.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						Client.field474[++Client.field500 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method1956(var9, (byte)1);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field474[++Client.field500 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method1956(var9, (byte)2);
						var10 = var2.readBits(3);
						var16.method1956(var10, (byte)2);
						var11 = var2.readBits(1);
						if (var11 == 1) {
							Client.field474[++Client.field500 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field627[++Client.field528 - 1] = var5;
					}
				}
			}

			class100.method2220(var0, var1);

			int var14;
			for (var14 = 0; var14 < Client.field500; ++var14) {
				var3 = Client.field474[var14];
				NPC var15 = Client.npcs[var3];
				var5 = var1.readUnsignedByte();
				if ((var5 & 128) != 0) {
					var15.field1062 = var1.method6690();
					var15.field1064 = var1.method6690();
					var15.field1063 = var1.method6689();
					var15.field1065 = var1.method6644();
					var15.field1073 = var1.method6785() + Client.cycle;
					var15.field1067 = var1.readUnsignedShort() + Client.cycle;
					var15.field1050 = var1.readUnsignedShort();
					var15.pathLength = 1;
					var15.field1066 = 0;
					var15.field1062 += var15.pathX[0];
					var15.field1064 += var15.pathY[0];
					var15.field1063 += var15.pathX[0];
					var15.field1065 += var15.pathY[0];
				}

				int var6;
				if ((var5 & 32) != 0) {
					var6 = var1.readUnsignedShort();
					var7 = var1.method6697();
					var8 = var15.x - (var6 - GrandExchangeOfferNameComparator.baseX - GrandExchangeOfferNameComparator.baseX) * 64;
					var9 = var15.y - (var7 - NPC.baseY - NPC.baseY) * 64;
					if (var8 != 0 || var9 != 0) {
						var15.field1048 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 64) != 0) {
					var15.definition = UserComparator6.getNpcDefinition(var1.readUnsignedShort());
					var15.field1023 = var15.definition.size;
					var15.field1074 = var15.definition.rotation;
					var15.walkSequence = var15.definition.walkSequence;
					var15.walkBackSequence = var15.definition.walkBackSequence;
					var15.walkLeftSequence = var15.definition.walkLeftSequence;
					var15.walkRightSequence = var15.definition.walkRightSequence;
					var15.idleSequence = var15.definition.idleSequence;
					var15.turnLeftSequence = var15.definition.turnLeftSequence;
					var15.turnRightSequence = var15.definition.turnRightSequence;
				}

				if ((var5 & 16) != 0) {
					var6 = var1.method6697();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.readUnsignedByte();
					if (var6 == var15.sequence && var6 != -1) {
						var8 = World.SequenceDefinition_get(var6).field1875;
						if (var8 == 1) {
							var15.sequenceFrame = 0;
							var15.sequenceFrameCycle = 0;
							var15.sequenceDelay = var7;
							var15.field1056 = 0;
						}

						if (var8 == 2) {
							var15.field1056 = 0;
						}
					} else if (var6 == -1 || var15.sequence == -1 || World.SequenceDefinition_get(var6).field1863 >= World.SequenceDefinition_get(var15.sequence).field1863) {
						var15.sequence = var6;
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var7;
						var15.field1056 = 0;
						var15.field1066 = var15.pathLength;
					}
				}

				if ((var5 & 1) != 0) {
					var6 = var1.method6686();
					int var12;
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var11 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var11 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
						}
					}

					var7 = var1.method6873();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.method6873();
								int var13 = var10 > 0 ? var1.readUnsignedByte() : var12;
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
							} else {
								var15.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var5 & 4) != 0) {
					var15.overheadText = var1.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}

				if ((var5 & 2) != 0) {
					var15.spotAnimation = var1.method6785();
					var6 = var1.method6706();
					var15.field1061 = var6 >> 16;
					var15.field1060 = (var6 & 65535) + Client.cycle;
					var15.spotAnimationFrame = 0;
					var15.spotAnimationFrameCycle = 0;
					if (var15.field1060 > Client.cycle) {
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) {
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 8) != 0) {
					var15.targetIndex = var1.readUnsignedShort();
					if (var15.targetIndex == 65535) {
						var15.targetIndex = -1;
					}
				}
			}

			for (var14 = 0; var14 < Client.field528; ++var14) {
				var3 = Client.field627[var14];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) {
					if (Client.npcs[Client.npcIndices[var14]] == null) {
						throw new RuntimeException(var14 + "," + Client.npcCount);
					}
				}

			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-777740283"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + ScriptFrame.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + ScriptFrame.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + ScriptFrame.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1694153858"
	)
	static final void method2911() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}
}
