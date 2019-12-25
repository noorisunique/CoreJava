package DesignPattern;
//https://www.youtube.com/watch?v=FsS-jWCPtQI

interface WebDriver {
	void getElement();

	void selectelement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("Get Elemet from chrome driver ");

	}

	@Override
	public void selectelement() {
		System.out.println("Select Elemet from chrome driver ");

	}

}

class IEDriver {
	public void findElement() {
		System.out.println("find Elemet from IE driver ");
	}

	public void clickElement() {
		System.out.println("Click Elemet from IE driver ");
	}
}

class WebDriverAdapter implements WebDriver {

	private IEDriver ieDriver;

	WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectelement() {
		ieDriver.clickElement();
	}

}

public class AdapterEx5 {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.getElement();
		cd.selectelement();
		
		IEDriver ieDriver=new IEDriver();
		ieDriver.findElement();
		ieDriver.clickElement();
		
		WebDriver wd=new WebDriverAdapter(ieDriver);
		wd.getElement();
		wd.selectelement();
	}
}
