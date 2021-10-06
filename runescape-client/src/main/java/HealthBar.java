import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfs;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1577192016"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcp;",
		garbageValue = "-18"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "126"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5563();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfk;",
		garbageValue = "-359923658"
	)
	public static FloorUnderlayDefinition method2214(int var0) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "0"
	)
	static int method2220(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						NPCComposition var4 = class112.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
					return 1;
				}
			} else {
				--AbstractByteArrayCopier.Interpreter_intStackSize;
				return 1;
			}
		} else {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			--class54.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1149817369"
	)
	static void method2221() {
		if (Client.oculusOrbState == 1) {
			Client.field573 = true;
		}

	}
}
