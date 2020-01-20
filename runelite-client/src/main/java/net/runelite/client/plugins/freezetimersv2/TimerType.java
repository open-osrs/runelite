package net.runelite.client.plugins.freezetimersv2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.util.ImageUtil;
import java.awt.image.BufferedImage;

@Getter
@RequiredArgsConstructor
public enum TimerType
{
	FREEZE(5, loadImage("freeze"), loadImage("freezeimmune"), "freezeTimers"), // 3 seconds
	TELEBLOCK(100, loadImage("teleblock"), loadImage("teleblockimmune"), "teleblockTimers"), // this is 60 seconds, might be wrong
	VENG(0, loadImage("veng"), null, "vengTimers");

	private final int immunityLength;
	private final BufferedImage icon;
	private final BufferedImage cooldownIcon;
	private final String renderConfig;

	private static BufferedImage loadImage(String name)
	{
		return ImageUtil.getResourceStreamFromClass(FreezeTimersV2Plugin.class, name + ".png");
	}

	public boolean shouldRender(ConfigManager configManager)
	{
		return configManager.getConfiguration("freezetimersv2", renderConfig, Boolean.class);
	}
}
