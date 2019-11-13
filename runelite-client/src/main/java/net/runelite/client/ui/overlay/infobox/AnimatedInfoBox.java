package net.runelite.client.ui.overlay.infobox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.time.Instant;
import net.runelite.api.Projectile;
import net.runelite.client.plugins.Plugin;

public class AnimatedInfoBox extends InfoBox
{
    private Projectile projectile;

    private int frame_count;

    private int column_count;

    private Rectangle tile;

    private int current_frame_count;

    private Instant instant;

    public AnimatedInfoBox(BufferedImage image, Plugin plugin, Projectile p, Rectangle tile, int frame_count, int column_count)
    {
        super(image, plugin);
        this.projectile = p;
        this.tile = tile;
        this.frame_count = frame_count;
        this.column_count = column_count;
        current_frame_count = 0;
        instant = Instant.now();
    }

    @Override
    public String getText()
    {
        int cycles = projectile.getRemainingCycles();
        int millis = (int)(cycles * (1000 / 60f));
        int seconds = (millis / 1000) % 60;
        millis = millis % 1000;
        String mills = String.format("%02d", millis).substring(0, 2);
        return String.format("%02d.%s", seconds, mills);
    }

    @Override
    public Color getTextColor()
    {
        Color col;
        if (projectile.getRemainingCycles() < 20)
        {
            col = Color.RED;
        }
        else
        {
            col = Color.white;
        }
        return col;
    }

    @Override
    public boolean render()
    {
        return projectile.getRemainingCycles() >= 0;
    }

    @Override
    public void setScaledImage(BufferedImage image)
    {
        int width = image.getWidth(null);
        int height = image.getHeight(null);
        int size = Math.max(width, height);
        float aspect = tile.width / (float)tile.height;
        int newWidth = (int)(size / aspect);
        int newHeight = (int)(size * aspect);
        if (newWidth == tile.width && newHeight == tile.height)
        {
            return;
        }
        tile = new Rectangle(newWidth, newHeight);
        int row_count = (frame_count + column_count - 1) / column_count;
        BufferedImage _image = new BufferedImage(newWidth * column_count, newHeight * row_count, image.getType());
        Graphics g = _image.createGraphics();
        g.drawImage(getImage(), 0, 0, newWidth * column_count, newHeight * row_count, null);
        g.dispose();
        setImage(_image);
    }

    @Override
    public BufferedImage getScaledImage()
    {
        return _getImage();
    }

    private BufferedImage _getImage()
    {
        if (instant == null || tile == null)
        {
            return getImage();
        }
        long millis = Instant.now().toEpochMilli() - instant.toEpochMilli();
        current_frame_count = (int)(millis / 41.666666666666666666666666666667f) % frame_count;
        int x = current_frame_count % column_count;
        int y = current_frame_count / column_count;
        return getImage().getSubimage(x * tile.width, y * tile.height, tile.width, tile.height);
    }
}
