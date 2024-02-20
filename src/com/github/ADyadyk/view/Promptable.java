package com.github.ADyadyk.view;

public interface Promptable {
    /**
     * Метод, получающий String
     * @param message
     * @return
     */
    String promptString(String message);

    /**
     * Метод, получающий int
     * @param message
     * @return
     */
    int promptInt(String message);

    /**
     * Метод, получающий boolean
     * @param message
     * @return
     */
    boolean promptBoolean(String message);
}
