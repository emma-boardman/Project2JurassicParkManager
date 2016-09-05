import static org.junit.Assert.*;
import org.junit.*;
import enclosure_management.*;
import dinosaur_management.*;
import behaviours.*;


public class EnclosureManagementTest {

Enclosure enclosure1;
Enclosure enclosure2;
Enclosure enclosure3;
TRex tRex1;
TRex tRex2;
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
  stegosaurus1 = new Stegosaurus();
  stegosaurus2 = new Stegosaurus();
  enclosureManagement = new EnclosureManagement();
}

@Test 
public void checkHoldingPenStartsEmpty(){
  assertEquals(0, enclosureManagement.holdingPenSize());
}

}
