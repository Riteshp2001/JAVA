//1)Nested Class are Classes Made inside another class
//2)nested class are of two types Static and Non-Static
//3)Inner Nested classes can be Public,Protected,Private or Default all four 

//Static Nested Class can access only static members or methods from Parent class
//when we need to call static inner class in another Class File we need to create object of parent class followed by inner class
//Syntax:
// class Parent {
//     static int x = 21;
//     static public class Child{
//         private int y = 19;
//         Child(){
//             //x = 19;
//             x = y;
//         }
//         void test(){
//             System.out.println("My age is " + x);
//         }
//     }
// }
// public class NestedClass {
//     public static void main(String[] args) {
//         Parent.Child obj = new Parent.Child();
//         obj.test();
//     }
// }

//Non-Static Class can access any static/non-static(Instance) members or methods from Parent class
//when we call Non-static Class we need ti create object of parent class first then call child class with help oof parent objecty with new keyword
//Syntax:
class Parent {
    static int x = 21;//static member
    int z = 22;//instance member
    public class Child {
        private int y = 19;//private instance member of child

        Child() {
            // x = 19;
            x = y;
        }

        void test() {
            System.out.println("My age is " + x+" and my big brother age is "+z);
        }

        protected class Grandson extends Child{//Parent->Child->Grandson
           // @Override
            void test(){//method overriding
                System.out.println("hello i am Grandson");
            }

            static{
                System.out.println("hello this is static block it shall initialize first");
            }

        }

    }
}

public class NestedClass {
    public static void main(String[] args) {
        Parent p = new Parent();//parent object
        Parent.Child obj = p.new Child();//child object with help of parent
        Parent.Child.Grandson obj2 = obj.new Grandson();
        obj.test();
        obj2.test();
    }
}