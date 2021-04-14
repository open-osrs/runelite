import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public abstract class class341 implements class191 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	class373 field3928;

	class341(int var1) {
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IB)V",
		garbageValue = "31"
	)
	abstract void vmethod6008(Buffer var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1416767343"
	)
	public void method6014(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class337[] var3 = new class337[]{class337.field3921, class337.field3922, class337.field3920, class337.field3925}; // L: 21
			class337 var4 = (class337)UserComparator8.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field3923) { // L: 25
				case 0:
					var1.readStringCp1252NullCircumfixed(); // L: 29
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 27
				case 2:
					class246[] var5 = new class246[]{class246.field3215, class246.field3214, class246.field3217, class246.field3216}; // L: 34
					UserComparator8.findEnumerated(var5, var1.readUnsignedByte()); // L: 36
					break; // L: 37
				case 3:
					int var6 = var1.readUnsignedByte(); // L: 39
					this.field3928 = Login.method1969(var6); // L: 40
				}
			} else {
				this.vmethod6008(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "660336316"
	)
	boolean method6007() {
		return this.field3928 != null; // L: 52
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "58"
	)
	Object method6010() {
		if (this.field3928 == class373.field4126) { // L: 56
			return 0; // L: 57
		} else if (this.field3928 == class373.field4134) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field3928 == class373.field4128 ? "" : null; // L: 62 63 65
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "-745115962"
	)
	static final void method6017(PendingSpawn var0) {
		long var1 = 0L; // L: 6828
		int var3 = -1; // L: 6829
		int var4 = 0; // L: 6830
		int var5 = 0; // L: 6831
		if (var0.type == 0) { // L: 6832
			var1 = WorldMapArea.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 6833
			var1 = WorldMapArea.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 6834
			var1 = WorldMapArea.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 6835
			var1 = WorldMapArea.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 6836
			int var6 = WorldMapArea.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 6837
			var3 = WorldMapSection1.Entity_unpackID(var1); // L: 6838
			var4 = var6 & 31; // L: 6839
			var5 = var6 >> 6 & 3; // L: 6840
		}

		var0.objectId = var3; // L: 6842
		var0.field1203 = var4; // L: 6843
		var0.field1199 = var5; // L: 6844
	} // L: 6845
}
