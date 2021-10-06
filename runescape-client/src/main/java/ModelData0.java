import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1954904169
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	ModelData0() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[Lip;",
		garbageValue = "499045866"
	)
	static LoginPacket[] method4562() {
		return new LoginPacket[]{LoginPacket.field2888, LoginPacket.field2889, LoginPacket.field2885, LoginPacket.field2891, LoginPacket.field2884, LoginPacket.field2886};
	}
}
