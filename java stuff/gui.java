import javax.swing.*;
class gui{
    public static void main(String[] args){
        JFrame mainframe = new JFrame(":(");
        // Make a new frame for the gui
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Allow it to close when the x button is pressed
        mainframe.setSize(500,500);
        // Set the size of the gui
        mainframe.setVisible(true);
        // Allow the frame to be seen
        mainframe.setLayout(null);
        // Don't set a layout yet


        JButton button = new JButton("Press if you're depressed");
        // Make a new button
        button.setSize(290, 90);
        // Set the size of the button
        mainframe.add(button);
        // Add the button to the frame so it can be seen
    }
}