import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("m")
	@Export("name")
	String name;
	@ObfuscatedName("o")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lmo;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = class280.method5160(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-633298311"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkq;I)I",
		garbageValue = "820506062"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "-794040320"
	)
	public static int method5398(CharSequence var0, int var1) {
		return SecureRandomFuture.parseIntCustomRadix(var0, var1, true);
	}
}
