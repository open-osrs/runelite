import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class361 {
	@ObfuscatedName("e")
	static final int[] field4041;
	@ObfuscatedName("l")
	static final int[] field4038;

	static {
		field4041 = new int[2048];
		field4038 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4041[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field4038[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	static final void method6283() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				SceneTilePaint.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-195653107"
	)
	static final void method6282(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : WorldMapSectionType.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2677()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = FriendSystem.getPacketBufferNode(ClientPacket.field2723, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + BufferedSink.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
