import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)I",
		garbageValue = "2074675333"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-1358894970"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "126"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Loh;Loh;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1915260580"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class15.World_worlds != null) {
			class367.doWorldSorting(0, class15.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
