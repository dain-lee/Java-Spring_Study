// Overriding vs Overloading
// this & super

class Cal{
	
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading
    public int sum(int v1, int v2, int v3){
        return this.sum(v1,v2)+v3;
    }
    
}

class Cal3 extends Cal{
	
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        return super.sum(v1,v2); // 부모 클래스 method
    }
 
}

public class InheritanceApp2 {
	
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1)); // 3
        System.out.println(c.sum(2,1,1)); // 4
 
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1)); // Cal3!! 3 - Cal3의 sum 실행
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}

class Cal2{
	
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
    
}
