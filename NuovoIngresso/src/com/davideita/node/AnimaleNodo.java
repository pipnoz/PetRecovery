/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davideita.node;

import com.davideita.petrecovery.NuovoAnimale;
import java.beans.IntrospectionException;
import java.util.logging.Logger;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author Davide Montorsi
 */
public class AnimaleNodo extends BeanNode {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(AnimaleNodo.class.getName());

    @SuppressWarnings("unchecked")
    public AnimaleNodo(NuovoAnimale Bean) throws IntrospectionException {
        super(Bean, Children.LEAF, Lookups.singleton(Bean));
        setDisplayName(Bean.getNomeAnimale());
        setDisplayName(Bean.getAnimale());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
