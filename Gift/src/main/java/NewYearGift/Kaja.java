package NewYearGift;
public class Kaja extends Sweets
{ 
   private float kaja_weight;
   private float kaja_cost;
   Kaja(String name_of_sweet,float kaja_weight,float kaja_cost)
      {
           super(name_of_sweet);
           this.kaja_weight=kaja_weight;
           this.kaja_cost=kaja_cost;
      }
 public float cost()
     {
         float c = (float)(kaja_weight*kaja_cost);
         return c;
     }
}
         

