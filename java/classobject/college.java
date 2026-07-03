class detial {
    String name;
    String dept;
    String reg;

    void datial(){
        System.out.println("name:" + name);
        System.out.println("dept:" + dept);
        System.out.println("reg" + reg);
    }
}
public class college{
    public static void main(String[] args) {
        detial no1 = new detial();
        no1.name = "rahul";
        no1.dept ="msc.cs";
        no1.reg = "RCAS2025MCS009";
        
        detial no2 = new detial();
        no2.name ="naveen";
        no2.dept ="Mcs.cs";
        no2.reg ="RCAS2025MCS010";

        detial no3 = new detial();
        no3.name = "gokila";
        no3.dept = "Mit";
        no3.reg = "RCAS2025MIT008";


        no1.datial();
        no3.datial();
        no2.datial();
    }
}