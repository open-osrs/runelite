import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fj")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("du")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;B)I",
		garbageValue = "-18"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 99
			var2 = (RunException)var0; // L: 100
			var2.message = var2.message + ' ' + var1; // L: 101
		} else {
			var2 = new RunException(var0, var1); // L: 103
		}

		return var2; // L: 104
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1672462382"
	)
	static int method3478(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 734
			var0 -= 1000; // L: 735
			var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 736
		} else {
			var3 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264; // L: 738
		}

		CollisionMap.invalidateWidget(var3); // L: 739
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 740
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 760
				var3.modelType = 2; // L: 761
				var3.modelId = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 762
				return 1; // L: 763
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 765
				var3.modelType = 3; // L: 766
				var3.modelId = PlayerAppearance.localPlayer.appearance.getChatHeadId(); // L: 767
				return 1; // L: 768
			} else {
				return 2; // L: 770
			}
		} else {
			VarcInt.Interpreter_intStackSize -= 2; // L: 741
			int var4 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 742
			int var5 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 743
			var3.itemId = var4; // L: 744
			var3.itemQuantity = var5; // L: 745
			ItemDefinition var6 = SecureRandomCallable.ItemDefinition_get(var4); // L: 746
			var3.modelAngleX = var6.xan2d; // L: 747
			var3.modelAngleY = var6.yan2d; // L: 748
			var3.modelAngleZ = var6.zan2d; // L: 749
			var3.modelOffsetX = var6.offsetX2d; // L: 750
			var3.modelOffsetY = var6.offsetY2d; // L: 751
			var3.modelZoom = var6.zoom2d; // L: 752
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 753
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 754
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 755
			}

			if (var3.field2641 > 0) { // L: 756
				var3.modelZoom = var3.modelZoom * 32 / var3.field2641;
			} else if (var3.rawWidth > 0) { // L: 757
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 758
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-889276398"
	)
	static final void method3477() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 3868
			int var1 = Client.npcIndices[var0]; // L: 3869
			NPC var2 = Client.npcs[var1]; // L: 3870
			if (var2 != null) { // L: 3871
				WorldMapID.updateActorSequence(var2, var2.definition.size); // L: 3872
			}
		}

	} // L: 3875
}
