import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705512918"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-75"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1604537239"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "121"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "199608149"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1917773732"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4271
			if (class15.loadInterface(var0)) { // L: 4272
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 4273

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4274
					Widget var3 = var1[var2]; // L: 4275
					if (var3.onLoad != null) { // L: 4276
						ScriptEvent var4 = new ScriptEvent(); // L: 4277
						var4.widget = var3; // L: 4278
						var4.args = var3.onLoad; // L: 4279
						FaceNormal.runScript(var4, 5000000, 0); // L: 4280
					}
				}

			}
		}
	} // L: 4283
}
