import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter your name:");
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                return;
            }
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid name.");
                continue;
            }
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Proceed with the name \"" + name + "\"?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION
            );
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Welcome, " + name + "!");
                break;
            }
        }
    }
}
