import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 543287365
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   @Export("data")
   public byte[] data;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("archiveDisk")
   public ArchiveDisk archiveDisk;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive")
   public Archive archive;

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "126"
   )
   static boolean method4359() {
      return (Client.drawPlayerNames & 8) != 0;
   }
}
