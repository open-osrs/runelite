import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class54 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1918136037
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive20")
	static Archive archive20;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2001"
	)
	static final void method1055() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == VertexNormal.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field536);
					if (var0.isFinished) {
						var0.remove();
					} else {
						PlayerComposition.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1736232978"
	)
	static final String method1057(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
