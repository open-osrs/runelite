import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class136 extends class144 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 108140015
	)
	static int field1612;
	@ObfuscatedName("m")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1682759161
	)
	int field1615;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1615 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "355261812"
	)
	void vmethod3137(Buffer var1) {
		this.field1615 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "1368590037"
	)
	void vmethod3138(ClanChannel var1) {
		var1.removeMember(this.field1615); // L: 96
	} // L: 97

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1973466779"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class174.World_request == null) { // L: 31
				class174.World_request = class138.urlRequester.request(new URL(Client.field481));
			} else if (class174.World_request.isDone()) { // L: 33
				byte[] var0 = class174.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class362.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class362.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				MouseRecorder.sortWorlds(class362.World_worlds, 0, class362.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class174.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class174.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "695321125"
	)
	public static int method2923(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}
}
