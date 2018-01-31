public class School {
    public static void main(String[] args) {
        Student student = new Student("Karolina","Kowalska", 25,"Uniwersytet Ekonomiczny","Rachunkowość",4);

        Teacher teacher = new Teacher("Anna","Sowa",40,"Szkoła Podstawowa","Wyższe","5 lat w nauki w gimnazjum, 4 lata szkoła podstawowa.");

        student.show();
        System.out.println();
        teacher.show();
    }

}
