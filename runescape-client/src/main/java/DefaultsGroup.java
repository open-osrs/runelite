import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static final DefaultsGroup field4363;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 44353579
	)
	@Export("group")
	final int group;

	static {
		field4363 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1365746841"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		MouseRecorder.logOut(); // L: 2923
		switch(var0) { // L: 2924
		case 1:
			WorldMapData_1.method4872(24); // L: 2936
			class101.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2937
			break;
		case 2:
			WorldMapData_1.method4872(24); // L: 2928
			class101.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2929
		}

	} // L: 2942
}
