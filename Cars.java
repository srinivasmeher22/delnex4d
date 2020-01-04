package pro;
public class Cars {
	String model;
	String color;
	String location;
	String showroomname;
	
	public String getShowroomname() {
		return showroomname;
	}
	public void setShowroomname(String showroomname) {
		this.showroomname = showroomname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Cars(String showroomname, String location, String model, String color) {
		super();
		this.showroomname = showroomname;
		this.location = location;
		this.model = model;
		this.color = color;
		
		
	}
	@Override
	public String toString() {
		return "Cars [showroomname=" + showroomname + ", location=" + location + ", model=" + model + ", color=" + color
				+ "]";
	}
	
	

}
