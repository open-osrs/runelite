import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Low;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 13
		this.loginType = var1; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "2"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 19
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmv;",
		garbageValue = "-813912346"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 24
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-2139408560"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 28
				int var3 = var1.readUnsignedByte(); // L: 29
				boolean var4 = (var3 & 1) == 1; // L: 30
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 31
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 32
				var1.readStringCp1252NullTerminated(); // L: 33
				if (var5 != null && var5.hasCleanName()) { // L: 34
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 35
					if (var4) { // L: 36
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 37
						if (var8 != null && var8 != var7) { // L: 38
							if (var7 != null) { // L: 39
								this.remove(var8); // L: 40
							} else {
								var7 = var8; // L: 43
							}
						}
					}

					if (var7 != null) { // L: 47
						this.changeName(var7, var5, var6); // L: 48
						continue;
					}

					if (this.getSize() < 400) { // L: 50
						int var9 = this.getSize(); // L: 51
						var7 = (Ignored)this.addLast(var5, var6); // L: 52
						var7.id = var9; // L: 53
					}
					continue;
				}

				throw new IllegalStateException(); // L: 56
			}

			return; // L: 57
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;",
		garbageValue = "111"
	)
	static String method6267(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) { // L: 67
			RunException var2 = (RunException)var0; // L: 68
			var1 = var2.message + " | "; // L: 69
			var0 = var2.throwable; // L: 70
		} else {
			var1 = ""; // L: 72
		}

		StringWriter var12 = new StringWriter(); // L: 73
		PrintWriter var3 = new PrintWriter(var12); // L: 74
		var0.printStackTrace(var3); // L: 75
		var3.close(); // L: 76
		String var4 = var12.toString(); // L: 77
		BufferedReader var5 = new BufferedReader(new StringReader(var4)); // L: 78
		String var6 = var5.readLine(); // L: 79

		while (true) {
			while (true) {
				String var7 = var5.readLine(); // L: 81
				if (var7 == null) { // L: 82
					var1 = var1 + "| " + var6; // L: 100
					return var1; // L: 101
				}

				int var8 = var7.indexOf(40); // L: 83
				int var9 = var7.indexOf(41, var8 + 1); // L: 84
				if (var8 >= 0 && var9 >= 0) { // L: 85
					String var10 = var7.substring(var8 + 1, var9); // L: 86
					int var11 = var10.indexOf(".java:"); // L: 87
					if (var11 >= 0) { // L: 88
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5); // L: 89
						var1 = var1 + var10 + ' '; // L: 90
						continue; // L: 91
					}

					var7 = var7.substring(0, var8); // L: 93
				}

				var7 = var7.trim(); // L: 95
				var7 = var7.substring(var7.lastIndexOf(32) + 1); // L: 96
				var7 = var7.substring(var7.lastIndexOf(9) + 1); // L: 97
				var1 = var1 + var7 + ' '; // L: 98
			}
		}
	}
}
