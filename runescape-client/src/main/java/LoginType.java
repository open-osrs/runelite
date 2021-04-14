import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4088;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4085;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4084;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4087;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4094;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4089;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final LoginType field4091;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final LoginType field4086;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1665967971
	)
	final int field4092;
	@ObfuscatedName("l")
	final String field4093;

	static {
		oldscape = new LoginType(0, 0, "", ""); // L: 5
		field4088 = new LoginType(8, 1, "", ""); // L: 6
		field4085 = new LoginType(6, 2, "", ""); // L: 7
		field4084 = new LoginType(2, 3, "", ""); // L: 8
		field4087 = new LoginType(4, 4, "", ""); // L: 9
		field4094 = new LoginType(1, 5, "", ""); // L: 10
		field4089 = new LoginType(3, 6, "", ""); // L: 11
		field4091 = new LoginType(7, 7, "", ""); // L: 12
		field4086 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4088, field4085, field4087, field4084}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4092 = var1; // L: 18
		this.field4093 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lmf;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4092 = var1; // L: 23
		this.field4093 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4093; // L: 28
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lhu;IIIIIII)V",
		garbageValue = "14464839"
	)
	static final void method6344(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field669) { // L: 10031
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10032
		}

		Client.field669 = false; // L: 10033
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10034
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10035
				var0.scrollY -= 4; // L: 10036
				class29.invalidateWidget(var0); // L: 10037
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10039
				var0.scrollY += 4; // L: 10040
				class29.invalidateWidget(var0); // L: 10041
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10043
				var7 = var3 * (var3 - 32) / var4; // L: 10044
				if (var7 < 8) { // L: 10045
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10046
				int var9 = var3 - 32 - var7; // L: 10047
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10048
				class29.invalidateWidget(var0); // L: 10049
				Client.field669 = true; // L: 10050
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10053
			var7 = var0.width; // L: 10054
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10055
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10056
				class29.invalidateWidget(var0); // L: 10057
			}
		}

	} // L: 10060
}
