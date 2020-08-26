import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "-53975348"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2094298107"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2114724515"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;I)V",
		garbageValue = "-1201574407"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 34
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "793231569"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = SecureRandomCallable.getWidgetChild(var0, var1); // L: 8100
		if (var4 != null && var4.onTargetEnter != null) { // L: 8101
			ScriptEvent var5 = new ScriptEvent(); // L: 8102
			var5.widget = var4; // L: 8103
			var5.args = var4.onTargetEnter; // L: 8104
			Script.runScriptEvent(var5); // L: 8105
		}

		Client.field834 = var3; // L: 8107
		Client.isSpellSelected = true; // L: 8108
		class232.selectedSpellWidget = var0; // L: 8109
		Client.selectedSpellChildIndex = var1; // L: 8110
		UserComparator8.selectedSpellFlags = var2; // L: 8111
		class52.invalidateWidget(var4); // L: 8112
	} // L: 8113
}
