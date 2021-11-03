import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class9 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field31;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	public static final class9 field27;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field28;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field29;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field30;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1141093005
	)
	int field33;
	@ObfuscatedName("e")
	String field32;
	@ObfuscatedName("p")
	boolean field37;
	@ObfuscatedName("j")
	boolean field34;

	static {
		field31 = new class9(0, "POST", true, true); // L: 6
		field27 = new class9(1, "GET", true, false); // L: 7
		field28 = new class9(2, "PUT", false, true); // L: 8
		field29 = new class9(3, "PATCH", false, true); // L: 9
		field30 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field33 = var1; // L: 17
		this.field32 = var2; // L: 18
		this.field37 = var3; // L: 19
		this.field34 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "488070367"
	)
	boolean method76() {
		return this.field37; // L: 24
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field33; // L: 36
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1536909535"
	)
	String method78() {
		return this.field32; // L: 28
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	boolean method70() {
		return this.field34; // L: 32
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "6"
	)
	static final boolean method69(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 218
		Buffer var4 = new Buffer(var0); // L: 219
		int var5 = -1; // L: 220

		label71:
		while (true) {
			int var6 = var4.method6981(); // L: 222
			if (var6 == 0) { // L: 223
				return var3; // L: 254
			}

			var5 += var6; // L: 224
			int var7 = 0; // L: 225
			boolean var8 = false; // L: 226

			while (true) {
				int var9;
				while (!var8) { // L: 228
					var9 = var4.readUShortSmart(); // L: 234
					if (var9 == 0) { // L: 235
						continue label71;
					}

					var7 += var9 - 1; // L: 236
					int var10 = var7 & 63; // L: 237
					int var11 = var7 >> 6 & 63; // L: 238
					int var12 = var4.readUnsignedByte() >> 2; // L: 239
					int var13 = var11 + var1; // L: 240
					int var14 = var10 + var2; // L: 241
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 242
						ObjectComposition var15 = KitDefinition.getObjectDefinition(var5); // L: 243
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 244
							if (!var15.needsModelFiles()) { // L: 245
								++Client.field523; // L: 246
								var3 = false; // L: 247
							}

							var8 = true; // L: 249
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 229
				if (var9 == 0) { // L: 230
					break;
				}

				var4.readUnsignedByte(); // L: 231
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "435591094"
	)
	static final void method82(String var0) {
		PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2752, Client.packetWriter.isaacCipher); // L: 181
		var1.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0)); // L: 182
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 183
		Client.packetWriter.addNode(var1); // L: 184
	} // L: 185

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-79"
	)
	static int method83(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 3630
	}
}
