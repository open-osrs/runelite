import java.util.Iterator;
import java.util.NoSuchElementException;

public class RuneLiteIterableLinkDeque implements Iterator<Link>
{
	public final LinkDeque linkDeque;
	public Link link;

	public RuneLiteIterableLinkDeque(LinkDeque linkDeque)
	{
		this.linkDeque = linkDeque;
		this.link = this.linkDeque.sentinel.previous;
	}

	@Override
	public boolean hasNext()
	{
		return this.link != this.linkDeque.sentinel;
	}

	@Override
	public FriendLoginUpdate next()
	{
		if (this.link == this.linkDeque.sentinel)
		{
			throw new NoSuchElementException();
		}
		else
		{
			FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate) this.link;
			this.link = this.link.previous;

			return friendLoginUpdate;
		}
	}

	public void remove()
	{
		Link link = this.link.next;
		if (link == this.linkDeque.sentinel)
		{
			throw new IllegalStateException();
		}
		else
		{
			link.remove();
		}
	}
}
