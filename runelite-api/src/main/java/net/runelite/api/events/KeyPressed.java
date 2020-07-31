package net.runelite.api.events;

import lombok.Getter;

@Getter
public class KeyPressed implements Event
{
	private int keyCode;

	public KeyPressed(int keyCode)
	{
		this.keyCode = keyCode;
	}
}
