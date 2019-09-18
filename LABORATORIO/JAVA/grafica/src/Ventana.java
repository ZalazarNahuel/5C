import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame {
    public JPanel panel;
    public JLabel resultado;
    public Ventana(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        iniciarComponentes();

    }
    private void iniciarComponentes(){
        colocarlPaneles();
        colocarEtiqueta();
        colocarBotones();

    }
    private void colocarlPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

    }
    private void colocarEtiqueta(){
        resultado = new JLabel();
        resultado.setBounds(10,250,110,25);

        panel.add(resultado);
    }
    private void colocarBotones(){
        colocarBoton("1",10,10,50,50);
        colocarBoton("2",70,10,50,50);
        colocarBoton("3",130,10,50,50);
        colocarBoton("+",190,10,50,50);
        colocarBoton("4",10,70,50,50);
        colocarBoton("5",70,70,50,50);
        colocarBoton("6",130,70,50,50);
        colocarBoton("-",190,70,50,50);
        colocarBoton("7",10,130,50,50);
        colocarBoton("8",70,130,50,50);
        colocarBoton("9",130,130,50,50);
        colocarBoton("0",10,190,50,50);
        colocarIgual();
        colocarClear();

    }
    private void colocarBoton(String text, int x, int y ,int w, int h){
        JButton boton = new JButton();
        boton.setBounds(x,y,w,h);
        boton.setText(text);
        panel.add(boton);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText()+boton.getText());
            }
        };
        boton.addActionListener(listener);
    }
    private void colocarClear(){
        JButton boton = new JButton();
        boton.setBounds(190,130,50,50);
        boton.setText("C");
        panel.add(boton);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("");
            }
        };
        boton.addActionListener(listener);
    }
    private void colocarIgual(){
        JButton igual = new JButton();
        igual.setBounds(70,190,110,50);
        igual.setText("=");
        panel.add(igual);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hacerOperacion();
            }
        };
        igual.addActionListener(listener);
    }
    private void hacerOperacion(){
        ArrayList<Integer> terminos = new ArrayList<Integer>();
        ArrayList<Character> operaciones = new ArrayList<Character>();
        String ter = "";
        String result = resultado.getText();
        for(int i=0;i<result.length();i++){
            char l = result.charAt(i);
            if(l == '+' || l == '-'){
                int a = Integer.parseInt(ter);
                terminos.add(a);
                ter = "";
                operaciones.add(l);
            }
            else{
                ter = ter + l;
                if(i == (result.length()-1)){
                    int a = Integer.parseInt(ter);
                    terminos.add(a);
                }
            }

        }
        int r = terminos.get(0);
        for(int i = 0;i < operaciones.size();i++){
            if( operaciones.get(i) == '+'){
                r = r + terminos.get(i+1);
            }
            else if( operaciones.get(i) == '-' ){
                r = r - terminos.get(i+1);
            }
        }
       resultado.setText(resultado.getText() + '=' + r);

    }




}
