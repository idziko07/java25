public class Student extends People {
    private String univesity;
    private String fieldOfStudy;
    private int semestr;

    public Student(String firstName, String lastName, int age, String univesity, String fieldOfStudy, int semestr) {
        super(firstName, lastName, age);
        this.setUnivesity(univesity);
        this.setFieldOfStudy(fieldOfStudy);
        this.setSemestr(semestr);
    }

    public String getUnivesity() {
        return univesity;
    }

    public void setUnivesity(String univesity) {
        this.univesity = univesity;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Studiuje na " + getUnivesity());
        System.out.println("Na kierunku: " + getFieldOfStudy());
        System.out.println("Semestr: " + getSemestr());
    }
}
