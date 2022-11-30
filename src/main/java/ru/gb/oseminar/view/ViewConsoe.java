package ru.gb.oseminar.view;

import java.util.List;
import java.util.logging.Logger;

public class ViewConsoe {
    public <T> void viewList(List<T> groupList) {
        Logger logger = Logger.getAnonymousLogger();
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        groupList.forEach(group -> {
            stringBuilder.append(group.toString());
            stringBuilder.append("\n");
        });
        logger.info(stringBuilder.toString());
    }
}
