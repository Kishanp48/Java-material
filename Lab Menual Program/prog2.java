class prog2
{
    public static void main(String[] args)
    {
        int a=2, b=3, temp;

        float celsius = 25f, fahrenheit;

        int no=2;

        // code for swaping two numbers  
        
        System.out.println("Before swap: a="+a+" and b="+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a="+a+" and b="+b);

        // code for Celsius to Fahrenheit
        fahrenheit = ((celsius * 1.8f) +32);
        System.out.println(celsius+"\u00B0C celsius into Fahrenheit: "+fahrenheit);

        // code for checking number is  positive or negative
        if(no>0)
        {
            System.out.println(no+" is positive");
        }
        else if(no<0)
        {
            System.out.println(no+" is negative");
        }
        else
        {
            System.out.println(no+" is equals to ZERO");
        }
    }    
}
