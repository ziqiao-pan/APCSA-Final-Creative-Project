# APCSA Final Creative Project
The overall purpose of the project is to save input characters into a file in local Disc D (Windows system）. And the file name is the current date (yyyymmdd), and then make a backup copy of the file. （The purpose is similar to saving chat history.) 

The package is used here in order to control access, to make searching/locating, and to make usage of classes easier.

1. public class Server creates two folders in local Disc D, and their names are "server 1" and "server 2".
2. public class GetFileName gains the name of the file. (Year, month, and day)
3. public class CloseSocket is an important method in Client.java. It closes the socket.
4. public class Client gets the input characters.
5. public class MoveFile uses the input information to create text files and save it to "server 1", and then it makes a backup copy and save the backup to "server 2".

Public method:
1. getFileName()

Work Cited:
1. https://www.javatpoint.com/socket-programming
2. https://www.codota.com/code/java/methods/java.util.Calendar/getInstance
3. https://blog.csdn.net/qq_36666651/article/details/84191732
4. https://www.jianshu.com/p/7856f63c7ff3
5. http://read.pudn.com/downloads167/sourcecode/java/applet/770589/苏庆坤/FileOperate.java__.htm
