//Anonymous Class is a Inner Class which is declared without using any class name they are defined inside another class
//Anonymous Class is always a Child Class which is created by referncing from Parent Class
//functions in anonymous class can only be called when its real function is declared in parent class

class Greeting {
    public void hello() {
        System.out.println("Hello World!");
    }

    public void print(int a) {
    }// creating function to use in anonymous class cause its overriden and it will
     // do Late binding of function
}

class India {
    // format -> A g = new B();
    Greeting g = new Greeting() {// here Greeting() is anonymous class and Greeting is Refrence variable of
                                 // Parent Greeting
        public void hello() {
            System.out.println("Namaste");
        }

        public void print(int x) {
            for (int i = 0; i < x; i++) {
                System.out.print(i + " ");
            }
        }
    };// last semicolon is necessary

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//GENERICS:
//generics basic meaning in java is just Generalization of Functions or methods
//generics helps to clear method overloading part where ur function is called by many datatypes this makes your code untidy
//We can use as many generics as possible in function 
//Generics Declaration should be before return types in "<" & ">" angular bracketts generally we give captial letters as generics name but any word as we like can give in angular brackets all willl do good 


//Generic Methods
class generics {

    public <E> void print(E temp) {

        System.out.println(temp.getClass() + " = " + temp);

    }
//using random word as GENERIC
    // public <aaaa> aaaa printArray(aaaa[] arr){
    //     for(aaaa i : arr){
    //         System.out.println(i + " ");
    //     }
    //     return arr[arr.length-1];
    // }

    public <E> E printArray(E[] arr){
        for(int i = 0 ; i < arr.length ; i++){// for(E num : arr)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr[arr.length-1];
    }

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Generic Class
//Angular brackets can support only Wrapper class datatypes and no primitive types

class Generic_example <E>{
    E num;
    public void addNum(E x){
        num = x;
    }

    public E getNum(){
        return num;
    }
}

////////////// Main Class ////////////////


public class AnonymousClass_GenericsClassesandMethods {

    public static void main(String[] args) {
        //Anonymous Class
        India india = new India();
        // i is refernce variable and inside this another refernce variable is created
        // so we create in this way
        india.g.hello();// no error Congratulations
        india.g.print(10);
        System.out.println();

        //GENERICS

        //Generic Methods

        generics g = new generics();
        g.print(10);
        g.print("Ritesh");
        g.print(1.0000);
        g.print('c');

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 999};
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y","z"};
        g.printArray(str);
        System.out.println(g.printArray(arr));

        //Generic Class

        //Integer datatype
        Generic_example<Integer> i = new Generic_example<Integer>();//we always need to specify What datatype we need to pass inside Generic class REMEMBER when Creating Hashmaps we use <Integer,Integer> as there are 2 generic keywords in hashmap which store keys and value pairs
        i.addNum(3);
        System.out.println(i.getNum());

        //String datatype
        Generic_example<String> s = new Generic_example<String>();
        s.addNum("Ritesh");
        System.out.println(s.getNum());
    }

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Overriden Methods are always Run at Last in java

// IMPORTANT CONCEPT:
// when i create object of child class with refernced parent class

// like

// A functions(f1(),f2(),f3())
// B functions(f3(),f4())

// A t = new B();
// ab idhar agar mei likhu t.f1,t.f2 ye dono functions call ho jayenge
// lekin jab mei likhu t.f4 tab ye program run nai hoga kyuki ham refernce toh A
// ka bana rhe lekin object hild ka bana rha toh referncve mei jo bhi functions
// hai woh sab call ho jayenge lekin jo B mei hai woh call nai hoga woh error
// batayea kyuki woh function ki early binding ho jayegi

// eek aur catch jab mei t.f3 likhu toh run ho jayeg aprogram kyuki ab idhar f3
// overriden hua hai and overriden methodds jo ki uski late binding hogi ab jiss
// bhi function ki late binding hoti h usko ham call kar sakte hai reference
// variable ki madat se