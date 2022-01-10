package it.ciasco.jutility;

import java.util.List;

public class ListUtility {

    /**
     * Checks if the given list is not null and not empty
     * @param list The list to check
     * @return true if the given list is not null and not empty, false otherwise
     */
    public static boolean isNotEmpty(List<?> list) {
        return list != null && !list.isEmpty();
    }

    /**
     * Checks if the given list is null or empty
     * @param list The list to check
     * @return true if the given list is null or empty, false otherwise
     */
    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

}
