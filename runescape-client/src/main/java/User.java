import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "-335278145"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1574764800"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "198172856"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 20
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;I)V",
		garbageValue = "208802745"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljh;B)I",
		garbageValue = "69"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 34
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)J",
		garbageValue = "17738"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < ArchiveLoader.field565) { // L: 15
			class307.field3731 += ArchiveLoader.field565 - var0; // L: 16
		}

		ArchiveLoader.field565 = var0; // L: 18
		return class307.field3731 + var0; // L: 19
	}
}
