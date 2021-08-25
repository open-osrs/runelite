import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1458734241
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 103968405
	)
	@Export("size")
	int size;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("k")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("o")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("g")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("z")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("a")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Loq;I)I",
		garbageValue = "1889594839"
	)
	static int method1083(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "582100101"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field705 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class12.getWindowedMode() == 1) {
			ArchiveDiskActionHandler.client.setMaxCanvasSize(765, 503);
		} else {
			ArchiveDiskActionHandler.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			class280.method5087();
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1578328144"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ParamComposition.getWidgetChild(WorldMapEvent.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class139.runScriptEvent(var1);
			}

			Client.field645 = -1;
			Client.isSpellSelected = false;
			Actor.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)V",
		garbageValue = "217128382"
	)
	static final void method1082(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field755 == -1) {
				Client.field755 = var0.spriteId2;
				Client.field756 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field755;
			} else {
				var0.spriteId2 = Client.field756;
			}

		} else if (var1 == 325) {
			if (Client.field755 == -1) {
				Client.field755 = var0.spriteId2;
				Client.field756 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field756;
			} else {
				var0.spriteId2 = Client.field755;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
