class faculty extends employee{
  // data
  String rank; // initalize rank 
  // constructors
  public faculty(){
    super(); // construct an object faculty 
    rank = "none"; // construct an object faculty 
  }
  public faculty(String n, String a, String p, String e, String i, String t, String s, String h, String r){
    super(n, a, p, e, i, t, s, h); // construct an object faculty 
    rank = r; // construct an object faculty 
  }
  // methods
  void setRank(String r){
    rank = r; // set rank to r
  }
  String getRank(){
    return rank; // return rank 
  }
  public String toString(){
    return "Name: " + getName() + "\n" + "Adress: " + getAdress() + "\n" + "Phone: " + getPhone() + "\n" + "Email: " + getEmail() + "\n" + "ID: " + getID() + "\n" + "Title: " + getTitle() + "\n" + "Annual Salary: " + getAnnualSalary() + "\n" + "Hire Date: " + getHireDate() + "\n" + "Rank: " + getRank() + "\n"; // return all elements as one string 
  }
}