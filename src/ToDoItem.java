public class ToDoItem {
    private String description;
    private boolean isDone;

    private ArrayList<ToDoItem> toDoItems;

    public User(String username, String password) {
        // ... (other initializations)
        this.toDoItems = new ArrayList<>();
    }

    /**
     * Gets the to-do items of the user.
     * @return A reference to the list of to-do items, which can be modified from outside the class.
     */
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }
    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}