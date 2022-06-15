import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -2102626567
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("q")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("f")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("j")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -735765161
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 367199611
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("w")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("y")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("i")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "110"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-1048481170"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "75421574"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lju;Lqv;I)Ljt;",
		garbageValue = "870680813"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) { // L: 35
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgs;",
		garbageValue = "-21"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = UserComparator4.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!DevicePcmPlayerProvider.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.team = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = class174.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) {
						var1.params = null; // L: 122
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}
}
