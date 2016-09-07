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


// a method to feed a dinosaur

// a method to tranquilise a dinosaur





// by replacing the new operator with the crate method, avoids concrete instatiations in this class. 




//   method to add a dinosaur to the zoo
// }

  // method to view all current dinosaurs 

  // method to view all current enclosures 

  // method to add the dinosaur to an enclosure

  // method to move the dinosaur between enclosures 

  // method to tranquilise dinosaur




