package NewYearGift;
public class Kova extends Sweets
{ 
   private float kova_weight;
   private float kova_cost;
   Kova(String name_of_sweet,float kova_weight,float kova_cost)
      {
           super(name_of_sweet);
           this.kova_weight=kova_weight;
           this.kova_cost=kova_cost;
      }
 public float cost()
     {
         float c = (float)(kova_weight*kova_cost);
         return c;
     }
}
         

