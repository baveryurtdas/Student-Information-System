public class Teacher {
    String name;
    String cellno;
    String branch;


    Teacher(String name, String branch,String cellno){
        this.name=name;
        this.cellno=cellno;
        this.branch=branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.cellno);
        System.out.println("Bölümü : " + this.branch);
    }
}
