import javax.swing.JFrame;

public class MondrianViewer {

    public static void main(String[] args) {
        if(args.length==1)BlockComponent.setProbability(Integer.parseInt(args[0]));
        JFrame frame = new JFrame();

        frame.setSize(1024, 768);
        frame.setTitle("Mondrian Art");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BlockComponent component = new BlockComponent();
        frame.add(component);

        frame.setVisible(true);
        System.out.println("Fine");
    }

}