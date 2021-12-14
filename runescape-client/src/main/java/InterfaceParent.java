import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1940404497
	)
	@Export("group")
	int group;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1832869839
	)
	@Export("type")
	int type;
	@ObfuscatedName("p")
	boolean field1014;

	InterfaceParent() {
		this.field1014 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "-1043204065"
	)
	public static void method2145(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfl;",
		garbageValue = "-64"
	)
	public static FloorUnderlayDefinition method2144(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1442239396"
	)
	public static void method2143() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("kw")
	static final void method2142(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		VerticalAlignment.method3338();
		SecureRandomFuture.clientPreferences.brightness = var0;
		class127.savePreferences();
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-2059094026"
	)
	static String method2146(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class1.field3 != null) {
			var3 = "/p=" + class1.field3;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + ScriptFrame.clientLanguage + "/a=" + FriendLoginUpdate.field4096 + var3 + "/";
	}
}
