package Family.Child;

import Family.Parent;

class Child extends Parent {
    int value = 20; // 부모의 value와 동일한 이름

    @Override
    void display() {
        super.display(); // 부모 클래스의 display() 메서드 호출
        System.out.println("Family.Child.Child display");
    }
}