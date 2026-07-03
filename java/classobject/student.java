class students {
      private String name;
      private String reg;
      private String dept;

      public void setname(String name) {
        this.name = name;
      }
      public void setreg(String reg){
        this.reg = reg;
      }
      public void setdept(String dept){
        this.dept = dept;
      }
    
      public String getname(){
        return name;
      }
      public String getreg(){
        return reg;
      }

      public String getdept(){
        return dept;
      }
}
public class student{
    public static void main(String[] args) {
        students n = new students();
        n.setname("rahul");
        n.setreg("RCAS2025MCS009");
        n.setdept("Msc.cs");
        System.out.println("name:" + n.getdept());
        System.out.println("dept" + n.getname());
        System.out.println("reg" + n.getreg());

    }
}