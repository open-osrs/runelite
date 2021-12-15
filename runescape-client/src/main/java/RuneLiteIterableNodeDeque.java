import java.util.Iterator;
import java.util.NoSuchElementException;

public class RuneLiteIterableNodeDeque implements Iterator
{
	public final NodeDeque nodeDeque;
	public Node node;

	public RuneLiteIterableNodeDeque(NodeDeque nodeDeque)
	{
		this.nodeDeque = nodeDeque;
		this.node = this.nodeDeque.sentinel.previous;
	}

	@Override
	public boolean hasNext()
	{
		return this.node != this.nodeDeque.sentinel;
	}

	@Override
	public Node next()
	{
		if (this.node == this.nodeDeque.sentinel)
		{
			throw new NoSuchElementException();
		}
		else
		{
			Node node = this.node;
			this.node = this.node.previous;

			return node;
		}
	}

	public void remove()
	{
		Node node = this.node.next;
		if (node == this.nodeDeque.sentinel)
		{
			throw new IllegalStateException();
		}
		else
		{
			node.remove();
		}
	}
}
