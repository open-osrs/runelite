import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class20 implements Callable {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1667881213
	)
	static int field103;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 field104;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;Ly;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field104 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field104.method94()) {
				class121.method2542(10L);
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field104.method98();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "846387799"
	)
	static final int method303(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Clock.method2867(var3, var5);
		int var8 = Clock.method2867(var3 + 1, var5);
		int var9 = Clock.method2867(var3, var5 + 1);
		int var10 = Clock.method2867(var3 + 1, var5 + 1);
		int var11 = class157.method2986(var7, var8, var4, var2);
		int var12 = class157.method2986(var9, var10, var4, var2);
		return class157.method2986(var11, var12, var6, var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "996219685"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		class112.method2474(2);
		if (var0) {
			Login.Login_password = "";
		}

		Login.method1930();
		class14.method175();
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "935368725"
	)
	static final void method302() {
		if (Client.logoutTimer > 0) {
			AttackOption.logOut();
		} else {
			Client.timer.method5904();
			UserList.updateGameState(40);
			PendingSpawn.field1101 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
