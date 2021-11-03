import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 31962043
	)
	static int field1333;
	@ObfuscatedName("p")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Z",
		garbageValue = "2134321189"
	)
	public static boolean method2502(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 208
		if (var3 == null) { // L: 209
			return false;
		} else {
			Script.SpriteBuffer_decode(var3); // L: 210
			return true; // L: 211
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "459"
	)
	static void method2500() {
		int var0 = Players.Players_count; // L: 5051
		int[] var1 = Players.Players_indices; // L: 5052

		for (int var2 = 0; var2 < var0; ++var2) { // L: 5053
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 5054
				class132.addPlayerToScene(Client.players[var1[var2]], true); // L: 5055
			}
		}

	} // L: 5057

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)Ljf;",
		garbageValue = "1540120138"
	)
	static Widget method2501(Widget var0) {
		int var2 = PendingSpawn.getWidgetFlags(var0); // L: 11886
		int var1 = var2 >> 17 & 7; // L: 11888
		int var3 = var1; // L: 11890
		if (var1 == 0) { // L: 11891
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 11892
				var0 = UserComparator9.getWidget(var0.parentId); // L: 11893
				if (var0 == null) { // L: 11894
					return null;
				}
			}

			return var0; // L: 11896
		}
	}
}
