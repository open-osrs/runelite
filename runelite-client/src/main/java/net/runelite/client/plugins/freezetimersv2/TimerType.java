package net.runelite.client.plugins.freezetimersv2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.util.ImageUtil;
import java.awt.image.BufferedImage;

@Getter
@AllArgsConstructor
public enum TimerType
{
	FREEZE(5, loadImage("freeze"), loadImage("freezeimmune")), // 3 seconds
	TELEBLOCK(100, loadImage("teleblock"), loadImage("teleblockimmune")), // this is 60 seconds, might be wrong
	VENG(0, loadImage("veng"), null),
	ITS_FUCKING_BROKEN(0, null, null);

	private int immunityLength;
	private BufferedImage icon;
	private BufferedImage cooldownIcon;

	private static BufferedImage loadImage(String name)
	{
		return ImageUtil.getResourceStreamFromClass(FreezeTimersPlugin.class, name + ".png");
	}
}
