import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("e")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)I",
		garbageValue = "114"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfj;",
		garbageValue = "273043499"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 65
		if (var1 != null) { // L: 66
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 67
			var1 = new NPCComposition(); // L: 68
			var1.id = var0; // L: 69
			if (var2 != null) { // L: 70
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 71
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 72
			return var1; // L: 73
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-107"
	)
	public static int method2620(String var0) {
		return var0.length() + 2; // L: 128
	}
}
