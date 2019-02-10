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
+ What is Gradle?
    - Google decided rather than re-writing an entirely new tool to do all of this, it would be better to just leverage an existing build tool called Gradle. The files    built in Gradle are written using a Domain Specific Language (DSL) called Groovy).
    
    - Project & Module

         Project in Android Studio represents a complete Android app - all the source code and assets needed to test code and build configurations. An Android Studio project consist of one or more Modules.

        A Module provides a container for your app's source code, resource files, and app level settings, such as the module-level build file and Android manifest file. Each module can be independently built, tested, and debugged. Android Studio uses modules to make it easy for your project to be available on different devices

        Module level gradle build allows you to configure build settings for the specific module it is located in. 

    - Build Types

        Android will automatically build a debug and release version for any application. The biggest difference between the two is how the APK is signed - the debug version is signed with an auto-generated key + certificate so it can be built on the spot while the release version is not signed during the build, therefore a release key + certificate need to be created and signing happens after the build.    

    
### Project: Musical Structure App
+ Jtunes structure App
    - Music List using ListAdapter extends ArrayAdapter

        I made Music List using ArrayAdapter. I used to make List using BaseAdapter. But this time I tried using ArrayAdapter so I could use Array to the list.
    - Problem when I use ListView

        There were some problems when I use ListView. I try to use onItemOnclicklistener to send info by intent but it doesn't work. So I used Log.d to find out 'Does the app goes into the onItemclickListener?'. I found it doesn't get into the onitemclickListener. So I google the info about onItemClicklistener and I found someone who has same problem with me. And I found if listview layout has button or imagebutton click doesn't work so we should erase or make focusable to false. 
+ Review from Udacity
    - 2 SPECIFICATIONS REQUIRE CHANGES
        All activities should be labeled. And Should use android:parentActivityName=".TheNameOfTheParentActivity” to show back button. 

+ Succeed to pass the review
    - There are some sugestion from Udacity
        - Don't need to create another View object, you could use convertViewdirectly as follows:  
          if(convertView == null){
        - Can implement the ViewHolder pattern in my adapter
          When my code calls findViewByid() frequently during the ListView scrolling, this will cause to slow down its performance.
          Creating a ViewHolder provides that the objects will only be instantiated once, since every time we call thegetView() method, the ViewHolder created in the first call will be reused.
        - Try use styles to make code short.
        - When naming a class in Java, we generally write them in UpperCamelCase and give them the "component type" as a suffix. This way it would be:
          PlayingScreenActivity                
### Images and Visual Polish
+ Why are there different drawable folders?
    Each folders represents a different resolution device. - medium density device, high density device, etc up to extra-extra high density devices.     

### Activity Lifecycle and Audio Playback
+ Media Player States
    - Idle > Prepared > Started > Paused > Started > Stopped > Prepared> Started > ...
      [Link](https://developer.android.com/reference/android/media/MediaPlayer)

    - How to use Media Player
      ```
      MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song);
      mediaPlayer.start();
      mediaPlayer.pause();

      ```
    - Completion
        When the music ends we should info the music is finished. So We use onCompletion() method.
        ```
        mediaPlayer.onCompletionListener(new MediaPlayer.onCompletionlistener(){
            
        });
        ```
+ Activity Lifecycle
+ Audio Focus State
+ Audio Icon
### Practice Set: Activity Lifecycle and Audio Playback
### Fragments
+ Add Up Button
    ```
    <application ... >
    ...
    <!-- The main/home activity (it has no parent activity) -->
    <activity
        android:name="com.example.myfirstapp.MainActivity" ...>
        ...
    </activity>
    <!-- A child of the main activity -->
    <activity
        android:name="com.example.myfirstapp.DisplayMessageActivity"
        android:label="@string/title_activity_display_message"
        android:parentActivityName="com.example.myfirstapp.MainActivity" >
        <!-- Parent activity meta-data to support 4.0 and lower -->
        <meta-data
            android:name="android.support.PARENT_ACTIVITY"
            android:value="com.example.myfirstapp.MainActivity" />
    </activity>
    </application>
    ```
    
### Project: Tour Guide App
