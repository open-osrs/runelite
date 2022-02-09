import java.awt.Component;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public abstract class class142 extends Node {
	@ObfuscatedName("fg")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	class142() {
	} // L: 49

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-103"
	)
	abstract void vmethod3014(Buffer var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "48"
	)
	abstract void vmethod3015(ClanChannel var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "77"
	)
	static void method2945(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)V",
		garbageValue = "-893851567"
	)
	static final void method2952(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field548; ++var1) { // L: 7727
			int var2 = Client.field549[var1]; // L: 7728
			NPC var3 = Client.npcs[var2]; // L: 7729
			int var4 = var0.readUnsignedByte(); // L: 7730
			int var5;
			if (HealthBarUpdate.field1178 && (var4 & 16) != 0) { // L: 7731
				var5 = var0.readUnsignedByte(); // L: 7732
				var4 += var5 << 8; // L: 7733
			}

			if ((var4 & 32) != 0) { // L: 7735
				var3.definition = UserComparator10.getNpcDefinition(var0.method7408()); // L: 7736
				var3.field1113 = var3.definition.size; // L: 7737
				var3.field1170 = var3.definition.rotation; // L: 7738
				var3.walkSequence = var3.definition.walkSequence; // L: 7739
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 7740
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 7741
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 7742
				var3.idleSequence = var3.definition.idleSequence; // L: 7743
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 7744
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 7745
			}

			if ((var4 & 128) != 0) { // L: 7747
				var3.spotAnimation = var0.method7562(); // L: 7748
				var5 = var0.readInt(); // L: 7749
				var3.spotAnimationHeight = var5 >> 16; // L: 7750
				var3.field1177 = (var5 & 65535) + Client.cycle; // L: 7751
				var3.spotAnimationFrame = 0; // L: 7752
				var3.spotAnimationFrameCycle = 0; // L: 7753
				if (var3.field1177 > Client.cycle) { // L: 7754
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 7755
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 512) != 0) { // L: 7757
				var3.field1135 = var0.method7416(); // L: 7758
			}

			if (HealthBarUpdate.field1178 && (var4 & 1024) != 0 || !HealthBarUpdate.field1178 && (var4 & 16) != 0) { // L: 7760
				var3.field1153 = var0.readByte(); // L: 7761
				var3.field1144 = var0.readByte(); // L: 7762
				var3.field1147 = var0.method7365(); // L: 7763
				var3.field1156 = var0.method7400(); // L: 7764
				var3.field1157 = var0.method7408() + Client.cycle; // L: 7765
				var3.field1158 = var0.method7562() + Client.cycle; // L: 7766
				var3.field1159 = var0.readUnsignedShort(); // L: 7767
				var3.pathLength = 1; // L: 7768
				var3.field1176 = 0; // L: 7769
				var3.field1153 += var3.pathX[0]; // L: 7770
				var3.field1144 += var3.pathY[0]; // L: 7771
				var3.field1147 += var3.pathX[0]; // L: 7772
				var3.field1156 += var3.pathY[0]; // L: 7773
			}

			if ((var4 & 256) != 0) { // L: 7775
				var3.field1162 = Client.cycle + var0.method7562(); // L: 7776
				var3.field1163 = Client.cycle + var0.readUnsignedShort(); // L: 7777
				var3.field1164 = var0.method7401(); // L: 7778
				var3.field1155 = var0.method7400(); // L: 7779
				var3.field1166 = var0.readByte(); // L: 7780
				var3.field1167 = (byte)var0.method7399(); // L: 7781
			}

			if ((var4 & 64) != 0) { // L: 7783
				var3.targetIndex = var0.method7408(); // L: 7784
				if (var3.targetIndex == 65535) { // L: 7785
					var3.targetIndex = -1;
				}
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) { // L: 7787
				var5 = var0.method7398(); // L: 7788
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 7789
					for (var6 = 0; var6 < var5; ++var6) { // L: 7790
						var8 = -1; // L: 7792
						var9 = -1; // L: 7793
						var10 = -1; // L: 7794
						var7 = var0.readUShortSmart(); // L: 7795
						if (var7 == 32767) { // L: 7796
							var7 = var0.readUShortSmart(); // L: 7797
							var9 = var0.readUShortSmart(); // L: 7798
							var8 = var0.readUShortSmart(); // L: 7799
							var10 = var0.readUShortSmart(); // L: 7800
						} else if (var7 != 32766) { // L: 7802
							var9 = var0.readUShortSmart(); // L: 7803
						} else {
							var7 = -1; // L: 7805
						}

						var11 = var0.readUShortSmart(); // L: 7806
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 7807
					}
				}

				var6 = var0.readUnsignedByte(); // L: 7810
				if (var6 > 0) { // L: 7811
					for (var7 = 0; var7 < var6; ++var7) { // L: 7812
						var8 = var0.readUShortSmart(); // L: 7813
						var9 = var0.readUShortSmart(); // L: 7814
						if (var9 != 32767) { // L: 7815
							var10 = var0.readUShortSmart(); // L: 7816
							var11 = var0.method7398(); // L: 7817
							int var12 = var9 > 0 ? var0.method7467() : var11; // L: 7818
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 7819
						} else {
							var3.removeHealthBar(var8); // L: 7821
						}
					}
				}
			}

			if ((var4 & 4) != 0) { // L: 7825
				var5 = var0.method7408(); // L: 7826
				if (var5 == 65535) { // L: 7827
					var5 = -1;
				}

				var6 = var0.readUnsignedByte(); // L: 7828
				if (var5 == var3.sequence && var5 != -1) { // L: 7829
					var7 = class78.SequenceDefinition_get(var5).field2109; // L: 7830
					if (var7 == 1) { // L: 7831
						var3.sequenceFrame = 0; // L: 7832
						var3.sequenceFrameCycle = 0; // L: 7833
						var3.sequenceDelay = var6; // L: 7834
						var3.field1129 = 0; // L: 7835
					}

					if (var7 == 2) { // L: 7837
						var3.field1129 = 0; // L: 7838
					}
				} else if (var5 == -1 || var3.sequence == -1 || class78.SequenceDefinition_get(var5).field2095 >= class78.SequenceDefinition_get(var3.sequence).field2095) { // L: 7841
					var3.sequence = var5; // L: 7842
					var3.sequenceFrame = 0; // L: 7843
					var3.sequenceFrameCycle = 0; // L: 7844
					var3.sequenceDelay = var6; // L: 7845
					var3.field1129 = 0; // L: 7846
					var3.field1176 = var3.pathLength; // L: 7847
				}
			}

			if ((var4 & 2) != 0) { // L: 7851
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 7852
				var3.overheadTextCyclesRemaining = 100; // L: 7853
			}

			if ((var4 & 8) != 0) { // L: 7855
				var5 = var0.readUnsignedShort(); // L: 7856
				var6 = var0.method7562(); // L: 7857
				if (HealthBarUpdate.field1178) { // L: 7858
					var3.field1139 = var0.readUnsignedByte() == 1; // L: 7859
				}

				var7 = var3.x - (var5 - Canvas.baseX - Canvas.baseX) * 64; // L: 7861
				var8 = var3.y - (var6 - class118.baseY - class118.baseY) * 64; // L: 7862
				if (var7 != 0 || var8 != 0) { // L: 7863
					var3.field1138 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}
		}

	} // L: 7866
}
