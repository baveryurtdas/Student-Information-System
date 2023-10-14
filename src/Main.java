public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "90500000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Ferhat Aslan", "MAT", "0001");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Mat", "103", "MAT");
        matematik.addTeacher(t3);


        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,matematik);
        s1.addBulkExamNote(90,80,50);
        s1.isPass();

        Student s2=new Student("Düdük Necmi","555","4",tarih,fizik,matematik);
        s2.addBulkExamNote(25,30,70);
        s2.isPass();
    }
}