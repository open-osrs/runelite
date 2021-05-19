import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final PrivateChatMode field3901;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final PrivateChatMode field3899;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final PrivateChatMode field3900;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -803781563
	)
	public final int field3898;

	static {
		field3901 = new PrivateChatMode(0); // L: 5
		field3899 = new PrivateChatMode(1); // L: 6
		field3900 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3898 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1851240875"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 31
				World.World_request = class19.urlRequester.request(new URL(Canvas.field291));
			} else if (World.World_request.isDone()) { // L: 33
				byte[] var0 = World.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				Messages.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = Messages.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				VarcInt.sortWorlds(Messages.World_worlds, 0, Messages.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				World.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			World.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public static void method5815() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 98
	} // L: 99
}
