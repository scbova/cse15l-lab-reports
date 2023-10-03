## Lab Report 1
# Basic Filesystem Commands

**Command:** `cd`
1. Example of using the command with *no* arguments
   * ```
     [user@sahara ~]$ cd
     [user@sahara ~]$
     ```
   * The working directory was `/home`.
   * There was no output because the `cd` command is used for switching the current working directory,
     rather than printing anything out. Due to having no arguments, the current directory was not switched.
   * The output was not an error.
2. Example of using the command with a path to a *directory* as an argument
   * ```
     [user@sahara ~]$ cd lecture1
     [user@sahara ~/lecture1]$
     ```
   * The working directory was `/home` when the command was run.
   * There was no output, but the current working directory was switched to `/home/lecture1`.
   * The output was not an error.
3. Example of using the command with a path to a *file* as an argument
   * ```
     [user@sahara ~/lecture1/messages]$ cd en-us.txt
     bash: cd: en-us.txt: Not a directory
     ```
   * The working directory was `/home/lecture1/messages`.
   * The output informed that the `en-us.txt` file is not a directory.
   * The output is an error, because you can't switch your current working directory to a file.

**Command:** `ls`
1. Example of using the command with *no* arguments
   * ```
     [user@sahara ~]$ ls
     lecture1
     ```
   * The working directory was `/home` when the command was run.
   * The output listed the folder in the working directory, and the only folder is `lecture1`.
   * The output is not an error.
2. Example of using the command with a path to a *directory* as an argument
   * ```
     [user@sahara ~]$ ls lecture1
     Hello.class  Hello.java  messages  README
     ```
   * The working directory was `/home` when the command was run.
   * The output listed all of the different folders and files within the lecture1 directory, since
     lecture1 is contained in `/home` and was the argument passed.
   * The output is not an error.
3. Example of using the command with a path to a *file* as an argument
   * ```
     [user@sahara ~/lecture1/messages]$ ls en-us.txt
     en-us.txt
     ```
   * The working directory was `/home/lecture1/messages` when the command was run.
   * The ouput listed the name of the file that was passed as an argument. This is because this is the
     only file in the given path.
   * The output is not an error.

**Command:** `cat`
1. Example of using the command with *no* arguments
   * ```
     [user@sahara ~]$ cat
     
     ```
   * The working directory was `/home` when the command was run.
   * There was no output, because the terminal is waiting for the user to pass arguments. This is because
     arguments are required for this command to properly run.
   * The output it not an error, since the command didn't run.
3. Example of using the command with a path to a *directory* as an argument
   * ```
     [user@sahara ~]$ cat lecture1
     cat: lecture1: Is a directory
     ```
   * The working directory was `/home` when the command was run.
   * The output was caused by `cat` requiring a file to be passed as an argument rather than a directory,
     since there is nothing to be printed out in the directory.
   * The output is an error, since `cat` requires a file to be used as an argument.
5. Example of using the command with a path to a *file* as an argument
   * ```
     [user@sahara ~/lecture1/messages]$ cat en-us.txt
     Hello World!
     ```
   * The working directory was `/home/lecture1/messages` when the command was run.
   * The output was printed because that is what the contents of the file `en-us.txt` contains.
   * The ouput is not an error.

