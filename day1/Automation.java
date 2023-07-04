package assignment.week3.day1;

public class Automation extends MultipleLangauge implements TestTool,Language {

	public void Java() {
		
		System.out.println("Java");
	}

	public void Selenium() {
		
		System.out.println("Selenium");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby");
	}

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
	}


}
