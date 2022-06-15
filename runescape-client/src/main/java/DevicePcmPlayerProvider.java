import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("w")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lar;",
		garbageValue = "71"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "933240326"
	)
	static int method305(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 50
		if (var1 == null) { // L: 51
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 52 53
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1946812407"
	)
	static final void method309(String var0, int var1) {
		PacketBufferNode var2 = EnumComposition.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 260
		var2.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 261
		var2.packetBuffer.method7762(var1); // L: 262
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 263
		Client.packetWriter.addNode(var2); // L: 264
	} // L: 265

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "20"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12361
		short[] var2 = new short[16]; // L: 12362
		int var3 = 0; // L: 12363

		for (int var4 = 0; var4 < PacketBufferNode.ItemDefinition_fileCount; ++var4) { // L: 12364
			ItemComposition var9 = EnumComposition.ItemDefinition_get(var4); // L: 12365
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12366 12367 12368
				if (var3 >= 250) { // L: 12369
					HealthBarUpdate.foundItemIdCount = -1; // L: 12370
					class10.foundItemIds = null; // L: 12371
					return; // L: 12372
				}

				if (var3 >= var2.length) { // L: 12374
					short[] var6 = new short[var2.length * 2]; // L: 12375

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12376
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12377
				}

				var2[var3++] = (short)var4; // L: 12379
			}
		}

		class10.foundItemIds = var2; // L: 12381
		TriBool.foundItemIndex = 0; // L: 12382
		HealthBarUpdate.foundItemIdCount = var3; // L: 12383
		String[] var8 = new String[HealthBarUpdate.foundItemIdCount]; // L: 12384

		for (int var5 = 0; var5 < HealthBarUpdate.foundItemIdCount; ++var5) { // L: 12385
			var8[var5] = EnumComposition.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class10.foundItemIds; // L: 12386
		ObjectSound.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12388
	} // L: 12390
}
