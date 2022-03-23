import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public abstract class class392 extends class250 implements class444 {
	@ObfuscatedSignature(
		descriptor = "(Lkh;Llp;I)V"
	)
	protected class392(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Loi;",
		garbageValue = "4"
	)
	protected abstract class394 vmethod7638(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1997278431"
	)
	public int method7171() {
		return super.field2872; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1983515453"
	)
	public Object vmethod8046(int var1) {
		class394 var2 = this.vmethod7638(var1); // L: 24
		return var2 != null && var2.method7201() ? var2.method7200() : null; // L: 25 26
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)Lqk;",
		garbageValue = "-15"
	)
	public class445 method7173(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class394 var3 = this.vmethod7638(var2); // L: 31
		class445 var4 = new class445(var2); // L: 32
		Class var5 = var3.field4378.field4599; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4681 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4681 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4681 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class440.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class440 var6 = (class440)var5.newInstance(); // L: 39
				var6.method8012(var1); // L: 40
				var4.field4681 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-265352452"
	)
	public static int method7190(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1704519794"
	)
	public static void method7191(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher); // L: 11893
		var4.packetBuffer.writeShort(var0); // L: 11894
		var4.packetBuffer.method7796(var1); // L: 11895
		var4.packetBuffer.method7788(var2); // L: 11896
		var4.packetBuffer.method7806(var3 ? Client.field571 * 1761289457 * 34294801 : 0); // L: 11897
		Client.packetWriter.addNode(var4); // L: 11898
	} // L: 11899
}
