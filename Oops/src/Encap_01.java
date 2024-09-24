
class Book{
	
	private int pageNum;
	
	void setPageNum(int pnum){
		
		if(pnum >= 0 ) {
			pageNum = pnum;
		}
		else
			System.out.println("Enter valid Number");
		
	}
	
	int getPageNum() {
		
		return pageNum;
	}
	
	void disp() {
		
		System.out.println("Java Book page number: " + pageNum);
	}
}

public class Encap_01 {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setPageNum(7);
		System.out.println(b.getPageNum());
		b.disp();
		

	}

}
