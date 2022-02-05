package todo;

public interface Commands {

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    int LOGOUT = 0;
    int ADD_NEW_TODO = 1;
    int MY_ALL_LIST = 2;
    int MY_TODO_LIST = 3;
    int MY_IN_PROGRESS_LIST = 4;
    int MY_FINISHED_LIST = 5;
    int CHANGE_TODO_STATUS = 6;
    int DELETE_TODO = 7;

    static void printMainCommands() {
        System.out.println("Please, input " + EXIT + " for EXIT");
        System.out.println("Please, input " + LOGIN + " for logging in");
        System.out.println("Please, input " + REGISTER + " for registering");

    }

    static void printUserCommands() {
        System.out.println("Please, input " + LOGOUT + " for logging out");
        System.out.println("Please, input " + ADD_NEW_TODO + " for adding new todo");
        System.out.println("Please, input " + MY_ALL_LIST + " for printing my all list");
        System.out.println("Please, input " + MY_TODO_LIST + " for printing my todo list");
        System.out.println("Please, input " + MY_IN_PROGRESS_LIST + " for printing my in progress list");
        System.out.println("Please, input " + MY_FINISHED_LIST + " for printing my finished list");
        System.out.println("Please, input " + CHANGE_TODO_STATUS + " for changing todo status");
        System.out.println("Please, input " + DELETE_TODO + " for deleting todo");

    }

}
