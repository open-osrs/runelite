import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1722490231"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1564375073"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-1232233436"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9004
			if (Client.menuOptionsCount < 500) { // L: 9005
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9006
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9007
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9008
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9009
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9010
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9011
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9012
				++Client.menuOptionsCount; // L: 9013
			}

		}
	} // L: 9015
}
