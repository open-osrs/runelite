import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class120 implements class112 {
	@ObfuscatedName("c")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lnq;",
		garbageValue = "4"
	)
	public static class386 method2761() {
		synchronized(class386.field4344) { // L: 26
			if (class386.field4339 == 0) { // L: 27
				return new class386();
			} else {
				class386.field4344[--class386.field4339].method6985(); // L: 29
				return class386.field4344[class386.field4339]; // L: 30
			}
		}
	}
}
