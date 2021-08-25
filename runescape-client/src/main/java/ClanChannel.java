import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("n")
	boolean field1519;
	@ObfuscatedName("c")
	boolean field1512;
	@ObfuscatedName("m")
	@Export("members")
	public List members;
	@ObfuscatedName("k")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -3790733818570190469L
	)
	long field1516;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	public byte field1518;
	@ObfuscatedName("a")
	public byte field1513;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1512 = true;
		this.name = null;
		this.method2680(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2070605103"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7399();
			}

			MouseHandler.method580(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "1841973558"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1608284005"
	)
	public int method2677() {
		return this.members.size();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1547168983"
	)
	public int method2674(String var1) {
		if (!this.field1512) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-802719408"
	)
	void method2680(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1519 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1512 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1516 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1513 = var1.readByte();
		this.field1518 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1519) {
					var1.readLong();
				}

				if (this.field1512) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}
}
