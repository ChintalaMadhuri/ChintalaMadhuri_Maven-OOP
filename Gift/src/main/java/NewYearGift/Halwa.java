package NewYearGift;
public class Halwa extends Sweets
{ 
   private float Halwa_weight;
   private float Halwa_cost;
   Halwa(String name_of_sweet,float halwa_weight,float halwa_cost)
      {
           super(name_of_sweet);
           this.Halwa_weight=halwa_weight;
           this.Halwa_cost=halwa_cost;
      }
 public float cost()
     {
         float c = (float)(Halwa_weight*Halwa_cost);
         return c;
     }
}
         

