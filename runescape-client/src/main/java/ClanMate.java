import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "203874469"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2063904436"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-170481426"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = WorldMapLabelSize.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1476758779"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-6155848"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "224401479"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = WorldMapLabelSize.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39
}
