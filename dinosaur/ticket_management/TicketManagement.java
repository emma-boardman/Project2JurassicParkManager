package ticket_management;


public class TicketManagement{

TicketFactory ticketFactory;


public TicketManagement(TicketFactory ticketFactory){
    this.ticketFactory= ticketFactory;
  }     


public Ticket createTicket(String type){
  Ticket ticket;
  ticket = ticketFactory.createTicket(type);
  return ticket;
}


// // a method to create a new dinosaur 
//   // imagining that the type could be selected from the dropdown menu
// public Ticket buyTicket(String type, int num){
//   Ticket ticket;
//   Tickets tickets = new Tickets();
//   do {
//     ticket = ticketFactory.createTicket(type);
//     tickets.add(ticket); 
//   }while(num >= 0) ;
   
//   return tickets; }






// a method to feed a dinosaur

// a method to tranquilise a dinosaur

// public class TicketManagement {

//   int ticketsAvailable = 100;
//   // when this reaches 0, no more people can enter the park 
//   int ticketsSold = 0;
//   // when a sell tickets method is called with an argument passed in, ticketsSold goes up by that number, and capacity decreases by that number
//   int orderNumber = 2;

//   public TicketManagement(int ticketsAvailable, int ticketsSold){
//     this.ticketsAvailable = ticketsAvailable;
//     this.ticketsSold = ticketsSold;
//     this.orderNumber = orderNumber;
// }

// // someone orders 2 tickets. while tickets printed <= order number, create a new class. 

// public sellTicket(Ticket ticket)


// // 

//     private static int ticketCount = 0;

//     public Ticket() {
//         if (this.getClass() == Foo.class) {
//             fooCount++;
//         }
//     }

//     public static int getFooCount() {
//         return fooCount;
//     }
// }



// when a ticket is sold, that number of tickets is created. 
// seperate methods for each ticket type
// create a sell adult tickets method 
// count whether the methods exist buy putting them in an arraylist?




    // Simplest version: 
    // Have a set number of tickets, be able to sell these tickets. 
    // Have a set number of differently priced kids tickets 
    // Perform analysis on ticket sales
    // Add extras to tickets, such as shows [shows will have their own respective capacities]
    // add group discounts
    // refunds for eaten group members 

    // requiredSpaceInMetres = 60;
  

}