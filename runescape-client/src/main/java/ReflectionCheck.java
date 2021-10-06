import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "[Ljt;"
	)
	static Widget[] field452;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -960883055
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -947967161
	)
	@Export("size")
	int size;
	@ObfuscatedName("f")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("j")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("k")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("t")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("a")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1468113087"
	)
	static String method1064(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "-72"
	)
	static int method1063(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--AbstractByteArrayCopier.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1574145218"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ViewportMouse.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				ViewportMouse.runScriptEvent(var6);
			}

			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = class244.method4661(var5);
			}

			if (var8) {
				if (class138.method2756(WorldMapRegion.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2688, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 2) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2760, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 3) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2752, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 4) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2698, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 5) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2743, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 6) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2766, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 7) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2730, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 8) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 9) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2705, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 10) {
						var7 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2738, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

				}
			}
		}
	}
}
