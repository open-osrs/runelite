import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class35 {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("f")
	ExecutorService field239;
	@ObfuscatedName("o")
	Future field238;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	final Buffer field237;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class31 field240;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lat;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field239 = Executors.newSingleThreadExecutor(); // L: 10
		this.field237 = var1; // L: 16
		this.field240 = var2; // L: 17
		this.method432(); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1164318842"
	)
	public boolean method426() {
		return this.field238.isDone(); // L: 22
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method427() {
		this.field239.shutdown(); // L: 26
		this.field239 = null; // L: 27
	} // L: 28

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lnu;",
		garbageValue = "-112"
	)
	public Buffer method425() {
		try {
			return (Buffer)this.field238.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993058043"
	)
	void method432() {
		this.field238 = this.field239.submit(new class29(this, this.field237, this.field240)); // L: 40
	} // L: 41

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	static final void method435() {
		Object var10000 = null; // L: 196
		String var0 = "You can't add yourself to your own ignore list";
		class69.addGameMessage(30, "", var0); // L: 198
	} // L: 200
}
