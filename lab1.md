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
   * The output is not an error, because you can't switch your current working directory to a file.

**Command:** `ls`
1. Example of using the command with *no* arguments
   * ```
     [user@sahara ~]$ ls
     lecture1
     ```
   *
   * 
   * 
2. Example of using the command with a path to a *directory* as an argument
   *
   *
   * 
   * 
3. Example of using the command with a path to a *file* as an argument
   *
   *
   * 
   * 

**Command:** `cat`
1. Example of using the command with *no* arguments
   *
   *
   *
   * 
3. Example of using the command with a path to a *directory* as an argument
   *
   *
   *
   * 
5. Example of using the command with a path to a *file* as an argument
   *
   *
   *
   * 

