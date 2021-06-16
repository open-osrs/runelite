import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1170142713
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 213807601
	)
	@Export("count")
	int count;
	@ObfuscatedName("v")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("y")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 13
		Buffer var3 = new Buffer(var2); // L: 14
		this.count = var3.readUnsignedByte(); // L: 15
		this.transformTypes = new int[this.count]; // L: 16
		this.labels = new int[this.count][]; // L: 17

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 18
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 19
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 20
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 21
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	} // L: 23

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-913891462"
	)
	static final void method4034() {
		boolean var0 = false; // L: 8917

		while (!var0) { // L: 8918
			var0 = true; // L: 8919

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8920
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 8921
					String var2 = Client.menuTargets[var1]; // L: 8922
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8923
					Client.menuTargets[var1 + 1] = var2; // L: 8924
					String var3 = Client.menuActions[var1]; // L: 8925
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8926
					Client.menuActions[var1 + 1] = var3; // L: 8927
					int var4 = Client.menuOpcodes[var1]; // L: 8928
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8929
					Client.menuOpcodes[var1 + 1] = var4; // L: 8930
					var4 = Client.menuArguments1[var1]; // L: 8931
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8932
					Client.menuArguments1[var1 + 1] = var4; // L: 8933
					var4 = Client.menuArguments2[var1]; // L: 8934
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8935
					Client.menuArguments2[var1 + 1] = var4; // L: 8936
					var4 = Client.menuIdentifiers[var1]; // L: 8937
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8938
					Client.menuIdentifiers[var1 + 1] = var4; // L: 8939
					boolean var5 = Client.menuShiftClick[var1]; // L: 8940
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8941
					Client.menuShiftClick[var1 + 1] = var5; // L: 8942
					var0 = false; // L: 8943
				}
			}
		}

	} // L: 8947
}
