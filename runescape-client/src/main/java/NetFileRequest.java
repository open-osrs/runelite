import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2064764775
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("q")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-612356648"
	)
	static boolean method4304(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		signature = "(IIIIIIIII)V",
		garbageValue = "-1145163576"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (UserComparator4.loadInterface(var0)) {
			class25.field124 = null;
			Tiles.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class25.field124 != null) {
				Tiles.drawInterface(class25.field124, -1412584499, var1, var2, var3, var4, Clock.field2092, Client.field950, var7);
				class25.field124 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field813[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field813[var8] = true;
				}
			}

		}
	}
}
