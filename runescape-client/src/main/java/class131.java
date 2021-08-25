import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class131 extends class116 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 8166807138723971967L
	)
	long field1494;
	@ObfuscatedName("c")
	String field1495;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -192832123
	)
	int field1493;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class131(class119 var1) {
		this.this$0 = var1;
		this.field1494 = -1L;
		this.field1495 = null;
		this.field1493 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1494 = var1.readLong();
		}

		this.field1495 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1493 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2559(this.field1494, this.field1495, this.field1493);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-71"
	)
	public static char method2647(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1458369433"
	)
	static void method2645() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (VarbitComposition.clientPreferences.rememberedUsername != null) {
				Login.Login_username = VarbitComposition.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
