import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements MouseWheel, MouseWheelListener {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1732160685
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0; // L: 8
	} // L: 10

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-12192689"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1128643930"
	)
	@Export("removeFrom")
	void removeFrom(Component var1) {
		var1.removeMouseWheelListener(this); // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1914010660"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation; // L: 26
		this.rotation = 0; // L: 27
		return var1; // L: 28
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation(); // L: 22
	} // L: 23
}
