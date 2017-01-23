import factories.ForceFactory;
import factories.IndianForceFactory;
import factories.USForceFactory;
import interfaces.AirForce;
import interfaces.Army;
import interfaces.Navy;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("Logger");
    private Army army;
    private Navy navy;
    private AirForce airForce;


    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main main = new Main();

        logger.info("Indian Force");
        main.createForce(new IndianForceFactory());
        logger.info(main.getAirForce().commanderInChief());
        logger.info(main.getArmy().commanderInChief());
        logger.info(main.getNavy().commanderInChief());

        logger.info("\nUS Force");
        main.createForce(new USForceFactory());
        logger.info(main.getAirForce().commanderInChief());
        logger.info(main.getArmy().commanderInChief());
        logger.info(main.getNavy().commanderInChief());
    }

    private void createForce(final ForceFactory forceFactory) {
        setAirForce(forceFactory.createAirForce());
        setArmy(forceFactory.createArmy());
        setNavy(forceFactory.createNavy());
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Navy getNavy() {
        return navy;
    }

    public void setNavy(Navy navy) {
        this.navy = navy;
    }

    public AirForce getAirForce() {
        return airForce;
    }

    public void setAirForce(AirForce airForce) {
        this.airForce = airForce;
    }
}
