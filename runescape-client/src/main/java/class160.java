import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fe")
public class class160 {
	@ObfuscatedName("p")
	public short[] field1732;
	@ObfuscatedName("m")
	public short[] field1738;

	class160(int var1) {
		ItemComposition var2 = UserComparator6.ItemDefinition_get(var1); // L: 12
		if (var2.method3560()) { // L: 13
			this.field1732 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1732, 0, this.field1732.length); // L: 15
		}

		if (var2.method3572()) { // L: 17
			this.field1738 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1738, 0, this.field1738.length); // L: 19
		}

	} // L: 21
}
