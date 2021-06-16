import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)I",
		garbageValue = "-1545273649"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1609286013"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-507308651"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1933928316"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-2071487865"
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
