import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class7 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1574043841
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("c")
	ExecutorService field30;
	@ObfuscatedName("b")
	Future field31;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final Buffer field25;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class3 field26;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lm;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field30 = Executors.newSingleThreadExecutor(); // L: 10
		this.field25 = var1; // L: 16
		this.field26 = var2; // L: 17
		this.method62(); // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1426679915"
	)
	public boolean method61() {
		return this.field31.isDone(); // L: 22
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1411495708"
	)
	public void method65() {
		this.field30.shutdown(); // L: 26
		this.field30 = null; // L: 27
	} // L: 28

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lpi;",
		garbageValue = "14"
	)
	public Buffer method75() {
		try {
			return (Buffer)this.field31.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1868135636"
	)
	void method62() {
		this.field31 = this.field30.submit(new class1(this, this.field25, this.field26)); // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldp;",
		garbageValue = "1979711764"
	)
	static class117[] method74() {
		return new class117[]{class117.field1425, class117.field1444, class117.field1430, class117.field1427, class117.field1428, class117.field1429, class117.field1442, class117.field1431, class117.field1432, class117.field1424, class117.field1434, class117.field1435, class117.field1436, class117.field1437, class117.field1438, class117.field1439, class117.field1440}; // L: 68
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljm;I)Ljava/lang/String;",
		garbageValue = "1826034348"
	)
	static String method60(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10882
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10883
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10885
					if (var3 == -1) { // L: 10886
						break;
					}

					var0 = var0.substring(0, var3) + class1.method11(class28.method442(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 10887
				}
			}
		}

		return var0; // L: 10891
	}
}
