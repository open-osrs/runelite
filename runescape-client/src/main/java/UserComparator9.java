import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 1831242095
	)
	static int field1426;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "-1608595432"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1820867955"
	)
	static void method2478() {
		if (class35.localPlayer.x >> 7 == Client.destinationX && class35.localPlayer.y >> 7 == Client.destinationY) { // L: 4658
			Client.destinationX = 0; // L: 4659
		}

	} // L: 4661

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1550972970"
	)
	static final void method2477() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7646
		var0.importIndex(); // L: 7647
		int var1 = var0.readBits(8); // L: 7648
		int var2;
		if (var1 < Client.npcCount) { // L: 7649
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7650
				Client.field614[++Client.field737 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7652
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7653

			for (var2 = 0; var2 < var1; ++var2) { // L: 7654
				int var3 = Client.npcIndices[var2]; // L: 7655
				NPC var4 = Client.npcs[var3]; // L: 7656
				int var5 = var0.readBits(1); // L: 7657
				if (var5 == 0) { // L: 7658
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7659
					var4.npcCycle = Client.cycle; // L: 7660
				} else {
					int var6 = var0.readBits(2); // L: 7663
					if (var6 == 0) { // L: 7664
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7665
						var4.npcCycle = Client.cycle; // L: 7666
						Client.field662[++Client.field661 - 1] = var3; // L: 7667
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7670
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7671
							var4.npcCycle = Client.cycle; // L: 7672
							var7 = var0.readBits(3); // L: 7673
							var4.method2254(var7, (byte)1); // L: 7674
							var8 = var0.readBits(1); // L: 7675
							if (var8 == 1) { // L: 7676
								Client.field662[++Client.field661 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7679
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7680
							var4.npcCycle = Client.cycle; // L: 7681
							var7 = var0.readBits(3); // L: 7682
							var4.method2254(var7, (byte)2); // L: 7683
							var8 = var0.readBits(3); // L: 7684
							var4.method2254(var8, (byte)2); // L: 7685
							int var9 = var0.readBits(1); // L: 7686
							if (var9 == 1) {
								Client.field662[++Client.field661 - 1] = var3; // L: 7687
							}
						} else if (var6 == 3) { // L: 7690
							Client.field614[++Client.field737 - 1] = var3; // L: 7691
						}
					}
				}
			}

		}
	} // L: 7695

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var0)) == 0) { // L: 11627
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11628 11629 11631
		}
	}
}
