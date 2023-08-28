// interface computer
// {
//     public void code();
   
// }


// class Laptop implements computer
// {
//     public void code()
//     {
//         System.out.println("code, compile,run");
//     }
// }


// class Desktop implements computer
// {
//     public void code()
//     {
//         System.out.println("Coding faster...");
//     }
// }


// class Develepor 
// {
//     public void devApp(computer desk)
//     {
//         desk.code();
       
//     }
// }

// public class InterfaceNeed
// {
//     public static void main(String[] args)
//     {
//         computer desk = new Desktop();
//         computer lap = new Laptop();
//         Develepor Arshu = new Develepor();
//         Arshu.devApp(lap);
//         Arshu.devApp(desk);
    
//     }
// }

//multiple interface
// interface FirstInterface
// {
//     public void myMethod();

// }

// interface SecondInterface
// {
//     public void myOtherMethod();

// }

// class Demo implements FirstInterface , SecondInterface
// {
//     public void myMethod()
//     {
//         System.out.println("Some Text...");
//     }
//     public void myOtherMethod()
//     {
//         System.out.println("Some other Text...");
//     }
// }

// public class InterfaceNeed
// {
//     public static void main(String[] args)
//     {
//         Demo obj = new Demo();
//         obj.myMethod();
//         obj.myOtherMethod();
//     }
// }


//interface - interface is used when we have only abstract classes only
interface dentist
{
                                   // in interface the primitive data types like int and string are FINAL and STATIC,so ww have to initialize value(final),we have no need to create object since it is static in nature
    void appointment();
    void treatment();
}
interface patientsDetails
{
    String patientsName = "Pooja"; 
    int patientsAge = 35;
    String problem = "RootCanal"; 
}

class doctor implements dentist , patientsDetails
{
    public void appointment()
    {
        System.out.println("Appointement on Thursday...");
    }
    public void treatment()
    {
        System.out.println("Treatment is done and given some medicines...");
    }
}
public class InterfaceNeed
{
    public static void main(String[] args) 
    {
        doctor obj = new doctor();
        System.out.println(obj.patientsName);
        System.out.println(obj.patientsAge);
        System.out.println(obj.problem);
        obj.appointment();
        obj.treatment();

       
    }
}

//class - class --> extends
//interface - class --> implements
//interface - interface --> extends987