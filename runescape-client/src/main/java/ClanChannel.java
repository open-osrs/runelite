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
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("l")
	boolean field1522;
	@ObfuscatedName("q")
	boolean field1511;
	@ObfuscatedName("f")
	@Export("members")
	public List members;
	@ObfuscatedName("j")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 5432750622000558309L
	)
	long field1515;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("t")
	public byte field1517;
	@ObfuscatedName("a")
	public byte field1512;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1511 = true;
		this.name = null;
		this.method2731(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-583573916"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7459();
			}

			int[] var3 = this.sortedMembers;
			WorldMap.method6612(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I)V",
		garbageValue = "-1606907602"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-82"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	public int method2729() {
		return this.members.size();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1154960120"
	)
	public int method2739(String var1) {
		if (!this.field1511) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1374408697"
	)
	void method2731(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1522 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1511 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1515 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1512 = var1.readByte();
		this.field1517 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1522) {
					var1.readLong();
				}

				if (this.field1511) {
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lel;",
		garbageValue = "-34"
	)
	public static VarcInt method2747(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method2924(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1415895326"
	)
	public static boolean method2748(int var0) {
		return (var0 >> 21 & 1) != 0;
	}
}
