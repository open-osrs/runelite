import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("s")
	@Export("args")
	Object[] args;
	@ObfuscatedName("t")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -721069241
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1085248063
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 119023005
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1436810095
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1067398595
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("x")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 372026329
	)
	int field961;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1624043465
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-28"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-38"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1503065357"
	)
	static void method1809(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method1809(var0, var1, var2, var5 - 1);
			method1809(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "467893323"
	)
	static int method1807() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field682;
		} else {
			return 10000;
		}
	}
}
