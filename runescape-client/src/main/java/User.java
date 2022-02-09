import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 9

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)I",
		garbageValue = "-1446218206"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lpb;",
		garbageValue = "1"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1174948960"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1772854194"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 36
	}
}
