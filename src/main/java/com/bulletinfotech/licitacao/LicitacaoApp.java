
package com.bulletinfotech.licitacao;

import com.bulletinfotech.licitacao.view.MainFrame;

import javax.swing.*;

public class LicitacaoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
