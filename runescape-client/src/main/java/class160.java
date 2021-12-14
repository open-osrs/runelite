import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fe")
public class class160 {
	@ObfuscatedName("p")
	public short[] field1732;
	@ObfuscatedName("m")
	public short[] field1738;

	class160(int var1) {
		ItemComposition var2 = UserComparator6.ItemDefinition_get(var1);
		if (var2.method3560()) {
			this.field1732 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1732, 0, this.field1732.length);
		}

		if (var2.method3572()) {
			this.field1738 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1738, 0, this.field1738.length);
		}

	}
}
