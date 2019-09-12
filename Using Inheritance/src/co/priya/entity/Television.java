package co.priya.entity;

public class Television extends Product {
	
	private int screenSize;
	private String screenType;
	
	public Television() {
		
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	 public void print()
	 {
		 super.print();
		 System.out.println("Screen Size is "  + screenSize);
		 System.out.println("Screen Type is "  + screenType);
	 }
	

}
