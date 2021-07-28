import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4114;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4115;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4116;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4117;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4118;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4120;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	static final LoginType field4119;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	public static final LoginType field4121;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 29529207
	)
	final int field4113;
	@ObfuscatedName("r")
	final String field4123;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field4114 = new LoginType(2, 1, "", "");
		field4115 = new LoginType(4, 2, "", "");
		field4116 = new LoginType(8, 3, "", "");
		field4117 = new LoginType(1, 4, "", "");
		field4118 = new LoginType(0, 5, "", "");
		field4120 = new LoginType(5, 6, "", "");
		field4119 = new LoginType(6, 7, "", "");
		field4121 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4114, field4115, field4117, field4116});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4113 = var1;
		this.field4123 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lnf;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4113 = var1;
		this.field4123 = var4;
	}

	public String toString() {
		return this.field4123;
	}
}
