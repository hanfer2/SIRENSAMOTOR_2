/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sirensaMotor.Vista;

import co.com.sirensaMotor.objetos.interno.Cliente;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author nicol
 */
public class Botones extends AbstractCellEditor
                         implements TableCellEditor,
                                    ActionListener{
    JButton button;
    JDialog dialog;
    Cliente cliente;
    protected static final String EDIT = "editar";

    public Botones() {
        button = new JButton();
        button.setActionCommand(EDIT);
        button.addActionListener(this);
        button.setBorderPainted(false);

        //Set up the dialog that the button brings up.
     /*   colorChooser = new JColorChooser();
        dialog = JColorChooser.createDialog(button,
                                        "Pick a Color",
                                        true,  //modal
                                        colorChooser,
                                        this,  //OK button handler
                                        null); //no CANCEL button handler*/
    }

    public void actionPerformed(ActionEvent e) {
        if (EDIT.equals(e.getActionCommand()))
        {
            
            //The user has clicked the cell, so
            //bring up the dialog.
           // button.setBackground(currentColor);
           // colorChooser.setColor(currentColor);
           // dialog.setVisible(true);

            fireEditingStopped(); //Make the renderer reappear.

        } else { //User pressed dialog's "OK" button.
         //   currentColor = colorChooser.getColor();
        }
    }

    //Implement the one CellEditor method that AbstractCellEditor doesn't.
    public Object getCellEditorValue() {
        return cliente;
    }

    //Implement the one method defined by TableCellEditor.
    public Component getTableCellEditorComponent(JTable table,
                                                 Object value,
                                                 boolean isSelected,
                                                 int row,
                                                 int column) {
        cliente = (Cliente)value;
        return button;
    }
}