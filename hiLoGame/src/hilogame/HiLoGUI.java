/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HiLoGUI.java
 *
 * Created on May 19, 2011, 1:01:13 PM
 */

package hilogame;

/**
 *
 * @author DGYanek
 */
public class HiLoGUI extends javax.swing.JFrame {

    private HiLoGame hiLo;
    /** Creates new form HiLoGUI */
    public HiLoGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        chooseLabel = new javax.swing.JLabel();
        guessField = new javax.swing.JTextField();
        guessButton = new javax.swing.JButton();
        getRandomButton = new javax.swing.JButton();
        guessNumLabel = new javax.swing.JLabel();
        guessCountField = new javax.swing.JTextField();
        resultsLabel = new javax.swing.JLabel();
        resultsField = new javax.swing.JTextField();
        wagerLabel = new javax.swing.JLabel();
        wagerField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial Narrow", 0, 24));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Hi-Lo Game");
        titleLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        chooseLabel.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        chooseLabel.setText("choose a number between 1 and 100 [inclusive]: ");

        guessField.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        guessField.setEnabled(false);

        guessButton.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        guessButton.setText("guess");
        guessButton.setEnabled(false);
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        getRandomButton.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        getRandomButton.setText("get random number");
        getRandomButton.setToolTipText("Click to get a random integer.");
        getRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRandomButtonActionPerformed(evt);
            }
        });

        guessNumLabel.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        guessNumLabel.setText("number of guesses: ");

        guessCountField.setFont(new java.awt.Font("Arial Narrow", 0, 14));

        resultsLabel.setFont(new java.awt.Font("Arial Narrow", 0, 14));
        resultsLabel.setText("results:");

        resultsField.setFont(new java.awt.Font("Arial Narrow", 0, 14));

        wagerLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wagerLabel.setText("wager");

        wagerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wagerFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(guessCountField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guessNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wagerLabel)
                .addGap(18, 18, 18)
                .addComponent(wagerField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseLabel)
                    .addComponent(guessButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getRandomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessNumLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wagerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wagerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        // TODO add your handling code here:
        //use hiLo Object created in getRandomButtonActionPerformed
        //there is no need to create a new object.
        //getText from guessField and convert it to int
        //determine if guess is high, low, or equal
        //display appropriate results
        //display count
        {
        String gueSS = guessField.getText();
        int guess = Integer.parseInt(gueSS);
        String output = "";
        int result = hiLo.guess(guess);

        if (result == -1)
        {
            output = "Too Low!";
        }
        else if (result == 1)
        {
            output = "Too High!";
        }
        else
        {
            output = "You Guessed Correctly!";
        }
        resultsField.setText(output);
        guessCountField.setText("" + hiLo.getCount());
        }

        {
        String gameEnd = "";
        String wager = wagerField.getText();
        int wageR = Integer.parseInt(wager);

        if (wageR == -100)
        {
            gameEnd = "Game Over!";
        }
        else
        {
            gameEnd = ("" + hiLo.getWager());
        }
        wagerField.setText(gameEnd);
        }




    }//GEN-LAST:event_guessButtonActionPerformed

    private void getRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRandomButtonActionPerformed
        // TODO add your handling code here:
        hiLo = new HiLoGame();
        resultsField.setText("Random Number Selected");
        guessCountField.setText("" + hiLo.getCount());
        guessField.setText("");
        guessField.setEnabled(true);
        guessButton.setEnabled(true);
        wagerField.setText("" + hiLo.getWager());

    }//GEN-LAST:event_getRandomButtonActionPerformed

    private void wagerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wagerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wagerFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HiLoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JButton getRandomButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JTextField guessCountField;
    private javax.swing.JTextField guessField;
    private javax.swing.JLabel guessNumLabel;
    private javax.swing.JTextField resultsField;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField wagerField;
    private javax.swing.JLabel wagerLabel;
    // End of variables declaration//GEN-END:variables

}