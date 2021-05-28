import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dn")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;I)I",
		garbageValue = "-26460885"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Let;",
		garbageValue = "1390407086"
	)
	public static HealthBarDefinition method2492(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-2129011135"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 222
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 223
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 224
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 225
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 226
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 227
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 228
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 229
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 230 231
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1210061532"
	)
	public static void method2485() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 203
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 204
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 205
	} // L: 206

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1275679316"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 381
		int var2 = var1.readUnsignedByte(); // L: 382
		int var3 = var1.readInt(); // L: 383
		if (var3 < 0 || AbstractArchive.field3589 != 0 && var3 > AbstractArchive.field3589) { // L: 384
			throw new RuntimeException(); // L: 385
		} else if (var2 == 0) { // L: 387
			byte[] var6 = new byte[var3]; // L: 388
			var1.readBytes(var6, 0, var3); // L: 389
			return var6; // L: 390
		} else {
			int var4 = var1.readInt(); // L: 393
			if (var4 >= 0 && (AbstractArchive.field3589 == 0 || var4 <= AbstractArchive.field3589)) { // L: 394
				byte[] var5 = new byte[var4]; // L: 397
				if (var2 == 1) { // L: 398
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 399
				}

				return var5; // L: 400
			} else {
				throw new RuntimeException(); // L: 395
			}
		}
	}
}
