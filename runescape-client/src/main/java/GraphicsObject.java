import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1439234169
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1478236205
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -242268233
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 857822113
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 998647145
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1200688575
	)
	@Export("z")
	int z;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -250349479
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1301659841
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("r")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0;
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = class6.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18366"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3827()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class6.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Lcp;",
		garbageValue = "-18"
	)
	static class83[] method1866() {
		return new class83[]{class83.field1075, class83.field1078, class83.field1077, class83.field1074, class83.field1081, class83.field1076}; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;S)Z",
		garbageValue = "4749"
	)
	static boolean method1864(Date var0) {
		Date var1 = class250.method5137(); // L: 1246
		return var0.after(var1); // L: 1247
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1790654907"
	)
	static int method1865(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field842 - 7.0D) * 256.0D); // L: 3841
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lcw;IILgv;B)V",
		garbageValue = "2"
	)
	static final void method1860(Player var0, int var1, int var2, class193 var3) {
		int var4 = var0.pathX[0]; // L: 7995
		int var5 = var0.pathY[0]; // L: 7996
		int var6 = var0.transformedSize(); // L: 7997
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 7998
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 7999
				int var7 = ArchiveLoader.method2075(var4, var5, var0.transformedSize(), WorldMapSectionType.method4954(var1, var2), Client.collisionMaps[var0.plane], true, Client.field743, Client.field670); // L: 8000
				if (var7 >= 1) { // L: 8001
					for (int var8 = 0; var8 < var7 - 1; ++var8) { // L: 8002
						var0.method2149(Client.field743[var8], Client.field670[var8], var3);
					}

				}
			}
		}
	} // L: 8003

	public GraphicsObject() {
	}
}
