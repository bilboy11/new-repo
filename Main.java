abstract class Main {
         //abstract class
            public String name = "Lerex";
            public int age = 20;
            public abstract void study();
        }
        //subclass 
        class Student extends Main {
            public int gradYear = 2020;
            public void study() {
                System.out.println("Best Student");
            }
        }
        class second{
            public static void main(String[] args) {
                Student myStudent = new Student();
                myStudent.study();
                System.out.println(myStudent.name + " " + myStudent.age + " " + myStudent.gradYear);
            }
        }