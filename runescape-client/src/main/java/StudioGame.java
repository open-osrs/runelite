import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jl")
@Implements("StudioGame")
public enum StudioGame implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("m")
	@Export("name")
	public final String name;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 698335859
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 17
		this.id = var5; // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)Z",
		garbageValue = "14714"
	)
	static boolean method4982(String var0, int var1) {
		return HealthBarUpdate.method2284(var0, var1, "openjs"); // L: 55
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "1"
	)
	static int method4983(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1824
			ChatChannel.Interpreter_intStackSize -= 3; // L: 1825
			ClanSettings.queueSoundEffect(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]); // L: 1826
			return 1; // L: 1827
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1829
			class6.playSong(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1830
			return 1; // L: 1831
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1833
			ChatChannel.Interpreter_intStackSize -= 2; // L: 1834
			ReflectionCheck.method1230(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 1835
			return 1; // L: 1836
		} else {
			int var3;
			if (var0 == 3203) { // L: 1838
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100); // L: 1839
				class0.method0(Math.round(2.55F * (float)var3)); // L: 1840
				return 1; // L: 1841
			} else if (var0 == 3204) { // L: 1843
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.musicVolume / 2.55F); // L: 1844
				return 1; // L: 1845
			} else if (var0 == 3205) { // L: 1847
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100); // L: 1848
				class226.updateSoundEffectVolume(Math.round((float)var3 * 1.27F)); // L: 1849
				return 1; // L: 1850
			} else if (var0 == 3206) { // L: 1852
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.soundEffectsVolume / 1.27F); // L: 1853
				return 1; // L: 1854
			} else if (var0 == 3207) { // L: 1856
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100); // L: 1857
				NPCComposition.method2882(Math.round(1.27F * (float)var3)); // L: 1858
				return 1; // L: 1859
			} else if (var0 == 3208) { // L: 1861
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1862
				return 1; // L: 1863
			} else {
				return 2; // L: 1865
			}
		}
	}
}
