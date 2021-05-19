import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4100;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4095;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4096;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4093;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4102;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4099;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static final LoginType field4094;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	public static final LoginType field4101;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1474668793
	)
	final int field4097;
	@ObfuscatedName("i")
	final String field4103;

	static {
		oldscape = new LoginType(0, 0, "", ""); // L: 5
		field4100 = new LoginType(7, 1, "", ""); // L: 6
		field4095 = new LoginType(8, 2, "", ""); // L: 7
		field4096 = new LoginType(1, 3, "", ""); // L: 8
		field4093 = new LoginType(2, 4, "", ""); // L: 9
		field4102 = new LoginType(4, 5, "", ""); // L: 10
		field4099 = new LoginType(5, 6, "", ""); // L: 11
		field4094 = new LoginType(3, 7, "", ""); // L: 12
		field4101 = new LoginType(6, -1, "", "", true, new LoginType[]{oldscape, field4100, field4095, field4093, field4096}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4097 = var1; // L: 18
		this.field4103 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lnj;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4097 = var1; // L: 23
		this.field4103 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4103; // L: 28
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "794068414"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (UserComparator8.loadInterface(var0)) { // L: 10942
			UserComparator5.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 10943
		}
	} // L: 10944
}
