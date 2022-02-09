import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("i")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lox;",
		garbageValue = "1811636946"
	)
	public static FontName[] method7085() {
		return new FontName[]{FontName_plain12, FontName_verdana11, FontName_bold12, FontName_plain11, FontName_verdana15, FontName_verdana13}; // L: 16
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1759173263"
	)
	@Export("decrementMenuEntries")
	static void decrementMenuEntries() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 9355
			int var2 = Client.menuOpcodes[var0]; // L: 9357
			boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30; // L: 9359
			if (var1) { // L: 9361
				if (var0 < Client.menuOptionsCount - 1) { // L: 9362
					for (int var3 = var0; var3 < Client.menuOptionsCount - 1; ++var3) { // L: 9363
						Client.menuActions[var3] = Client.menuActions[var3 + 1]; // L: 9364
						Client.menuTargets[var3] = Client.menuTargets[var3 + 1]; // L: 9365
						Client.menuOpcodes[var3] = Client.menuOpcodes[var3 + 1]; // L: 9366
						Client.menuIdentifiers[var3] = Client.menuIdentifiers[var3 + 1]; // L: 9367
						Client.menuArguments1[var3] = Client.menuArguments1[var3 + 1]; // L: 9368
						Client.menuArguments2[var3] = Client.menuArguments2[var3 + 1]; // L: 9369
						Client.menuShiftClick[var3] = Client.menuShiftClick[var3 + 1]; // L: 9370
					}
				}

				--var0; // L: 9373
				--Client.menuOptionsCount; // L: 9374
			}
		}

		Interpreter.method1875(Calendar.menuWidth / 2 + Projectile.menuX, ReflectionCheck.menuY); // L: 9378
	} // L: 9380
}
