import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2128884199"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1876506073"
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
		garbageValue = "-74"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39
}
