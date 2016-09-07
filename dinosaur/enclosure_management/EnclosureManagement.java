package enclosure_management;
import behaviours.*;
import java.util.*;
import dinosaur_management.*;


public class EnclosureManagement {



public ArrayList<Enclosure> enclosures;
public ArrayList<Dinosaur> holdingPen;
// ArrayList<Enclosable> enclosure_contents;
// Enclosure enclosure;


public EnclosureManagement(){
    this.enclosures = new ArrayList<Enclosure>();
    this.holdingPen = new ArrayList<Dinosaur>();
    // ArrayList<Enclosable> enclosure_contents = enclosure.enclosure_contents;

  }     


// a method to check the number of dinosaurs in the holding pen 
public int holdingPenSize() {
  return holdingPen.size();
}

// a method to add a dinosaur to the holding pen
public void addToHoldingPen(Dinosaur dinosaur){
  holdingPen.add(dinosaur);
}

// a method to remove a dinosaur from the holding pen
public void removeFromHoldingPen(Dinosaur dinosaur){
  holdingPen.remove(dinosaur);
}

// a method to take a dinosaur from the holding pen and put it in an enclosure
public void moveDinosaur(Enclosure enclosure, Dinosaur dinosaur){
  removeFromHoldingPen(dinosaur);
  enclosure.contentsAdd(dinosaur);
}

// public void cutPowerToAllEnclosuresThusAllowingAnimalsToStampede(){
//   for( Enclosure enclosure : enclosures){
//     enclosure_contents.clear();}

// }

}