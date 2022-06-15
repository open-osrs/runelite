import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 91794545
	)
	static int field1690;
	@ObfuscatedName("c")
	boolean field1689;
	@ObfuscatedName("v")
	boolean field1701;
	@ObfuscatedName("q")
	@Export("members")
	public List members;
	@ObfuscatedName("f")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 1434435831047347565L
	)
	long field1693;
	@ObfuscatedName("e")
	@Export("name")
	public String name;
	@ObfuscatedName("g")
	public byte field1695;
	@ObfuscatedName("w")
	public byte field1696;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1701 = true; // L: 13
		this.name = null; // L: 17
		this.method3121(var1); // L: 26
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-17"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8320(); // L: 34
			}

			class353.method6507(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lew;I)V",
		garbageValue = "-619896679"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "911390350"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1458908732"
	)
	public int method3113() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method3102(String var1) {
		if (!this.field1701) { // L: 57
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "1615348983"
	)
	void method3121(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1689 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1701 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1693 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1696 = var1.readByte(); // L: 74
		this.field1695 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1689) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1701) { // L: 84
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llc;IIIBZB)V",
		garbageValue = "126"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 101
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 102
		if (var8 == null) { // L: 103
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 104
			if (var8 == null) { // L: 105
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 106
				if (var8 != null) { // L: 107
					if (var5) { // L: 108
						var8.removeDual(); // L: 109
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 110
						--NetCache.NetCache_pendingWritesCount; // L: 111
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 112
					}

				} else {
					if (!var5) { // L: 116
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 117
						if (var8 != null) { // L: 118
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 120
					var8.archive = var0; // L: 121
					var8.crc = var3; // L: 122
					var8.padding = var4; // L: 123
					if (var5) { // L: 124
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 125
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 126
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 129
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 130
						++NetCache.NetCache_pendingWritesCount; // L: 131
					}

				}
			}
		}
	} // L: 114 133
}
