I. Collection Framework:
   A. Introduction to the Collections Framework
      1. Create a program that stores a list of student names using an ArrayList. Add at least 5 student names to the list. Then, print the list of student names.
      2. Create a program that stores a set of unique email addresses using a HashSet. Add at least 5 email addresses to the set. Ensure that there are no duplicate email addresses in the set. Then, print the set of email addresses.
      3. Create a program that stores a mapping of country codes to country names using a HashMap. Add at least 5 country codes and their corresponding country names to the map. Then, print the map.
      4. Modify the library catalog example to use a TreeSet to store the books in the catalog, sorted by title.

   B. Lists: ArrayList and LinkedList
      1. Create a LinkedList of strings representing a playlist of songs. Implement methods to add a song to the end of the playlist, add a song to the beginning of the playlist, and remove a song from the playlist.
      2. Create a LinkedList of integers. Write a method to reverse the order of the elements in the list.
      3. Implement a simple queue using a LinkedList. The queue should have methods to enqueue (add an element to the end), dequeue (remove an element from the beginning), and peek (view the first element without removing it).
      
   C. Sets: HashSet and TreeSet
      1. Duplicate Removal: Given a list of strings, use a HashSet to remove all duplicate strings and print the unique strings.
      2. Sorted Names: Given a list of names, use a TreeSet to store the names in alphabetical order and print the sorted list.
      3. Custom Sorting: Create a class Employee with attributes name and salary. Use a TreeSet with a custom Comparator to sort employees based on their salary in descending order.
      4. Performance Test: Create two large sets (one HashSet and one TreeSet) with 1 million random integers. Measure the time it takes to add, remove, and check for the existence of elements in both sets. Analyze the performance differences.
      
   D. Maps: HashMap and TreeMap
      1. Word Frequency Counter: Write a program that reads a text file and counts the frequency of each word using a HashMap. Ignore case and punctuation.
      2. Sorted Contact List: Create a contact list application that stores names and phone numbers in a TreeMap. Allow the user to add, remove, and search for contacts. The list should always be sorted alphabetically by name.
      3. Custom Sorting: Create a class Student with fields like name and gpa. Create a TreeMap that sorts students by their GPA in descending order.
      4. Null Handling: Experiment with inserting null keys and values into HashMap and TreeMap. Observe the behavior and exceptions that occur.
      
   E. Iterators and Comparators
      1. Create a Student class with attributes like name, ID, and GPA. Implement the Comparable interface to sort students by their ID in ascending order.
      2. Create a Book class with attributes like title, author, and publication year. Create a Comparator to sort books by publication year in descending order.
      3. Given a list of employees with attributes like name, department, and salary, sort the employees first by department (alphabetically) and then by salary (highest to lowest) within each department using chained comparators.
    
II. Multithreading & Concurrency:

   A. Creating and Managing Threads
      1. Thread Creation: Create two classes, one extending Thread and the other implementing Runnable. Both classes should print a message indicating they are running, sleep for 2 seconds, and then print a message indicating they are finished. Start both threads and observe their output.
      2. Thread Joining: Modify the previous exercise to use the join() method in the main thread to wait for both threads to complete before printing a final message.
      3. Thread Interrupt: Create a thread that continuously prints a message until it is interrupted. In the main thread, start the thread, let it run for 5 seconds, interrupt it, and then wait for it to terminate using join().
      4. Thread Priority: Create three threads with different priorities (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY). Each thread should print its name and priority, then run a loop that increments a counter a large number of times. Observe the order in which the threads execute and how their priorities affect their execution.
      
   B. Thread Synchronization and Locking
      1. BankAccount Synchronization: Create a BankAccount class with methods for deposit and withdraw. Ensure that these methods are thread-safe using synchronized blocks. Simulate multiple threads depositing and withdrawing money concurrently and verify that the final balance is correct.
      2. Fair Lock Implementation: Modify the ReentrantLockCounter example to use a fair lock. Observe the difference in thread execution order.
      3. Producer-Consumer with Multiple Producers and Consumers: Extend the BoundedBufferExample to use multiple producer threads and multiple consumer threads. Monitor buffer state.
      
   C. Understanding Deadlock and Race Conditions
      1. Deadlock: Modify the DeadlockExample to use resource ordering to prevent the deadlock. Instead of having ThreadA acquire resource1 then resource2, and ThreadB acquire resource2 then resource1, force both threads to acquire resource1 before resource2.
      2. Timeout: Extend the TimeoutDeadlockPrevention example to include more descriptive logging to better understand when timeouts occur and how they impact the program's execution. Experiment with different timeout values.
      3. Atomic Variables: Implement a simple banking application where multiple threads perform deposit and withdrawal operations on a shared account. Use AtomicInteger or AtomicLong to ensure that the balance is updated atomically.
      
   D. Executor Framework and Thread Pools
      1. Fixed Thread Pool with Task Prioritization: Create a fixed thread pool with 3 threads. Submit 5 tasks to the pool, assigning priorities to each task (e.g., using PriorityBlockingQueue). Ensure that higher-priority tasks are executed before lower-priority tasks. Implement a Callable task that returns the task's priority after execution.
      2. Dynamic Thread Pool with Monitoring: Implement a dynamic thread pool using ThreadPoolExecutor. Configure the pool to start with 2 core threads and scale up to 5 maximum threads. Use a LinkedBlockingQueue for the work queue. Implement a monitoring thread that periodically prints the pool size, active thread count, and queue size to the console. Submit a series of tasks with varying execution times to observe the dynamic scaling of the thread pool.
      3. Scheduled Task Execution: Create a scheduled thread pool with 1 core thread. Schedule a task to run every 5 seconds. The task should print the current time to the console. After 30 seconds, cancel the scheduled task and shut down the thread pool.
      
III. Generics and Lambda Expressions:

   A. Introduction to Generics: Type Safety
      1. Generic Stack: Create a generic Stack<T> class with push and pop methods. Implement it using an ArrayList.
      2. Generic Max Method: Write a generic method that finds the maximum element in an array of comparable objects.
      3. Type-Safe Cache: Implement a simple type-safe cache using generics. The cache should store key-value pairs, where both the key and value types are generic.
      
   B. Generic Classes and Methods
      1. Generic Stack: Implement a generic Stack<T> class with push, pop, and peek methods. Ensure that the stack can hold elements of any type.
      2. Generic Max: Write a generic method findMax(T[] array) that finds the maximum element in an array of comparable objects. Assume that the type T implements the Comparable<T> interface.
      3. Generic Pair Utility: Create a utility class with a generic method that swaps the keys and values of a Pair<K, V> object, returning a new Pair<V, K> object.
      4. Custom Generic Map: Implement a simplified generic Map<K, V> class with put, get, and remove methods. Use arrays internally to store the key-value pairs.
      
   C. Bounded Type Parameters
      1. Create a Generic Class with Upper Bound: Create a generic class ListProcessor<T extends List> that has a method to print the size of the list. Instantiate it with ArrayList and LinkedList.
      2. Create a Generic Method with Multiple Bounds: Create a generic method that accepts an object that implements both Comparable and Serializable interfaces. The method should serialize the object to a file.
      3. Lower Bounded Wildcard: Write a method that adds an Integer to a list that can hold Number or any of its superclasses.
      
   D. Lambda Expressions: Functional Interfaces
      1. Create a functional interface called StringConverter with a method that takes a String as input and returns a String as output. Implement this interface using a lambda expression that converts a string to uppercase.
      2. Write a method that takes a list of integers and a Predicate<Integer> as input and returns a new list containing only the integers that satisfy the predicate. Use this method to filter out all even numbers from a list of integers.
      3. Create a functional interface called Calculator with a method that takes two integers as input and returns an integer as output. Implement this interface using lambda expressions for addition, subtraction, multiplication, and division.
      4. Given a list of strings, use a method reference to sort the list in alphabetical order.
   
   E. Method References
      1. Static Method Reference: Create a functional interface called NumberParser with a method that takes a string and returns an integer. Use a static method reference from the Integer class.
      2. Instance Method Reference (Particular Object): Create a class Counter with an instance method increment. Create an instance of Counter and use an instance method reference to increment the counter multiple times using a functional interface.
      3. Instance Method Reference (Arbitrary Object): Given a list of strings, use a method reference to trim each string in the list (using String::trim).
      4. Constructor Reference: Create a functional interface that creates a new ArrayList from a given array. Use a constructor reference to ArrayList to implement this interface.
      
IV. Java 8+:

   A. Streams API: Processing Data Collections
      1. Given a list of integers, use the Streams API to find the sum of all even numbers greater than 10.
      2. Given a list of strings, use the Streams API to find the longest string.
      3. Given a list of Person objects (with name and age properties), use the Streams API to find the average age of people whose names start with "A".
      4. Using the Product class from the previous example, create a stream pipeline to find the names of all products that cost more than INR50 and belong to the "Electronics" category, sorted alphabetically.
      
   B. Date and Time API: java.time package
      1. Date Arithmetic: Write a program that takes a date as input (year, month, day) and calculates the date 3 weeks from that date.
      2. Time Zone Conversion: Given a specific LocalDateTime, convert it to ZonedDateTime for both "Asia/Tokyo" and "Europe/London" time zones and print the results.
      3. Event Countdown: Create a program that calculates the number of days, hours, and minutes until a specific future event (e.g., a product launch, a birthday).
      4. Parse and Format: Take date in the format "MM/dd/yyyy hh:mm a" and convert to "yyyy-MM-dd HH:mm:ss"
      
   C. Default and Static Methods in Interfaces
      1. Create an interface called Calculator with methods add(int a, int b) and subtract(int a, int b). Add a default method multiply(int a, int b) that provides a default implementation by returning a * b. Create a class MyCalculator that implements Calculator and overrides only the add and subtract methods. Test all three methods.
      2. Create two interfaces, Flyable and Swimmable, each with a default method move(). Create a class Duck that implements both interfaces. Resolve the diamond problem by overriding the move() method in Duck and providing a combined implementation (e.g., print "Duck is flying and swimming").

V. Logging Fundamentals:

   A. Introduction to Logging
      1. Identify Logging Opportunities: Consider a simple Java application you've worked on (e.g., a basic calculator or a "Hello, World!" program). Identify at least three places where adding logging statements would be beneficial for debugging or monitoring. Specify what information you would log at each location and at what logging level (e.g., DEBUG, INFO, WARN, ERROR).
      2. Design a Log Message Format: Create a template for a log message format that includes a timestamp, logging level, class name, method name, and a message. Explain why you chose the specific format and how it would improve log readability and analysis.
      3. Error Handling and Logging: Write a short Java code snippet that simulates a potential error scenario (e.g., dividing by zero, accessing an out-of-bounds array element). Implement error handling using a try-catch block and log the exception details (including the stack trace) at the ERROR level.

VI. Debugging:

   A. IntelliJ IDEA Debugger: Setting Breakpoints:
      1. Line Breakpoint Exercise: Write a simple Java program that calculates the factorial of a number. Set a line breakpoint inside the loop to observe the intermediate values.
      2. Method Breakpoint Exercise: Create a class with multiple methods. Set method breakpoints on different methods and observe the order in which they are hit during execution.
      3. Field Watchpoint Exercise: Create a class with a private field. Set a field watchpoint on the field and observe when it's accessed and modified.
      4. Exception Breakpoint Exercise: Write a program that intentionally throws a NullPointerException. Set an exception breakpoint for NullPointerException and observe the program pausing when the exception is thrown.

   B. Step-Over, Step-Into, Step-Out: Navigating Code Execution:
      1. Debugging a Simple Calculation: Create a Java program with a few methods that perform arithmetic operations (addition, subtraction, multiplication, division). Introduce a bug in one of the methods (e.g., incorrect calculation). Use Step-Into, Step-Over, and Step-Out to locate and fix the bug.
      2. Debugging a String Manipulation: Write a Java program that manipulates strings using various methods (e.g., substring, replace, toUpperCase). Introduce a bug that causes the string to be formatted incorrectly. Use the debugging commands to trace the execution and identify the source of the error. Use Smart Step-Into when a single line has multiple string operations.
      3. Debugging a Loop: Create a Java program with a for or while loop that iterates through an array or list. Introduce a bug that causes the loop to terminate prematurely or access an invalid index. Use the debugging commands to step through the loop iterations and identify the cause of the bug.





#JavaScript
1. TO-DO list App using HTML,CSS<Javascript
  Features:
   Add new tasks
   Mark tests as completed
   Delete tasks
   Persistent list(using localStorage)
