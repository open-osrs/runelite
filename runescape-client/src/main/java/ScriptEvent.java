import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("c")
	@Export("args")
	Object[] args;
	@ObfuscatedName("l")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -858505837
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 126424841
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -210169861
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 24554727
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -42257657
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("a")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1380078595
	)
	int field1041;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -465756931
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "476436061"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1370467396"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "84"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4073) { // L: 98
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 99
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4074) { // L: 102
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 103
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4071) { // L: 106
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 107
		} else if (var0.length == 30000 && ByteArrayPool.field4072 < ByteArrayPool.field4076) { // L: 110
			ByteArrayPool.field4080[++ByteArrayPool.field4072 - 1] = var0; // L: 111
		} else {
			if (class113.ByteArrayPool_arrays != null) { // L: 114
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 115
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var1] < class113.ByteArrayPool_arrays[var1].length) { // L: 116
						class113.ByteArrayPool_arrays[var1][ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 117
						return; // L: 118
					}
				}
			}

		}
	} // L: 100 104 108 112 122

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "2021733791"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 84
		if (var3) { // L: 85
			var5 |= 65536L;
		}

		return var5; // L: 86
	}
}
