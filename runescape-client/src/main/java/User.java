import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llt;I)I",
		garbageValue = "1200801892"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Llw;",
		garbageValue = "46"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "125310743"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-43"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llw;Llw;B)V",
		garbageValue = "-36"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 24
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 25
			this.previousUsername = var2; // L: 26
		}
	} // L: 27

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 34
	}
}
