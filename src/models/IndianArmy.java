package models;

import interfaces.Army;

/**
 * Created by dxuser on 23/1/17.
 */
public class IndianArmy implements Army {
    public static final String CHIEF = "Indian Army Chief";

    @Override
    public String commanderInChief() {
        return CHIEF;
    }
}
