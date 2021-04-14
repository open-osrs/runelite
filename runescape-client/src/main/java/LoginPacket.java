import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("LoginPacket")
public class LoginPacket implements class201 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2456;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static final LoginPacket field2454;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2451;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2452;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2450;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static final LoginPacket field2449;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[Lgc;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 819348427
	)
	@Export("id")
	public final int id;

	static {
		field2456 = new LoginPacket(14, 0); // L: 5
		field2454 = new LoginPacket(15, 4); // L: 6
		field2451 = new LoginPacket(16, -2); // L: 7
		field2452 = new LoginPacket(18, -2); // L: 8
		field2450 = new LoginPacket(19, -2); // L: 9
		field2449 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = PacketWriter.method2386(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lka;",
		garbageValue = "1973214574"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}
}
