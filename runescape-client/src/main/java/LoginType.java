import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4221;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4226;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4222;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4223;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4224;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4225;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static final LoginType field4228;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public static final LoginType field4227;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1281565655
	)
	final int field4229;
	@ObfuscatedName("y")
	final String field4220;

	static {
		oldscape = new LoginType(8, 0, "", "");
		field4221 = new LoginType(3, 1, "", "");
		field4226 = new LoginType(5, 2, "", "");
		field4222 = new LoginType(2, 3, "", "");
		field4223 = new LoginType(0, 4, "", "");
		field4224 = new LoginType(6, 5, "", "");
		field4225 = new LoginType(7, 6, "", "");
		field4228 = new LoginType(1, 7, "", "");
		field4227 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field4221, field4226, field4223, field4222});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4229 = var1;
		this.field4220 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lny;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4229 = var1;
		this.field4220 = var4;
	}

	public String toString() {
		return this.field4220;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "0"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label84: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label84;
					}

					if (var7 == '+') {
						break label84;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}
}
