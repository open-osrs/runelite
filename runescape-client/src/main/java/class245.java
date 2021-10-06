import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class245 {
	@ObfuscatedName("l")
	static int[] field2899;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;

	static {
		new Object();
		field2899 = new int[33];
		field2899[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2899[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-1547455637"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146798091"
	)
	static final void method4681() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.method2127();
		}

	}
}
