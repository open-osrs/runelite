import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static IndexedSprite field33;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -217468963
	)
	static int field38;
	@ObfuscatedName("v")
	boolean field30;
	@ObfuscatedName("n")
	boolean field27;
	@ObfuscatedName("f")
	@Export("members")
	public List members;
	@ObfuscatedName("y")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -8222609313489775677L
	)
	long field29;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	public byte field32;
	@ObfuscatedName("b")
	public byte field26;

	static {
		new BitSet(65536); // L: 21
	} // L: 22

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field27 = true; // L: 12
		this.name = null; // L: 16
		this.method29(var1); // L: 25
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1562690283"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 29
			String[] var1 = new String[this.members.size()]; // L: 30
			this.sortedMembers = new int[this.members.size()]; // L: 31

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 32 34
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).name; // L: 33
			}

			ChatChannel.method2013(var1, this.sortedMembers); // L: 36
		}

		return this.sortedMembers; // L: 38
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ls;I)V",
		garbageValue = "-1843980816"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 42
		this.sortedMembers = null; // L: 43
	} // L: 44

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "85"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 47
		this.sortedMembers = null; // L: 48
	} // L: 49

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	public int method27() {
		return this.members.size(); // L: 52
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "493868170"
	)
	public int method30(String var1) {
		if (!this.field27) { // L: 56
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 57
				if (((ClanChannelMember)this.members.get(var2)).name.equalsIgnoreCase(var1)) {
					return var2; // L: 58
				}
			}

			return -1; // L: 60
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-104022179"
	)
	void method29(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 64
		if ((var2 & 1) != 0) { // L: 65
			this.field30 = true;
		}

		if ((var2 & 2) != 0) { // L: 66
			this.field27 = true;
		}

		int var3 = 2; // L: 67
		if ((var2 & 4) != 0) { // L: 68
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 69
		this.field29 = var1.readLong(); // L: 70
		this.name = var1.readStringCp1252NullTerminated(); // L: 71
		var1.readBoolean(); // L: 72
		this.field26 = var1.readByte(); // L: 73
		this.field32 = var1.readByte(); // L: 74
		int var4 = var1.readUnsignedShort(); // L: 75
		if (var4 > 0) { // L: 76
			this.members = new ArrayList(var4); // L: 77

			for (int var5 = 0; var5 < var4; ++var5) { // L: 78
				ClanChannelMember var6 = new ClanChannelMember(); // L: 79
				if (this.field30) { // L: 80
					var1.readLong(); // L: 81
				}

				if (this.field27) { // L: 83
					var6.name = var1.readStringCp1252NullTerminated();
				}

				var6.rank = var1.readByte(); // L: 84
				var6.world = var1.readUnsignedShort(); // L: 85
				if (var3 >= 3) { // L: 86
					var1.readBoolean(); // L: 87
				}

				this.members.add(var5, var6); // L: 90
			}
		}

	} // L: 93

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1446319005"
	)
	static int method41(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2409
			if (var0 == 3702) { // L: 2414
				++class44.Interpreter_intStackSize; // L: 2415
				return 1; // L: 2416
			} else {
				return 2; // L: 2418
			}
		} else {
			--class44.Interpreter_intStackSize; // L: 2410
			--Interpreter.Interpreter_stringStackSize; // L: 2411
			return 1; // L: 2412
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "331312284"
	)
	static final void method36(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9671
		int var7 = var3 - var1; // L: 9672
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9673
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9674
		int var10 = var8; // L: 9675
		if (var8 < var9) { // L: 9676
			var10 = var9;
		}

		if (var10 != 0) { // L: 9677
			int var11 = (var6 << 16) / var10; // L: 9678
			int var12 = (var7 << 16) / var10; // L: 9679
			if (var12 <= var11) { // L: 9680
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9681
			}

			int var13 = var5 * var12 >> 17; // L: 9682
			int var14 = var5 * var12 + 1 >> 17; // L: 9683
			int var15 = var5 * var11 >> 17; // L: 9684
			int var16 = var5 * var11 + 1 >> 17; // L: 9685
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9686
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9687
			int var17 = var0 + var13; // L: 9688
			int var18 = var0 - var14; // L: 9689
			int var19 = var0 + var6 - var14; // L: 9690
			int var20 = var0 + var13 + var6; // L: 9691
			int var21 = var15 + var1; // L: 9692
			int var22 = var1 - var16; // L: 9693
			int var23 = var7 + var1 - var16; // L: 9694
			int var24 = var7 + var15 + var1; // L: 9695
			Rasterizer3D.method3856(var17, var18, var19); // L: 9696
			Rasterizer3D.method3919(var21, var22, var23, var17, var18, var19, var4); // L: 9697
			Rasterizer3D.method3856(var17, var19, var20); // L: 9698
			Rasterizer3D.method3919(var21, var23, var24, var17, var19, var20, var4); // L: 9699
		}
	} // L: 9700
}
