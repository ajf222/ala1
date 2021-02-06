class student extends person{
  //data 
  String id; // initalize id 
  String major; // initalize major
  String gpa; // initalize gpa
  //constructors
  public student(){
    super();  // construct an object student
    id = "none"; major = "none"; gpa = "none"; // construct an object student 
  }
  public student(String n, String a, String p, String e, String i, String m, String g){
    super(n, a, p, e); // construct an object student
    id = i; major = m; gpa = g; // construct an object student 
  }
  //methods 
  void setID(String i){
    id = i; // set id to i
  }
  void setMajor(String m){
    major = m; // set major to m
  }
  void setGPA(String g){
    gpa = g; // set gpa to g
  }
  String getID(){
    return id; // return id
  }
  String getMajor(){
    return major; // return major
  }
  String getGPA(){
    return gpa; // return gpa
  }
  public String toString(){
    return "Name: " + getName() + "\n" + "Adress: " + getAdress() + "\n" + "Phone: " + getPhone() + "\n" + "Email: " + getEmail() + "\n" + "ID: " + getID() + "\n" + "Major: " + getMajor() + "\n" + "GPA: " + getGPA() + "\n"; // return all elements as one string 
  }
}