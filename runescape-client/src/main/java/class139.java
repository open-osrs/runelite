import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
public class class139 extends class132 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[[Ljd;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("n")
	String field1531;
	@ObfuscatedName("c")
	byte field1530;
	@ObfuscatedName("m")
	byte field1535;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class139(class133 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "3602154"
	)
	void vmethod2703(Buffer var1) {
		this.field1531 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1531 != null) {
			var1.readUnsignedByte();
			this.field1530 = var1.readByte();
			this.field1535 = var1.readByte();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "66"
	)
	void vmethod2702(ClanChannel var1) {
		var1.name = this.field1531;
		if (this.field1531 != null) {
			var1.field1518 = this.field1530;
			var1.field1513 = this.field1535;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V",
		garbageValue = "924136685"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		Skeleton.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Loq;I)V",
		garbageValue = "181174358"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class54.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1928008426"
	)
	static int method2708(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = PacketWriter.method2358(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class10.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class240.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class280.method5081(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = GrandExchangeOffer.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class391.Client_plane;
					var4 = (class129.localPlayer.x >> 7) + FloorOverlayDefinition.baseX;
					var5 = (class129.localPlayer.y >> 7) + class320.baseY;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class240.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = PacketWriter.method2358(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class240.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class10.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class240.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class280.method5081(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class240.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.field494;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = Client.field675;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
