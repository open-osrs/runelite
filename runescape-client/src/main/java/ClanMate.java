import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1690991920"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15358"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class155.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990460013"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "3800"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class155.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39
}
