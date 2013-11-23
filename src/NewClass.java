
import java.awt.event.MouseAdapter;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *Texto.getDocument().addUndoableEditListener(new UndoableListener());/

/**
 *
 * @author GON
 */
public class NewClass extends MouseAdapter implements UndoableEditListener {

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
