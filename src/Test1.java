
enum A{
	
}
public class Test1<T> {

	private T t1;
	public T get(){
		return t1;
	}
	public void set(T t1){
		this.t1=t1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 o=new Test1();
		o.set("Demo");
		o.set(10);
		o.set("%");
		System.out.println(o.get());
	}

}
