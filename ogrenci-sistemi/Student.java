public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo,String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note1_sozlu, int note2,int note2_sozlu,  int note3,int note3_sozlu){
        if(note1>=0 && note1<=100){
            c1.note = note1;
            c1.sozlu = note1_sozlu;
        }
        if(note2>=0 && note2<=100){
            c2.note = note2;
            c2.sozlu = note2_sozlu;
        }
        if(note3>=0 && note3<=100){
            c3.note = note3;
            c3.sozlu = note3_sozlu;
        }
    }


    void isPass() {
        double tarihAverage = (this.c1.note * 0.8 + this.c1.sozlu * 0.2);
        double physicsAverage = (this.c2.note * 0.8 + this.c2.sozlu * 0.2);
        double jeoAverage = (this.c3.note * 0.8 + this.c3.sozlu * 0.2);

        this.average = (tarihAverage+physicsAverage+jeoAverage)/3.0;

        printNote();

        if (this.average > 55) {
            System.out.println("GEÇTİNİZ");
            this.isPass = true;
        } else {
            System.out.println("KALDINIZ");
            this.isPass = false;
        }
    }

    void printNote(){
        System.out.println(this.name);

        System.out.println(c1.name + " "+ c1.note+ " "+c1.sozlu);
        System.out.println(c2.name + " "+ c2.note+" "+ c2.sozlu);
        System.out.println(c3.name + " "+ c3.note+ " "+c3.sozlu);
        System.out.println(this.average);

    }

}
