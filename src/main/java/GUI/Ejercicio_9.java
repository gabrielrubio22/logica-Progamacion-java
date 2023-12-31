/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_9 extends javax.swing.JFrame {
    
    DefaultTableModel mt1 = new DefaultTableModel();
    private List<String> tipoAutos;
    private List<Integer> cantAutos;

    /**
     * Creates new form Ejercicio_9
     */
    public Ejercicio_9() {
        initComponents();
        tipoAutos = new ArrayList<>();
        cantAutos = new ArrayList<>();
        
        String ids [] = {"N°", "Tipo de auto", "Precio", "Comisión"};
        mt1.setColumnIdentifiers(ids);
        tabla.setModel(mt1);
        
        addRow(mt1, "1", "Automóvil", "$ 45'000.000", "5 %");
        addRow(mt1, "2", "Camioneta", "$ 60'000.000", "8 %");
        addRow(mt1, "3", "Camión", "$ 100'000.000", "10 %");
    }

    public void addRow(DefaultTableModel modelTabla, String numero, String tipoAuto, String precio, String comision){
        Object fila [] = {numero, tipoAuto, precio, comision};
        mt1.addRow(fila);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoAuto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numAuto = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        calcularSalario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Ejercicio 9");

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("COLOMBIAUTOS LTDA");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de auto vendido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad de auto vendido:");

        agregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        result.setColumns(20);
        result.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        result.setRows(5);
        jScrollPane2.setViewportView(result);

        calcularSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        calcularSalario.setText("Calcular Salario");
        calcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularSalarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Eliminar Ultimo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tipoAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                .addComponent(numAuto))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(agregar)
                                                .addGap(18, 18, 18)
                                                .addComponent(calcularSalario)))
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(151, 151, 151)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(numAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(calcularSalario))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String auto = tipoAuto.getText().toLowerCase();
        int cantAuto = Integer.parseInt(numAuto.getText());
       
        tipoAutos.add(auto);
        cantAutos.add(cantAuto);
        
        actualizarTextArea();
        
        tipoAuto.setText("");
        numAuto.setText("");
    }//GEN-LAST:event_agregarActionPerformed
    
    public static final double SALUD_PORCENTAJE = 0.03;
    public static final double PENSION_PORCENTAJE = 0.05;
    
    private void calcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularSalarioActionPerformed
        Map<String, Double> comisionTipo = new HashMap<>();
        
        comisionTipo.put("automovil", 0.05);
        comisionTipo.put("camioneta", 0.08);
        comisionTipo.put("camion", 0.1);
        
        double totalVentas = 0;
        double totalComision = 0;
        double totalAutosVendidos = 0;
        
        NumberFormat moneda = new DecimalFormat("$#,##0");
        moneda.setCurrency(Currency.getInstance(new Locale("es", "CO")));
        
        for(int i = 0; i < tipoAutos.size(); i++){
            String tipoAuto = tipoAutos.get(i);
            int cantidad = cantAutos.get(i);
            double valorAuto = 0;
            
            if(comisionTipo.containsKey(tipoAuto)){
                double comisionPorTipo = comisionTipo.get(tipoAuto);
                valorAuto = valorAuto(tipoAuto);
                
                double comision = comisionPorTipo * valorAuto * cantidad;
                totalComision += comision;
                
                result.append("Comision por " + tipoAuto + " : " + moneda.format(comision) + "\n");
            } else{
                result.append("Tipo de auto no reconocido: " + tipoAuto + "\n");
            }
            totalVentas += valorAuto * cantidad;
           
            totalAutosVendidos += cantidad;
        }
        
        
        int salarioBase = 1000000;
        if(totalAutosVendidos < 3){
            double descuento = salarioBase * 0.1;
            salarioBase -= descuento;
        }
        double salud = salarioBase * SALUD_PORCENTAJE;
        double pension = salarioBase * PENSION_PORCENTAJE;
        double salarioBaseDespuesDescuentos = salarioBase - (salud + pension);
        
        double sueldoMes = (salarioBase + totalComision) - (salud + pension);
        
        result.append("\n");
        result.append("Total ventas: " + moneda.format(totalVentas) + "\n");
        result.append("Total comisiones: " + moneda.format(totalComision) + "\n");
        result.append("Salario base: " + moneda.format(salarioBase) + "\n");
        result.append("Descuento del 3% correspondiente a SALUD: " + moneda.format(salud) + "\n");
        result.append("Descuento del 5% correspondiente a PENSION: " + moneda.format(pension) + "\n");
        result.append("Salario base despues de descuentos de SALUD y PENSION: " + moneda.format(salarioBaseDespuesDescuentos) + "\n");
        result.append("Sueldo de este mes: " + moneda.format(sueldoMes) + "\n");
        
    }//GEN-LAST:event_calcularSalarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eliminarUltimo();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void eliminarUltimo(){
        if(!tipoAutos.isEmpty()){
            tipoAutos.remove(tipoAutos.size() - 1);
        }
        
        if(!cantAutos.isEmpty()){
            cantAutos.remove(cantAutos.size() - 1);
        }
        
        actualizarTextArea();
        
    }
    
    public void actualizarTextArea(){
        StringBuilder cadena = new StringBuilder();
        for(int i = 0; i < tipoAutos.size(); i ++){
             cadena.append("Tipo de auto: ").append(tipoAutos.get(i)).append("\n");
             cadena.append("Cantidad de auto: ").append(cantAutos.get(i)).append("\n");
             cadena.append("\n");
        }
         result.setText(cadena.toString());
    }
    
    private int valorAuto(String tipoAuto){
        Map <String, Integer> valorAuto = new HashMap<>();
        valorAuto.put("automovil", 45000000);
        valorAuto.put("camioneta", 60000000);
        valorAuto.put("camion", 100000000);
        
        return valorAuto.getOrDefault(tipoAuto, 0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton calcularSalario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numAuto;
    private javax.swing.JTextArea result;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tipoAuto;
    // End of variables declaration//GEN-END:variables
}
