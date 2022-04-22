import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 9

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "842367957"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Lqb;",
		garbageValue = "0"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-348962548"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1206801353"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;B)V",
		garbageValue = "39"
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

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "53251261"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11175
	}
}
