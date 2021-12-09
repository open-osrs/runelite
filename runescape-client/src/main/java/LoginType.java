import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4397;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4402;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4399;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4401;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4407;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4403;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final LoginType field4404;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static final LoginType field4405;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1619896025
	)
	final int field4406;
	@ObfuscatedName("o")
	final String field4400;

	static {
		oldscape = new LoginType(6, 0, "", ""); // L: 5
		field4397 = new LoginType(1, 1, "", ""); // L: 6
		field4402 = new LoginType(8, 2, "", ""); // L: 7
		field4399 = new LoginType(7, 3, "", ""); // L: 8
		field4401 = new LoginType(4, 4, "", ""); // L: 9
		field4407 = new LoginType(5, 5, "", ""); // L: 10
		field4403 = new LoginType(2, 6, "", ""); // L: 11
		field4404 = new LoginType(0, 7, "", ""); // L: 12
		field4405 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4397, field4402, field4401, field4399}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4406 = var1; // L: 18
		this.field4400 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Low;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4406 = var1; // L: 23
		this.field4400 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4400; // L: 29
	}
}
