# Android Basics Nanodegree
by Google
## 2018.12.20 ~ 2019.03.20

## Ch.4 Multi-Screen Apps
### Intents and Activities

+ Implicit Intent / Explicit Inent
    1. Implicit Intent\
        <code>Intent intent = new Intent(Intent.ACTION_SENDTO);</code>
    2. Explicit Intent\
        <code>Intent intent = new Intent(this, classname.class);</code>
+ Difference between class and Interface?
    1. Class(Fully implemented)
        - contains state
        - Methods are fully implemented
    
    2. Abstract Class(Partially implemented)
        - Contains state
        - Some methods are fully implemented
        - Some methods are abstract
    
    3. Interface(Not implemented at all)
        - No state
        - All methods are abstract(Not implemented)
        - Interface defines what a class should do but not how to do it.
        - Think about Java class couldn't  get multiple inheritance.


### Java Break: Interfaces
### Arrays,Lists, Loops, & Custom Classes

+ When to use Arrays
    - Travel App (item to pack for traveling) : array of Strings
    - YouTube app (number of views) : integer
    - Setting app (languages supported) : array of Strings
    - Shopping app (whether a product is in stock) : boolean
    - Lottery app (winning combination of 5 numbers for a single round in the lottery) : array of integer
    - Health track app (miles or km walked for each day) : array of float

+ How to use array
    - Create array\
    <code>int[] shoesize = new int[3];</code>
    - Initialize elements in an array\
    <code>shoesize[0] = 5;</code>\
    <code>shoesize[1] = 7;</code>\
    <code>shoesize[2] = 11;</code>
    - Access elements in an array\
    <code>shoesize[0]</code> --> value of 5;\
    <code>shoesize[1]</code> --> value of 7;\
    <code>shoesize[2]</code> --> value of 11;
    - Get the array length\
    <code>showsize.length</code>--> value of 3;
+ How to create and access elements in an ArrayList
    - Create an ArrayList\
    ```
    ArrayList<String> library = new ArrayList<String>();
    ```
    - Add elements in an ArrayList
    ```
    library.add("Momo");
    library.add("Momo");
    //Add an element at a specific index
    library.add(0, "Momo");
    ```

### Java Break: Loops
### Quick Guide to Gradle
### Project: Musical Structure App
### Images and Visual Polish
### Activity Lifecycle and Audio Playback
