import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class124 extends class132 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -647163911
	)
	int field1433;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class124(class133 var1) {
		this.this$0 = var1;
		this.field1433 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "3602154"
	)
	void vmethod2703(Buffer var1) {
		this.field1433 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "66"
	)
	void vmethod2702(ClanChannel var1) {
		var1.removeMember(this.field1433);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljw;",
		garbageValue = "-7"
	)
	public static GameBuild method2543(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnz;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2005375598"
	)
	static String method2544(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-2089806089"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
