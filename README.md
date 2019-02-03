# Anroid-Basics-Nanodegree
by Google
## 2018.12.20 ~ 2019.03.20

## Ch.3 User Input
### Making an App Interactive: Part 1
+ Create Coffee machine
+ Try using method that calls when button is clicked. 
+ Using variable means kind of using boxes. Such as putting information to the boxes.
For example We want information num=5 then we should use integer or etc. So we put int num=5 to the boxes.
+ If we want to use "" in String we should use backslash with \".

### Making an App Interactive: Part 2
### Practice Set: Making an App Interactive
### Project ScoreKeeper App
### Object-Oriented Programming: Part 1
### Object-Oriented Programming: Part 2
### Practice Set: Object-Oriented Programming
### Project: Quiz App
+ Color Quiz App\
    I made color quiz app solving which one is correct color name.
    I made 5 question that gives 20 points and if we click score btn it checks the question is right or wrong.
    And I give toast message what point we get. 

+ Review from Udacity\
    I got a review from Udacity that app has 3 things to change. But I think problem occurs because of using less views.
    So I add checkbox for checking "Did you solve by yourself". And I add name EditText so when we click the score button,
    Toast message show us the name and the score. And it works! 

+ Another Review from Udacity\
    What they want from me was quiz like Qusetion: Which one is food? 1. Pizza 2. Hamburger 3. Wood. So I just build Quiz app
    again.There were no problems in java or layout but there were problems in quiz.     

+ Pass the Review\
    I did pass the review but there are some recomendation from udacity.
    1. Layout is too long. A tip to minimize it's XML layout size is to use the tag include.\
    [Check here to tag include](https://developer.android.com/training/improving-layouts/reusing-layouts)
    2. Try to use xml string file. 
    3. Try use Style.xml
    4. set text size using the dimens.xml file, as follows:
     ```
        android:textSize="@dimen/text_size"
        ```
        And then, set it in res/values/dimen.xml file as follows:
        ```
        <dimen name="text_size">16sp</dimen> 
        ```


