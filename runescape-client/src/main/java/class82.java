import java.awt.Component;
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class82 {
	@ObfuscatedName("h")
	static final BigInteger field986;
	@ObfuscatedName("c")
	static final BigInteger field987;

	static {
		field986 = new BigInteger("10001", 16); // L: 6
		field987 = new BigInteger("88d2b28e43dc7be8f2376826a6d810274f07f489daf46f3fc0a40ad847e6c852b10e6939d9252721d4fb8501cf1348cdabec4165b62bd8aa0dbe6ed0394524dfe2cdce9287df5cbedb0d33bc1d9df71cb2e5c67a5d05fa058b182a192ad83fa80b8ff245b45500dce1f746b9a14db36d711c889f35183243d5805cd875580975", 16); // L: 7
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-209248744"
	)
	static void method1946(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 150
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 151
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 152
	} // L: 153
}
