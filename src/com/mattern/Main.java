package com.mattern;

import com.mattern.service.Service;

import java.util.logging.Logger;

public class Main {

    // Logger
    private static final Logger log = Logger.getLogger(Main.class.getSimpleName());

    /**
     * Default constructor.
     */
    public Main() {
        doAction();
    }

    /**
     * Do action.
     */
    private void doAction() {
        Service s = new Service();
        s.doAction();
    }

    /**
     * @param args arguments
     */
    public static void main(String[] args) {
        new Main();
    }
}
