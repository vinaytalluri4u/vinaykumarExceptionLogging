package cleancode.interest.constructioncost;

public class Gethousetype {

	public TotalAmount getPlan(String houseType)
	{   
      if(houseType.equalsIgnoreCase("standard material")) {  
             return new StandardMaterial();  
           }   
       else if(houseType.equalsIgnoreCase("Abovestandard material")){  
            return new AbovestandardMaterial();  
        }   
      else if(houseType.equalsIgnoreCase("Highstandard material")) {  
            return new HighstandardMaterial();  
      }
      else if(houseType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighstandardFullautomatic();
      }
  return null;  
}
}
