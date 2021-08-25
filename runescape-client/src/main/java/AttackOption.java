import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1238(2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	field1236(4);

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 867300587
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "80"
	)
	static boolean method2254(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbg;",
		garbageValue = "-1523134564"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ItemContainer.method2041(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field941 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Loq;B)V",
		garbageValue = "28"
	)
	static final void method2255(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field560; ++var1) {
			int var2 = Client.field533[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 64) != 0) {
				var3.definition = ScriptEvent.getNpcDefinition(var0.method6853());
				var3.field1137 = var3.definition.size;
				var3.field1146 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			int var5;
			int var6;
			int var7;
			if ((var4 & 128) != 0) {
				var5 = var0.method6853();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByte();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = class17.SequenceDefinition_get(var5).field1961;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1099 = 0;
					}

					if (var7 == 2) {
						var3.field1099 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || class17.SequenceDefinition_get(var5).field1955 >= class17.SequenceDefinition_get(var3.sequence).field1955) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1099 = 0;
					var3.field1152 = var3.pathLength;
				}
			}

			int var8;
			if ((var4 & 1) != 0) {
				var5 = var0.method6940();
				var6 = var0.method6940();
				var7 = var3.x - (var5 - FloorOverlayDefinition.baseX - FloorOverlayDefinition.baseX) * 64;
				var8 = var3.y - (var6 - class320.baseY - class320.baseY) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1096 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 32) != 0) {
				var3.spotAnimation = var0.readUnsignedShort();
				var5 = var0.readInt();
				var3.field1134 = var5 >> 16;
				var3.field1133 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1133 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 16) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 4) != 0) {
				var3.field1135 = var0.readByte();
				var3.field1141 = var0.method6848();
				var3.field1121 = var0.method6901();
				var3.field1110 = var0.method6901();
				var3.field1139 = var0.method6940() + Client.cycle;
				var3.field1140 = var0.method6855() + Client.cycle;
				var3.field1101 = var0.method6853();
				var3.pathLength = 1;
				var3.field1152 = 0;
				var3.field1135 += var3.pathX[0];
				var3.field1141 += var3.pathY[0];
				var3.field1121 += var3.pathX[0];
				var3.field1110 += var3.pathY[0];
			}

			if ((var4 & 8) != 0) {
				var3.targetIndex = var0.readUnsignedShort();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 2) != 0) {
				var5 = var0.method7007();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.method6844();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.method6849();
							int var12 = var9 > 0 ? var0.method6844() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2055549575"
	)
	static final void method2253(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2677()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = FriendSystem.getPacketBufferNode(ClientPacket.field2666, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + BufferedSink.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				var4.addNode(var5);
			}
		}
	}
}
