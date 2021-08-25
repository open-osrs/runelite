import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1075419309
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 52594959
	)
	@Export("height")
	int height;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 675272483
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1949954399
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1781496417
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1888559139
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -121960731
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 181501421
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1330819283
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1606485327
	)
	int field2619;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 230666141
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 4462777262073349723L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -766138383
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Lcf;I)V",
		garbageValue = "1001461113"
	)
	static final void method4495(Actor var0) {
		int var1 = Math.max(1, var0.field1139 - Client.cycle);
		int var2 = var0.field1137 * 64 + var0.field1135 * 128;
		int var3 = var0.field1137 * 64 + var0.field1141 * 128;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1151 = 0;
		var0.orientation = var0.field1101;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-316675303"
	)
	static final void method4496() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field610[++Client.field495 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field533[++Client.field560 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2212(var7, (byte)1);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field533[++Client.field560 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2212(var7, (byte)2);
							var8 = var0.readBits(3);
							var4.method2212(var8, (byte)2);
							int var9 = var0.readBits(1);
							if (var9 == 1) {
								Client.field533[++Client.field560 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field610[++Client.field495 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
