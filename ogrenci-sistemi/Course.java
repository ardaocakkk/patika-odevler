public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;



    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;
        sozlu = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            this.teacher.print();
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }


}
