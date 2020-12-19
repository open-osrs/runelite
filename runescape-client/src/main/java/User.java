import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lki;",
		garbageValue = "1670678120"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "2928"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1728130643"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lki;Lki;I)V",
		garbageValue = "-1682462851"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lju;I)I",
		garbageValue = "-1545516578"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 34
	}
}
