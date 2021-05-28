import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class6 extends class14 {
	@ObfuscatedName("bs")
	static String field58;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1126650753
	)
	int field60;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 910283143
	)
	int field59;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field60 = var1.readInt(); // L: 274
		this.field59 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method157(this.field60, this.field59); // L: 279
	} // L: 280

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lew;",
		garbageValue = "1647125333"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjv;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-908016568"
	)
	public static void method60(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2); // L: 44
		int var7 = var1.getFileId(var6, var3); // L: 45
		Canvas.method395(var0, var1, var6, var7, var4, var5); // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1691185672"
	)
	public static String method67(CharSequence var0) {
		int var2 = var0.length(); // L: 166
		char[] var3 = new char[var2]; // L: 168

		for (int var4 = 0; var4 < var2; ++var4) { // L: 169
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 170
		return var1; // L: 172
	}
}
