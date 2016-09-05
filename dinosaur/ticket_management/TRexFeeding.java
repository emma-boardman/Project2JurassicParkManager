public class TRexFeeding extends Decorator {

  Ticket ticket;

  public TRexFeeding(Ticket ticket){
    super(newTicket);
  }

  public String getDescription(){
    return tempTicket.getDescription() + ", T-Rex Feeding" ;
   }

   public double getCost(){
    return tempTicket.getCost() + 5.99;
   }
}