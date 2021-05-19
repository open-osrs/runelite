import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 7166595
	)
	static int field1522;

	Clock() {
	} // L: 4

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109522039"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "665432073"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Lhm;",
		garbageValue = "5230"
	)
	public static PacketBufferNode method2590() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lee;",
		garbageValue = "-74631623"
	)
	public static Clock method2597() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1967334125"
	)
	public static String method2592(String var0) {
		int var1 = var0.length(); // L: 163
		char[] var2 = new char[var1]; // L: 164
		byte var3 = 2; // L: 165

		for (int var4 = 0; var4 < var1; ++var4) { // L: 166
			char var5 = var0.charAt(var4); // L: 167
			if (var3 == 0) { // L: 168
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 169
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 172
					var6 = Character.toTitleCase(var5); // L: 176
				} else {
					var6 = var5; // L: 173
				}

				var5 = var6; // L: 178
			}

			if (Character.isLetter(var5)) { // L: 180
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 181
				if (Character.isSpaceChar(var5)) { // L: 182
					if (var3 != 2) { // L: 183
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 185
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 186
		}

		return new String(var2); // L: 188
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2056453136"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UserComparator8.loadInterface(var0)) { // L: 10463
			class32.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10464
		}
	} // L: 10465

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1034595766"
	)
	static void method2583() {
		if (class18.field154 != null) { // L: 11774
			Client.field687 = Client.cycle; // L: 11775
			class18.field154.method5048(); // L: 11776

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11777
				if (Client.players[var0] != null) { // L: 11778
					class18.field154.method5037((Client.players[var0].x >> 7) + JagexCache.baseX, (Client.players[var0].y >> 7) + Messages.baseY); // L: 11779
				}
			}
		}

	} // L: 11783
}
