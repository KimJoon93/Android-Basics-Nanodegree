# Android Basics Nanodegree
by Google
## 2018.12.20 ~ 2019.03.20

## Ch.4 Multi-Screen Apps
### Intents and Activities

+ Implicit Intent / Explicit Inent
    1. Implicit Intent
    ```
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        
        StartActivity(intent);
    ```
    2. Explicit Intent
    ```
        Intent intent = new Intent(this, classname.class);
        StartActivity(intent);
    ```    
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
    - Create array
    ```
    int[] shoesize = new int[3];
    ```
    - Initialize elements in an array
    ```
    shoesize[0] = 5;
    shoesize[1] = 7;
    shoesize[2] = 11;
    ```
    - Access elements in an array
    ```
    shoesize[0]; --> value of 5
    shoesize[1]; --> value of 7
    shoesize[2]; --> value of 11
    ```
    - Get the array length
    ```
    showsize.length --> value of 3
    ```
+ How to create and access elements in an ArrayList
    - Create an ArrayList
    ```
    ArrayList<String> library = new ArrayList<String>();
    ```
    - Add elements in an ArrayList
    ```
    library.add("Momo");
    library.add("LaLaLand");
    //Add an element at a specific index
    library.add(0, "quang");
    ```
    - Access elements in an ArrayList
    ```
    library.get(0);
    library.get(1);
    library.get(2);
    ```
    - Remove elements from an ArrayList
    ```
    //Remove the element at the specific index
    library.remove(2);
    ```
    - Get the ArrayList length or size
    ```
    library.size();
    ```
+ Why don't we use ArrayList instead of array?\
    Each one has another functions that fits to the program. If we want fixed size such as Weekday,(Monday, tuesday, ...) we can use array.
    But if we want fluid situation we could use ArrayList.

    Question | Array | ArrayList
    --------- | --------- | ---------
    Can change size once created? | No | Yes
    Is a class? | No | Yes
    Uses methods to access and modify elements? | No | Yes
    What can it store? | Primitive and Objects | Only objects

+ View Recycling
    - ListView + Adapter (Memory is limited Source)\
    There are some reason why we use ListView + Adapter. If we use LinearLayout instead of ListView + Adapter, the memory higly goes up
    when we use the app. Memory is limited so we have to make the app work smartly.\
    We can check memories in Tools - Android - Enable ADB(Android Debug Bridge) integration 

+ Using ListView
    - When we want to use ListView. We should learn Adapter.
    ```
    ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

    ListView listView = (ListView) findViewById(R.id.list);

    listView.setAdapter(itemsAdapter);
    ```

### Java Break: Loops
+ While
    ```
    while(on){
        beep();
        on = checkAlarm();
    }
    ```
    This basically means that the single while block can replace all those repeat if block until break.\
    While loops are really good at repeating things for as long as some condition stays true.

+ 3 Dice
    - Wrong Answer
    ```
    While(!(dice1== dice2==dice3)){
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        count = count + 1; 
    }
    ```
    - Right Answer
    ```
    While(!(dice1 == dice2 && dice2 == dice3)){
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        count = count + 1; 
    }
    ```
+ Count the block 
    - You need to implement this function public int countBlocks(int levels) that takes the number of levels as an input argument and returns the number of blocks required to build a pyramid made up of that many levels.

    - Remember that for loops help count up to a certain number (which is the value of levels in this case) and inside the loop, the number of blocks for that level would be the result of multiplying the loop counter by itself (for example i*i)

    - This means that if for every level, the number of blocks in that level was added to some variable total then by the end of the loop the total number of blocks needed to build the entire pyramid would be in that total variable and could be returned as the result of that function!
    
    ```
    public int countBlocks(int levels){
    
    int total = 0;
    
    for(int i = 1; i < levels+1; i++){
        total = total + (i*i);
    }
    return total;
    }
    ```
+ Loop counter 
    
    Instruction | Short-hand | Effect
    --------- | --------- | ---------
    i = i+1; | i++; | 10 -> 11
    i = i-1; | i--; | 10 -> 9
    i = i+5; | i+=5; | 10 -> 15
    i = i-6; | i-=6; | 10 -> 4
    i = i*3; | i*=3; | 10 -> 30
    i = i/2; | i/=2; | 10 -> 5

+ Press Conference
    
    ```
    String [] newsOutlet = {"abc","bbc","CNN","CBS","AP","NBC","FOX","npr","sky","MBC"};
    double lucky = Math.random();

    lucky * 10;
    int luckyIndex = (int) lucky;
    system.out.print(newsOutlet[luckyIndex])
    ```

+ Array Search
    - How do we Search minimal speed in array

    ```
    public double search(double[] speed){
        int size = speed.length;
        double min = speed[0];
        for(int i=1; i < size; i++){
            if(speed[i]<min){
                min = speed[i];
            }
        }
    }
    ```
+ Find longest name

    ```
    public String findLongestName(String [] names){
    
    int size = names.length;
    String longestName = names[0];

    for(int i=1; i<size; i++){
        if(longestName.length() < names[i].length()){
            longestName = names[i];
            }
        }
    return longestName;
    }
    ```
    - But there are problem with tie. If max size words are apple and grape than longestName returns the first array.

+ 2D arrays
    ```
    int total = 0;
    for(int i = 0; i < 4; i++;){
        for(int j=0; j<5; j++){
            total += grades[i][j];
        }
    }
    ```
    
### Quick Guide to Gradle

### Project: Musical Structure App

### Images and Visual Polish

### Activity Lifecycle and Audio Playback
