import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "345512591"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-837141414"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljn;",
		garbageValue = "-1793250808"
	)
	@Export("getNpcDefinition")
	public static NPCDefinition getNpcDefinition(int var0) {
		NPCDefinition var1 = (NPCDefinition)NPCDefinition.NpcDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1;
		} else {
			byte[] var2 = NPCDefinition.NpcDefinition_archive.takeFile(9, var0); // L: 59
			var1 = new NPCDefinition(); // L: 60
			var1.id = var0; // L: 61
			if (var2 != null) { // L: 62
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 63
			NPCDefinition.NpcDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 183
			if (KeyHandler.field428 == KeyHandler.field415) { // L: 184
				return false;
			} else {
				SecureRandomCallable.field555 = KeyHandler.field425[KeyHandler.field415]; // L: 185
				WorldMapManager.field335 = KeyHandler.field424[KeyHandler.field415]; // L: 186
				KeyHandler.field415 = KeyHandler.field415 + 1 & 127; // L: 187
				return true; // L: 188
			}
		}
	}
}
