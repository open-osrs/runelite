import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class3 extends Node {
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("h")
	boolean field33;
	@ObfuscatedName("c")
	boolean field30;
	@ObfuscatedName("o")
	public List field32;
	@ObfuscatedName("g")
	int[] field35;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 2216912450870732033L
	)
	long field34;
	@ObfuscatedName("z")
	public String field38;
	@ObfuscatedName("t")
	public byte field36;
	@ObfuscatedName("v")
	public byte field37;

	static {
		new BitSet(65536); // L: 21
	} // L: 22

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class3(Buffer var1) {
		this.field30 = true; // L: 12
		this.field38 = null; // L: 16
		this.method35(var1); // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1568890582"
	)
	public int[] method31() {
		if (this.field35 == null) { // L: 29
			String[] var1 = new String[this.field32.size()]; // L: 30
			this.field35 = new int[this.field32.size()]; // L: 31

			for (int var2 = 0; var2 < this.field32.size(); this.field35[var2] = var2++) { // L: 32 34
				var1[var2] = ((class9)this.field32.get(var2)).field73; // L: 33
			}

			int[] var3 = this.field35; // L: 36
			class124.method2500(var1, var3, 0, var1.length - 1); // L: 38
		}

		return this.field35; // L: 41
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lq;I)V",
		garbageValue = "390115947"
	)
	void method29(class9 var1) {
		this.field32.add(var1); // L: 45
		this.field35 = null; // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-237070101"
	)
	void method33(int var1) {
		this.field32.remove(var1); // L: 50
		this.field35 = null; // L: 51
	} // L: 52

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	public int method39() {
		return this.field32.size(); // L: 55
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1935800799"
	)
	public int method34(String var1) {
		if (!this.field30) { // L: 59
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.field32.size(); ++var2) { // L: 60
				if (((class9)this.field32.get(var2)).field73.equalsIgnoreCase(var1)) {
					return var2; // L: 61
				}
			}

			return -1; // L: 63
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-13"
	)
	void method35(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 67
		if ((var2 & 1) != 0) { // L: 68
			this.field33 = true;
		}

		if ((var2 & 2) != 0) { // L: 69
			this.field30 = true;
		}

		int var3 = 2; // L: 70
		if ((var2 & 4) != 0) { // L: 71
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 72
		this.field34 = var1.readLong(); // L: 73
		this.field38 = var1.readStringCp1252NullTerminated(); // L: 74
		var1.readBoolean(); // L: 75
		this.field37 = var1.readByte(); // L: 76
		this.field36 = var1.readByte(); // L: 77
		int var4 = var1.readUnsignedShort(); // L: 78
		if (var4 > 0) { // L: 79
			this.field32 = new ArrayList(var4); // L: 80

			for (int var5 = 0; var5 < var4; ++var5) { // L: 81
				class9 var6 = new class9(); // L: 82
				if (this.field33) { // L: 83
					var1.readLong(); // L: 84
				}

				if (this.field30) { // L: 86
					var6.field73 = var1.readStringCp1252NullTerminated();
				}

				var6.field76 = var1.readByte(); // L: 87
				var6.field80 = var1.readUnsignedShort(); // L: 88
				if (var3 >= 3) { // L: 89
					var1.readBoolean(); // L: 90
				}

				this.field32.add(var5, var6); // L: 93
			}
		}

	} // L: 96

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-106"
	)
	static boolean method47(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZLnm;B)V",
		garbageValue = "6"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field737 = 0; // L: 7570
		Client.field661 = 0; // L: 7571
		UserComparator9.method2477(); // L: 7572

		int var2;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7575
			var2 = var1.readBits(15); // L: 7576
			if (var2 == 32767) { // L: 7577
				break;
			}

			boolean var3 = false; // L: 7578
			if (Client.npcs[var2] == null) { // L: 7579
				Client.npcs[var2] = new NPC(); // L: 7580
				var3 = true; // L: 7581
			}

			NPC var4 = Client.npcs[var2]; // L: 7583
			Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7584
			var4.npcCycle = Client.cycle; // L: 7585
			var4.definition = class8.getNpcDefinition(var1.readBits(14)); // L: 7589
			int var7;
			if (var0) { // L: 7590
				var7 = var1.readBits(8); // L: 7591
				if (var7 > 127) { // L: 7592
					var7 -= 256;
				}
			} else {
				var7 = var1.readBits(5); // L: 7595
				if (var7 > 15) { // L: 7596
					var7 -= 32;
				}
			}

			int var6;
			if (var0) { // L: 7598
				var6 = var1.readBits(8); // L: 7599
				if (var6 > 127) { // L: 7600
					var6 -= 256;
				}
			} else {
				var6 = var1.readBits(5); // L: 7603
				if (var6 > 15) { // L: 7604
					var6 -= 32;
				}
			}

			int var8 = Client.defaultRotations[var1.readBits(3)]; // L: 7606
			if (var3) { // L: 7607
				var4.orientation = var4.rotation = var8;
			}

			int var9 = var1.readBits(1); // L: 7608
			if (var9 == 1) { // L: 7609
				Client.field662[++Client.field661 - 1] = var2;
			}

			boolean var10 = var1.readBits(1) == 1; // L: 7610
			if (var10) { // L: 7611
				var1.readBits(32); // L: 7612
			}

			int var5 = var1.readBits(1); // L: 7614
			var4.field1211 = var4.definition.size; // L: 7615
			var4.field1261 = var4.definition.rotation; // L: 7616
			if (var4.field1261 == 0) { // L: 7617
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence; // L: 7618
			var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7619
			var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7620
			var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7621
			var4.idleSequence = var4.definition.idleSequence; // L: 7622
			var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7623
			var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7624
			var4.method2267(class35.localPlayer.pathX[0] + var6, class35.localPlayer.pathY[0] + var7, var5 == 1); // L: 7625
		}

		var1.exportIndex(); // L: 7627
		SequenceDefinition.method3086(var1); // L: 7629

		for (var2 = 0; var2 < Client.field737; ++var2) { // L: 7630
			int var11 = Client.field614[var2]; // L: 7631
			if (Client.npcs[var11].npcCycle != Client.cycle) { // L: 7632
				Client.npcs[var11].definition = null; // L: 7633
				Client.npcs[var11] = null; // L: 7634
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7637
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7638
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7639
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7640
				}
			}

		}
	} // L: 7643
}
