import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class113 extends class103 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1690465903
	)
	int field1356;
	@ObfuscatedName("t")
	String field1355;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class113(class106 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1356 = var1.readInt();
		this.field1355 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2377(this.field1356, this.field1355);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lnf;I)Ljava/lang/String;",
		garbageValue = "-82208438"
	)
	public static String method2347(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var10 = var3 - var2;
			if (var10 >= 1 && var10 <= class346.method6099(var1)) {
				StringBuilder var9 = new StringBuilder(var10);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (AbstractWorldMapIcon.method3714(var7)) {
						char var8 = DevicePcmPlayerProvider.method109(var7);
						if (var8 != 0) {
							var9.append(var8);
						}
					}
				}

				if (var9.length() == 0) {
					return null;
				} else {
					return var9.toString();
				}
			} else {
				return null;
			}
		}
	}
}
