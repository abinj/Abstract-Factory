package models;

import interfaces.Army;

/**
 * Created by dxuser on 23/1/17.
 */
public class USArmy implements Army {
    public static final String CHIEF = "US Army Chief";

    @Override
    public String commanderInChief() {
        return CHIEF;
    }
}
