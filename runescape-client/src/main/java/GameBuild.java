import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("t")
	@Export("name")
	public final String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -794048651
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "727628854"
	)
	static void method5494(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}
}
