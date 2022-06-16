import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("c")
	long[] field1788;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 822358683
	)
	int field1787;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -39184651
	)
	int field1789;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -7252286742317130981L
	)
	long field1794;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 187442115
	)
	int field1791;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 117006029
	)
	int field1792;

	MilliClock() {
		this.field1788 = new long[10]; // L: 7
		this.field1787 = 256; // L: 15
		this.field1789 = 1;
		this.field1791 = 0;
		this.field1794 = class115.method2692();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1788[var1] = this.field1794; // L: 20
		}

	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "814382249"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1788[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-83"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1787; // L: 31
		int var4 = this.field1789; // L: 32
		this.field1787 = 300; // L: 33
		this.field1789 = 1; // L: 34
		this.field1794 = class115.method2692(); // L: 35
		if (this.field1788[this.field1792] == 0L) { // L: 36
			this.field1787 = var3; // L: 37
			this.field1789 = var4; // L: 38
		} else if (this.field1794 > this.field1788[this.field1792]) { // L: 40
			this.field1787 = (int)((long)(var1 * 2560) / (this.field1794 - this.field1788[this.field1792]));
		}

		if (this.field1787 < 25) { // L: 41
			this.field1787 = 25;
		}

		if (this.field1787 > 256) { // L: 42
			this.field1787 = 256; // L: 43
			this.field1789 = (int)((long)var1 - (this.field1794 - this.field1788[this.field1792]) / 10L); // L: 44
		}

		if (this.field1789 > var1) { // L: 46
			this.field1789 = var1;
		}

		this.field1788[this.field1792] = this.field1794; // L: 47
		this.field1792 = (this.field1792 + 1) % 10; // L: 48
		int var5;
		if (this.field1789 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1788[var5] != 0L) { // L: 51
					this.field1788[var5] += (long)this.field1789;
				}
			}
		}

		if (this.field1789 < var2) { // L: 54
			this.field1789 = var2;
		}

		DynamicObject.method1991((long)this.field1789); // L: 55

		for (var5 = 0; this.field1791 < 256; this.field1791 += this.field1787) { // L: 56 57
			++var5;
		}

		this.field1791 &= 255; // L: 61
		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "88445335"
	)
	static void method3309(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqc;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 58
			var2 = (RunException)var0; // L: 59
			var2.message = var2.message + ' ' + var1; // L: 60
		} else {
			var2 = new RunException(var0, var1); // L: 62
		}

		return var2; // L: 63
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcm;",
		garbageValue = "-325604576"
	)
	static class83[] method3310() {
		return new class83[]{class83.field1079, class83.field1075, class83.field1078, class83.field1074, class83.field1077, class83.field1084}; // L: 17
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-631328346"
	)
	public static void method3301() {
		class435.DBTableType_cache.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-535597968"
	)
	static int method3308(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4545
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4546
			return 1; // L: 4547
		} else if (var0 == 6950) { // L: 4549
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4550
			return 1; // L: 4551
		} else {
			return 2; // L: 4553
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1241772972"
	)
	static void method3304() {
		if (Client.oculusOrbState == 1) { // L: 12423
			Client.field533 = true; // L: 12424
		}

	} // L: 12426
}
