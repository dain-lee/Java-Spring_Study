
class Print{
	
	public String delimiter = "";
	public Print(String delimiter) { // ������ - class �̸��� ����
		this.delimiter = delimiter; // this - class�� instanceȭ �Ǿ��� �� ������ instance�� ����Ŵ
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

