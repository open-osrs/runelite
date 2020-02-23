package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import java.util.HashMap;
import java.util.Map;

@Mixin(RSClient.class)
public abstract class ComplianceMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;
	@Inject
	private static Map<String, Boolean> complianceMap = new HashMap<>();

	@Inject
	@Override
	public boolean getComplianceValue(String key)
	{
		if (key == null)
		{
			return false;
		}
		return complianceMap.containsKey(key) ? complianceMap.get(
			key) : false; // false ensures we are compliant by default, note: java 7 does not have Map#getOrDefault(String, Object)
	}

	@Inject
	@Override
	public void setComplianceValue(String key, boolean value)
	{
		if (key == null)
		{
			return;
		}
		client.getLogger().debug("Compliance: {} being set to {}", key, value);
		complianceMap.put(key, value);
	}
}
