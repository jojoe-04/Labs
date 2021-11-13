object Classes {

  def main(args: Array[String]): Unit = {
    val jojoe = new Person("Jojoe", 25);
    println(jojoe.name);

    val user1 = new User("Jojoe", "jojoeainoo@gmail.com", "980021");
    println(user1.createUsername);

    val user2 = new User();
    println(user2.name);
  }

  class Person(val name: String, val age: Int); // primary constructor

  class User(val name: String, val email: String, val password: String) {
    // aux constructor
    def this() = this("No name", "gmail", "password");
    def this(name: String) = this(name, "gmail", "password");
    def createUsername() = { name.slice(-1, 2) + email.slice(1, 3); }
  }

  // INHERITANCE

}
