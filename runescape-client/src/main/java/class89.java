import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class89 {
   @ObfuscatedName("y")
   static final BigInteger field1155 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("h")
   static final BigInteger field1154 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(III)Lbd;",
      garbageValue = "-1373661566"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }
}
