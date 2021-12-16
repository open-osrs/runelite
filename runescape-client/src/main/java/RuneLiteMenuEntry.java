import java.util.function.Consumer;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;

public class RuneLiteMenuEntry implements MenuEntry
{
	public Consumer consumer;
	public int idx;

	public RuneLiteMenuEntry(int idx)
	{
		this.idx = idx;
	}

	public Consumer getConsumer()
	{
		return consumer;
	}

	public void setConsumer(Consumer consumer)
	{
		this.consumer = consumer;
	}

	public int getIdx()
	{
		return idx;
	}

	public void setIdx(int idx)
	{
		this.idx = idx;
	}

	@Override
	public String getOption()
	{
		return Client.menuActions[this.idx];
	}

	@Override
	public MenuEntry setOption(String option)
	{
		Client.menuActions[this.idx] = option;
		return this;
	}

	@Override
	public String getTarget()
	{
		return Client.menuTargets[this.idx];
	}

	@Override
	public MenuEntry setTarget(String target)
	{
		Client.menuTargets[this.idx] = target;
		return this;
	}

	@Override
	public MenuAction getType()
	{
		int opcode = Client.menuOpcodes[this.idx];
		if (opcode >= 2000)
		{
			opcode -= 2000;
		}

		return MenuAction.of(opcode);
	}

	@Override
	public MenuAction getMenuAction()
	{
		return this.getType();
	}

	@Override
	public MenuEntry setType(MenuAction menuAction)
	{
		int opcode = Client.menuOpcodes[this.idx];
		short mod = 0;
		if (opcode >= 2000)
		{
			mod = 2000;
		}

		Client.menuOpcodes[this.idx] = menuAction.getId() + mod;
		return this;
	}

	@Override
	public int getOpcode()
	{
		int opcode = Client.menuOpcodes[this.idx];
		if (opcode >= 2000)
		{
			opcode -= 2000;
		}

		return opcode;
	}

	@Override
	public void setOpcode(int code)
	{
		int opcode = Client.menuOpcodes[this.idx];
		short mod = 0;
		if (opcode >= 2000)
		{
			mod = 2000;
		}

		Client.menuOpcodes[this.idx] = code + mod;
	}

	@Override
	public int getIdentifier()
	{
		return Client.menuIdentifiers[this.idx];
	}

	@Override
	public MenuEntry setIdentifier(int identifier)
	{
		Client.menuIdentifiers[this.idx] = identifier;
		return this;
	}

	@Override
	public int getParam0()
	{
		return Client.menuArguments1[this.idx];
	}

	@Override
	public MenuEntry setParam0(int param0)
	{
		Client.menuArguments1[this.idx] = param0;
		return this;
	}

	@Override
	public int getActionParam0()
	{
		return this.getParam0();
	}

	@Override
	public void setActionParam0(int param0)
	{
		this.setParam0(param0);
	}

	@Override
	public int getParam1()
	{
		return Client.menuArguments2[this.idx];
	}

	@Override
	public MenuEntry setParam1(int param1)
	{
		Client.menuArguments2[this.idx] = param1;
		return this;
	}

	@Override
	public int getActionParam1()
	{
		return this.getParam1();
	}

	@Override
	public void setActionParam1(int param1)
	{
		this.setParam1(param1);
	}

	@Override
	public boolean isDeprioritized()
	{
		return Client.menuOpcodes[this.idx] >= 2000;
	}

	@Override
	public MenuEntry setDeprioritized(boolean deprioritize)
	{
		int[] opcodes;

		if (deprioritize)
		{
			if (Client.menuOpcodes[this.idx] < 2000)
			{
				opcodes = Client.menuOpcodes;
				opcodes[this.idx] += 2000;
			}
		}
		else if (Client.menuOpcodes[this.idx] >= 2000)
		{
			opcodes = Client.menuOpcodes;
			opcodes[this.idx] -= 2000;
		}

		return this;
	}

	@Override
	public boolean isForceLeftClick()
	{
		return Client.menuShiftClick[this.idx];
	}

	@Override
	public MenuEntry setForceLeftClick(boolean forceLeftClick)
	{
		Client.menuShiftClick[this.idx] = forceLeftClick;
		return this;
	}

	@Override
	public MenuEntry onClick(Consumer consumer)
	{
		this.consumer = consumer;
		return this;
	}

	public boolean instanceOf(Object o)
	{
		return o instanceof RuneLiteMenuEntry;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == this)
		{
			return true;
		}
		else if (!(o instanceof RuneLiteMenuEntry))
		{
			return false;
		}
		else
		{
			RuneLiteMenuEntry menuEntry = (RuneLiteMenuEntry) o;
			if (!menuEntry.instanceOf(this))
			{
				return false;
			}
			else if (this.getIdentifier() != menuEntry.getIdentifier())
			{
				return false;
			}
			else if (this.getParam0() != menuEntry.getParam0())
			{
				return false;
			}
			else if (this.getParam1() != menuEntry.getParam1())
			{
				return false;
			}
			else if (this.isForceLeftClick() != menuEntry.isForceLeftClick())
			{
				return false;
			}
			else if (this.isDeprioritized() != menuEntry.isDeprioritized())
			{
				return false;
			}
			else
			{
				String option = this.getOption();
				String menuEntryOption = menuEntry.getOption();
				if (option == null)
				{
					if (menuEntryOption != null)
					{
						return false;
					}
				}
				else if (!option.equals(menuEntryOption))
				{
					return false;
				}

				String target = this.getTarget();
				String menuEntryTarget = menuEntry.getTarget();
				if (target == null)
				{
					if (menuEntryTarget != null)
					{
						return false;
					}
				}
				else if (!target.equals(menuEntryTarget))
				{
					return false;
				}

				MenuAction type = this.getType();
				MenuAction menuEntryType = menuEntry.getType();
				if (type == null)
				{
					if (menuEntryType == null)
					{
						return true;
					}
				}
				else if (type.equals(menuEntryType))
				{
					return true;
				}

				return false;
			}
		}
	}

	@Override
	public int hashCode()
	{
		byte b = 1;

		int hash = b * 59 + this.getIdentifier();
		hash = hash * 59 + this.getParam0();
		hash = hash * 59 + this.getParam1();
		hash = hash * 59 + (this.isForceLeftClick() ? 79 : 97);
		hash = hash * 59 + (this.isDeprioritized() ? 79 : 97);
		String option = this.getOption();
		hash = hash * 59 + (option == null ? 43 : option.hashCode());
		String target = this.getTarget();
		hash = hash * 59 + (target == null ? 43 : target.hashCode());
		MenuAction type = this.getType();
		hash = hash * 59 + (type == null ? 43 : type.hashCode());

		return hash;
	}
}
