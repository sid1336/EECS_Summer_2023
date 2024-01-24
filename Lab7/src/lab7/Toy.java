package lab7;

public class Toy {
	
	private int Id;
	private String Name;
	private int Quantity;
	private double Price;
	
	public Toy(int Id, String name, int qty, double price )
	{
		this.Id = Id;
		this.Name = name;
		this.Quantity = qty;
		this.Price = price;
	}
	
	public int getToyID()
	{
		return Id;
	}
	
	public String getToyName()
	{
		return Name;
	}
	
	public int getToyQuantity()
	{
		return Quantity;
	}
	
	public double getToyPrice()
	{
		return Price;
	}
	
	public String getToyInformation() {
        return "Toy(" + this.Id + "," + this.Name + "), quantity(" + this.Quantity + ") with $(" + String.format(" %.2f", this.Price) + ")/toy";
    }
	
	
//setters
	public void setToyID(int Id)
	{
		this.Id = Id;
		
	}
	
	public void setToyName(String Name)
	{
		this.Name = Name;
	}
	
	public void setToyQuantity(int Qty)
	{
		this.Quantity = Qty;
	}
	
	public void setToyPrice(double price)
	{
		this.Price = price;
	}
	
	

}
