import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4071;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4063;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4064;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4065;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4066;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4067;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final LoginType field4069;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final LoginType field4061;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1603045389
	)
	final int field4070;
	@ObfuscatedName("e")
	final String field4068;

	static {
		oldscape = new LoginType(8, 0, "", ""); // L: 5
		field4071 = new LoginType(4, 1, "", ""); // L: 6
		field4063 = new LoginType(7, 2, "", ""); // L: 7
		field4064 = new LoginType(0, 3, "", ""); // L: 8
		field4065 = new LoginType(2, 4, "", ""); // L: 9
		field4066 = new LoginType(6, 5, "", ""); // L: 10
		field4067 = new LoginType(3, 6, "", ""); // L: 11
		field4069 = new LoginType(1, 7, "", ""); // L: 12
		field4061 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4071, field4063, field4065, field4064}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4070 = var1; // L: 18
		this.field4068 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lmc;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4070 = var1; // L: 23
		this.field4068 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4068; // L: 28
	}
}
