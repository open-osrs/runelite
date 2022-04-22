import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class45 {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 1132145401
	)
	static int field154;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("l")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lay;",
		garbageValue = "-262480710"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}
}
