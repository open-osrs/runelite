import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class8 implements Callable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 880738975
	)
	static int field45;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("du")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	final Buffer field48;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class12 field44;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;Lkx;La;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1; // L: 47
		this.field48 = var2; // L: 48
		this.field44 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field44.vmethod120(this.field48); // L: 53
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1606674389"
	)
	static void method88() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 245
			Login.currentLoginField = 1; // L: 246
		} else {
			Login.currentLoginField = 0; // L: 249
		}

	} // L: 251

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1683075564"
	)
	static final void method90() {
		if (Client.logoutTimer > 0) { // L: 2639
			SecureRandomCallable.logOut(); // L: 2640
		} else {
			Client.timer.method5206(); // L: 2643
			ItemContainer.updateGameState(40); // L: 2644
			UserComparator6.field2008 = Client.packetWriter.getSocket(); // L: 2645
			Client.packetWriter.removeSocket(); // L: 2646
		}
	} // L: 2641 2647
}
