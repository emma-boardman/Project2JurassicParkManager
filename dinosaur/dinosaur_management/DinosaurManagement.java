package dinosaur_management;
import behaviours.*;
import enclosure_management.*;
import java.util.*;


public class DinosaurManagement {
// // this is where new dinosaurs are ordered. manager would somehow have access to these methods, and be able to input which dinosaur they wanted to create.

// if i added an if statement in this file, this code would have to be modified everytime a new species of dinosaur was introduced. that would be bad.

DinosaurFactory dinosaurFactory;
TRex trex;
EnclosureManagement enclosure_management;
Enclosure enclosure;
ArrayList<Enclosure> enclosures;
ArrayList<Enclosable> enclosure_contents;
Dinosaur dinosaur;

// each enclosure in the array list contains an array list of it's contents. want to access the properties of the contents in each enclosure. 

public DinosaurManagement(DinosaurFactory dinosaurFactory){
    this.dinosaurFactory= dinosaurFactory;
    EnclosureManagement enclosure_management = new EnclosureManagement();
    ArrayList<Enclosure> enclosures = enclosure_management.enclosures;
    ArrayList<Enclosable> enclosure_contents = enclosure.enclosure_contents;

    // this.enclosures = enclosures;
    // this.enclosure_contents = enclosure_contents;
   
  }     

// a method to create a new dinosaur 
public Dinosaur addDinosaur(String species){
  Dinosaur dinosaur;
  dinosaur = dinosaurFactory.createDinosaur(species);
  return dinosaur;
}

// a method to feed each dinosaur in each enclosure based on their dietary requirements
public String feedEnclosureContents(){
for( Enclosure enclosure : enclosures){
  for ( Enclosable each_enclosure_content :enclosure_contents){
  if(dinosaur.confirmDiet().equals("Carnivore")) {
    return "Lowering cow into paddock"; }
    else if(dinosaur.confirmDiet().equals("Herbivore")){
      return "Placing shrubbery in paddock";
    }
  }
  return dinosaur.eatFood();
}
return "Feeding Complete";
}


}






// a method to feed a dinosaur - done.

//  a method to add a dinosaur to the zoo - done.

// a method to add the dinosaur to an enclosure - done.

// a method to move the dinosaur between enclosures - done.

// a method to tranquilise a dinosaur

// a method to view all current dinosaurs 

// a method to view all current enclosures 



