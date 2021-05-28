import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4084;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4085;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4086;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4088;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4083;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4089;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static final LoginType field4087;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	public static final LoginType field4091;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1440229409
	)
	public final int field4092;
	@ObfuscatedName("u")
	final String field4093;

	static {
		oldscape = new LoginType(5, 0, "", ""); // L: 5
		field4084 = new LoginType(0, 1, "", ""); // L: 6
		field4085 = new LoginType(7, 2, "", ""); // L: 7
		field4086 = new LoginType(3, 3, "", ""); // L: 8
		field4088 = new LoginType(2, 4, "", ""); // L: 9
		field4083 = new LoginType(8, 5, "", ""); // L: 10
		field4089 = new LoginType(1, 6, "", ""); // L: 11
		field4087 = new LoginType(4, 7, "", ""); // L: 12
		field4091 = new LoginType(6, -1, "", "", true, new LoginType[]{oldscape, field4084, field4085, field4088, field4086}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4092 = var1; // L: 18
		this.field4093 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lnc;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4092 = var1; // L: 23
		this.field4093 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4093; // L: 28
	}
}
