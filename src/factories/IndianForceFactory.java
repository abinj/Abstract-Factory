package factories;

import interfaces.AirForce;
import interfaces.Army;
import interfaces.Navy;
import models.IndianAirForce;
import models.IndianArmy;
import models.IndianNavy;

/**
 * Created by dxuser on 23/1/17.
 */
public class IndianForceFactory implements ForceFactory{

    @Override
    public Navy createNavy() {
        return new IndianNavy();
    }

    @Override
    public AirForce createAirForce() {
        return new IndianAirForce();
    }

    @Override
    public Army createArmy() {
        return new IndianArmy();
    }
}
