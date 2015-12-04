/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davideita.node;

import com.davideita.petrecovery.NuovoIndirizzo;
import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Davide Montorsi
 */
public class IndirizzoNodo extends BeanNode {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    public IndirizzoNodo(NuovoIndirizzo Bean) throws IntrospectionException {
        super(Bean, Children.LEAF, Lookups.singleton(Bean));
        String civico = String.valueOf(Bean.getNr_civico());
        String cap = String.valueOf(Bean.getCap());
        setDisplayName(Bean.getIndirizzo());
        setDisplayName(civico);
        setDisplayName(cap);
        setDisplayName(Bean.getCittà());
        setDisplayName(Bean.getProvincia());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
