import static org.junit.Assert.*;
import org.junit.*;
import enclosure_management.*;
import dinosaur_management.*;
import behaviours.*;

public class DinosaurManagementTest {

// DinosaurFactory dinosaurFactory;
// Dinosaur dinosaur;

  Enclosure enclosure1;
  Enclosure enclosure2;
  Enclosure enclosure3;
  TRex tRex1;
  TRex tRex2;
  TRex tRex3;
  Stegosaurus stegosaurus1;
  Stegosaurus stegosaurus2;
  EnclosureManagement enclosureManagement;


  @Before
  public void before(){
    enclosure1 = new Enclosure("T-Rex Paddock", 60);
    enclosure2 = new Enclosure("Herbivore Forest", 100);
    enclosure3 = new Enclosure("Raptor Enclosure", 78);
    tRex1 = new TRex();
    tRex2 = new TRex();
    tRex3 = new TRex();
    stegosaurus1 = new Stegosaurus();
    stegosaurus2 = new Stegosaurus();
    enclosureManagement = new EnclosureManagement();}

@Test
public void canCreateNewDinosaur(){
  DinosaurFactory dinosaurFactory = new DinosaurFactory();
  Dinosaur dinosaur = dinosaurFactory.createDinosaur("Trex");

  // TRex original = (TRex) dinosaur;
  // assertEquals("RAWR.", original.makeNoise());

  assertEquals("RAWR.", dinosaur.makeNoise());
  // assertEquals("RAWR.", dinosaur.noise());
  
}

@Test 
public void canAccessEnclosuresFromDMfile(){
  enclosureManagement.addToHoldingPen(tRex1);
  enclosureManagement.moveDinosaur(enclosure1, tRex1);
  enclosureManagement.addToHoldingPen(tRex2);
  enclosureManagement.moveDinosaur(enclosure2, tRex2);
  enclosureManagement.addToHoldingPen(tRex3);
  enclosureManagement.moveDinosaur(enclosure2, tRex3);
  assertEquals(1, enclosure1.enclosureContentsCount());
  assertEquals(2, enclosure2.enclosureContentsCount());
  
}





// if the compile thinks that the variable is a Dinosaur, it can only do what the dinosaur can do.
// casting gives us access to all the methods on the type
}

