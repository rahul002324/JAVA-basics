class attendance {
    void student(String name){
        System.out.println("attendance : " + name);
    }
    void student(String name , String status){
        System.out.println("attendance : " + (name + " " + status) );
    }
    public static void main(String[] args) {
        attendance a = new attendance();
        a.student("gokila");
        a.student("rahul", "present");
    }
}