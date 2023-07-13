package com.one.challenge.conversor.utilities;
/**
 * @author Brayan_Acosta_Vivas
 */
import com.one.challenge.conversor.temperatura.*;
import com.one.challenge.conversor.divisa.*;
import com.one.challenge.conversor.longitud.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.ui.*;


import javax.swing.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.parseDouble;

public class Conversor {



    public static void main(String[] args)  throws UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel(new FlatMacLightLaf());
        JFrame frame = new JFrame("Challenge ONE: Conversor de unidades");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.setContentPane(new Conversor().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

    }

    private JPanel rootPanel;
    private JComboBox selectConversor;
    private JComboBox selectEntrada;
    private JComboBox selectSalida;
    private JTextPane textEntrada;
    private JTextPane textSalida;

    private JButton convertirButton;

    public Conversor() {

        textEntrada.setBorder(new FlatRoundBorder());
        textSalida.setBorder(new FlatRoundBorder());

        Map<String, TemperaturaInterface> tempEntrada = new HashMap<>();
        tempEntrada.put("Kelvin", new KelvinTo());
        tempEntrada.put("Celsius", new CelsiusTo());
        tempEntrada.put("Fahrenheit", new FahrenheitTo());
        tempEntrada.put("Rankine", new RankineTo());
        tempEntrada.put("Reaumur", new ReaumurTo());

        Map<String, DivisaInterface> divEntrada = new HashMap<>();
        divEntrada.put("Peso Colombiano", new CopTo());
        divEntrada.put("Dolar",  new DolarTo());
        divEntrada.put("Euro",  new EuroTo() );
        divEntrada.put("Libra esterlina",  new GbpTo() );
        divEntrada.put("Yen japones",  new JpyTo() );
        divEntrada.put("Won Sur-Coreano",  new KrwTo() );

        Map<String, LongitudInterface> longitudEntrada = new HashMap<>();
        longitudEntrada.put("Kilometro", new KilometroTo());
        longitudEntrada.put("Metro", new MetroTo());
        longitudEntrada.put("Centimetro", new CentimetroTo());
        longitudEntrada.put("Milimetro", new MilimetroTo());
        longitudEntrada.put("Micrometro", new MicrometroTo());
        longitudEntrada.put("Nanometro", new NanometroTo());
        longitudEntrada.put("Milla", new MillaTo());
        longitudEntrada.put("Yarda", new YardaTo());
        longitudEntrada.put("Pie", new PieTo());
        longitudEntrada.put("Pulgada", new PulgadaTo());
        longitudEntrada.put("MillaNautica", new MillaNauticaTo());


        selectConversor.addItem("Conversor de moneda");
        selectConversor.addItem("Conversor de temperatura");
        selectConversor.addItem("Conversor de longitud");
        selectEntrada.addItem("Dolar");
        selectEntrada.addItem("Peso Colombiano");
        selectEntrada.addItem("Euro");
        selectEntrada.addItem("Libra esterlina");
        selectEntrada.addItem("Yen japones");
        selectEntrada.addItem("Won Sur-Coreano");

        selectSalida.addItem("Dolar");
        selectSalida.addItem("Peso Colombiano");
        selectSalida.addItem("Euro");
        selectSalida.addItem("Libra esterlina");
        selectSalida.addItem("Yen japones");
        selectSalida.addItem("Won Sur-Coreano");

        selectConversor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                selectEntrada.removeAllItems();
                selectSalida.removeAllItems();
                if(selectConversor.getSelectedItem().equals("Conversor de moneda")){

                    selectEntrada.addItem("Dolar");
                    selectEntrada.addItem("Peso Colombiano");
                    selectEntrada.addItem("Euro");
                    selectEntrada.addItem("Libra esterlina");
                    selectEntrada.addItem("Yen japones");
                    selectEntrada.addItem("Won Sur-Coreano");

                    selectSalida.addItem("Dolar");
                    selectSalida.addItem("Peso Colombiano");
                    selectSalida.addItem("Euro");
                    selectSalida.addItem("Libra esterlina");
                    selectSalida.addItem("Yen japones");
                    selectSalida.addItem("Won Sur-Coreano");
                }
                else if(selectConversor.getSelectedItem().equals("Conversor de temperatura")){

                    selectEntrada.addItem("Celsius");
                    selectEntrada.addItem("Kelvin");
                    selectEntrada.addItem("Fahrenheit");
                    selectEntrada.addItem("Rankine");
                    selectEntrada.addItem("Reaumur");

                    selectSalida.addItem("Celsius");
                    selectSalida.addItem("Kelvin");
                    selectSalida.addItem("Fahrenheit");
                    selectSalida.addItem("Rankine");
                    selectSalida.addItem("Reaumur");
                }

                else if(selectConversor.getSelectedItem().equals("Conversor de longitud")){

                    selectEntrada.addItem("Kilometro");
                    selectEntrada.addItem("Metro");
                    selectEntrada.addItem("Centimetro");
                    selectEntrada.addItem("Milimetro");
                    selectEntrada.addItem("Micrometro");
                    selectEntrada.addItem("Nanometro");
                    selectEntrada.addItem("Milla");
                    selectEntrada.addItem("Yarda");
                    selectEntrada.addItem("Pie");
                    selectEntrada.addItem("Pulgada");
                    selectEntrada.addItem("MillaNautica");


                    selectSalida.addItem("Kilometro");
                    selectSalida.addItem("Metro");
                    selectSalida.addItem("Centimetro");
                    selectSalida.addItem("Milimetro");
                    selectSalida.addItem("Micrometro");
                    selectSalida.addItem("Nanometro");
                    selectSalida.addItem("Milla");
                    selectSalida.addItem("Yarda");
                    selectSalida.addItem("Pie");
                    selectSalida.addItem("Pulgada");
                    selectSalida.addItem("MillaNautica");
                }
            }
        });
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(textEntrada.getText().isEmpty()){
                        textSalida.setText("");
                        JOptionPane.showMessageDialog(null, "Debe escribir un valor valido");
                    }else {
                        if (selectConversor.getSelectedItem().equals("Conversor de temperatura")) {
                            TemperaturaInterface unit = tempEntrada.get(selectEntrada.getSelectedItem());

                            double valor = parseDouble(textEntrada.getText());

                            System.out.println(valor);
                            System.out.println(selectEntrada.getSelectedItem());
                            System.out.println(selectSalida.getSelectedItem());

                            Map<String, Response> tempSalida = new HashMap<>();
                            tempSalida.put("Kelvin", unit.Kelvin(valor));
                            tempSalida.put("Celsius", unit.Celsius(valor));
                            tempSalida.put("Fahrenheit", unit.Fahrenheit(valor));
                            tempSalida.put("Rankine", unit.Rankine(valor));
                            tempSalida.put("Reaumur", unit.Reaumur(valor));

                            Response res = tempSalida.get(selectSalida.getSelectedItem());

                            if(res.getMessage()!=null){
                                textSalida.setText(String.valueOf(BigDecimal.valueOf(res.getValor()))+"\n\nFormula:\n"+(res.getMessage()));
                            }else{
                                textSalida.setText(String.valueOf(BigDecimal.valueOf(res.getValor())));
                            }


                        } else if (selectConversor.getSelectedItem().equals("Conversor de moneda")) {
                            DivisaInterface divisa = divEntrada.get(selectEntrada.getSelectedItem());

                            double valor = parseDouble(textEntrada.getText());

                            Map<String, Double> divSalida = new HashMap<>();
                            divSalida.put("Peso Colombiano", divisa.Cop(valor));
                            divSalida.put("Dolar", divisa.Dolar(valor));
                            divSalida.put("Euro", divisa.Euro(valor));
                            divSalida.put("Libra esterlina", divisa.Gbp(valor));
                            divSalida.put("Yen japones", divisa.Jpy(valor));
                            divSalida.put("Won Sur-Coreano", divisa.Krw(valor));

                            double res = divSalida.get(selectSalida.getSelectedItem());

                            textSalida.setText(String.valueOf(BigDecimal.valueOf(res)));
                        } else if (selectConversor.getSelectedItem().equals("Conversor de longitud")) {
                            LongitudInterface longitud = longitudEntrada.get(selectEntrada.getSelectedItem());

                            double valor = parseDouble(textEntrada.getText());

                            Map<String, Double> longitudSalida = new HashMap<>();
                            longitudSalida.put("Kilometro", longitud.Kilometro(valor));
                            longitudSalida.put("Metro", longitud.Metro(valor));
                            longitudSalida.put("Centimetro", longitud.Centimetro(valor));
                            longitudSalida.put("Milimetro", longitud.Milimetro(valor));
                            longitudSalida.put("Micrometro", longitud.Micrometro(valor));
                            longitudSalida.put("Nanometro", longitud.Nanometro(valor));
                            longitudSalida.put("Milla", longitud.Milla(valor));
                            longitudSalida.put("Yarda", longitud.Yarda(valor));
                            longitudSalida.put("Pie", longitud.Pie(valor));
                            longitudSalida.put("Pulgada", longitud.Pulgada(valor));
                            longitudSalida.put("MillaNautica", longitud.MillaNautica(valor));

                            double res = longitudSalida.get(selectSalida.getSelectedItem());

                            textSalida.setText(String.valueOf(BigDecimal.valueOf(res)));
                        }
                    }
                }catch (Exception exception){
                    exception.printStackTrace();
                }

            }
        });
        textEntrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int key = e.getKeyChar();

                boolean numeros = (key >= 48 && key <= 57) || (key >= 45 && key <= 46);

                if (!numeros)
                {
                    e.consume();
                }
            }
        });
        convertirButton.addKeyListener(new KeyAdapter() {
        });
    }


}
