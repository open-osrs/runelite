import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class168 {
	@ObfuscatedName("l")
	public short[] field1847;
	@ObfuscatedName("k")
	public short[] field1844;

	class168(int var1) {
		ItemComposition var2 = FileSystem.ItemDefinition_get(var1); // L: 12
		if (var2.method3636()) { // L: 13
			this.field1847 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1847, 0, this.field1847.length); // L: 15
		}

		if (var2.method3637()) { // L: 17
			this.field1844 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1844, 0, this.field1844.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1006940319"
	)
	static String method3253() {
		String var0;
		if (class12.clientPreferences.method2257()) { // L: 268
			String var2 = Login.Login_username; // L: 270
			int var4 = var2.length(); // L: 273
			char[] var5 = new char[var4]; // L: 275

			for (int var6 = 0; var6 < var4; ++var6) { // L: 276
				var5[var6] = '*';
			}

			String var3 = new String(var5); // L: 277
			var0 = var3; // L: 281
		} else {
			var0 = Login.Login_username; // L: 283
		}

		return var0; // L: 284
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "24"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4210) { // L: 116
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 117
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4219) { // L: 120
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 121
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4220) { // L: 124
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 125
		} else if (var0.length == 30000 && ByteArrayPool.field4217 < ByteArrayPool.field4221) { // L: 128
			ByteArrayPool.field4225[++ByteArrayPool.field4217 - 1] = var0; // L: 129
		} else {
			if (class131.ByteArrayPool_arrays != null) { // L: 132
				for (int var1 = 0; var1 < FileSystem.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 133
					if (var0.length == FileSystem.ByteArrayPool_alternativeSizes[var1] && GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var1] < class131.ByteArrayPool_arrays[var1].length) { // L: 134
						class131.ByteArrayPool_arrays[var1][GrandExchangeEvents.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 135
						return; // L: 136
					}
				}
			}

		}
	} // L: 118 122 126 130 140

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1667178418"
	)
	static final void method3251(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12490
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3005()) { // L: 12491
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12492
				PacketBufferNode var4 = WallDecoration.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 12493
				var4.packetBuffer.writeByte(4 + class392.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12494
				var4.packetBuffer.writeByte(var0); // L: 12495
				var4.packetBuffer.writeShort(var1); // L: 12496
				var4.packetBuffer.writeBoolean(var2); // L: 12497
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12498
				Client.packetWriter.addNode(var4); // L: 12499
			}
		}
	} // L: 12500
}
