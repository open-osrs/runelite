import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 230523547
	)
	@Export("id")
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 90334317
	)
	@Export("count")
	int count;
	@ObfuscatedName("l")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("q")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	class231 field2590;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2590 = new class231(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "21"
	)
	public int method4720() {
		return this.count; // L: 38
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "1609725684"
	)
	public class231 method4721() {
		return this.field2590; // L: 42
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	static final void method4728(String var0) {
		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 115
		var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0)); // L: 116
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 117
		Client.packetWriter.addNode(var1); // L: 118
	} // L: 119

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "608778502"
	)
	static int method4729(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4592
			++Interpreter.Interpreter_intStackSize; // L: 4593
			return 1; // L: 4594
		} else if (var0 == 7101) { // L: 4596
			class122.Interpreter_stringStackSize += 2; // L: 4597
			return 1; // L: 4598
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4600
			if (var0 == 7106) { // L: 4604
				++Interpreter.Interpreter_intStackSize; // L: 4605
				return 1; // L: 4606
			} else if (var0 == 7107) { // L: 4608
				++Interpreter.Interpreter_intStackSize; // L: 4609
				return 1; // L: 4610
			} else if (var0 == 7108) { // L: 4612
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.method303() ? 1 : 0; // L: 4613
				return 1; // L: 4614
			} else if (var0 == 7110) { // L: 4616
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4617
				return 1; // L: 4618
			} else if (var0 == 7120) { // L: 4620
				--Interpreter.Interpreter_intStackSize; // L: 4621
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4622
				return 1; // L: 4623
			} else if (var0 == 7121) { // L: 4625
				Interpreter.Interpreter_intStackSize -= 2; // L: 4626
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4627
				return 1; // L: 4628
			} else if (var0 == 7122) { // L: 4630
				Interpreter.Interpreter_intStackSize -= 2; // L: 4631
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4632
				return 1; // L: 4633
			} else {
				return 2; // L: 4635
			}
		} else {
			++Interpreter.Interpreter_intStackSize; // L: 4601
			return 1; // L: 4602
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "664542157"
	)
	static final void method4730(Actor var0) {
		if (var0.field1175 != 0) { // L: 4065
			if (var0.targetIndex != -1) { // L: 4066
				Object var1 = null; // L: 4067
				if (var0.targetIndex < 32768) { // L: 4068
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4069
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 4070
					int var2 = var0.x - ((Actor)var1).x; // L: 4071
					int var3 = var0.y - ((Actor)var1).y; // L: 4072
					if (var2 != 0 || var3 != 0) { // L: 4073
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4075
					var0.targetIndex = -1; // L: 4076
					var0.false0 = false; // L: 4077
				}
			}

			if (var0.field1121 != -1 && (var0.pathLength == 0 || var0.field1179 > 0)) { // L: 4080
				var0.orientation = var0.field1121; // L: 4081
				var0.field1121 = -1; // L: 4082
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 4084
			if (var4 == 0 && var0.false0) { // L: 4085
				var0.targetIndex = -1; // L: 4086
				var0.false0 = false; // L: 4087
			}

			if (var4 != 0) { // L: 4089
				++var0.field1174; // L: 4090
				boolean var6;
				if (var4 > 1024) { // L: 4091
					var0.rotation -= var0.field1144 ? var4 : var0.field1175 * -730517519 * -1419386607; // L: 4092
					var6 = true; // L: 4093
					if (var4 < var0.field1175 || var4 > 2048 - var0.field1175) { // L: 4094
						var0.rotation = var0.orientation; // L: 4095
						var6 = false; // L: 4096
					}

					if (!var0.field1144 && var0.idleSequence == var0.movementSequence && (var0.field1174 > 25 || var6)) { // L: 4098
						if (var0.turnLeftSequence != -1) { // L: 4099
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4100
						}
					}
				} else {
					var0.rotation += var0.field1144 ? var4 : -1419386607 * var0.field1175 * -730517519; // L: 4104
					var6 = true; // L: 4105
					if (var4 < var0.field1175 || var4 > 2048 - var0.field1175) { // L: 4106
						var0.rotation = var0.orientation; // L: 4107
						var6 = false; // L: 4108
					}

					if (!var0.field1144 && var0.movementSequence == var0.idleSequence && (var0.field1174 > 25 || var6)) { // L: 4110
						if (var0.turnRightSequence != -1) { // L: 4111
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4112
						}
					}
				}

				var0.rotation &= 2047; // L: 4116
				var0.field1144 = false; // L: 4117
			} else {
				var0.field1174 = 0; // L: 4119
			}

		}
	} // L: 4120
}
