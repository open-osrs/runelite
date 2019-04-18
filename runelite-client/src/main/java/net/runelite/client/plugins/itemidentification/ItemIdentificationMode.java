package net.runelite.client.plugins.itemidentification;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemIdentificationMode
{
	SHORT("Short"),
	MEDIUM("Medium");

	private final String type;

	@Override
	public String toString()
	{
		return type;
	}
}
