package com.mattern.service;

import com.mattern.domain.Chick;
import com.mattern.enumaration.ChickType;
import com.mattern.repository.FarmRepository;

import java.util.logging.Logger;

/**
 * @author smattern on 04/10/16.
 */
public class Service {

    // Logger
    private static final Logger log = Logger.getLogger(Service.class.getName());

    public void doAction() {
        FarmRepository farm = new FarmRepository();
        Chick c1 = new Chick(3, "Test1", ChickType.EARTH);
        Chick c2 = new Chick(5, "Test2", ChickType.EARTH);
        farm.append(c1);
        farm.append(c2);
        farm.iterate();
        farm.delete(0);
        farm.iterate();
    }
}
