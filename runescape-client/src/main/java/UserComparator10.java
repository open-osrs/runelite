import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;B)I",
		garbageValue = "-50"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;ZLlu;B)V",
		garbageValue = "64"
	)
	public static void method2444(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class262.ItemDefinition_archive = var0;
		class393.ItemDefinition_modelArchive = var1;
		Huffman.ItemDefinition_inMembersWorld = var2;
		ItemComposition.ItemDefinition_fileCount = class262.ItemDefinition_archive.getGroupFileCount(10);
		class300.ItemDefinition_fontPlain11 = var3;
	}
}
