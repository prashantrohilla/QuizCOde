package com.mcqquiz.quizcode

import com.mcqquiz.quizcode.models.Questions

object C1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "C Language is a successor to which language?",
            "FORTRAN",
            "D Language",
            "BASIC",
            "B Language",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "C is _______ type of programming language?",
            "Object Oriented",
            "Procedural",
            "Bit level language",
            "Functional",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "C language was invented to develop which Operating System.?",
            "Android",
            "Linux",
            "Ubuntu",
            "Unix",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "What is the default C Storage Class for a variable?",
            "static",
            "auto",
            "register",
            "extern",
            2
        )
        questionsList.add(q4)
        val q5 =
            Questions(5, "Number of Keywords present in C Language are?", "32", "34", "62", "64", 1)
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Variables of type auto, static and extern are all stored in .?",
            "ROM",
            "RAM",
            "CPU",
            "Compiler",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which among the following is a Global Variable?",
            "auto",
            "register",
            "extern",
            "static",
            3
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "What is a lint?",
            "C compiler",
            "Interactive debugger",
            "Analyzing tool",
            "C interpreter",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "What is the 16-bit compiler allowable range for integer constants?",
            "-3.4e38 to 3.4e38",
            "-32767 to 32768",
            "-32668 to 32667",
            "-32768 to 32767",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "C programs are converted into machine language with the help of",
            "An Editor",
            "A compiler",
            "An operating system",
            "None of these.",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object C2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Who is father of C Language",
            "Bjarne Stroustrup",
            "James A. Gosling",
            "Dennis Ritchie",
            "Dr. E.F. Codd",
            3
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Standard ANSI C recognizes _____ number of keyword.",
            "30",
            "32",
            "24",
            "36",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "What is the only function all C programs must contain?",
            "start()",
            "system()",
            "main()",
            "printf()",
            3
        )
        questionsList.add(q3)
        val q4 = Questions(4, "Which symbol is used to declare a pointer?", "*", "#", "&", "&&", 1)
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "In the C language, the constant is defined _______.",
            "Before main",
            "After main",
            "Anywhere, but starting on a new line.",
            "None of the these.",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Directives are translated by the",
            "Pre-processor",
            "Compiler",
            "Linker",
            "Editor",
            1
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Find a C Storage Class below.",
            "static",
            "auto",
            "register & extern",
            "All the above",
            4
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which among the following is a Local Variable?",
            "register",
            "auto",
            "static",
            "extern",
            2
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Each instance of a class has a different set of",
            "Class interfaces",
            "Methods",
            "Return types",
            "Attribute values",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Array is a _________ data structure.",
            "Non-linear",
            "Primary",
            "Linear",
            "Data type",
            3
        )
        questionsList.add(q10)
        return questionsList
    }
}


object C3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Who defines the user-defined function?",
            "Compiler",
            "Computer",
            "Compiler library",
            "Users",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "What type of data type does the atoi() function return?",
            "String",
            "char",
            "Integer",
            "Float",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of the following function is used to write the integer in a file?",
            "getw()",
            "putw()",
            "int value",
            "f_int()",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "In which of the following modes, the user can read and write the file?",
            "r",
            "w",
            "r+",
            "b+",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The enum keyword is used to assign names to the ________ constants.",
            "Integer",
            "String",
            "Character",
            "All of the these",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "An entire array is always passed by ___ to a called function.",
            "Call by value",
            "Call by reference",
            "Address relocation",
            "Address restructure",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "A recursive function is faster than __ loop.",
            "for",
            "while",
            "do while",
            "None of the above",
            4
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "What is the Format specifier used to print a String or Character array in C Printf or Scanf function.?",
            "%c",
            "%C",
            "%s",
            "%w",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following keyword is used for union in c language?",
            "un",
            "unt",
            "ion",
            "union",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            " How many types of variables are there in the C language?",
            "2",
            "4",
            "1",
            "5",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Cpp1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "What is the full form of oop",
            "Object oriented programming",
            "Oriented object programming",
            "Office oriented programming",
            "office objective programming",
            1
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which of the following is the correct identifier?",
            "/var_name",
            "VAR_123",
            "varname@",
            "None of the above",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which operator has highest precedence in * / % ?",
            "*",
            "/",
            "%",
            "all have same precedence",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following is called address operator?",
            "*",
            "&",
            "_",
            "%",
            2
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Can we overload functions in C++?",
            "Yes",
            "No",
            "Compilation Error",
            "Runtime Error",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(6, "Which operator can not be overloaded?", "+", "-", "*", "::", 4)
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which data type is used to represent the absence of parameters?",
            "int",
            "short",
            "void",
            "float",
            3
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "The process of building new classes from existing one is called",
            "Polymorphism",
            "Structure",
            "Inheritance",
            "Cascading",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following comment syntax is correct to create a single-line comment in the C++ program?",
            "//Comment",
            "/Comment/",
            "Comment//",
            "None of the above",
            1
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which types of arrays are always considered as linear arrays?",
            "Single-dimensional",
            "Multi-dimensional",
            "Both A and B",
            "None of the above",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Cpp2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of these following members are not accessed by using direct member access operator?",
            "public",
            "private",
            "protected",
            "both private & protected",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which symbol is used to declare the preprocessor directives?",
            "#",
            "$",
            "*",
            "^",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(3, "How many types of macros are there in c++?", "1", "2", "3", "4", 2)
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which one of the following cannot be used with the virtual keyword",
            "Constructor",
            "Destructor",
            "Member function",
            "None of the above",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which of the following keywords is used to write assembly code in a C ++ program?",
            "ASM",
            "asm",
            "Not possible",
            "Compiler specific",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of the following ways are legal to access a class data member using pointer",
            "this,x",
            "*this.x",
            "*(this.x)",
            "(*this).x",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "In which of the following we cannot overload the function?",
            "return function",
            "caller",
            "called function",
            "main function",
            1
        )
        questionsList.add(q7)
        val q8 =
            Questions(8, "How many types of constructors are there in C++?", "1", "2", "3", "4", 3)
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following operator can be overloaded through friend function",
            "->",
            "=",
            "()",
            "*",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which is used to tell the computer that where a pointer is pointing to?",
            "dereference",
            "reference",
            "heap operations",
            "binary operations",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Cpp3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Who defines the user-defined function?",
            "Compiler",
            "Computer",
            "Compiler library",
            "Users",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "What type of data type does the atoi() function return?",
            "String",
            "char",
            "Integer",
            "Float",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of the following function is used to write the integer in a file?",
            "getw()",
            "putw()",
            "int value",
            "f_int()",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "In which of the following modes, the user can read and write the file?",
            "r",
            "w",
            "r+",
            "b+",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The enum keyword is used to assign names to the ________ constants.",
            "Integer",
            "String",
            "Character",
            "All of the these",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "An entire array is always passed by ___ to a called function.",
            "Call by value",
            "Call by reference",
            "Address relocation",
            "Address restructure",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "A recursive function is faster than __ loop.",
            "for",
            "while",
            "do while",
            "None of the above",
            4
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "What is the Format specifier used to print a String or Character array in C Printf or Scanf function.?",
            "%c",
            "%C",
            "%s",
            "%w",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following keyword is used for union in c language?",
            "un",
            "unt",
            "ion",
            "union",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            " How many types of variables are there in the C language?",
            "2",
            "4",
            "1",
            "5",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Csharp1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "How many Bytes are stored by ‘Long’ Data type in C# .net?",
            "8",
            "4",
            "2",
            "1",
            1
        )
        questionsList.add(q1)
        val q2 =
            Questions(2, "The Default value of Boolean Data Type is?", "0", "True", "False", "1", 3)
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which data type should be more preferred for storing a simple number like 35 to improve execution speed of a program?",
            "byte",
            "short",
            "int",
            "long",
            1
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following is used to define the member of a class externally?",
            ":",
            "::",
            "#",
            "none of above",
            2
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Valid Size of float data type is?",
            "10 Bytes",
            "6 Bytes",
            "4 Bytes",
            "8 Bytes",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of the following options is not a Bitwise Operator in C#?",
            "&, |",
            "^, ~",
            "<<, >>",
            "+=, -=",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(7, "WriteLine is a ______", "function", "keyword", "literal", "class", 1)
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "The data members of a class by default are?",
            "protected, public",
            "private, public",
            "public",
            "private",
            4
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Disadvantages of Explicit Conversion are?",
            "Makes program memory heavier",
            "Results in loss of data",
            "Potentially Unsafe",
            "None of above",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which among the following is a conditional operator?",
            "‘:?’",
            "?;",
            "?:",
            "??",
            3
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Csharp2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 =
            Questions(1, "Which company developed C#?", "Cisco", "Oracle", "Microsoft", "IBM", 3)
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "__________ is a part of ADO.NET data provider which acts as a communicator between Dataset and Data source.",
            "DataSet",
            "DataAdapter",
            "DataView",
            "DataTable",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "What is the most specified using class declaration?",
            "type",
            "scope",
            "type & scope",
            "none of above",
            3
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following keywords is used to refer base class constructor to subclass constructor?",
            "this",
            "static",
            "extend",
            "base",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "C # does not support _______ statement",
            "go",
            "goto",
            "break",
            "continue",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "How many values does a function return?",
            "0",
            "1",
            "2",
            "any number of values",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which of these methods of the class String is used to obtain length of String object?",
            "get()",
            "Sizeof()",
            "lengthof()",
            "length()",
            4
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which operator among the following signifies the destructor operator?",
            "::",
            ":",
            "~",
            "&",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "What is the return type of destructor?",
            "int",
            "void",
            "float",
            "none of above",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "The capability of an object in Csharp to take number of different forms and hence display behaviour as according is known as ___________",
            "Encapsulation",
            "Polymorphism",
            "Abstraction",
            "None of above",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Csharp3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "The point at which an exception is thrown is called the _____.",
            "Default point",
            "Invoking point",
            "Calling point",
            "Throw point",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "________ is an access modifier",
            "internal",
            "external",
            "extrim",
            "interim",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(3, "The number of levels of inheritance are?", "5", "4", "3", "2", 2)
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following keyword is used to change data and behavior of a base class by replacing a member of the base class with a new derived member?",
            "Overloads",
            "Overrides",
            "new",
            "base",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which of the following modifiers is used when an abstract method is redefined by a derived class?",
            "Overloads",
            "Override",
            "Base",
            "Virtual",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "A static variable cannot be ________",
            "created",
            "initialized",
            "deleted",
            "reinitialized",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which keyword is used for correct implementation of an interface in C#.NET?",
            "interface",
            "Interface",
            "intf",
            "Intf",
            1
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which of the following cannot be used to declare an interface correctly?",
            "Properties",
            "Methods",
            "Structures",
            "Events",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "A super class is also called _________",
            "sub class",
            "base class",
            "derived class",
            "inherited class",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "When is no exception thrown at runtime then who will catch it?",
            "CLR",
            "Operating System",
            "Loader",
            "Compiler",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Html1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of the following tag is used to mark a beginning of paragraph ?",
            "<TD>",
            "<br>",
            "<P>",
            "<TR>",
            3
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "<b> tag makes the enclosed text bold. What is other tag to make text bold?",
            "<strong>",
            "<dar>",
            "<black>",
            "<emp>",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Tags and text that are not directly displayed on the page are written in _____ section.",
            "<html>",
            "<head>,",
            "<title>",
            "<body>",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which tag inserts a line horizontally on your web page?",
            "<hr>",
            "<line>,",
            "<line direction='horizontal'>",
            "<tr>",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "What should be the first tag in any HTML document?",
            "<head>",
            "<title>",
            "<html>",
            "<document>",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which tag allows you to add a row in a table?",
            "<td> and </td>",
            "<cr> and </cr>",
            "<th> and </th>",
            "<tr> and </tr>",
            4
        )
        questionsList.add(q6)
        val q7 =
            Questions(7, "How can you make a numbered list?", "<dl>", "<ol>", "<list>", "<ul>", 2)
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Choose the correct HTML tag to make a text italic",
            "<ii>",
            "<italics>",
            "<italic>",
            "<i>",
            4
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Choose the correct HTML tag to make a text bold?",
            "<b>",
            "<bold>",
            "<bb>",
            "<bld>",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Choose the correct HTML tag for the smallest size heading?",
            "<heading>",
            "<h6>",
            "<h1>",
            "<head>",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Html2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which Tag Is Used If You Want To Indicate The Importance Of The Phrase?",
            "<h1>",
            "<em>",
            "<strong>",
            "<h2>",
            2
        )
        questionsList.add(q1)
        val q2 =
            Questions(2, "How can you make a bulleted list?", "<list>", "<nl>", "<ul>", "<ol>", 3)
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which attribute is used to name an element uniquely?",
            "class",
            "id",
            "dot",
            "all of the above",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which tag creates a check box for a form in HTML?",
            "<checkbox>",
            "<input type='checkbox'>",
            "<input=checkbox>",
            "<input checkbox>",
            2
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which of the following is not a pair tag?",
            "<p>",
            "<u>",
            "<i>",
            "<img>",
            4
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "To create HTML document you require",
            "webpage editing software",
            "High powered computer",
            "Notepad can be used",
            "None of above",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "The special formatting codes in HTML document used to present content are",
            "tags",
            "attributes",
            "values",
            "None of above",
            1
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "In HTML document the tags should be written in",
            "upper case",
            "lower case",
            "proper case",
            "a and b",
            4
        )
        questionsList.add(q8)
        val q9 =
            Questions(9, "There are ____ different of heading tags in HTML", "4", "5", "6", "7", 3)
        questionsList.add(q9)
        val q10 = Questions(10, "HTML Is A Subset Of", "SGMT", "SGMD", "SGML", "None Of These", 3)
        questionsList.add(q10)
        return questionsList
    }
}

object Html3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of the following is not a style tag?",
            "<b>",
            "<tt>",
            "<i>",
            "All of above",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "The way the browser displays the object can be modified by _____",
            "attributes",
            "parameters",
            "modifiers",
            "None of above",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "What tag is used to list individual items of an ordered list?",
            "LI",
            "OL",
            "UL",
            "None of above",
            1
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following is not a valid alignment attribute?",
            "Left",
            "Right",
            "Top",
            "All of above",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which attribute you’ll use with TD tag to merge two cells horizontally?",
            "merge=colspan2",
            "rowspan=2",
            "colspan=2",
            "merge=row2",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which attribute is used within tag to display the text if image could not load in browser?",
            "description",
            "name",
            "alt",
            "id",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Apart From &lt;b> Tag, What Other Tag Makes Text Bold ?",
            "<emp>",
            "<black>",
            "<fat>",
            "<strong>",
            4
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which HTML Element Is Used To Define The Description Data?",
            "<dt>",
            "<dd>",
            "<li>",
            "<dl>",
            2
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Tags and text that are not directly displayed on the page are written in _____ section.",
            "<html>",
            "<head>",
            "<title>",
            "<body>",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which HTML tag would be used to display power in expression (A+B)2 ?",
            "<SUP>",
            "<SUB>",
            "<B>",
            "<P>",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Java1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",
            "Encapsulation", "Interface", "Inheritance", "Aggregation", 3
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            " _____ is used to find and fix bugs in the Java programs",
            "JVM",
            "JRE",
            "JDK",
            "JDB",
            4
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "The wrapping up of data and functions into a single unit is called",
            "Abstraction",
            "Polymorphism",
            "Encapsulation",
            "Data hiding",
            3
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "In java, jar stands for_____.",
            "Java Archieve Runner",
            "Java Application Resource",
            "Java Application Runner",
            "None of the above",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "A package is a collection of",
            "Class & Interfaces",
            "Classes",
            "Editing tools",
            "Methods",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of the following is not a Java features?",
            "Dynamic",
            "Object-Oriented",
            "Architecture Neutral",
            "Pointers",
            4
        )
        questionsList.add(q6)
        val q7 =
            Questions(
                7,
                "What does the expression float a = 35 / 0 return?",
                "0",
                "Infinity",
                "Not a number",
                "Run Time Exception",
                2
            )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which among the following is not a Data Type in Java?",
            "short",
            "int",
            "long double",
            "double",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Range for byte data type in Java?",
            "-127 to +128",
            "-128 to +127",
            "0 to 256",
            "0 to 255",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Who invented Java language?",
            "Dennis Ritchie",
            "James Gosling",
            "Larry Page",
            "Serge Page",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Java2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Java language was originally developed for operating?",
            "TV",
            "TV Set-top box",
            "Embedded System Equipment",
            "All of the above",
            4
        )
        questionsList.add(q1)
        val q2 =
            Questions(
                2,
                "In which process, a local variable has the same name as one of the instance variables?",
                "Serialization",
                "Variable Shadowing",
                "Abstraction",
                "Multi-threading",
                2
            )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "What are the two possible Logical Operator types?",
            "Bitwise Logical",
            "Boolean Logical",
            "Arithmetic Logical",
            "A and B",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Java Ternary operator is sometimes called ____.",
            "Relational Operator",
            "Conditional Operator",
            "Logical Operator",
            "None",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which package contains the Random class?",
            "java.util package",
            "java.lang package",
            "java.awt package",
            "java.io package",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "In which memory a String is stored, when we create a string using new operator?",
            "Stack",
            "String memory",
            "Heap memory",
            "Random storage space",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which concept of Java is a way of converting real world objects in terms of class?",
            "Polymorphism", "Encapsulation", "Abstraction", "Inheritance", 2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "In a .java file, how many numbers of public types namely class, interface or abstract can be managed?",
            "1",
            "2",
            "3",
            "Infinite",
            1
        )
        questionsList.add(q8)
        val q9 =
            Questions(
                9,
                "Which of the following is a mutable class in java?",
                "java.lang.String",
                "java.lang.Byte",
                "java.lang.Short",
                "java.lang.StringBuilder",
                4
            )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            " What is the return type of the hashCode() method in the Object class?",
            "Object",
            "int",
            "long",
            "void",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Java3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            " How many threads can be executed at a time?",
            "Only one thread",
            "Multiple threads",
            "Only main (main() method) thread",
            "Two threads",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            " What would be the behaviour if this() and super() used in a method?",
            "Runtime error",
            "Throws exception",
            "compile time error",
            "Runs successfully",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "If super class and subclass have same variable name, which keyword should be used to use super class?",
            "super",
            "this",
            "upper",
            "classname",
            1
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following modifiers can be used for a variable so that it can be accessed by any thread or a part of a program?",
            "volatile", "transient", "global", "default", 1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Arrays in Java are implemented as?",
            "class",
            "object",
            "variable",
            "none of the mentioned",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of these keywords is used to refer to member of base class from a subclass?",
            "upper",
            "this",
            "super",
            "none of the mentioned",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which of these access specifiers can be used for an interface?",
            "Public",
            "Protected",
            "private",
            "All of the mentioned",
            1
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which of the following is a marker interface?",
            "Runnable interface",
            "Remote interface",
            "Readable interface",
            "Result interface",
            2
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            " Which of these data types is used by operating system to manage the Recursion in Java?",
            "Array",
            "Queue",
            "Stack",
            "Tree",
            3
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "What is it called if an object has its own lifecycle and there is no owner?",
            "Aggregation",
            "Composition",
            "Encapsulation",
            "Association",
            4
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Javascript1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which type of JavaScript language is ___",
            "Object-Oriented",
            "Object-Based",
            "Assembly-language",
            "High-level",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "In which element we put javascript?",
            "<javascript>",
            "<scripting>",
            "<script>",
            "None of These",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of the following is an IF statement in JavaScript?",
            "if i = 5",
            "if i = 5 then",
            "if (i == 5)",
            "All of these",
            3
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "JavaScript Code can be called by using ___________",
            "RMI",
            "Triggering Event",
            "Preprocessor",
            "Function/Method",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The type of a variable that is volatile is _______________",
            "Volatile variable",
            "Mutable variable",
            "Immutable variable",
            "Dynamic variable",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of the following is a JavaScript data type?",
            "null",
            "undefined",
            "object",
            "All of the above",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Executable single line of Script is called as _________________.",
            "Breakpoint in JS",
            "Statement in JavaScript",
            "Line in JS",
            "None of the above",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "The function and var are known as",
            "Keywords",
            "Data types",
            "Declaration statements",
            "Prototypes",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which operator is used to concatenate two strings.",
            "Dot",
            "Arrow",
            "Comma",
            "Plus",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Spaces,Punctuation marks are called as __________ Symbols in JavaScript.",
            "Special",
            "Punctual",
            "Mandatory",
            "None of these",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Javascript2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of the following is a server-side Java Script object?",
            "FileUpload",
            "Date",
            "Function",
            "File",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which of the following function of Boolean object returns the primitive value of the Boolean object?",
            "toString()",
            "toSource()",
            "valueOf()",
            "None of These",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "The method or operator used to identify the array is __________",
            "isarrayType()",
            "==",
            "===",
            "typeof",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which one of the following is the correct way for calling the JavaScript code?",
            "Function/Method",
            "Preprocessor",
            "Triggering Event",
            "RMI",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The unordered collection of properties, each of which has a name and a value is called _________",
            "String",
            "Object",
            "Serialized Object",
            "Array",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of the following option is used as hexadecimal literal beginning?",
            "00",
            "0x",
            "0X",
            "Both 0x and 0X",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "A conditional expression is also called a _______________",
            "Alternative to if-else",
            "Immediate if",
            "If-then-else statement",
            "Switch statement",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "In the JavaScript, which one of the following is not considered as an error",
            "Syntax error",
            "Missing of semicolons",
            "Division by zero",
            "Missing of Bracket",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Among the keywords below, which one is not a statement?",
            "debugger",
            "with",
            "if",
            "use strict",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "A function with no return value is called ___________",
            "Procedures",
            "Method",
            "Static function",
            "Dynamic function",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Javascript3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which one of the following keywords is used for defining the function in the JavaScript?",
            "Void",
            "init",
            "main",
            "function",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "The behaviour of the instances present of a class inside a method is defined by __________",
            "Method",
            "Classes",
            "Interfaces",
            "Classes and Interfaces",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which one of the following is not a example of closures?",
            "Graphics",
            "Variables",
            "Functions",
            "Objects",
            1
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "The keyword or the property that you use to refer to an object through which they were invoked is _________",
            "from",
            "to",
            "this",
            "object",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which variables are used internally in object methods and are also globally visible?",
            "Object properties",
            "Variable properties",
            "Method properties",
            "Internal properties",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "What are the events generated by the Node objects called?",
            "generators",
            "emitters",
            "dispatchers",
            "high events",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "The class that represents the regular expressions is ________",
            "RegExpObj",
            "RegExpClass",
            "RegExp",
            "StringExp",
            3
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "You can refresh the webpage in JavaScript by using ________",
            "window.reload",
            "location.reload",
            "window.refresh",
            "page.refresh",
            2
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "The Crockford’s subset does not include which function in JavaScript?",
            "eval()",
            "coeval()",
            "equal()",
            "equivalent()",
            1
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "What kind of scoping does JavaScript use?",
            "Literal",
            "Lexical",
            "Segmental",
            "Sequential",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Mongodb1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "What is MongoDB?",
            "It is a data growth",
            "It is a adminCommand",
            "It is a combine objects",
            "It is a document database",
            4
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "In mongodb, data is represented as a collection of _______",
            "Table",
            "Images",
            "Column",
            "Object",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "A collection in mongodb is a group of .........",
            "MySQL client",
            "MySQL server",
            "MySQL",
            "Server daemon program",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "The concatenation of the collection name and database name is called ____________",
            "Replica",
            "Namespace",
            "MongoDB",
            "Sharding",
            2
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "In mongodb ..... sorting is not supported.",
            "Heap",
            "Collation",
            "Collection",
            "None of the above",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "What kind of database MongoDB is?",
            "NoSQL Database",
            "SQL Database",
            "Operational database",
            "None of the above",
            1
        )
        questionsList.add(q6)
        val q7 =
            Questions(
                7,
                "Which of the following is a feature of mongoDB?",
                "Vertically scalable",
                "Centralised database",
                "Dynamic schema",
                "All of the above",
                3
            )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which of the following represent column in mongoDB?",
            "document",
            "database",
            "collection",
            "field",
            4
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Collection is a group of MongoDB ___________?",
            "Database",
            "Document",
            "Field",
            "None of the above",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which of the following language is MongoDB written in?",
            "Javascript",
            "C",
            "C++",
            "All of the mentioned",
            4
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Mongodb2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of the following format is supported by MongoDB?",
            "SQL",
            "XML",
            "BSON",
            "All of the mentioned",
            3
        )
        questionsList.add(q1)
        val q2 =
            Questions(
                2,
                " Initial release of MongoDB was in the year?",
                "2000",
                "2005",
                "2009",
                "2011",
                3
            )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Instead of Primary Key mongoDB use?",
            "Embedded Documents",
            "Default key _id",
            "mongod",
            "mongo",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "MongoDB has been adopted as ________ software by a number of major websites and services.",
            "frontend",
            "backend",
            "proprietary",
            "all of the mentioned",
            2
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which of the following is not a part of mongodb-enterprise-tools?",
            "mongodump",
            "mongotop",
            "mongodown",
            "none of the mentioned",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            " ____________ package contains the mongo shell.",
            "mongodb-enterprise",
            "mongodb-enterprise-server",
            "mongodb-enterprise-shell",
            "none of the mentioned",
            3
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "The MongoDB instance stores its _________ files in /var/lib/mongo by default.;",
            "log",
            "data",
            "replica",
            "all of the mentioned",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "User account running mongod has _______ permissions for the directory.",
            "write only",
            "read only",
            "read and write",
            "none of the mentioned",
            3
        )
        questionsList.add(q8)
        val q9 =
            Questions(
                9,
                "Which of the following is simplest tool for installation of MongoDB?",
                "mongorestore",
                "mongooplog",
                "mongodumpt",
                "all of the mentioned",
                2
            )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "___________ manipulate files stored in your MongoDB instance in GridFS.",
            "mongorestore",
            "mongofiles",
            "mongosupport",
            "none of the mentioned\n",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Mongodb3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "__________ is a native OS-X-application for MongoDB management.",
            "Opricot",
            "MongoHub",
            "UMongo",
            "3T MongoChe",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "To backup all the databases in a cluster via mongodump, you should have the ___________",
            "restore",
            "backup",
            "replication",
            "None of above",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "___________ is the primary daemon process for the MongoDB system.",
            "mongos",
            "mongod",
            "mongod",
            "syspathlog",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "MongoDB can be used as a ____________, taking advantage of load balancing and data replication features over multiple machines for storing files.",
            "AMS",
            "CMS",
            "File system",
            "None of the mentioned",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Mongodb provides high _________ with replica sets.",
            "performance",
            "availability",
            "scalability",
            "availability",
            2
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "__________ replicas maintain a copy of that data on the primary using built-in replication.",
            "Primary",
            "Secondary",
            "Backup",
            "All of the mentioned",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "MongoDb scales horizontally using _______ for load balancing purpose.",
            "Replication",
            "Partitioning",
            "Sharding",
            "None of the above",
            3
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "MongoDB supports fixed size collections called ___________ collections.",
            "primary",
            "secondary",
            "capped",
            "all of the mentioned",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "MonogoDb uses a ___________",
            "datum",
            "info",
            "record",
            "metadata",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "____________ can be used for batch processing of data and aggregation operations.",
            "Hive",
            "MapReduce",
            "Oozie",
            "None of the above",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Mysql1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which type of database management system is MySQL??",
            "Object-oriented",
            "Hierarchical",
            "Relational",
            "Network",
            3
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            " What represents an ‘attribute’ in a relational database?",
            "Table",
            "Row",
            "Column",
            "Object",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which is the MySQL instance responsible for data processing?",
            "MySQL client",
            "MySQL server",
            "MySQL",
            "Server daemon program",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "The MySQL server used in its client/server architecture is ____________",
            "mysqla",
            "mysqlb,",
            "mysqlc",
            "mysqld",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The special database that always exists after setting up MySQL in a computer is __________",
            "sampdb",
            "mysql",
            "information_schema",
            "readme_db",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Identify the table name in the following SQL statement. /n INSERT INTO student VALUES('Kyle','M',NULL);",
            "Student",
            "Values",
            "Kyle",
            "M",
            1
        )
        questionsList.add(q6)
        val q7 =
            Questions(
                7,
                "Which operator is used to perform integer divisions in MySQL?",
                "/",
                "/*",
                "DIV",
                "//",
                3
            )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "What does comparing a known value with NULL result into?",
            "zero",
            "a positive value",
            "a negative value",
            "null",
            4
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following options tells mysql to ask for entering the password?",
            "-e",
            "-p",
            "-u",
            "-h",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "What is ‘tamp’ in the following MySQL command? \n mysql -h xyz.host.try.net -p -u tamp",
            "user name",
            "password",
            "host name",
            "table name",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Mysql2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "The query ‘SELECT NOW()’ shows the current _____________",
            "table",
            "time only",
            "date only",
            "date and time",
            4
        )
        questionsList.add(q1)
        val q2 =
            Questions(
                2,
                "The statement to change the table name is __________",
                "CHANGE",
                "CHANGENAME",
                "CHANGENM",
                "RENAME",
                4
            )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of these modes is a composite server mode?",
            "COMPOSITE",
            "COMPOSITE_MODE",
            "COMPOSITE_SERVER",
            "ANSI",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "The default case sensitivity of database and table names depends on ___________",
            "SQL server",
            "Server SQL mode",
            "Operating system of machine",
            "Does not depend on anything",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which case does InnoDB store database names in?",
            "lower",
            "upper",
            "mixed",
            "random",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which of these is also known as a virtual table?",
            "SCHEMA",
            "DATABASE",
            "JOIN",
            "VIEW",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "What is abc in the following MySQL statement? \n CREATE VIEW xyz (abc) AS SELECT a FROM t;",
            "row name",
            "column name",
            "database",
            "view",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "A view can be deleted using the command __________",
            "REMOVE",
            "DELETE",
            "CLEAR",
            "DROP",
            4
        )
        questionsList.add(q8)
        val q9 =
            Questions(
                9,
                "What is generally done after the transactions are executed successfully?",
                "delete",
                "rollback",
                "commit",
                "update",
                3
            )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "What does ‘A’ stand for in the ACID property of transactions?",
            "Availability",
            "Accuracy",
            "Adjustability",
            "Atomicity",
            4
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Mysql3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which among the following is the correct syntax for creating table?",
            "CREATE TABLE name;",
            "CREATE name;",
            "CREATE TABLE",
            "All of above",
            1
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which data type character merges the “Check Constraint” into a data type definition?",
            "ENUM",
            "ENUM1",
            "ENUM2",
            "None of above",
            1
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which among the following are the correct definitions for “NULL” in Mysql?",
            "Absence of value",
            "Unknown",
            "Empty set",
            "All of above",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which statement is used to remove indexes on tables?",
            "DROP INDEX",
            "DELETE INDEX",
            "REMOVE INDEX",
            "FLUSH INDEX",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The default storage engine used is ____________",
            "EXAMPLE",
            "ARCHIVE",
            "MyISAM2",
            "NDB",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Which keyword is the synonym for DATABASE?",
            "TABLE",
            "OBJECT",
            "DB",
            "SCHEMA",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "MySQL stores the database character set and collation attributes in the file _________",
            "dp.opt",
            "db.opt",
            "db.sv",
            "db.zip",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "FULLTEXT indexes can be created only for ____________",
            "MyISAM",
            "InnoDB",
            "MEMORY",
            "TRANSITION",
            1
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "The general term for information about databases and the objects in MySQL is _________",
            "datum",
            "info",
            "record",
            "metadata",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "The command which lists databases managed by the server is _____________",
            "mysqld",
            "mysqlshow",
            "mysqllist",
            "mysqldb",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Php1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "What does PHP stand for?",
            "Personal Home Page",
            "Hypertext Preprocessor",
            "Pretext Hypertext Processor",
            "Preprocessor Home Page",
            1
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "PHP files have a default file extension of_______",
            ".html",
            ".xml",
            ".php",
            ".ph",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which version of PHP introduced Try/catch Exception?",
            "PHP 4",
            "PHP 5",
            "PHP 6",
            "PHP 5 and later",
            4
        )
        questionsList.add(q3)
        val q4 =
            Questions(
                4,
                "How should we add a single line comment in our PHP code?",
                "//",
                "#",
                "/**/",
                "All of the above",
                4
            )
        questionsList.add(q4)

        val q5 = Questions(
            5,
            "Which of the looping statements is/are supported by PHP?",
            "for loop",
            "while loop",
            "do-while loop",
            "All of the above", 4
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "Type Hinting was introduced in which version of PHP?",
            "PHP 4",
            "PHP 5",
            "PHP 5.3",
            "PHP 6",
            2
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "Which one of the following PHP functions can be used to find files?",
            "glob()",
            "file()",
            "fold()",
            "get_file()",
            1
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which of the following PHP functions can be used for generating unique ids?",
            "uniqueid()",
            "id()",
            "md5()",
            "mdid()",
            1
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which one of the following functions can be used to compress a string?",
            "zip_compress()",
            "zip()",
            "compress()",
            "gzcompress()",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "PHP’s numerically indexed array begin with position ___________",
            "1",
            "2",
            "0",
            "-1",
            3
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Php2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Who developed  PHP?",
            "Zim Den",
            "Rasmus Lerdorf",
            "Niene Stom",
            "Wick van Rossum",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2, "Which in-built function will add a value to the end of an array?",
            "array_unshift()", "into_array()",
            "inend_array()",
            "array_push()", 4
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of the functions is used to sort an array in descending order?",
            "sort()",
            "asort()",
            "rsort()",
            "dsort()",
            3
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            " Which one of the following property scopes is not supported by PHP?",
            "friendly",
            "final",
            "public",
            "static",
            1
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "Which method scope prevents a method from being overridden by a subclass?",
            "Abstract",
            "Protected",
            "Final",
            "Static",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "PHP recognizes constructors by the name _________",
            "classname()",
            "_construct()",
            "function _construct()",
            "function __construct()",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            " Which version of PHP introduced the instanceof keyword?",
            "PHP 4",
            "PHP 5",
            "PHP 5.3",
            "PHP 6",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which one of the following functions is used to determine object type?",
            "obj_type()",
            "type()",
            "is_a()",
            "is_obj()",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Which of the following advanced OOP features is/are not supported by PHP?",
            "Inheritances",
            "Multiple Inheritance",
            "Namespaces",
            "Object Cloning",
            2
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which method is used to tweak an object’s cloning behavior?",
            "clone()",
            "__clone()",
            "_clone",
            "object_clone()",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Php3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which method is used to implement overloading in PHP?",
            "__call",
            "__invoke",
            "__wakeupt",
            "__unset",
            1
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            " How many error levels are available in PHP?",
            "14",
            "15",
            "16",
            "17",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which version of PHP introduced E_STRICT Error level?",
            "PHP 4",
            "PHP 5",
            "PHP 5.2",
            "PHP 5.3",
            2
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which version introduced the function error_get_last()?",
            "PHP 4",
            "PHP 5",
            "PHP 5.2",
            "PHP 5.3",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "How many methods are available for the exception class?",
            "5",
            "6",
            "7",
            "8",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "What does SPL stand for?",
            "Standard PHP Library",
            "Source PHP Library",
            "Standard PHP List",
            "Source PHP List",
            1
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            " How many predefined exceptions does SPL provide access to?",
            "13",
            "14",
            "15",
            "16",
            1
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "How many types of filtering are present in PHP?",
            "2",
            "3",
            "4",
            "5",
            2
        )
        questionsList.add(q8)
        val q9 =
            Questions(
                9,
                "PHP has long supported two regular expression implementations known as _______ and _______",
                "Perl, PEAR",
                "PEAR, POSIX",
                "Perl, POSIX",
                "Pear, Pearl", 3
            )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "How many functions does PHP offer for searching strings using POSIX style regular expression?",
            "7",
            "8",
            "9",
            "q0",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Python1 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Which of the following is an invalid variable?",
            "my_string_1",
            "1st_string",
            "foo",
            "_",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which of the following cannot be a variable?",
            "__init__",
            "in",
            "it",
            "on",
            2
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "What is the return type of function id?",
            "int",
            "float",
            "bool",
            "dict",
            1
        )
        questionsList.add(q3)
        val q4 =
            Questions(4, "What is the type of inf?", "Boolean", "Integer", "Float", "Complex", 3)
        questionsList.add(q4)
        val q5 = Questions(5, "What is the result of cmp(3, 1)?", "1", "0", "True", "False", 1)
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "What will be the output of the following Python code?  ['f', 't'][bool('spam')]",
            "t",
            "f",
            "No output",
            "Error",
            1
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "In which language is Python written?",
            "English",
            "PHP",
            "C",
            "All of the above",
            3
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "What is the maximum possible length of an identifier?",
            "16",
            "32",
            "64",
            "None of these above",
            4
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Suppose list1 is [2445,133,12454,123], what is max(list1)?",
            "2445",
            "133",
            "12454",
            "123",
            3
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "_____ represents an entity in the real world with its identity and behaviour.",
            "A method",
            "An object",
            "A class",
            "An operator",
            2
        )
        questionsList.add(q10)
        return questionsList
    }
}


object Python2 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "Who developed the Python language?",
            "Zim Den",
            "Guido van Rossum",
            "Niene Stom",
            "Wick van Rossum",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(2, "Which operator is right-associative", "- *", "- =", "- +", "- %", 2)
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Which of the following is not a keyword in Python language?",
            "val",
            "raise",
            "try",
            "with",
            1
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "Which of the following declarations is incorrect?",
            "_x = 2",
            "__x = 3",
            "__xyz__ = 5",
            "None of these",
            4
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "If return statement is not used inside the function, the function will return",
            "None",
            "0",
            "Null",
            "Arbitary value",
            1
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "In python, what is method inside class?",
            "attribute",
            "object",
            "argument",
            "function",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "All classes have a function called?",
            "__init__",
            "__init__()",
            "init",
            "init()",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Which of the following option is not a core data type in the python language?",
            "Dictionary",
            "Lists",
            "Class",
            "All of the above",
            3
        )
        questionsList.add(q8)
        val q9 = Questions(
            9,
            "Parent class is the class being inherited from, also called?",
            "derived class",
            "Child class",
            "Hybrid class",
            "base class",
            4
        )
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "You can delete properties on objects by using the ______  keyword.",
            "delete",
            "dedl",
            "del",
            "drop",
            3
        )
        questionsList.add(q10)
        return questionsList
    }
}

object Python3 {
    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(
            1,
            "In which part of memory does the system stores the parameter and local variables of funtion call?",
            "heap",
            "stack",
            "Uninitialized data segment",
            "None of the above",
            2
        )
        questionsList.add(q1)
        val q2 = Questions(
            2,
            "Which exception raised when a calculation exceeds maximum limit for a numeric type?",
            "StandardError",
            "ArithmeticError",
            "OverflowError",
            "FloatingPointError",
            3
        )
        questionsList.add(q2)
        val q3 = Questions(
            3,
            "Tell Output for print(int(6 == 6.0) * 3 + 4 % 5)",
            "22",
            "18",
            "20",
            "7",
            4
        )
        questionsList.add(q3)
        val q4 = Questions(
            4,
            "How many keywords present in the python programming language?",
            "32",
            "61",
            "33",
            "27",
            3
        )
        questionsList.add(q4)
        val q5 = Questions(
            5,
            "The function pow(x,y,z) is evaluated as:",
            "(x**y)**z",
            "(x**y) / z",
            "(x**y) % z",
            "x**y)*z",
            3
        )
        questionsList.add(q5)
        val q6 = Questions(
            6,
            "_function that will make the child class inherit all the methods and properties from its parent",
            "self",
            "__init__()",
            "pass",
            "super",
            4
        )
        questionsList.add(q6)
        val q7 = Questions(
            7,
            "How many control statements python supports?",
            "Two",
            "Three",
            "Four",
            "None of the these",
            2
        )
        questionsList.add(q7)
        val q8 = Questions(
            8,
            "Suppose B is a subclass of A, to invoke the __init__ method in A from B, what is the line of code you should write?",
            "A.__init__(self)",
            "B.__init__(self)",
            "A.__init__(B)",
            "B.__init__(A)",
            1
        )
        questionsList.add(q8)
        val q9 =
            Questions(9, "Which operator is overloaded by __invert__()?", "!", "~", "^", "–", 2)
        questionsList.add(q9)
        val q10 = Questions(
            10,
            "Which of the following is not a class method?",
            "Non-static",
            "Static",
            "Bounded",
            "Unbounded",
            1
        )
        questionsList.add(q10)
        return questionsList
    }
}