import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
class class18 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1555742103
	)
	static int field95;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1798104043
	)
	@Export("Client_plane")
	static int Client_plane;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lr;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "14"
	)
	int method257(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method257((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lln;IIIZB)V",
		garbageValue = "0"
	)
	public static void method266(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 1; // L: 40
		class273.musicTrackArchive = var0; // L: 41
		AccessFile.musicTrackGroupId = var1; // L: 42
		class273.musicTrackFileId = var2; // L: 43
		class273.musicTrackVolume = var3; // L: 44
		class17.musicTrackBoolean = var4; // L: 45
		class273.pcmSampleLength = 10000; // L: 46
	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldf;",
		garbageValue = "1077936192"
	)
	static class118[] method258() {
		return new class118[]{class118.field1433, class118.field1430, class118.field1431, class118.field1432, class118.field1434, class118.field1429}; // L: 25
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-14104"
	)
	static final void method264(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12423
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3119()) { // L: 12424
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12425
				if (var2.rank == -1) { // L: 12426
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 12427
					var3.packetBuffer.writeByte(3 + class425.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12428
					var3.packetBuffer.writeByte(var0); // L: 12429
					var3.packetBuffer.writeShort(var1); // L: 12430
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12431
					Client.packetWriter.addNode(var3); // L: 12432
				}
			}
		}
	} // L: 12433
}
