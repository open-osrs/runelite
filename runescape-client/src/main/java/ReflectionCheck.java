import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 445083465
	)
	@Export("id")
	int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -580526265
	)
	@Export("size")
	int size;
	@ObfuscatedName("v")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("j")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("l")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("n")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("w")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("f")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)V",
		garbageValue = "152789303"
	)
	static final void method848(Actor var0) {
		if (var0.field1074 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) {
					int var2 = var0.x - ((Actor)var1).x;
					int var3 = var0.y - ((Actor)var1).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1048 != -1 && (var0.pathLength == 0 || var0.field1078 > 0)) {
				var0.orientation = var0.field1048;
				var0.field1048 = -1;
			}

			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1072;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= var0.field1074;
					var6 = true;
					if (var4 < var0.field1074 || var4 > 2048 - var0.field1074) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1072 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1074;
					var6 = true;
					if (var4 < var0.field1074 || var4 > 2048 - var0.field1074) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1072 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1072 = 0;
			}

		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1463309122"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
