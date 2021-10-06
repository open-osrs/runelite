public class RuneLiteObject extends GraphicsObject
{
	public Model model;
	public boolean loop;

	public RuneLiteObject() {
		super.isFinished = true;
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

	@Override
	public void advance(int var1)
	{
		if (super.sequenceDefinition != null) {
			super.advance(var1);
			if (this.loop && super.isFinished) {
				super.isFinished = false;
				super.frame = 0;
				super.frameCycle = 0;
			}

		}
	}

	@Override
	public Model getModel()
	{
		if (super.sequenceDefinition != null)
		{
			return super.sequenceDefinition.transformSpotAnimationModel(this.model, super.frame);
		}
		else
		{
			return this.model.toSharedSequenceModel(true);
		}
	}

	public void setModel(Model var1) {
		this.model = var1;
	}
}
