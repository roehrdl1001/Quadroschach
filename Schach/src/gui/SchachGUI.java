package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import schach.DrawMaster;

public class SchachGUI extends javax.swing.JFrame
{

    BufferedImage pic;
    Graphics g;
    Pictures p;

    public SchachGUI()
    {
        initComponents();
        plBoard.setLayout(new GridLayout(14, 14));

        try
        {
            p = new Pictures();
            start();
            addPics();
        }
        catch (IOException ex)
        {
            System.out.println("MAAANN");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        plBoard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 542));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        plBoard.setPreferredSize(new java.awt.Dimension(504, 504));
        plBoard.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                onClick(evt);
            }
        });

        javax.swing.GroupLayout plBoardLayout = new javax.swing.GroupLayout(plBoard);
        plBoard.setLayout(plBoardLayout);
        plBoardLayout.setHorizontalGroup(
            plBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        plBoardLayout.setVerticalGroup(
            plBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(plBoard);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onClick(java.awt.event.MouseEvent evt)//GEN-FIRST:event_onClick
    {//GEN-HEADEREND:event_onClick
//        bl.move(true, evt.getX(), evt.getY());
    }//GEN-LAST:event_onClick

//    @Override
//    public void paint(Graphics g)
//    {
//        super.paint(g);
//
//        bl.draw();
//
//        System.out.println(plBoard.getWidth() + " " + plBoard.getHeight() + " " + getHeight());
//    }
//
//    @Override
//    public void repaint()
//    {
//        super.repaint();
//    }
    public void start() throws IOException
    {
        Color col = Color.GRAY;
        Color col1 = Color.WHITE;
        for (int j = 0; j < 14; j++)
        {
            for (int i = 0; i < 14; i++)
            {
                JPanel panel = new JPanel();
                if (!((j < 3 || j > 10) && (i < 3 || i > 10)))
                {
                    panel.setBackground(col);
                }
                add(panel);
                Color c = col;
                col = col1;
                col1 = c;
            }
            Color c = col;
            col = col1;
            col1 = c;
        }
    }

    public void add(JPanel pan) throws IOException
    {
        plBoard.add(pan);
    }

    public void addPics() throws IOException
    {
        for (int j = 0; j < 14; j++)
        {
            for (int i = 0; i < 14; i++)
            {
                JPanel panel = (JPanel) plBoard.getComponentAt(i, j);
                if (!(p.getPic(i, j) == null))
                {
                    JLabel label = p.getPic(i, j);
                    panel.add(label);
                }
            }
        }
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SchachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SchachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SchachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SchachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SchachGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel plBoard;
    // End of variables declaration//GEN-END:variables
}
