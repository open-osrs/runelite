import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public abstract class class342 implements class215 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class376 field3940;

	class342(int var1) {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;II)V",
		garbageValue = "-606165305"
	)
	abstract void vmethod6079(Buffer var1, int var2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "-109"
	)
	public void method6081(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class338[] var3 = new class338[]{class338.field3930, class338.field3933, class338.field3928, class338.field3929};
			class338 var4 = (class338)Huffman.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field3931) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field3940 = WorldMapSection0.method3597(var5);
					if (this.field3940 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					Huffman.findEnumerated(WorldMapSprite.method3649(), var1.readUnsignedByte());
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod6079(var1, var2);
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1592955951"
	)
	boolean method6080() {
		return this.field3940 != null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1957232535"
	)
	Object method6087() {
		if (this.field3940 == class376.field4163) {
			return 0;
		} else if (this.field3940 == class376.field4159) {
			return -1L;
		} else {
			return this.field3940 == class376.field4164 ? "" : null;
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1796576439"
	)
	public static void method6089(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2634, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.method6786(var0);
		var4.packetBuffer.writeInt(var3 ? Client.field488 * -1636832173 * -2076624933 : 0);
		Client.packetWriter.addNode(var4);
	}
}
