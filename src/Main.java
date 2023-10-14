public class Main {
    public static void main(String[] args) {
        Course kimya = new Course("Kimya", "101", "KMY");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course matematik = new Course("Mat", "103", "MAT");

        Teacher t1 = new Teacher("Mahmut Hoca", "KMY", "90500000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Ferhat Aslan", "MAT", "0001");

        kimya.addTeacher(t1);
        fizik.addTeacher(t2);
        matematik.addTeacher(t3);

        Student s1=new Student("İnek Şaban","123","4",matematik,fizik,kimya);
        s1.addBulkExamNote(90,80,50);
        s1.addBulkVerbalNote(100,55,55);
        s1.isPass();

        Student s2=new Student("Düdük Necmi","555","4",matematik,fizik,kimya);
        s2.addBulkExamNote(25,30,70);
        s2.addBulkVerbalNote(100,55,30);
        s2.isPass();

        Student s3=new Student("Baver Yurtdaş","1947","4",matematik,fizik,kimya);
        s3.addBulkExamNote(100,35,65);
        s3.addBulkVerbalNote(100,65,95);
        s3.isPass();
    }
}