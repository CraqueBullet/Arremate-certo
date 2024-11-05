
package com.bulletinfotech.licitacao.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Arremate Certo");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initMenu();
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();

        // Menu "Opções"
        JMenu menuOpcoes = new JMenu("Opções");
        JMenuItem adicionarPregao = new JMenuItem("Adicionar Pregão");
        JMenuItem removerPregao = new JMenuItem("Remover Pregão Encerrado");
        JMenuItem buscarPregao = new JMenuItem("Buscar Pregão");
        JMenuItem sair = new JMenuItem("Sair");
        menuOpcoes.add(adicionarPregao);
        menuOpcoes.add(removerPregao);
        menuOpcoes.add(buscarPregao);
        menuOpcoes.addSeparator();
        menuOpcoes.add(sair);

        // Menu "Ações da Disputa"
        JMenu menuAcoes = new JMenu("Ações da Disputa");
        JMenuItem iniciarDisputa = new JMenuItem("Iniciar");
        JMenuItem pararDisputa = new JMenuItem("Parar");
        JMenuItem lanceManual = new JMenuItem("Lance Manual");
        menuAcoes.add(iniciarDisputa);
        menuAcoes.add(pararDisputa);
        menuAcoes.add(lanceManual);

        menuBar.add(menuOpcoes);
        menuBar.add(menuAcoes);
        setJMenuBar(menuBar);

        // Ações dos itens de menu
        sair.addActionListener(e -> System.exit(0));
    }
}
