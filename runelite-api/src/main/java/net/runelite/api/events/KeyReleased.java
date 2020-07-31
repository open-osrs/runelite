package net.runelite.api.events;

import lombok.Getter;

@Getter
public class KeyReleased implements Event
{
	private int keyCode;

	public KeyReleased(int keyCode)
	{
		this.keyCode = keyCode;
	}
}