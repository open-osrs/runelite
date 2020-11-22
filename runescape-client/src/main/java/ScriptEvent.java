import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("mapMarkerSprites")
	static Sprite[] mapMarkerSprites;
	@ObfuscatedName("f")
	@Export("args")
	Object[] args;
	@ObfuscatedName("b")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2101178453
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 405456203
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 88513801
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 303757317
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -844549747
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("t")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1420605637
	)
	int field600;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1188452695
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;S)V",
		garbageValue = "31204"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-370918947"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lje;",
		garbageValue = "-32"
	)
	@Export("getObjectDefinition")
	public static ObjectDefinition getObjectDefinition(int var0) {
		ObjectDefinition var1 = (ObjectDefinition)ObjectDefinition.ObjectDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = ObjectDefinition.ObjectDefinition_archive.takeFile(6, var0); // L: 74
			var1 = new ObjectDefinition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			if (var1.isSolid) { // L: 79
				var1.interactType = 0; // L: 80
				var1.boolean1 = false; // L: 81
			}

			ObjectDefinition.ObjectDefinition_cached.put(var1, (long)var0); // L: 83
			return var1; // L: 84
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lir;",
		garbageValue = "2092789749"
	)
	static VerticalAlignment[] method1279() {
		return new VerticalAlignment[]{VerticalAlignment.field3223, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field3226}; // L: 14
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "2033153348"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	static void method1282() {
		if (Client.oculusOrbState == 1) { // L: 11669
			Client.field725 = true; // L: 11670
		}

	} // L: 11672
}
