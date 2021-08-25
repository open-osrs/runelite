import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1507900215
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2099513777
	)
	public int field4001;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1141431167
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 302197759
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1025961101
	)
	public int field4004;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 628282865
	)
	public int field4003;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 879536881
	)
	public int field4006;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -268778877
	)
	public int field4007;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 504736861
	)
	public int field4008;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -561061723
	)
	public int field4009;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1993952991
	)
	public int field4010;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4001 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4004 = -1;
		this.field4003 = -1;
		this.field4006 = -1;
		this.field4007 = -1;
		this.field4008 = -1;
		this.field4009 = -1;
		this.field4010 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "-2116063360"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3999.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method6985();
				this.field4001 = var3.method6985();
				this.mapScenes = var3.method6985();
				this.headIconsPk = var3.method6985();
				this.field4004 = var3.method6985();
				this.field4003 = var3.method6985();
				this.field4006 = var3.method6985();
				this.field4007 = var3.method6985();
				this.field4008 = var3.method6985();
				this.field4009 = var3.method6985();
				this.field4010 = var3.method6985();
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "2097439645"
	)
	static String method6184(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}
}
