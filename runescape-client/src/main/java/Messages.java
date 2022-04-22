import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("v")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1887673835
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static StudioGame field1305;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2020687752"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 1123
		Login.Login_response2 = "Enter your username/email & password."; // L: 1124
		Login.Login_response3 = ""; // L: 1125
		Ignored.method6828(2); // L: 1126
		if (var0) { // L: 1127
			Login.Login_password = "";
		}

		Players.method2421(); // L: 1128
		class12.method157(); // L: 1129
	} // L: 1130
}
