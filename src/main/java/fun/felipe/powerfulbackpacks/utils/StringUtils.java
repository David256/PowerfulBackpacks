package fun.felipe.powerfulbackpacks.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.MiniMessage;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static Component format(String input) {
        return MiniMessage.miniMessage().deserialize(input);
    }

    public static Component formatItemName(String nameInput) {
        return format(nameInput).decoration(TextDecoration.ITALIC, false);
    }

    public static List<Component> formatLore(List<String> loreInput) {
        List<Component> lore = new ArrayList<>();
        for (String line : loreInput) {
            lore.add(format(line).decoration(TextDecoration.ITALIC, false));
        }

        return lore;
    }

    public static String strip(Component component) {
        TextComponent text = (TextComponent) component;
        return text.content();
    }
}
