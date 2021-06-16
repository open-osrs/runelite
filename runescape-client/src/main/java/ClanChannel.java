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
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("tu")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -216933395
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1842635505
	)
	static int field30;
	@ObfuscatedName("f")
	boolean field31;
	@ObfuscatedName("e")
	boolean field21;
	@ObfuscatedName("v")
	@Export("members")
	public List members;
	@ObfuscatedName("y")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 1053094627222571429L
	)
	long field25;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	public byte field27;
	@ObfuscatedName("r")
	public byte field28;

	static {
		new BitSet(65536); // L: 21
	} // L: 22

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field21 = true; // L: 12
		this.name = null; // L: 16
		this.method39(var1); // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-163030259"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 29
			String[] var1 = new String[this.members.size()]; // L: 30
			this.sortedMembers = new int[this.members.size()]; // L: 31

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 32 34
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).name; // L: 33
			}

			int[] var3 = this.sortedMembers; // L: 36
			class215.method4434(var1, var3, 0, var1.length - 1); // L: 38
		}

		return this.sortedMembers; // L: 41
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ld;I)V",
		garbageValue = "1986125377"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 45
		this.sortedMembers = null; // L: 46
	} // L: 47

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-117"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 50
		this.sortedMembers = null; // L: 51
	} // L: 52

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "467541909"
	)
	public int method49() {
		return this.members.size(); // L: 55
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1685723054"
	)
	public int method38(String var1) {
		if (!this.field21) { // L: 59
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 60
				if (((ClanChannelMember)this.members.get(var2)).name.equalsIgnoreCase(var1)) {
					return var2; // L: 61
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1224796238"
	)
	void method39(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) { // L: 68
			this.field31 = true;
		}

		if ((var2 & 2) != 0) { // L: 69
			this.field21 = true;
		}

		int var3 = 2; // L: 70
		if ((var2 & 4) != 0) { // L: 71
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 72
		this.field25 = var1.readLong(); // L: 73
		this.name = var1.readStringCp1252NullTerminated(); // L: 74
		var1.readBoolean(); // L: 75
		this.field28 = var1.readByte(); // L: 76
		this.field27 = var1.readByte(); // L: 77
		int var4 = var1.readUnsignedShort(); // L: 78
		if (var4 > 0) { // L: 79
			this.members = new ArrayList(var4); // L: 80

			for (int var5 = 0; var5 < var4; ++var5) { // L: 81
				ClanChannelMember var6 = new ClanChannelMember(); // L: 82
				if (this.field31) { // L: 83
					var1.readLong(); // L: 84
				}

				if (this.field21) { // L: 86
					var6.name = var1.readStringCp1252NullTerminated();
				}

				var6.rank = var1.readByte(); // L: 87
				var6.world = var1.readUnsignedShort(); // L: 88
				if (var3 >= 3) { // L: 89
					var1.readBoolean(); // L: 90
				}

				this.members.add(var5, var6); // L: 93
			}
		}

	} // L: 96

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;J)V"
	)
	static void method56(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2090430707"
	)
	static boolean method54() {
		return (Client.drawPlayerNames & 2) != 0; // L: 4860
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1984819327"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5431
			int var3 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - var2; // L: 5436
			var0 -= ObjectSound.cameraX; // L: 5437
			var3 -= class160.cameraY; // L: 5438
			var1 -= Canvas.cameraZ; // L: 5439
			int var4 = Rasterizer3D.Rasterizer3D_sine[class69.cameraPitch]; // L: 5440
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class69.cameraPitch]; // L: 5441
			int var6 = Rasterizer3D.Rasterizer3D_sine[class32.cameraYaw]; // L: 5442
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class32.cameraYaw]; // L: 5443
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5444
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5445
			var0 = var8; // L: 5446
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5447
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5448
			if (var1 >= 50) { // L: 5450
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5451
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5452
			} else {
				Client.viewportTempX = -1; // L: 5455
				Client.viewportTempY = -1; // L: 5456
			}

		} else {
			Client.viewportTempX = -1; // L: 5432
			Client.viewportTempY = -1; // L: 5433
		}
	} // L: 5434 5458
}
