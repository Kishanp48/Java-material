class String_
{
    public static void main(String args[])
    {
        String str = "Hello Dunyaa!";

        System.out.println(str);
        System.out.println(str.charAt(4));
        System.out.println(str.length());

        String str1 = String.format("Hello %s", "Kishan");
        
        System.out.println(str1);

        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 7));

        System.out.println(str.contains("Hello"));

        System.out.println(String.join("-", "Hello","World","Kp"));

        

    }
}