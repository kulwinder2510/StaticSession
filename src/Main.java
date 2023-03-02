public class Main {
//    static int a = 8;
static{
    System.out.println("hello from static block");
}
    public static void main(String[] args) {

//        System.out.println(Student.school);
//    }
//}


//        Student s1 = new Student();
//        s1.name = "tom";
//        s1.age = 34;
//
//        Student s2 = new Student();
//        s2.name = "pam";
//        s2.age = 29;
//    }
//}

//
//        Movie m1 = new Movie("herry potter1", 10);
//        Movie m2 = new Movie("herry potter2", 10);
//        Movie m3 = new Movie("herry potter3", 10);
//        Movie m4 = new Movie("herry potter4", 10);
//        Movie m5 = new Movie("herry potter5", 10);
//        System.out.println(Movie.TicketCounter);
//    }
//}

//
//        int b = 1;
//
//        System.out.println(a);
//    }
//}


//        Alien a1 = new Alien();
//        Alien a2 = new Alien();
//
//        a1.age = 25;
//        a1.name = "sam";
//        a1.device = "laptop";
//
//        a2.age = 35;
//        a2.name = "pam";
//
//        System.out.println(a1.device);
//
//        System.out.println(a2.device);
//    }
//}


//        Alien a1 = new Alien();
//        Alien a2 = new Alien();
//
//        a1.age = 25;
//        a1.name = "sam";
//        a1.tech = "laptop";
//
//        a2.age = 35;
//        a2.name = "pam";
//        a2.tech = "java";
//        System.out.println(a1.tech);
//
//        System.out.println(a2.tech);
//    }
//}


        // WITHOUT STATIC

//        StaticKeyword navin = new StaticKeyword();
//        navin.Eid = 568;
//        navin.Salary = 4900;
//        navin.CEO = "mahesh";
//
//        StaticKeyword rahul = new StaticKeyword();
//        rahul.Eid = 684;
//        rahul.Salary = 3595;
//        rahul.CEO = "mahesh";
//
//        // for static
//         navin.CEO = "Larry";
//
//        navin.show();
//        rahul.show();
//
//    }
//}


        MathCalc math = new MathCalc();
//        System.out.println(math.CalculateCube(3));

        System.out.println("area of 3cm circle is " + MathCalc.CalculateAreaOfCircle(3));
    }
}