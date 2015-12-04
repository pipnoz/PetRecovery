/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davideita.node;

import com.davideita.petrecovery.NuovoCliente;
import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Davide Montorsi
 */
public class ClienteNodo extends BeanNode {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    public ClienteNodo(NuovoCliente Bean) throws IntrospectionException {
        super(Bean, Children.LEAF, Lookups.singleton(Bean));
        setDisplayName(Bean.getNome());
        setDisplayName(Bean.getCognome());
        setDisplayName(Bean.getCod_fiscale());
        String telefono = String.valueOf(Bean.getTelefono());
        setDisplayName(telefono);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
