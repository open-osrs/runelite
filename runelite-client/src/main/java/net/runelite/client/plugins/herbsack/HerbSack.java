package net.runelite.client.plugins.herbsack;

import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import net.runelite.api.ItemID;
import static net.runelite.client.RuneLite.RUNELITE_DIR;

public class HerbSack
{
	private static final File HERBSACK_RECORD_DIR = new File(RUNELITE_DIR, "herbsack");
	private static final File HERBSACK_PERSISTENCY_FILE = new File(HERBSACK_RECORD_DIR, "herbsack.dat");
	@Getter
	private Map<Integer, Integer> herbs;
	public static ImmutableList<Integer> POSSIBLE_HERBS = ImmutableList.of(
		ItemID.GRIMY_GUAM_LEAF,
		ItemID.GRIMY_AVANTOE,
		ItemID.GRIMY_CADANTINE,
		ItemID.GRIMY_LANTADYME,
		ItemID.GRIMY_DWARF_WEED,
		ItemID.GRIMY_HARRALANDER,
		ItemID.GRIMY_IRIT_LEAF,
		ItemID.GRIMY_KWUARM,
		ItemID.GRIMY_MARRENTILL,
		ItemID.GRIMY_RANARR_WEED,
		ItemID.GRIMY_SNAPDRAGON,
		ItemID.GRIMY_TARROMIN,
		ItemID.GRIMY_TORSTOL,
		ItemID.GRIMY_TOADFLAX
	);

	public HerbSack()
	{
		loadHerbMap();
		HERBSACK_RECORD_DIR.mkdir();
		if (!HERBSACK_PERSISTENCY_FILE.exists())
		{
			try
			{
				HERBSACK_PERSISTENCY_FILE.createNewFile();
				updateHerbBagStorage();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		updateHerbsFromStorage();
	}

	private void loadHerbMap()
	{
		herbs = new HashMap();
		for (int herbId : POSSIBLE_HERBS)
		{
			herbs.put(herbId, 0);
		}
	}

	public void addHerbs(List<HerbCount> newHerbs)
	{
		for (HerbCount herb : newHerbs)
		{
			int herbCount = herbs.get(herb.item.getId());
			herbs.put(herb.item.getId(), herbCount + herb.count);
		}
		updateHerbBagStorage();
	}

	public void removeHerbs(List<HerbCount> herbsToRemove)
	{
		for (HerbCount herb : herbsToRemove)
		{
			int herbCount = herbs.get(herb.item.getId());
			herbCount -= herb.count;
			if (herbCount < 0)
			{
				herbCount = 0;
			}
			herbs.put(herb.item.getId(), herbCount);
		}
		updateHerbBagStorage();
	}

	public void clear()
	{
		herbs.clear();
		loadHerbMap();
		updateHerbBagStorage();
	}

	private void updateHerbsFromStorage()
	{
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(HERBSACK_PERSISTENCY_FILE)))
		{
			herbs = (Map<Integer, Integer>) in.readObject();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	private void updateHerbBagStorage()
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(HERBSACK_PERSISTENCY_FILE)))
		{
			out.writeObject(herbs);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public int getHerbCount(int herbId)
	{
		return herbs.get(herbId);
	}
}
