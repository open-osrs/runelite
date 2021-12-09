import java.awt.Image;
import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
class class18 implements Comparator {
	@ObfuscatedName("av")
	static Image field97;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 40
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "661952074"
	)
	int method294(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 42
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	public int compare(Object var1, Object var2) {
		return this.method294((Entry)var1, (Entry)var2); // L: 46
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-1896200601"
	)
	public static FloorOverlayDefinition method302(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfp;",
		garbageValue = "28"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class17.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field743) { // L: 4341
			StructComposition.method3444(); // L: 4342
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && SecureRandomFuture.clientPreferences.musicVolume != 0 && !Client.field743) { // L: 4344
			Archive var1 = WorldMapScaleHandler.archive6; // L: 4345
			int var2 = SecureRandomFuture.clientPreferences.musicVolume; // L: 4346
			class260.musicPlayerStatus = 1; // L: 4348
			class124.musicTrackArchive = var1; // L: 4349
			VarcInt.musicTrackGroupId = var0; // L: 4350
			class260.musicTrackFileId = 0; // L: 4351
			ChatChannel.musicTrackVolume = var2; // L: 4352
			DynamicObject.musicTrackBoolean = false; // L: 4353
			class260.pcmSampleLength = 2; // L: 4354
		}

		Client.currentTrackGroupId = var0; // L: 4357
	} // L: 4358

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1637898710"
	)
	static final void method293(Actor var0) {
		if (var0.field1157 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > UserComparator5.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4810
			int var1 = var0.field1157 - var0.field1136; // L: 4811
			int var2 = Client.cycle - var0.field1136; // L: 4812
			int var3 = var0.field1120 * 64 + var0.field1132 * 128; // L: 4813
			int var4 = var0.field1120 * 64 + var0.field1134 * 128; // L: 4814
			int var5 = var0.field1120 * 64 + var0.field1133 * 128; // L: 4815
			int var6 = var0.field1120 * 64 + var0.field1135 * 128; // L: 4816
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1; // L: 4817
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1; // L: 4818
		}

		var0.field1117 = 0; // L: 4820
		var0.orientation = var0.field1138; // L: 4821
		var0.rotation = var0.orientation; // L: 4822
	} // L: 4823

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1056239746"
	)
	static final void method297(int var0, int var1, int var2, boolean var3) {
		if (class242.loadInterface(var0)) { // L: 10935
			class92.resizeInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10936
		}
	} // L: 10937
}
