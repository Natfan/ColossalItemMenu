package net.colossal.itemMenus;

import org.bukkit.inventory.ItemStack;

public class ComboMenuItem extends SubMenuItem {
    private final ItemClickHandler handler;

    public ComboMenuItem(final String displayName, final ItemMenu menu, final ItemClickHandler handler,
                         final ItemStack icon, final String... lore) {
        super(displayName, menu, icon, lore);
        this.handler = handler;
    }

    @Override
    public void onItemClick(final ItemClickEvent event) {
        if (this.handler != null) { this.handler.onItemClick(event); }
        super.onItemClick(event);
    }
}
