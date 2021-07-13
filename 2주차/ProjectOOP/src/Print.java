
class Print{
	
	public String delimiter = "";
	public Print(String delimiter) { // 생성자 - class 이름과 동일
		this.delimiter = delimiter; // this - class가 instance화 되었을 때 생성된 instance를 가리킴
	}
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
 
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
    
}

