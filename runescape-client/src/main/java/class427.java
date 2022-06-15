import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class427 extends class392 implements class251 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	final AbstractArchive field4650;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final DemotingHashTable field4648;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 49618459
	)
	final int field4649;

	@ObfuscatedSignature(
		descriptor = "(Lkx;ILlb;Llh;)V"
	)
	public class427(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4648 = new DemotingHashTable(64); // L: 15
		this.field4650 = var4; // L: 20
		this.field4649 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "-231569171"
	)
	protected class394 vmethod7521(int var1) {
		synchronized(this.field4648) { // L: 26
			class393 var2 = (class393)this.field4648.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7522(var1); // L: 29
				this.field4648.method5130(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lor;",
		garbageValue = "-1832880212"
	)
	class393 method7522(int var1) {
		byte[] var2 = this.field4650.takeFile(this.field4649, var1); // L: 37
		class393 var3 = new class393(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method7073(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public void method7525() {
		synchronized(this.field4648) { // L: 44
			this.field4648.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class426(this); // L: 51
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1896128691"
	)
	static final int method7523() {
		if (class19.clientPreferences.method2245()) { // L: 4886
			return PacketWriter.Client_plane;
		} else {
			int var0 = 3; // L: 4887
			if (ViewportMouse.cameraPitch < 310) { // L: 4888
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4891
					var1 = InterfaceParent.oculusOrbFocalPointX >> 7; // L: 4892
					var2 = class141.oculusOrbFocalPointY >> 7; // L: 4893
				} else {
					var1 = class101.localPlayer.x >> 7; // L: 4896
					var2 = class101.localPlayer.y >> 7; // L: 4897
				}

				int var3 = class18.cameraX >> 7; // L: 4899
				int var4 = class228.cameraZ >> 7; // L: 4900
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4901
					return PacketWriter.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4902
					return PacketWriter.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) { // L: 4903
					var0 = PacketWriter.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4905
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4906
				}

				int var6;
				if (var2 > var4) { // L: 4908
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4909
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4910
					var7 = var6 * 65536 / var5; // L: 4911
					var8 = 32768; // L: 4912

					while (var3 != var1) { // L: 4913
						if (var3 < var1) { // L: 4914
							++var3;
						} else if (var3 > var1) { // L: 4915
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) { // L: 4916
							var0 = PacketWriter.Client_plane;
						}

						var8 += var7; // L: 4917
						if (var8 >= 65536) { // L: 4918
							var8 -= 65536; // L: 4919
							if (var4 < var2) { // L: 4920
								++var4;
							} else if (var4 > var2) { // L: 4921
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) { // L: 4922
								var0 = PacketWriter.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4926
					var7 = var5 * 65536 / var6; // L: 4927
					var8 = 32768; // L: 4928

					while (var4 != var2) { // L: 4929
						if (var4 < var2) { // L: 4930
							++var4;
						} else if (var4 > var2) { // L: 4931
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) { // L: 4932
							var0 = PacketWriter.Client_plane;
						}

						var8 += var7; // L: 4933
						if (var8 >= 65536) { // L: 4934
							var8 -= 65536; // L: 4935
							if (var3 < var1) { // L: 4936
								++var3;
							} else if (var3 > var1) { // L: 4937
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][var3][var4] & 4) != 0) { // L: 4938
								var0 = PacketWriter.Client_plane;
							}
						}
					}
				}
			}

			if (class101.localPlayer.x >= 0 && class101.localPlayer.y >= 0 && class101.localPlayer.x < 13312 && class101.localPlayer.y < 13312) { // L: 4943
				if ((Tiles.Tiles_renderFlags[PacketWriter.Client_plane][class101.localPlayer.x >> 7][class101.localPlayer.y >> 7] & 4) != 0) { // L: 4944
					var0 = PacketWriter.Client_plane;
				}

				return var0; // L: 4945
			} else {
				return PacketWriter.Client_plane;
			}
		}
	}
}
