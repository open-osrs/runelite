import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -13406753
	)
	static int field4308;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)I",
		garbageValue = "-81"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lqa;",
		garbageValue = "-97"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "119"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 17
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-24"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)V",
		garbageValue = "-639642586"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 36
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1413737997"
	)
	public static String method6679(CharSequence[] var0, int var1, int var2) {
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
}
