## Exceptions Answers

### General:
	
	What is an exception?
	- Something that occurs in a program's execution that disrupts the flow of instructions
	- In Java, it's an object

	What does try/catch do?
	- `try` wraps around the statements where the exception can occur
	- `catch` handles the exception that occurs in the try block
	- See the WordLists homework example

	What does throw mean? When do you use it?
	- `throw` is used to throw Exception explicitly from any method
	- used in method body

	What does throws mean? When do you use it?
	- `throws` is used to declare an Exception
	- used in method header

	What is a Checked Exception? Can you give an example of one?
	- checked at compile time
	- ex) FileNotFoundException

	What are Unchecked Exceptions? Can you give an example of one?
	- not checked at compile time
	- ex) RuntimeException


What will happen when the snippet below is run?

	String s = "hotdogs";
	int x = Integer.parseInt(s);

`Exception in thread "main" java.lang.NumberFormatException: For input string: "hotdogs"`
This is an unchecked exception. 

What will be printed in this case?

	try
	{
		// open a file that doesn't exist
		File badFile = new File("nope.txt");
		Scanner input = new Scanner(badFile);
	}
	catch(Exception e)
	{
		System.out.println("Something broke...");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Wrong filename!");
	}

This will actually cause a compile error (shouldn't catch general Exception before the others)
	