import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lmp;I)I",
		garbageValue = "579656332"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfx;",
		garbageValue = "-2085388383"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 97
					var1.groundActions[var3] = null; // L: 98
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 100
					if (var3 != 4) { // L: 101
						var1.inventoryActions[var3] = null; // L: 102
					}
				}

				var1.shiftClickIndex = -2; // L: 105
				var1.team = 0; // L: 106
				if (var1.params != null) { // L: 107
					boolean var6 = false; // L: 108

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 109
						ParamComposition var5 = VerticalAlignment.getParamDefinition((int)var4.key); // L: 110
						if (var5.autoDisable) { // L: 111
							var4.remove();
						} else {
							var6 = true; // L: 112
						}
					}

					if (!var6) {
						var1.params = null; // L: 114
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 117
			return var1; // L: 118
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfn;",
		garbageValue = "81"
	)
	public static HitSplatDefinition method2554(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cachedSprites.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cachedSprites.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-77"
	)
	public static void method2552(boolean var0) {
		if (var0 != ItemComposition.ItemDefinition_inMembersWorld) { // L: 552
			ItemComposition.ItemDefinition_cached.clear(); // L: 554
			ItemComposition.ItemDefinition_cachedModels.clear(); // L: 555
			ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 556
			ItemComposition.ItemDefinition_inMembersWorld = var0; // L: 558
		}

	} // L: 560

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "88961888"
	)
	static void method2551() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12038
			int var1 = var0.group; // L: 12039
			if (class242.loadInterface(var1)) { // L: 12040
				boolean var2 = true; // L: 12041
				Widget[] var3 = MouseRecorder.Widget_interfaceComponents[var1]; // L: 12042

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12043
					if (var3[var4] != null) { // L: 12044
						var2 = var3[var4].isIf3; // L: 12045
						break;
					}
				}

				if (!var2) { // L: 12049
					var4 = (int)var0.key; // L: 12050
					Widget var5 = ChatChannel.getWidget(var4); // L: 12051
					if (var5 != null) { // L: 12052
						SecureRandomCallable.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12056

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1260552521"
	)
	static void method2549() {
		SecureRandomFuture.clientPreferences.field1197 = Client.field473; // L: 12728
		class127.savePreferences(); // L: 12729
	} // L: 12730
}
