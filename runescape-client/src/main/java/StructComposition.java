import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-708046744"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "121791829"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "14"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class297.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "12"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return UserComparator1.method7638(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "121412525"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class292.method5479(this.params, var1, var2); // L: 53
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2008379188"
	)
	static final void method3410(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : InterfaceParent.guestClanChannel; // L: 11943
		if (var2 != null && var1 >= 0 && var1 < var2.method2982()) { // L: 11944
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11945
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 11947
				PacketBufferNode var5 = class135.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher); // L: 11948
				var5.packetBuffer.writeByte(3 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var4)); // L: 11949
				var5.packetBuffer.writeByte(var0); // L: 11950
				var5.packetBuffer.writeShort(var1); // L: 11951
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11952
				Client.packetWriter.addNode(var5); // L: 11953
			}
		}
	} // L: 11946 11954

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)Ljava/lang/String;",
		garbageValue = "10727"
	)
	static String method3387(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12001
		if (Client.gameBuild == 1) { // L: 12002
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12003
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12004
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12005
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12006
			var0 = "local";
		}

		String var3 = ""; // L: 12007
		if (ReflectionCheck.field256 != null) { // L: 12008
			var3 = "/p=" + ReflectionCheck.field256;
		}

		String var4 = "runescape.com"; // L: 12009
		return var2 + var0 + "." + var4 + "/l=" + class122.clientLanguage + "/a=" + class87.field1218 + var3 + "/"; // L: 12010
	}
}
