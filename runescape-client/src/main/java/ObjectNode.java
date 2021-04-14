import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mm")
@Implements("ObjectNode")
public class ObjectNode extends Node {
	@ObfuscatedName("f")
	@Export("obj")
	public final Object obj;

	public ObjectNode(Object var1) {
		this.obj = var1; // L: 7
	} // L: 8
}
