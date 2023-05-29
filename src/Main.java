public class Main {
    public static void main(String[] args) {
        AplicativoSwing form = new AplicativoSwing();
        form.setContentPane(form.formAppSwing);
        form.setVisible(true);
        form.setSize(500,500);
        form.setTitle("Aplicativo Swing");
    }
}