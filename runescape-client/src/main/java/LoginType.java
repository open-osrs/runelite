import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4052;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4056;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4054;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4058;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4055;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4053;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	static final LoginType field4061;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	public static final LoginType field4059;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -138904115
	)
	final int field4060;
	@ObfuscatedName("w")
	final String field4051;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field4052 = new LoginType(2, 1, "", "");
		field4056 = new LoginType(6, 2, "", "");
		field4054 = new LoginType(8, 3, "", "");
		field4058 = new LoginType(1, 4, "", "");
		field4055 = new LoginType(4, 5, "", "");
		field4053 = new LoginType(0, 6, "", "");
		field4061 = new LoginType(3, 7, "", "");
		field4059 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4052, field4056, field4058, field4054});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4060 = var1;
		this.field4051 = var4;
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lmo;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4060 = var1;
		this.field4051 = var4;
	}

	public String toString() {
		return this.field4051;
	}
}
