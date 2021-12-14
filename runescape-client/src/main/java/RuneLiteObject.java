public class RuneLiteObject extends GraphicsObject
{
	public Model model;
	public boolean loop;

	public RuneLiteObject() {
		super.isFinished = true;
	}

	public boolean isLooping() {
		return loop;
	}

	public boolean isActive() {
		return !super.isFinished;
	}

	public void setActive(boolean active)
	{
		if (super.isFinished == active)
		{
			super.isFinished = !active;

			if (active)
			{
				super.frame = 0;
				super.frameCycle = 0;
				Client.graphicsObjects.addFirst(this);
			}
			else
			{
				remove();
			}

		}
	}

	public void setShouldLoop(boolean var1) {
		this.loop = var1;
	}

	public void setModel(Model var1) {
		this.model = var1;
	}
}
