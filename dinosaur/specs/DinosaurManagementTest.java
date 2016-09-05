import static org.junit.Assert.*;
import org.junit.*;
import enclosure_management.*;
import dinosaur_management.*;
import behaviours.*;

public class DinosaurManagementTest {

DinosaurFactory dinosaurFactory;

@Test
public void canCreateNewDinosaur(){
  Dinosaur dinosaur = dinosaurFactory.createDinosaur("Trex");
  AssertEquals("RAWR.", dinosaur.makeNoise);
}
}


// Dinosaur tRex = createDinosaur.orderDinosaur("Trex");
// System.out.println(tRex);
// // assert

// // calls the orderDinosaur method on the lab, and specifies the species 

// Dinosaur stegosaurus = createDinosaur.orderDinosaur("Stegosaurus");
// System.out.println(stegosaurus);