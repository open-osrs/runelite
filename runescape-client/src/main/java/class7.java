import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class7 {
	@ObfuscatedName("r")
	public static short[] field25;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 1371164037
	)
	static int field26;
	@ObfuscatedName("s")
	ExecutorService field21;
	@ObfuscatedName("t")
	Future field23;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	final Buffer field22;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class3 field24;

	@ObfuscatedSignature(
		descriptor = "(Lnv;Lj;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field21 = Executors.newSingleThreadExecutor();
		this.field22 = var1;
		this.field24 = var2;
		this.method48();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-112"
	)
	public boolean method46() {
		return this.field23.isDone();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2123329941"
	)
	public void method49() {
		this.field21.shutdown();
		this.field21 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lnv;",
		garbageValue = "-7"
	)
	public Buffer method57() {
		try {
			return (Buffer)this.field23.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	void method48() {
		this.field23 = this.field21.submit(new class1(this, this.field22, this.field24));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;IZS)Lga;",
		garbageValue = "192"
	)
	public static Frames method59(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lbd;",
		garbageValue = "-1744482328"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ApproximateRouteStrategy.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = ModelData0.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "768578281"
	)
	public static void method58() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1029296295"
	)
	static int method52(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--Interpreter.Interpreter_intStackSize;
			--class1.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "171958052"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		PcmPlayer.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
