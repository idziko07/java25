public class Teacher extends People{
    private String nameSchool;
    private String education;
    private String workExperience;

    public Teacher(String firstName, String lastName, int age, String nameSchool, String education, String workExperience) {
        super(firstName, lastName, age);
        this.setNameSchool(nameSchool);
        this.setEducation(education);
        this.setWorkExperience(workExperience);
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Pracuje: " + getNameSchool() );
        System.out.println("Doświadczenie w zawodzie: " + getWorkExperience());
        System.out.println("Wykształcenie: " + getEducation());
    }
}
