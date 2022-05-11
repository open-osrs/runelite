import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("o")
	boolean field1712;
	@ObfuscatedName("q")
	boolean field1705;
	@ObfuscatedName("l")
	@Export("members")
	public List members;
	@ObfuscatedName("k")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 1835319440432000381L
	)
	long field1709;
	@ObfuscatedName("m")
	@Export("name")
	public String name;
	@ObfuscatedName("p")
	public byte field1711;
	@ObfuscatedName("s")
	public byte field1706;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1705 = true; // L: 13
		this.name = null; // L: 17
		this.method3010(var1); // L: 26
	} // L: 27

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "57"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8148(); // L: 34
			}

			class113.method2625(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)V",
		garbageValue = "42890757"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2089960192"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	public int method3005() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1345436984"
	)
	public int method3023(String var1) {
		if (!this.field1705) { // L: 57
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 58
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 59
				}
			}

			return -1; // L: 61
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-423085826"
	)
	void method3010(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1712 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1705 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1709 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1706 = var1.readByte(); // L: 74
		this.field1711 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1712) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1705) { // L: 84
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 85
				var6.world = var1.readUnsignedShort(); // L: 86
				if (var3 >= 3) { // L: 87
					var1.readBoolean(); // L: 88
				}

				this.members.add(var5, var6); // L: 91
			}
		}

	} // L: 94
}
