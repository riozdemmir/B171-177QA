package day03methodobjectcreationscanner;

public class RunnerHomework {

    public static void main(String[] args) {

        TeacherHomework03 ridvanOzdemir = new TeacherHomework03();

        System.out.println("ridvanOzdemir.name = " + ridvanOzdemir.name);
        System.out.println("ridvanOzdemir.age = " + ridvanOzdemir.age);
        System.out.println("ridvanOzdemir.branch = " + ridvanOzdemir.branch);
        System.out.println("ridvanOzdemir.atamaPuani = " + ridvanOzdemir.atamaPuani);
        System.out.println("ridvanOzdemir.calistigiOkul = " + ridvanOzdemir.calistigiOkul);

        ridvanOzdemir.teach();
        ridvanOzdemir.wear();
        ridvanOzdemir.hobiler();

    }

}
