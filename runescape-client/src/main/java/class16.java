import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("n")
public class class16 implements ThreadFactory {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("i")
	final ThreadGroup field74;
	@ObfuscatedName("w")
	final AtomicInteger field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field75 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field74 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	} // L: 70

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field74, var1, this.this$0.field62 + "-rest-request-" + this.field75.getAndIncrement(), 0L);
		var2.setDaemon(true); // L: 74
		var2.setPriority(5);
		return var2; // L: 76
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-8513816"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class54.reflectionChecks.last(); // L: 29
		if (var1 != null) { // L: 30
			int var2 = var0.offset; // L: 31
			var0.writeInt(var1.id); // L: 32

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 33
				if (var1.creationErrors[var3] != 0) { // L: 34
					var0.writeByte(var1.creationErrors[var3]); // L: 35
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 39
						Field var5;
						int var6;
						if (var4 == 0) { // L: 40
							var5 = var1.fields[var3]; // L: 41
							var6 = Reflection.getInt(var5, (Object)null); // L: 42
							var0.writeByte(0); // L: 43
							var0.writeInt(var6); // L: 44
						} else if (var4 == 1) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0); // L: 49
						} else if (var4 == 2) { // L: 51
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.writeInt(var6); // L: 55
						}

						Method var25;
						if (var4 != 3) { // L: 57
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers(); // L: 79
								var0.writeByte(0); // L: 80
								var0.writeInt(var6); // L: 81
							}
						} else {
							var25 = var1.methods[var3]; // L: 58
							byte[][] var10 = var1.arguments[var3]; // L: 59
							Object[] var7 = new Object[var10.length]; // L: 60

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 61
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 62
								var7[var8] = var9.readObject(); // L: 63
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 65
							if (var11 == null) { // L: 66
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 67
								var0.writeByte(1); // L: 68
								var0.writeLong(((Number)var11).longValue()); // L: 69
							} else if (var11 instanceof String) { // L: 71
								var0.writeByte(2); // L: 72
								var0.writeStringCp1252NullTerminated((String)var11); // L: 73
							} else {
								var0.writeByte(4); // L: 75
							}
						}
					} catch (ClassNotFoundException var13) { // L: 84
						var0.writeByte(-10); // L: 85
					} catch (InvalidClassException var14) { // L: 87
						var0.writeByte(-11); // L: 88
					} catch (StreamCorruptedException var15) { // L: 90
						var0.writeByte(-12); // L: 91
					} catch (OptionalDataException var16) { // L: 93
						var0.writeByte(-13); // L: 94
					} catch (IllegalAccessException var17) { // L: 96
						var0.writeByte(-14); // L: 97
					} catch (IllegalArgumentException var18) { // L: 99
						var0.writeByte(-15); // L: 100
					} catch (InvocationTargetException var19) { // L: 102
						var0.writeByte(-16); // L: 103
					} catch (SecurityException var20) { // L: 105
						var0.writeByte(-17); // L: 106
					} catch (IOException var21) { // L: 108
						var0.writeByte(-18); // L: 109
					} catch (NullPointerException var22) { // L: 111
						var0.writeByte(-19); // L: 112
					} catch (Exception var23) { // L: 114
						var0.writeByte(-20); // L: 115
					} catch (Throwable var24) { // L: 117
						var0.writeByte(-21); // L: 118
					}
				}
			}

			var0.writeCrc(var2); // L: 121
			var1.remove(); // L: 122
		}
	} // L: 123

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILie;ZI)V",
		garbageValue = "-1672363550"
	)
	static void method219(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class54.getWorldMap().getMapArea(var0); // L: 4478
		int var4 = HealthBarDefinition.localPlayer.plane; // L: 4479
		int var5 = (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX; // L: 4480
		int var6 = (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY; // L: 4481
		Coord var7 = new Coord(var4, var5, var6); // L: 4482
		class54.getWorldMap().method6635(var3, var7, var1, var2); // L: 4483
	} // L: 4484

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(ZLoj;I)V",
		garbageValue = "-615408576"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field591 = 0; // L: 7764
		Client.field512 = 0; // L: 7765
		WorldMapLabel.method3970(); // L: 7766

		int var2;
		NPC var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7769
			var2 = var1.readBits(15); // L: 7770
			if (var2 == 32767) { // L: 7771
				break;
			}

			boolean var3 = false; // L: 7772
			if (Client.npcs[var2] == null) { // L: 7773
				Client.npcs[var2] = new NPC(); // L: 7774
				var3 = true; // L: 7775
			}

			var4 = Client.npcs[var2]; // L: 7777
			Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7778
			var4.npcCycle = Client.cycle; // L: 7779
			boolean var10;
			if (Players.field1254) { // L: 7783
				var4.definition = ScriptFrame.getNpcDefinition(var1.readBits(14)); // L: 7784
				if (var0) { // L: 7785
					var6 = var1.readBits(8); // L: 7786
					if (var6 > 127) { // L: 7787
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5); // L: 7790
					if (var6 > 15) { // L: 7791
						var6 -= 32;
					}
				}

				var8 = var1.readBits(1); // L: 7793
				if (var8 == 1) { // L: 7794
					Client.field513[++Client.field512 - 1] = var2;
				}

				var9 = Client.defaultRotations[var1.readBits(3)]; // L: 7795
				if (var3) { // L: 7796
					var4.orientation = var4.rotation = var9;
				}

				var10 = var1.readBits(1) == 1; // L: 7797
				if (var10) { // L: 7798
					var1.readBits(32); // L: 7799
				}

				if (var0) { // L: 7801
					var7 = var1.readBits(8); // L: 7802
					if (var7 > 127) { // L: 7803
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5); // L: 7806
					if (var7 > 15) { // L: 7807
						var7 -= 32;
					}
				}

				var5 = var1.readBits(1); // L: 7809
			} else {
				if (var0) { // L: 7812
					var6 = var1.readBits(8); // L: 7813
					if (var6 > 127) { // L: 7814
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5); // L: 7817
					if (var6 > 15) { // L: 7818
						var6 -= 32;
					}
				}

				var4.definition = ScriptFrame.getNpcDefinition(var1.readBits(14)); // L: 7820
				if (var0) { // L: 7821
					var7 = var1.readBits(8); // L: 7822
					if (var7 > 127) { // L: 7823
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5); // L: 7826
					if (var7 > 15) { // L: 7827
						var7 -= 32;
					}
				}

				var5 = var1.readBits(1); // L: 7829
				var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7830
				if (var3) { // L: 7831
					var4.orientation = var4.rotation = var8;
				}

				var9 = var1.readBits(1); // L: 7832
				if (var9 == 1) { // L: 7833
					Client.field513[++Client.field512 - 1] = var2;
				}

				var10 = var1.readBits(1) == 1; // L: 7834
				if (var10) { // L: 7835
					var1.readBits(32); // L: 7836
				}
			}

			var4.field1087 = var4.definition.size; // L: 7839
			var4.field1138 = var4.definition.rotation; // L: 7840
			if (var4.field1138 == 0) { // L: 7841
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence; // L: 7842
			var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7843
			var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7844
			var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7845
			var4.idleSequence = var4.definition.idleSequence; // L: 7846
			var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7847
			var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7848
			var4.method2249(HealthBarDefinition.localPlayer.pathX[0] + var6, HealthBarDefinition.localPlayer.pathY[0] + var7, var5 == 1); // L: 7849
		}

		var1.exportIndex(); // L: 7851

		int var14;
		for (var2 = 0; var2 < Client.field512; ++var2) { // L: 7854
			var14 = Client.field513[var2]; // L: 7855
			var4 = Client.npcs[var14]; // L: 7856
			var5 = var1.readUnsignedByte(); // L: 7857
			if (Players.field1254 && (var5 & 128) != 0) { // L: 7858
				var6 = var1.readUnsignedByte(); // L: 7859
				var5 += var6 << 8; // L: 7860
			}

			if ((var5 & 4) != 0) { // L: 7862
				var6 = var1.method6996(); // L: 7863
				int var11;
				int var12;
				int var15;
				if (var6 > 0) { // L: 7864
					for (var7 = 0; var7 < var6; ++var7) { // L: 7865
						var9 = -1; // L: 7867
						var15 = -1; // L: 7868
						var11 = -1; // L: 7869
						var8 = var1.readUShortSmart(); // L: 7870
						if (var8 == 32767) { // L: 7871
							var8 = var1.readUShortSmart(); // L: 7872
							var15 = var1.readUShortSmart(); // L: 7873
							var9 = var1.readUShortSmart(); // L: 7874
							var11 = var1.readUShortSmart(); // L: 7875
						} else if (var8 != 32766) { // L: 7877
							var15 = var1.readUShortSmart(); // L: 7878
						} else {
							var8 = -1; // L: 7880
						}

						var12 = var1.readUShortSmart(); // L: 7881
						var4.addHitSplat(var8, var15, var9, var11, Client.cycle, var12); // L: 7882
					}
				}

				var7 = var1.method6995(); // L: 7885
				if (var7 > 0) { // L: 7886
					for (var8 = 0; var8 < var7; ++var8) { // L: 7887
						var9 = var1.readUShortSmart(); // L: 7888
						var15 = var1.readUShortSmart(); // L: 7889
						if (var15 != 32767) { // L: 7890
							var11 = var1.readUShortSmart(); // L: 7891
							var12 = var1.readUnsignedByte(); // L: 7892
							int var13 = var15 > 0 ? var1.method6995() : var12; // L: 7893
							var4.addHealthBar(var9, Client.cycle, var15, var11, var12, var13); // L: 7894
						} else {
							var4.removeHealthBar(var9); // L: 7896
						}
					}
				}
			}

			if ((var5 & 512) != 0) { // L: 7900
				var4.field1145 = var1.readInt(); // L: 7901
			}

			if ((var5 & 2) != 0) { // L: 7903
				var4.definition = ScriptFrame.getNpcDefinition(var1.method7120()); // L: 7904
				var4.field1087 = var4.definition.size; // L: 7905
				var4.field1138 = var4.definition.rotation; // L: 7906
				var4.walkSequence = var4.definition.walkSequence; // L: 7907
				var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7908
				var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7909
				var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7910
				var4.idleSequence = var4.definition.idleSequence; // L: 7911
				var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7912
				var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7913
			}

			if ((var5 & 16) != 0) { // L: 7915
				var4.targetIndex = var1.method7004(); // L: 7916
				if (var4.targetIndex == 65535) { // L: 7917
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 1) != 0) { // L: 7919
				var6 = var1.method7006(); // L: 7920
				var7 = var1.method7006(); // L: 7921
				if (Players.field1254) { // L: 7922
					var4.field1127 = var1.method6995() == 1; // L: 7923
				}

				var8 = var4.x - (var6 - class19.baseX - class19.baseX) * 64; // L: 7925
				var9 = var4.y - (var7 - DefaultsGroup.baseY - DefaultsGroup.baseY) * 64; // L: 7926
				if (var8 != 0 || var9 != 0) { // L: 7927
					var4.field1112 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
				}
			}

			if (Players.field1254 && (var5 & 256) != 0 || !Players.field1254 && (var5 & 128) != 0) { // L: 7929
				var4.field1083 = var1.method7128(); // L: 7930
				var4.field1100 = var1.method6973(); // L: 7931
				var4.field1128 = var1.method7128(); // L: 7932
				var4.field1130 = var1.method6999(); // L: 7933
				var4.field1131 = var1.method7120() + Client.cycle; // L: 7934
				var4.field1132 = var1.readUnsignedShort() + Client.cycle; // L: 7935
				var4.field1133 = var1.method7004(); // L: 7936
				var4.pathLength = 1; // L: 7937
				var4.field1144 = 0; // L: 7938
				var4.field1083 += var4.pathX[0]; // L: 7939
				var4.field1100 += var4.pathY[0]; // L: 7940
				var4.field1128 += var4.pathX[0]; // L: 7941
				var4.field1130 += var4.pathY[0]; // L: 7942
			}

			if ((var5 & 32) != 0) { // L: 7944
				var6 = var1.method7004(); // L: 7945
				if (var6 == 65535) { // L: 7946
					var6 = -1;
				}

				var7 = var1.readUnsignedByte(); // L: 7947
				if (var6 == var4.sequence && var6 != -1) { // L: 7948
					var8 = MouseHandler.SequenceDefinition_get(var6).field1965; // L: 7949
					if (var8 == 1) { // L: 7950
						var4.sequenceFrame = 0; // L: 7951
						var4.sequenceFrameCycle = 0; // L: 7952
						var4.sequenceDelay = var7; // L: 7953
						var4.field1116 = 0; // L: 7954
					}

					if (var8 == 2) { // L: 7956
						var4.field1116 = 0; // L: 7957
					}
				} else if (var6 == -1 || var4.sequence == -1 || MouseHandler.SequenceDefinition_get(var6).field1959 >= MouseHandler.SequenceDefinition_get(var4.sequence).field1959) { // L: 7960
					var4.sequence = var6; // L: 7961
					var4.sequenceFrame = 0; // L: 7962
					var4.sequenceFrameCycle = 0; // L: 7963
					var4.sequenceDelay = var7; // L: 7964
					var4.field1116 = 0; // L: 7965
					var4.field1144 = var4.pathLength; // L: 7966
				}
			}

			if ((var5 & 64) != 0) { // L: 7970
				var4.spotAnimation = var1.readUnsignedShort(); // L: 7971
				var6 = var1.method7044(); // L: 7972
				var4.field1126 = var6 >> 16; // L: 7973
				var4.field1125 = (var6 & 65535) + Client.cycle; // L: 7974
				var4.spotAnimationFrame = 0; // L: 7975
				var4.spotAnimationFrameCycle = 0; // L: 7976
				if (var4.field1125 > Client.cycle) { // L: 7977
					var4.spotAnimationFrame = -1;
				}

				if (var4.spotAnimation == 65535) { // L: 7978
					var4.spotAnimation = -1;
				}
			}

			if ((var5 & 8) != 0) { // L: 7980
				var4.overheadText = var1.readStringCp1252NullTerminated(); // L: 7981
				var4.overheadTextCyclesRemaining = 100; // L: 7982
			}
		}

		for (var2 = 0; var2 < Client.field591; ++var2) { // L: 7986
			var14 = Client.field592[var2]; // L: 7987
			if (Client.npcs[var14].npcCycle != Client.cycle) { // L: 7988
				Client.npcs[var14].definition = null; // L: 7989
				Client.npcs[var14] = null; // L: 7990
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7993
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7994
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7995
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7996
				}
			}

		}
	} // L: 7999
}
