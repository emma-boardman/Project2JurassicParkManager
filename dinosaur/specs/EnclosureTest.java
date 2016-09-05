import static org.junit.Assert.*;
import org.junit.*;
import enclosure_management.*;
import dinosaur_management.*;
import behaviours.*;

public class EnclosureTest {

  Enclosure enclosureOne;
  TRex trexOne;

  @Before
  public void before(){
    enclosureOne = new Enclosure("Enclosure 1", 60);
    trexOne = new TRex();
  }

@Test
public void canGetName(){
 assertEquals("Enclosure 1", enclosureOne.getName());
}

@Test
public void startsWithEmptyEnclosure() {
  assertEquals(0, enclosureOne.enclosureContentsCount());
}

@Test
public void canAddcontents() {
  enclosureOne.contentsAdd(trexOne);
  assertEquals(1, enclosureOne.enclosureContentsCount());
}

@Test
public void canKillAllContents() {
 enclosureOne.contentsAdd(trexOne);
 assertEquals(1, enclosureOne.enclosureContentsCount());
  enclosureOne.contentsClear();
  assertEquals(0, enclosureOne.enclosureContentsCount());
}

// @Test
// public void canRemoveContentsfromEnclosure(){
//    enclosureOne.contentsAdd(trexOne);
//    assertEquals(1, enclosureOne.enclosureContentsCount());
//     enclosureOne.contentsRemove();
//     assertEquals(0, enclosureOne.enclosureContentsCount());
//   }

// @Test
// public void canReturnContentsOnRemove(){
//   enclosureOne.contentsAdd(trexOne);
//   Trex returnedTRex = enclosureOne.contentsRemove(trexOne);
//   assertEquals("RAWR.", returnedTRex.makeNoise());
// }

// in enclosure management, create a holding pen, and test whether the dinosaur can be put in it. 

}