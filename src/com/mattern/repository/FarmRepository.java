package com.mattern.repository;

import com.mattern.domain.Chick;
import com.mattern.domain.Farm;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author smattern on 05/10/16.
 */
public class FarmRepository {

    // Logger
    private static final Logger log = Logger.getLogger(FarmRepository.class.getName());

    private Farm farm;

    public FarmRepository(){
        farm = new Farm();
    }

    /**
     * Delete
     */
    public void delete(int index){
        farm.getFarm().remove(index);
    }

    /**
     * Append a chick.
     *
     * @param chick
     */
    public void append(Chick chick) {
        farm.getFarm().add(chick);
    }

    /**
     * Iterate over the list.
     */
    public void iterate(){
        ArrayList<Chick> resultSet = farm.getFarm();
        for (Chick chick : resultSet) {
            log.info(chick.getName());
        }

    }
}
