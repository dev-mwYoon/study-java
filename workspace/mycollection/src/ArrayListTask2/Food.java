package ArrayListTask2;

public class Food {
	private String name;
	private int price;
	private String category;
	
	public Food() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}
