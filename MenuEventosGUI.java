package n4.menuprincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEventosGUI {

    private JFrame marco;
    private JPanel panelPrincipal, panelAdministrador, panelConsultas;

    public void crearYMostrarGUI() {
        marco = new JFrame("---------Menú de Eventos Proyecto final----------");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 300);

        panelPrincipal = new JPanel();
        panelAdministrador = new JPanel();
        panelConsultas = new JPanel();

        mostrarMenuPrincipal();

        marco.setVisible(true);
    }

    private void mostrarMenuPrincipal() {
        panelPrincipal.removeAll();
        panelPrincipal.setLayout(new GridLayout(3, 1));

        JButton botonAdministrador = new JButton("Administrador");
        JButton botonEspectador = new JButton("Espectador");
        JButton botonSalir = new JButton("Salir");

        botonAdministrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuAdministrador();
            }
        });

        botonEspectador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuConsultas();
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelPrincipal.add(botonAdministrador);
        panelPrincipal.add(botonEspectador);
        panelPrincipal.add(botonSalir);

        marco.getContentPane().removeAll();
        marco.getContentPane().add(panelPrincipal);
        marco.revalidate();
        marco.repaint();
    }

    private void mostrarMenuAdministrador() {
        panelAdministrador.removeAll();
        panelAdministrador.setLayout(new GridLayout(5, 1));

        JButton botonRegistrarEvento = new JButton("Registrar Eventos");
        JButton botonModificarEvento = new JButton("Modificar Eventos");
        JButton botonOpcionesConsulta = new JButton("Opciones de Consulta");
        JButton botonRegresar = new JButton("Regresar");

        botonRegistrarEvento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(marco, "Registrar Eventos seleccionado");
            }
        });

        botonModificarEvento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuModificarEvento();
            }
        });

        botonOpcionesConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuConsultas();
            }
        });

        botonRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuPrincipal();
            }
        });

        panelAdministrador.add(botonRegistrarEvento);
        panelAdministrador.add(botonModificarEvento);
        panelAdministrador.add(botonOpcionesConsulta);
        panelAdministrador.add(botonRegresar);

        marco.getContentPane().removeAll();
        marco.getContentPane().add(panelAdministrador);
        marco.revalidate();
        marco.repaint();
    }

    private void mostrarMenuModificarEvento() {
        JPanel panelModificarEvento = new JPanel();
        panelModificarEvento.setLayout(new GridLayout(4, 1));

        JButton botonModificarPartidos = new JButton("modificar Partidos");
        JButton botonModificarParticipantes = new JButton("modificar Participantes");
        JButton botonModificarEvento = new JButton("Modificar Evento");
        JButton botonRegresar = new JButton("Regresar");

        botonModificarPartidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para modificar partidos
                JOptionPane.showMessageDialog(marco, "Modificar Partidos seleccionado");
            }
        });

        botonModificarParticipantes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para modificar participantes
                JOptionPane.showMessageDialog(marco, "Modificar Participantes seleccionado");
            }
        });

        botonModificarEvento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(marco, "Modificar Evento seleccionado");
            }
        });

        botonRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuAdministrador();
            }
        });

        panelModificarEvento.add(botonModificarPartidos);
        panelModificarEvento.add(botonModificarParticipantes);
        panelModificarEvento.add(botonModificarEvento);
        panelModificarEvento.add(botonRegresar);

        marco.getContentPane().removeAll();
        marco.getContentPane().add(panelModificarEvento);
        marco.revalidate();
        marco.repaint();
    }

    private void mostrarMenuConsultas() {
        panelConsultas.removeAll();
        panelConsultas.setLayout(new GridLayout(4, 1));

        JButton botonConsultarListaEventos = new JButton("Consultar Lista de Eventos");
        JButton botonConsultarResultadosPartido = new JButton("Consultar Resultados de un Partido");
        JButton botonConsultarParticipantesEvento = new JButton("Consultar Participantes de un Evento");
        JButton botonRegresar = new JButton("Regresar");

        botonConsultarListaEventos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(marco, "Ccnsultar Lista de Eventos seleccionado");
            }
        });

        botonConsultarResultadosPartido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(marco, "onsultar Resultados de un Partido seleccionado");
            }
        });

        botonConsultarParticipantesEvento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para consultar participantes de un evento
                JOptionPane.showMessageDialog(marco, "Cnsultar Participantes de un Evento seleccionado");
            }
        });

        botonRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuPrincipal();
            }
        });

        panelConsultas.add(botonConsultarListaEventos);
        panelConsultas.add(botonConsultarResultadosPartido);
        panelConsultas.add(botonConsultarParticipantesEvento);
        panelConsultas.add(botonRegresar);

        marco.getContentPane().removeAll();
        marco.getContentPane().add(panelConsultas);
        marco.revalidate();
        marco.repaint();
    }
}
