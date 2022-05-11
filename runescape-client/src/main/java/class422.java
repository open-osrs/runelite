import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class422 implements class421 {
	@ObfuscatedName("o")
	Map field4606;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	final class446 field4607;

	@ObfuscatedSignature(
		descriptor = "(Lqo;)V"
	)
	public class422(class446 var1) {
		this.field4607 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "41"
	)
	public int vmethod7293(int var1) {
		if (this.field4606 != null) { // L: 20
			class447 var2 = (class447)this.field4606.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4742; // L: 22
			}
		}

		return (Integer)this.field4607.vmethod7814(var1); // L: 24
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "113"
	)
	public void vmethod7295(int var1, Object var2) {
		if (this.field4606 == null) { // L: 29
			this.field4606 = new HashMap(); // L: 30
			this.field4606.put(var1, new class447(var1, var2)); // L: 31
		} else {
			class447 var3 = (class447)this.field4606.get(var1); // L: 34
			if (var3 == null) {
				this.field4606.put(var1, new class447(var1, var2)); // L: 35
			} else {
				var3.field4742 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4606 == null ? Collections.emptyList().iterator() : this.field4606.values().iterator(); // L: 42 43
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2021735109"
	)
	static final void method7303(int var0, int var1, int var2) {
		if (class343.cameraX < var0) { // L: 3922
			class343.cameraX = (var0 - class343.cameraX) * HitSplatDefinition.field2077 / 1000 + class343.cameraX + class229.field2805; // L: 3923
			if (class343.cameraX > var0) { // L: 3924
				class343.cameraX = var0;
			}
		}

		if (class343.cameraX > var0) { // L: 3926
			class343.cameraX -= (class343.cameraX - var0) * HitSplatDefinition.field2077 / 1000 + class229.field2805; // L: 3927
			if (class343.cameraX < var0) { // L: 3928
				class343.cameraX = var0;
			}
		}

		if (class295.cameraY < var1) { // L: 3930
			class295.cameraY = (var1 - class295.cameraY) * HitSplatDefinition.field2077 / 1000 + class295.cameraY + class229.field2805; // L: 3931
			if (class295.cameraY > var1) { // L: 3932
				class295.cameraY = var1;
			}
		}

		if (class295.cameraY > var1) { // L: 3934
			class295.cameraY -= (class295.cameraY - var1) * HitSplatDefinition.field2077 / 1000 + class229.field2805; // L: 3935
			if (class295.cameraY < var1) { // L: 3936
				class295.cameraY = var1;
			}
		}

		if (FaceNormal.cameraZ < var2) { // L: 3938
			FaceNormal.cameraZ = (var2 - FaceNormal.cameraZ) * HitSplatDefinition.field2077 / 1000 + FaceNormal.cameraZ + class229.field2805; // L: 3939
			if (FaceNormal.cameraZ > var2) { // L: 3940
				FaceNormal.cameraZ = var2;
			}
		}

		if (FaceNormal.cameraZ > var2) { // L: 3942
			FaceNormal.cameraZ -= (FaceNormal.cameraZ - var2) * HitSplatDefinition.field2077 / 1000 + class229.field2805; // L: 3943
			if (FaceNormal.cameraZ < var2) { // L: 3944
				FaceNormal.cameraZ = var2;
			}
		}

	} // L: 3946
}
