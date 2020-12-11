import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("t")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("p")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static AbstractSocket field562;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -820173359
	)
	@Export("group")
	int group;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1426286051
	)
	@Export("type")
	int type;
	@ObfuscatedName("x")
	boolean field559;

	InterfaceParent() {
		this.field559 = false; // L: 8
	} // L: 10
}
