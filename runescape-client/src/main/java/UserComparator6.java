import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("aj")
	static String field1340;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1965177576"
	)
	static void method2513() {
		class300.field3765 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = SequenceDefinition.method3461((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F)); // L: 30
			class300.field3765[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < class300.field3765.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2; // L: 36

			for (int var4 = SequenceDefinition.method3461((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class300.field3765.length; ++var0) { // L: 37 38
				class300.field3765[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1996074579"
	)
	static void method2508(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "112"
	)
	public static int method2512(int var0) {
		return class361.field4047[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIB)V",
		garbageValue = "100"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11156
			if (var0 != null) { // L: 11158
				Widget var4 = BuddyRankComparator.method2501(var0); // L: 11161
				if (var4 == null) { // L: 11162
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11165
					Client.clickedWidget = var0; // L: 11169
					var4 = BuddyRankComparator.method2501(var0); // L: 11172
					if (var4 == null) { // L: 11173
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11176
					Client.widgetClickX = var1; // L: 11177
					Client.widgetClickY = var2; // L: 11178
					class134.widgetDragDuration = 0; // L: 11179
					Client.isDraggingWidget = false; // L: 11180
					int var6 = Client.menuOptionsCount - 1; // L: 11183
					if (var6 != -1) { // L: 11186
						class12.method170(var6);
					}

					return; // L: 11187
				}
			}

		}
	} // L: 11167

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1324364806"
	)
	static final void method2509() {
		Client.field681 = Client.cycleCntr; // L: 11799
		class29.field162 = true; // L: 11800
	} // L: 11801

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1910834630"
	)
	static void method2503(int var0) {
		if (var0 != Client.loginState) { // L: 12057
			Client.loginState = var0; // L: 12058
		}
	} // L: 12059
}
