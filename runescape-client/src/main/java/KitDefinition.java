import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -413504447
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("i")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1201846847
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("g")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("n")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("u")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("z")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("w")
	@Export("models")
	int[] models;
	@ObfuscatedName("y")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.bodypartID = -1;
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "856121726"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IB)V",
		garbageValue = "-72"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1376663595"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lek;",
		garbageValue = "-730489630"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1413999109"
	)
	public boolean method4636() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lek;",
		garbageValue = "-127"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljo;",
		garbageValue = "1649830223"
	)
	@Export("ItemDefinition_get")
	public static ItemDefinition ItemDefinition_get(int var0) {
		ItemDefinition var1 = (ItemDefinition)ItemDefinition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!SoundCache.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				var1.groundActions = null;
				var1.inventoryActions = null;
				var1.shiftClickIndex = -1;
				var1.team = 0;
				if (var1.params != null) {
					boolean var3 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamDefinition var5 = VarbitDefinition.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var3 = true;
						}
					}

					if (!var3) {
						var1.params = null;
					}
				}
			}

			ItemDefinition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "0"
	)
	static char method4650(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1137606481"
	)
	public static void method4624() {
		VarbitDefinition.VarbitDefinition_cached.clear();
	}
}
