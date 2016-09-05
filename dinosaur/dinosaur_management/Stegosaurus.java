package dinosaur_management;
import behaviours.*;

public class Stegosaurus extends Dinosaur {

public Stegosaurus() {
  super();
  noiseBehaviour = new Grunt();
  eatingBehaviour = new ChaseWithStones();
}
 

}

// can change the attributes of the stegosaurus here

// could add compatible with and incompatible with info here, and iterate through it for matches in the potential next enclosure. so move to the holding pen, select all enclosures that would be appropriate. 
