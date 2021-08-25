import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 51057949
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2014758033
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 410802803
	)
	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1412816001
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lhc;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "-55"
	)
	public static Object method4476(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "565732010"
	)
	public static String method4478(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = WorldMapSection2.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkk;III)Z",
		garbageValue = "-2096302175"
	)
	public static boolean method4477(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class28.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Lci;",
		garbageValue = "18289"
	)
	static final InterfaceParent method4475(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class18.Widget_resetModelFrames(var1);
		Widget var4 = class87.getWidget(var0);
		Actor.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			Actor.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		PendingSpawn.method2119();
		VerticalAlignment.revalidateWidgetScroll(class139.Widget_interfaceComponents[var0 >> 16], var4, false);
		UserComparator7.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class13.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
