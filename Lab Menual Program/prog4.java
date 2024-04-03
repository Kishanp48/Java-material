class prog4
{


    String name;
    int age;

    // Default constructor
    prog4() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    prog4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    prog4(prog4 s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Using the default constructor
        prog4 student1 = new prog4();
        student1.display();

        // Using the parameterized constructor
        prog4 student2 = new prog4("John", 20);
        student2.display();

        // Using the copy constructor
        prog4 student3 = new prog4(student2);
        student3.display();
    }




    // public static void main(String[] args)
    // {

        // int number = 15;

        // // if statement
        // if (number > 0)
        // {
        //     System.out.println("The number is positive.");
        // }

        // // if-else statement
        // if (number % 2 == 0)
        // {
        //     System.out.println("The number is even.");
        // } else
        // {
        //     System.out.println("The number is odd.");
        // }

        // // if-else-if ladder statement
        // if (number < 10)
        // {
        //     System.out.println("The number is less than 10.");
        // } else if (number < 20)
        // {
        //     System.out.println("The number is less than 20.");
        // } else
        // {
        //     System.out.println("The number is greater than or equal to 20.");
        // }

        // // switch-case statement
        // int day = 3;
        // switch (day)
        // {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     // cases for the rest of the week
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        // }




        // // For loop
        // System.out.println("For loop:");
        // for(int i = 1; i <= 5; i++)
        // {
        //     System.out.println("for: " + i);
        // }

        // // While loop
        // System.out.println("\nWhile loop:");
        // int j = 1;
        // while(j <= 5)
        // {
        //     System.out.println("while: " + j);
        //     j++;
        // }

        // // Do-while loop
        // System.out.println("\nDo-while loop:");
        // int k = 1;
        // do
        // {
        //     System.out.println("do-while: " + k);
        //     k++;
        // }
        // while(k <= 5);
    // }
        
}
