package net.runelite.mixins;

import net.runelite.api.ParamHolder;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Mixins;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIntegerNode;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSObjectNode;
import net.runelite.rs.api.RSParamComposition;
import net.runelite.rs.api.RSStructComposition;

@Mixins({
	@Mixin(RSStructComposition.class),
	@Mixin(RSObjectComposition.class),
	@Mixin(RSNPCComposition.class),
	@Mixin(RSItemComposition.class)
})
public abstract class ParamHolderMixin implements ParamHolder
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private RSNode getParam(int id)
	{
		return this.getParams() == null ? null : (RSNode) this.getParams().get(id);
	}

	@Inject
	private void setParam(int id, RSNode node)
	{
		RSParamComposition comp = client.getRSParamComposition(id);
		if (comp.isString() != (node instanceof RSObjectNode))
		{
			if (comp.isString())
			{
				throw new IllegalArgumentException("trying to put int into string param");
			}
			else
			{
				throw new IllegalArgumentException("trying to put string into int param");
			}
		}
		else
		{
			if (getParams() == null)
			{
				setParams(client.newIterableNodeHashTable(16));
			}

			getParams().put(node, id);
		}
	}

	@Inject
	@Override
	public int getIntValue(int paramID)
	{
		RSNode param = getParam(paramID);
		if (param != null)
		{
			RSIntegerNode node = (RSIntegerNode) param;
			return node.getValue();
		}
		else
		{
			RSParamComposition comp = client.getRSParamComposition(paramID);
			if (comp.isString())
			{
				throw new IllegalArgumentException("trying to get int from string param");
			}

			return comp.getDefaultInt();
		}
	}

	@Inject
	@Override
	public void setValue(int id, int val)
	{
		setParam(id, client.newIntegerNode(val));
	}

	@Inject
	@Override
	public String getStringValue(int paramID)
	{
		RSNode param = getParam(paramID);
		if (param != null)
		{
			RSObjectNode node = (RSObjectNode) param;
			return (String) node.getValue();
		}
		else
		{
			RSParamComposition comp = client.getRSParamComposition(paramID);
			if (!comp.isString())
			{
				throw new IllegalArgumentException("trying to get string from int param");
			}

			return comp.getDefaultStr();
		}
	}

	@Inject
	@Override
	public void setValue(int id, String val)
	{
		setParam(id, client.newObjectNode(val));
	}
}
