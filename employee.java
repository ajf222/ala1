class employee extends person{
  // data
  String id; // initalize id 
  String title; // initalize title
  String annualSalary; // initalize annual salary 
  String hireDate; // initalize hire date 
  // constructors 
  public employee(){
    super(); // construct an object employee
    id = "none"; title = "none"; annualSalary = "none"; hireDate = "none"; // construct an object employee
  }
  public employee(String n, String a, String p, String e, String i, String t, String s, String h){
    super(n, a, p, e); // construct an object employee
    id = i; title = t; annualSalary = s; hireDate = h; // construct an object employee
  }
  // methods
  void setID(String i){
    id = i; // set id to i 
  }
  void setTitle(String t){
    title = t; // set title to t
  }
  void setAnnualSalary(String s){
    annualSalary = s; // set annual salary to a
  }
  void setHireDate(String h) {
    hireDate = h; // set hire date to h
  }
  String getID(){
    return id; // return id 
  }
  String getTitle(){
    return title; // return title
  }
  String getAnnualSalary(){
    return annualSalary; // return annual salary 
  }
  String getHireDate(){
    return hireDate; // return hire date 
  }
  public String toString(){
    return "Name: " + getName() + "\n" + "Adress: " + getAdress() + "\n" + "Phone: " + getPhone() + "\n" + "Email: " + getEmail() + "\n" + "ID: " + getID() + "\n" + "Title: " + getTitle() + "\n" + "Annual Salary: " + getAnnualSalary() + "\n" + "Hire Date: " + getHireDate() + "\n"; // return all elements as one string 
  }
}
