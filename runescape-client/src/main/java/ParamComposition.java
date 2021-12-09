import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("p")
	@Export("type")
	char type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -871462947
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("t")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("s")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "630650762"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-46"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1961413058"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.type = class279.method5406(var1.readByte()); // L: 47
		} else if (var2 == 2) { // L: 49
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 50
		} else if (var2 == 5) { // L: 51
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 53

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "404236453"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 56
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-893226045"
	)
	static int method3397(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1822
			IsaacCipher.Interpreter_intStackSize -= 3; // L: 1823
			LoginScreenAnimation.queueSoundEffect(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]); // L: 1824
			return 1; // L: 1825
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1827
			class18.playSong(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1828
			return 1; // L: 1829
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1831
			IsaacCipher.Interpreter_intStackSize -= 2; // L: 1832
			class315.method5822(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]); // L: 1833
			return 1; // L: 1834
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1836
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 1872
					return var0 == 3211 ? 1 : 2; // L: 1906 1907 1909
				} else {
					var3 = 0; // L: 1873
					var4 = 0; // L: 1874
					if (var0 == 3210) { // L: 1875
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1876
					} else if (var0 == 3182) { // L: 1878
						var3 = 6; // L: 1879
					} else if (var0 == 3204) { // L: 1881
						var3 = 7; // L: 1882
					} else if (var0 == 3206) { // L: 1884
						var3 = 8; // L: 1885
					} else if (var0 == 3208) { // L: 1887
						var3 = 9; // L: 1888
					}

					if (var3 == 6) { // L: 1890
						float var5 = 200.0F * ((float)SecureRandomFuture.clientPreferences.brightness - 0.5F); // L: 1891
						var4 = 100 - Math.round(var5); // L: 1892
					} else if (var3 == 7) { // L: 1894
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.musicVolume / 2.55F); // L: 1895
					} else if (var3 == 8) { // L: 1897
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.soundEffectsVolume / 1.27F); // L: 1898
					} else if (var3 == 9) { // L: 1900
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1901
					}

					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4; // L: 1903
					return 1; // L: 1904
				}
			} else {
				var3 = 0; // L: 1837
				var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1838
				if (var0 == 3209) { // L: 1839
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1840
				} else if (var0 == 3181) { // L: 1842
					var3 = 6; // L: 1843
				} else if (var0 == 3203) { // L: 1845
					var3 = 7; // L: 1846
				} else if (var0 == 3205) { // L: 1848
					var3 = 8; // L: 1849
				} else if (var0 == 3207) { // L: 1851
					var3 = 9; // L: 1852
				}

				if (var3 == 6) { // L: 1854
					var4 = 100 - Math.min(Math.max(var4, 0), 100); // L: 1855
					InterfaceParent.method2142((double)(0.5F + (float)var4 / 200.0F)); // L: 1856
				} else if (var3 == 7) { // L: 1858
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1859
					Varcs.method2426(Math.round((float)var4 * 2.55F)); // L: 1860
				} else if (var3 == 8) { // L: 1862
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1863
					class20.updateSoundEffectVolume(Math.round((float)var4 * 1.27F)); // L: 1864
				} else if (var3 == 9) { // L: 1866
					var4 = Math.min(Math.max(var4, 0), 100); // L: 1867
					Players.method2383(Math.round(1.27F * (float)var4)); // L: 1868
				}

				return 1; // L: 1870
			}
		}
	}
}
