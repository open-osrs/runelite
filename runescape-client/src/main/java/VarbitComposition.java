import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      descriptor = "Ldi;"
   )
   @Export("pcmStreamMixer")
   static PcmStreamMixer pcmStreamMixer;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   @Export("VarbitDefinition_archive")
   public static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1019712225
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 832067477
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1230578517
   )
   @Export("endBit")
   public int endBit;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lkx;B)V",
      garbageValue = "1"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lkx;II)V",
      garbageValue = "-1952270730"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1439525339"
   )
   @Export("Clan_joinChat")
   static final void Clan_joinChat(String var0) {
      if (!var0.equals("")) {
         PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
