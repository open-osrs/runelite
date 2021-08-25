import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("LoginPacket")
public class LoginPacket implements class238 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final LoginPacket field2873;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final LoginPacket field2867;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final LoginPacket field2868;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final LoginPacket field2871;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	public static final LoginPacket field2870;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final LoginPacket field2866;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1920525635
	)
	@Export("id")
	public final int id;

	static {
		field2873 = new LoginPacket(14, 0);
		field2867 = new LoginPacket(15, 4);
		field2868 = new LoginPacket(16, -2);
		field2871 = new LoginPacket(18, -2);
		field2870 = new LoginPacket(19, -2);
		field2866 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = new LoginPacket[]{field2866, field2867, field2868, field2870, field2871, field2873};
		LoginPacket[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			LoginPacket_indexedValues[var1[var2].id] = var1[var2];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BI)Lga;",
		garbageValue = "1298711293"
	)
	static WorldMapSprite method4572(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class17.convertJpgToSprite(var0).pixels);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1215031715"
	)
	public static int method4571(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-23"
	)
	static final void method4573(String var0) {
		PacketBufferNode var1 = FriendSystem.getPacketBufferNode(ClientPacket.field2692, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(BufferedSink.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
