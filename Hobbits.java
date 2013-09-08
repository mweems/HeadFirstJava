class Hobbits {
  String name;

  public static void main(String[] args) {
    Hobbits[] hobbit = new Hobbits[3];
    int num = 0;

    while (num < 2) {
      num = num + 1;
      hobbit[num] = new Hobbits();
      hobbit[num].name = "Bilbo";

      if (num == 1) {
        hobbit[num].name = "Frodo";
      }

      if (num == 2) {
        hobbit[num].name = "Sam"; 
      }
      System.out.print(hobbit[num].name + " is a ");
      System.out.println("good Hobbit name");
    }
  }
}