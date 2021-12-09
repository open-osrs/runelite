import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("c")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("b")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "392598921"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-786037347"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1927504024"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return WallDecoration.method4340(); // L: 31
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "205087229"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 89
		if (var3) { // L: 90
			var5 |= 65536L;
		}

		return var5; // L: 91
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1413371821"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		LoginScreenAnimation.logOut(); // L: 3565
		switch(var0) { // L: 3566
		case 1:
			PlayerType.method5521(24); // L: 3578
			class19.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3579
			break;
		case 2:
			PlayerType.method5521(24); // L: 3570
			class19.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 3571
		}

	} // L: 3584

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1736689537"
	)
	static final void method2025(int var0, int var1) {
		if (var0 < 128) { // L: 4575
			var0 = 128;
		}

		if (var0 > 383) { // L: 4576
			var0 = 383;
		}

		if (UserComparator7.cameraPitch < var0) { // L: 4577
			UserComparator7.cameraPitch = (var0 - UserComparator7.cameraPitch) * ChatChannel.field956 / 1000 + UserComparator7.cameraPitch + WorldMapSection1.field2755; // L: 4578
			if (UserComparator7.cameraPitch > var0) { // L: 4579
				UserComparator7.cameraPitch = var0;
			}
		}

		if (UserComparator7.cameraPitch > var0) { // L: 4581
			UserComparator7.cameraPitch -= (UserComparator7.cameraPitch - var0) * ChatChannel.field956 / 1000 + WorldMapSection1.field2755; // L: 4582
			if (UserComparator7.cameraPitch < var0) { // L: 4583
				UserComparator7.cameraPitch = var0;
			}
		}

		int var2 = var1 - class379.cameraYaw; // L: 4585
		if (var2 > 1024) { // L: 4586
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 4587
			var2 += 2048;
		}

		if (var2 > 0) { // L: 4588
			class379.cameraYaw = class379.cameraYaw + WorldMapSection1.field2755 + var2 * ChatChannel.field956 / 1000; // L: 4589
			class379.cameraYaw &= 2047; // L: 4590
		}

		if (var2 < 0) { // L: 4592
			class379.cameraYaw -= -var2 * ChatChannel.field956 / 1000 + WorldMapSection1.field2755; // L: 4593
			class379.cameraYaw &= 2047; // L: 4594
		}

		int var3 = var1 - class379.cameraYaw; // L: 4596
		if (var3 > 1024) { // L: 4597
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 4598
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4599
			class379.cameraYaw = var1;
		}

	} // L: 4600

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljm;S)Ljava/lang/String;",
		garbageValue = "13301"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class404.Widget_unpackTargetMask(class363.getWidgetFlags(var0)) == 0) { // L: 12581
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12582 12583 12585
		}
	}
}
