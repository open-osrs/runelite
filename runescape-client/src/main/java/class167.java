import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fy")
public class class167 {
	@ObfuscatedName("q")
	public short[] field1814;
	@ObfuscatedName("f")
	public short[] field1815;

	class167(int var1) {
		ItemComposition var2 = EnumComposition.ItemDefinition_get(var1); // L: 12
		if (var2.method3737()) { // L: 13
			this.field1814 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1814, 0, this.field1814.length); // L: 15
		}

		if (var2.method3728()) { // L: 17
			this.field1815 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1815, 0, this.field1815.length); // L: 19
		}

	} // L: 21
}
