import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class65 {
	@ObfuscatedName("a")
	static final BigInteger field854;
	@ObfuscatedName("m")
	static final BigInteger field862;

	static {
		field854 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field862 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)Lgw;",
		garbageValue = "-1781154478"
	)
	static RouteStrategy method1879(int var0, int var1) {
		Client.field771.approxDestinationX = var0; // L: 8689
		Client.field771.approxDestinationY = var1; // L: 8690
		Client.field771.approxDestinationSizeX = 1; // L: 8691
		Client.field771.approxDestinationSizeY = 1; // L: 8692
		return Client.field771; // L: 8693
	}
}
