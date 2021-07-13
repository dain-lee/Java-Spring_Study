
class Foo{
    public static String classVar = "I class var"; // static - class 소속
    public String instanceVar = "I instance var"; // static X - instance 소속
    public static void classMethod() {
        System.out.println(classVar); // Ok
//      System.out.println(instanceVar); // Error - 클래스로 정의된 변수나 메소드는 클래스를 통해서 접근 가능하지만 인스턴스로 정의된 변수나 메소드는 해당 클래스의 인스턴스를 생성해야만 접근할 수 있음
    }
    public void instanceMethod() {
        System.out.println(classVar); // Ok
        System.out.println(instanceVar); // Ok
    }
}
public class StaticApp {
 
    public static void main(String[] args) {
        System.out.println(Foo.classVar); // OK
//      System.out.println(Foo.instanceVar); // Error
        Foo.classMethod();
//      Foo.instanceMethod(); // Error - class를 통해 instance method에 접근할 수 없음
         
        Foo f1 = new Foo();
        Foo f2 = new Foo();
//      
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
//      
        f1.classVar = "changed by f1"; // static variable
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
//      
        f1.instanceVar = "changed by f1"; // nonstatic variable
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }
 
}
