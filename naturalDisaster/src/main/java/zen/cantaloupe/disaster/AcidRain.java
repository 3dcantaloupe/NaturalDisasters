package zen.cantaloupe.disaster;

import java.lang.Math;
import org.bukkit.event.Listener;
import java.util.concurrent.TimeUnit;
//import org.bukkit.event.weather;

public class AcidRain implements Listener{
    private int randNumbe;
    private naturalDisaster plugin;
    private int time;
    private AcidRain obj;

    public AcidRain() {
        this.plugin = plugin;
        this.obj = this;
    }
    public static boolean canAcid() throws InterruptedException {
        int breh = 0;
        System.out.println("IT WORKSSSSS LES GOOOO");
        boolean t = true;
        while ( t = true){
            int randNumber = (int) (Math.random() * 20);
            TimeUnit.SECONDS.sleep(3);
            System.out.println(randNumber);
            breh = randNumber;
        }

        if (breh > 18){
            return true;
        }
        else{
            return false;
        }
    }

    


}
