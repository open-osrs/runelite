import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;I)I",
		garbageValue = "1947776738"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "-894640319"
	)
	public static HitSplatDefinition method2567(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILlp;IIIZI)V",
		garbageValue = "1953673398"
	)
	public static void method2573(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class273.musicPlayerStatus = 1; // L: 48
		ClanChannelMember.musicTrackArchive = var1; // L: 49
		StructComposition.musicTrackGroupId = var2; // L: 50
		FriendsList.musicTrackFileId = var3; // L: 51
		Clock.musicTrackVolume = var4; // L: 52
		VertexNormal.musicTrackBoolean = var5; // L: 53
		GrandExchangeEvent.pcmSampleLength = var0; // L: 54
	} // L: 55
}
