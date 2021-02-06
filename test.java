public class test{
  public static void main(String[] args) {
    person[] objects = new person[4]; 
    objects[0] = new person("Helen Brown", "222 10th Street, Bethlehem", "(610)334-2288", "hbrown@gmail.com"); // create a new object person 
    objects[1] = new student("Gary Leister", "972 4th Street, Emmaus", "(202)331-7177", "gleister@gmail.com", "12345", "CSE", "3.50"); // create a new object student 
    objects[2] = new employee("Beth Down", "234 Main Street, Philadelphia", "(610)222-4433", "bdown@gmail.com", "33442", "Systems Administrator", "$75000.00", "Wed Sep 09 11:25:05 EDT 2020"); // create a new object employee
    objects[3] = new faculty("Mark Jones", "21 Orchid Street, Bethlehem", "(610)333-2211", "mjone@gmail.com", "22222", "Faculty", "$90000.00", "Wed Sep 09 11:25:05 EDT 2020", "Professor"); // create a new object faculty 
    printArray(objects);
    selectionSort(objects);
    System.out.println("\nSorted List: \n-------------------------\n");
    printArray(objects);
  }
  public static void printArray(person[] list) {
    for (int i=0; i <list.length; i++) {
      System.out.println(list[i].toString());
    }
  }
  public static void selectionSort(person[] list) {
    for(int i=0; i <list.length; i++) {
      String minName = list[i].getName();
      int minIndex = i;
      for(int j=i+1; j<list.length; j++) 
        if(minName.compareTo(list[j].getName())>0) {
          minIndex = j; 
          minName = list[j].getName();
        }
        swap(list, i, minIndex);
    }
}
  public static void swap(person[] names, int i, int j) {
		person temp = names[i];
		names[i] = names[j];
		names[j] = temp;
	}
}