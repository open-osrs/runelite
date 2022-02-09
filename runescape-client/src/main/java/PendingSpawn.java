import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static Bounds field1107;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 475992133
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1877756307
	)
	@Export("type")
	int type;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 376673497
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2136154367
	)
	@Export("y")
	int y;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 111814825
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1791810711
	)
	int field1106;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1470559275
	)
	int field1100;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1174026637
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1690874167
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1276938079
	)
	int field1103;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1583628925
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1760851717
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-880833024"
	)
	public static String method2161(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ModeWhere.getWidgetChild(var0, var1); // L: 9167
		if (var4 != null && var4.onTargetEnter != null) { // L: 9168
			ScriptEvent var5 = new ScriptEvent(); // L: 9169
			var5.widget = var4; // L: 9170
			var5.args = var4.onTargetEnter; // L: 9171
			class92.runScriptEvent(var5); // L: 9172
		}

		Client.field536 = var3; // L: 9174
		Client.isSpellSelected = true; // L: 9175
		WorldMapLabelSize.selectedSpellWidget = var0; // L: 9176
		Client.selectedSpellChildIndex = var1; // L: 9177
		RouteStrategy.selectedSpellFlags = var2; // L: 9178
		class112.invalidateWidget(var4); // L: 9179
	} // L: 9180
}
