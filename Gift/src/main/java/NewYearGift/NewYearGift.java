package NewYearGift;
import java.util.*;
public class NewYearGift 
	    {
	      public static void main(String args[])
	         {
	    	     AddItems a=new AddItems();
	    	     float choc_cost,sweet_cost;
	             float sweet_weight;
	             int no_of_chocolates;
	             int ch,op;
	             Scanner s=new Scanner(System.in);
	             boolean loop=true;
	             while(loop)
	             {
	                 System.out.println("Menu\n");
	                 System.out.println("1.Sweets\n");
	                 System.out.println("2.chocolates\n");
	                 System.out.println("3.exit\n");
	                 System.out.println("Select your item\n");
	                 ch=s.nextInt();
	                 switch(ch)
	                 {
	                     case 1:System.out.println("1.kaja\n");
	                            System.out.println("2.kova\n");
	                            System.out.println("3.Halwa\n");
	                            System.out.println("Select your favourite sweet\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  
	                                  case 1:System.out.println("Enter no of the sweet kaja\n");
	                                         sweet_weight=s.nextFloat();
	                                         Kaja kaja=new Kaja("Kaja",sweet_weight,20);
	                                         sweet_cost=kaja.cost();
	                                         a.addSweets(sweet_cost,"Kaja");
	                                         break;
	                                  case 2:System.out.println("Enter no of the sweet kova\n");
	                                         sweet_weight=s.nextFloat();
	                                         Kova kova=new Kova("Kova",sweet_weight,15);
	                                         sweet_cost=kova.cost();
	                                         a.addSweets(sweet_cost,"Kova");
	                                         break;
	                                  case 3:System.out.println("Enter no of the sweet Halwa\n");
	                                         sweet_weight=s.nextFloat();
	                                         Halwa halwa=new Halwa("Halwa",sweet_weight,10);
	                                         sweet_cost=halwa.cost();
	                                         a.addSweets(sweet_cost,"Halwa");
	                                         break;       
	                               }
	                            break;
	                     case 2:System.out.println("1.Milkybar\n");
	                            System.out.println("2.kisses\n");
	                            System.out.println("3.Fuse\n");
	                            System.out.println("Select your favourite chocolate\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  case 1:System.out.println("Enter no of MilkyBar you want\n");
	                                         no_of_chocolates=s.nextInt();
	                                         MilkyBar milkybar=new MilkyBar("MilkyBar",no_of_chocolates,40);
	                                         choc_cost=milkybar.cost();
	                                         a.addChocolates(choc_cost);
	                                         break;
	                                  case 2:System.out.println("Enter no of Kisses you want\n");
	                                         no_of_chocolates=s.nextInt();
	                                         Kisses kisses=new Kisses("Kisses",no_of_chocolates,10);
	                                         choc_cost=kisses.cost();
	                                         a.addChocolates(choc_cost);
	                                         break;
	                                  case 3:System.out.println("Enter no of Fuse you want\n");
	                                         no_of_chocolates=s.nextInt();
	                                         Fuse fuse=new Fuse("Fuse",no_of_chocolates,10);
	                                         choc_cost=fuse.cost();
	                                         a.addChocolates(choc_cost);
	                                         break;
	                               }
	                            break;
	                     case 3:loop=false;
	                    	    break;
	                    }
	               }
	               a.display();
	          }
	  }

