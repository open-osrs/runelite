import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	boolean field1663;
	@ObfuscatedName("l")
	boolean field1657;
	@ObfuscatedName("s")
	@Export("members")
	public List members;
	@ObfuscatedName("e")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 4772024494693371989L
	)
	long field1660;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	public byte field1656;
	@ObfuscatedName("w")
	public byte field1658;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1657 = true; // L: 13
		this.name = null; // L: 17
		this.method2991(var1); // L: 26
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "564190789"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7949(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			UrlRequester.method2421(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldc;B)V",
		garbageValue = "-73"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "503357714"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-448680935"
	)
	public int method2982() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "932031898"
	)
	public int method2984(String var1) {
		if (!this.field1657) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-336394177"
	)
	void method2991(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1663 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1657 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1660 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1658 = var1.readByte(); // L: 77
		this.field1656 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1663) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1657) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97
}
