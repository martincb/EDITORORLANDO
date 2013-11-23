
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;


public class Pantalla extends javax.swing.JFrame {
private boolean HaCambiado=false; //Bandera para saber si hay cambios en el archivo
private File ArchivoActual = null; //Archivo que maneja el editor para abrir y guardar
private JLabel Ruta; //guarda la ruta del archivo
private JLabel Tamaño; //Guarda el tamaño que adquiere el archivo 
private UndoManager undoManager;            //instancia de UndoManager (administrador de edición)

    public Pantalla() {
        initComponents();
       
        
    }
    
//#######MetodosDiversos
public JLabel getRuta(){
return Ruta;}
public void setRuta(String ruta){
this.Ruta.setText(ruta);}
public JLabel getTamaño(){
return Tamaño;}
public void setTamaño(String siz){
this.Tamaño.setText(siz);}

//#########
 

//######Area  de Eventos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraHerramientas = new javax.swing.JToolBar();
        BNuevo = new javax.swing.JButton();
        BAbrir = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        BGuardarC = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BImprimir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        BAtras = new javax.swing.JButton();
        BAdelante = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BCopiar = new javax.swing.JButton();
        BCortar = new javax.swing.JButton();
        BPegar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarraHerramientas.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BarraHerramientas.setRollover(true);
        BarraHerramientas.setBorderPainted(false);
        BarraHerramientas.setEnabled(false);

        BNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_new.png"))); // NOI18N
        BNuevo.setToolTipText("Nuevo");
        BNuevo.setBorder(null);
        BNuevo.setFocusable(false);
        BNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BNuevo);

        BAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_open.png"))); // NOI18N
        BAbrir.setToolTipText("Abrir");
        BAbrir.setBorder(null);
        BAbrir.setFocusable(false);
        BAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAbrirActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BAbrir);

        BGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_save.png"))); // NOI18N
        BGuardar.setToolTipText("Guardar");
        BGuardar.setBorder(null);
        BGuardar.setFocusable(false);
        BGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BGuardar);

        BGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_saveas.png"))); // NOI18N
        BGuardarC.setToolTipText("Guardar Como");
        BGuardarC.setBorder(null);
        BGuardarC.setFocusable(false);
        BGuardarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BGuardarC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarCActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BGuardarC);
        BarraHerramientas.add(jSeparator2);

        BImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_print.png"))); // NOI18N
        BImprimir.setToolTipText("Imprimir");
        BImprimir.setBorder(null);
        BImprimir.setFocusable(false);
        BImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BImprimir);
        BarraHerramientas.add(jSeparator3);

        BAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_undo.png"))); // NOI18N
        BAtras.setToolTipText("Atras");
        BAtras.setBorder(null);
        BAtras.setFocusable(false);
        BAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BAtras);

        BAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_redo.png"))); // NOI18N
        BAdelante.setToolTipText("Adelante");
        BAdelante.setBorder(null);
        BAdelante.setFocusable(false);
        BAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAdelante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BAdelante);
        BarraHerramientas.add(jSeparator1);

        BCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_copy.png"))); // NOI18N
        BCopiar.setToolTipText("Copiar");
        BCopiar.setBorder(null);
        BCopiar.setFocusable(false);
        BCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BCopiar);

        BCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_cut.png"))); // NOI18N
        BCortar.setToolTipText("Cortar");
        BCortar.setBorder(null);
        BCortar.setFocusable(false);
        BCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BCortar);

        BPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_paste.png"))); // NOI18N
        BPegar.setToolTipText("Pegar");
        BPegar.setBorder(null);
        BPegar.setFocusable(false);
        BPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientas.add(BPegar);

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BNuevoActionPerformed

    
    //Evento al precionar Abrir
    private void BAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirActionPerformed
     SelectorArchivo();
    }//GEN-LAST:event_BAbrirActionPerformed

    private void BGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BGuardarCActionPerformed

public void SelectorArchivo(){
   FileFilter textFileFilter = new FileFilter() { //genera un filtro para abrir 
       public boolean accept(File f) {
                       //acepta directorios y archivos de extensión .txt
            return f.isDirectory() || f.getName().toLowerCase().endsWith("txt");}
       public String getDescription() {
                       //la descripción del tipo de archivo aceptado
            return "Text Files";
       }
   }; 
   
        JFileChooser fc = new JFileChooser();                          //construye un JFileChooser
        fc.setDialogTitle("Editor de Orlando - Elige un archivo:");    //se le establece un título
        fc.setMultiSelectionEnabled(false);                            //desactiva la multi-selección
        fc.setFileFilter(textFileFilter);                              //aplica un filtro de extensiones
        
        int state = fc.showOpenDialog(this);
        
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAbrir;
    private javax.swing.JButton BAdelante;
    private javax.swing.JButton BAtras;
    private javax.swing.JButton BCopiar;
    private javax.swing.JButton BCortar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BGuardarC;
    private javax.swing.JButton BImprimir;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BPegar;
    private javax.swing.JToolBar BarraHerramientas;
    public javax.swing.JTextArea Texto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables

    
}


