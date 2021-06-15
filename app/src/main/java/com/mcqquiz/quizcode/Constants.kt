package com.mcqquiz.quizcode

import com.mcqquiz.quizcode.models.Questions

object c1 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"C Language is a successor to which language?", "FORTRAN", "D Language", "BASIC", "B Language", 4)
        questionsList.add(q1)
        val q2=Questions(2,"C is _______ type of programming language?", "Object Oriented", "Procedural", "Bit level language", "Functional", 2)
        questionsList.add(q2)
        val q3=Questions(3,"C language was invented to develop which Operating System.?", "Android", "Linux", "Ubuntu", "Unix", 4)
        questionsList.add(q3)
        val q4=Questions(4,"What is the default C Storage Class for a variable?", "static", "auto", "register", "extern", 2)
        questionsList.add(q4)
        val q5=Questions(5,"Number of Keywords present in C Language are?", "32", "34", "62", "64", 1)
        questionsList.add(q5)
        val q6=Questions(6,"Variables of type auto, static and extern are all stored in .?", "ROM", "RAM", "CPU", "Compiler", 2)
        questionsList.add(q6)
        val q7=Questions(7,"Which among the following is a Global Variable?", "auto", "register", "extern", "static", 3)
        questionsList.add(q7)
        val q8=Questions(8,"What is a lint?", "C compiler", "Interactive debugger", "Analyzing tool", "C interpreter", 3)
        questionsList.add(q8)
        val q9=Questions(9,"What is the 16-bit compiler allowable range for integer constants?", "-3.4e38 to 3.4e38", "-32767 to 32768", "-32668 to 32667", "-32768 to 32767", 4)
        questionsList.add(q9)
        val q10=Questions(10,"C programs are converted into machine language with the help of", "An Editor", "A compiler", "An operating system", "None of these.", 2)
        questionsList.add(q10)
        return  questionsList
    }
}

object c2 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Who is father of C Language", "Bjarne Stroustrup", "James A. Gosling", "Dennis Ritchie", "Dr. E.F. Codd", 3)
        questionsList.add(q1)
        val q2=Questions(2,"Standard ANSI C recognizes _____ number of keyword.", "30", "32", "24", "36", 2)
        questionsList.add(q2)
        val q3=Questions(3,"What is the only function all C programs must contain?", "start()", "system()", "main()", "printf()", 3)
        questionsList.add(q3)
        val q4=Questions(4,"Which symbol is used to declare a pointer?", "*", "#", "&", "&&", 1)
        questionsList.add(q4)
        val q5=Questions(5,"In the C language, the constant is defined _______.", "Before main", "After main", "Anywhere, but starting on a new line.", "None of the these.", 3)
        questionsList.add(q5)
        val q6=Questions(6,"Directives are translated by the", "Pre-processor", "Compiler", "Linker", "Editor", 1)
        questionsList.add(q6)
        val q7=Questions(7,"Find a C Storage Class below.", "static", "auto", "register & extern", "All the above", 4)
        questionsList.add(q7)
        val q8=Questions(8,"Which among the following is a Local Variable?", "register", "auto", "static", "extern", 2)
        questionsList.add(q8)
        val q9=Questions(9,"Each instance of a class has a different set of", "Class interfaces", "Methods", "Return types", "Attribute values", 4)
        questionsList.add(q9)
        val q10=Questions(10,"Array is a _________ data structure.", "Non-linear", "Primary", "Linear", "Data type", 3)
        questionsList.add(q10)
        return  questionsList
    }
}


object c3 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Who defines the user-defined function?", "Compiler", "Computer", "Compiler library", "Users", 4)
        questionsList.add(q1)
        val q2=Questions(2,"What type of data type does the atoi() function return?", "String", "char", "Integer", "Float", 3)
        questionsList.add(q2)
        val q3=Questions(3,"Which of the following function is used to write the integer in a file?", "getw()", "putw()", "int value", "f_int()", 2)
        questionsList.add(q3)
        val q4=Questions(4,"In which of the following modes, the user can read and write the file?", "r", "w", "r+", "b+", 3)
        questionsList.add(q4)
        val q5=Questions(5, "The enum keyword is used to assign names to the ________ constants.", "Integer", "String", "Character", "All of the these", 1)
        questionsList.add(q5)
        val q6=Questions(6,"An entire array is always passed by ___ to a called function.", "Call by value", "Call by reference", "Address relocation", "Address restructure", 2)
        questionsList.add(q6)
        val q7=Questions(7,"A recursive function is faster than __ loop.", "for", "while", "do while", "None of the above", 4)
        questionsList.add(q7)
        val q8=Questions(8,"What is the Format specifier used to print a String or Character array in C Printf or Scanf function.?", "%c", "%C", "%s", "%w", 3)
        questionsList.add(q8)
        val q9=Questions(9,"Which of the following keyword is used for union in c language?", "un", "unt", "ion", "union", 4)
        questionsList.add(q9)
        val q10=Questions(10," How many types of variables are there in the C language?", "2", "4", "1", "5", 1)
        questionsList.add(q10)
        return  questionsList
    }
}


object cpp1 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"What is the full form of oop", "Object oriented programming", "Oriented object programming", "Office oriented programming", "office objective programming", 1)
        questionsList.add(q1)
        val q2=Questions(2,"Which of the following is the correct identifier?", "/var_name", "VAR_123", "varname@", "None of the above", 2)
        questionsList.add(q2)
        val q3=Questions(3,"Which operator has highest precedence in * / % ?", "*", "/", "%", "all have same precedence", 4)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following is called address operator?", "*", "&", "_", "%", 2)
        questionsList.add(q4)
        val q5=Questions(5,"Can we overload functions in C++?", "Yes", "No", "Compilation Error", "Runtime Error", 1)
        questionsList.add(q5)
        val q6=Questions(6,"Which operator can not be overloaded?", "+", "-", "*", "::", 4)
        questionsList.add(q6)
        val q7=Questions(7,"Which data type is used to represent the absence of parameters?", "int", "short", "void", "float", 3)
        questionsList.add(q7)
        val q8=Questions(8,"The process of building new classes from existing one is called", "Polymorphism", "Structure", "Inheritance", "Cascading", 3)
        questionsList.add(q8)
        val q9=Questions(9,"Which of the following comment syntax is correct to create a single-line comment in the C++ program?", "//Comment", "/Comment/", "Comment//", "None of the above", 1)
        questionsList.add(q9)
        val q10=Questions(10,"Which types of arrays are always considered as linear arrays?","Single-dimensional","Multi-dimensional","Both A and B","None of the above", 1)
        questionsList.add(q10)
        return  questionsList
    }
}

object cpp2 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which of these following members are not accessed by using direct member access operator?", "public", "private", "protected", "both private & protected", 4)
        questionsList.add(q1)
        val q2=Questions(2,"Which symbol is used to declare the preprocessor directives?", "#", "$", "*", "^", 1)
        questionsList.add(q2)
        val q3=Questions(3,"How many types of macros are there in c++?", "1", "2", "3", "4", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which one of the following cannot be used with the virtual keyword", "Constructor", "Destructor", "Member function", "None of the above", 1)
        questionsList.add(q4)
        val q5=Questions(5,"Which of the following keywords is used to write assembly code in a C ++ program?", "ASM", "asm", "Not possible", "Compiler specific", 2)
        questionsList.add(q5)
        val q6=Questions(6,"Which of the following ways are legal to access a class data member using pointer", "this,x", "*this.x", "*(this.x)", "(*this).x", 4)
        questionsList.add(q6)
        val q7=Questions(7,"In which of the following we cannot overload the function?", "return function", "caller", "called function", "main function", 1)
        questionsList.add(q7)
        val q8=Questions(8,"How many types of constructors are there in C++?", "1", "2", "3", "4", 3)
        questionsList.add(q8)
        val q9=Questions(9,"Which of the following operator can be overloaded through friend function", "->", "=", "()", "*", 4)
        questionsList.add(q9)
        val q10=Questions(10,"Which is used to tell the computer that where a pointer is pointing to?", "dereference", "reference", "heap operations", "binary operations", 1)
        questionsList.add(q10)
        return  questionsList
    }
}


object cpp3 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Who defines the user-defined function?", "Compiler", "Computer", "Compiler library", "Users", 4)
        questionsList.add(q1)
        val q2=Questions(2,"What type of data type does the atoi() function return?", "String", "char", "Integer", "Float", 3)
        questionsList.add(q2)
        val q3=Questions(3,"Which of the following function is used to write the integer in a file?", "getw()", "putw()", "int value", "f_int()", 2)
        questionsList.add(q3)
        val q4=Questions(4,"In which of the following modes, the user can read and write the file?", "r", "w", "r+", "b+", 3)
        questionsList.add(q4)
        val q5=Questions(5, "The enum keyword is used to assign names to the ________ constants.", "Integer", "String", "Character", "All of the these", 1)
        questionsList.add(q5)
        val q6=Questions(6,"An entire array is always passed by ___ to a called function.", "Call by value", "Call by reference", "Address relocation", "Address restructure", 2)
        questionsList.add(q6)
        val q7=Questions(7,"A recursive function is faster than __ loop.", "for", "while", "do while", "None of the above", 4)
        questionsList.add(q7)
        val q8=Questions(8,"What is the Format specifier used to print a String or Character array in C Printf or Scanf function.?", "%c", "%C", "%s", "%w", 3)
        questionsList.add(q8)
        val q9=Questions(9,"Which of the following keyword is used for union in c language?", "un", "unt", "ion", "union", 4)
        questionsList.add(q9)
        val q10=Questions(10," How many types of variables are there in the C language?", "2", "4", "1", "5", 1)
        questionsList.add(q10)
        return  questionsList
    }
}

object csharp1 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"How many Bytes are stored by ‘Long’ Data type in C# .net?", "8", "4", "2", "1", 1)
        questionsList.add(q1)
        val q2=Questions(2,"The Default value of Boolean Data Type is?", "0", "True", "False", "1", 3)
        questionsList.add(q2)
        val q3=Questions(3,"Which data type should be more preferred for storing a simple number like 35 to improve execution speed of a program?", "byte", "short", "int", "long", 1)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following is used to define the member of a class externally?", ":", "::", "#", "none of above", 2)
        questionsList.add(q4)
        val q5=Questions(5,"Valid Size of float data type is?", "10 Bytes", "6 Bytes", "4 Bytes", "8 Bytes", 3)
        questionsList.add(q5)
        val q6=Questions(6,"Which of the following options is not a Bitwise Operator in C#?", "&, |", "^, ~", "<<, >>", "+=, -=", 4)
        questionsList.add(q6)
        val q7=Questions(7, "WriteLine is a ______", "function", "keyword", "literal", "class", 1)
        questionsList.add(q7)
        val q8=Questions(8,"The data members of a class by default are?", "protected, public", "private, public", "public", "private", 4)
        questionsList.add(q8)
        val q9=Questions(9,"Disadvantages of Explicit Conversion are?", "Makes program memory heavier", "Results in loss of data", "Potentially Unsafe", "None of above", 2)
        questionsList.add(q9)
        val q10=Questions(10,"Which among the following is a conditional operator?", "‘:?’", "?;", "?:", "??", 3)
        questionsList.add(q10)
        return  questionsList
    }
}

object csharp2 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which company developed C#?", "Cisco", "Oracle", "Microsoft", "IBM", 3)
        questionsList.add(q1)
        val q2=Questions(2,"__________ is a part of ADO.NET data provider which acts as a communicator between Dataset and Data source.", "DataSet", "DataAdapter", "DataView", "DataTable", 2)
        questionsList.add(q2)
        val q3=Questions(3,"What is the most specified using class declaration?", "type", "scope", "type & scope", "none of above", 3)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following keywords is used to refer base class constructor to subclass constructor?", "this", "static", "extend", "base", 4)
        questionsList.add(q4)
        val q5=Questions(5,"C # does not support _______ statement", "go", "goto", "break", "continue", 1)
        questionsList.add(q5)
        val q6=Questions(6,"How many values does a function return?", "0", "1", "2", "any number of values", 2)
        questionsList.add(q6)
        val q7=Questions(7,"Which of these methods of the class String is used to obtain length of String object?", "get()", "Sizeof()", "lengthof()", "length()", 4)
        questionsList.add(q7)
        val q8=Questions(8,"Which operator among the following signifies the destructor operator?", "::", ":", "~", "&", 3)
        questionsList.add(q8)
        val q9=Questions(9,"What is the return type of destructor?", "int", "void", "float", "none of above", 4)
        questionsList.add(q9)
        val q10=Questions(10,"The capability of an object in Csharp to take number of different forms and hence display behaviour as according is known as ___________", "Encapsulation", "Polymorphism", "Abstraction", "None of above", 2)
        questionsList.add(q10)
        return  questionsList
    }
}


object csharp3 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"The point at which an exception is thrown is called the _____.", "Default point", "Invoking point", "Calling point", "Throw point", 4)
        questionsList.add(q1)
        val q2=Questions(2,"________ is an access modifier", "internal", "external", "extrim", "interim", 1)
        questionsList.add(q2)
        val q3=Questions(3,"The number of levels of inheritance are?", "5", "4", "3", "2", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following keyword is used to change data and behavior of a base class by replacing a member of the base class with a new derived member?", "Overloads", "Overrides", "new", "base", 3)
        questionsList.add(q4)
        val q5=Questions(5, "Which of the following modifiers is used when an abstract method is redefined by a derived class?", "Overloads", "Override", "Base", "Virtual", 2)
        questionsList.add(q5)
        val q6=Questions(6,"A static variable cannot be ________", "created", "initialized", "deleted", "reinitialized", 3)
        questionsList.add(q6)
        val q7=Questions(7,"Which keyword is used for correct implementation of an interface in C#.NET?", "interface", "Interface", "intf", "Intf", 1)
        questionsList.add(q7)
        val q8=Questions(8,"Which of the following cannot be used to declare an interface correctly?", "Properties", "Methods", "Structures", "Events", 3)
        questionsList.add(q8)
        val q9=Questions(9,"A super class is also called _________", "sub class", "base class", "derived class", "inherited class", 2)
        questionsList.add(q9)
        val q10=Questions(10,"When is no exception thrown at runtime then who will catch it?", "CLR", "Operating System", "Loader", "Compiler", 1)
        questionsList.add(q10)
        return  questionsList
    }
}



object html1 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which of the following tag is used to mark a beginning of paragraph ?", "<TD>", "<br>", "<P>", "<TR>", 3)
        questionsList.add(q1)
        val q2=Questions(2,"<b> tag makes the enclosed text bold. What is other tag to make text bold?", "<strong>", "<dar>", "<black>", "<emp>", 1)
        questionsList.add(q2)
        val q3=Questions(3,"Tags and text that are not directly displayed on the page are written in _____ section.", "<html>", "<head>,", "<title>", "<body>", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which tag inserts a line horizontally on your web page?", "<hr>", "<line>,", "<line direction='horizontal'>", "<tr>", 1)
        questionsList.add(q4)
        val q5=Questions(5, "What should be the first tag in any HTML document?", "<head>", "<title>", "<html>", "<document>", 3)
        questionsList.add(q5)
        val q6=Questions(6,"Which tag allows you to add a row in a table?", "<td> and </td>", "<cr> and </cr>", "<th> and </th>", "<tr> and </tr>", 4)
        questionsList.add(q6)
        val q7=Questions(7,"How can you make a numbered list?", "<dl>", "<ol>", "<list>", "<ul>", 2)
        questionsList.add(q7)
        val q8=Questions(8,"Choose the correct HTML tag to make a text italic", "<ii>", "<italics>", "<italic>", "<i>", 4)
        questionsList.add(q8)
        val q9=Questions(9,"Choose the correct HTML tag to make a text bold?", "<b>", "<bold>", "<bb>", "<bld>", 2)
        questionsList.add(q9)
        val q10=Questions(10,"Choose the correct HTML tag for the smallest size heading?", "<heading>", "<h6>", "<h1>", "<head>", 2)
        questionsList.add(q10)
        return  questionsList
    }
}


object html2 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which Tag Is Used If You Want To Indicate The Importance Of The Phrase?", "<h1>", "<em>", "<strong>", "<h2>", 2)
        questionsList.add(q1)
        val q2=Questions(2,"How can you make a bulleted list?", "<list>", "<nl>", "<ul>", "<ol>", 3)
        questionsList.add(q2)
        val q3=Questions(3,"Which attribute is used to name an element uniquely?", "class", "id", "dot", "all of the above", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which tag creates a check box for a form in HTML?", "<checkbox>", "<input type='checkbox'>", "<input=checkbox>", "<input checkbox>", 2)
        questionsList.add(q4)
        val q5=Questions(5,"Which of the following is not a pair tag?", "<p>", "<u>", "<i>", "<img>", 4)
        questionsList.add(q5)
        val q6=Questions(6,"To create HTML document you require", "webpage editing software", "High powered computer", "Notepad can be used", "None of above", 3)
        questionsList.add(q6)
        val q7=Questions(7,"The special formatting codes in HTML document used to present content are", "tags", "attributes", "values", "None of above", 1)
        questionsList.add(q7)
        val q8=Questions(8,"In HTML document the tags should be written in", "upper case", "lower case", "proper case", "a and b", 4)
        questionsList.add(q8)
        val q9=Questions(9,"There are ____ different of heading tags in HTML", "4", "5", "6", "7", 3)
        questionsList.add(q9)
        val q10=Questions(10, "HTML Is A Subset Of", "SGMT", "SGMD", "SGML", "None Of These", 3)
        questionsList.add(q10)
        return  questionsList
    }
}

object html3 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which of the following is not a style tag?", "<b>", "<tt>", "<i>", "All of above", 4)
        questionsList.add(q1)
        val q2=Questions(2,"The way the browser displays the object can be modified by _____", "attributes", "parameters", "modifiers", "None of above", 1)
        questionsList.add(q2)
        val q3=Questions(3,"What tag is used to list individual items of an ordered list?", "LI", "OL", "UL", "None of above", 1)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following is not a valid alignment attribute?", "Left", "Right", "Top", "All of above", 3)
        questionsList.add(q4)
        val q5=Questions(5,"Which attribute you’ll use with TD tag to merge two cells horizontally?", "merge=colspan2", "rowspan=2", "colspan=2", "merge=row2",3)
        questionsList.add(q5)
        val q6=Questions(6,"Which attribute is used within tag to display the text if image could not load in browser?", "description", "name", "alt", "id", 3)
        questionsList.add(q6)
        val q7=Questions(7, "Apart From &lt;b> Tag, What Other Tag Makes Text Bold ?", "<emp>", "<black>", "<fat>", "<strong>", 4)
        questionsList.add(q7)
        val q8=Questions(8, "Which HTML Element Is Used To Define The Description Data?", "<dt>", "<dd>", "<li>", "<dl>", 2)
        questionsList.add(q8)
        val q9=Questions(9,"Tags and text that are not directly displayed on the page are written in _____ section.", "<html>", "<head>", "<title>", "<body>", 2)
        questionsList.add(q9)
        val q10=Questions(10,"Which HTML tag would be used to display power in expression (A+B)2 ?", "<SUP>", "<SUB>", "<B>", "<P>", 1)
        questionsList.add(q10)
        return  questionsList
    }
}


object java1 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which of the following tag is used to mark a beginning of paragraph ?", "<TD>", "<br>", "<P>", "<TR>", 3)
        questionsList.add(q1)
        val q2=Questions(2,"<b> tag makes the enclosed text bold. What is other tag to make text bold?", "<strong>", "<dar>", "<black>", "<emp>", 1)
        questionsList.add(q2)
        val q3=Questions(3,"Tags and text that are not directly displayed on the page are written in _____ section.", "<html>", "<head>,", "<title>", "<body>", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which tag inserts a line horizontally on your web page?", "<hr>", "<line>,", "<line direction='horizontal'>", "<tr>", 1)
        questionsList.add(q4)
        val q5=Questions(5, "What should be the first tag in any HTML document?", "<head>", "<title>", "<html>", "<document>", 3)
        questionsList.add(q5)
        val q6=Questions(6,"Which tag allows you to add a row in a table?", "<td> and </td>", "<cr> and </cr>", "<th> and </th>", "<tr> and </tr>", 4)
        questionsList.add(q6)
        val q7=Questions(7,"How can you make a numbered list?", "<dl>", "<ol>", "<list>", "<ul>", 2)
        questionsList.add(q7)
        val q8=Questions(8,"Choose the correct HTML tag to make a text italic", "<ii>", "<italics>", "<italic>", "<i>", 4)
        questionsList.add(q8)
        val q9=Questions(9,"Choose the correct HTML tag to make a text bold?", "<b>", "<bold>", "<bb>", "<bld>", 2)
        questionsList.add(q9)
        val q10=Questions(10,"Choose the correct HTML tag for the smallest size heading?", "<heading>", "<h6>", "<h1>", "<head>", 2)
        questionsList.add(q10)
        return  questionsList
    }
}


object java2 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which Tag Is Used If You Want To Indicate The Importance Of The Phrase?", "<h1>", "<em>", "<strong>", "<h2>", 2)
        questionsList.add(q1)
        val q2=Questions(2,"How can you make a bulleted list?", "<list>", "<nl>", "<ul>", "<ol>", 3)
        questionsList.add(q2)
        val q3=Questions(3,"Which attribute is used to name an element uniquely?", "class", "id", "dot", "all of the above", 2)
        questionsList.add(q3)
        val q4=Questions(4,"Which tag creates a check box for a form in HTML?", "<checkbox>", "<input type='checkbox'>", "<input=checkbox>", "<input checkbox>", 2)
        questionsList.add(q4)
        val q5=Questions(5,"Which of the following is not a pair tag?", "<p>", "<u>", "<i>", "<img>", 4)
        questionsList.add(q5)
        val q6=Questions(6,"To create HTML document you require", "webpage editing software", "High powered computer", "Notepad can be used", "None of above", 3)
        questionsList.add(q6)
        val q7=Questions(7,"The special formatting codes in HTML document used to present content are", "tags", "attributes", "values", "None of above", 1)
        questionsList.add(q7)
        val q8=Questions(8,"In HTML document the tags should be written in", "upper case", "lower case", "proper case", "a and b", 4)
        questionsList.add(q8)
        val q9=Questions(9,"There are ____ different of heading tags in HTML", "4", "5", "6", "7", 3)
        questionsList.add(q9)
        val q10=Questions(10, "HTML Is A Subset Of", "SGMT", "SGMD", "SGML", "None Of These", 3)
        questionsList.add(q10)
        return  questionsList
    }
}

object java3 {
    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1=Questions(1,"Which of the following is not a style tag?", "<b>", "<tt>", "<i>", "All of above", 4)
        questionsList.add(q1)
        val q2=Questions(2,"The way the browser displays the object can be modified by _____", "attributes", "parameters", "modifiers", "None of above", 1)
        questionsList.add(q2)
        val q3=Questions(3,"What tag is used to list individual items of an ordered list?", "LI", "OL", "UL", "None of above", 1)
        questionsList.add(q3)
        val q4=Questions(4,"Which of the following is not a valid alignment attribute?", "Left", "Right", "Top", "All of above", 3)
        questionsList.add(q4)
        val q5=Questions(5,"Which attribute you’ll use with TD tag to merge two cells horizontally?", "merge=colspan2", "rowspan=2", "colspan=2", "merge=row2",3)
        questionsList.add(q5)
        val q6=Questions(6,"Which attribute is used within tag to display the text if image could not load in browser?", "description", "name", "alt", "id", 3)
        questionsList.add(q6)
        val q7=Questions(7, "Apart From &lt;b> Tag, What Other Tag Makes Text Bold ?", "<emp>", "<black>", "<fat>", "<strong>", 4)
        questionsList.add(q7)
        val q8=Questions(8, "Which HTML Element Is Used To Define The Description Data?", "<dt>", "<dd>", "<li>", "<dl>", 2)
        questionsList.add(q8)
        val q9=Questions(9,"Tags and text that are not directly displayed on the page are written in _____ section.", "<html>", "<head>", "<title>", "<body>", 2)
        questionsList.add(q9)
        val q10=Questions(10,"Which HTML tag would be used to display power in expression (A+B)2 ?", "<SUP>", "<SUB>", "<B>", "<P>", 1)
        questionsList.add(q10)
        return  questionsList
    }
}