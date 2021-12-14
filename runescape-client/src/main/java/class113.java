import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class113 {
	@ObfuscatedName("uj")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1281490499
	)
	public final int field1377;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	public class113 field1366;
	@ObfuscatedName("p")
	float[][] field1379;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	final class366[] field1368;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	class366[] field1369;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lno;"
	)
	class366[] field1365;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	class366 field1371;
	@ObfuscatedName("w")
	boolean field1378;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	class366 field1373;
	@ObfuscatedName("r")
	boolean field1374;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	class366 field1372;
	@ObfuscatedName("v")
	float[][] field1376;
	@ObfuscatedName("d")
	float[][] field1367;
	@ObfuscatedName("h")
	float[][] field1375;

	@ObfuscatedSignature(
		descriptor = "(ILpi;Z)V"
	)
	public class113(int var1, Buffer var2, boolean var3) {
		this.field1371 = new class366();
		this.field1378 = true;
		this.field1373 = new class366();
		this.field1374 = true;
		this.field1372 = new class366();
		this.field1377 = var2.readShort();
		this.field1368 = new class366[var1];
		this.field1369 = new class366[this.field1368.length];
		this.field1365 = new class366[this.field1368.length];
		this.field1379 = new float[this.field1368.length][3];

		for (int var4 = 0; var4 < this.field1368.length; ++var4) {
			this.field1368[var4] = new class366(var2, var3);
			this.field1379[var4][0] = var2.method7369();
			this.field1379[var4][1] = var2.method7369();
			this.field1379[var4][2] = var2.method7369();
		}

		this.method2584();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2584() {
		this.field1376 = new float[this.field1368.length][3];
		this.field1367 = new float[this.field1368.length][3];
		this.field1375 = new float[this.field1368.length][3];
		class366 var1;
		synchronized(class366.field4191) {
			if (class149.field1663 == 0) {
				var1 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652();
				var1 = class366.field4191[class149.field1663];
			}
		}

		class366 var2 = var1;

		for (int var5 = 0; var5 < this.field1368.length; ++var5) {
			class366 var4 = this.method2600(var5);
			var2.method6654(var4);
			var2.method6678();
			this.field1376[var5] = var2.method6651();
			this.field1367[var5][0] = var4.field4196[12];
			this.field1367[var5][1] = var4.field4196[13];
			this.field1367[var5][2] = var4.field4196[14];
			this.field1375[var5] = var4.method6663();
		}

		var2.method6656();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lno;",
		garbageValue = "0"
	)
	class366 method2600(int var1) {
		return this.field1368[var1];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IS)Lno;",
		garbageValue = "351"
	)
	class366 method2587(int var1) {
		if (this.field1369[var1] == null) {
			this.field1369[var1] = new class366(this.method2600(var1));
			if (this.field1366 != null) {
				this.field1369[var1].method6670(this.field1366.method2587(var1));
			} else {
				this.field1369[var1].method6670(class366.field4194);
			}
		}

		return this.field1369[var1];
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lno;",
		garbageValue = "1855658248"
	)
	class366 method2586(int var1) {
		if (this.field1365[var1] == null) {
			this.field1365[var1] = new class366(this.method2587(var1));
			this.field1365[var1].method6678();
		}

		return this.field1365[var1];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "275218241"
	)
	void method2576(class366 var1) {
		this.field1371.method6654(var1);
		this.field1378 = true;
		this.field1374 = true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lno;",
		garbageValue = "-1259649016"
	)
	class366 method2604() {
		return this.field1371;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Lno;",
		garbageValue = "17"
	)
	class366 method2581() {
		if (this.field1378) {
			this.field1373.method6654(this.method2604());
			if (this.field1366 != null) {
				this.field1373.method6670(this.field1366.method2581());
			}

			this.field1378 = false;
		}

		return this.field1373;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lno;",
		garbageValue = "1902946548"
	)
	public class366 method2582(int var1) {
		if (this.field1374) {
			this.field1372.method6654(this.method2586(var1));
			this.field1372.method6670(this.method2581());
			this.field1374 = false;
		}

		return this.field1372;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-849855317"
	)
	float[] method2583(int var1) {
		return this.field1376[var1];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-117"
	)
	float[] method2577(int var1) {
		return this.field1367[var1];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-177348293"
	)
	float[] method2585(int var1) {
		return this.field1375[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1994620885"
	)
	public static int method2616() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "13"
	)
	static final void method2618(String var0, int var1) {
		PacketBufferNode var2 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2878, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.method7343(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	static final void method2617(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2990()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2888, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + class116.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					var3.addNode(var4);
				}
			}
		}
	}
}
