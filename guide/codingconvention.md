# First-Robotics-Spring-2020

## Coding conventions

Please always start a new project file with a main comment stating:
  - a)Document name with file type.
  - b)Creator's name with the date it is edited.
  - c)A brief introduction about the document.
  
  ### NOTE: if you are editing an already created document and you are not the original creator please put your name and date it's editied on, after the main comment and title it as "Editors: " if title doesn't exists.
  
  ### Example:
  ```java
  /*
    file: HelloWorld.java
    Creator: Jane doe
    Date created: 2038 - March - 19
    info:
    This file contains a hello world programs which displays hello world message to the user.
  
  */
  
  /*
    Editors:
     1) Biggie smalls edited on 2038 - March - 22
  */
  
  
  ```
  ## Indentation
  Please use following format to properly indent your code:
  ``` java
  
class GravityCalculator 
{
    public static void main(String[] args) 
    {
      double gravity = -9.81; 
      double initialVelocity = 0.0;
      double fallingTime = 10.0;
      double initialPosition = 0.0;
      double finalPosition = .5 * gravity * fallingTime * fallingTime;

      finalPosition = finalPosition + initialVelocity * fallingTime;
      finalPosition = finalPosition + initialPosition;
      System.out.println("An object's position after " + fallingTime + " seconds is " + finalPosition + “ m.");
    }
}

```
## General
Names are CamelCase (namespaces, classes, structs, enums, etc.)

Members are camelBack

Functions are camelBack

No underlines are used

Use short concise names - as short as possible as long as necessary ** E.g. do not use unknown abbreviations like int lnWidth, which is not clear without context, but int lineWidth is clear. **Common short names should be used, e.g. int dpi is Ok, because it is well known.

## Classes, structs and namespaces
shall not contain prefixes or suffixes, and are written CamelCase, starting with a uppercase letter

## Members and Functions
shall not contain prefixes or suffixes, and are written camelBack, starting with a lowercase letter

### Will be adding more stuff soon happy coding :)
