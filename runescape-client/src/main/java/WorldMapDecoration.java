import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("az")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 573803167
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 502095041
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -81694959
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	static void method428(int var0) {
		Login.loginIndex = 12; // L: 1560
		Login.field1216 = var0; // L: 1561
	} // L: 1562

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-1847675306"
	)
	static int method429(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1705
			MilliClock.Interpreter_intStackSize -= 3; // L: 1706
			KitDefinition.queueSoundEffect(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]); // L: 1707
			return 1; // L: 1708
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1710
			Messages.playSong(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 1711
			return 1; // L: 1712
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1714
			MilliClock.Interpreter_intStackSize -= 2; // L: 1715
			Projectile.playSoundJingle(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]); // L: 1716
			return 1; // L: 1717
		} else {
			return 2; // L: 1719
		}
	}
}
