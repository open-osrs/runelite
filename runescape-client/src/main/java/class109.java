import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class109 extends class119 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -525542247
	)
	int field1334;
	@ObfuscatedName("t")
	byte field1333;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1108606271
	)
	int field1335;
	@ObfuscatedName("j")
	String field1332;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	final class120 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	class109(class120 var1) {
		this.this$0 = var1;
		this.field1334 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "1209873443"
	)
	void vmethod2558(Buffer var1) {
		this.field1334 = var1.readUnsignedShort();
		this.field1333 = var1.readByte();
		this.field1335 = var1.readUnsignedShort();
		var1.readLong();
		this.field1332 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-7"
	)
	void vmethod2555(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1334);
		var2.rank = this.field1333;
		var2.world = this.field1335;
		var2.username = new Username(this.field1332);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)V",
		garbageValue = "-1389624417"
	)
	static final void method2313(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		if (var0.movementSequence != -1) {
			var1 = World.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					ParamComposition.method2926(var1, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var1.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					ParamComposition.method2926(var1, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1060) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var3 = PcmPlayer.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var3 != -1) {
				SequenceDefinition var2 = World.SequenceDefinition_get(var3);
				if (var2 != null && var2.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var2.frameIds.length && var0.spotAnimationFrameCycle > var2.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						ParamComposition.method2926(var2, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var2.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var2.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var1 = World.SequenceDefinition_get(var0.sequence);
			if (var1.field1867 == 1 && var0.field1066 > 0 && var0.field1073 <= Client.cycle && var0.field1067 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var1 = World.SequenceDefinition_get(var0.sequence);
			if (var1 != null && var1.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					ParamComposition.method2926(var1, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var1.frameIds.length) {
					var0.sequenceFrame -= var1.frameCount;
					++var0.field1056;
					if (var0.field1056 >= var1.field1872) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) {
						ParamComposition.method2926(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var1.field1868;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
