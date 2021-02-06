public class person{
  // data 
  String name; // initalize name 
  String adress; // initalize adress
  String phone; // initalize phone
  String email; // initalize email 
  // constructos 
  public person(){
    name = "none"; adress = "none"; phone = "none"; email = "none"; // construct an object person 
  }
  public person(String n, String a, String p, String e){
    name = n; adress = a; phone = p; email = e; // construct an object person
  }
  // methods
  void setName(String n){ 
    name = n; // set name to n
  }
  void setAdress(String a){
    adress = a; // set adress to a
  }
  void setPhone(String p){ 
    phone = p; // set phone to p
  }
  void setEmail(String e){
    email = e; // set email to e
  }
  String getName(){
    return name; // return name 
  }
  String getAdress(){
    return adress; // return adress
  }
  String getPhone(){
    return phone; // return phone
  }
  String getEmail(){
    return email; // return email 
  }
  public String toString(){
    return "Name: " + getName() + "\n" + "Adress: " + getAdress() + "\n" + "Phone: " + getPhone() + "\n" + "Email: " + getEmail() + "\n"; // return all elements as one string
  }
}