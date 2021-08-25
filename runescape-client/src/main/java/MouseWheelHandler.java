import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class144, MouseWheelListener {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1662270439
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-95"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1252730028"
	)
	@Export("removeFrom")
	void removeFrom(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "105190927"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation();
	}
}
