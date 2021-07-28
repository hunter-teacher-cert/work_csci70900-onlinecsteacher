Add a file or files into your repo describing this data structure and the algorithms for the operations.


Classes:
- Person (instance variables: String lastName, String firstName, String phoneNumber)

   public class Person {
     private String lastName;
     private String firstName;
     private String phoneNumber;


     // other members not shown
   }    

- PhoneBook (instance variable: Person)
          //name = primary key
          //binary search in sorted list is most efficient
          //BinarySearchTree _could_ be best data structure in this case

  public class PhoneBook{
      // implementation not shown

      Methods in PhoneBook class:
      - add(Person) //Add by lastName
               //add(Person) Binary search tree sorted by lastName
      - find("Last Name")
      - remove("Last Name")
      - printList()
  }

1. add - you should be able to add new people [Person objects] in to the PhoneBook by
  lastName [such that they are sorted by lastName]. This operation should be optimized to be as fast as possible.

   run time: O (log N)
   //N= individual entries in PhoneBook
   //L= length of last name  

  //tokenized String lastName with char values cast as int;
  //['s']['m']['i']['t']['h']
   //[19][13][9][20][9]   

   //['s']['m']['i']['t']['h']['y']
    //[19][13][9][19][20][8][25]   

/*
//OPTION 1
for (i=0;i<searchedLastName[].length();i++)
{
if (phoneBookLastName1[i]==searchedLastName2[i])
}

//OPTION 2
while ()
{

}
*/
2. find - you should be able to find a person by lastName. For example,  
   pb.find("Smith") would return the person in the phone book with  
   last name "Smith". Assume that last names are unique. Find should  
   return null if the person is not in the phone book. This  
   operation should be optimized to be as fast as possible.

   run time: O (log N)
   //traverse binary search tree

3. remove - remove a person from the list based on lastName. This  
   operation does not have to be optimized.

   run time: O (log N)

4. printList - this would print out an entire phone book. This  
   operation does not have to be optimized.

   run time: O (N)


print()
   goLeft()
   process
   goRight()
