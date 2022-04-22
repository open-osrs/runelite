import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4556;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4550;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4552;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4551;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4548;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4554;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static final LoginType field4553;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static final LoginType field4555;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 475165021
	)
	final int field4557;
	@ObfuscatedName("r")
	final String field4558;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field4556 = new LoginType(5, 1, "", ""); // L: 6
		field4550 = new LoginType(4, 2, "", ""); // L: 7
		field4552 = new LoginType(2, 3, "", ""); // L: 8
		field4551 = new LoginType(8, 4, "", ""); // L: 9
		field4548 = new LoginType(1, 5, "", ""); // L: 10
		field4554 = new LoginType(6, 6, "", ""); // L: 11
		field4553 = new LoginType(3, 7, "", ""); // L: 12
		field4555 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4556, field4550, field4551, field4552}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4557 = var1; // L: 18
		this.field4558 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpe;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4557 = var1; // L: 23
		this.field4558 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4558; // L: 28
	}
}
