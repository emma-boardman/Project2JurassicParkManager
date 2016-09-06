package ticket_management;

public class TicketFactory {

//this class encapsulates the object creation for all dinosaurs 
Ticket ticket;

public Ticket createTicket(String type){
  this.ticket = ticket;

  if(type.equals("Adult")){
    ticket = new AdultTicket();
  }
  else if(type.equals("Kids")){
    ticket = new KidsTicket();
  }
  else if(type.equals("Conc.")){
    ticket = new ConcessionTicket();
  }

  return ticket;
  }

}