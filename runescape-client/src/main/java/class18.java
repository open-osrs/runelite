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
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "661952074"
	)
	int method294(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method294((Entry)var1, (Entry)var2);
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

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfp;",
		garbageValue = "28"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class17.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field743) {
			StructComposition.method3444();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && SecureRandomFuture.clientPreferences.musicVolume != 0 && !Client.field743) {
			Archive var1 = WorldMapScaleHandler.archive6;
			int var2 = SecureRandomFuture.clientPreferences.musicVolume;
			class260.musicPlayerStatus = 1;
			class124.musicTrackArchive = var1;
			VarcInt.musicTrackGroupId = var0;
			class260.musicTrackFileId = 0;
			ChatChannel.musicTrackVolume = var2;
			DynamicObject.musicTrackBoolean = false;
			class260.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1637898710"
	)
	static final void method293(Actor var0) {
		if (var0.field1157 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > UserComparator5.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
			int var1 = var0.field1157 - var0.field1136;
			int var2 = Client.cycle - var0.field1136;
			int var3 = var0.field1120 * 64 + var0.field1132 * 128;
			int var4 = var0.field1120 * 64 + var0.field1134 * 128;
			int var5 = var0.field1120 * 64 + var0.field1133 * 128;
			int var6 = var0.field1120 * 64 + var0.field1135 * 128;
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1;
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1;
		}

		var0.field1117 = 0;
		var0.orientation = var0.field1138;
		var0.rotation = var0.orientation;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1056239746"
	)
	static final void method297(int var0, int var1, int var2, boolean var3) {
		if (class242.loadInterface(var0)) {
			class92.resizeInterface(MouseRecorder.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
