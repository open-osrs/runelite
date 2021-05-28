import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class23 extends class14 {
	@ObfuscatedName("u")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("au")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1071704973
	)
	int field199;
	@ObfuscatedName("n")
	byte field198;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field199 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field199 = var1.readUnsignedShort(); // L: 134
		this.field198 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(ClanSettings var1) {
		var1.method112(this.field199, this.field198); // L: 139
	} // L: 140

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Leg;",
		garbageValue = "-1295127026"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-686141430"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lio;IB)V",
		garbageValue = "-43"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3033 == null) { // L: 996
			throw new RuntimeException(); // L: 997
		} else {
			if (var0.field3012 == null) { // L: 999
				var0.field3012 = new int[var0.field3033.length]; // L: 1000
			}

			var0.field3012[var1] = Integer.MAX_VALUE; // L: 1002
		}
	} // L: 1003
}
