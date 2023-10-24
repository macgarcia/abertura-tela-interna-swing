package com.gituhub.macgarcia.contrutor.tela.interna.core;

import java.lang.reflect.InvocationTargetException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author macgarcia
 */
public class FactoryTela {
    
    public static <C extends JInternalFrame> C criarTela(Class<C> classe, final JDesktopPane desktop) {
        try {
            final C tela = classe.getDeclaredConstructor().newInstance();
            desktop.add(tela);
            Configuracao.setPosicaoInternalFrame(desktop, tela);
            tela.setVisible(true);
            return tela;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
            ex.getMessage();
        }
        return null;
    }
    
}
