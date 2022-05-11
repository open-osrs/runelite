import java.util.function.Consumer;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.RSClient;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RuneLiteMenuEntry implements MenuEntry
{
	private static RSClient client;

	public Consumer consumer;
	public int idx;

	public RuneLiteMenuEntry()
	{
		idx = 499;
	}

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
	public boolean isItemOp()
	{
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int identifier = this.getIdentifier();
			int param1 = this.getParam1();

			if (param1 == 9764864)
			{
				switch (identifier)
				{
					case 1:
					case 2:
					case 3:
					case 4:
					case 6:
					case 7:
						return true;
					case 5:
				}
			}
		}

		return false;
	}

	@Override
	public int getItemOp()
	{
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int identifier = this.getIdentifier();
			int param0 = this.getParam0();
			int param1 = this.getParam1();

			if (param1 == 9764864)
			{
				switch (identifier)
				{
					case 1:
						Widget widget = client.getWidget(param1);
						if (widget != null && param0 != -1)
						{
							widget = widget.getChild(param0);
							if (widget != null && widget.getItemId() > -1)
							{
								int shiftClickActionIndex = client.getItemComposition(widget.getItemId()).getShiftClickActionIndex();

								if (shiftClickActionIndex >= 0)
								{
									return shiftClickActionIndex + 1;
								}
							}
						}
						break;
					case 2:
						return 1;
					case 3:
						return 2;
					case 4:
						return 3;
					case 5:
					default:
						break;
					case 6:
						return 4;
					case 7:
						return 5;
				}
			}
		}

		return -1;
	}

	@Override
	public int getItemId()
	{
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int param1 = this.getParam1();
			int param0 = this.getParam0();

			if (param1 == 9764864)
			{
				Widget widget = client.getWidget(param1);
				if (param0 != -1)
				{
					widget = widget.getChild(param0);
					return widget.getItemId();
				}
			}
		}

		return -1;
	}

	@Override
	public Widget getWidget()
	{
		int param1 = this.getParam1();
		int param0 = this.getParam0();

		Widget widget = client.getWidget(param1);

		if (widget == null)
		{
			return null;
		}

		if (param0 != -1)
		{
			Widget child = widget.getChild(param0);

			if (child != null)
			{
				return child;
			}
		}

		return widget;
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

	@Override
	public String toString()
	{
		return "MenuEntryImpl(getOption=" + this.getOption() + ", getTarget=" + this.getTarget() + ", getIdentifier=" + this.getIdentifier() + ", getType=" + this.getType() + ", getParam0=" + this.getParam0() + ", getParam1=" + this.getParam1() + ", isForceLeftClick=" + this.isForceLeftClick() + ", isDeprioritized=" + this.isDeprioritized() + ")";
	}
}
