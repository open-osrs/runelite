import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	static Bounds field1022;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -955851169
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 982415587
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llc;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5806(var1) || this.archive.method5805(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1248295079"
	)
	public static int method2075(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "280590426"
	)
	static int method2073(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2707
			if (var0 == 3702) { // L: 2712
				++class446.Interpreter_intStackSize; // L: 2713
				return 1; // L: 2714
			} else {
				return 2; // L: 2716
			}
		} else {
			--class446.Interpreter_intStackSize; // L: 2708
			--Interpreter.Interpreter_stringStackSize; // L: 2709
			return 1; // L: 2710
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-818413481"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Huffman.friendsChat != null) { // L: 12225
			PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher); // L: 12226
			var1.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0)); // L: 12227
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12228
			Client.packetWriter.addNode(var1); // L: 12229
		}
	} // L: 12230
}
