public class TRexFeeding extends Decorator {
  Ticket ticket;

  public TRexFeeding(Ticket ticket){
    this.ticket = ticket;
  }

  public String getDescription() {
    return ticket.getDescription() + ", T-Rex Feeding Show";
  }

  public double cost() {
    return 5.99 + ticket.cost();
  }
}