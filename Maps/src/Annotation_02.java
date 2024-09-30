import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)	// meta annotation

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR,ElementType.METHOD})	// META annotation -> the anotation used to create annotation
@interface Cricket{
	
	String Country() default "India";
	int Age() default 33;
}

// @ this specify the compiler that annotation type is begin created

@Cricket
class CricketPlayer{
	
	private int innings;
	
	@Cricket
	public CricketPlayer() {
			
	}
	
	@Cricket
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	
}

public class Annotation_02 {

	public static void main(String[] args) {
		
		CricketPlayer c = new CricketPlayer();
		
		c.setInnings(345);
		System.out.println(c.getInnings());
		
		System.out.println("********************************");
		
		Class< ? extends CricketPlayer> c1 = c.getClass();
		Annotation an = c1.getAnnotation(Cricket.class);
		Cricket cp = (Cricket)an;
		int age = cp.Age();
		String country = cp.Country();
		
		System.out.println(age + " " + country);
		
	}

}
