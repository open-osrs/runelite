import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class13 extends class14 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 2060700822682065955L
	)
	long field129;
	@ObfuscatedName("n")
	String field128;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field129 = -1L; // L: 194
		this.field128 = null; // L: 195
	} // L: 197

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field129 = var1.readLong(); // L: 202
		}

		this.field128 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method106(this.field129, this.field128); // L: 208
	} // L: 209

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "-4"
	)
	public static void method180(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("n")
	public static double method182(double var0, double var2, double var4) {
		return MouseHandler.method620((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;I)V",
		garbageValue = "-1436949198"
	)
	static void method175(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1492
		Client.archiveLoaders.add(var2); // L: 1493
		Client.field916 += var2.groupCount; // L: 1494
	} // L: 1495

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIII)V",
		garbageValue = "425709195"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11206
		if (var4 != null) { // L: 11207
			if (Client.minimapState < 3) { // L: 11208
				NPCComposition.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11209
			}

		}
	} // L: 11210
}
