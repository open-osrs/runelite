import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public enum class269 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3216(0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3217(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3218(2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3220(3),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	field3219(4);

	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 681305729
	)
	static int field3221;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -833696691
	)
	final int field3215;

	class269(int var3) {
		this.field3215 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3215; // L: 18
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "234"
	)
	public static int method5190(int var0) {
		return class361.field4051[var0 & 16383];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2127089164"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	public static void method5189() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 54
	} // L: 55
}
