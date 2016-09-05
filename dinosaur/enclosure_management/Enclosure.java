package enclosure_management;
import behaviours.*;
import dinosaur_management.*;
import java.util.*;

public class Enclosure {

String name;
int sizeInMetres; 
ArrayList<Enclosable> enclosure_contents;


public Enclosure(String name, int sizeInMetres){
  this.name = name;
  this.sizeInMetres = sizeInMetres;
  this.enclosure_contents = new ArrayList<Enclosable>();
}

// each enclosure has a name for reference 

public String getName(){
  return this.name;
}

public int enclosureContentsCount(){
  return enclosure_contents.size();
}

public void contentsAdd(Enclosable enclosable){enclosure_contents.add(enclosable);
}

public void contentsClear() {
  enclosure_contents.clear();
}

public Enclosable contentsRemove(Enclosable enclosable) {
  if (enclosure_contents.remove(enclosable)) {
     return enclosable;
  }
  return null;

}

}