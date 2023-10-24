package com.gituhub.macgarcia.contrutor.tela.interna.core;

import javax.swing.JOptionPane;

/**
 *
 * @author macgarcia
 */
public class FactoryMensagem {

    private static final String ALERTA = "Alerta";
    private static final String ERRO = "Erro";
    private static final String INFORMACAO = "Informação";

    public static void mensagemOk(String informacao) {
        exibirMensagemInformacao(informacao);
    }

    public static void mensagemAlerta(String alerta) {
        exibirMensagemAlerta(alerta);
    }

    public static void mensagemErro(String erro) {
        exibirMensagemErro(erro);
    }

    public static int mensagemDeConfirmar(String mensagemDeConfirmacao) {
        return JOptionPane
                .showConfirmDialog(null, mensagemDeConfirmacao, "Confirmar exclusão",
                        JOptionPane.YES_NO_OPTION);
    }

    // Metodos core
    private static void exibirMensagemAlerta(final String alerta) {
        JOptionPane.showMessageDialog(null, alerta, ALERTA, JOptionPane.WARNING_MESSAGE);
    }

    private static void exibirMensagemErro(final String erro) {
        JOptionPane.showMessageDialog(null, erro, ERRO, JOptionPane.ERROR_MESSAGE);
    }

    private static void exibirMensagemInformacao(final String informacao) {
        JOptionPane.showMessageDialog(null, informacao, INFORMACAO, JOptionPane.INFORMATION_MESSAGE);
    }

}
