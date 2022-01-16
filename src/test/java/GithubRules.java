public class GithubRules {

    /*If there are change in a local class and another change in the remote class, you cannot pull that class due
    * to colliding changes. to solve it there are several options:
    * */
    //TODO 1. clear the local class. --> git reset --hard origin/master
    //If you want to only discard changes of one file then you can type:
    //TODO 2. git checkout <path_to_file>      for example:  git checkout src/test/java/SecondClass.java
    //<path_to_file> means the path file follows in the workspace. This change will bring one, current local class to previous state that github recognizes intact.
    /*Third option is stashing. It means before pulling remote class, we hide changes in local repo in a safe place and
    * bring them back after pulling changes from remote repo. For that type:*/
}
