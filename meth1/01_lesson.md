## Lesson objective: Understand and use void methods
time: 45 mins
grade: 9th/10th

# Aim:
- Students will look be able to look at a void method and know what it does
- Students will be able to construct and run their own void methods

# Warm Up: Write the chorus to your favorite song
time: 5 mins

# Lesson Content: Learn functions vocabulary and uses
time: 10 mins
- Vocabulary terms: function name, parameter, local variable, global variable, argument, void, invoke
- Teacher will walk through the different parts of a function and give students the vocabulary names and definitions as students work, example function below:

def  hokey_pokey (body_part):

  #Initialize the local variable and return it
  chorus = (f"You put your {body_part} in
  \nYou put your {body_part} out  
  \nYou put your {body_part} in  
  \nAnd you shake it all about")
  return chorus

  #Initialize the global variable
  lyric = "right hand"

  #Call the function with an argument and print it out
  print(hokey_pokey (lyric))

- Students have to figure out what will print out, and then will come up with other variables to insert
- Students will write their own function with the chorus they wrote for the Do Now and give it at least one parameter
- Students will finish by labeling the different parts of a void function using the vocabulary terms: function name, parameter, local variable, global variable, argument


# Activity:
time: 25 mins

- In partners, students will look at sample void functions and answer the following questions:
  1. What is the name of the function?
  2. What are the global variables?
  3. What are the local variables?
  4. What are the arguments?
  5. What are the parameters?
  6. What does the function print out?
  Note that the functions should not return any value because they are void methods, however they can print out something.

- Students will complete Chapter 4, Exercise 3 in the Think Java textbook:

  1. What is the output of the following program? Be precise about where there are spaces and where there are newlines.
  Hint: Start by describing in words what ping and baffle do when they are invoked.

  2. Draw a stack diagram that shows the state of the program the first time ping is invoked.

  3. What happens if you invoke baffle(); at the end of the ping method? (We will see why in the next chapter.)

  public static void zoop() {
      baffle();
      System.out.print("You wugga ");
      baffle();
  }

  public static void main(String[] args) {
      System.out.print("No, I ");
      zoop();
      System.out.print("I ");
      baffle();
  }

  public static void baffle() {
      System.out.print("wug");
      ping();
  }

  public static void ping() {
      System.out.println(".");
  }

- If students finish the previous parts, they will write their own void method either using pseudocode or using Java. If using Java, they will practice running their code to make sure it works

# Closing: Exit Ticket Assessment

1. What does it mean for a method to be void?

public static void sampleMethod(String name) {
  System.out.println("Hello " + name);
}

2. Circle the parameter in sampleMethod.

3. What does sampleMethod do when invoked?

time: 5 mins
