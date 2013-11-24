
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
private File Archivo = null; //Archivo que maneja el editor para abrir y guardar
private File ArchivoActual = null; //Archivo que maneja el editor para abrir y guardar
private JLabel Ruta; //guarda la ruta del archivo
private JLabel Tamaño; //Guarda el tamaño que adquiere el archivo 
private UndoManager undoManager;            //instancia de UndoManager (administrador de edición)
public JFileChooser fc = new JFileChooser(); 
int state;
private String UltimaBusqueda = "";



    public Pantalla() {
        initComponents();
        //Siguiente.enable(false);
       
        
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
        Siguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        BMImprimir = new javax.swing.JMenuItem();
        BMSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        BMBuscar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        BMCopiar = new javax.swing.JMenuItem();
        BMCortar = new javax.swing.JMenuItem();
        BMPegar = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        BMSeleccionarT = new javax.swing.JMenuItem();

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
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
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
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });
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
        BCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCopiarActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BCopiar);

        BCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_cut.png"))); // NOI18N
        BCortar.setToolTipText("Cortar");
        BCortar.setBorder(null);
        BCortar.setFocusable(false);
        BCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCortarActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BCortar);

        BPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_paste.png"))); // NOI18N
        BPegar.setToolTipText("Pegar");
        BPegar.setBorder(null);
        BPegar.setFocusable(false);
        BPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPegarActionPerformed(evt);
            }
        });
        BarraHerramientas.add(BPegar);

        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/tp_search.png"))); // NOI18N
        Siguiente.setToolTipText("Buscar");
        Siguiente.setBorder(null);
        Siguiente.setFocusable(false);
        Siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Siguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        BarraHerramientas.add(Siguiente);

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Abrir");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar Como");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator5);

        BMImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        BMImprimir.setText("Imprimir");
        BMImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(BMImprimir);

        BMSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        BMSalir.setText("Salir");
        BMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMSalirActionPerformed(evt);
            }
        });
        jMenu1.add(BMSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        BMBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        BMBuscar.setText("Buscar");
        BMBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMBuscarActionPerformed(evt);
            }
        });
        jMenu2.add(BMBuscar);
        jMenu2.add(jSeparator4);

        BMCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        BMCopiar.setText("Copiar");
        BMCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(BMCopiar);

        BMCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        BMCortar.setText("Cortar");
        BMCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMCortarActionPerformed(evt);
            }
        });
        jMenu2.add(BMCortar);

        BMPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        BMPegar.setText("Pegar");
        BMPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMPegarActionPerformed(evt);
            }
        });
        jMenu2.add(BMPegar);
        jMenu2.add(jSeparator6);

        BMSeleccionarT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        BMSeleccionarT.setText("Seleccionar Todo");
        BMSeleccionarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMSeleccionarTActionPerformed(evt);
            }
        });
        jMenu2.add(BMSeleccionarT);

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
    nuevo();
    }//GEN-LAST:event_BNuevoActionPerformed

    
    //Evento al precionar Abrir
    private void BAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAbrirActionPerformed
     SelectorArchivo();
      if (state == JFileChooser.APPROVE_OPTION) {    //si elige abrir el archivo
            Archivo = fc.getSelectedFile(); }   //obtiene el archivo seleccionado
      
      try {
                //abre un flujo de datos desde el archivo seleccionado
                BufferedReader br = new BufferedReader(new FileReader(Archivo));
                //lee desde el flujo de datos hacia el area de edición
                Texto.read(br, null);
                br.close();    //cierra el flujo
                
                //nuevo título de la ventana con el nombre del archivo cargado
                this.setTitle("Editor de Orlando - " + Archivo.getName());
                
                //establece el archivo cargado como el archivo actual
                ArchivoActual=Archivo;
                
      } catch (IOException ex) {    //en caso de que ocurra una excepción
                //presenta un dialogo modal con alguna información de la excepción
                JOptionPane.showMessageDialog(this,
                                              ex.getMessage(),
                                              ex.toString(),
                                              JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_BAbrirActionPerformed

    private void BGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarCActionPerformed
        guardarcomo();
    }//GEN-LAST:event_BGuardarCActionPerformed

    private void BMBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMBuscarActionPerformed
        busca();
    }//GEN-LAST:event_BMBuscarActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if (UltimaBusqueda.length() > 0) {    //si la última búsqueda contiene texto
            String textAreaContent = Texto.getText();    //se obtiene todo el contenido del área de edición
            int pos = Texto.getCaretPosition();    //se obtiene la posición del cursor sobre el área de edición
            //buscando a partir desde la posición del cursor, se obtiene la posición de la primera ocurrencia del texto
            pos = textAreaContent.indexOf(UltimaBusqueda, pos);
 
            if (pos > -1) {    //si la posición es mayor a -1 significa que la búsqueda fue positiva
                //selecciona el texto en el área de edición para resaltarlo
                Texto.select(pos, pos + UltimaBusqueda.length());
            }
        } else {    //si la última búsqueda no contiene nada
            busca();    //invoca el método actionSearch()
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void BCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCortarActionPerformed
         Texto.cut();
    }//GEN-LAST:event_BCortarActionPerformed

    private void BCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCopiarActionPerformed
        Texto.copy();
    }//GEN-LAST:event_BCopiarActionPerformed

    private void BPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPegarActionPerformed
        Texto.paste();
    }//GEN-LAST:event_BPegarActionPerformed

    private void BMCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMCopiarActionPerformed
        Texto.copy();
    }//GEN-LAST:event_BMCopiarActionPerformed

    private void BMCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMCortarActionPerformed
        Texto.cut();
    }//GEN-LAST:event_BMCortarActionPerformed

    private void BMPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMPegarActionPerformed
        Texto.paste();
    }//GEN-LAST:event_BMPegarActionPerformed

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_BImprimirActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        if (ArchivoActual == null) {    //si no hay un archivo asociado al documento actual
            guardarcomo();    //invoca el método actionSaveAs()
        } else {    //si el documento esta marcado como modificado
            try {
                //abre un flujo de datos hacia el archivo asociado al documento actual
                BufferedWriter bw = new BufferedWriter(new FileWriter(ArchivoActual));
                //escribe desde el flujo de datos hacia el archivo
                Texto.write(bw);
                bw.close();    //cierra el flujo
 
                
            } catch (IOException ex) {    //en caso de que ocurra una excepción
                //presenta un dialogo modal con alguna información de la excepción
                JOptionPane.showMessageDialog(this,
                                              ex.getMessage(),
                                              ex.toString(),
                                              JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_BMSalirActionPerformed

    private void BMImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMImprimirActionPerformed
    imprimir(); 
    }//GEN-LAST:event_BMImprimirActionPerformed

    private void BMSeleccionarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMSeleccionarTActionPerformed
        Texto.selectAll();
    }//GEN-LAST:event_BMSeleccionarTActionPerformed

    public void nuevo(){
         this.setTitle("TextPad Demo - Sin Título");    //nuevo título de la ventana
        //limpia el contenido del area de edición
        Texto.setText("");
        //el archivo asociado al documento actual se establece como null
        ArchivoActual=null;
        //marca el estado del documento como no modificado
    }
    
    public void imprimir(){
            boolean result = false;    //resultado de la impresión, por defecto es false
 
        //si el documento actual no esta vacío
        if (Texto.getText().trim().equals("") == false) {
            //invoca nuestra la clase PrintAction para presentar el dialogo de impresión
            result = PrintAction.print(Texto, this);
        }
}

public void guardarcomo(){
        SelectorArchivo();    //obtiene un JFileChooser
 
        //presenta un dialogo modal para que el usuario seleccione un archivo
        state = fc.showSaveDialog(this);
        if (state == JFileChooser.APPROVE_OPTION) {    //si elige guardar en el archivo
            File f = fc.getSelectedFile();    //obtiene el archivo seleccionado
 
            try {
                //abre un flujo de datos hacia el archivo asociado seleccionado
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                //escribe desde el flujo de datos hacia el archivo
                Texto.write(bw);
                bw.close();    //cierra el flujo
 
                //nuevo título de la ventana con el nombre del archivo guardado
                this.setTitle("Editor de Orlando - " + f.getName());
 
                
                //establece el archivo guardado como el archivo actual
                ArchivoActual=(f);
                
            } catch (IOException ex) {    //en caso de que ocurra una excepción
                //presenta un dialogo modal con alguna información de la excepción
                JOptionPane.showMessageDialog(this,
                                              ex.getMessage(),
                                              ex.toString(),
                                              JOptionPane.ERROR_MESSAGE);
            }
        }
}    
    
public void busca(){
String text = JOptionPane.showInputDialog(
                this,
                "Texto:",
                "EditorOrlando - Buscar",
                JOptionPane.QUESTION_MESSAGE);
 
        if (text != null) {    //si se introdujo texto (puede ser una cadena vacía)
            String textAreaContent = Texto.getText();    //obtiene todo el contenido del área de edición
            int pos = textAreaContent.indexOf(text);    //obtiene la posición de la primera ocurrencia del texto
 
            if (pos > -1) {    //si la posición es mayor a -1 significa que la búsqueda fue positiva
                //selecciona el texto en el área de edición para resaltarlo
                Texto.select(pos, pos + text.length());
            }
 
            //establece el texto buscado como el texto de la última búsqueda realizada
            UltimaBusqueda = text;
        }
}
    
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
   
                         //construye un JFileChooser
        fc.setDialogTitle("Editor de Orlando - Elige un archivo:");    //se le establece un título
        fc.setMultiSelectionEnabled(false);                            //desactiva la multi-selección
        fc.setFileFilter(textFileFilter);                              //aplica un filtro de extensiones
        
        state = fc.showOpenDialog(this);
        
       
        
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
    private javax.swing.JMenuItem BMBuscar;
    private javax.swing.JMenuItem BMCopiar;
    private javax.swing.JMenuItem BMCortar;
    private javax.swing.JMenuItem BMImprimir;
    private javax.swing.JMenuItem BMPegar;
    private javax.swing.JMenuItem BMSalir;
    private javax.swing.JMenuItem BMSeleccionarT;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BPegar;
    private javax.swing.JToolBar BarraHerramientas;
    private javax.swing.JButton Siguiente;
    public javax.swing.JTextArea Texto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables

    
}


