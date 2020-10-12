/*
 * 
 * Student Number: C18732695
 * Student Name: Rosa Cigersa
 * OOSD Assignment 2 Calculator
 *
 */

//Provides the graphical user interface for the calculator system

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

//MigLayout is an extremely flexible layout manager that can be used in many different 
//ways to layout components using a single and consistent API.
//The main features are:
//1- String based constraints makes the layout code portable, short, human readable and easy
//to implement for XUL and GUI builders.
//2- From v2.0 there is also an API to create constraints. 
//This means that whatever your preference is, String or API, you can 
//use Mig Layout to create your layouts.
//3- MiG Layout is the most flexible layout engine to date, capable of doing everything 
//that all major Layout Managers can, with one API.
//4- Extensible Units that can can be used to layout components with everything from 
//screen percentage to millimeters.
//5- GUI toolkit dependence put in three simple wrapper classes makes MiG Layout trivial 
//to port to for instance .NET or any other GUI toolkit.
//6- MiG Layout is free to use and is Open Source.

import net.miginfocom.swing.MigLayout;
 

//declaring a public Calculator class
public class NewCalculator extends JFrame implements ActionListener // implements ActionListener
{

  /**
*
*/
	
//The point of serialVersionUID is to give the programmer control over which versions of 
//a class are considered incompatible in regard to serialization. As long as the 
//serialVersionUID stays the same, the serialization mechanism will make a best effort to 
//translate serialized instances, which may not be what you want.
	
private static final long serialVersionUID = 1L;

//main method

//Global variables
//All methods receive some form of input, perform a process, and return an output. 
//The main data types are int(i.e. 1, 2, 3...), double (i.e. 1.0, 2.7, 0.8....),
//char(a,b,c,d,+,-,#...), and string(hello, yes, hi, word up....).
 JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
 JButton backbutton, plusbutton, subbutton, CEbutton, Cbutton, equalbutton, mulbutton, divbutton;
 JButton Dotbutton, MRbutton, MSbutton, plusmbutton, minusmbutton, MCbutton;
 JButton plusminusbutton, squarebutton, percentbutton, invbutton, powerbutton;
 
 //A JTextField is a box that contains a line of text. The user can type text into the box
 //and the program can get it and then use it as data. The program can write the results 
 //of a calculation to a JTextField.
 JTextField field1;
 
 double result=0,memory=0,n1=0;
 
 //basic calculation for the 1st number
 double first=1;
 
//percentage calculation for the 1st number 
//Real floating-point type, usually referred to as a double-precision floating-point type.
 double num;
 
 //add digits
 double opt=2;
 
 //Basic signed integer type. Capable of containing at least the [−32,767, +32,767] range.
 int oper1=0,oper2=0;
 
 //Constructor a calculator
  NewCalculator()
  {
 
   setTitle("Calculator");
   setSize(4000, 4000);
   setResizable(false);
   //Exit the application using the System exit method.
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   Components();
   
  }
 
 
  //GUI
 
 void Components()
 {
 
     //Main Text Field
 
     field1 = new JTextField(30);
     field1.setText("0");
     add(field1,BorderLayout.NORTH);
     
     //A border layout lays out a container, arranging and resizing its components
     //to fit in five regions: north, south, east, west, and center. 
     //Each region may contain no more than one component, and is identified by a 
     //corresponding constant: NORTH, SOUTH, EAST, WEST, and CENTER. 
     field1.setHorizontalAlignment(JTextField.RIGHT);
               
     JPanel p1 = new JPanel();
     p1.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
     
   
     //First Line of the Calculator
     
     //MC Button
     MCbutton = new JButton("MC");
     p1.add(MCbutton);
     
     //MR Button
     MRbutton = new JButton("MR");
     p1.add(MRbutton);
     
     //MS Button
     MSbutton = new JButton("MS");
     p1.add(MSbutton);
     
     //M+ Button
     plusmbutton = new JButton("M+");
     p1.add(plusmbutton);
     
     //M- Button
     minusmbutton = new JButton("M-");
     p1.add(minusmbutton, "wrap");
     
     //Second Line of the Calculator
 
     
     //back button
     backbutton = new JButton("←");
     p1.add(backbutton);
     
     //CE Button
     CEbutton= new JButton("CE");
     p1.add(CEbutton);
     
     //C Button
     Cbutton = new JButton("C");
     p1.add(Cbutton);
     
     //PlusMinus Button
     plusminusbutton= new JButton("+/-");
     p1.add(plusminusbutton);
     
     //Square Root Button
     squarebutton = new JButton("√");
     p1.add(squarebutton, "wrap");
     
     //Third Line of the Calculator
     
     //7 Button
     button7 = new JButton("7");
     p1.add(button7);
     
     //8 Button
     button8= new JButton("8");
     p1.add(button8);
     
     //9 Button
     button9 = new JButton("9");
     p1.add(button9);
     
     //Divide Button
     divbutton = new JButton("/");
     p1.add(divbutton);
     
     //Percentage Button
     percentbutton = new JButton("%");
     p1.add(percentbutton, "wrap");
     
     //Fourth Line of the Calculator
     
     //4 Button
     button4= new JButton("4");
     p1.add(button4);
     
     //5 Button
     button5 = new JButton("5");
     p1.add(button5);
     
     //6 Button
     button6= new JButton("6");
     p1.add(button6);
     
     //Multiplication Button
     mulbutton = new JButton("*");
     p1.add(mulbutton);
     
     //Power Button
     powerbutton = new JButton("^");
     p1.add(powerbutton, "wrap");
     
     //Fifth Line of the Calculator
     
     //1 Button
     button1 = new JButton("1");
     p1.add(button1);
     
     //2 Button
     button2= new JButton("2");
     p1.add(button2);
     
     //3 Button
     button3 = new JButton("3");
     p1.add(button3);
     
     //Sub Button
     subbutton = new JButton("-");
     p1.add(subbutton);
     
     //Inverse Button
     invbutton = new JButton("1/x");
     p1.add(invbutton, "wrap");
     
     //Sixth Line of the Calculator
     
     //0 Button
     button0= new JButton("0");
     p1.add(button0, "span 2");
     
     //Dot Button
     Dotbutton= new JButton(".");
     p1.add(Dotbutton);
     
     //Plus Button
     plusbutton = new JButton("+");
     p1.add(plusbutton);
     
     //Equal Button
     equalbutton = new JButton("=");
     p1.add(equalbutton);
     
     add(p1);
     
     //End of the Calculator
     
     //Add events
     
     //ActionListener in Java is a class that is responsible in handling all action 
     //events such as when the user clicks on a component. Mostly, action listeners are 
     //used for JButtons. An ActionListener can be used by the implements keyword to the 
     //class definition. It can also be use separately to the class by creating a new class 
     //that implements it. It should also be imported to your project. The method 
     //actionPerformed handles the all the actions, and also here, you will defined or 
     //write your own codes what will happened when an action occurred.
     
     button0.addActionListener(this);
     button1.addActionListener(this);
     button2.addActionListener(this);
     button3.addActionListener(this);
     button4.addActionListener(this);
     button5.addActionListener(this);
     button6.addActionListener(this);
     button7.addActionListener(this);
     button8.addActionListener(this);
     button9.addActionListener(this);
     CEbutton.addActionListener(this);
     Cbutton.addActionListener(this);
     equalbutton.addActionListener(this);
     Dotbutton.addActionListener(this);
     MRbutton.addActionListener(this);
     MCbutton.addActionListener(this);
     MSbutton.addActionListener(this);
     backbutton.addActionListener(this);
     plusbutton.addActionListener(this);
     subbutton.addActionListener(this);
     mulbutton.addActionListener(this);
     divbutton.addActionListener(this);
     plusmbutton.addActionListener(this);
     minusmbutton.addActionListener(this);
     plusminusbutton.addActionListener(this);
     percentbutton.addActionListener(this);
     invbutton.addActionListener(this);
     squarebutton.addActionListener(this);
     minusmbutton.addActionListener(this);
     powerbutton.addActionListener(this);
 }
 
 // ActionListeners
 
 public void actionPerformed(ActionEvent evt)
 {
 
    String str = null;
   
    //the number buttons
  //the 0 button
   
    
    //getSource returns the object on which the event occurred
     if(evt.getSource()==button0)
     {
     
         if(opt==1)
             str=String.valueOf(field1.getText())+0;
         else
        	 //This method, String.valueOf has the following variants, which depend on the 
        	 //passed parameters. This method returns the string representation of the 
        	 //passed argument
             str=String.valueOf(" ")+0;
         opt=1;
                 field1.setText(str);  
         
     }
   
   //the 1 button
   
     else if(evt.getSource()==button1)
     {
     
         if(opt==1)
             str=String.valueOf(field1.getText())+1;
         else
             str=String.valueOf(" ")+1;
         opt=1;
         field1.setText(str);
         
     }
   
   //the 2 button
   
     else if(evt.getSource()==button2)
     {
     
         if(opt==1)
            str=String.valueOf(field1.getText())+2;
         else
             str=String.valueOf(" ")+2;
         opt=1;
         field1.setText(str);
     }
   
   // the 3 button
   
     else if(evt.getSource()==button3)
     {
     
         if(opt==1)
            str=String.valueOf(field1.getText())+3;
         else
            str=String.valueOf(" ")+3;
         opt=1;
         field1.setText(str);
     }
   
   //the 4 button
   
     else if(evt.getSource()==button4)
     {
     
         if(opt==1)
            str=String.valueOf(field1.getText())+4;
         else
            str=String.valueOf(" ")+4;
         opt=1;
         field1.setText(str);
     }
   
   //the 5 button
   
     else if(evt.getSource()==button5)
     {
     
         if(opt==1)
           str=String.valueOf(field1.getText())+5;
         else
           str=String.valueOf(" ")+5;
         opt=1;
         field1.setText(str);
     }
   
   //the 6 button
   
     else if(evt.getSource()==button6)
     {
     
         if(opt==1)
           str=String.valueOf(field1.getText())+6;
         else
           str=String.valueOf(" ")+6;
         opt=1;
         field1.setText(str);
     }
   
   //the 7 button
   
     else if(evt.getSource()==button7)
     {
     
         if(opt==1)
           str=String.valueOf(field1.getText())+7;
         else
           str=String.valueOf(" ")+7;
         opt=1;
         field1.setText(str);
     }
   
   //the 8 button
   
     else if(evt.getSource()==button8)
     {
     
         if(opt==1)
            str=String.valueOf(field1.getText())+8;
         else
            str=String.valueOf(" ")+8;
         opt=1;
         field1.setText(str);
     }
   
   //the 9 button
   //Button is a control component that has a label and generates an event when pressed. 
     //When a button is pressed and released, AWT sends an instance of ActionEvent to the 
     //button, by calling processEvent on the button.
     else if(evt.getSource()==button9)
{
     
         if(opt==1)
            str=String.valueOf(field1.getText())+9;
         else
            str=String.valueOf(" ")+9;
         opt=1;
         field1.setText(str);
     }

    
   //the C buttons
  //the CE button
   
     else if(evt.getSource()==CEbutton)
     {
     
         result=0;
         first=1;
         opt=2;
         str=String.valueOf('0');
         field1.setText(str);
         
     }
   
   //the C button
   
     else if(evt.getSource()==Cbutton)
     {
     
         result=0;
         memory=0;
         first=1;
         opt=2;
         field1.setText("0");
         
     }
     
     //the back button
     
     else if(evt.getSource()==backbutton)
     {
     
         int len;
         str=field1.getText();
         len=str.length();
         if(len>=1)
           str=str.substring(0,len-1);
         field1.setText(str);
     }
   
    //the plus button
   
    if(evt.getSource()==plusbutton)
    {
   
        if(first==1)
        {
       
            result=num=Double.parseDouble(field1.getText());
            oper1=1;
        }
       
        else
        {
       
            n1=Double.parseDouble(field1.getText());
            oper2=1;
        }
       
        //the previous operator
       
        switch(oper1){
       
        case 1:plus();
               break;
        case 2:sub();
               break;
        case 3:div();
               break;
        case 4:mul();
               break;
        }
    }
   
    //the minus button
   
     else if(evt.getSource()==subbutton)
     {
     
         if(first==1)
         {
         
             result=num=Double.parseDouble(field1.getText());
             oper1=2;
         }
         
        else
        {
       
            n1=Double.parseDouble(field1.getText());
            oper2=2;
        }
         
       // the previous operator
         
         
         //A switch statement allows a variable to be tested for equality against a list 
         //of values. Each value is called a case, and the variable being switched on is 
         //checked for each case.
         
         switch(oper1)
         {
         
        case 1:plus();
               break;
        case 2:sub();
               break;
        case 3:div();
               break;
        case 4:mul();
               break;
        }
         
     }
   
    //Operators are used to perform operations on variables and values.
    //the multiplication button
   
    if(evt.getSource()==mulbutton)
    {
   
        if(first==1)
        {
       
            result=num=Double.parseDouble(field1.getText());
            oper1=4;
        }
       
        else
        {
            n1=Double.parseDouble(field1.getText());
            oper2=4;
        }
       
       //the previous operator
       
        switch(oper1)
        {
       
        case 1:plus();
               break;
        case 2:sub();
               break;
        case 3:div();
               break;
        case 4:mul();
               break;
        }
     }
   
   //the divide button
   
    if(evt.getSource()==divbutton)
    {
   
        if(first==1)
        {
       
            result=num=Double.parseDouble(field1.getText());
            oper1=3;
        }
       
        else
        {
       
            n1=Double.parseDouble(field1.getText());
            oper2=3;
        }
       
       //the previous operator
       
        switch(oper1)
        {
       
        case 1:plus();
               break;
        case 2:sub();
               break;
        case 3:div();
               break;
        case 4:mul();
               break;
        }
     }
   
   //the equal button
   
     else if(evt.getSource()==equalbutton)
     {
     
             double n1=Double.parseDouble(field1.getText());
             
             if(oper1==1)
                 result=result+n1;
             
             else if(oper1==2)
                 result=result-n1;
             
             else if(oper1==3)
                 result=result/n1;
             
             else if(oper1==4)
                 result=result*n1;
             
             else if(oper1==5)
                 result=  (int) Math.pow(result,n1);
             
             else
                 result=Double.parseDouble(field1.getText());
             
             num=result;
             
             str=String.valueOf(result);
             field1.setText(str);
     }
   
    //the to dot/point button
   
     else if(evt.getSource()==Dotbutton)
{
     
         str=String.valueOf(field1.getText())+".";
         field1.setText(str);
     }
   
    //The M buttons
    
    //the MR button
   
     else if(evt.getSource()==MRbutton)
     {
     
         str=String.valueOf(memory);
         field1.setText(str);
         field1.setText(String.valueOf(memory));
     }
   
    //the MC button
   
     else if(evt.getSource()==MCbutton)
     {
     
         memory=0;
         field1.setText("0");
         field1.setText(String.valueOf(memory));

     }
   
    //the MS button
   
     else if(evt.getSource()==MSbutton)
     {
         
         memory=Double.parseDouble(field1.getText());
         str = String.valueOf(0);
         field1.setText(str);
         //field1.setText(String.valueOf(memory));
         
     }
   
    //the M Plus button
   
     else if(evt.getSource()==plusmbutton)
     
     {
     
         memory=memory+Double.parseDouble(field1.getText());
         field1.setText(String.valueOf(memory));
     }
   
    //the M- Button
   
     else if(evt.getSource()==minusmbutton)
     {
     
     memory=memory-Double.parseDouble(field1.getText());
     field1.setText(String.valueOf(memory));
     }
   
   //Calculation/Operations
    //Java divides the operators into the following groups:
    // - Arithmetic operators
    // - Assignment operators
    // - Comparison operators
    // - Logical operators
    // - Bitwise operators
   
    //the +/- button
   
     else if(evt.getSource()==plusminusbutton)
     {
     
         double n1=Double.parseDouble(field1.getText());
         n1=-n1;
         str=String.valueOf(n1);
         field1.setText(str);
     }
   
    //Percent button display
   
     else if(evt.getSource()==percentbutton)
     {
     
         double n1=Double.parseDouble(field1.getText());
         n1=(n1*num)/100;
         str=String.valueOf(n1);
         field1.setText(str);
     }
   
   
    //1/x button display
   
     else if(evt.getSource()==invbutton)
     {
     
         double n1=Double.parseDouble(field1.getText());
         n1=1/n1;
         str=String.valueOf(n1);
         field1.setText(str);
     }
   
    //the power button
   
     else if(evt.getSource()==powerbutton)
     {
     if(first==1)
     {
       
            result=num=Double.parseDouble(field1.getText());
            oper1=5;
        }
       
        else
        {
       
            n1=Double.parseDouble(field1.getText());
            oper2=5;
        }
   
     
     }
   
   
    //the square root button
   
     else if(evt.getSource()==squarebutton)
     {
     
         double n1=Double.parseDouble(field1.getText());
         n1=Math.sqrt(n1);
         str=String.valueOf(n1);
         field1.setText(str);
     }
   
   
     
 }
 
  //plus
 //the + operator is often used to add together two values. 
 //It can also be used to add together a variable and a value, or a variable and 
 //another variable
 
 void plus()
 {
 
     if(first==0)
     
         result=num=result+n1;
         String str=String.valueOf(result);
         field1.setText(str);
         opt=2;
         
         if(oper2!=0)
         {
         
             oper1=oper2;
             oper2=0;
         }
         
         first=0;
 }
 
//minus
 void sub()
 {
 
     if(first==0)
         result=num=result-n1;
     String str=String.valueOf(result);
     field1.setText(str);
     opt=2;
     if(oper2!=0)
       oper1=oper2;
     first=0;
 }
 
//Multiplication
 void mul()
 {
 
     if(first==0)
         result=num=result*n1;
     String str=String.valueOf(result);
     field1.setText(str);
     opt=2;
     if(oper2!=0)
       oper1=oper2;
     first=0;
 }
 
//division
 void div()
 {
 
     if(first==0){
     
         if(n1==0)
             field1.setText("Cannot divide by zero");
         else
             result=num=result/n1;
     }
     
     String str=String.valueOf(result);
     field1.setText(str);
     opt=2;
     if(oper2!=0)
       oper1=oper2;
     first=0;
 }
 
 
 //Public: It is an Access modifier, which specifies from where and who can access 
 //the method. Making the main() method public makes it globally available.
 
 public static void main(String args[])
 {
 
 NewCalculator cal = new NewCalculator();
 cal.setVisible(true);
 cal.pack();
 }
 
}