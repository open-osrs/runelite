import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class20 implements Callable {
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -943773093
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1799052417
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class10 field110;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lg;Lo;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field110 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field110.method105()) {
				Bounds.method6608(10L);
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field110.method106();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-76614425"
	)
	public static boolean method332(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1917740045"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		SecureRandomFuture.clientPreferences.soundEffectsVolume = var0;
		class127.savePreferences();
	}
}
