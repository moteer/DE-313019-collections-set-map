# Exercise Set Map

1. Implement a phonebook which stores contacts. 
2. The phonebook should provide the following methods for the user
   - public void add(String firstName, String lastName, ...) to add a new contact to the phonebook
   - public Contact get(String firstName, String lastName) to retrieve a Contact from the phonebook
   - public Contact remove(String firstName, String lastName) to delete contact from the phonebook, returns the deleted contact
   - Bonus: public Contact getByNumber(String phoneNo) to retrieve a contact by its number

- Hint: a map for the phonebook: key = firstname + lastname, value = Contact-object

3. public void printContactsSortedByFirstname();
4. The toString method should print the phonebook in order of entrance
5. Implement a class PairGenerator that generates random pairs of contacts. The PariGenerator should be able to be used with students too, so that we can generate random study buddies
   - public Set<Team> getTeam() // should return a set of teams with 2 people in each team
   - make use of the PairGenerator with Another Type like e.g. Student(name, lastname, matricleNumber, mainSubject)