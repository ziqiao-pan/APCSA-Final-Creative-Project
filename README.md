# APCSA Final Creative Project
The overall purpose of the project is to save input characters into a file in local Disc D (Windows system）. And the file name is the current date (yyyymmdd), and then make a backup copy of the file. （The purpose is similar to saving chat history.) 

The package is used here in order to control access, to make searching/locating, and to make usage of classes easier.

1. public class Server creates two folders in local Disc D, and their names are "server 1" and "server 2".
2. public class GetFileName gains the name of the file. (Year, month, and day)
3. public class CloseSocket is an important method in Client.java. It closes the socket.
4. public class Client gets the input characters.
5. public class MoveFile uses the input information to create text files and save it to "server 1", and then it makes a backup copy and save the backup to "server 2".

