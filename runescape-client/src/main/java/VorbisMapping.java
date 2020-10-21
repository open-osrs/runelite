import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("di")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("f")
	@Export("submaps")
	int submaps;
	@ObfuscatedName("b")
	@Export("mappingMux")
	int mappingMux;
	@ObfuscatedName("l")
	@Export("submapFloor")
	int[] submapFloor;
	@ObfuscatedName("m")
	@Export("submapResidue")
	int[] submapResidue;

	VorbisMapping() {
		VorbisSample.readBits(16); // L: 12
		this.submaps = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1; // L: 13
		if (VorbisSample.readBit() != 0) { // L: 14
			VorbisSample.readBits(8); // L: 15
		}

		VorbisSample.readBits(2); // L: 18
		if (this.submaps > 1) { // L: 19
			this.mappingMux = VorbisSample.readBits(4); // L: 20
		}

		this.submapFloor = new int[this.submaps]; // L: 22
		this.submapResidue = new int[this.submaps]; // L: 23

		for (int var1 = 0; var1 < this.submaps; ++var1) { // L: 24
			VorbisSample.readBits(8); // L: 25
			this.submapFloor[var1] = VorbisSample.readBits(8); // L: 26
			this.submapResidue[var1] = VorbisSample.readBits(8); // L: 27
		}

	} // L: 29
}
