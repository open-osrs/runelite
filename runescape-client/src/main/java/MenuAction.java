import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1383560021
	)
	public static int field982;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 38468049
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 871574221
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1494499467
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1225362571
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("l")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 11814

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lap;B)Lat;",
		garbageValue = "7"
	)
	public static class31 method1944(class34 var0) {
		switch(var0.field238) { // L: 9
		case 0:
			return new class28(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;I)Lof;",
		garbageValue = "48725768"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 122
		int var4 = var0.getFileId(var3, var2); // L: 123
		return SequenceDefinition.method3091(var0, var3, var4); // L: 124
	}
}
