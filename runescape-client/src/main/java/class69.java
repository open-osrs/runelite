import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class69 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 593449975
	)
	@Export("worldPort")
	static int worldPort;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;I)V",
		garbageValue = "739362816"
	)
	public static void method1153(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[Loq;",
		garbageValue = "0"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4234, FillMode.field4235, FillMode.SOLID}; // L: 15
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1229986351"
	)
	static void method1151() {
		Login.worldSelectOpen = false; // L: 1554
		Canvas.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1555
		class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1556
		FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18); // L: 1557
	} // L: 1558

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1642265887"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class12.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3770
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3771
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3772
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3773
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3774
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3775
			++Client.soundEffectCount; // L: 3776
		}

	} // L: 3778

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIB)V",
		garbageValue = "77"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4313
			int var3 = Player.SequenceDefinition_get(var1).field1900; // L: 4314
			if (var3 == 1) { // L: 4315
				var0.sequenceFrame = 0; // L: 4316
				var0.sequenceFrameCycle = 0; // L: 4317
				var0.sequenceDelay = var2; // L: 4318
				var0.field1244 = 0; // L: 4319
			}

			if (var3 == 2) { // L: 4321
				var0.field1244 = 0; // L: 4322
			}
		} else if (var1 == -1 || var0.sequence == -1 || Player.SequenceDefinition_get(var1).field1894 >= Player.SequenceDefinition_get(var0.sequence).field1894) { // L: 4325
			var0.sequence = var1; // L: 4326
			var0.sequenceFrame = 0; // L: 4327
			var0.sequenceFrameCycle = 0; // L: 4328
			var0.sequenceDelay = var2; // L: 4329
			var0.field1244 = 0; // L: 4330
			var0.field1215 = var0.pathLength; // L: 4331
		}

	} // L: 4333
}
