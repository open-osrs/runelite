import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("y")
	public static short[][] field1330;
	@ObfuscatedName("fp")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lmm;Lmm;I)I",
		garbageValue = "-1109317659"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lot;J)V"
	)
	static void method2439(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}
}
