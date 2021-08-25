import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4198;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4200;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4204;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4197;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4201;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4203;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4202;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	public static final LoginType field4199;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1416488303
	)
	final int field4206;
	@ObfuscatedName("l")
	final String field4207;

	static {
		oldscape = new LoginType(1, 0, "", "");
		field4198 = new LoginType(3, 1, "", "");
		field4200 = new LoginType(6, 2, "", "");
		field4204 = new LoginType(5, 3, "", "");
		field4197 = new LoginType(7, 4, "", "");
		field4201 = new LoginType(4, 5, "", "");
		field4203 = new LoginType(2, 6, "", "");
		field4202 = new LoginType(0, 7, "", "");
		field4199 = new LoginType(8, -1, "", "", true, new LoginType[]{oldscape, field4198, field4200, field4197, field4204});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4206 = var1;
		this.field4207 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lnf;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4206 = var1;
		this.field4207 = var4;
	}

	public String toString() {
		return this.field4207;
	}
}
