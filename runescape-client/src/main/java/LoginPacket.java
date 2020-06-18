import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	public static final LoginPacket field2352;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	static final LoginPacket field2350;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	public static final LoginPacket field2347;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	public static final LoginPacket field2348;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	public static final LoginPacket field2345;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	static final LoginPacket field2346;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "[Lgx;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -444496991
	)
	@Export("id")
	public final int id;

	static {
		field2352 = new LoginPacket(14, 0);
		field2350 = new LoginPacket(15, 4);
		field2347 = new LoginPacket(16, -2);
		field2348 = new LoginPacket(18, -2);
		field2345 = new LoginPacket(19, -2);
		field2346 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = UserComparator9.method3512();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lik;",
		garbageValue = "-729077438"
	)
	public static HealthBarDefinition method3745(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
