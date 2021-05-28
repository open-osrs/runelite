import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)I",
		garbageValue = "539732409"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "1600385893"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "192558419"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)V",
		garbageValue = "2108784704"
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
