package enclosure_management;
import behaviours.*;
import java.util.*;
import dinosaur_management.*;


public class EnclosureManagement {

ArrayList<Enclosure> enclosures;
ArrayList<Dinosaur> holdingPen;


public EnclosureManagement(){
    this.enclosures = new ArrayList<Enclosure>();
    this.holdingPen = new ArrayList<Dinosaur>();
  }     


// a method to check the number of dinosaurs in the holding pen 
public int holdingPenSize() {
  return holdingPen.size();
}

// a method to add a dinosaur to the holding pen
public void addToHoldingPen(Dinosaur dinosaur){
  holdingPen.add(dinosaur);
}




}