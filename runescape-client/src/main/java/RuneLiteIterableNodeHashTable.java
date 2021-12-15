import java.util.Iterator;
import java.util.NoSuchElementException;

public class RuneLiteIterableNodeHashTable implements Iterator
{
	public Node node;
	public final NodeHashTable nodeHashTable;
	public int it;

	public RuneLiteIterableNodeHashTable(NodeHashTable nodeHashTable)
	{
		this.nodeHashTable = nodeHashTable;
	}

	@Override
	public boolean hasNext()
	{
		if (this.it > 0 && this.nodeHashTable.buckets[this.it - 1] != this.node)
		{
			return true;
		}
		else
		{
			for (int i = this.it; i < this.nodeHashTable.size; ++i)
			{
				Node bucket = this.nodeHashTable.buckets[i];
				Node previous = bucket.previous;

				if (bucket != previous)
				{
					return true;
				}
			}

			return false;
		}
	}

	@Override
	public Node next()
	{
		if (this.it > 0 && this.nodeHashTable.buckets[this.it - 1] != this.node)
		{
			Node node = this.node;
			this.node = node.previous;

			return node;
		}
		else
		{
			Node node;
			Node previous;

			do
			{
				if (this.it >= this.nodeHashTable.size)
				{
					throw new NoSuchElementException();
				}

				node = this.nodeHashTable.buckets[this.it++];
				previous = node.previous;
			} while (node == previous);

			this.node = previous.previous;

			return previous;
		}
	}
}
