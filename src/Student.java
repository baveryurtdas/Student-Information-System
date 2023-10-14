import java.text.DecimalFormat;
public class Student {
    Course mat;
    Course fizik;
    Course kimya;


    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    //Öğrenci sınıfının yapıcı metodu(constructor)
    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0;
        this.isPass = false;
    }

    //Birden fazla sınav notunu eklemek için kullanılan metot
    void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;

        }
        if (fizik >= 0 && fizik <= 100) {
            this.kimya.examNote = fizik;

        }
        if (kimya >= 0 && kimya <= 100) {
            this.fizik.examNote = kimya;

        }

    }

    //Birden fazla sözlü notu eklemek için kullanılan metot
    void addBulkVerbalNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }


    //Öğrencinin başarılı olup olmadığını kontrol eden metot
    void isPass() {
        this.isPass = isCheckPass();
        printNote();

        // Ortalamayı biçimlendirirken Decimal Format kullanma
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedAvarage = decimalFormat.format(this.avarage);

        System.out.println("Ortalama : " + formattedAvarage);
        if (this.isPass) {
            System.out.println(this.name + " Sınıfı geçti.");
        } else {
            System.out.println(this.name + " Sınıfta kaldı.");
        }


    }

    //Notların ortalamasını hesaplayan metot
    public void calcAvarage() {
        this.avarage = ((this.mat.examNote * 0.80) + (this.mat.verbalNote * 0.20) +
                (this.fizik.examNote * 0.80) + (this.fizik.verbalNote * 0.20) +
                (this.kimya.examNote * 0.80) + (this.kimya.verbalNote * 0.20))
                / 3;


    }
    //Öğrencinin başarısını kontrol eden metot
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage >= 55;
    }

    //Notlarını yazdıran metot
    void printNote() {

        System.out.println("      ");
        System.out.println(mat.name + " Dersinin Sınav Notu \t: " + mat.examNote);
        System.out.println(mat.name + " Dersinin Sözlü Notu \t: " + mat.verbalNote);
        System.out.println("      ");
        System.out.println(fizik.name + " Dersinin Sınav Notu \t: " + fizik.examNote);
        System.out.println(fizik.name + " Dersinin Sözlü Notu \t: " + fizik.verbalNote);

        System.out.println("      ");
        System.out.println(kimya.name + " Dersinin Sınav Notu \t: " + kimya.examNote);
        System.out.println(kimya.name + " Dersinin Sözlü Notu \t: " + kimya.verbalNote);
        System.out.println("      ");

    }

}
