public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2 = new Teacher("Einstein","333","FZK");
        Teacher t3 = new Teacher("Celal Şengör","421","JEO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("FİZİK","101","FZK");
        fizik.addTeacher(t2);

        Course jeo = new Course("JEOLOJİ","101","JEO");
        jeo.addTeacher(t3);

        Student s1 = new Student("Şaban","123","4",tarih,fizik,jeo);
        s1.addBulkExamNote(100,60,40,80,100,75);
        s1.printNote();
        s1.isPass();




    }
}