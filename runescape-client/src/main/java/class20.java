import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class20 implements Callable {
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("l")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class10 field98;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;Ll;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field98 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field98.method97()) {
				PlayerType.method5099(10L);
			}
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field98.method111();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "317393662"
	)
	public static void method314() {
		WorldMapElement.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1673294569"
	)
	public static void method310() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
	}
}
