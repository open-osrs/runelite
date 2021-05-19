import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public class class369 extends class340 implements class216 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	final AbstractArchive field4130;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	final DemotingHashTable field4129;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1767645643
	)
	final int field4128;

	@ObfuscatedSignature(
		descriptor = "(Ljr;ILkr;Ljp;)V"
	)
	public class369(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4129 = new DemotingHashTable(64); // L: 15
		this.field4130 = var4; // L: 20
		this.field4128 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lmi;",
		garbageValue = "1012040544"
	)
	protected class342 vmethod6308(int var1) {
		synchronized(this.field4129) { // L: 26
			class341 var2 = (class341)this.field4129.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method6301(var1); // L: 29
				this.field4129.method4249(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmr;",
		garbageValue = "16"
	)
	class341 method6301(int var1) {
		byte[] var2 = this.field4130.takeFile(this.field4128, var1); // L: 37
		class341 var3 = new class341(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method5879(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "107737702"
	)
	public void method6309() {
		synchronized(this.field4129) { // L: 44
			this.field4129.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class368(this); // L: 50
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "76"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "-1321837262"
	)
	static final void method6314(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4090
		if (var0.pathLength == 0) { // L: 4091
			var0.field1250 = 0; // L: 4092
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4095
				SequenceDefinition var1 = Player.SequenceDefinition_get(var0.sequence); // L: 4096
				if (var0.field1215 > 0 && var1.field1886 == 0) { // L: 4097
					++var0.field1250; // L: 4098
					return; // L: 4099
				}

				if (var0.field1215 <= 0 && var1.field1882 == 0) { // L: 4101
					++var0.field1250; // L: 4102
					return; // L: 4103
				}
			}

			int var10 = var0.x; // L: 4106
			int var2 = var0.y; // L: 4107
			int var3 = var0.field1211 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4108
			int var4 = var0.field1211 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4109
			if (var10 < var3) { // L: 4110
				if (var2 < var4) { // L: 4111
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4112
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4113
				}
			} else if (var10 > var3) { // L: 4115
				if (var2 < var4) { // L: 4116
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4117
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4118
				}
			} else if (var2 < var4) { // L: 4120
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4121
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4122
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4123
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4130
				if (var6 > 1024) { // L: 4131
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4132
				if (var6 >= -256 && var6 <= 256) { // L: 4133
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4134
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4135
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4136
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4137
				int var8 = 4; // L: 4138
				boolean var9 = true; // L: 4139
				if (var0 instanceof NPC) { // L: 4140
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4141
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1261 != 0) { // L: 4142
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4143
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4144
						var8 = 8;
					}

					if (var0.field1250 > 0 && var0.pathLength > 1) { // L: 4145
						var8 = 8; // L: 4146
						--var0.field1250; // L: 4147
					}
				} else {
					if (var0.pathLength > 1) { // L: 4151
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4152
						var8 = 8;
					}

					if (var0.field1250 > 0 && var0.pathLength > 1) { // L: 4153
						var8 = 8; // L: 4154
						--var0.field1250; // L: 4155
					}
				}

				if (var5 == 2) { // L: 4158
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4159
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var4 != var2) { // L: 4160
					if (var10 < var3) { // L: 4161
						var0.x += var8; // L: 4162
						if (var0.x > var3) { // L: 4163
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4165
						var0.x -= var8; // L: 4166
						if (var0.x < var3) { // L: 4167
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4169
						var0.y += var8; // L: 4170
						if (var0.y > var4) { // L: 4171
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4173
						var0.y -= var8; // L: 4174
						if (var0.y < var4) { // L: 4175
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4178
					--var0.pathLength; // L: 4179
					if (var0.field1215 > 0) { // L: 4180
						--var0.field1215;
					}
				}

			} else {
				var0.x = var3; // L: 4124
				var0.y = var4; // L: 4125
				--var0.pathLength; // L: 4126
				if (var0.field1215 > 0) { // L: 4127
					--var0.field1215;
				}

			}
		}
	} // L: 4093 4128 4182
}
