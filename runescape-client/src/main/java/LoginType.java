import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4612;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4610;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4615;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4611;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4613;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4614;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	static final LoginType field4609;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	public static final LoginType field4616;
	@ObfuscatedName("gl")
	static int[] field4619;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2054125157
	)
	final int field4617;
	@ObfuscatedName("y")
	final String field4618;

	static {
		oldscape = new LoginType(3, 0, "", ""); // L: 5
		field4612 = new LoginType(1, 1, "", ""); // L: 6
		field4610 = new LoginType(2, 2, "", ""); // L: 7
		field4615 = new LoginType(4, 3, "", ""); // L: 8
		field4611 = new LoginType(6, 4, "", ""); // L: 9
		field4613 = new LoginType(0, 5, "", ""); // L: 10
		field4614 = new LoginType(8, 6, "", ""); // L: 11
		field4609 = new LoginType(7, 7, "", ""); // L: 12
		field4616 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4612, field4610, field4611, field4615}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4617 = var1; // L: 18
		this.field4618 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpj;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4617 = var1; // L: 23
		this.field4618 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4618; // L: 29
	}
}
