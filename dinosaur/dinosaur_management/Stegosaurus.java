package dinosaur_management;
import behaviours.*;

public class Stegosaurus extends Dinosaur {

public Stegosaurus() {
  super();
  noiseBehaviour = new Grunt();
  eatingBehaviour = new ChaseWithStones();
}
 

}