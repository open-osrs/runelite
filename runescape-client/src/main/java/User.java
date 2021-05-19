import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	} // L: 7

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)I",
		garbageValue = "88"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username); // L: 30
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lla;",
		garbageValue = "2109048413"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 10
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1818372907"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 14 15
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1375714428"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 19 20
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;I)V",
		garbageValue = "-2074973533"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 24
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 25
			this.previousUsername = var2; // L: 26
		}
	} // L: 27

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1); // L: 34
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "-109"
	)
	@Export("isWriteable")
	static boolean isWriteable(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 239
			int var3 = var2.read(); // L: 240
			var2.seek(0L); // L: 241
			var2.write(var3); // L: 242
			var2.seek(0L); // L: 243
			var2.close(); // L: 244
			if (var1) { // L: 245
				var0.delete();
			}

			return true; // L: 246
		} catch (Exception var4) { // L: 248
			return false; // L: 249
		}
	}
}
