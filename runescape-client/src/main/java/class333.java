import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("lw")
public class class333 {
	@ObfuscatedName("c")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IIII)V",
		garbageValue = "372558126"
	)
	static void method6126(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class424.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3409
			if (var0.field2092 != null && var0.field2092.containsKey(var1)) { // L: 3410
				ObjectComposition.method3508((Integer)var0.field2092.get(var1), var2, var3); // L: 3411
			}
		}
	} // L: 3412

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1152556672"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class135.getPacketBufferNode(ClientPacket.field2860, Client.packetWriter.isaacCipher); // L: 11937
		var0.packetBuffer.writeByte(0); // L: 11938
		Client.packetWriter.addNode(var0); // L: 11939
	} // L: 11940
}
