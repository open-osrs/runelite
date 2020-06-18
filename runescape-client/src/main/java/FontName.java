import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("n")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)Lch;",
		garbageValue = "-18"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class3.getNextWorldListWorld();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Lhd;II)V",
		garbageValue = "1462159307"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2647 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field2723 == null) {
				var0.field2723 = new int[var0.field2647.length];
			}

			var0.field2723[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(Lfm;III)Ldt;",
		garbageValue = "273987431"
	)
	public static final PcmPlayer method5519(TaskHandler var0, int var1, int var2) {
		if (class237.field3113 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = HealthBarUpdate.pcmPlayerProvider.player();
				var3.samples = new int[256 * (Messages.PcmPlayer_stereo ? 2 : 1)];
				var3.field1443 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (UserComparator3.field2009 > 0 && PcmPlayer.soundSystem == null) {
					PcmPlayer.soundSystem = new SoundSystem();
					class227.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class227.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (PcmPlayer.soundSystem != null) {
					if (PcmPlayer.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1542752856"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
