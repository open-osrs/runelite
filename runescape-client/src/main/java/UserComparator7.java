import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("e")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)I",
		garbageValue = "52692374"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;B)V",
		garbageValue = "110"
	)
	public static void method2463(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;B)V",
		garbageValue = "9"
	)
	static void method2470(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class351.JagexCache_locationFile, "rw", 10000L); // L: 188
			Buffer var3 = new Buffer(500); // L: 189
			var3.writeByte(3); // L: 190
			var3.writeByte(var1 != null ? 1 : 0); // L: 191
			var3.writeCESU8(var0.getPath()); // L: 192
			if (var1 != null) {
				var3.writeCESU8(""); // L: 193
			}

			var2.write(var3.array, 0, var3.offset); // L: 194
			var2.close(); // L: 195
		} catch (IOException var4) { // L: 197
			var4.printStackTrace(); // L: 198
		}

	} // L: 200

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1682455199"
	)
	static boolean method2466() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10618
	}
}
