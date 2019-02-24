# AssignmentSolution
Solutioning project for an assignment


question 1)
  1). Currently there is no implementation for sing method in bird class  which is an issue with the current code sinppit. I have implemented a         very basic void sing method which will just print out I'm Sining.
    a). Since this sing method is very basic,  we can not implement so many test cases. I have implement one basic test case which will directly call the sing method.
    b). for the maintainability, Since there are no concrete representation for animal and bird classes, we can make both animal and bird classes abstract and when there is an actual implemntation of bird or animal calss we can have implemntations specific to behaviors of those classes.


question 2)
  To implement the duck we can directly inherit the bird class and override the sing method.Since there is no Swim method we have to add new method called void swim() and provide implemntation for it.
  To implement the chicken, similarly we can implemnt the bird class and override sing method. Since chicken can not fly we can override fly method of the bird class without providing any implementation at chicken class.
  
