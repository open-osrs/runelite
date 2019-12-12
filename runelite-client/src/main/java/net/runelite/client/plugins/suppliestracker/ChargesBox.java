package net.runelite.client.plugins.suppliestracker;

import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.util.Text;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.util.AsyncBufferedImage;
import net.runelite.client.util.QuantityFormatter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static net.runelite.api.ItemID.*;

public class ChargesBox extends JPanel
{
    private static final int ITEMS_PER_ROW = 5;

    private final JPanel itemContainer = new JPanel();
    private final JLabel priceLabel = new JLabel();
    private final JLabel subTitleLabel = new JLabel();
    private final ItemManager itemManager;
    @Getter(AccessLevel.PACKAGE)
    private final String id;
    private final SuppliesTrackerPlugin plugin;
    private final SuppliesTrackerPanel panel;

    @Getter(AccessLevel.PACKAGE)
    private final List<SuppliesTrackerItem> trackedItems = new ArrayList<>();

    private long totalPrice;

    @Getter(AccessLevel.PACKAGE)
    private final ItemType type;

    ChargesBox(final ItemManager itemManager, final String id,
                final SuppliesTrackerPlugin plugin, final SuppliesTrackerPanel panel,
                final ItemType type)
    {
        this.id = id;
        this.itemManager = itemManager;
        this.plugin = plugin;
        this.panel = panel;
        this.type = type;

        setLayout(new BorderLayout(0, 1));
        setBorder(new EmptyBorder(5, 0, 0, 0));

        final JPanel logTitle = new JPanel(new BorderLayout(5, 0));
        logTitle.setBorder(new EmptyBorder(7, 7, 7, 7));
        logTitle.setBackground(ColorScheme.DARKER_GRAY_COLOR.darker());

        final JLabel titleLabel = new JLabel(Text.removeTags(id));
        titleLabel.setFont(FontManager.getRunescapeSmallFont());
        titleLabel.setForeground(Color.WHITE);

        logTitle.add(titleLabel, BorderLayout.WEST);

        subTitleLabel.setFont(FontManager.getRunescapeSmallFont());
        subTitleLabel.setForeground(ColorScheme.LIGHT_GRAY_COLOR);
        logTitle.add(subTitleLabel, BorderLayout.CENTER);

        priceLabel.setFont(FontManager.getRunescapeSmallFont());
        priceLabel.setForeground(ColorScheme.LIGHT_GRAY_COLOR);
        logTitle.add(priceLabel, BorderLayout.EAST);

        add(logTitle, BorderLayout.NORTH);
        add(itemContainer, BorderLayout.CENTER);

        // Create popup menu
        final JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
        setComponentPopupMenu(popupMenu);

        // Create reset menu
        final JMenuItem reset = new JMenuItem("Reset Category");
        reset.addActionListener(e ->
        {
            for (SuppliesTrackerItem item : trackedItems)
            {
                plugin.clearItem(item.getId());
            }
            clearAll();
            rebuild();
            panel.updateOverall();
        });

        popupMenu.add(reset);

        setVisible(false);
    }

    private void remove(SuppliesTrackerItem item)
    {
        trackedItems.removeIf(r -> r.getId() == item.getId());
        plugin.clearItem(item.getId());
        setVisible(trackedItems.size() > 0);
    }

    void clearAll()
    {
        trackedItems.clear();
        setVisible(false);
    }

    void update(SuppliesTrackerItem item)
    {
        trackedItems.removeIf(r -> r.getId() == item.getId());
        trackedItems.add(item);
        setVisible(trackedItems.size() > 0);
    }

    void rebuild()
    {
        buildItems();

        priceLabel.setText(QuantityFormatter.quantityToStackSize(totalPrice) + " gp");
        priceLabel.setToolTipText(QuantityFormatter.formatNumber(totalPrice) + " gp");

        final long supplies = getTotalSupplies();
        if (supplies > 0)
        {
            subTitleLabel.setText("x " + supplies);
        }
        else
        {
            subTitleLabel.setText("");
        }

        validate();
        repaint();
    }

    private void buildItems()
    {
        final List<SuppliesTrackerItem> items = new ArrayList<>(trackedItems);
        totalPrice = 0;

        for (SuppliesTrackerItem item : items)
        {
            System.out.println(item.getName() + "  -  " + item.getPrice());
            totalPrice += item.getPrice();
        }

        items.sort((i1, i2) -> Long.compare(i2.getPrice(), i1.getPrice()));

        // calculates how many rows need to be displayed to fit all item
        final int rowSize = ((items.size() % ITEMS_PER_ROW == 0) ? 0 : 1) + items.size() / ITEMS_PER_ROW;

        itemContainer.removeAll();
        itemContainer.setLayout(new GridLayout(rowSize, ITEMS_PER_ROW, 1, 1));

        for (int i = 0; i < rowSize * ITEMS_PER_ROW; i++)
        {
            final JPanel slotContainer = new JPanel();
            slotContainer.setBackground(ColorScheme.DARKER_GRAY_COLOR);

            if (i < items.size())
            {
                final SuppliesTrackerItem item = items.get(i);
                final JLabel imageLabel = new JLabel();
                imageLabel.setToolTipText(buildToolTip(item.getId(), item.getQuantity()));
                imageLabel.setVerticalAlignment(SwingConstants.CENTER);
                imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

                AsyncBufferedImage itemImage = itemManager.getImage(item.getId(), item.getQuantity(), item.getQuantity() > 1);
                itemImage.addTo(imageLabel);
                slotContainer.add(imageLabel);

                // create popup menu
                final JPopupMenu popupMenu = new JPopupMenu();
                popupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
                slotContainer.setComponentPopupMenu(popupMenu);

                final JMenuItem reset = new JMenuItem("Reset");
                reset.addActionListener(e ->
                {
                    remove(item);
                    rebuild();
                    panel.updateOverall();
                });

                popupMenu.add(reset);
            }
            itemContainer.add(slotContainer);
        }
        itemContainer.repaint();
    }

    private String buildToolTip(int itemId, int qty)
    {
        if (itemId == SCYTHE_OF_VITUR)
        {
            return "Blood Rune x " + qty * 3 + " (" + QuantityFormatter.quantityToStackSize(itemManager.getItemPrice(BLOOD_RUNE) * qty * 3)
                    +  ") \n\n\n" + "Vial of Blood x " + qty +"/100 (" + QuantityFormatter.quantityToStackSize((itemManager.getItemPrice(VIAL_OF_BLOOD_22446) * qty) / 100) +")";
        }

        return "";
    }

    long getTotalSupplies()
    {
        long totalSupplies = 0;
        for (SuppliesTrackerItem item : trackedItems)
        {
            totalSupplies += item.getQuantity();
        }
        return totalSupplies;
    }

    long getTotalPrice()
    {
        return totalPrice;
    }

}
