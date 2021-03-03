import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	} // L: 7

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "136255387"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1621767276"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-127"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1032488862"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-632113899"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field899) { // L: 3385
			ScriptEvent.method1272(); // L: 3386
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && WorldMapSectionType.clientPreferences.musicVolume != 0 && !Client.field899) { // L: 3388
			GrandExchangeOfferOwnWorldComparator.method1376(2, UrlRequester.archive6, var0, 0, WorldMapSectionType.clientPreferences.musicVolume, false); // L: 3389
		}

		Client.currentTrackGroupId = var0; // L: 3391
	} // L: 3392
}
