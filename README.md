# AssignmentSolution
Solutioning project for an assignment


question 1)
  1). Currently there is no implementation for sing method in bird class  which is an issue with the current code sinppit. I have implemented a         very basic void sing method which will just print out I'm Sining.
    a). Since this sing method is very basic,  we can not implement so many test cases. I have implement one basic test case which will directly call the sing method.
    b). for the maintainability, Since there are no concrete representation for animal and bird classes, we can make both animal and bird classes abstract and when there is an actual implemntation of bird or animal calss we can have implemntations specific to behaviors of those classes.


question 2)
  To implement the duck we can directly inherit the bird class and override the sing method.Since there is no Swim method we have to add new method called void swim() and provide implemntation for it.
  To implement the chicken, similarly we can implemnt the bird class and override sing method. Since chicken can not fly we can override fly method of the bird class without providing any implementation at chicken class.
  
question 3)
  we can use the same inheritance approch to implement the rooster since rooster is also a bird. we can extend the Bird lass and override sing method to have different implementation for rooster.
  Since chicken and rooster both are same species but they are distinghushed by the gender. Which means most of the behaviours they have are same but some of the behaviors they have are unique to themself. So that we can have a super class which has the common bahaviors of chicken and rooster and at each chicken and rooster class we can have our own implentations for sing method.
  to implement the rooster we can use interfaces if we do not want to use inheritance. Interfaces can also be used to enforce certain behaviors to certain classes and its much more effective than using inheritance. since java doesn't support multiple inheritance, using interfaces to enforce bahaviors would be the idle solution.

Question 4)
  since we need to implement same implementation of parrot with minor differences we can have a parrot factory which will retrun parrot objects based on our needs. It will be very easy to maintain as well since we do not have to maintain seperate classes for each implementation of parrot classes. We can simply provide the difference as a parameter during the object creation and it will alow us to maintain clear code as well.


Question B)
  section 3) to avoid duplicating the code we can use the super class to implement the common behaviors. So that while we extend we can have the common behaviors in child classes.
  if we are using Java8, we can use default methods in interfaces to enforce common functionality where  implementing classes will obtain those functionalities when they implemnts the interface.
  
  Question E)
   we can use reflection to check whether purticular class is having purticular method or not. That way we can easily check how many animal objects are having fly, walk, sing and swim methods.
