import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4070;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4066;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4073;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4068;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4069;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4071;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static final LoginType field4064;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public static final LoginType field4072;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -434232697
	)
	final int field4067;
	@ObfuscatedName("u")
	final String field4074;

	static {
		oldscape = new LoginType(0, 0, "", "");
		field4070 = new LoginType(3, 1, "", "");
		field4066 = new LoginType(1, 2, "", "");
		field4073 = new LoginType(7, 3, "", "");
		field4068 = new LoginType(6, 4, "", "");
		field4069 = new LoginType(2, 5, "", "");
		field4071 = new LoginType(4, 6, "", "");
		field4064 = new LoginType(5, 7, "", "");
		field4072 = new LoginType(8, -1, "", "", true, new LoginType[]{oldscape, field4070, field4066, field4068, field4073});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4067 = var1;
		this.field4074 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lmu;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4067 = var1;
		this.field4074 = var4;
	}

	public String toString() {
		return this.field4074;
	}
}
