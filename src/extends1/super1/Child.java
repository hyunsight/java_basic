package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능 (생략 시, 자기 자신부터 찾음), this: 자기 자신
        System.out.println("super value = " + super.value); //super: 부모

        this.hello(); //this 생략 가능
        super.hello();
    }
}
