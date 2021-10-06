import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class328 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-1815544161"
	)
	static final void method5930(Actor var0) {
		if (var0.field1146 != 0) {
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

			if (var0.field1134 != -1 && (var0.pathLength == 0 || var0.field1164 > 0)) {
				var0.orientation = var0.field1134;
				var0.field1134 = -1;
			}

			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1158;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= var0.field1146;
					var6 = true;
					if (var4 < var0.field1146 || var4 > 2048 - var0.field1146) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1158 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1146;
					var6 = true;
					if (var4 < var0.field1146 || var4 > 2048 - var0.field1146) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1158 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1158 = 0;
			}

		}
	}
}
