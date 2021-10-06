import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)I",
		garbageValue = "-81"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lpm;",
		garbageValue = "-1591035230"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "149819278"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1711535592"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)V",
		garbageValue = "-1790598798"
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
		return this.compareTo_user((User)var1);
	}
}
