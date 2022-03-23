import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class385 {
	@ObfuscatedName("g")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("v")
	float field4334;
	@ObfuscatedName("o")
	float field4332;
	@ObfuscatedName("h")
	float field4333;

	static {
		new class385(0.0F, 0.0F, 0.0F); // L: 5
		new class385(1.0F, 1.0F, 1.0F);
		new class385(1.0F, 0.0F, 0.0F); // L: 13
		new class385(0.0F, 1.0F, 0.0F); // L: 17
		new class385(0.0F, 0.0F, 1.0F); // L: 21
		KeyHandler.method377(100); // L: 25
	} // L: 26

	class385(float var1, float var2, float var3) {
		this.field4334 = var1; // L: 35
		this.field4332 = var2; // L: 36
		this.field4333 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-989001357"
	)
	final float method7026() {
		return (float)Math.sqrt((double)(this.field4334 * this.field4334 + this.field4332 * this.field4332 + this.field4333 * this.field4333)); // L: 41
	}

	public String toString() {
		return this.field4334 + ", " + this.field4332 + ", " + this.field4333; // L: 46
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ld;I)Lg;",
		garbageValue = "-1598451029"
	)
	public static class3 method7027(class6 var0) {
		switch(var0.field17) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	static final void method7028() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7850
		var0.importIndex(); // L: 7851
		int var1 = var0.readBits(8); // L: 7852
		int var2;
		if (var1 < Client.npcCount) { // L: 7853
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7854
				Client.field612[++Client.field634 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7856
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7857

			for (var2 = 0; var2 < var1; ++var2) { // L: 7858
				int var3 = Client.npcIndices[var2]; // L: 7859
				NPC var4 = Client.npcs[var3]; // L: 7860
				int var5 = var0.readBits(1); // L: 7861
				if (var5 == 0) { // L: 7862
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7863
					var4.npcCycle = Client.cycle; // L: 7864
				} else {
					int var6 = var0.readBits(2); // L: 7867
					if (var6 == 0) { // L: 7868
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7869
						var4.npcCycle = Client.cycle; // L: 7870
						Client.field533[++Client.field609 - 1] = var3; // L: 7871
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7874
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7875
							var4.npcCycle = Client.cycle; // L: 7876
							var7 = var0.readBits(3); // L: 7877
							var4.method2357(var7, class193.field2193); // L: 7878
							var8 = var0.readBits(1); // L: 7879
							if (var8 == 1) { // L: 7880
								Client.field533[++Client.field609 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7883
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7884
							var4.npcCycle = Client.cycle; // L: 7885
							if (var0.readBits(1) == 1) { // L: 7886
								var7 = var0.readBits(3); // L: 7887
								var4.method2357(var7, class193.field2191); // L: 7888
								var8 = var0.readBits(3); // L: 7889
								var4.method2357(var8, class193.field2191); // L: 7890
							} else {
								var7 = var0.readBits(3); // L: 7893
								var4.method2357(var7, class193.field2195); // L: 7894
							}

							var7 = var0.readBits(1); // L: 7896
							if (var7 == 1) { // L: 7897
								Client.field533[++Client.field609 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 7900
							Client.field612[++Client.field634 - 1] = var3; // L: 7901
						}
					}
				}
			}

		}
	} // L: 7905
}
