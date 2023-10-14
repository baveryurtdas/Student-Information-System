public class Course {
    Teacher courseTeacher; //Dersin öğretmenini temsil eden Teacher sınıfı
    String name;
    String code;
    String prefix;
    int examNote;
    int verbalNote;


    //Ders sınıfının yapıcı metodu (constructor)
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalNote = 0;


    }

    //Dersin öğretmenini eklemek için kullanılan metot
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı ");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }


    }


    //Dersin öğretmenini ekrana yazdıran metot
    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name+" dersinin akademisyeni : " + courseTeacher.name);
        }else{
            System.out.println(this.name+" dersine Akademisyen atanmamıştır.");
        }
    }

}
